import com.sun.javaws.exceptions.InvalidArgumentException;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Token;

import java.util.List;
import java.util.Set;

/**
 * Created by Erin on 4/11/2018.
 */
public class SemanticAnalyzer {
    SymbolTable symbolTable;
    AST ast;

    public SemanticAnalyzer(SymbolTable symbolTable, AST ast) {
        this.symbolTable = symbolTable;
        this.ast = ast;
    }

    void CheckNodes(AST ast, SymbolTable symbolTable) {
        try {
            if (ast.getPayload() instanceof String) {
                //Program nodes
                if (((String) ast.getPayload()).contains("program")) {
                    //check for at least 1 declaration (Rule 1)
                    if (ast.getChildren().size() == 0) {
                        throw new NullPointerException("Program needs at least 1 declaration");
                    }
                    //check that main exists
                    Set<String> keys = symbolTable.GetKeys();
                    if (!keys.contains("main")){
                        throw new InvalidArgumentException(new String[]{"Main must be of returnType void"});
                    }else{
                        //check main is returnType void
                        Function mainFcn = (Function) symbolTable.symbolTable.get("main");
                       if(!mainFcn.returnType.equalsIgnoreCase("void")){
                           throw new InvalidArgumentException(new String[]{"Main must be of returnType void"});
                       }
                        //and has no parameters
                        for(String key : mainFcn.symbolTable.GetKeys()){
                           Variable var = (Variable) mainFcn.symbolTable.symbolTable.get(key);
                           if(var.param){
                               throw new InvalidArgumentException(new String[]{"Main cannot have input parameters"});
                           }
                        }
                    }
                }
                //must have return type, an identifier, parameters|void, compound statement
                else if(((String) ast.getPayload()).contains("fun_declaration")){
                    List<AST> children = ast.getChildren();
                    Token token = (Token) children.get(1).getPayload();
                    String name = token.getText();
                    Function function = (Function) symbolTable.symbolTable.get(name);
                    symbolTable = function.symbolTable;
                    if(!(function.returnType.equalsIgnoreCase("void")||
                            function.returnType.equalsIgnoreCase("int"))){
                        throw new InvalidArgumentException(new String[]{"Function must have return type of int or void"});
                    }
                    //compound statement
                    AST lastChild = children.get(children.size()-1);
                    if(!lastChild.payload.toString().contains("compound_stmt")){
                        throw new InvalidArgumentException(new String[]{"Function must have a compound statement"});
                    }
                }
                else if(((String) ast.getPayload()).contains("compound_stmt")){
                    //compound statements may be empty
                }
                else if(((String) ast.getPayload()).contains("selection_stmt")){
                    List<AST> children = ast.getChildren();
                    Token token = (Token) children.get(0).getPayload();
                    if(!token.getText().equalsIgnoreCase("if")){
                        throw new InvalidArgumentException(new String[]{"Selection statement must start with \"if\""});
                    }
                    String tokenStr = children.get(1).getPayload().toString();
                    if(!tokenStr.contains("expression")){
                        throw new InvalidArgumentException(new String[]{"Selection statement must have an expression"});
                    }
                    tokenStr = children.get(2).getPayload().toString();
                    if(!tokenStr.contains("stmt")){
                        throw new InvalidArgumentException(new String[]{"Selection statement must have a statement"});
                    }
                }

//                else if(((String) ast.getPayload()).contains("return_stmt")){
//
//                }


            }
            for(AST child: ast.getChildren()){
                CheckNodes(child, symbolTable);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
