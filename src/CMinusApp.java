import com.ejacklin.antlr.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

public class CMinusApp {

    public static void main(String[] args) {
        CharStream inputStream = null;
        try {
             inputStream = CharStreams.fromFileName("/Users/jacklem1/IdeaProjects/CMinusCompiler/src/C-Input-1.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        CMinusCompilerLexer cMinusCompilerLexer = new CMinusCompilerLexer(inputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(cMinusCompilerLexer);
        CMinusCompilerParser cMinusCompilerParser = new CMinusCompilerParser(commonTokenStream);
        ParseTree parseTree = cMinusCompilerParser.program();

        AST ast = new AST(parseTree);

        System.out.println(ast);
//
//        CMinusCompilerParser.F.FileContext fileContext = cMinusCompilerParser.file();file
//        ASTVisitor visitor = new ASTVisitor();
//        visitor.visit(fileContext);
    }

}
