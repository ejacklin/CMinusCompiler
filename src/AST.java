import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.runtime.tree.*;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class AST {

    private Object payload;
    private final static Hashtable symbolTable = new Hashtable<String, Token>();
    TerminalNode terminalNode;
    private final List<AST> children;

    public AST(ParseTree tree) {
        this(null, tree);
    }

    private AST(AST ast, ParseTree tree) {
        this(ast, tree, new ArrayList<>());
    }

    private AST(AST parent, ParseTree tree, List<AST> children) {
        this.payload = getPayload(tree);
        this.children = children;

        if(!(this.payload instanceof String) && !this.payload.getClass().getSimpleName().contains("Context")){
            Token token = (Token) this.payload;
            Integer type = token.getType();
            if((type == -1) || (type < 13)){
                return;
            }
        }else if(!(this.payload instanceof String) && this.payload.getClass().getSimpleName().contains("Context")){
                if(tree.getChildCount() == 0) {
                    return;
                }
            }


        if (parent == null) {
            walk(tree, this);
        }
        else {
            parent.children.add(this);
        }
    }


    public Object getPayload() { return payload; }
    public Hashtable getSymbolTable() {return symbolTable;}

    public List<AST> getChildren() {
        return new ArrayList<>(children);
    }

    private Object getPayload(ParseTree tree) {
        if (tree.getChildCount() == 0) {
            return tree.getPayload();
        }else if(tree.getChildCount() == 1) {
            return getPayload(tree.getChild(0));
        }else {
            String ruleName = tree.getClass().getSimpleName().replace("Context", "");
            return Character.toLowerCase(ruleName.charAt(0)) + ruleName.substring(1);
        }
    }

    private static void walk(ParseTree tree, AST ast) {

        if (tree.getChildCount() == 0) {
            new AST(ast, tree);
        }
        else if (tree.getChildCount() == 1) {
            walk(tree.getChild(0), ast);
        }
        else if (tree.getChildCount() > 1) {

            for (int i = 0; i < tree.getChildCount(); i++) {
//                if (!(tree.getChild(i) instanceof TerminalNodeImpl)) {    //attempt to remove EOF
                    AST temp = new AST(ast, tree.getChild(i));
                    if (!(temp.payload instanceof Token)) {
                        walk(tree.getChild(i), temp);
                    }
//                }
            }
        }
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        AST ast = this;
        List<AST> firstStack = new ArrayList<>();
        firstStack.add(ast);

        List<List<AST>> childListStack = new ArrayList<>();
        childListStack.add(firstStack);

        while (!childListStack.isEmpty()) {

            List<AST> childStack = childListStack.get(childListStack.size() - 1);

            if (childStack.isEmpty()) {
                childListStack.remove(childListStack.size() - 1);
            }
            else {
                ast = childStack.remove(0);
                String caption;

                if (ast.payload instanceof Token) {
                    Token token = (Token) ast.payload;
                    caption = String.format("TOKEN[type: %s, text: %s]",
                            token.getType(), token.getText().replace("\n", "\\n"));
                }
                else {
                    caption = String.valueOf(ast.payload);
                }

                String indent = "";

                for (int i = 0; i < childListStack.size() - 1; i++) {
                    indent += "\t";
                }

                builder.append(indent)
                        .append("\t")
                        .append(caption)
                        .append("\n");

                if (ast.children.size() > 0) {
                    List<AST> children = new ArrayList<>();
                    for (int i = 0; i < ast.children.size(); i++) {
                        children.add(ast.children.get(i));
                    }
                    childListStack.add(children);
                }
            }
        }

        return builder.toString();
    }
}