// Generated from /root/IdeaProjects/CMinusCompiler/src/br/com/compiler/lexer/CMinus.g4 by ANTLR 4.5.3
package br.com.compiler.lexer;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CMinusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CMinusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CMinusParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CMinusParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#statament_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatament_list(CMinusParser.Statament_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#statament}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatament(CMinusParser.StatamentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(CMinusParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CMinusParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#attr_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_decl(CMinusParser.Attr_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#func_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_decl(CMinusParser.Func_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(CMinusParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(CMinusParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#comp_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_decl(CMinusParser.Comp_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(CMinusParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#exp_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_decl(CMinusParser.Exp_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#select_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_decl(CMinusParser.Select_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#inter_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInter_decl(CMinusParser.Inter_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#return_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_decl(CMinusParser.Return_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(CMinusParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(CMinusParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#simple_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_exp(CMinusParser.Simple_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#exp_sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_sum(CMinusParser.Exp_sumContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(CMinusParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(CMinusParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#active}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActive(CMinusParser.ActiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(CMinusParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMinusParser#args_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs_list(CMinusParser.Args_listContext ctx);
}