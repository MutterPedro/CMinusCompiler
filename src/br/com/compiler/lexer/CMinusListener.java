// Generated from /root/IdeaProjects/CMinusCompiler/src/br/com/compiler/lexer/CMinus.g4 by ANTLR 4.5.3
package br.com.compiler.lexer;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CMinusParser}.
 */
public interface CMinusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CMinusParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CMinusParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CMinusParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#statament_list}.
	 * @param ctx the parse tree
	 */
	void enterStatament_list(CMinusParser.Statament_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#statament_list}.
	 * @param ctx the parse tree
	 */
	void exitStatament_list(CMinusParser.Statament_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#statament}.
	 * @param ctx the parse tree
	 */
	void enterStatament(CMinusParser.StatamentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#statament}.
	 * @param ctx the parse tree
	 */
	void exitStatament(CMinusParser.StatamentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(CMinusParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(CMinusParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CMinusParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CMinusParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#attr_decl}.
	 * @param ctx the parse tree
	 */
	void enterAttr_decl(CMinusParser.Attr_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#attr_decl}.
	 * @param ctx the parse tree
	 */
	void exitAttr_decl(CMinusParser.Attr_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl(CMinusParser.Func_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl(CMinusParser.Func_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(CMinusParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(CMinusParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(CMinusParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(CMinusParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#comp_decl}.
	 * @param ctx the parse tree
	 */
	void enterComp_decl(CMinusParser.Comp_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#comp_decl}.
	 * @param ctx the parse tree
	 */
	void exitComp_decl(CMinusParser.Comp_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(CMinusParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(CMinusParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#exp_decl}.
	 * @param ctx the parse tree
	 */
	void enterExp_decl(CMinusParser.Exp_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#exp_decl}.
	 * @param ctx the parse tree
	 */
	void exitExp_decl(CMinusParser.Exp_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#select_decl}.
	 * @param ctx the parse tree
	 */
	void enterSelect_decl(CMinusParser.Select_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#select_decl}.
	 * @param ctx the parse tree
	 */
	void exitSelect_decl(CMinusParser.Select_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#inter_decl}.
	 * @param ctx the parse tree
	 */
	void enterInter_decl(CMinusParser.Inter_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#inter_decl}.
	 * @param ctx the parse tree
	 */
	void exitInter_decl(CMinusParser.Inter_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#return_decl}.
	 * @param ctx the parse tree
	 */
	void enterReturn_decl(CMinusParser.Return_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#return_decl}.
	 * @param ctx the parse tree
	 */
	void exitReturn_decl(CMinusParser.Return_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(CMinusParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(CMinusParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(CMinusParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(CMinusParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#simple_exp}.
	 * @param ctx the parse tree
	 */
	void enterSimple_exp(CMinusParser.Simple_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#simple_exp}.
	 * @param ctx the parse tree
	 */
	void exitSimple_exp(CMinusParser.Simple_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#exp_sum}.
	 * @param ctx the parse tree
	 */
	void enterExp_sum(CMinusParser.Exp_sumContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#exp_sum}.
	 * @param ctx the parse tree
	 */
	void exitExp_sum(CMinusParser.Exp_sumContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CMinusParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CMinusParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(CMinusParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(CMinusParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#active}.
	 * @param ctx the parse tree
	 */
	void enterActive(CMinusParser.ActiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#active}.
	 * @param ctx the parse tree
	 */
	void exitActive(CMinusParser.ActiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(CMinusParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(CMinusParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMinusParser#args_list}.
	 * @param ctx the parse tree
	 */
	void enterArgs_list(CMinusParser.Args_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMinusParser#args_list}.
	 * @param ctx the parse tree
	 */
	void exitArgs_list(CMinusParser.Args_listContext ctx);
}