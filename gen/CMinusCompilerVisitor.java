// Generated from /Users/jacklem1/IdeaProjects/CMinusCompiler/src/CMinusCompiler.g4 by ANTLR 4.7
package com.ejacklin.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CMinusCompilerParser}.
 *
 * @param <T> The return returnType of the visit operation. Use {@link Void} for
 * operations with no return returnType.
 */
public interface CMinusCompilerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CMinusCompilerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_list(CMinusCompilerParser.Declaration_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CMinusCompilerParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declaration(CMinusCompilerParser.Var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#type_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_specifier(CMinusCompilerParser.Type_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#fun_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_declaration(CMinusCompilerParser.Fun_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(CMinusCompilerParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list(CMinusCompilerParser.Param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(CMinusCompilerParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(CMinusCompilerParser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#local_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_declarations(CMinusCompilerParser.Local_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(CMinusCompilerParser.Statement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CMinusCompilerParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#expression_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_stmt(CMinusCompilerParser.Expression_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#selection_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection_stmt(CMinusCompilerParser.Selection_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#iteration_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_stmt(CMinusCompilerParser.Iteration_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(CMinusCompilerParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CMinusCompilerParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(CMinusCompilerParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expression(CMinusCompilerParser.Simple_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#relop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelop(CMinusCompilerParser.RelopContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expression(CMinusCompilerParser.Additive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#addop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddop(CMinusCompilerParser.AddopContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(CMinusCompilerParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#mulop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulop(CMinusCompilerParser.MulopContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(CMinusCompilerParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(CMinusCompilerParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(CMinusCompilerParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusCompilerParser#arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_list(CMinusCompilerParser.Arg_listContext ctx);
}