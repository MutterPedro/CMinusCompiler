// Generated from /root/IdeaProjects/CMinusCompiler/src/br/com/compiler/lexer/CMinus.g4 by ANTLR 4.5.3
package br.com.compiler.lexer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMinusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, WS=7, COMMENT=8, OPEN_CHA=9, 
		CLOSE_CHA=10, OPEN_COL=11, CLOSE_COL=12, OPEN_PAR=13, CLOSE_PAR=14, IF=15, 
		ELSE=16, WHILE=17, RETURN=18, RELA=19, MULT=20, SUM=21, EOL=22, COMMA=23, 
		EQ=24, IDENT=25, NUM=26, NUM_INT=27;
	public static final int
		RULE_program = 0, RULE_statament_list = 1, RULE_statament = 2, RULE_var_decl = 3, 
		RULE_type = 4, RULE_attr_decl = 5, RULE_func_decl = 6, RULE_params = 7, 
		RULE_param = 8, RULE_comp_decl = 9, RULE_command = 10, RULE_exp_decl = 11, 
		RULE_select_decl = 12, RULE_inter_decl = 13, RULE_return_decl = 14, RULE_exp = 15, 
		RULE_var = 16, RULE_simple_exp = 17, RULE_exp_sum = 18, RULE_term = 19, 
		RULE_factor = 20, RULE_active = 21, RULE_args = 22, RULE_args_list = 23;
	public static final String[] ruleNames = {
		"program", "statament_list", "statament", "var_decl", "type", "attr_decl", 
		"func_decl", "params", "param", "comp_decl", "command", "exp_decl", "select_decl", 
		"inter_decl", "return_decl", "exp", "var", "simple_exp", "exp_sum", "term", 
		"factor", "active", "args", "args_list"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'float'", "'char'", "'void'", "'struct'", "'[]'", null, 
		null, "'{'", "'}'", "'['", "']'", "'('", "')'", "'if'", "'else'", "'while'", 
		"'return'", null, null, null, "';'", "','", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "WS", "COMMENT", "OPEN_CHA", 
		"CLOSE_CHA", "OPEN_COL", "CLOSE_COL", "OPEN_PAR", "CLOSE_PAR", "IF", "ELSE", 
		"WHILE", "RETURN", "RELA", "MULT", "SUM", "EOL", "COMMA", "EQ", "IDENT", 
		"NUM", "NUM_INT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CMinus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CMinusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Statament_listContext statament_list() {
			return getRuleContext(Statament_listContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			statament_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statament_listContext extends ParserRuleContext {
		public List<StatamentContext> statament() {
			return getRuleContexts(StatamentContext.class);
		}
		public StatamentContext statament(int i) {
			return getRuleContext(StatamentContext.class,i);
		}
		public Statament_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statament_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterStatament_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitStatament_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitStatament_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statament_listContext statament_list() throws RecognitionException {
		Statament_listContext _localctx = new Statament_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statament_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				statament();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatamentContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Func_declContext func_decl() {
			return getRuleContext(Func_declContext.class,0);
		}
		public StatamentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statament; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterStatament(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitStatament(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitStatament(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatamentContext statament() throws RecognitionException {
		StatamentContext _localctx = new StatamentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statament);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				var_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				func_decl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(CMinusParser.IDENT, 0); }
		public TerminalNode EOL() { return getToken(CMinusParser.EOL, 0); }
		public List<TerminalNode> OPEN_COL() { return getTokens(CMinusParser.OPEN_COL); }
		public TerminalNode OPEN_COL(int i) {
			return getToken(CMinusParser.OPEN_COL, i);
		}
		public List<TerminalNode> NUM_INT() { return getTokens(CMinusParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(CMinusParser.NUM_INT, i);
		}
		public List<TerminalNode> CLOSE_COL() { return getTokens(CMinusParser.CLOSE_COL); }
		public TerminalNode CLOSE_COL(int i) {
			return getToken(CMinusParser.CLOSE_COL, i);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			type();
			setState(60);
			match(IDENT);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_COL) {
				{
				{
				setState(61);
				match(OPEN_COL);
				setState(62);
				match(NUM_INT);
				setState(63);
				match(CLOSE_COL);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CMinusParser.IDENT, 0); }
		public TerminalNode OPEN_CHA() { return getToken(CMinusParser.OPEN_CHA, 0); }
		public Attr_declContext attr_decl() {
			return getRuleContext(Attr_declContext.class,0);
		}
		public TerminalNode CLOSE_CHA() { return getToken(CMinusParser.CLOSE_CHA, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(81);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(T__0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				match(T__4);
				setState(76);
				match(IDENT);
				setState(77);
				match(OPEN_CHA);
				setState(78);
				attr_decl();
				setState(79);
				match(CLOSE_CHA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attr_declContext extends ParserRuleContext {
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public Attr_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterAttr_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitAttr_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitAttr_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attr_declContext attr_decl() throws RecognitionException {
		Attr_declContext _localctx = new Attr_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attr_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				var_decl();
				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_declContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(CMinusParser.IDENT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(CMinusParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(CMinusParser.CLOSE_PAR, 0); }
		public Comp_declContext comp_decl() {
			return getRuleContext(Comp_declContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Func_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterFunc_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitFunc_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitFunc_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_declContext func_decl() throws RecognitionException {
		Func_declContext _localctx = new Func_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			type();
			setState(89);
			match(IDENT);
			setState(90);
			match(OPEN_PAR);
			setState(92);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				setState(91);
				params();
				}
			}

			setState(94);
			match(CLOSE_PAR);
			setState(95);
			comp_decl();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CMinusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CMinusParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			param();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(98);
				match(COMMA);
				setState(99);
				param();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(CMinusParser.IDENT, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			type();
			setState(106);
			match(IDENT);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(107);
				match(T__5);
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comp_declContext extends ParserRuleContext {
		public TerminalNode OPEN_CHA() { return getToken(CMinusParser.OPEN_CHA, 0); }
		public TerminalNode CLOSE_CHA() { return getToken(CMinusParser.CLOSE_CHA, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public Comp_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterComp_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitComp_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitComp_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_declContext comp_decl() throws RecognitionException {
		Comp_declContext _localctx = new Comp_declContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comp_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(OPEN_CHA);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) {
				{
				{
				setState(114);
				var_decl();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_CHA) | (1L << OPEN_PAR) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << EOL) | (1L << IDENT) | (1L << NUM) | (1L << NUM_INT))) != 0)) {
				{
				{
				setState(120);
				command();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(CLOSE_CHA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public Exp_declContext exp_decl() {
			return getRuleContext(Exp_declContext.class,0);
		}
		public Comp_declContext comp_decl() {
			return getRuleContext(Comp_declContext.class,0);
		}
		public Select_declContext select_decl() {
			return getRuleContext(Select_declContext.class,0);
		}
		public Inter_declContext inter_decl() {
			return getRuleContext(Inter_declContext.class,0);
		}
		public Return_declContext return_decl() {
			return getRuleContext(Return_declContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_command);
		try {
			setState(133);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case EOL:
			case IDENT:
			case NUM:
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				exp_decl();
				}
				break;
			case OPEN_CHA:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				comp_decl();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				select_decl();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				inter_decl();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				return_decl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_declContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(CMinusParser.EOL, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Exp_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterExp_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitExp_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitExp_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_declContext exp_decl() throws RecognitionException {
		Exp_declContext _localctx = new Exp_declContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exp_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << IDENT) | (1L << NUM) | (1L << NUM_INT))) != 0)) {
				{
				{
				setState(135);
				exp();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_declContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CMinusParser.IF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(CMinusParser.OPEN_PAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(CMinusParser.CLOSE_PAR, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CMinusParser.ELSE, 0); }
		public Select_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterSelect_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitSelect_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitSelect_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_declContext select_decl() throws RecognitionException {
		Select_declContext _localctx = new Select_declContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_select_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(IF);
			setState(144);
			match(OPEN_PAR);
			setState(145);
			exp();
			setState(146);
			match(CLOSE_PAR);
			setState(147);
			command();
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(148);
				match(ELSE);
				setState(149);
				command();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inter_declContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CMinusParser.WHILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(CMinusParser.OPEN_PAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(CMinusParser.CLOSE_PAR, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public Inter_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inter_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterInter_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitInter_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitInter_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inter_declContext inter_decl() throws RecognitionException {
		Inter_declContext _localctx = new Inter_declContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_inter_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(WHILE);
			setState(153);
			match(OPEN_PAR);
			setState(154);
			exp();
			setState(155);
			match(CLOSE_PAR);
			setState(156);
			command();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_declContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CMinusParser.RETURN, 0); }
		public TerminalNode EOL() { return getToken(CMinusParser.EOL, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Return_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterReturn_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitReturn_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitReturn_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_declContext return_decl() throws RecognitionException {
		Return_declContext _localctx = new Return_declContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_return_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(RETURN);
			setState(160);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << IDENT) | (1L << NUM) | (1L << NUM_INT))) != 0)) {
				{
				setState(159);
				exp();
				}
			}

			setState(162);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode EQ() { return getToken(CMinusParser.EQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Simple_expContext simple_exp() {
			return getRuleContext(Simple_expContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exp);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				var();
				setState(165);
				match(EQ);
				setState(166);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				simple_exp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CMinusParser.IDENT, 0); }
		public List<TerminalNode> OPEN_COL() { return getTokens(CMinusParser.OPEN_COL); }
		public TerminalNode OPEN_COL(int i) {
			return getToken(CMinusParser.OPEN_COL, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> CLOSE_COL() { return getTokens(CMinusParser.CLOSE_COL); }
		public TerminalNode CLOSE_COL(int i) {
			return getToken(CMinusParser.CLOSE_COL, i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(IDENT);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_COL) {
				{
				{
				setState(172);
				match(OPEN_COL);
				setState(173);
				exp();
				setState(174);
				match(CLOSE_COL);
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_expContext extends ParserRuleContext {
		public List<Exp_sumContext> exp_sum() {
			return getRuleContexts(Exp_sumContext.class);
		}
		public Exp_sumContext exp_sum(int i) {
			return getRuleContext(Exp_sumContext.class,i);
		}
		public TerminalNode RELA() { return getToken(CMinusParser.RELA, 0); }
		public Simple_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterSimple_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitSimple_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitSimple_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_expContext simple_exp() throws RecognitionException {
		Simple_expContext _localctx = new Simple_expContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_simple_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			exp_sum();
			setState(184);
			_la = _input.LA(1);
			if (_la==RELA) {
				{
				setState(182);
				match(RELA);
				setState(183);
				exp_sum();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_sumContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> SUM() { return getTokens(CMinusParser.SUM); }
		public TerminalNode SUM(int i) {
			return getToken(CMinusParser.SUM, i);
		}
		public Exp_sumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterExp_sum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitExp_sum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitExp_sum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_sumContext exp_sum() throws RecognitionException {
		Exp_sumContext _localctx = new Exp_sumContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exp_sum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			term();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUM) {
				{
				{
				setState(187);
				match(SUM);
				setState(188);
				term();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(CMinusParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(CMinusParser.MULT, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			factor();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT) {
				{
				{
				setState(195);
				match(MULT);
				setState(196);
				factor();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(CMinusParser.OPEN_PAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(CMinusParser.CLOSE_PAR, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ActiveContext active() {
			return getRuleContext(ActiveContext.class,0);
		}
		public TerminalNode NUM() { return getToken(CMinusParser.NUM, 0); }
		public TerminalNode NUM_INT() { return getToken(CMinusParser.NUM_INT, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_factor);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(OPEN_PAR);
				setState(203);
				exp();
				setState(204);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				active();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				match(NUM);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				match(NUM_INT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActiveContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(CMinusParser.IDENT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(CMinusParser.OPEN_PAR, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(CMinusParser.CLOSE_PAR, 0); }
		public ActiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_active; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterActive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitActive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitActive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActiveContext active() throws RecognitionException {
		ActiveContext _localctx = new ActiveContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_active);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(IDENT);
			setState(213);
			match(OPEN_PAR);
			setState(214);
			args();
			setState(215);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public Args_listContext args_list() {
			return getRuleContext(Args_listContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_args);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			args_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Args_listContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Args_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).enterArgs_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMinusListener ) ((CMinusListener)listener).exitArgs_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMinusVisitor ) return ((CMinusVisitor<? extends T>)visitor).visitArgs_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Args_listContext args_list() throws RecognitionException {
		Args_listContext _localctx = new Args_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_args_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			exp();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(220);
				match(COMMA);
				setState(221);
				exp();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35\u00e6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\6\3\66\n\3\r\3\16\3\67\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\7\5C\n\5\f\5\16\5F\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6T\n\6\3\7\6\7W\n\7\r\7\16\7X\3\b\3\b\3\b\3\b\5\b_\n\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\7\tg\n\t\f\t\16\tj\13\t\3\n\3\n\3\n\7\no\n\n\f\n\16\n"+
		"r\13\n\3\13\3\13\7\13v\n\13\f\13\16\13y\13\13\3\13\7\13|\n\13\f\13\16"+
		"\13\177\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u0088\n\f\3\r\7\r\u008b"+
		"\n\r\f\r\16\r\u008e\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u0099\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\5\20\u00a3\n\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u00ac\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\7\22\u00b3\n\22\f\22\16\22\u00b6\13\22\3\23\3\23\3\23\5\23\u00bb"+
		"\n\23\3\24\3\24\3\24\7\24\u00c0\n\24\f\24\16\24\u00c3\13\24\3\25\3\25"+
		"\3\25\7\25\u00c8\n\25\f\25\16\25\u00cb\13\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u00d5\n\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\31\7\31\u00e1\n\31\f\31\16\31\u00e4\13\31\3\31\2\2\32\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\2\u00eb\2\62\3\2\2\2\4\65"+
		"\3\2\2\2\6;\3\2\2\2\b=\3\2\2\2\nS\3\2\2\2\fV\3\2\2\2\16Z\3\2\2\2\20c\3"+
		"\2\2\2\22k\3\2\2\2\24s\3\2\2\2\26\u0087\3\2\2\2\30\u008c\3\2\2\2\32\u0091"+
		"\3\2\2\2\34\u009a\3\2\2\2\36\u00a0\3\2\2\2 \u00ab\3\2\2\2\"\u00ad\3\2"+
		"\2\2$\u00b7\3\2\2\2&\u00bc\3\2\2\2(\u00c4\3\2\2\2*\u00d4\3\2\2\2,\u00d6"+
		"\3\2\2\2.\u00db\3\2\2\2\60\u00dd\3\2\2\2\62\63\5\4\3\2\63\3\3\2\2\2\64"+
		"\66\5\6\4\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\5\3"+
		"\2\2\29<\5\b\5\2:<\5\16\b\2;9\3\2\2\2;:\3\2\2\2<\7\3\2\2\2=>\5\n\6\2>"+
		"D\7\33\2\2?@\7\r\2\2@A\7\35\2\2AC\7\16\2\2B?\3\2\2\2CF\3\2\2\2DB\3\2\2"+
		"\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7\30\2\2H\t\3\2\2\2IT\7\3\2\2JT\7\4"+
		"\2\2KT\7\5\2\2LT\7\6\2\2MN\7\7\2\2NO\7\33\2\2OP\7\13\2\2PQ\5\f\7\2QR\7"+
		"\f\2\2RT\3\2\2\2SI\3\2\2\2SJ\3\2\2\2SK\3\2\2\2SL\3\2\2\2SM\3\2\2\2T\13"+
		"\3\2\2\2UW\5\b\5\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\r\3\2\2\2"+
		"Z[\5\n\6\2[\\\7\33\2\2\\^\7\17\2\2]_\5\20\t\2^]\3\2\2\2^_\3\2\2\2_`\3"+
		"\2\2\2`a\7\20\2\2ab\5\24\13\2b\17\3\2\2\2ch\5\22\n\2de\7\31\2\2eg\5\22"+
		"\n\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\21\3\2\2\2jh\3\2\2\2kl\5"+
		"\n\6\2lp\7\33\2\2mo\7\b\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\23"+
		"\3\2\2\2rp\3\2\2\2sw\7\13\2\2tv\5\b\5\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2"+
		"wx\3\2\2\2x}\3\2\2\2yw\3\2\2\2z|\5\26\f\2{z\3\2\2\2|\177\3\2\2\2}{\3\2"+
		"\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\f\2\2\u0081\25"+
		"\3\2\2\2\u0082\u0088\5\30\r\2\u0083\u0088\5\24\13\2\u0084\u0088\5\32\16"+
		"\2\u0085\u0088\5\34\17\2\u0086\u0088\5\36\20\2\u0087\u0082\3\2\2\2\u0087"+
		"\u0083\3\2\2\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2"+
		"\2\2\u0088\27\3\2\2\2\u0089\u008b\5 \21\2\u008a\u0089\3\2\2\2\u008b\u008e"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0090\7\30\2\2\u0090\31\3\2\2\2\u0091\u0092\7\21"+
		"\2\2\u0092\u0093\7\17\2\2\u0093\u0094\5 \21\2\u0094\u0095\7\20\2\2\u0095"+
		"\u0098\5\26\f\2\u0096\u0097\7\22\2\2\u0097\u0099\5\26\f\2\u0098\u0096"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\33\3\2\2\2\u009a\u009b\7\23\2\2\u009b"+
		"\u009c\7\17\2\2\u009c\u009d\5 \21\2\u009d\u009e\7\20\2\2\u009e\u009f\5"+
		"\26\f\2\u009f\35\3\2\2\2\u00a0\u00a2\7\24\2\2\u00a1\u00a3\5 \21\2\u00a2"+
		"\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7\30"+
		"\2\2\u00a5\37\3\2\2\2\u00a6\u00a7\5\"\22\2\u00a7\u00a8\7\32\2\2\u00a8"+
		"\u00a9\5 \21\2\u00a9\u00ac\3\2\2\2\u00aa\u00ac\5$\23\2\u00ab\u00a6\3\2"+
		"\2\2\u00ab\u00aa\3\2\2\2\u00ac!\3\2\2\2\u00ad\u00b4\7\33\2\2\u00ae\u00af"+
		"\7\r\2\2\u00af\u00b0\5 \21\2\u00b0\u00b1\7\16\2\2\u00b1\u00b3\3\2\2\2"+
		"\u00b2\u00ae\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5#\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00ba\5&\24\2\u00b8"+
		"\u00b9\7\25\2\2\u00b9\u00bb\5&\24\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3"+
		"\2\2\2\u00bb%\3\2\2\2\u00bc\u00c1\5(\25\2\u00bd\u00be\7\27\2\2\u00be\u00c0"+
		"\5(\25\2\u00bf\u00bd\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\'\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c9\5*\26\2"+
		"\u00c5\u00c6\7\26\2\2\u00c6\u00c8\5*\26\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca)\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00cd\7\17\2\2\u00cd\u00ce\5 \21\2\u00ce\u00cf\7"+
		"\20\2\2\u00cf\u00d5\3\2\2\2\u00d0\u00d5\5\"\22\2\u00d1\u00d5\5,\27\2\u00d2"+
		"\u00d5\7\34\2\2\u00d3\u00d5\7\35\2\2\u00d4\u00cc\3\2\2\2\u00d4\u00d0\3"+
		"\2\2\2\u00d4\u00d1\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5"+
		"+\3\2\2\2\u00d6\u00d7\7\33\2\2\u00d7\u00d8\7\17\2\2\u00d8\u00d9\5.\30"+
		"\2\u00d9\u00da\7\20\2\2\u00da-\3\2\2\2\u00db\u00dc\5\60\31\2\u00dc/\3"+
		"\2\2\2\u00dd\u00e2\5 \21\2\u00de\u00df\7\31\2\2\u00df\u00e1\5 \21\2\u00e0"+
		"\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\61\3\2\2\2\u00e4\u00e2\3\2\2\2\27\67;DSX^hpw}\u0087\u008c\u0098"+
		"\u00a2\u00ab\u00b4\u00ba\u00c1\u00c9\u00d4\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}