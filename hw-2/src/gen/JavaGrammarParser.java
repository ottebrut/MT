package gen;// Generated from C:/Users/ottan/Documents/MT/hw-2/grammar\JavaGrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ABSTRACT=11, ARRAY=12, BOOLEAN=13, CHAR=14, CLASS=15, DOUBLE=16, 
		FLOAT=17, IF=18, INT=19, LONG=20, OBJECT=21, PRIVATE=22, PROTECTED=23, 
		PUBLIC=24, RETURN=25, STATIC=26, STRING=27, VOID=28, LCurlyBracket=29, 
		RCurlyBracket=30, LCircleBracket=31, RCircleBracket=32, Comma=33, Semicolon=34, 
		Breaks=35, Name=36, Number=37;
	public static final int
		RULE_file = 0, RULE_javaClass = 1, RULE_classDeclaration = 2, RULE_classBody = 3, 
		RULE_function = 4, RULE_functionDeclaration = 5, RULE_functionType = 6, 
		RULE_functionParameters = 7, RULE_functionBody = 8, RULE_functionStatement = 9, 
		RULE_variableDeclaration = 10, RULE_variableTypeAndName = 11, RULE_variableName = 12, 
		RULE_ifStatement = 13, RULE_thenStatement = 14, RULE_elseStatement = 15, 
		RULE_functionInvoke = 16, RULE_functionInvokeParameters = 17, RULE_forCycle = 18, 
		RULE_forCycleDeclaration = 19, RULE_whileCycle = 20, RULE_whileCycleDeclaration = 21, 
		RULE_forLogicStatement = 22, RULE_whileLogicStatement = 23, RULE_equalityOperator = 24, 
		RULE_cycleBody = 25, RULE_returnStatement = 26, RULE_returnValue = 27, 
		RULE_modifier = 28, RULE_type = 29, RULE_primitiveType = 30, RULE_referenceType = 31, 
		RULE_customType = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "javaClass", "classDeclaration", "classBody", "function", "functionDeclaration", 
			"functionType", "functionParameters", "functionBody", "functionStatement", 
			"variableDeclaration", "variableTypeAndName", "variableName", "ifStatement", 
			"thenStatement", "elseStatement", "functionInvoke", "functionInvokeParameters", 
			"forCycle", "forCycleDeclaration", "whileCycle", "whileCycleDeclaration", 
			"forLogicStatement", "whileLogicStatement", "equalityOperator", "cycleBody", 
			"returnStatement", "returnValue", "modifier", "type", "primitiveType", 
			"referenceType", "customType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'else'", "'for'", "'++'", "'--'", "'while'", "'<'", "'=='", "'>'", 
			"'<='", "'>='", "'abstract'", "'Array'", "'boolean'", "'char'", "'class'", 
			"'double'", "'float'", "'if'", "'int'", "'long'", "'Object'", "'private'", 
			"'protected'", "'public'", "'return'", "'static'", "'String'", "'void'", 
			"'{'", "'}'", "'('", "')'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "ABSTRACT", 
			"ARRAY", "BOOLEAN", "CHAR", "CLASS", "DOUBLE", "FLOAT", "IF", "INT", 
			"LONG", "OBJECT", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "STATIC", 
			"STRING", "VOID", "LCurlyBracket", "RCurlyBracket", "LCircleBracket", 
			"RCircleBracket", "Comma", "Semicolon", "Breaks", "Name", "Number"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "JavaGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JavaGrammarParser.EOF, 0); }
		public List<ClassBodyContext> classBody() {
			return getRuleContexts(ClassBodyContext.class);
		}
		public ClassBodyContext classBody(int i) {
			return getRuleContext(ClassBodyContext.class,i);
		}
		public List<JavaClassContext> javaClass() {
			return getRuleContexts(JavaClassContext.class);
		}
		public JavaClassContext javaClass(int i) {
			return getRuleContext(JavaClassContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ABSTRACT) | (1L << ARRAY) | (1L << BOOLEAN) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << FLOAT) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << OBJECT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRING) | (1L << VOID) | (1L << Breaks) | (1L << Name))) != 0)) {
				{
				setState(68);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(66);
					classBody();
					}
					break;
				case 2:
					{
					setState(67);
					javaClass();
					}
					break;
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(EOF);
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

	public static class JavaClassContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TerminalNode LCurlyBracket() { return getToken(JavaGrammarParser.LCurlyBracket, 0); }
		public TerminalNode RCurlyBracket() { return getToken(JavaGrammarParser.RCurlyBracket, 0); }
		public List<TerminalNode> Breaks() { return getTokens(JavaGrammarParser.Breaks); }
		public TerminalNode Breaks(int i) {
			return getToken(JavaGrammarParser.Breaks, i);
		}
		public List<ClassBodyContext> classBody() {
			return getRuleContexts(ClassBodyContext.class);
		}
		public ClassBodyContext classBody(int i) {
			return getRuleContext(ClassBodyContext.class,i);
		}
		public JavaClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javaClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterJavaClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitJavaClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitJavaClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JavaClassContext javaClass() throws RecognitionException {
		JavaClassContext _localctx = new JavaClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_javaClass);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			classDeclaration();
			setState(76);
			match(LCurlyBracket);
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(77);
					match(Breaks);
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ABSTRACT) | (1L << ARRAY) | (1L << BOOLEAN) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << FLOAT) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << OBJECT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRING) | (1L << VOID) | (1L << Breaks) | (1L << Name))) != 0)) {
				{
				{
				setState(83);
				classBody();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(RCurlyBracket);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					match(Breaks);
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(JavaGrammarParser.CLASS, 0); }
		public TerminalNode Name() { return getToken(JavaGrammarParser.Name, 0); }
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public List<TerminalNode> Breaks() { return getTokens(JavaGrammarParser.Breaks); }
		public TerminalNode Breaks(int i) {
			return getToken(JavaGrammarParser.Breaks, i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC))) != 0)) {
				{
				{
				setState(96);
				modifier();
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(97);
					match(Breaks);
					}
					}
					setState(100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Breaks );
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(CLASS);
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
				match(Breaks);
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Breaks );
			setState(113);
			match(Name);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(114);
				match(Breaks);
				}
				}
				setState(119);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<FunctionStatementContext> functionStatement() {
			return getRuleContexts(FunctionStatementContext.class);
		}
		public FunctionStatementContext functionStatement(int i) {
			return getRuleContext(FunctionStatementContext.class,i);
		}
		public List<JavaClassContext> javaClass() {
			return getRuleContexts(JavaClassContext.class);
		}
		public JavaClassContext javaClass(int i) {
			return getRuleContext(JavaClassContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(123);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(120);
						function();
						}
						break;
					case 2:
						{
						setState(121);
						functionStatement();
						}
						break;
					case 3:
						{
						setState(122);
						javaClass();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(125); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public TerminalNode LCurlyBracket() { return getToken(JavaGrammarParser.LCurlyBracket, 0); }
		public TerminalNode RCurlyBracket() { return getToken(JavaGrammarParser.RCurlyBracket, 0); }
		public List<TerminalNode> Breaks() { return getTokens(JavaGrammarParser.Breaks); }
		public TerminalNode Breaks(int i) {
			return getToken(JavaGrammarParser.Breaks, i);
		}
		public List<FunctionBodyContext> functionBody() {
			return getRuleContexts(FunctionBodyContext.class);
		}
		public FunctionBodyContext functionBody(int i) {
			return getRuleContext(FunctionBodyContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			functionDeclaration();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(128);
				match(Breaks);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(LCurlyBracket);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(135);
					match(Breaks);
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ARRAY) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << OBJECT) | (1L << RETURN) | (1L << STRING) | (1L << Breaks) | (1L << Name))) != 0)) {
				{
				{
				setState(141);
				functionBody();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			match(RCurlyBracket);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(148);
					match(Breaks);
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public TerminalNode Name() { return getToken(JavaGrammarParser.Name, 0); }
		public TerminalNode LCircleBracket() { return getToken(JavaGrammarParser.LCircleBracket, 0); }
		public TerminalNode RCircleBracket() { return getToken(JavaGrammarParser.RCircleBracket, 0); }
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public List<TerminalNode> Breaks() { return getTokens(JavaGrammarParser.Breaks); }
		public TerminalNode Breaks(int i) {
			return getToken(JavaGrammarParser.Breaks, i);
		}
		public List<FunctionParametersContext> functionParameters() {
			return getRuleContexts(FunctionParametersContext.class);
		}
		public FunctionParametersContext functionParameters(int i) {
			return getRuleContext(FunctionParametersContext.class,i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC))) != 0)) {
				{
				{
				setState(154);
				modifier();
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(155);
					match(Breaks);
					}
					}
					setState(158); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Breaks );
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			functionType();
			setState(167); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(166);
				match(Breaks);
				}
				}
				setState(169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Breaks );
			setState(171);
			match(Name);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(172);
				match(Breaks);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(LCircleBracket);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << OBJECT) | (1L << STRING) | (1L << Name))) != 0)) {
				{
				{
				setState(179);
				functionParameters();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			match(RCircleBracket);
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

	public static class FunctionTypeContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(JavaGrammarParser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionType);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(VOID);
				}
				break;
			case ARRAY:
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case OBJECT:
			case STRING:
			case Name:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				type();
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

	public static class FunctionParametersContext extends ParserRuleContext {
		public List<VariableTypeAndNameContext> variableTypeAndName() {
			return getRuleContexts(VariableTypeAndNameContext.class);
		}
		public VariableTypeAndNameContext variableTypeAndName(int i) {
			return getRuleContext(VariableTypeAndNameContext.class,i);
		}
		public List<TerminalNode> Breaks() { return getTokens(JavaGrammarParser.Breaks); }
		public TerminalNode Breaks(int i) {
			return getToken(JavaGrammarParser.Breaks, i);
		}
		public List<TerminalNode> Comma() { return getTokens(JavaGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JavaGrammarParser.Comma, i);
		}
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterFunctionParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitFunctionParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitFunctionParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			variableTypeAndName();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(192);
				match(Breaks);
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(198);
				match(Comma);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Breaks) {
					{
					{
					setState(199);
					match(Breaks);
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(205);
				variableTypeAndName();
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Breaks) {
					{
					{
					setState(206);
					match(Breaks);
					}
					}
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(216);
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public List<TerminalNode> Breaks() { return getTokens(JavaGrammarParser.Breaks); }
		public TerminalNode Breaks(int i) {
			return getToken(JavaGrammarParser.Breaks, i);
		}
		public List<FunctionStatementContext> functionStatement() {
			return getRuleContexts(FunctionStatementContext.class);
		}
		public FunctionStatementContext functionStatement(int i) {
			return getRuleContext(FunctionStatementContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__4:
			case ARRAY:
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case IF:
			case INT:
			case LONG:
			case OBJECT:
			case STRING:
			case Breaks:
			case Name:
				{
				setState(218); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(217);
						functionStatement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(220); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(222);
					returnStatement();
					}
					break;
				}
				}
				break;
			case RETURN:
				{
				setState(225);
				returnStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(228);
					match(Breaks);
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class FunctionStatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public FunctionInvokeContext functionInvoke() {
			return getRuleContext(FunctionInvokeContext.class,0);
		}
		public ForCycleContext forCycle() {
			return getRuleContext(ForCycleContext.class,0);
		}
		public WhileCycleContext whileCycle() {
			return getRuleContext(WhileCycleContext.class,0);
		}
		public List<TerminalNode> Breaks() { return getTokens(JavaGrammarParser.Breaks); }
		public TerminalNode Breaks(int i) {
			return getToken(JavaGrammarParser.Breaks, i);
		}
		public FunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionStatementContext functionStatement() throws RecognitionException {
		FunctionStatementContext _localctx = new FunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(234);
				match(Breaks);
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(240);
				variableDeclaration();
				}
				break;
			case 2:
				{
				setState(241);
				ifStatement();
				}
				break;
			case 3:
				{
				setState(242);
				functionInvoke();
				}
				break;
			case 4:
				{
				setState(243);
				forCycle();
				}
				break;
			case 5:
				{
				setState(244);
				whileCycle();
				}
				break;
			}
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(247);
					match(Breaks);
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableTypeAndNameContext variableTypeAndName() {
			return getRuleContext(VariableTypeAndNameContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(JavaGrammarParser.Semicolon, 0); }
		public List<TerminalNode> Breaks() { return getTokens(JavaGrammarParser.Breaks); }
		public TerminalNode Breaks(int i) {
			return getToken(JavaGrammarParser.Breaks, i);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			variableTypeAndName();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(254);
				match(Breaks);
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			match(Semicolon);
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

	public static class VariableTypeAndNameContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Name() { return getToken(JavaGrammarParser.Name, 0); }
		public List<TerminalNode> Breaks() { return getTokens(JavaGrammarParser.Breaks); }
		public TerminalNode Breaks(int i) {
			return getToken(JavaGrammarParser.Breaks, i);
		}
		public VariableTypeAndNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableTypeAndName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterVariableTypeAndName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitVariableTypeAndName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitVariableTypeAndName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableTypeAndNameContext variableTypeAndName() throws RecognitionException {
		VariableTypeAndNameContext _localctx = new VariableTypeAndNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableTypeAndName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			type();
			setState(264); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(263);
				match(Breaks);
				}
				}
				setState(266); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Breaks );
			setState(268);
			match(Name);
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

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(JavaGrammarParser.Name, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(Name);
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(JavaGrammarParser.IF, 0); }
		public TerminalNode LCircleBracket() { return getToken(JavaGrammarParser.LCircleBracket, 0); }
		public TerminalNode Name() { return getToken(JavaGrammarParser.Name, 0); }
		public TerminalNode RCircleBracket() { return getToken(JavaGrammarParser.RCircleBracket, 0); }
		public ThenStatementContext thenStatement() {
			return getRuleContext(ThenStatementContext.class,0);
		}
		public List<TerminalNode> Breaks() { return getTokens(JavaGrammarParser.Breaks); }
		public TerminalNode Breaks(int i) {
			return getToken(JavaGrammarParser.Breaks, i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(IF);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(273);
				match(Breaks);
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
			match(LCircleBracket);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(280);
				match(Breaks);
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286);
			match(Name);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(287);
				match(Breaks);
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			match(RCircleBracket);
			setState(294);
			thenStatement();
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(295);
				match(T__0);
				setState(296);
				elseStatement();
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

	public static class ThenStatementContext extends ParserRuleContext {
		public TerminalNode LCurlyBracket() { return getToken(JavaGrammarParser.LCurlyBracket, 0); }
		public TerminalNode RCurlyBracket() { return getToken(JavaGrammarParser.RCurlyBracket, 0); }
		public List<TerminalNode> Breaks() { return getTokens(JavaGrammarParser.Breaks); }
		public TerminalNode Breaks(int i) {
			return getToken(JavaGrammarParser.Breaks, i);
		}
		public List<FunctionStatementContext> functionStatement() {
			return getRuleContexts(FunctionStatementContext.class);
		}
		public FunctionStatementContext functionStatement(int i) {
			return getRuleContext(FunctionStatementContext.class,i);
		}
		public ThenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterThenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitThenStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitThenStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThenStatementContext thenStatement() throws RecognitionException {
		ThenStatementContext _localctx = new ThenStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_thenStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(299);
				match(Breaks);
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			match(LCurlyBracket);
			setState(307); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(306);
				functionStatement();
				}
				}
				setState(309); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ARRAY) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << OBJECT) | (1L << STRING) | (1L << Breaks) | (1L << Name))) != 0) );
			setState(311);
			match(RCurlyBracket);
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(312);
					match(Breaks);
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode LCurlyBracket() { return getToken(JavaGrammarParser.LCurlyBracket, 0); }
		public TerminalNode RCurlyBracket() { return getToken(JavaGrammarParser.RCurlyBracket, 0); }
		public List<TerminalNode> Breaks() { return getTokens(JavaGrammarParser.Breaks); }
		public TerminalNode Breaks(int i) {
			return getToken(JavaGrammarParser.Breaks, i);
		}
		public List<FunctionStatementContext> functionStatement() {
			return getRuleContexts(FunctionStatementContext.class);
		}
		public FunctionStatementContext functionStatement(int i) {
			return getRuleContext(FunctionStatementContext.class,i);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elseStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(318);
				match(Breaks);
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
			match(LCurlyBracket);
			setState(326); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(325);
				functionStatement();
				}
				}
				setState(328); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ARRAY) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << OBJECT) | (1L << STRING) | (1L << Breaks) | (1L << Name))) != 0) );
			setState(330);
			match(RCurlyBracket);
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(331);
					match(Breaks);
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	public static class FunctionInvokeContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(JavaGrammarParser.Name, 0); }
		public TerminalNode LCircleBracket() { return getToken(JavaGrammarParser.LCircleBracket, 0); }
		public FunctionInvokeParametersContext functionInvokeParameters() {
			return getRuleContext(FunctionInvokeParametersContext.class,0);
		}
		public TerminalNode RCircleBracket() { return getToken(JavaGrammarParser.RCircleBracket, 0); }
		public TerminalNode Semicolon() { return getToken(JavaGrammarParser.Semicolon, 0); }
		public List<TerminalNode> Breaks() { return getTokens(JavaGrammarParser.Breaks); }
		public TerminalNode Breaks(int i) {
			return getToken(JavaGrammarParser.Breaks, i);
		}
		public FunctionInvokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInvoke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterFunctionInvoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitFunctionInvoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitFunctionInvoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionInvokeContext functionInvoke() throws RecognitionException {
		FunctionInvokeContext _localctx = new FunctionInvokeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionInvoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(Name);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(338);
				match(Breaks);
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344);
			match(LCircleBracket);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(345);
				match(Breaks);
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
			functionInvokeParameters();
			setState(352);
			match(RCircleBracket);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(353);
				match(Breaks);
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359);
			match(Semicolon);
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

	public static class FunctionInvokeParametersContext extends ParserRuleContext {
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public List<TerminalNode> Breaks() { return getTokens(JavaGrammarParser.Breaks); }
		public TerminalNode Breaks(int i) {
			return getToken(JavaGrammarParser.Breaks, i);
		}
		public List<TerminalNode> Comma() { return getTokens(JavaGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JavaGrammarParser.Comma, i);
		}
		public FunctionInvokeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionInvokeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterFunctionInvokeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitFunctionInvokeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitFunctionInvokeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionInvokeParametersContext functionInvokeParameters() throws RecognitionException {
		FunctionInvokeParametersContext _localctx = new FunctionInvokeParametersContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionInvokeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			variableName();
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(362);
				match(Breaks);
				}
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(368);
				match(Comma);
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Breaks) {
					{
					{
					setState(369);
					match(Breaks);
					}
					}
					setState(374);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(375);
				variableName();
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Breaks) {
					{
					{
					setState(376);
					match(Breaks);
					}
					}
					setState(381);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(386);
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

	public static class ForCycleContext extends ParserRuleContext {
		public ForCycleDeclarationContext forCycleDeclaration() {
			return getRuleContext(ForCycleDeclarationContext.class,0);
		}
		public CycleBodyContext cycleBody() {
			return getRuleContext(CycleBodyContext.class,0);
		}
		public ForCycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterForCycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitForCycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitForCycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForCycleContext forCycle() throws RecognitionException {
		ForCycleContext _localctx = new ForCycleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forCycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			forCycleDeclaration();
			setState(388);
			cycleBody();
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

	public static class ForCycleDeclarationContext extends ParserRuleContext {
		public TerminalNode LCircleBracket() { return getToken(JavaGrammarParser.LCircleBracket, 0); }
		public VariableTypeAndNameContext variableTypeAndName() {
			return getRuleContext(VariableTypeAndNameContext.class,0);
		}
		public List<TerminalNode> Semicolon() { return getTokens(JavaGrammarParser.Semicolon); }
		public TerminalNode Semicolon(int i) {
			return getToken(JavaGrammarParser.Semicolon, i);
		}
		public ForLogicStatementContext forLogicStatement() {
			return getRuleContext(ForLogicStatementContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode RCircleBracket() { return getToken(JavaGrammarParser.RCircleBracket, 0); }
		public List<TerminalNode> Breaks() { return getTokens(JavaGrammarParser.Breaks); }
		public TerminalNode Breaks(int i) {
			return getToken(JavaGrammarParser.Breaks, i);
		}
		public ForCycleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCycleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterForCycleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitForCycleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitForCycleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForCycleDeclarationContext forCycleDeclaration() throws RecognitionException {
		ForCycleDeclarationContext _localctx = new ForCycleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forCycleDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(T__1);
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(391);
				match(Breaks);
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(397);
			match(LCircleBracket);
			setState(398);
			variableTypeAndName();
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(399);
				match(Breaks);
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(405);
			match(Semicolon);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(406);
				match(Breaks);
				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(412);
			forLogicStatement();
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(413);
				match(Breaks);
				}
				}
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(419);
			match(Semicolon);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(420);
				match(Breaks);
				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(426);
			variableName();
			setState(427);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(428);
				match(Breaks);
				}
				}
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(434);
			match(RCircleBracket);
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

	public static class WhileCycleContext extends ParserRuleContext {
		public WhileCycleDeclarationContext whileCycleDeclaration() {
			return getRuleContext(WhileCycleDeclarationContext.class,0);
		}
		public CycleBodyContext cycleBody() {
			return getRuleContext(CycleBodyContext.class,0);
		}
		public WhileCycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileCycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterWhileCycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitWhileCycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitWhileCycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileCycleContext whileCycle() throws RecognitionException {
		WhileCycleContext _localctx = new WhileCycleContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_whileCycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			whileCycleDeclaration();
			setState(437);
			cycleBody();
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

	public static class WhileCycleDeclarationContext extends ParserRuleContext {
		public TerminalNode LCircleBracket() { return getToken(JavaGrammarParser.LCircleBracket, 0); }
		public WhileLogicStatementContext whileLogicStatement() {
			return getRuleContext(WhileLogicStatementContext.class,0);
		}
		public TerminalNode RCircleBracket() { return getToken(JavaGrammarParser.RCircleBracket, 0); }
		public List<TerminalNode> Breaks() { return getTokens(JavaGrammarParser.Breaks); }
		public TerminalNode Breaks(int i) {
			return getToken(JavaGrammarParser.Breaks, i);
		}
		public WhileCycleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileCycleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterWhileCycleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitWhileCycleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitWhileCycleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileCycleDeclarationContext whileCycleDeclaration() throws RecognitionException {
		WhileCycleDeclarationContext _localctx = new WhileCycleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_whileCycleDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(T__4);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(440);
				match(Breaks);
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(446);
			match(LCircleBracket);
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(447);
				match(Breaks);
				}
				}
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(453);
			whileLogicStatement();
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(454);
				match(Breaks);
				}
				}
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(460);
			match(RCircleBracket);
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

	public static class ForLogicStatementContext extends ParserRuleContext {
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public EqualityOperatorContext equalityOperator() {
			return getRuleContext(EqualityOperatorContext.class,0);
		}
		public List<TerminalNode> Breaks() { return getTokens(JavaGrammarParser.Breaks); }
		public TerminalNode Breaks(int i) {
			return getToken(JavaGrammarParser.Breaks, i);
		}
		public ForLogicStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLogicStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterForLogicStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitForLogicStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitForLogicStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLogicStatementContext forLogicStatement() throws RecognitionException {
		ForLogicStatementContext _localctx = new ForLogicStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_forLogicStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			variableName();
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(463);
				match(Breaks);
				}
				}
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(469);
			equalityOperator();
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(470);
				match(Breaks);
				}
				}
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(476);
			variableName();
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

	public static class WhileLogicStatementContext extends ParserRuleContext {
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public EqualityOperatorContext equalityOperator() {
			return getRuleContext(EqualityOperatorContext.class,0);
		}
		public List<TerminalNode> Breaks() { return getTokens(JavaGrammarParser.Breaks); }
		public TerminalNode Breaks(int i) {
			return getToken(JavaGrammarParser.Breaks, i);
		}
		public WhileLogicStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLogicStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterWhileLogicStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitWhileLogicStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitWhileLogicStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLogicStatementContext whileLogicStatement() throws RecognitionException {
		WhileLogicStatementContext _localctx = new WhileLogicStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_whileLogicStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			variableName();
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(479);
				match(Breaks);
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(485);
			equalityOperator();
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(486);
				match(Breaks);
				}
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(492);
			variableName();
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

	public static class EqualityOperatorContext extends ParserRuleContext {
		public EqualityOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterEqualityOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitEqualityOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitEqualityOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityOperatorContext equalityOperator() throws RecognitionException {
		EqualityOperatorContext _localctx = new EqualityOperatorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_equalityOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class CycleBodyContext extends ParserRuleContext {
		public TerminalNode LCurlyBracket() { return getToken(JavaGrammarParser.LCurlyBracket, 0); }
		public TerminalNode RCurlyBracket() { return getToken(JavaGrammarParser.RCurlyBracket, 0); }
		public List<TerminalNode> Breaks() { return getTokens(JavaGrammarParser.Breaks); }
		public TerminalNode Breaks(int i) {
			return getToken(JavaGrammarParser.Breaks, i);
		}
		public List<FunctionStatementContext> functionStatement() {
			return getRuleContexts(FunctionStatementContext.class);
		}
		public FunctionStatementContext functionStatement(int i) {
			return getRuleContext(FunctionStatementContext.class,i);
		}
		public CycleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycleBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterCycleBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitCycleBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitCycleBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CycleBodyContext cycleBody() throws RecognitionException {
		CycleBodyContext _localctx = new CycleBodyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cycleBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(496);
				match(Breaks);
				}
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(502);
			match(LCurlyBracket);
			setState(504); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(503);
				functionStatement();
				}
				}
				setState(506); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ARRAY) | (1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << OBJECT) | (1L << STRING) | (1L << Breaks) | (1L << Name))) != 0) );
			setState(508);
			match(RCurlyBracket);
			setState(512);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(509);
					match(Breaks);
					}
					} 
				}
				setState(514);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(JavaGrammarParser.RETURN, 0); }
		public ReturnValueContext returnValue() {
			return getRuleContext(ReturnValueContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(JavaGrammarParser.Semicolon, 0); }
		public List<TerminalNode> Breaks() { return getTokens(JavaGrammarParser.Breaks); }
		public TerminalNode Breaks(int i) {
			return getToken(JavaGrammarParser.Breaks, i);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(RETURN);
			setState(517); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(516);
				match(Breaks);
				}
				}
				setState(519); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Breaks );
			setState(521);
			returnValue();
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Breaks) {
				{
				{
				setState(522);
				match(Breaks);
				}
				}
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(528);
			match(Semicolon);
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

	public static class ReturnValueContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(JavaGrammarParser.Name, 0); }
		public TerminalNode Number() { return getToken(JavaGrammarParser.Number, 0); }
		public ReturnValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterReturnValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitReturnValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitReturnValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnValueContext returnValue() throws RecognitionException {
		ReturnValueContext _localctx = new ReturnValueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_returnValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_la = _input.LA(1);
			if ( !(_la==Name || _la==Number) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(JavaGrammarParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(JavaGrammarParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaGrammarParser.PROTECTED, 0); }
		public TerminalNode STATIC() { return getToken(JavaGrammarParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaGrammarParser.ABSTRACT, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_type);
		try {
			setState(536);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				primitiveType();
				}
				break;
			case ARRAY:
			case OBJECT:
			case STRING:
			case Name:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				referenceType();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JavaGrammarParser.INT, 0); }
		public TerminalNode LONG() { return getToken(JavaGrammarParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(JavaGrammarParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(JavaGrammarParser.DOUBLE, 0); }
		public TerminalNode BOOLEAN() { return getToken(JavaGrammarParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(JavaGrammarParser.CHAR, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ReferenceTypeContext extends ParserRuleContext {
		public TerminalNode OBJECT() { return getToken(JavaGrammarParser.OBJECT, 0); }
		public TerminalNode ARRAY() { return getToken(JavaGrammarParser.ARRAY, 0); }
		public TerminalNode STRING() { return getToken(JavaGrammarParser.STRING, 0); }
		public CustomTypeContext customType() {
			return getRuleContext(CustomTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_referenceType);
		try {
			setState(544);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBJECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				match(OBJECT);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				match(ARRAY);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(542);
				match(STRING);
				}
				break;
			case Name:
				enterOuterAlt(_localctx, 4);
				{
				setState(543);
				customType();
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

	public static class CustomTypeContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(JavaGrammarParser.Name, 0); }
		public CustomTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).enterCustomType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammarListener ) ((JavaGrammarListener)listener).exitCustomType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammarVisitor ) return ((JavaGrammarVisitor<? extends T>)visitor).visitCustomType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomTypeContext customType() throws RecognitionException {
		CustomTypeContext _localctx = new CustomTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_customType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(Name);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0227\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\7\2G\n\2\f\2\16\2J\13\2\3\2\3\2\3\3\3\3\3\3\7\3Q\n"+
		"\3\f\3\16\3T\13\3\3\3\7\3W\n\3\f\3\16\3Z\13\3\3\3\3\3\7\3^\n\3\f\3\16"+
		"\3a\13\3\3\4\3\4\6\4e\n\4\r\4\16\4f\7\4i\n\4\f\4\16\4l\13\4\3\4\3\4\6"+
		"\4p\n\4\r\4\16\4q\3\4\3\4\7\4v\n\4\f\4\16\4y\13\4\3\5\3\5\3\5\6\5~\n\5"+
		"\r\5\16\5\177\3\6\3\6\7\6\u0084\n\6\f\6\16\6\u0087\13\6\3\6\3\6\7\6\u008b"+
		"\n\6\f\6\16\6\u008e\13\6\3\6\7\6\u0091\n\6\f\6\16\6\u0094\13\6\3\6\3\6"+
		"\7\6\u0098\n\6\f\6\16\6\u009b\13\6\3\7\3\7\6\7\u009f\n\7\r\7\16\7\u00a0"+
		"\7\7\u00a3\n\7\f\7\16\7\u00a6\13\7\3\7\3\7\6\7\u00aa\n\7\r\7\16\7\u00ab"+
		"\3\7\3\7\7\7\u00b0\n\7\f\7\16\7\u00b3\13\7\3\7\3\7\7\7\u00b7\n\7\f\7\16"+
		"\7\u00ba\13\7\3\7\3\7\3\b\3\b\5\b\u00c0\n\b\3\t\3\t\7\t\u00c4\n\t\f\t"+
		"\16\t\u00c7\13\t\3\t\3\t\7\t\u00cb\n\t\f\t\16\t\u00ce\13\t\3\t\3\t\7\t"+
		"\u00d2\n\t\f\t\16\t\u00d5\13\t\7\t\u00d7\n\t\f\t\16\t\u00da\13\t\3\n\6"+
		"\n\u00dd\n\n\r\n\16\n\u00de\3\n\5\n\u00e2\n\n\3\n\5\n\u00e5\n\n\3\n\7"+
		"\n\u00e8\n\n\f\n\16\n\u00eb\13\n\3\13\7\13\u00ee\n\13\f\13\16\13\u00f1"+
		"\13\13\3\13\3\13\3\13\3\13\3\13\5\13\u00f8\n\13\3\13\7\13\u00fb\n\13\f"+
		"\13\16\13\u00fe\13\13\3\f\3\f\7\f\u0102\n\f\f\f\16\f\u0105\13\f\3\f\3"+
		"\f\3\r\3\r\6\r\u010b\n\r\r\r\16\r\u010c\3\r\3\r\3\16\3\16\3\17\3\17\7"+
		"\17\u0115\n\17\f\17\16\17\u0118\13\17\3\17\3\17\7\17\u011c\n\17\f\17\16"+
		"\17\u011f\13\17\3\17\3\17\7\17\u0123\n\17\f\17\16\17\u0126\13\17\3\17"+
		"\3\17\3\17\3\17\5\17\u012c\n\17\3\20\7\20\u012f\n\20\f\20\16\20\u0132"+
		"\13\20\3\20\3\20\6\20\u0136\n\20\r\20\16\20\u0137\3\20\3\20\7\20\u013c"+
		"\n\20\f\20\16\20\u013f\13\20\3\21\7\21\u0142\n\21\f\21\16\21\u0145\13"+
		"\21\3\21\3\21\6\21\u0149\n\21\r\21\16\21\u014a\3\21\3\21\7\21\u014f\n"+
		"\21\f\21\16\21\u0152\13\21\3\22\3\22\7\22\u0156\n\22\f\22\16\22\u0159"+
		"\13\22\3\22\3\22\7\22\u015d\n\22\f\22\16\22\u0160\13\22\3\22\3\22\3\22"+
		"\7\22\u0165\n\22\f\22\16\22\u0168\13\22\3\22\3\22\3\23\3\23\7\23\u016e"+
		"\n\23\f\23\16\23\u0171\13\23\3\23\3\23\7\23\u0175\n\23\f\23\16\23\u0178"+
		"\13\23\3\23\3\23\7\23\u017c\n\23\f\23\16\23\u017f\13\23\7\23\u0181\n\23"+
		"\f\23\16\23\u0184\13\23\3\24\3\24\3\24\3\25\3\25\7\25\u018b\n\25\f\25"+
		"\16\25\u018e\13\25\3\25\3\25\3\25\7\25\u0193\n\25\f\25\16\25\u0196\13"+
		"\25\3\25\3\25\7\25\u019a\n\25\f\25\16\25\u019d\13\25\3\25\3\25\7\25\u01a1"+
		"\n\25\f\25\16\25\u01a4\13\25\3\25\3\25\7\25\u01a8\n\25\f\25\16\25\u01ab"+
		"\13\25\3\25\3\25\3\25\7\25\u01b0\n\25\f\25\16\25\u01b3\13\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\7\27\u01bc\n\27\f\27\16\27\u01bf\13\27\3\27"+
		"\3\27\7\27\u01c3\n\27\f\27\16\27\u01c6\13\27\3\27\3\27\7\27\u01ca\n\27"+
		"\f\27\16\27\u01cd\13\27\3\27\3\27\3\30\3\30\7\30\u01d3\n\30\f\30\16\30"+
		"\u01d6\13\30\3\30\3\30\7\30\u01da\n\30\f\30\16\30\u01dd\13\30\3\30\3\30"+
		"\3\31\3\31\7\31\u01e3\n\31\f\31\16\31\u01e6\13\31\3\31\3\31\7\31\u01ea"+
		"\n\31\f\31\16\31\u01ed\13\31\3\31\3\31\3\32\3\32\3\33\7\33\u01f4\n\33"+
		"\f\33\16\33\u01f7\13\33\3\33\3\33\6\33\u01fb\n\33\r\33\16\33\u01fc\3\33"+
		"\3\33\7\33\u0201\n\33\f\33\16\33\u0204\13\33\3\34\3\34\6\34\u0208\n\34"+
		"\r\34\16\34\u0209\3\34\3\34\7\34\u020e\n\34\f\34\16\34\u0211\13\34\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\5\37\u021b\n\37\3 \3 \3!\3!\3!\3!"+
		"\5!\u0223\n!\3\"\3\"\3\"\2\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@B\2\7\3\2\5\6\3\2\b\f\3\2&\'\5\2\r\r\30\32\34"+
		"\34\5\2\17\20\22\23\25\26\2\u0252\2H\3\2\2\2\4M\3\2\2\2\6j\3\2\2\2\b}"+
		"\3\2\2\2\n\u0081\3\2\2\2\f\u00a4\3\2\2\2\16\u00bf\3\2\2\2\20\u00c1\3\2"+
		"\2\2\22\u00e4\3\2\2\2\24\u00ef\3\2\2\2\26\u00ff\3\2\2\2\30\u0108\3\2\2"+
		"\2\32\u0110\3\2\2\2\34\u0112\3\2\2\2\36\u0130\3\2\2\2 \u0143\3\2\2\2\""+
		"\u0153\3\2\2\2$\u016b\3\2\2\2&\u0185\3\2\2\2(\u0188\3\2\2\2*\u01b6\3\2"+
		"\2\2,\u01b9\3\2\2\2.\u01d0\3\2\2\2\60\u01e0\3\2\2\2\62\u01f0\3\2\2\2\64"+
		"\u01f5\3\2\2\2\66\u0205\3\2\2\28\u0214\3\2\2\2:\u0216\3\2\2\2<\u021a\3"+
		"\2\2\2>\u021c\3\2\2\2@\u0222\3\2\2\2B\u0224\3\2\2\2DG\5\b\5\2EG\5\4\3"+
		"\2FD\3\2\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2"+
		"\2KL\7\2\2\3L\3\3\2\2\2MN\5\6\4\2NR\7\37\2\2OQ\7%\2\2PO\3\2\2\2QT\3\2"+
		"\2\2RP\3\2\2\2RS\3\2\2\2SX\3\2\2\2TR\3\2\2\2UW\5\b\5\2VU\3\2\2\2WZ\3\2"+
		"\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[_\7 \2\2\\^\7%\2\2]\\\3\2"+
		"\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\5\3\2\2\2a_\3\2\2\2bd\5:\36\2ce\7"+
		"%\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hb\3\2\2\2il\3"+
		"\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mo\7\21\2\2np\7%\2\2on\3"+
		"\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2sw\7&\2\2tv\7%\2\2ut\3\2"+
		"\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\7\3\2\2\2yw\3\2\2\2z~\5\n\6\2{~\5"+
		"\24\13\2|~\5\4\3\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2"+
		"\2\2\177\u0080\3\2\2\2\u0080\t\3\2\2\2\u0081\u0085\5\f\7\2\u0082\u0084"+
		"\7%\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008c\7\37"+
		"\2\2\u0089\u008b\7%\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0092\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008f\u0091\5\22\n\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0095\u0099\7 \2\2\u0096\u0098\7%\2\2\u0097\u0096\3\2\2\2\u0098\u009b"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\13\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009c\u009e\5:\36\2\u009d\u009f\7%\2\2\u009e\u009d\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a3\3\2\2\2\u00a2\u009c\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00a9\5\16\b\2\u00a8\u00aa\7%\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00b1\7&\2\2\u00ae\u00b0\7%\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2"+
		"\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1"+
		"\3\2\2\2\u00b4\u00b8\7!\2\2\u00b5\u00b7\5\20\t\2\u00b6\u00b5\3\2\2\2\u00b7"+
		"\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7\"\2\2\u00bc\r\3\2\2\2\u00bd\u00c0"+
		"\7\36\2\2\u00be\u00c0\5<\37\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2"+
		"\u00c0\17\3\2\2\2\u00c1\u00c5\5\30\r\2\u00c2\u00c4\7%\2\2\u00c3\u00c2"+
		"\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00d8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00cc\7#\2\2\u00c9\u00cb\7%\2"+
		"\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d3\5\30\r\2"+
		"\u00d0\u00d2\7%\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"\u00c8\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\21\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dd\5\24\13\2\u00dc"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00e1\3\2\2\2\u00e0\u00e2\5\66\34\2\u00e1\u00e0\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e5\5\66\34\2\u00e4\u00dc\3"+
		"\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e9\3\2\2\2\u00e6\u00e8\7%\2\2\u00e7"+
		"\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\23\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ee\7%\2\2\u00ed\u00ec"+
		"\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f7\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f8\5\26\f\2\u00f3\u00f8\5"+
		"\34\17\2\u00f4\u00f8\5\"\22\2\u00f5\u00f8\5&\24\2\u00f6\u00f8\5*\26\2"+
		"\u00f7\u00f2\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fc\3\2\2\2\u00f9\u00fb\7%\2\2\u00fa"+
		"\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd\25\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0103\5\30\r\2\u0100\u0102"+
		"\7%\2\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7$"+
		"\2\2\u0107\27\3\2\2\2\u0108\u010a\5<\37\2\u0109\u010b\7%\2\2\u010a\u0109"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u010f\7&\2\2\u010f\31\3\2\2\2\u0110\u0111\7&\2\2"+
		"\u0111\33\3\2\2\2\u0112\u0116\7\24\2\2\u0113\u0115\7%\2\2\u0114\u0113"+
		"\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011d\7!\2\2\u011a\u011c\7%\2"+
		"\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0124\7&\2\2\u0121"+
		"\u0123\7%\2\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127"+
		"\u0128\7\"\2\2\u0128\u012b\5\36\20\2\u0129\u012a\7\3\2\2\u012a\u012c\5"+
		" \21\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\35\3\2\2\2\u012d"+
		"\u012f\7%\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2"+
		"\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133"+
		"\u0135\7\37\2\2\u0134\u0136\5\24\13\2\u0135\u0134\3\2\2\2\u0136\u0137"+
		"\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013d\7 \2\2\u013a\u013c\7%\2\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2"+
		"\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\37\3\2\2\2\u013f\u013d"+
		"\3\2\2\2\u0140\u0142\7%\2\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143"+
		"\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0143\3\2"+
		"\2\2\u0146\u0148\7\37\2\2\u0147\u0149\5\24\13\2\u0148\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\u0150\7 \2\2\u014d\u014f\7%\2\2\u014e\u014d\3\2\2\2\u014f\u0152"+
		"\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151!\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0153\u0157\7&\2\2\u0154\u0156\7%\2\2\u0155\u0154\3\2\2"+
		"\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a"+
		"\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015e\7!\2\2\u015b\u015d\7%\2\2\u015c"+
		"\u015b\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015f\u0161\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\5$\23\2\u0162"+
		"\u0166\7\"\2\2\u0163\u0165\7%\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2"+
		"\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168"+
		"\u0166\3\2\2\2\u0169\u016a\7$\2\2\u016a#\3\2\2\2\u016b\u016f\5\32\16\2"+
		"\u016c\u016e\7%\2\2\u016d\u016c\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d"+
		"\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0182\3\2\2\2\u0171\u016f\3\2\2\2\u0172"+
		"\u0176\7#\2\2\u0173\u0175\7%\2\2\u0174\u0173\3\2\2\2\u0175\u0178\3\2\2"+
		"\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2\2\2\u0178\u0176"+
		"\3\2\2\2\u0179\u017d\5\32\16\2\u017a\u017c\7%\2\2\u017b\u017a\3\2\2\2"+
		"\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0181"+
		"\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0172\3\2\2\2\u0181\u0184\3\2\2\2\u0182"+
		"\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183%\3\2\2\2\u0184\u0182\3\2\2\2"+
		"\u0185\u0186\5(\25\2\u0186\u0187\5\64\33\2\u0187\'\3\2\2\2\u0188\u018c"+
		"\7\4\2\2\u0189\u018b\7%\2\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u018c\3\2"+
		"\2\2\u018f\u0190\7!\2\2\u0190\u0194\5\30\r\2\u0191\u0193\7%\2\2\u0192"+
		"\u0191\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2"+
		"\2\2\u0195\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u019b\7$\2\2\u0198"+
		"\u019a\7%\2\2\u0199\u0198\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2"+
		"\2\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u019b\3\2\2\2\u019e"+
		"\u01a2\5.\30\2\u019f\u01a1\7%\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a4\3\2"+
		"\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a5\u01a9\7$\2\2\u01a6\u01a8\7%\2\2\u01a7\u01a6\3\2\2"+
		"\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac"+
		"\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad\5\32\16\2\u01ad\u01b1\t\2\2\2"+
		"\u01ae\u01b0\7%\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af"+
		"\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4"+
		"\u01b5\7\"\2\2\u01b5)\3\2\2\2\u01b6\u01b7\5,\27\2\u01b7\u01b8\5\64\33"+
		"\2\u01b8+\3\2\2\2\u01b9\u01bd\7\7\2\2\u01ba\u01bc\7%\2\2\u01bb\u01ba\3"+
		"\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01c0\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c4\7!\2\2\u01c1\u01c3\7%\2"+
		"\2\u01c2\u01c1\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5"+
		"\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01cb\5\60\31\2"+
		"\u01c8\u01ca\7%\2\2\u01c9\u01c8\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9"+
		"\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce"+
		"\u01cf\7\"\2\2\u01cf-\3\2\2\2\u01d0\u01d4\5\32\16\2\u01d1\u01d3\7%\2\2"+
		"\u01d2\u01d1\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5"+
		"\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01db\5\62\32\2"+
		"\u01d8\u01da\7%\2\2\u01d9\u01d8\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9"+
		"\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01de\3\2\2\2\u01dd\u01db\3\2\2\2\u01de"+
		"\u01df\5\32\16\2\u01df/\3\2\2\2\u01e0\u01e4\5\32\16\2\u01e1\u01e3\7%\2"+
		"\2\u01e2\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5"+
		"\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01eb\5\62\32\2"+
		"\u01e8\u01ea\7%\2\2\u01e9\u01e8\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9"+
		"\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee"+
		"\u01ef\5\32\16\2\u01ef\61\3\2\2\2\u01f0\u01f1\t\3\2\2\u01f1\63\3\2\2\2"+
		"\u01f2\u01f4\7%\2\2\u01f3\u01f2\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3"+
		"\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8"+
		"\u01fa\7\37\2\2\u01f9\u01fb\5\24\13\2\u01fa\u01f9\3\2\2\2\u01fb\u01fc"+
		"\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u0202\7 \2\2\u01ff\u0201\7%\2\2\u0200\u01ff\3\2\2\2\u0201\u0204\3\2\2"+
		"\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\65\3\2\2\2\u0204\u0202"+
		"\3\2\2\2\u0205\u0207\7\33\2\2\u0206\u0208\7%\2\2\u0207\u0206\3\2\2\2\u0208"+
		"\u0209\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\3\2"+
		"\2\2\u020b\u020f\58\35\2\u020c\u020e\7%\2\2\u020d\u020c\3\2\2\2\u020e"+
		"\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0212\3\2"+
		"\2\2\u0211\u020f\3\2\2\2\u0212\u0213\7$\2\2\u0213\67\3\2\2\2\u0214\u0215"+
		"\t\4\2\2\u02159\3\2\2\2\u0216\u0217\t\5\2\2\u0217;\3\2\2\2\u0218\u021b"+
		"\5> \2\u0219\u021b\5@!\2\u021a\u0218\3\2\2\2\u021a\u0219\3\2\2\2\u021b"+
		"=\3\2\2\2\u021c\u021d\t\6\2\2\u021d?\3\2\2\2\u021e\u0223\7\27\2\2\u021f"+
		"\u0223\7\16\2\2\u0220\u0223\7\35\2\2\u0221\u0223\5B\"\2\u0222\u021e\3"+
		"\2\2\2\u0222\u021f\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0221\3\2\2\2\u0223"+
		"A\3\2\2\2\u0224\u0225\7&\2\2\u0225C\3\2\2\2IFHRX_fjqw}\177\u0085\u008c"+
		"\u0092\u0099\u00a0\u00a4\u00ab\u00b1\u00b8\u00bf\u00c5\u00cc\u00d3\u00d8"+
		"\u00de\u00e1\u00e4\u00e9\u00ef\u00f7\u00fc\u0103\u010c\u0116\u011d\u0124"+
		"\u012b\u0130\u0137\u013d\u0143\u014a\u0150\u0157\u015e\u0166\u016f\u0176"+
		"\u017d\u0182\u018c\u0194\u019b\u01a2\u01a9\u01b1\u01bd\u01c4\u01cb\u01d4"+
		"\u01db\u01e4\u01eb\u01f5\u01fc\u0202\u0209\u020f\u021a\u0222";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}