import com.sun.javaws.exceptions.InvalidArgumentException;

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
                if (((String) ast.getPayload()).contains("Program")) {
                    //check for at least 1 declaration (Rule 1)
                    if (ast.getChildren().size() == 0) {
                        throw new NullPointerException("Program needs at least 1 declaration");
                    }
                    //check that main is void
                    Set<String> keys = symbolTable.GetKeys();
                    if (!keys.contains("main")){
                        throw new InvalidArgumentException(new String[]{"Main must be of type void"});
                    }else{
                        //check main has no parameters
                        
                    }
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
