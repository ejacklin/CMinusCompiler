import com.ejacklin.antlr.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

public class CMinusApp {
    static SymbolTable scopeSymbolTable = new SymbolTable();

    static void BuildSymbolTable(AST ast, SymbolTable symbolTable){

         SymbolTable scopeTable = symbolTable;

        if(ast.getPayload() instanceof String){

            //scope for function
            if(((String) ast.getPayload()).contains("fun_declaration")){
                String functionName = null;
                String functionType = null;

                for(AST child: ast.getChildren()){
                    if( child.getChildren().size() == 0){
                        if(!(child.getPayload() instanceof String)) {
                            Token token = (Token) child.getPayload();
                            Integer type = token.getType();
                            if (type == 31){   //ID
                                functionName = token.getText();
                            }else if(type == 28){   //INT
                                functionType = token.getText();
                            }else if(type == 29){   //VOID
                                functionType = token.getText();
                            }
                        }
                    }
                }

                Function function = new Function(functionName, functionType);
                symbolTable.Add(functionName, function);
                scopeTable = function.symbolTable;
            }else if(((String) ast.getPayload()).contains("var_declaration")){
                String variableName = null;
                String variableType = null;

                for(AST child: ast.getChildren()){
                    Token token = (Token) child.getPayload();
                    Integer type = token.getType();
                    if(type == 31){
                        variableName = token.getText();
                    }else if(type == 28){
                        variableType = token.getText();
                    }else if(type == 29){
                        variableType = token.getText();
                    }
                }

                Variable variable = new Variable(variableName,variableType);
                symbolTable.Add(variableName, variable);
                return;

            }else if((((String) ast.getPayload()).contains("param")) && !((String) ast.getPayload()).contains("list")){
                String parameterName = null;
                String parameterType = null;

                for(AST child: ast.getChildren()){
                    Token token = (Token) child.getPayload();
                    Integer type = token.getType();
                    if(type == 31){
                        parameterName = token.getText();
                    }else if(type == 28){
                        parameterType = token.getText();
                    }else if(type == 29){
                        parameterType = token.getText();
                    }
                }

                Variable parameter = new Variable(parameterName,parameterType, true);
                symbolTable.Add(parameterName, parameter);
                return;
            }
        }

        for(AST child: ast.getChildren()){
            BuildSymbolTable(child, scopeTable);
        }

    }

    public static void main(String[] args) {
        CharStream inputStream = null;
        try {
//             inputStream = CharStreams.fromFileName("/Users/jacklem1/IdeaProjects/CMinusCompiler/src/C-Input-1.txt");
             inputStream = CharStreams.fromFileName("C:\\Users\\Erin\\IdeaProjects\\CMinusCompiler\\src\\C-Input-1.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        CMinusCompilerLexer cMinusCompilerLexer = new CMinusCompilerLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(cMinusCompilerLexer);
        CMinusCompilerParser cMinusCompilerParser = new CMinusCompilerParser(commonTokenStream);
        ParseTree parseTree = cMinusCompilerParser.program();

//        ASTVisitor astVisitor = new ASTVisitor();
//        astVisitor.visit(parseTree);
        AST ast = new AST(parseTree);
        System.out.println(ast);

        BuildSymbolTable(ast,scopeSymbolTable);
        System.out.println(scopeSymbolTable);

        SemanticAnalyzer semanticAnalyzer = new SemanticAnalyzer(scopeSymbolTable,ast);
        semanticAnalyzer.CheckNodes(ast, scopeSymbolTable);

    }

}
