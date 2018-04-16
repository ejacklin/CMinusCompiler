import com.ejacklin.antlr.*;
import org.antlr.runtime.tree.ParseTree;


public class ASTVisitor extends CMinusCompilerBaseVisitor{

    private ParseTree astTree = new ParseTree(null);
    @Override
    public Object visitProgram(CMinusCompilerParser.ProgramContext ctx) {
       for(org.antlr.v4.runtime.tree.ParseTree child : ctx.children){
           visit(child);
       }
        return super.visitProgram(ctx);
    }

    @Override
    public Object visitDeclaration_list(CMinusCompilerParser.Declaration_listContext ctx) {
        if(ctx.getChildCount() == 0){

        }
        return super.visitDeclaration_list(ctx);
    }

    @Override
    public Object visitDeclaration(CMinusCompilerParser.DeclarationContext ctx) {

        return super.visitDeclaration(ctx);
    }

    @Override
    public Object visitType_specifier(CMinusCompilerParser.Type_specifierContext ctx) {
        return super.visitType_specifier(ctx);
    }

    @Override
    public Object visitVar_declaration(CMinusCompilerParser.Var_declarationContext ctx) {
        return super.visitVar_declaration(ctx);
    }

    @Override
    public Object visitFun_declaration(CMinusCompilerParser.Fun_declarationContext ctx) {
        return super.visitFun_declaration(ctx);
    }

    @Override
    public Object visitParams(CMinusCompilerParser.ParamsContext ctx) {
        return super.visitParams(ctx);
    }

    @Override
    public Object visitParam_list(CMinusCompilerParser.Param_listContext ctx) {
        return super.visitParam_list(ctx);
    }

    @Override
    public Object visitParam(CMinusCompilerParser.ParamContext ctx) {
        return super.visitParam(ctx);
    }

    @Override
    public Object visitCompound_stmt(CMinusCompilerParser.Compound_stmtContext ctx) {
        return super.visitCompound_stmt(ctx);
    }

    @Override
    public Object visitLocal_declarations(CMinusCompilerParser.Local_declarationsContext ctx) {
        return super.visitLocal_declarations(ctx);
    }

    @Override
    public Object visitStatement_list(CMinusCompilerParser.Statement_listContext ctx) {
        return super.visitStatement_list(ctx);
    }

    @Override
    public Object visitStatement(CMinusCompilerParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public Object visitExpression_stmt(CMinusCompilerParser.Expression_stmtContext ctx) {
        return super.visitExpression_stmt(ctx);
    }

    @Override
    public Object visitSelection_stmt(CMinusCompilerParser.Selection_stmtContext ctx) {
        return super.visitSelection_stmt(ctx);
    }

    @Override
    public Object visitIteration_stmt(CMinusCompilerParser.Iteration_stmtContext ctx) {
        return super.visitIteration_stmt(ctx);
    }

    @Override
    public Object visitReturn_stmt(CMinusCompilerParser.Return_stmtContext ctx) {
        return super.visitReturn_stmt(ctx);
    }

    @Override
    public Object visitExpression(CMinusCompilerParser.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }

    @Override
    public Object visitVar(CMinusCompilerParser.VarContext ctx) {
        return super.visitVar(ctx);
    }

    @Override
    public Object visitSimple_expression(CMinusCompilerParser.Simple_expressionContext ctx) {
        return super.visitSimple_expression(ctx);
    }

    @Override
    public Object visitRelop(CMinusCompilerParser.RelopContext ctx) {
        return super.visitRelop(ctx);
    }

    @Override
    public Object visitAdditive_expression(CMinusCompilerParser.Additive_expressionContext ctx) {
        return super.visitAdditive_expression(ctx);
    }

    @Override
    public Object visitAddop(CMinusCompilerParser.AddopContext ctx) {
        return super.visitAddop(ctx);
    }

    @Override
    public Object visitTerm(CMinusCompilerParser.TermContext ctx) {
        return super.visitTerm(ctx);
    }

    @Override
    public Object visitMulop(CMinusCompilerParser.MulopContext ctx) {
        return super.visitMulop(ctx);
    }

    @Override
    public Object visitFactor(CMinusCompilerParser.FactorContext ctx) {
        return super.visitFactor(ctx);
    }

    @Override
    public Object visitCall(CMinusCompilerParser.CallContext ctx) {
        return super.visitCall(ctx);
    }

    @Override
    public Object visitArgs(CMinusCompilerParser.ArgsContext ctx) {
        return super.visitArgs(ctx);
    }

    @Override
    public Object visitArg_list(CMinusCompilerParser.Arg_listContext ctx) {
        return super.visitArg_list(ctx);
    }
}
