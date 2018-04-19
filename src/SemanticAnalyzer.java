import com.sun.javaws.exceptions.InvalidArgumentException;
import org.antlr.v4.runtime.Token;

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

                else if(((String) ast.getPayload()).contains("fun_declaration")){
                    for( AST child: ast.getChildren()){
                        Token token = (Token) child.payload;
                        int type = token.getType();
                    }
                    Token token = (Token) ast.getPayload();
                    String name = token.getText();
                    Function function = (Function) symbolTable.symbolTable.get(name);
                    if(!function.returnType.equalsIgnoreCase("void")||
                            (!function.returnType.equalsIgnoreCase("int"))){
                        throw new InvalidArgumentException(new String[]{"Function must have return type of int or void"});
                    }
                }
            }
            for(AST child: ast.getChildren()){
                CheckNodes(child, symbolTable);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
