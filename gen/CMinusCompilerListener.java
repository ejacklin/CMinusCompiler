// Generated from /Users/jacklem1/IdeaProjects/CMinusCompiler/src/CMinusCompiler.g4 by ANTLR 4.7
package com.ejacklin.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CMinusCompilerParser}.
 */
public interface CMinusCompilerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CMinusCompilerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CMinusCompilerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_list(CMinusCompilerParser.Declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_list(CMinusCompilerParser.Declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CMinusCompilerParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CMinusCompilerParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaration(CMinusCompilerParser.Var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaration(CMinusCompilerParser.Var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier(CMinusCompilerParser.Type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier(CMinusCompilerParser.Type_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#fun_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFun_declaration(CMinusCompilerParser.Fun_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#fun_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFun_declaration(CMinusCompilerParser.Fun_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(CMinusCompilerParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(CMinusCompilerParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(CMinusCompilerParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(CMinusCompilerParser.Param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(CMinusCompilerParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(CMinusCompilerParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(CMinusCompilerParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(CMinusCompilerParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#local_declarations}.
	 * @param ctx the parse tree
	 */
	void enterLocal_declarations(CMinusCompilerParser.Local_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#local_declarations}.
	 * @param ctx the parse tree
	 */
	void exitLocal_declarations(CMinusCompilerParser.Local_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(CMinusCompilerParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(CMinusCompilerParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CMinusCompilerParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CMinusCompilerParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#expression_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpression_stmt(CMinusCompilerParser.Expression_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#expression_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpression_stmt(CMinusCompilerParser.Expression_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#selection_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelection_stmt(CMinusCompilerParser.Selection_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#selection_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelection_stmt(CMinusCompilerParser.Selection_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#iteration_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIteration_stmt(CMinusCompilerParser.Iteration_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#iteration_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIteration_stmt(CMinusCompilerParser.Iteration_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(CMinusCompilerParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(CMinusCompilerParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CMinusCompilerParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CMinusCompilerParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(CMinusCompilerParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(CMinusCompilerParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expression(CMinusCompilerParser.Simple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expression(CMinusCompilerParser.Simple_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(CMinusCompilerParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(CMinusCompilerParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(CMinusCompilerParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(CMinusCompilerParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(CMinusCompilerParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(CMinusCompilerParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CMinusCompilerParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CMinusCompilerParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(CMinusCompilerParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(CMinusCompilerParser.MulopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(CMinusCompilerParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(CMinusCompilerParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(CMinusCompilerParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(CMinusCompilerParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CMinusCompilerParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CMinusCompilerParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusCompilerParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArg_list(CMinusCompilerParser.Arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusCompilerParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArg_list(CMinusCompilerParser.Arg_listContext ctx);
}