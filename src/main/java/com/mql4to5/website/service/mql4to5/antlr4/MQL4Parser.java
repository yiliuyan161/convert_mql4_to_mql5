// Generated from antlr4\MQL4.g4 by ANTLR 4.8

package com.mql4to5.website.service.mql4to5.antlr4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MQL4Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, MultiLineMacro=7, Directive=8, 
		Alignas=9, Alignof=10, Asm=11, Auto=12, Bool=13, Break=14, Case=15, Catch=16, 
		Char=17, Char16=18, Char32=19, Class=20, Color=21, Const=22, Constexpr=23, 
		Const_cast=24, Continue=25, Datetime=26, Decltype=27, Default=28, Delete=29, 
		Do=30, Double=31, Dynamic_cast=32, Else=33, Enum=34, Explicit=35, Export=36, 
		Extern=37, False=38, Final=39, Float=40, For=41, Friend=42, Goto=43, If=44, 
		Inline=45, Int=46, Long=47, Mutable=48, Namespace=49, New=50, Noexcept=51, 
		Nullptr=52, Operator=53, Override=54, Private=55, Protected=56, Public=57, 
		Register=58, Reinterpret_cast=59, Return=60, Short=61, Signed=62, Sizeof=63, 
		Static=64, Static_assert=65, Static_cast=66, Struct=67, Switch=68, Template=69, 
		This=70, Thread_local=71, Throw=72, True=73, Try=74, Typedef=75, Typeid_=76, 
		Typename_=77, Uchar=78, Union=79, Unshort=80, Uint=81, Ulong=82, Unsigned=83, 
		Using=84, Virtual=85, Void=86, Volatile=87, Wchar=88, While=89, LeftParen=90, 
		RightParen=91, LeftBracket=92, RightBracket=93, LeftBrace=94, RightBrace=95, 
		Plus=96, Minus=97, Star=98, Div=99, Mod=100, Caret=101, And=102, Or=103, 
		Tilde=104, Not=105, Assign=106, Less=107, Greater=108, PlusAssign=109, 
		MinusAssign=110, StarAssign=111, DivAssign=112, ModAssign=113, XorAssign=114, 
		AndAssign=115, OrAssign=116, LeftShift=117, RightShift=118, LeftShiftAssign=119, 
		RightShiftAssign=120, Equal=121, NotEqual=122, LessEqual=123, GreaterEqual=124, 
		AndAnd=125, OrOr=126, PlusPlus=127, MinusMinus=128, Comma=129, ArrowStar=130, 
		Arrow=131, Question=132, Colon=133, Doublecolon=134, Semi=135, Dot=136, 
		DotStar=137, Ellipsis=138, Identifier=139, Integerliteral=140, Decimalliteral=141, 
		Octalliteral=142, ColorLiteral=143, DatetimeLiteral=144, Hexadecimalliteral=145, 
		Binaryliteral=146, Integersuffix=147, Characterliteral=148, Floatingliteral=149, 
		Stringliteral=150, Userdefinedintegerliteral=151, Userdefinedfloatingliteral=152, 
		Userdefinedstringliteral=153, Userdefinedcharacterliteral=154, Whitespace=155, 
		Newline=156, BlockComment=157, LineComment=158;
	public static final int
		RULE_translationunit = 0, RULE_primaryexpression = 1, RULE_idexpression = 2, 
		RULE_unqualifiedid = 3, RULE_qualifiedid = 4, RULE_nestednamespecifier = 5, 
		RULE_lambdaexpression = 6, RULE_lambdaintroducer = 7, RULE_lambdacapture = 8, 
		RULE_capturedefault = 9, RULE_capturelist = 10, RULE_capture = 11, RULE_simplecapture = 12, 
		RULE_initcapture = 13, RULE_lambdadeclarator = 14, RULE_postfixexpression = 15, 
		RULE_typeidofexpr = 16, RULE_typeidofthetypeid = 17, RULE_expressionlist = 18, 
		RULE_pseudodestructorname = 19, RULE_unaryexpression = 20, RULE_unaryoperator = 21, 
		RULE_newexpression = 22, RULE_newplacement = 23, RULE_newtypeid = 24, 
		RULE_newdeclarator = 25, RULE_noptrnewdeclarator = 26, RULE_newinitializer = 27, 
		RULE_deleteexpression = 28, RULE_noexceptexpression = 29, RULE_castexpression = 30, 
		RULE_pmexpression = 31, RULE_multiplicativeexpression = 32, RULE_additiveexpression = 33, 
		RULE_shiftexpression = 34, RULE_shiftoperator = 35, RULE_relationalexpression = 36, 
		RULE_equalityexpression = 37, RULE_andexpression = 38, RULE_exclusiveorexpression = 39, 
		RULE_inclusiveorexpression = 40, RULE_logicalandexpression = 41, RULE_logicalorexpression = 42, 
		RULE_conditionalexpression = 43, RULE_assignmentexpression = 44, RULE_assignmentoperator = 45, 
		RULE_expression = 46, RULE_constantexpression = 47, RULE_statement = 48, 
		RULE_labeledstatement = 49, RULE_expressionstatement = 50, RULE_compoundstatement = 51, 
		RULE_statementseq = 52, RULE_selectionstatement = 53, RULE_condition = 54, 
		RULE_iterationstatement = 55, RULE_forinitstatement = 56, RULE_forrangedeclaration = 57, 
		RULE_forrangeinitializer = 58, RULE_jumpstatement = 59, RULE_declarationstatement = 60, 
		RULE_declarationseq = 61, RULE_declaration = 62, RULE_blockdeclaration = 63, 
		RULE_aliasdeclaration = 64, RULE_simpledeclaration = 65, RULE_static_assertdeclaration = 66, 
		RULE_emptydeclaration = 67, RULE_attributedeclaration = 68, RULE_declspecifier = 69, 
		RULE_declspecifierseq = 70, RULE_storageclassspecifier = 71, RULE_functionspecifier = 72, 
		RULE_typedefname = 73, RULE_typespecifier = 74, RULE_trailingtypespecifier = 75, 
		RULE_typespecifierseq = 76, RULE_trailingtypespecifierseq = 77, RULE_simpletypespecifier = 78, 
		RULE_thetypename = 79, RULE_decltypespecifier = 80, RULE_elaboratedtypespecifier = 81, 
		RULE_enumname = 82, RULE_enumspecifier = 83, RULE_enumhead = 84, RULE_opaqueenumdeclaration = 85, 
		RULE_enumkey = 86, RULE_enumbase = 87, RULE_enumeratorlist = 88, RULE_enumeratordefinition = 89, 
		RULE_enumerator = 90, RULE_namespacename = 91, RULE_originalnamespacename = 92, 
		RULE_namespacedefinition = 93, RULE_namednamespacedefinition = 94, RULE_originalnamespacedefinition = 95, 
		RULE_extensionnamespacedefinition = 96, RULE_unnamednamespacedefinition = 97, 
		RULE_namespacebody = 98, RULE_namespacealias = 99, RULE_namespacealiasdefinition = 100, 
		RULE_qualifiednamespacespecifier = 101, RULE_usingdeclaration = 102, RULE_usingdirective = 103, 
		RULE_asmdefinition = 104, RULE_linkagespecification = 105, RULE_attributespecifierseq = 106, 
		RULE_attributespecifier = 107, RULE_alignmentspecifier = 108, RULE_attributelist = 109, 
		RULE_attribute = 110, RULE_attributetoken = 111, RULE_attributescopedtoken = 112, 
		RULE_attributenamespace = 113, RULE_attributeargumentclause = 114, RULE_balancedtokenseq = 115, 
		RULE_balancedtoken = 116, RULE_initdeclaratorlist = 117, RULE_initdeclarator = 118, 
		RULE_declarator = 119, RULE_ptrdeclarator = 120, RULE_noptrdeclarator = 121, 
		RULE_parametersandqualifiers = 122, RULE_trailingreturntype = 123, RULE_ptroperator = 124, 
		RULE_cvqualifierseq = 125, RULE_cvqualifier = 126, RULE_refqualifier = 127, 
		RULE_declaratorid = 128, RULE_thetypeid = 129, RULE_abstractdeclarator = 130, 
		RULE_ptrabstractdeclarator = 131, RULE_noptrabstractdeclarator = 132, 
		RULE_abstractpackdeclarator = 133, RULE_noptrabstractpackdeclarator = 134, 
		RULE_parameterdeclarationclause = 135, RULE_parameterdeclarationlist = 136, 
		RULE_parameterdeclaration = 137, RULE_functiondefinition = 138, RULE_functionbody = 139, 
		RULE_initializer = 140, RULE_braceorequalinitializer = 141, RULE_initializerclause = 142, 
		RULE_initializerlist = 143, RULE_bracedinitlist = 144, RULE_classname = 145, 
		RULE_classspecifier = 146, RULE_classhead = 147, RULE_classheadname = 148, 
		RULE_classvirtspecifier = 149, RULE_classkey = 150, RULE_memberspecification = 151, 
		RULE_memberdeclaration = 152, RULE_memberdeclaratorlist = 153, RULE_memberdeclarator = 154, 
		RULE_virtspecifierseq = 155, RULE_virtspecifier = 156, RULE_purespecifier = 157, 
		RULE_baseclause = 158, RULE_basespecifierlist = 159, RULE_basespecifier = 160, 
		RULE_classordecltype = 161, RULE_basetypespecifier = 162, RULE_accessspecifier = 163, 
		RULE_conversionfunctionid = 164, RULE_conversiontypeid = 165, RULE_conversiondeclarator = 166, 
		RULE_ctorinitializer = 167, RULE_meminitializerlist = 168, RULE_meminitializer = 169, 
		RULE_meminitializerid = 170, RULE_operatorfunctionid = 171, RULE_literaloperatorid = 172, 
		RULE_templatedeclaration = 173, RULE_templateparameterlist = 174, RULE_templateparameter = 175, 
		RULE_typeparameter = 176, RULE_simpletemplateid = 177, RULE_templateid = 178, 
		RULE_templatename = 179, RULE_templateargumentlist = 180, RULE_templateargument = 181, 
		RULE_typenamespecifier = 182, RULE_explicitinstantiation = 183, RULE_explicitspecialization = 184, 
		RULE_tryblock = 185, RULE_functiontryblock = 186, RULE_handlerseq = 187, 
		RULE_handler = 188, RULE_exceptiondeclaration = 189, RULE_throwexpression = 190, 
		RULE_exceptionspecification = 191, RULE_dynamicexceptionspecification = 192, 
		RULE_typeidlist = 193, RULE_noexceptspecification = 194, RULE_theoperator = 195, 
		RULE_literal = 196, RULE_booleanliteral = 197, RULE_pointerliteral = 198, 
		RULE_userdefinedliteral = 199;
	private static String[] makeRuleNames() {
		return new String[] {
			"translationunit", "primaryexpression", "idexpression", "unqualifiedid", 
			"qualifiedid", "nestednamespecifier", "lambdaexpression", "lambdaintroducer", 
			"lambdacapture", "capturedefault", "capturelist", "capture", "simplecapture", 
			"initcapture", "lambdadeclarator", "postfixexpression", "typeidofexpr", 
			"typeidofthetypeid", "expressionlist", "pseudodestructorname", "unaryexpression", 
			"unaryoperator", "newexpression", "newplacement", "newtypeid", "newdeclarator", 
			"noptrnewdeclarator", "newinitializer", "deleteexpression", "noexceptexpression", 
			"castexpression", "pmexpression", "multiplicativeexpression", "additiveexpression", 
			"shiftexpression", "shiftoperator", "relationalexpression", "equalityexpression", 
			"andexpression", "exclusiveorexpression", "inclusiveorexpression", "logicalandexpression", 
			"logicalorexpression", "conditionalexpression", "assignmentexpression", 
			"assignmentoperator", "expression", "constantexpression", "statement", 
			"labeledstatement", "expressionstatement", "compoundstatement", "statementseq", 
			"selectionstatement", "condition", "iterationstatement", "forinitstatement", 
			"forrangedeclaration", "forrangeinitializer", "jumpstatement", "declarationstatement", 
			"declarationseq", "declaration", "blockdeclaration", "aliasdeclaration", 
			"simpledeclaration", "static_assertdeclaration", "emptydeclaration", 
			"attributedeclaration", "declspecifier", "declspecifierseq", "storageclassspecifier", 
			"functionspecifier", "typedefname", "typespecifier", "trailingtypespecifier", 
			"typespecifierseq", "trailingtypespecifierseq", "simpletypespecifier", 
			"thetypename", "decltypespecifier", "elaboratedtypespecifier", "enumname", 
			"enumspecifier", "enumhead", "opaqueenumdeclaration", "enumkey", "enumbase", 
			"enumeratorlist", "enumeratordefinition", "enumerator", "namespacename", 
			"originalnamespacename", "namespacedefinition", "namednamespacedefinition", 
			"originalnamespacedefinition", "extensionnamespacedefinition", "unnamednamespacedefinition", 
			"namespacebody", "namespacealias", "namespacealiasdefinition", "qualifiednamespacespecifier", 
			"usingdeclaration", "usingdirective", "asmdefinition", "linkagespecification", 
			"attributespecifierseq", "attributespecifier", "alignmentspecifier", 
			"attributelist", "attribute", "attributetoken", "attributescopedtoken", 
			"attributenamespace", "attributeargumentclause", "balancedtokenseq", 
			"balancedtoken", "initdeclaratorlist", "initdeclarator", "declarator", 
			"ptrdeclarator", "noptrdeclarator", "parametersandqualifiers", "trailingreturntype", 
			"ptroperator", "cvqualifierseq", "cvqualifier", "refqualifier", "declaratorid", 
			"thetypeid", "abstractdeclarator", "ptrabstractdeclarator", "noptrabstractdeclarator", 
			"abstractpackdeclarator", "noptrabstractpackdeclarator", "parameterdeclarationclause", 
			"parameterdeclarationlist", "parameterdeclaration", "functiondefinition", 
			"functionbody", "initializer", "braceorequalinitializer", "initializerclause", 
			"initializerlist", "bracedinitlist", "classname", "classspecifier", "classhead", 
			"classheadname", "classvirtspecifier", "classkey", "memberspecification", 
			"memberdeclaration", "memberdeclaratorlist", "memberdeclarator", "virtspecifierseq", 
			"virtspecifier", "purespecifier", "baseclause", "basespecifierlist", 
			"basespecifier", "classordecltype", "basetypespecifier", "accessspecifier", 
			"conversionfunctionid", "conversiontypeid", "conversiondeclarator", "ctorinitializer", 
			"meminitializerlist", "meminitializer", "meminitializerid", "operatorfunctionid", 
			"literaloperatorid", "templatedeclaration", "templateparameterlist", 
			"templateparameter", "typeparameter", "simpletemplateid", "templateid", 
			"templatename", "templateargumentlist", "templateargument", "typenamespecifier", 
			"explicitinstantiation", "explicitspecialization", "tryblock", "functiontryblock", 
			"handlerseq", "handler", "exceptiondeclaration", "throwexpression", "exceptionspecification", 
			"dynamicexceptionspecification", "typeidlist", "noexceptspecification", 
			"theoperator", "literal", "booleanliteral", "pointerliteral", "userdefinedliteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "'not'", "'&&'", "'and'", "'||'", "'or'", null, null, "'alignas'", 
			"'alignof'", "'asm'", "'auto'", "'bool'", "'break'", "'case'", "'catch'", 
			"'char'", "'char16_t'", "'char32_t'", "'class'", "'color'", "'const'", 
			"'constexpr'", "'const_cast'", "'continue'", "'datetime'", "'decltype'", 
			"'default'", "'delete'", "'do'", "'double'", "'dynamic_cast'", "'else'", 
			"'enum'", "'explicit'", "'export'", "'extern'", "'false'", "'final'", 
			"'float'", "'for'", "'friend'", "'goto'", "'if'", "'inline'", "'int'", 
			"'long'", "'mutable'", "'namespace'", "'new'", "'noexcept'", "'nullptr'", 
			"'operator'", "'override'", "'private'", "'protected'", "'public'", "'register'", 
			"'reinterpret_cast'", "'return'", "'short'", "'signed'", "'sizeof'", 
			"'static'", "'static_assert'", "'static_cast'", "'struct'", "'switch'", 
			"'template'", "'this'", "'thread_local'", "'throw'", "'true'", "'try'", 
			"'typedef'", "'typeid'", "'typename'", "'uchar'", "'union'", "'ushort'", 
			"'uint'", "'ulong'", "'unsigned'", "'using'", "'virtual'", "'void'", 
			"'volatile'", "'wchar_t'", "'while'", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'&'", "'|'", "'~'", 
			null, "'='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", 
			"'&='", "'|='", "'<<'", "'>>'", "'<<='", "'>>='", "'=='", "'!='", "'<='", 
			"'>='", null, null, "'++'", "'--'", "','", "'->*'", "'->'", "'?'", "':'", 
			"'::'", "';'", "'.'", "'.*'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "MultiLineMacro", "Directive", 
			"Alignas", "Alignof", "Asm", "Auto", "Bool", "Break", "Case", "Catch", 
			"Char", "Char16", "Char32", "Class", "Color", "Const", "Constexpr", "Const_cast", 
			"Continue", "Datetime", "Decltype", "Default", "Delete", "Do", "Double", 
			"Dynamic_cast", "Else", "Enum", "Explicit", "Export", "Extern", "False", 
			"Final", "Float", "For", "Friend", "Goto", "If", "Inline", "Int", "Long", 
			"Mutable", "Namespace", "New", "Noexcept", "Nullptr", "Operator", "Override", 
			"Private", "Protected", "Public", "Register", "Reinterpret_cast", "Return", 
			"Short", "Signed", "Sizeof", "Static", "Static_assert", "Static_cast", 
			"Struct", "Switch", "Template", "This", "Thread_local", "Throw", "True", 
			"Try", "Typedef", "Typeid_", "Typename_", "Uchar", "Union", "Unshort", 
			"Uint", "Ulong", "Unsigned", "Using", "Virtual", "Void", "Volatile", 
			"Wchar", "While", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "Plus", "Minus", "Star", "Div", "Mod", "Caret", 
			"And", "Or", "Tilde", "Not", "Assign", "Less", "Greater", "PlusAssign", 
			"MinusAssign", "StarAssign", "DivAssign", "ModAssign", "XorAssign", "AndAssign", 
			"OrAssign", "LeftShift", "RightShift", "LeftShiftAssign", "RightShiftAssign", 
			"Equal", "NotEqual", "LessEqual", "GreaterEqual", "AndAnd", "OrOr", "PlusPlus", 
			"MinusMinus", "Comma", "ArrowStar", "Arrow", "Question", "Colon", "Doublecolon", 
			"Semi", "Dot", "DotStar", "Ellipsis", "Identifier", "Integerliteral", 
			"Decimalliteral", "Octalliteral", "ColorLiteral", "DatetimeLiteral", 
			"Hexadecimalliteral", "Binaryliteral", "Integersuffix", "Characterliteral", 
			"Floatingliteral", "Stringliteral", "Userdefinedintegerliteral", "Userdefinedfloatingliteral", 
			"Userdefinedstringliteral", "Userdefinedcharacterliteral", "Whitespace", 
			"Newline", "BlockComment", "LineComment"
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
	public String getGrammarFileName() { return "MQL4.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MQL4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TranslationunitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MQL4Parser.EOF, 0); }
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public TranslationunitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationunit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterTranslationunit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitTranslationunit(this);
		}
	}

	public final TranslationunitContext translationunit() throws RecognitionException {
		TranslationunitContext _localctx = new TranslationunitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationunit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Color) | (1L << Const) | (1L << Constexpr) | (1L << Datetime) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Struct - 64)) | (1L << (Template - 64)) | (1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename_ - 64)) | (1L << (Uchar - 64)) | (1L << (Union - 64)) | (1L << (Unshort - 64)) | (1L << (Ulong - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (Doublecolon - 134)) | (1L << (Semi - 134)) | (1L << (Ellipsis - 134)) | (1L << (Identifier - 134)))) != 0)) {
				{
				setState(400);
				declarationseq(0);
				}
			}

			setState(403);
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

	public static class PrimaryexpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode This() { return getToken(MQL4Parser.This, 0); }
		public TerminalNode LeftParen() { return getToken(MQL4Parser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MQL4Parser.RightParen, 0); }
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public LambdaexpressionContext lambdaexpression() {
			return getRuleContext(LambdaexpressionContext.class,0);
		}
		public PrimaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterPrimaryexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitPrimaryexpression(this);
		}
	}

	public final PrimaryexpressionContext primaryexpression() throws RecognitionException {
		PrimaryexpressionContext _localctx = new PrimaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primaryexpression);
		try {
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case False:
			case Nullptr:
			case True:
			case Integerliteral:
			case ColorLiteral:
			case DatetimeLiteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				literal();
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				match(This);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				match(LeftParen);
				setState(408);
				expression(0);
				setState(409);
				match(RightParen);
				}
				break;
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(411);
				idexpression();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(412);
				lambdaexpression();
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

	public static class IdexpressionContext extends ParserRuleContext {
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public QualifiedidContext qualifiedid() {
			return getRuleContext(QualifiedidContext.class,0);
		}
		public IdexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterIdexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitIdexpression(this);
		}
	}

	public final IdexpressionContext idexpression() throws RecognitionException {
		IdexpressionContext _localctx = new IdexpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_idexpression);
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				unqualifiedid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				qualifiedid();
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

	public static class UnqualifiedidContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MQL4Parser.Identifier, 0); }
		public OperatorfunctionidContext operatorfunctionid() {
			return getRuleContext(OperatorfunctionidContext.class,0);
		}
		public ConversionfunctionidContext conversionfunctionid() {
			return getRuleContext(ConversionfunctionidContext.class,0);
		}
		public LiteraloperatoridContext literaloperatorid() {
			return getRuleContext(LiteraloperatoridContext.class,0);
		}
		public TerminalNode Tilde() { return getToken(MQL4Parser.Tilde, 0); }
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public TemplateidContext templateid() {
			return getRuleContext(TemplateidContext.class,0);
		}
		public UnqualifiedidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterUnqualifiedid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitUnqualifiedid(this);
		}
	}

	public final UnqualifiedidContext unqualifiedid() throws RecognitionException {
		UnqualifiedidContext _localctx = new UnqualifiedidContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unqualifiedid);
		try {
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				operatorfunctionid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				conversionfunctionid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(422);
				literaloperatorid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(423);
				match(Tilde);
				setState(424);
				classname();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(425);
				match(Tilde);
				setState(426);
				decltypespecifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(427);
				templateid();
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

	public static class QualifiedidContext extends ParserRuleContext {
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public TerminalNode Template() { return getToken(MQL4Parser.Template, 0); }
		public QualifiedidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterQualifiedid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitQualifiedid(this);
		}
	}

	public final QualifiedidContext qualifiedid() throws RecognitionException {
		QualifiedidContext _localctx = new QualifiedidContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_qualifiedid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			nestednamespecifier(0);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Template) {
				{
				setState(431);
				match(Template);
				}
			}

			setState(434);
			unqualifiedid();
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

	public static class NestednamespecifierContext extends ParserRuleContext {
		public TerminalNode Doublecolon() { return getToken(MQL4Parser.Doublecolon, 0); }
		public ThetypenameContext thetypename() {
			return getRuleContext(ThetypenameContext.class,0);
		}
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MQL4Parser.Identifier, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Template() { return getToken(MQL4Parser.Template, 0); }
		public NestednamespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestednamespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterNestednamespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitNestednamespecifier(this);
		}
	}

	public final NestednamespecifierContext nestednamespecifier() throws RecognitionException {
		return nestednamespecifier(0);
	}

	private NestednamespecifierContext nestednamespecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NestednamespecifierContext _localctx = new NestednamespecifierContext(_ctx, _parentState);
		NestednamespecifierContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_nestednamespecifier, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(437);
				match(Doublecolon);
				}
				break;
			case 2:
				{
				setState(438);
				thetypename();
				setState(439);
				match(Doublecolon);
				}
				break;
			case 3:
				{
				setState(441);
				namespacename();
				setState(442);
				match(Doublecolon);
				}
				break;
			case 4:
				{
				setState(444);
				decltypespecifier();
				setState(445);
				match(Doublecolon);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(461);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(459);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(449);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(450);
						match(Identifier);
						setState(451);
						match(Doublecolon);
						}
						break;
					case 2:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(452);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(454);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(453);
							match(Template);
							}
						}

						setState(456);
						simpletemplateid();
						setState(457);
						match(Doublecolon);
						}
						break;
					}
					} 
				}
				setState(463);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LambdaexpressionContext extends ParserRuleContext {
		public LambdaintroducerContext lambdaintroducer() {
			return getRuleContext(LambdaintroducerContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public LambdadeclaratorContext lambdadeclarator() {
			return getRuleContext(LambdadeclaratorContext.class,0);
		}
		public LambdaexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterLambdaexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitLambdaexpression(this);
		}
	}

	public final LambdaexpressionContext lambdaexpression() throws RecognitionException {
		LambdaexpressionContext _localctx = new LambdaexpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lambdaexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			lambdaintroducer();
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(465);
				lambdadeclarator();
				}
			}

			setState(468);
			compoundstatement();
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

	public static class LambdaintroducerContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(MQL4Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(MQL4Parser.RightBracket, 0); }
		public LambdacaptureContext lambdacapture() {
			return getRuleContext(LambdacaptureContext.class,0);
		}
		public LambdaintroducerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaintroducer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterLambdaintroducer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitLambdaintroducer(this);
		}
	}

	public final LambdaintroducerContext lambdaintroducer() throws RecognitionException {
		LambdaintroducerContext _localctx = new LambdaintroducerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lambdaintroducer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(LeftBracket);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (This - 70)) | (1L << (And - 70)) | (1L << (Assign - 70)))) != 0) || _la==Identifier) {
				{
				setState(471);
				lambdacapture();
				}
			}

			setState(474);
			match(RightBracket);
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

	public static class LambdacaptureContext extends ParserRuleContext {
		public CapturedefaultContext capturedefault() {
			return getRuleContext(CapturedefaultContext.class,0);
		}
		public CapturelistContext capturelist() {
			return getRuleContext(CapturelistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MQL4Parser.Comma, 0); }
		public LambdacaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdacapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterLambdacapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitLambdacapture(this);
		}
	}

	public final LambdacaptureContext lambdacapture() throws RecognitionException {
		LambdacaptureContext _localctx = new LambdacaptureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lambdacapture);
		try {
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				capturedefault();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				capturelist(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				capturedefault();
				setState(479);
				match(Comma);
				setState(480);
				capturelist(0);
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

	public static class CapturedefaultContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(MQL4Parser.And, 0); }
		public TerminalNode Assign() { return getToken(MQL4Parser.Assign, 0); }
		public CapturedefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capturedefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterCapturedefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitCapturedefault(this);
		}
	}

	public final CapturedefaultContext capturedefault() throws RecognitionException {
		CapturedefaultContext _localctx = new CapturedefaultContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_capturedefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			_la = _input.LA(1);
			if ( !(_la==And || _la==Assign) ) {
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

	public static class CapturelistContext extends ParserRuleContext {
		public CaptureContext capture() {
			return getRuleContext(CaptureContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(MQL4Parser.Ellipsis, 0); }
		public CapturelistContext capturelist() {
			return getRuleContext(CapturelistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MQL4Parser.Comma, 0); }
		public CapturelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capturelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterCapturelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitCapturelist(this);
		}
	}

	public final CapturelistContext capturelist() throws RecognitionException {
		return capturelist(0);
	}

	private CapturelistContext capturelist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CapturelistContext _localctx = new CapturelistContext(_ctx, _parentState);
		CapturelistContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_capturelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(487);
			capture();
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(488);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(499);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CapturelistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_capturelist);
					setState(491);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(492);
					match(Comma);
					setState(493);
					capture();
					setState(495);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(494);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(501);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CaptureContext extends ParserRuleContext {
		public SimplecaptureContext simplecapture() {
			return getRuleContext(SimplecaptureContext.class,0);
		}
		public InitcaptureContext initcapture() {
			return getRuleContext(InitcaptureContext.class,0);
		}
		public CaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitCapture(this);
		}
	}

	public final CaptureContext capture() throws RecognitionException {
		CaptureContext _localctx = new CaptureContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_capture);
		try {
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				simplecapture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				initcapture();
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

	public static class SimplecaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MQL4Parser.Identifier, 0); }
		public TerminalNode And() { return getToken(MQL4Parser.And, 0); }
		public TerminalNode This() { return getToken(MQL4Parser.This, 0); }
		public SimplecaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplecapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterSimplecapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitSimplecapture(this);
		}
	}

	public final SimplecaptureContext simplecapture() throws RecognitionException {
		SimplecaptureContext _localctx = new SimplecaptureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simplecapture);
		try {
			setState(510);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				match(Identifier);
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				match(And);
				setState(508);
				match(Identifier);
				}
				break;
			case This:
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
				match(This);
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

	public static class InitcaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MQL4Parser.Identifier, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public TerminalNode And() { return getToken(MQL4Parser.And, 0); }
		public InitcaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initcapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterInitcapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitInitcapture(this);
		}
	}

	public final InitcaptureContext initcapture() throws RecognitionException {
		InitcaptureContext _localctx = new InitcaptureContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_initcapture);
		try {
			setState(517);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				match(Identifier);
				setState(513);
				initializer();
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				match(And);
				setState(515);
				match(Identifier);
				setState(516);
				initializer();
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

	public static class LambdadeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(MQL4Parser.LeftParen, 0); }
		public ParameterdeclarationclauseContext parameterdeclarationclause() {
			return getRuleContext(ParameterdeclarationclauseContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MQL4Parser.RightParen, 0); }
		public TerminalNode Mutable() { return getToken(MQL4Parser.Mutable, 0); }
		public ExceptionspecificationContext exceptionspecification() {
			return getRuleContext(ExceptionspecificationContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public LambdadeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdadeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterLambdadeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitLambdadeclarator(this);
		}
	}

	public final LambdadeclaratorContext lambdadeclarator() throws RecognitionException {
		LambdadeclaratorContext _localctx = new LambdadeclaratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lambdadeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(LeftParen);
			setState(520);
			parameterdeclarationclause();
			setState(521);
			match(RightParen);
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Mutable) {
				{
				setState(522);
				match(Mutable);
				}
			}

			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Noexcept || _la==Throw) {
				{
				setState(525);
				exceptionspecification();
				}
			}

			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(528);
				attributespecifierseq(0);
				}
			}

			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
				setState(531);
				trailingreturntype();
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

	public static class PostfixexpressionContext extends ParserRuleContext {
		public PostfixexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixexpression; }
	 
		public PostfixexpressionContext() { }
		public void copyFrom(PostfixexpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PExpressionContext extends PostfixexpressionContext {
		public PrimaryexpressionContext primaryexpression() {
			return getRuleContext(PrimaryexpressionContext.class,0);
		}
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public TypenamespecifierContext typenamespecifier() {
			return getRuleContext(TypenamespecifierContext.class,0);
		}
		public TerminalNode Dynamic_cast() { return getToken(MQL4Parser.Dynamic_cast, 0); }
		public TerminalNode Less() { return getToken(MQL4Parser.Less, 0); }
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public TerminalNode Greater() { return getToken(MQL4Parser.Greater, 0); }
		public TerminalNode LeftParen() { return getToken(MQL4Parser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MQL4Parser.RightParen, 0); }
		public TerminalNode Static_cast() { return getToken(MQL4Parser.Static_cast, 0); }
		public TerminalNode Reinterpret_cast() { return getToken(MQL4Parser.Reinterpret_cast, 0); }
		public TerminalNode Const_cast() { return getToken(MQL4Parser.Const_cast, 0); }
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(MQL4Parser.Dot, 0); }
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TerminalNode Template() { return getToken(MQL4Parser.Template, 0); }
		public TerminalNode Arrow() { return getToken(MQL4Parser.Arrow, 0); }
		public PseudodestructornameContext pseudodestructorname() {
			return getRuleContext(PseudodestructornameContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(MQL4Parser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(MQL4Parser.MinusMinus, 0); }
		public PExpressionContext(PostfixexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterPExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitPExpression(this);
		}
	}
	public static class FunctionCallContext extends PostfixexpressionContext {
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(MQL4Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(MQL4Parser.RightParen, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public TypenamespecifierContext typenamespecifier() {
			return getRuleContext(TypenamespecifierContext.class,0);
		}
		public TypeidofthetypeidContext typeidofthetypeid() {
			return getRuleContext(TypeidofthetypeidContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public FunctionCallContext(PostfixexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitFunctionCall(this);
		}
	}
	public static class ArrayCallContext extends PostfixexpressionContext {
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(MQL4Parser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(MQL4Parser.RightBracket, 0); }
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public ArrayCallContext(PostfixexpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterArrayCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitArrayCall(this);
		}
	}

	public final PostfixexpressionContext postfixexpression() throws RecognitionException {
		return postfixexpression(0);
	}

	private PostfixexpressionContext postfixexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixexpressionContext _localctx = new PostfixexpressionContext(_ctx, _parentState);
		PostfixexpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_postfixexpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new PExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(535);
				primaryexpression();
				}
				break;
			case 2:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(536);
				simpletypespecifier();
				setState(537);
				match(LeftParen);
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Color) | (1L << Const_cast) | (1L << Datetime) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Uchar - 66)) | (1L << (Unshort - 66)) | (1L << (Ulong - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (Doublecolon - 134)) | (1L << (Identifier - 134)) | (1L << (Integerliteral - 134)) | (1L << (ColorLiteral - 134)) | (1L << (DatetimeLiteral - 134)) | (1L << (Characterliteral - 134)) | (1L << (Floatingliteral - 134)) | (1L << (Stringliteral - 134)) | (1L << (Userdefinedintegerliteral - 134)) | (1L << (Userdefinedfloatingliteral - 134)) | (1L << (Userdefinedstringliteral - 134)) | (1L << (Userdefinedcharacterliteral - 134)))) != 0)) {
					{
					setState(538);
					expressionlist();
					}
				}

				setState(541);
				match(RightParen);
				}
				break;
			case 3:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(543);
				typenamespecifier();
				setState(544);
				match(LeftParen);
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Color) | (1L << Const_cast) | (1L << Datetime) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Uchar - 66)) | (1L << (Unshort - 66)) | (1L << (Ulong - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (Doublecolon - 134)) | (1L << (Identifier - 134)) | (1L << (Integerliteral - 134)) | (1L << (ColorLiteral - 134)) | (1L << (DatetimeLiteral - 134)) | (1L << (Characterliteral - 134)) | (1L << (Floatingliteral - 134)) | (1L << (Stringliteral - 134)) | (1L << (Userdefinedintegerliteral - 134)) | (1L << (Userdefinedfloatingliteral - 134)) | (1L << (Userdefinedstringliteral - 134)) | (1L << (Userdefinedcharacterliteral - 134)))) != 0)) {
					{
					setState(545);
					expressionlist();
					}
				}

				setState(548);
				match(RightParen);
				}
				break;
			case 4:
				{
				_localctx = new PExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(550);
				simpletypespecifier();
				setState(551);
				bracedinitlist();
				}
				break;
			case 5:
				{
				_localctx = new PExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(553);
				typenamespecifier();
				setState(554);
				bracedinitlist();
				}
				break;
			case 6:
				{
				_localctx = new PExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(556);
				match(Dynamic_cast);
				setState(557);
				match(Less);
				setState(558);
				thetypeid();
				setState(559);
				match(Greater);
				setState(560);
				match(LeftParen);
				setState(561);
				expression(0);
				setState(562);
				match(RightParen);
				}
				break;
			case 7:
				{
				_localctx = new PExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(564);
				match(Static_cast);
				setState(565);
				match(Less);
				setState(566);
				thetypeid();
				setState(567);
				match(Greater);
				setState(568);
				match(LeftParen);
				setState(569);
				expression(0);
				setState(570);
				match(RightParen);
				}
				break;
			case 8:
				{
				_localctx = new PExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(572);
				match(Reinterpret_cast);
				setState(573);
				match(Less);
				setState(574);
				thetypeid();
				setState(575);
				match(Greater);
				setState(576);
				match(LeftParen);
				setState(577);
				expression(0);
				setState(578);
				match(RightParen);
				}
				break;
			case 9:
				{
				_localctx = new PExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(580);
				match(Const_cast);
				setState(581);
				match(Less);
				setState(582);
				thetypeid();
				setState(583);
				match(Greater);
				setState(584);
				match(LeftParen);
				setState(585);
				expression(0);
				setState(586);
				match(RightParen);
				}
				break;
			case 10:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(588);
				typeidofthetypeid();
				setState(589);
				match(LeftParen);
				setState(590);
				expression(0);
				setState(591);
				match(RightParen);
				}
				break;
			case 11:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(593);
				typeidofthetypeid();
				setState(594);
				match(LeftParen);
				setState(595);
				thetypeid();
				setState(596);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(640);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(638);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayCallContext(new PostfixexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(600);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(601);
						match(LeftBracket);
						setState(602);
						expression(0);
						setState(603);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new ArrayCallContext(new PostfixexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(605);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(606);
						match(LeftBracket);
						setState(607);
						bracedinitlist();
						setState(608);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new FunctionCallContext(new PostfixexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(610);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(611);
						match(LeftParen);
						setState(613);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Color) | (1L << Const_cast) | (1L << Datetime) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Uchar - 66)) | (1L << (Unshort - 66)) | (1L << (Ulong - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (Doublecolon - 134)) | (1L << (Identifier - 134)) | (1L << (Integerliteral - 134)) | (1L << (ColorLiteral - 134)) | (1L << (DatetimeLiteral - 134)) | (1L << (Characterliteral - 134)) | (1L << (Floatingliteral - 134)) | (1L << (Stringliteral - 134)) | (1L << (Userdefinedintegerliteral - 134)) | (1L << (Userdefinedfloatingliteral - 134)) | (1L << (Userdefinedstringliteral - 134)) | (1L << (Userdefinedcharacterliteral - 134)))) != 0)) {
							{
							setState(612);
							expressionlist();
							}
						}

						setState(615);
						match(RightParen);
						}
						break;
					case 4:
						{
						_localctx = new PExpressionContext(new PostfixexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(616);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(617);
						match(Dot);
						setState(619);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(618);
							match(Template);
							}
						}

						setState(621);
						idexpression();
						}
						break;
					case 5:
						{
						_localctx = new PExpressionContext(new PostfixexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(622);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(623);
						match(Arrow);
						setState(625);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(624);
							match(Template);
							}
						}

						setState(627);
						idexpression();
						}
						break;
					case 6:
						{
						_localctx = new PExpressionContext(new PostfixexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(628);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(629);
						match(Dot);
						setState(630);
						pseudodestructorname();
						}
						break;
					case 7:
						{
						_localctx = new PExpressionContext(new PostfixexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(631);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(632);
						match(Arrow);
						setState(633);
						pseudodestructorname();
						}
						break;
					case 8:
						{
						_localctx = new PExpressionContext(new PostfixexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(634);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(635);
						match(PlusPlus);
						}
						break;
					case 9:
						{
						_localctx = new PExpressionContext(new PostfixexpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(636);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(637);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(642);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeidofexprContext extends ParserRuleContext {
		public TerminalNode Typeid_() { return getToken(MQL4Parser.Typeid_, 0); }
		public TypeidofexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeidofexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterTypeidofexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitTypeidofexpr(this);
		}
	}

	public final TypeidofexprContext typeidofexpr() throws RecognitionException {
		TypeidofexprContext _localctx = new TypeidofexprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeidofexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(Typeid_);
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

	public static class TypeidofthetypeidContext extends ParserRuleContext {
		public TerminalNode Typeid_() { return getToken(MQL4Parser.Typeid_, 0); }
		public TypeidofthetypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeidofthetypeid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterTypeidofthetypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitTypeidofthetypeid(this);
		}
	}

	public final TypeidofthetypeidContext typeidofthetypeid() throws RecognitionException {
		TypeidofthetypeidContext _localctx = new TypeidofthetypeidContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeidofthetypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(Typeid_);
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

	public static class ExpressionlistContext extends ParserRuleContext {
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public ExpressionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterExpressionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitExpressionlist(this);
		}
	}

	public final ExpressionlistContext expressionlist() throws RecognitionException {
		ExpressionlistContext _localctx = new ExpressionlistContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressionlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			initializerlist(0);
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

	public static class PseudodestructornameContext extends ParserRuleContext {
		public List<ThetypenameContext> thetypename() {
			return getRuleContexts(ThetypenameContext.class);
		}
		public ThetypenameContext thetypename(int i) {
			return getRuleContext(ThetypenameContext.class,i);
		}
		public TerminalNode Doublecolon() { return getToken(MQL4Parser.Doublecolon, 0); }
		public TerminalNode Tilde() { return getToken(MQL4Parser.Tilde, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Template() { return getToken(MQL4Parser.Template, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public PseudodestructornameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudodestructorname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterPseudodestructorname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitPseudodestructorname(this);
		}
	}

	public final PseudodestructornameContext pseudodestructorname() throws RecognitionException {
		PseudodestructornameContext _localctx = new PseudodestructornameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pseudodestructorname);
		int _la;
		try {
			setState(671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(650);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(649);
					nestednamespecifier(0);
					}
					break;
				}
				setState(652);
				thetypename();
				setState(653);
				match(Doublecolon);
				setState(654);
				match(Tilde);
				setState(655);
				thetypename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
				nestednamespecifier(0);
				setState(658);
				match(Template);
				setState(659);
				simpletemplateid();
				setState(660);
				match(Doublecolon);
				setState(661);
				match(Tilde);
				setState(662);
				thetypename();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(664);
					nestednamespecifier(0);
					}
				}

				setState(667);
				match(Tilde);
				setState(668);
				thetypename();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(669);
				match(Tilde);
				setState(670);
				decltypespecifier();
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

	public static class UnaryexpressionContext extends ParserRuleContext {
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(MQL4Parser.PlusPlus, 0); }
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public TerminalNode MinusMinus() { return getToken(MQL4Parser.MinusMinus, 0); }
		public UnaryoperatorContext unaryoperator() {
			return getRuleContext(UnaryoperatorContext.class,0);
		}
		public TerminalNode Sizeof() { return getToken(MQL4Parser.Sizeof, 0); }
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(MQL4Parser.LeftParen, 0); }
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MQL4Parser.RightParen, 0); }
		public TerminalNode Ellipsis() { return getToken(MQL4Parser.Ellipsis, 0); }
		public TerminalNode Identifier() { return getToken(MQL4Parser.Identifier, 0); }
		public TerminalNode Alignof() { return getToken(MQL4Parser.Alignof, 0); }
		public NoexceptexpressionContext noexceptexpression() {
			return getRuleContext(NoexceptexpressionContext.class,0);
		}
		public NewexpressionContext newexpression() {
			return getRuleContext(NewexpressionContext.class,0);
		}
		public DeleteexpressionContext deleteexpression() {
			return getRuleContext(DeleteexpressionContext.class,0);
		}
		public UnaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterUnaryexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitUnaryexpression(this);
		}
	}

	public final UnaryexpressionContext unaryexpression() throws RecognitionException {
		UnaryexpressionContext _localctx = new UnaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unaryexpression);
		try {
			setState(701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(673);
				postfixexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				match(PlusPlus);
				setState(675);
				castexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(676);
				match(MinusMinus);
				setState(677);
				castexpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(678);
				unaryoperator();
				setState(679);
				castexpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(681);
				match(Sizeof);
				setState(682);
				unaryexpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(683);
				match(Sizeof);
				setState(684);
				match(LeftParen);
				setState(685);
				thetypeid();
				setState(686);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(688);
				match(Sizeof);
				setState(689);
				match(Ellipsis);
				setState(690);
				match(LeftParen);
				setState(691);
				match(Identifier);
				setState(692);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(693);
				match(Alignof);
				setState(694);
				match(LeftParen);
				setState(695);
				thetypeid();
				setState(696);
				match(RightParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(698);
				noexceptexpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(699);
				newexpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(700);
				deleteexpression();
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

	public static class UnaryoperatorContext extends ParserRuleContext {
		public TerminalNode Or() { return getToken(MQL4Parser.Or, 0); }
		public TerminalNode Star() { return getToken(MQL4Parser.Star, 0); }
		public TerminalNode And() { return getToken(MQL4Parser.And, 0); }
		public TerminalNode Plus() { return getToken(MQL4Parser.Plus, 0); }
		public TerminalNode Tilde() { return getToken(MQL4Parser.Tilde, 0); }
		public TerminalNode Minus() { return getToken(MQL4Parser.Minus, 0); }
		public UnaryoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterUnaryoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitUnaryoperator(this);
		}
	}

	public final UnaryoperatorContext unaryoperator() throws RecognitionException {
		UnaryoperatorContext _localctx = new UnaryoperatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unaryoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1 || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (Plus - 96)) | (1L << (Minus - 96)) | (1L << (Star - 96)) | (1L << (And - 96)) | (1L << (Or - 96)) | (1L << (Tilde - 96)))) != 0)) ) {
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

	public static class NewexpressionContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(MQL4Parser.New, 0); }
		public NewtypeidContext newtypeid() {
			return getRuleContext(NewtypeidContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(MQL4Parser.Doublecolon, 0); }
		public NewplacementContext newplacement() {
			return getRuleContext(NewplacementContext.class,0);
		}
		public NewinitializerContext newinitializer() {
			return getRuleContext(NewinitializerContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(MQL4Parser.LeftParen, 0); }
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MQL4Parser.RightParen, 0); }
		public NewexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterNewexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitNewexpression(this);
		}
	}

	public final NewexpressionContext newexpression() throws RecognitionException {
		NewexpressionContext _localctx = new NewexpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_newexpression);
		int _la;
		try {
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(705);
					match(Doublecolon);
					}
				}

				setState(708);
				match(New);
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(709);
					newplacement();
					}
				}

				setState(712);
				newtypeid();
				setState(714);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(713);
					newinitializer();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(716);
					match(Doublecolon);
					}
				}

				setState(719);
				match(New);
				setState(721);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(720);
					newplacement();
					}
					break;
				}
				setState(723);
				match(LeftParen);
				setState(724);
				thetypeid();
				setState(725);
				match(RightParen);
				setState(727);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(726);
					newinitializer();
					}
					break;
				}
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

	public static class NewplacementContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(MQL4Parser.LeftParen, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MQL4Parser.RightParen, 0); }
		public NewplacementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newplacement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterNewplacement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitNewplacement(this);
		}
	}

	public final NewplacementContext newplacement() throws RecognitionException {
		NewplacementContext _localctx = new NewplacementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_newplacement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(LeftParen);
			setState(732);
			expressionlist();
			setState(733);
			match(RightParen);
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

	public static class NewtypeidContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public NewdeclaratorContext newdeclarator() {
			return getRuleContext(NewdeclaratorContext.class,0);
		}
		public NewtypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newtypeid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterNewtypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitNewtypeid(this);
		}
	}

	public final NewtypeidContext newtypeid() throws RecognitionException {
		NewtypeidContext _localctx = new NewtypeidContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_newtypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			typespecifierseq();
			setState(737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(736);
				newdeclarator();
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

	public static class NewdeclaratorContext extends ParserRuleContext {
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public NewdeclaratorContext newdeclarator() {
			return getRuleContext(NewdeclaratorContext.class,0);
		}
		public NoptrnewdeclaratorContext noptrnewdeclarator() {
			return getRuleContext(NoptrnewdeclaratorContext.class,0);
		}
		public NewdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterNewdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitNewdeclarator(this);
		}
	}

	public final NewdeclaratorContext newdeclarator() throws RecognitionException {
		NewdeclaratorContext _localctx = new NewdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_newdeclarator);
		try {
			setState(744);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case Decltype:
			case Star:
			case And:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				ptroperator();
				setState(741);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(740);
					newdeclarator();
					}
					break;
				}
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
				noptrnewdeclarator(0);
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

	public static class NoptrnewdeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(MQL4Parser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(MQL4Parser.RightBracket, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NoptrnewdeclaratorContext noptrnewdeclarator() {
			return getRuleContext(NoptrnewdeclaratorContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoptrnewdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrnewdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterNoptrnewdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitNoptrnewdeclarator(this);
		}
	}

	public final NoptrnewdeclaratorContext noptrnewdeclarator() throws RecognitionException {
		return noptrnewdeclarator(0);
	}

	private NoptrnewdeclaratorContext noptrnewdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrnewdeclaratorContext _localctx = new NoptrnewdeclaratorContext(_ctx, _parentState);
		NoptrnewdeclaratorContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_noptrnewdeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(747);
			match(LeftBracket);
			setState(748);
			expression(0);
			setState(749);
			match(RightBracket);
			setState(751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(750);
				attributespecifierseq(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(762);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoptrnewdeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noptrnewdeclarator);
					setState(753);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(754);
					match(LeftBracket);
					setState(755);
					constantexpression();
					setState(756);
					match(RightBracket);
					setState(758);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(757);
						attributespecifierseq(0);
						}
						break;
					}
					}
					} 
				}
				setState(764);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NewinitializerContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(MQL4Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(MQL4Parser.RightParen, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public NewinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterNewinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitNewinitializer(this);
		}
	}

	public final NewinitializerContext newinitializer() throws RecognitionException {
		NewinitializerContext _localctx = new NewinitializerContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_newinitializer);
		int _la;
		try {
			setState(771);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(765);
				match(LeftParen);
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Color) | (1L << Const_cast) | (1L << Datetime) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Uchar - 66)) | (1L << (Unshort - 66)) | (1L << (Ulong - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (Doublecolon - 134)) | (1L << (Identifier - 134)) | (1L << (Integerliteral - 134)) | (1L << (ColorLiteral - 134)) | (1L << (DatetimeLiteral - 134)) | (1L << (Characterliteral - 134)) | (1L << (Floatingliteral - 134)) | (1L << (Stringliteral - 134)) | (1L << (Userdefinedintegerliteral - 134)) | (1L << (Userdefinedfloatingliteral - 134)) | (1L << (Userdefinedstringliteral - 134)) | (1L << (Userdefinedcharacterliteral - 134)))) != 0)) {
					{
					setState(766);
					expressionlist();
					}
				}

				setState(769);
				match(RightParen);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(770);
				bracedinitlist();
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

	public static class DeleteexpressionContext extends ParserRuleContext {
		public TerminalNode Delete() { return getToken(MQL4Parser.Delete, 0); }
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(MQL4Parser.Doublecolon, 0); }
		public TerminalNode LeftBracket() { return getToken(MQL4Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(MQL4Parser.RightBracket, 0); }
		public DeleteexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterDeleteexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitDeleteexpression(this);
		}
	}

	public final DeleteexpressionContext deleteexpression() throws RecognitionException {
		DeleteexpressionContext _localctx = new DeleteexpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_deleteexpression);
		int _la;
		try {
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(773);
					match(Doublecolon);
					}
				}

				setState(776);
				match(Delete);
				setState(777);
				castexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(778);
					match(Doublecolon);
					}
				}

				setState(781);
				match(Delete);
				setState(782);
				match(LeftBracket);
				setState(783);
				match(RightBracket);
				setState(784);
				castexpression();
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

	public static class NoexceptexpressionContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(MQL4Parser.Noexcept, 0); }
		public TerminalNode LeftParen() { return getToken(MQL4Parser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MQL4Parser.RightParen, 0); }
		public NoexceptexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noexceptexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterNoexceptexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitNoexceptexpression(this);
		}
	}

	public final NoexceptexpressionContext noexceptexpression() throws RecognitionException {
		NoexceptexpressionContext _localctx = new NoexceptexpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_noexceptexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(Noexcept);
			setState(788);
			match(LeftParen);
			setState(789);
			expression(0);
			setState(790);
			match(RightParen);
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

	public static class CastexpressionContext extends ParserRuleContext {
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(MQL4Parser.LeftParen, 0); }
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MQL4Parser.RightParen, 0); }
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public CastexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterCastexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitCastexpression(this);
		}
	}

	public final CastexpressionContext castexpression() throws RecognitionException {
		CastexpressionContext _localctx = new CastexpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_castexpression);
		try {
			setState(798);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				unaryexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(793);
				match(LeftParen);
				setState(794);
				thetypeid();
				setState(795);
				match(RightParen);
				setState(796);
				castexpression();
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

	public static class PmexpressionContext extends ParserRuleContext {
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public PmexpressionContext pmexpression() {
			return getRuleContext(PmexpressionContext.class,0);
		}
		public TerminalNode DotStar() { return getToken(MQL4Parser.DotStar, 0); }
		public TerminalNode ArrowStar() { return getToken(MQL4Parser.ArrowStar, 0); }
		public PmexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pmexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterPmexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitPmexpression(this);
		}
	}

	public final PmexpressionContext pmexpression() throws RecognitionException {
		return pmexpression(0);
	}

	private PmexpressionContext pmexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PmexpressionContext _localctx = new PmexpressionContext(_ctx, _parentState);
		PmexpressionContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_pmexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(801);
			castexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(811);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(809);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(803);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(804);
						match(DotStar);
						setState(805);
						castexpression();
						}
						break;
					case 2:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(806);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(807);
						match(ArrowStar);
						setState(808);
						castexpression();
						}
						break;
					}
					} 
				}
				setState(813);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeexpressionContext extends ParserRuleContext {
		public PmexpressionContext pmexpression() {
			return getRuleContext(PmexpressionContext.class,0);
		}
		public MultiplicativeexpressionContext multiplicativeexpression() {
			return getRuleContext(MultiplicativeexpressionContext.class,0);
		}
		public TerminalNode Star() { return getToken(MQL4Parser.Star, 0); }
		public TerminalNode Div() { return getToken(MQL4Parser.Div, 0); }
		public TerminalNode Mod() { return getToken(MQL4Parser.Mod, 0); }
		public MultiplicativeexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterMultiplicativeexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitMultiplicativeexpression(this);
		}
	}

	public final MultiplicativeexpressionContext multiplicativeexpression() throws RecognitionException {
		return multiplicativeexpression(0);
	}

	private MultiplicativeexpressionContext multiplicativeexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeexpressionContext _localctx = new MultiplicativeexpressionContext(_ctx, _parentState);
		MultiplicativeexpressionContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_multiplicativeexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(815);
			pmexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(828);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(826);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(817);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(818);
						match(Star);
						setState(819);
						pmexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(820);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(821);
						match(Div);
						setState(822);
						pmexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(823);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(824);
						match(Mod);
						setState(825);
						pmexpression(0);
						}
						break;
					}
					} 
				}
				setState(830);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveexpressionContext extends ParserRuleContext {
		public MultiplicativeexpressionContext multiplicativeexpression() {
			return getRuleContext(MultiplicativeexpressionContext.class,0);
		}
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public TerminalNode Plus() { return getToken(MQL4Parser.Plus, 0); }
		public TerminalNode Minus() { return getToken(MQL4Parser.Minus, 0); }
		public AdditiveexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterAdditiveexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitAdditiveexpression(this);
		}
	}

	public final AdditiveexpressionContext additiveexpression() throws RecognitionException {
		return additiveexpression(0);
	}

	private AdditiveexpressionContext additiveexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveexpressionContext _localctx = new AdditiveexpressionContext(_ctx, _parentState);
		AdditiveexpressionContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_additiveexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(832);
			multiplicativeexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(842);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(840);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(834);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(835);
						match(Plus);
						setState(836);
						multiplicativeexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(837);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(838);
						match(Minus);
						setState(839);
						multiplicativeexpression(0);
						}
						break;
					}
					} 
				}
				setState(844);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftexpressionContext extends ParserRuleContext {
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public ShiftexpressionContext shiftexpression() {
			return getRuleContext(ShiftexpressionContext.class,0);
		}
		public ShiftoperatorContext shiftoperator() {
			return getRuleContext(ShiftoperatorContext.class,0);
		}
		public ShiftexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterShiftexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitShiftexpression(this);
		}
	}

	public final ShiftexpressionContext shiftexpression() throws RecognitionException {
		return shiftexpression(0);
	}

	private ShiftexpressionContext shiftexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftexpressionContext _localctx = new ShiftexpressionContext(_ctx, _parentState);
		ShiftexpressionContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_shiftexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(846);
			additiveexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(854);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ShiftexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_shiftexpression);
					setState(848);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(849);
					shiftoperator();
					setState(850);
					additiveexpression(0);
					}
					} 
				}
				setState(856);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftoperatorContext extends ParserRuleContext {
		public TerminalNode RightShift() { return getToken(MQL4Parser.RightShift, 0); }
		public TerminalNode LeftShift() { return getToken(MQL4Parser.LeftShift, 0); }
		public ShiftoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterShiftoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitShiftoperator(this);
		}
	}

	public final ShiftoperatorContext shiftoperator() throws RecognitionException {
		ShiftoperatorContext _localctx = new ShiftoperatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_shiftoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			_la = _input.LA(1);
			if ( !(_la==LeftShift || _la==RightShift) ) {
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

	public static class RelationalexpressionContext extends ParserRuleContext {
		public ShiftexpressionContext shiftexpression() {
			return getRuleContext(ShiftexpressionContext.class,0);
		}
		public RelationalexpressionContext relationalexpression() {
			return getRuleContext(RelationalexpressionContext.class,0);
		}
		public TerminalNode Less() { return getToken(MQL4Parser.Less, 0); }
		public TerminalNode Greater() { return getToken(MQL4Parser.Greater, 0); }
		public TerminalNode LessEqual() { return getToken(MQL4Parser.LessEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(MQL4Parser.GreaterEqual, 0); }
		public RelationalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterRelationalexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitRelationalexpression(this);
		}
	}

	public final RelationalexpressionContext relationalexpression() throws RecognitionException {
		return relationalexpression(0);
	}

	private RelationalexpressionContext relationalexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalexpressionContext _localctx = new RelationalexpressionContext(_ctx, _parentState);
		RelationalexpressionContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_relationalexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(860);
			shiftexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(876);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(874);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(862);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(863);
						match(Less);
						setState(864);
						shiftexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(865);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(866);
						match(Greater);
						setState(867);
						shiftexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(868);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(869);
						match(LessEqual);
						setState(870);
						shiftexpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(871);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(872);
						match(GreaterEqual);
						setState(873);
						shiftexpression(0);
						}
						break;
					}
					} 
				}
				setState(878);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityexpressionContext extends ParserRuleContext {
		public RelationalexpressionContext relationalexpression() {
			return getRuleContext(RelationalexpressionContext.class,0);
		}
		public EqualityexpressionContext equalityexpression() {
			return getRuleContext(EqualityexpressionContext.class,0);
		}
		public TerminalNode Equal() { return getToken(MQL4Parser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(MQL4Parser.NotEqual, 0); }
		public EqualityexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterEqualityexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitEqualityexpression(this);
		}
	}

	public final EqualityexpressionContext equalityexpression() throws RecognitionException {
		return equalityexpression(0);
	}

	private EqualityexpressionContext equalityexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityexpressionContext _localctx = new EqualityexpressionContext(_ctx, _parentState);
		EqualityexpressionContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_equalityexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(880);
			relationalexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(890);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(888);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(882);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(883);
						match(Equal);
						setState(884);
						relationalexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(885);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(886);
						match(NotEqual);
						setState(887);
						relationalexpression(0);
						}
						break;
					}
					} 
				}
				setState(892);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndexpressionContext extends ParserRuleContext {
		public EqualityexpressionContext equalityexpression() {
			return getRuleContext(EqualityexpressionContext.class,0);
		}
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public TerminalNode And() { return getToken(MQL4Parser.And, 0); }
		public AndexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterAndexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitAndexpression(this);
		}
	}

	public final AndexpressionContext andexpression() throws RecognitionException {
		return andexpression(0);
	}

	private AndexpressionContext andexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndexpressionContext _localctx = new AndexpressionContext(_ctx, _parentState);
		AndexpressionContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_andexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(894);
			equalityexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(901);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andexpression);
					setState(896);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(897);
					match(And);
					setState(898);
					equalityexpression(0);
					}
					} 
				}
				setState(903);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveorexpressionContext extends ParserRuleContext {
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public ExclusiveorexpressionContext exclusiveorexpression() {
			return getRuleContext(ExclusiveorexpressionContext.class,0);
		}
		public TerminalNode Caret() { return getToken(MQL4Parser.Caret, 0); }
		public ExclusiveorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterExclusiveorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitExclusiveorexpression(this);
		}
	}

	public final ExclusiveorexpressionContext exclusiveorexpression() throws RecognitionException {
		return exclusiveorexpression(0);
	}

	private ExclusiveorexpressionContext exclusiveorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveorexpressionContext _localctx = new ExclusiveorexpressionContext(_ctx, _parentState);
		ExclusiveorexpressionContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_exclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(905);
			andexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(912);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveorexpression);
					setState(907);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(908);
					match(Caret);
					setState(909);
					andexpression(0);
					}
					} 
				}
				setState(914);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveorexpressionContext extends ParserRuleContext {
		public ExclusiveorexpressionContext exclusiveorexpression() {
			return getRuleContext(ExclusiveorexpressionContext.class,0);
		}
		public InclusiveorexpressionContext inclusiveorexpression() {
			return getRuleContext(InclusiveorexpressionContext.class,0);
		}
		public TerminalNode Or() { return getToken(MQL4Parser.Or, 0); }
		public InclusiveorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterInclusiveorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitInclusiveorexpression(this);
		}
	}

	public final InclusiveorexpressionContext inclusiveorexpression() throws RecognitionException {
		return inclusiveorexpression(0);
	}

	private InclusiveorexpressionContext inclusiveorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveorexpressionContext _localctx = new InclusiveorexpressionContext(_ctx, _parentState);
		InclusiveorexpressionContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_inclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(916);
			exclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(923);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveorexpression);
					setState(918);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(919);
					match(Or);
					setState(920);
					exclusiveorexpression(0);
					}
					} 
				}
				setState(925);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalandexpressionContext extends ParserRuleContext {
		public InclusiveorexpressionContext inclusiveorexpression() {
			return getRuleContext(InclusiveorexpressionContext.class,0);
		}
		public LogicalandexpressionContext logicalandexpression() {
			return getRuleContext(LogicalandexpressionContext.class,0);
		}
		public LogicalandexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalandexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterLogicalandexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitLogicalandexpression(this);
		}
	}

	public final LogicalandexpressionContext logicalandexpression() throws RecognitionException {
		return logicalandexpression(0);
	}

	private LogicalandexpressionContext logicalandexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalandexpressionContext _localctx = new LogicalandexpressionContext(_ctx, _parentState);
		LogicalandexpressionContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_logicalandexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(927);
			inclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(937);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(935);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
						setState(929);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(930);
						match(T__2);
						setState(931);
						inclusiveorexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
						setState(932);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(933);
						match(T__3);
						setState(934);
						inclusiveorexpression(0);
						}
						break;
					}
					} 
				}
				setState(939);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalorexpressionContext extends ParserRuleContext {
		public LogicalandexpressionContext logicalandexpression() {
			return getRuleContext(LogicalandexpressionContext.class,0);
		}
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public LogicalorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterLogicalorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitLogicalorexpression(this);
		}
	}

	public final LogicalorexpressionContext logicalorexpression() throws RecognitionException {
		return logicalorexpression(0);
	}

	private LogicalorexpressionContext logicalorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalorexpressionContext _localctx = new LogicalorexpressionContext(_ctx, _parentState);
		LogicalorexpressionContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_logicalorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(941);
			logicalandexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(951);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(949);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
						setState(943);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(944);
						match(T__4);
						setState(945);
						logicalandexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
						setState(946);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(947);
						match(T__5);
						setState(948);
						logicalandexpression(0);
						}
						break;
					}
					} 
				}
				setState(953);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalexpressionContext extends ParserRuleContext {
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public TerminalNode Question() { return getToken(MQL4Parser.Question, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(MQL4Parser.Colon, 0); }
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ConditionalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterConditionalexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitConditionalexpression(this);
		}
	}

	public final ConditionalexpressionContext conditionalexpression() throws RecognitionException {
		ConditionalexpressionContext _localctx = new ConditionalexpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_conditionalexpression);
		try {
			setState(961);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(954);
				logicalorexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(955);
				logicalorexpression(0);
				setState(956);
				match(Question);
				setState(957);
				expression(0);
				setState(958);
				match(Colon);
				setState(959);
				assignmentexpression();
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

	public static class AssignmentexpressionContext extends ParserRuleContext {
		public ConditionalexpressionContext conditionalexpression() {
			return getRuleContext(ConditionalexpressionContext.class,0);
		}
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public AssignmentoperatorContext assignmentoperator() {
			return getRuleContext(AssignmentoperatorContext.class,0);
		}
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public ThrowexpressionContext throwexpression() {
			return getRuleContext(ThrowexpressionContext.class,0);
		}
		public AssignmentexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterAssignmentexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitAssignmentexpression(this);
		}
	}

	public final AssignmentexpressionContext assignmentexpression() throws RecognitionException {
		AssignmentexpressionContext _localctx = new AssignmentexpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_assignmentexpression);
		try {
			setState(969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(963);
				conditionalexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(964);
				logicalorexpression(0);
				setState(965);
				assignmentoperator();
				setState(966);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(968);
				throwexpression();
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

	public static class AssignmentoperatorContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(MQL4Parser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(MQL4Parser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(MQL4Parser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(MQL4Parser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(MQL4Parser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(MQL4Parser.MinusAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(MQL4Parser.RightShiftAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(MQL4Parser.LeftShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(MQL4Parser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(MQL4Parser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(MQL4Parser.OrAssign, 0); }
		public AssignmentoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterAssignmentoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitAssignmentoperator(this);
		}
	}

	public final AssignmentoperatorContext assignmentoperator() throws RecognitionException {
		AssignmentoperatorContext _localctx = new AssignmentoperatorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_assignmentoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			_la = _input.LA(1);
			if ( !(((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (Assign - 106)) | (1L << (PlusAssign - 106)) | (1L << (MinusAssign - 106)) | (1L << (StarAssign - 106)) | (1L << (DivAssign - 106)) | (1L << (ModAssign - 106)) | (1L << (XorAssign - 106)) | (1L << (AndAssign - 106)) | (1L << (OrAssign - 106)) | (1L << (LeftShiftAssign - 106)) | (1L << (RightShiftAssign - 106)))) != 0)) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MQL4Parser.Comma, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(974);
			assignmentexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(981);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(976);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(977);
					match(Comma);
					setState(978);
					assignmentexpression();
					}
					} 
				}
				setState(983);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantexpressionContext extends ParserRuleContext {
		public ConditionalexpressionContext conditionalexpression() {
			return getRuleContext(ConditionalexpressionContext.class,0);
		}
		public ConstantexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterConstantexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitConstantexpression(this);
		}
	}

	public final ConstantexpressionContext constantexpression() throws RecognitionException {
		ConstantexpressionContext _localctx = new ConstantexpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_constantexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			conditionalexpression();
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

	public static class StatementContext extends ParserRuleContext {
		public LabeledstatementContext labeledstatement() {
			return getRuleContext(LabeledstatementContext.class,0);
		}
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public SelectionstatementContext selectionstatement() {
			return getRuleContext(SelectionstatementContext.class,0);
		}
		public IterationstatementContext iterationstatement() {
			return getRuleContext(IterationstatementContext.class,0);
		}
		public JumpstatementContext jumpstatement() {
			return getRuleContext(JumpstatementContext.class,0);
		}
		public DeclarationstatementContext declarationstatement() {
			return getRuleContext(DeclarationstatementContext.class,0);
		}
		public TryblockContext tryblock() {
			return getRuleContext(TryblockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_statement);
		int _la;
		try {
			setState(1012);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(986);
				labeledstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(988);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(987);
					attributespecifierseq(0);
					}
					break;
				}
				setState(990);
				expressionstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(992);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(991);
					attributespecifierseq(0);
					}
				}

				setState(994);
				compoundstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(995);
					attributespecifierseq(0);
					}
				}

				setState(998);
				selectionstatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(999);
					attributespecifierseq(0);
					}
				}

				setState(1002);
				iterationstatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1004);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1003);
					attributespecifierseq(0);
					}
				}

				setState(1006);
				jumpstatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1007);
				declarationstatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1008);
					attributespecifierseq(0);
					}
				}

				setState(1011);
				tryblock();
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

	public static class LabeledstatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MQL4Parser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(MQL4Parser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Case() { return getToken(MQL4Parser.Case, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(MQL4Parser.Default, 0); }
		public LabeledstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterLabeledstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitLabeledstatement(this);
		}
	}

	public final LabeledstatementContext labeledstatement() throws RecognitionException {
		LabeledstatementContext _localctx = new LabeledstatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_labeledstatement);
		int _la;
		try {
			setState(1034);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1015);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1014);
					attributespecifierseq(0);
					}
				}

				setState(1017);
				match(Identifier);
				setState(1018);
				match(Colon);
				setState(1019);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1020);
					attributespecifierseq(0);
					}
				}

				setState(1023);
				match(Case);
				setState(1024);
				constantexpression();
				setState(1025);
				match(Colon);
				setState(1026);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1028);
					attributespecifierseq(0);
					}
				}

				setState(1031);
				match(Default);
				setState(1032);
				match(Colon);
				setState(1033);
				statement();
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

	public static class ExpressionstatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(MQL4Parser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterExpressionstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitExpressionstatement(this);
		}
	}

	public final ExpressionstatementContext expressionstatement() throws RecognitionException {
		ExpressionstatementContext _localctx = new ExpressionstatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_expressionstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Color) | (1L << Const_cast) | (1L << Datetime) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Uchar - 66)) | (1L << (Unshort - 66)) | (1L << (Ulong - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (Doublecolon - 134)) | (1L << (Identifier - 134)) | (1L << (Integerliteral - 134)) | (1L << (ColorLiteral - 134)) | (1L << (DatetimeLiteral - 134)) | (1L << (Characterliteral - 134)) | (1L << (Floatingliteral - 134)) | (1L << (Stringliteral - 134)) | (1L << (Userdefinedintegerliteral - 134)) | (1L << (Userdefinedfloatingliteral - 134)) | (1L << (Userdefinedstringliteral - 134)) | (1L << (Userdefinedcharacterliteral - 134)))) != 0)) {
				{
				setState(1036);
				expression(0);
				}
			}

			setState(1039);
			match(Semi);
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

	public static class CompoundstatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(MQL4Parser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(MQL4Parser.RightBrace, 0); }
		public StatementseqContext statementseq() {
			return getRuleContext(StatementseqContext.class,0);
		}
		public CompoundstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterCompoundstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitCompoundstatement(this);
		}
	}

	public final CompoundstatementContext compoundstatement() throws RecognitionException {
		CompoundstatementContext _localctx = new CompoundstatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_compoundstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			match(LeftBrace);
			setState(1043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Color) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Datetime) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << False) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (Switch - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Uchar - 64)) | (1L << (Union - 64)) | (1L << (Unshort - 64)) | (1L << (Ulong - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MinusMinus - 128)) | (1L << (Doublecolon - 128)) | (1L << (Semi - 128)) | (1L << (Ellipsis - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (ColorLiteral - 128)) | (1L << (DatetimeLiteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
				{
				setState(1042);
				statementseq(0);
				}
			}

			setState(1045);
			match(RightBrace);
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

	public static class StatementseqContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementseqContext statementseq() {
			return getRuleContext(StatementseqContext.class,0);
		}
		public StatementseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterStatementseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitStatementseq(this);
		}
	}

	public final StatementseqContext statementseq() throws RecognitionException {
		return statementseq(0);
	}

	private StatementseqContext statementseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementseqContext _localctx = new StatementseqContext(_ctx, _parentState);
		StatementseqContext _prevctx = _localctx;
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_statementseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1048);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(1054);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statementseq);
					setState(1050);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1051);
					statement();
					}
					} 
				}
				setState(1056);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SelectionstatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(MQL4Parser.If, 0); }
		public TerminalNode LeftParen() { return getToken(MQL4Parser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MQL4Parser.RightParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(MQL4Parser.Else, 0); }
		public TerminalNode Switch() { return getToken(MQL4Parser.Switch, 0); }
		public SelectionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterSelectionstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitSelectionstatement(this);
		}
	}

	public final SelectionstatementContext selectionstatement() throws RecognitionException {
		SelectionstatementContext _localctx = new SelectionstatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_selectionstatement);
		try {
			setState(1077);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1057);
				match(If);
				setState(1058);
				match(LeftParen);
				setState(1059);
				condition();
				setState(1060);
				match(RightParen);
				setState(1061);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1063);
				match(If);
				setState(1064);
				match(LeftParen);
				setState(1065);
				condition();
				setState(1066);
				match(RightParen);
				setState(1067);
				statement();
				setState(1068);
				match(Else);
				setState(1069);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1071);
				match(Switch);
				setState(1072);
				match(LeftParen);
				setState(1073);
				condition();
				setState(1074);
				match(RightParen);
				setState(1075);
				statement();
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

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(MQL4Parser.Assign, 0); }
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_condition);
		int _la;
		try {
			setState(1095);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1079);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1080);
					attributespecifierseq(0);
					}
				}

				setState(1083);
				declspecifierseq();
				setState(1084);
				declarator();
				setState(1085);
				match(Assign);
				setState(1086);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1089);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1088);
					attributespecifierseq(0);
					}
				}

				setState(1091);
				declspecifierseq();
				setState(1092);
				declarator();
				setState(1093);
				bracedinitlist();
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

	public static class IterationstatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(MQL4Parser.While, 0); }
		public TerminalNode LeftParen() { return getToken(MQL4Parser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MQL4Parser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(MQL4Parser.Do, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(MQL4Parser.Semi, 0); }
		public TerminalNode For() { return getToken(MQL4Parser.For, 0); }
		public ForinitstatementContext forinitstatement() {
			return getRuleContext(ForinitstatementContext.class,0);
		}
		public ForrangedeclarationContext forrangedeclaration() {
			return getRuleContext(ForrangedeclarationContext.class,0);
		}
		public TerminalNode Colon() { return getToken(MQL4Parser.Colon, 0); }
		public ForrangeinitializerContext forrangeinitializer() {
			return getRuleContext(ForrangeinitializerContext.class,0);
		}
		public IterationstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterIterationstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitIterationstatement(this);
		}
	}

	public final IterationstatementContext iterationstatement() throws RecognitionException {
		IterationstatementContext _localctx = new IterationstatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_iterationstatement);
		int _la;
		try {
			setState(1132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1097);
				match(While);
				setState(1098);
				match(LeftParen);
				setState(1099);
				condition();
				setState(1100);
				match(RightParen);
				setState(1101);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1103);
				match(Do);
				setState(1104);
				statement();
				setState(1105);
				match(While);
				setState(1106);
				match(LeftParen);
				setState(1107);
				expression(0);
				setState(1108);
				match(RightParen);
				setState(1109);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1111);
				match(For);
				setState(1112);
				match(LeftParen);
				setState(1113);
				forinitstatement();
				setState(1115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignas) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Color) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Datetime) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << False) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static - 64)) | (1L << (Static_cast - 64)) | (1L << (Struct - 64)) | (1L << (This - 64)) | (1L << (Thread_local - 64)) | (1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid_ - 64)) | (1L << (Typename_ - 64)) | (1L << (Uchar - 64)) | (1L << (Union - 64)) | (1L << (Unshort - 64)) | (1L << (Ulong - 64)) | (1L << (Unsigned - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (PlusPlus - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MinusMinus - 128)) | (1L << (Doublecolon - 128)) | (1L << (Identifier - 128)) | (1L << (Integerliteral - 128)) | (1L << (ColorLiteral - 128)) | (1L << (DatetimeLiteral - 128)) | (1L << (Characterliteral - 128)) | (1L << (Floatingliteral - 128)) | (1L << (Stringliteral - 128)) | (1L << (Userdefinedintegerliteral - 128)) | (1L << (Userdefinedfloatingliteral - 128)) | (1L << (Userdefinedstringliteral - 128)) | (1L << (Userdefinedcharacterliteral - 128)))) != 0)) {
					{
					setState(1114);
					condition();
					}
				}

				setState(1117);
				match(Semi);
				setState(1119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Color) | (1L << Const_cast) | (1L << Datetime) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Uchar - 66)) | (1L << (Unshort - 66)) | (1L << (Ulong - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (Doublecolon - 134)) | (1L << (Identifier - 134)) | (1L << (Integerliteral - 134)) | (1L << (ColorLiteral - 134)) | (1L << (DatetimeLiteral - 134)) | (1L << (Characterliteral - 134)) | (1L << (Floatingliteral - 134)) | (1L << (Stringliteral - 134)) | (1L << (Userdefinedintegerliteral - 134)) | (1L << (Userdefinedfloatingliteral - 134)) | (1L << (Userdefinedstringliteral - 134)) | (1L << (Userdefinedcharacterliteral - 134)))) != 0)) {
					{
					setState(1118);
					expression(0);
					}
				}

				setState(1121);
				match(RightParen);
				setState(1122);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1124);
				match(For);
				setState(1125);
				match(LeftParen);
				setState(1126);
				forrangedeclaration();
				setState(1127);
				match(Colon);
				setState(1128);
				forrangeinitializer();
				setState(1129);
				match(RightParen);
				setState(1130);
				statement();
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

	public static class ForinitstatementContext extends ParserRuleContext {
		public ForinitstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forinitstatement; }
	 
		public ForinitstatementContext() { }
		public void copyFrom(ForinitstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForSimpleDeclarationContext extends ForinitstatementContext {
		public SimpledeclarationContext simpledeclaration() {
			return getRuleContext(SimpledeclarationContext.class,0);
		}
		public ForSimpleDeclarationContext(ForinitstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterForSimpleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitForSimpleDeclaration(this);
		}
	}
	public static class ForInitExpressionContext extends ForinitstatementContext {
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public ForInitExpressionContext(ForinitstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterForInitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitForInitExpression(this);
		}
	}

	public final ForinitstatementContext forinitstatement() throws RecognitionException {
		ForinitstatementContext _localctx = new ForinitstatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_forinitstatement);
		try {
			setState(1136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				_localctx = new ForInitExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1134);
				expressionstatement();
				}
				break;
			case 2:
				_localctx = new ForSimpleDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1135);
				simpledeclaration();
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

	public static class ForrangedeclarationContext extends ParserRuleContext {
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ForrangedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forrangedeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterForrangedeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitForrangedeclaration(this);
		}
	}

	public final ForrangedeclarationContext forrangedeclaration() throws RecognitionException {
		ForrangedeclarationContext _localctx = new ForrangedeclarationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_forrangedeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1138);
				attributespecifierseq(0);
				}
			}

			setState(1141);
			declspecifierseq();
			setState(1142);
			declarator();
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

	public static class ForrangeinitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public ForrangeinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forrangeinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterForrangeinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitForrangeinitializer(this);
		}
	}

	public final ForrangeinitializerContext forrangeinitializer() throws RecognitionException {
		ForrangeinitializerContext _localctx = new ForrangeinitializerContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_forrangeinitializer);
		try {
			setState(1146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case Alignof:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Color:
			case Const_cast:
			case Datetime:
			case Decltype:
			case Delete:
			case Double:
			case Dynamic_cast:
			case False:
			case Float:
			case Int:
			case Long:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Reinterpret_cast:
			case Short:
			case Signed:
			case Sizeof:
			case Static_cast:
			case This:
			case Throw:
			case True:
			case Typeid_:
			case Typename_:
			case Uchar:
			case Unshort:
			case Ulong:
			case Unsigned:
			case Void:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Or:
			case Tilde:
			case PlusPlus:
			case MinusMinus:
			case Doublecolon:
			case Identifier:
			case Integerliteral:
			case ColorLiteral:
			case DatetimeLiteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1144);
				expression(0);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1145);
				bracedinitlist();
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

	public static class JumpstatementContext extends ParserRuleContext {
		public JumpstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpstatement; }
	 
		public JumpstatementContext() { }
		public void copyFrom(JumpstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BreakStatementContext extends JumpstatementContext {
		public TerminalNode Break() { return getToken(MQL4Parser.Break, 0); }
		public TerminalNode Semi() { return getToken(MQL4Parser.Semi, 0); }
		public BreakStatementContext(JumpstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitBreakStatement(this);
		}
	}
	public static class ContinueStatementContext extends JumpstatementContext {
		public TerminalNode Continue() { return getToken(MQL4Parser.Continue, 0); }
		public TerminalNode Semi() { return getToken(MQL4Parser.Semi, 0); }
		public ContinueStatementContext(JumpstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitContinueStatement(this);
		}
	}
	public static class ReturnStatementContext extends JumpstatementContext {
		public TerminalNode Return() { return getToken(MQL4Parser.Return, 0); }
		public TerminalNode Semi() { return getToken(MQL4Parser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(MQL4Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(MQL4Parser.RightParen, 0); }
		public ReturnStatementContext(JumpstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitReturnStatement(this);
		}
	}
	public static class GotoStatementContext extends JumpstatementContext {
		public TerminalNode Goto() { return getToken(MQL4Parser.Goto, 0); }
		public TerminalNode Identifier() { return getToken(MQL4Parser.Identifier, 0); }
		public TerminalNode Semi() { return getToken(MQL4Parser.Semi, 0); }
		public GotoStatementContext(JumpstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitGotoStatement(this);
		}
	}

	public final JumpstatementContext jumpstatement() throws RecognitionException {
		JumpstatementContext _localctx = new JumpstatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_jumpstatement);
		int _la;
		try {
			setState(1170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1148);
				match(Break);
				setState(1149);
				match(Semi);
				}
				break;
			case 2:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1150);
				match(Continue);
				setState(1151);
				match(Semi);
				}
				break;
			case 3:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1152);
				match(Return);
				setState(1154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Color) | (1L << Const_cast) | (1L << Datetime) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Uchar - 66)) | (1L << (Unshort - 66)) | (1L << (Ulong - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (Doublecolon - 134)) | (1L << (Identifier - 134)) | (1L << (Integerliteral - 134)) | (1L << (ColorLiteral - 134)) | (1L << (DatetimeLiteral - 134)) | (1L << (Characterliteral - 134)) | (1L << (Floatingliteral - 134)) | (1L << (Stringliteral - 134)) | (1L << (Userdefinedintegerliteral - 134)) | (1L << (Userdefinedfloatingliteral - 134)) | (1L << (Userdefinedstringliteral - 134)) | (1L << (Userdefinedcharacterliteral - 134)))) != 0)) {
					{
					setState(1153);
					expression(0);
					}
				}

				setState(1156);
				match(Semi);
				}
				break;
			case 4:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1157);
				match(Return);
				setState(1158);
				bracedinitlist();
				setState(1159);
				match(Semi);
				}
				break;
			case 5:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1161);
				match(Return);
				setState(1162);
				match(LeftParen);
				setState(1163);
				expression(0);
				setState(1164);
				match(RightParen);
				setState(1165);
				match(Semi);
				}
				break;
			case 6:
				_localctx = new GotoStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1167);
				match(Goto);
				setState(1168);
				match(Identifier);
				setState(1169);
				match(Semi);
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

	public static class DeclarationstatementContext extends ParserRuleContext {
		public BlockdeclarationContext blockdeclaration() {
			return getRuleContext(BlockdeclarationContext.class,0);
		}
		public DeclarationstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterDeclarationstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitDeclarationstatement(this);
		}
	}

	public final DeclarationstatementContext declarationstatement() throws RecognitionException {
		DeclarationstatementContext _localctx = new DeclarationstatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_declarationstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			blockdeclaration();
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

	public static class DeclarationseqContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public DeclarationseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterDeclarationseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitDeclarationseq(this);
		}
	}

	public final DeclarationseqContext declarationseq() throws RecognitionException {
		return declarationseq(0);
	}

	private DeclarationseqContext declarationseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationseqContext _localctx = new DeclarationseqContext(_ctx, _parentState);
		DeclarationseqContext _prevctx = _localctx;
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_declarationseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1175);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationseq);
					setState(1177);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1178);
					declaration();
					}
					} 
				}
				setState(1183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public BlockdeclarationContext blockdeclaration() {
			return getRuleContext(BlockdeclarationContext.class,0);
		}
		public FunctiondefinitionContext functiondefinition() {
			return getRuleContext(FunctiondefinitionContext.class,0);
		}
		public TemplatedeclarationContext templatedeclaration() {
			return getRuleContext(TemplatedeclarationContext.class,0);
		}
		public ExplicitinstantiationContext explicitinstantiation() {
			return getRuleContext(ExplicitinstantiationContext.class,0);
		}
		public ExplicitspecializationContext explicitspecialization() {
			return getRuleContext(ExplicitspecializationContext.class,0);
		}
		public LinkagespecificationContext linkagespecification() {
			return getRuleContext(LinkagespecificationContext.class,0);
		}
		public NamespacedefinitionContext namespacedefinition() {
			return getRuleContext(NamespacedefinitionContext.class,0);
		}
		public EmptydeclarationContext emptydeclaration() {
			return getRuleContext(EmptydeclarationContext.class,0);
		}
		public AttributedeclarationContext attributedeclaration() {
			return getRuleContext(AttributedeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_declaration);
		try {
			setState(1193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1184);
				blockdeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1185);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1186);
				templatedeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1187);
				explicitinstantiation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1188);
				explicitspecialization();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1189);
				linkagespecification();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1190);
				namespacedefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1191);
				emptydeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1192);
				attributedeclaration();
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

	public static class BlockdeclarationContext extends ParserRuleContext {
		public SimpledeclarationContext simpledeclaration() {
			return getRuleContext(SimpledeclarationContext.class,0);
		}
		public AsmdefinitionContext asmdefinition() {
			return getRuleContext(AsmdefinitionContext.class,0);
		}
		public NamespacealiasdefinitionContext namespacealiasdefinition() {
			return getRuleContext(NamespacealiasdefinitionContext.class,0);
		}
		public UsingdeclarationContext usingdeclaration() {
			return getRuleContext(UsingdeclarationContext.class,0);
		}
		public UsingdirectiveContext usingdirective() {
			return getRuleContext(UsingdirectiveContext.class,0);
		}
		public Static_assertdeclarationContext static_assertdeclaration() {
			return getRuleContext(Static_assertdeclarationContext.class,0);
		}
		public AliasdeclarationContext aliasdeclaration() {
			return getRuleContext(AliasdeclarationContext.class,0);
		}
		public OpaqueenumdeclarationContext opaqueenumdeclaration() {
			return getRuleContext(OpaqueenumdeclarationContext.class,0);
		}
		public BlockdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterBlockdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitBlockdeclaration(this);
		}
	}

	public final BlockdeclarationContext blockdeclaration() throws RecognitionException {
		BlockdeclarationContext _localctx = new BlockdeclarationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_blockdeclaration);
		try {
			setState(1203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1195);
				simpledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1196);
				asmdefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1197);
				namespacealiasdefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1198);
				usingdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1199);
				usingdirective();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1200);
				static_assertdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1201);
				aliasdeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1202);
				opaqueenumdeclaration();
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

	public static class AliasdeclarationContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(MQL4Parser.Using, 0); }
		public TerminalNode Identifier() { return getToken(MQL4Parser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(MQL4Parser.Assign, 0); }
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public TerminalNode Semi() { return getToken(MQL4Parser.Semi, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AliasdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterAliasdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitAliasdeclaration(this);
		}
	}

	public final AliasdeclarationContext aliasdeclaration() throws RecognitionException {
		AliasdeclarationContext _localctx = new AliasdeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_aliasdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205);
			match(Using);
			setState(1206);
			match(Identifier);
			setState(1208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1207);
				attributespecifierseq(0);
				}
			}

			setState(1210);
			match(Assign);
			setState(1211);
			thetypeid();
			setState(1212);
			match(Semi);
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

	public static class SimpledeclarationContext extends ParserRuleContext {
		public SimpledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpledeclaration; }
	 
		public SimpledeclarationContext() { }
		public void copyFrom(SimpledeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleD2Context extends SimpledeclarationContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public InitdeclaratorlistContext initdeclaratorlist() {
			return getRuleContext(InitdeclaratorlistContext.class,0);
		}
		public TerminalNode Semi() { return getToken(MQL4Parser.Semi, 0); }
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public SimpleD2Context(SimpledeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterSimpleD2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitSimpleD2(this);
		}
	}
	public static class VariableDeclarationContext extends SimpledeclarationContext {
		public TerminalNode Semi() { return getToken(MQL4Parser.Semi, 0); }
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public InitdeclaratorlistContext initdeclaratorlist() {
			return getRuleContext(InitdeclaratorlistContext.class,0);
		}
		public VariableDeclarationContext(SimpledeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitVariableDeclaration(this);
		}
	}

	public final SimpledeclarationContext simpledeclaration() throws RecognitionException {
		SimpledeclarationContext _localctx = new SimpledeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_simpledeclaration);
		int _la;
		try {
			setState(1228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Color:
			case Const:
			case Constexpr:
			case Datetime:
			case Decltype:
			case Double:
			case Enum:
			case Explicit:
			case Extern:
			case Float:
			case Friend:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Operator:
			case Register:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Thread_local:
			case Typedef:
			case Typename_:
			case Uchar:
			case Union:
			case Unshort:
			case Ulong:
			case Unsigned:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case LeftParen:
			case Star:
			case And:
			case Tilde:
			case Doublecolon:
			case Semi:
			case Ellipsis:
			case Identifier:
				_localctx = new VariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(1214);
					declspecifierseq();
					}
					break;
				}
				setState(1218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Decltype) | (1L << Operator))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (LeftParen - 90)) | (1L << (Star - 90)) | (1L << (And - 90)) | (1L << (Tilde - 90)) | (1L << (Doublecolon - 90)) | (1L << (Ellipsis - 90)) | (1L << (Identifier - 90)))) != 0)) {
					{
					setState(1217);
					initdeclaratorlist(0);
					}
				}

				setState(1220);
				match(Semi);
				}
				break;
			case Alignas:
			case LeftBracket:
				_localctx = new SimpleD2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1221);
				attributespecifierseq(0);
				setState(1223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(1222);
					declspecifierseq();
					}
					break;
				}
				setState(1225);
				initdeclaratorlist(0);
				setState(1226);
				match(Semi);
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

	public static class Static_assertdeclarationContext extends ParserRuleContext {
		public TerminalNode Static_assert() { return getToken(MQL4Parser.Static_assert, 0); }
		public TerminalNode LeftParen() { return getToken(MQL4Parser.LeftParen, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MQL4Parser.Comma, 0); }
		public TerminalNode Stringliteral() { return getToken(MQL4Parser.Stringliteral, 0); }
		public TerminalNode RightParen() { return getToken(MQL4Parser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(MQL4Parser.Semi, 0); }
		public Static_assertdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_assertdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterStatic_assertdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitStatic_assertdeclaration(this);
		}
	}

	public final Static_assertdeclarationContext static_assertdeclaration() throws RecognitionException {
		Static_assertdeclarationContext _localctx = new Static_assertdeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_static_assertdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1230);
			match(Static_assert);
			setState(1231);
			match(LeftParen);
			setState(1232);
			constantexpression();
			setState(1233);
			match(Comma);
			setState(1234);
			match(Stringliteral);
			setState(1235);
			match(RightParen);
			setState(1236);
			match(Semi);
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

	public static class EmptydeclarationContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(MQL4Parser.Semi, 0); }
		public EmptydeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptydeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterEmptydeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitEmptydeclaration(this);
		}
	}

	public final EmptydeclarationContext emptydeclaration() throws RecognitionException {
		EmptydeclarationContext _localctx = new EmptydeclarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_emptydeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1238);
			match(Semi);
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

	public static class AttributedeclarationContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Semi() { return getToken(MQL4Parser.Semi, 0); }
		public AttributedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributedeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterAttributedeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitAttributedeclaration(this);
		}
	}

	public final AttributedeclarationContext attributedeclaration() throws RecognitionException {
		AttributedeclarationContext _localctx = new AttributedeclarationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_attributedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			attributespecifierseq(0);
			setState(1241);
			match(Semi);
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

	public static class DeclspecifierContext extends ParserRuleContext {
		public StorageclassspecifierContext storageclassspecifier() {
			return getRuleContext(StorageclassspecifierContext.class,0);
		}
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public FunctionspecifierContext functionspecifier() {
			return getRuleContext(FunctionspecifierContext.class,0);
		}
		public TerminalNode Friend() { return getToken(MQL4Parser.Friend, 0); }
		public TerminalNode Typedef() { return getToken(MQL4Parser.Typedef, 0); }
		public TerminalNode Constexpr() { return getToken(MQL4Parser.Constexpr, 0); }
		public DeclspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterDeclspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitDeclspecifier(this);
		}
	}

	public final DeclspecifierContext declspecifier() throws RecognitionException {
		DeclspecifierContext _localctx = new DeclspecifierContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_declspecifier);
		try {
			setState(1249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Extern:
			case Mutable:
			case Register:
			case Static:
			case Thread_local:
				enterOuterAlt(_localctx, 1);
				{
				setState(1243);
				storageclassspecifier();
				}
				break;
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Color:
			case Const:
			case Datetime:
			case Decltype:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Struct:
			case Typename_:
			case Uchar:
			case Union:
			case Unshort:
			case Ulong:
			case Unsigned:
			case Void:
			case Volatile:
			case Wchar:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1244);
				typespecifier();
				}
				break;
			case Explicit:
			case Inline:
			case Virtual:
				enterOuterAlt(_localctx, 3);
				{
				setState(1245);
				functionspecifier();
				}
				break;
			case Friend:
				enterOuterAlt(_localctx, 4);
				{
				setState(1246);
				match(Friend);
				}
				break;
			case Typedef:
				enterOuterAlt(_localctx, 5);
				{
				setState(1247);
				match(Typedef);
				}
				break;
			case Constexpr:
				enterOuterAlt(_localctx, 6);
				{
				setState(1248);
				match(Constexpr);
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

	public static class DeclspecifierseqContext extends ParserRuleContext {
		public DeclspecifierContext declspecifier() {
			return getRuleContext(DeclspecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclspecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declspecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterDeclspecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitDeclspecifierseq(this);
		}
	}

	public final DeclspecifierseqContext declspecifierseq() throws RecognitionException {
		DeclspecifierseqContext _localctx = new DeclspecifierseqContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_declspecifierseq);
		try {
			setState(1258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1251);
				declspecifier();
				setState(1253);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(1252);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1255);
				declspecifier();
				setState(1256);
				declspecifierseq();
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

	public static class StorageclassspecifierContext extends ParserRuleContext {
		public TerminalNode Register() { return getToken(MQL4Parser.Register, 0); }
		public TerminalNode Static() { return getToken(MQL4Parser.Static, 0); }
		public TerminalNode Thread_local() { return getToken(MQL4Parser.Thread_local, 0); }
		public TerminalNode Extern() { return getToken(MQL4Parser.Extern, 0); }
		public TerminalNode Mutable() { return getToken(MQL4Parser.Mutable, 0); }
		public StorageclassspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageclassspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterStorageclassspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitStorageclassspecifier(this);
		}
	}

	public final StorageclassspecifierContext storageclassspecifier() throws RecognitionException {
		StorageclassspecifierContext _localctx = new StorageclassspecifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_storageclassspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
			_la = _input.LA(1);
			if ( !(((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (Extern - 37)) | (1L << (Mutable - 37)) | (1L << (Register - 37)) | (1L << (Static - 37)) | (1L << (Thread_local - 37)))) != 0)) ) {
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

	public static class FunctionspecifierContext extends ParserRuleContext {
		public TerminalNode Inline() { return getToken(MQL4Parser.Inline, 0); }
		public TerminalNode Virtual() { return getToken(MQL4Parser.Virtual, 0); }
		public TerminalNode Explicit() { return getToken(MQL4Parser.Explicit, 0); }
		public FunctionspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterFunctionspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitFunctionspecifier(this);
		}
	}

	public final FunctionspecifierContext functionspecifier() throws RecognitionException {
		FunctionspecifierContext _localctx = new FunctionspecifierContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_functionspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262);
			_la = _input.LA(1);
			if ( !(((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & ((1L << (Explicit - 35)) | (1L << (Inline - 35)) | (1L << (Virtual - 35)))) != 0)) ) {
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

	public static class TypedefnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MQL4Parser.Identifier, 0); }
		public TypedefnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterTypedefname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitTypedefname(this);
		}
	}

	public final TypedefnameContext typedefname() throws RecognitionException {
		TypedefnameContext _localctx = new TypedefnameContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_typedefname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
			match(Identifier);
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

	public static class TypespecifierContext extends ParserRuleContext {
		public TrailingtypespecifierContext trailingtypespecifier() {
			return getRuleContext(TrailingtypespecifierContext.class,0);
		}
		public ClassspecifierContext classspecifier() {
			return getRuleContext(ClassspecifierContext.class,0);
		}
		public EnumspecifierContext enumspecifier() {
			return getRuleContext(EnumspecifierContext.class,0);
		}
		public TypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterTypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitTypespecifier(this);
		}
	}

	public final TypespecifierContext typespecifier() throws RecognitionException {
		TypespecifierContext _localctx = new TypespecifierContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_typespecifier);
		try {
			setState(1269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1266);
				trailingtypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1267);
				classspecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1268);
				enumspecifier();
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

	public static class TrailingtypespecifierContext extends ParserRuleContext {
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public ElaboratedtypespecifierContext elaboratedtypespecifier() {
			return getRuleContext(ElaboratedtypespecifierContext.class,0);
		}
		public TypenamespecifierContext typenamespecifier() {
			return getRuleContext(TypenamespecifierContext.class,0);
		}
		public CvqualifierContext cvqualifier() {
			return getRuleContext(CvqualifierContext.class,0);
		}
		public TrailingtypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingtypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterTrailingtypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitTrailingtypespecifier(this);
		}
	}

	public final TrailingtypespecifierContext trailingtypespecifier() throws RecognitionException {
		TrailingtypespecifierContext _localctx = new TrailingtypespecifierContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_trailingtypespecifier);
		try {
			setState(1275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Color:
			case Datetime:
			case Decltype:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Uchar:
			case Unshort:
			case Ulong:
			case Unsigned:
			case Void:
			case Wchar:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1271);
				simpletypespecifier();
				}
				break;
			case Class:
			case Enum:
			case Struct:
			case Union:
				enterOuterAlt(_localctx, 2);
				{
				setState(1272);
				elaboratedtypespecifier();
				}
				break;
			case Typename_:
				enterOuterAlt(_localctx, 3);
				{
				setState(1273);
				typenamespecifier();
				}
				break;
			case Const:
			case Volatile:
				enterOuterAlt(_localctx, 4);
				{
				setState(1274);
				cvqualifier();
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

	public static class TypespecifierseqContext extends ParserRuleContext {
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public TypespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typespecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterTypespecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitTypespecifierseq(this);
		}
	}

	public final TypespecifierseqContext typespecifierseq() throws RecognitionException {
		TypespecifierseqContext _localctx = new TypespecifierseqContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_typespecifierseq);
		try {
			setState(1284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1277);
				typespecifier();
				setState(1279);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1278);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1281);
				typespecifier();
				setState(1282);
				typespecifierseq();
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

	public static class TrailingtypespecifierseqContext extends ParserRuleContext {
		public TrailingtypespecifierContext trailingtypespecifier() {
			return getRuleContext(TrailingtypespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TrailingtypespecifierseqContext trailingtypespecifierseq() {
			return getRuleContext(TrailingtypespecifierseqContext.class,0);
		}
		public TrailingtypespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingtypespecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterTrailingtypespecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitTrailingtypespecifierseq(this);
		}
	}

	public final TrailingtypespecifierseqContext trailingtypespecifierseq() throws RecognitionException {
		TrailingtypespecifierseqContext _localctx = new TrailingtypespecifierseqContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_trailingtypespecifierseq);
		try {
			setState(1293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1286);
				trailingtypespecifier();
				setState(1288);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1287);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1290);
				trailingtypespecifier();
				setState(1291);
				trailingtypespecifierseq();
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

	public static class SimpletypespecifierContext extends ParserRuleContext {
		public ThetypenameContext thetypename() {
			return getRuleContext(ThetypenameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Template() { return getToken(MQL4Parser.Template, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Char() { return getToken(MQL4Parser.Char, 0); }
		public TerminalNode Char16() { return getToken(MQL4Parser.Char16, 0); }
		public TerminalNode Char32() { return getToken(MQL4Parser.Char32, 0); }
		public TerminalNode Color() { return getToken(MQL4Parser.Color, 0); }
		public TerminalNode Datetime() { return getToken(MQL4Parser.Datetime, 0); }
		public TerminalNode Wchar() { return getToken(MQL4Parser.Wchar, 0); }
		public TerminalNode Bool() { return getToken(MQL4Parser.Bool, 0); }
		public TerminalNode Short() { return getToken(MQL4Parser.Short, 0); }
		public TerminalNode Int() { return getToken(MQL4Parser.Int, 0); }
		public TerminalNode Long() { return getToken(MQL4Parser.Long, 0); }
		public TerminalNode Signed() { return getToken(MQL4Parser.Signed, 0); }
		public TerminalNode Uchar() { return getToken(MQL4Parser.Uchar, 0); }
		public TerminalNode Unsigned() { return getToken(MQL4Parser.Unsigned, 0); }
		public TerminalNode Unshort() { return getToken(MQL4Parser.Unshort, 0); }
		public TerminalNode Ulong() { return getToken(MQL4Parser.Ulong, 0); }
		public TerminalNode Float() { return getToken(MQL4Parser.Float, 0); }
		public TerminalNode Double() { return getToken(MQL4Parser.Double, 0); }
		public TerminalNode Void() { return getToken(MQL4Parser.Void, 0); }
		public TerminalNode Auto() { return getToken(MQL4Parser.Auto, 0); }
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public SimpletypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpletypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterSimpletypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitSimpletypespecifier(this);
		}
	}

	public final SimpletypespecifierContext simpletypespecifier() throws RecognitionException {
		SimpletypespecifierContext _localctx = new SimpletypespecifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_simpletypespecifier);
		try {
			setState(1323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1295);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1298);
				thetypename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1299);
				nestednamespecifier(0);
				setState(1300);
				match(Template);
				setState(1301);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1303);
				match(Char);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1304);
				match(Char16);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1305);
				match(Char32);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1306);
				match(Color);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1307);
				match(Datetime);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1308);
				match(Wchar);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1309);
				match(Bool);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1310);
				match(Short);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1311);
				match(Int);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1312);
				match(Long);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1313);
				match(Signed);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1314);
				match(Uchar);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1315);
				match(Unsigned);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1316);
				match(Unshort);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1317);
				match(Ulong);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1318);
				match(Float);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1319);
				match(Double);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1320);
				match(Void);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1321);
				match(Auto);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1322);
				decltypespecifier();
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

	public static class ThetypenameContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public EnumnameContext enumname() {
			return getRuleContext(EnumnameContext.class,0);
		}
		public TypedefnameContext typedefname() {
			return getRuleContext(TypedefnameContext.class,0);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public ThetypenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thetypename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterThetypename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitThetypename(this);
		}
	}

	public final ThetypenameContext thetypename() throws RecognitionException {
		ThetypenameContext _localctx = new ThetypenameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_thetypename);
		try {
			setState(1329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1325);
				classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1326);
				enumname();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1327);
				typedefname();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1328);
				simpletemplateid();
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

	public static class DecltypespecifierContext extends ParserRuleContext {
		public TerminalNode Decltype() { return getToken(MQL4Parser.Decltype, 0); }
		public TerminalNode LeftParen() { return getToken(MQL4Parser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MQL4Parser.RightParen, 0); }
		public TerminalNode Auto() { return getToken(MQL4Parser.Auto, 0); }
		public DecltypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decltypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterDecltypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitDecltypespecifier(this);
		}
	}

	public final DecltypespecifierContext decltypespecifier() throws RecognitionException {
		DecltypespecifierContext _localctx = new DecltypespecifierContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_decltypespecifier);
		try {
			setState(1340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1331);
				match(Decltype);
				setState(1332);
				match(LeftParen);
				setState(1333);
				expression(0);
				setState(1334);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1336);
				match(Decltype);
				setState(1337);
				match(LeftParen);
				setState(1338);
				match(Auto);
				setState(1339);
				match(RightParen);
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

	public static class ElaboratedtypespecifierContext extends ParserRuleContext {
		public ClasskeyContext classkey() {
			return getRuleContext(ClasskeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MQL4Parser.Identifier, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Template() { return getToken(MQL4Parser.Template, 0); }
		public TerminalNode Enum() { return getToken(MQL4Parser.Enum, 0); }
		public ElaboratedtypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elaboratedtypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterElaboratedtypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitElaboratedtypespecifier(this);
		}
	}

	public final ElaboratedtypespecifierContext elaboratedtypespecifier() throws RecognitionException {
		ElaboratedtypespecifierContext _localctx = new ElaboratedtypespecifierContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_elaboratedtypespecifier);
		int _la;
		try {
			setState(1366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1342);
				classkey();
				setState(1344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1343);
					attributespecifierseq(0);
					}
				}

				setState(1347);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(1346);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1349);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1351);
				classkey();
				setState(1352);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1354);
				classkey();
				setState(1355);
				nestednamespecifier(0);
				setState(1357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(1356);
					match(Template);
					}
				}

				setState(1359);
				simpletemplateid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1361);
				match(Enum);
				setState(1363);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1362);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1365);
				match(Identifier);
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

	public static class EnumnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MQL4Parser.Identifier, 0); }
		public EnumnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterEnumname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitEnumname(this);
		}
	}

	public final EnumnameContext enumname() throws RecognitionException {
		EnumnameContext _localctx = new EnumnameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_enumname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1368);
			match(Identifier);
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

	public static class EnumspecifierContext extends ParserRuleContext {
		public EnumheadContext enumhead() {
			return getRuleContext(EnumheadContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(MQL4Parser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(MQL4Parser.RightBrace, 0); }
		public EnumeratorlistContext enumeratorlist() {
			return getRuleContext(EnumeratorlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MQL4Parser.Comma, 0); }
		public EnumspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterEnumspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitEnumspecifier(this);
		}
	}

	public final EnumspecifierContext enumspecifier() throws RecognitionException {
		EnumspecifierContext _localctx = new EnumspecifierContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_enumspecifier);
		int _la;
		try {
			setState(1383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1370);
				enumhead();
				setState(1371);
				match(LeftBrace);
				setState(1373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1372);
					enumeratorlist(0);
					}
				}

				setState(1375);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1377);
				enumhead();
				setState(1378);
				match(LeftBrace);
				setState(1379);
				enumeratorlist(0);
				setState(1380);
				match(Comma);
				setState(1381);
				match(RightBrace);
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

	public static class EnumheadContext extends ParserRuleContext {
		public EnumkeyContext enumkey() {
			return getRuleContext(EnumkeyContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MQL4Parser.Identifier, 0); }
		public EnumbaseContext enumbase() {
			return getRuleContext(EnumbaseContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public EnumheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumhead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterEnumhead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitEnumhead(this);
		}
	}

	public final EnumheadContext enumhead() throws RecognitionException {
		EnumheadContext _localctx = new EnumheadContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_enumhead);
		int _la;
		try {
			setState(1404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1385);
				enumkey();
				setState(1387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1386);
					attributespecifierseq(0);
					}
				}

				setState(1390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1389);
					match(Identifier);
					}
				}

				setState(1393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1392);
					enumbase();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1395);
				enumkey();
				setState(1397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1396);
					attributespecifierseq(0);
					}
				}

				setState(1399);
				nestednamespecifier(0);
				setState(1400);
				match(Identifier);
				setState(1402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1401);
					enumbase();
					}
				}

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

	public static class OpaqueenumdeclarationContext extends ParserRuleContext {
		public EnumkeyContext enumkey() {
			return getRuleContext(EnumkeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MQL4Parser.Identifier, 0); }
		public TerminalNode Semi() { return getToken(MQL4Parser.Semi, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public EnumbaseContext enumbase() {
			return getRuleContext(EnumbaseContext.class,0);
		}
		public OpaqueenumdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opaqueenumdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterOpaqueenumdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitOpaqueenumdeclaration(this);
		}
	}

	public final OpaqueenumdeclarationContext opaqueenumdeclaration() throws RecognitionException {
		OpaqueenumdeclarationContext _localctx = new OpaqueenumdeclarationContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_opaqueenumdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1406);
			enumkey();
			setState(1408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1407);
				attributespecifierseq(0);
				}
			}

			setState(1410);
			match(Identifier);
			setState(1412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1411);
				enumbase();
				}
			}

			setState(1414);
			match(Semi);
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

	public static class EnumkeyContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(MQL4Parser.Enum, 0); }
		public TerminalNode Class() { return getToken(MQL4Parser.Class, 0); }
		public TerminalNode Struct() { return getToken(MQL4Parser.Struct, 0); }
		public EnumkeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumkey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterEnumkey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitEnumkey(this);
		}
	}

	public final EnumkeyContext enumkey() throws RecognitionException {
		EnumkeyContext _localctx = new EnumkeyContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_enumkey);
		try {
			setState(1421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1416);
				match(Enum);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1417);
				match(Enum);
				setState(1418);
				match(Class);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1419);
				match(Enum);
				setState(1420);
				match(Struct);
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

	public static class EnumbaseContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(MQL4Parser.Colon, 0); }
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public EnumbaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumbase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterEnumbase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitEnumbase(this);
		}
	}

	public final EnumbaseContext enumbase() throws RecognitionException {
		EnumbaseContext _localctx = new EnumbaseContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_enumbase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1423);
			match(Colon);
			setState(1424);
			typespecifierseq();
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

	public static class EnumeratorlistContext extends ParserRuleContext {
		public EnumeratordefinitionContext enumeratordefinition() {
			return getRuleContext(EnumeratordefinitionContext.class,0);
		}
		public EnumeratorlistContext enumeratorlist() {
			return getRuleContext(EnumeratorlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MQL4Parser.Comma, 0); }
		public EnumeratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterEnumeratorlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitEnumeratorlist(this);
		}
	}

	public final EnumeratorlistContext enumeratorlist() throws RecognitionException {
		return enumeratorlist(0);
	}

	private EnumeratorlistContext enumeratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EnumeratorlistContext _localctx = new EnumeratorlistContext(_ctx, _parentState);
		EnumeratorlistContext _prevctx = _localctx;
		int _startState = 176;
		enterRecursionRule(_localctx, 176, RULE_enumeratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1427);
			enumeratordefinition();
			}
			_ctx.stop = _input.LT(-1);
			setState(1434);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorlist);
					setState(1429);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1430);
					match(Comma);
					setState(1431);
					enumeratordefinition();
					}
					} 
				}
				setState(1436);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EnumeratordefinitionContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(MQL4Parser.Assign, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public EnumeratordefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratordefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterEnumeratordefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitEnumeratordefinition(this);
		}
	}

	public final EnumeratordefinitionContext enumeratordefinition() throws RecognitionException {
		EnumeratordefinitionContext _localctx = new EnumeratordefinitionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_enumeratordefinition);
		try {
			setState(1442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1437);
				enumerator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1438);
				enumerator();
				setState(1439);
				match(Assign);
				setState(1440);
				constantexpression();
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

	public static class EnumeratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MQL4Parser.Identifier, 0); }
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitEnumerator(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_enumerator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1444);
			match(Identifier);
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

	public static class NamespacenameContext extends ParserRuleContext {
		public OriginalnamespacenameContext originalnamespacename() {
			return getRuleContext(OriginalnamespacenameContext.class,0);
		}
		public NamespacealiasContext namespacealias() {
			return getRuleContext(NamespacealiasContext.class,0);
		}
		public NamespacenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterNamespacename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitNamespacename(this);
		}
	}

	public final NamespacenameContext namespacename() throws RecognitionException {
		NamespacenameContext _localctx = new NamespacenameContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_namespacename);
		try {
			setState(1448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1446);
				originalnamespacename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1447);
				namespacealias();
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

	public static class OriginalnamespacenameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MQL4Parser.Identifier, 0); }
		public OriginalnamespacenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalnamespacename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterOriginalnamespacename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitOriginalnamespacename(this);
		}
	}

	public final OriginalnamespacenameContext originalnamespacename() throws RecognitionException {
		OriginalnamespacenameContext _localctx = new OriginalnamespacenameContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_originalnamespacename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1450);
			match(Identifier);
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

	public static class NamespacedefinitionContext extends ParserRuleContext {
		public NamednamespacedefinitionContext namednamespacedefinition() {
			return getRuleContext(NamednamespacedefinitionContext.class,0);
		}
		public UnnamednamespacedefinitionContext unnamednamespacedefinition() {
			return getRuleContext(UnnamednamespacedefinitionContext.class,0);
		}
		public NamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterNamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitNamespacedefinition(this);
		}
	}

	public final NamespacedefinitionContext namespacedefinition() throws RecognitionException {
		NamespacedefinitionContext _localctx = new NamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_namespacedefinition);
		try {
			setState(1454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1452);
				namednamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1453);
				unnamednamespacedefinition();
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

	public static class NamednamespacedefinitionContext extends ParserRuleContext {
		public OriginalnamespacedefinitionContext originalnamespacedefinition() {
			return getRuleContext(OriginalnamespacedefinitionContext.class,0);
		}
		public ExtensionnamespacedefinitionContext extensionnamespacedefinition() {
			return getRuleContext(ExtensionnamespacedefinitionContext.class,0);
		}
		public NamednamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namednamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterNamednamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitNamednamespacedefinition(this);
		}
	}

	public final NamednamespacedefinitionContext namednamespacedefinition() throws RecognitionException {
		NamednamespacedefinitionContext _localctx = new NamednamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_namednamespacedefinition);
		try {
			setState(1458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1456);
				originalnamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1457);
				extensionnamespacedefinition();
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

	public static class OriginalnamespacedefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(MQL4Parser.Namespace, 0); }
		public TerminalNode Identifier() { return getToken(MQL4Parser.Identifier, 0); }
		public TerminalNode LeftBrace() { return getToken(MQL4Parser.LeftBrace, 0); }
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(MQL4Parser.RightBrace, 0); }
		public TerminalNode Inline() { return getToken(MQL4Parser.Inline, 0); }
		public OriginalnamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalnamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterOriginalnamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitOriginalnamespacedefinition(this);
		}
	}

	public final OriginalnamespacedefinitionContext originalnamespacedefinition() throws RecognitionException {
		OriginalnamespacedefinitionContext _localctx = new OriginalnamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_originalnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1460);
				match(Inline);
				}
			}

			setState(1463);
			match(Namespace);
			setState(1464);
			match(Identifier);
			setState(1465);
			match(LeftBrace);
			setState(1466);
			namespacebody();
			setState(1467);
			match(RightBrace);
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

	public static class ExtensionnamespacedefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(MQL4Parser.Namespace, 0); }
		public OriginalnamespacenameContext originalnamespacename() {
			return getRuleContext(OriginalnamespacenameContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(MQL4Parser.LeftBrace, 0); }
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(MQL4Parser.RightBrace, 0); }
		public TerminalNode Inline() { return getToken(MQL4Parser.Inline, 0); }
		public ExtensionnamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionnamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterExtensionnamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitExtensionnamespacedefinition(this);
		}
	}

	public final ExtensionnamespacedefinitionContext extensionnamespacedefinition() throws RecognitionException {
		ExtensionnamespacedefinitionContext _localctx = new ExtensionnamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_extensionnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1469);
				match(Inline);
				}
			}

			setState(1472);
			match(Namespace);
			setState(1473);
			originalnamespacename();
			setState(1474);
			match(LeftBrace);
			setState(1475);
			namespacebody();
			setState(1476);
			match(RightBrace);
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

	public static class UnnamednamespacedefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(MQL4Parser.Namespace, 0); }
		public TerminalNode LeftBrace() { return getToken(MQL4Parser.LeftBrace, 0); }
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(MQL4Parser.RightBrace, 0); }
		public TerminalNode Inline() { return getToken(MQL4Parser.Inline, 0); }
		public UnnamednamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unnamednamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterUnnamednamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitUnnamednamespacedefinition(this);
		}
	}

	public final UnnamednamespacedefinitionContext unnamednamespacedefinition() throws RecognitionException {
		UnnamednamespacedefinitionContext _localctx = new UnnamednamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_unnamednamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1478);
				match(Inline);
				}
			}

			setState(1481);
			match(Namespace);
			setState(1482);
			match(LeftBrace);
			setState(1483);
			namespacebody();
			setState(1484);
			match(RightBrace);
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

	public static class NamespacebodyContext extends ParserRuleContext {
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public NamespacebodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacebody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterNamespacebody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitNamespacebody(this);
		}
	}

	public final NamespacebodyContext namespacebody() throws RecognitionException {
		NamespacebodyContext _localctx = new NamespacebodyContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_namespacebody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Color) | (1L << Const) | (1L << Constexpr) | (1L << Datetime) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Struct - 64)) | (1L << (Template - 64)) | (1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename_ - 64)) | (1L << (Uchar - 64)) | (1L << (Union - 64)) | (1L << (Unshort - 64)) | (1L << (Ulong - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (Doublecolon - 134)) | (1L << (Semi - 134)) | (1L << (Ellipsis - 134)) | (1L << (Identifier - 134)))) != 0)) {
				{
				setState(1486);
				declarationseq(0);
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

	public static class NamespacealiasContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MQL4Parser.Identifier, 0); }
		public NamespacealiasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacealias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterNamespacealias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitNamespacealias(this);
		}
	}

	public final NamespacealiasContext namespacealias() throws RecognitionException {
		NamespacealiasContext _localctx = new NamespacealiasContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_namespacealias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1489);
			match(Identifier);
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

	public static class NamespacealiasdefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(MQL4Parser.Namespace, 0); }
		public TerminalNode Identifier() { return getToken(MQL4Parser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(MQL4Parser.Assign, 0); }
		public QualifiednamespacespecifierContext qualifiednamespacespecifier() {
			return getRuleContext(QualifiednamespacespecifierContext.class,0);
		}
		public TerminalNode Semi() { return getToken(MQL4Parser.Semi, 0); }
		public NamespacealiasdefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacealiasdefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterNamespacealiasdefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitNamespacealiasdefinition(this);
		}
	}

	public final NamespacealiasdefinitionContext namespacealiasdefinition() throws RecognitionException {
		NamespacealiasdefinitionContext _localctx = new NamespacealiasdefinitionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_namespacealiasdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1491);
			match(Namespace);
			setState(1492);
			match(Identifier);
			setState(1493);
			match(Assign);
			setState(1494);
			qualifiednamespacespecifier();
			setState(1495);
			match(Semi);
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

	public static class QualifiednamespacespecifierContext extends ParserRuleContext {
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public QualifiednamespacespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiednamespacespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterQualifiednamespacespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitQualifiednamespacespecifier(this);
		}
	}

	public final QualifiednamespacespecifierContext qualifiednamespacespecifier() throws RecognitionException {
		QualifiednamespacespecifierContext _localctx = new QualifiednamespacespecifierContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_qualifiednamespacespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1497);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1500);
			namespacename();
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

	public static class UsingdeclarationContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(MQL4Parser.Using, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public TerminalNode Semi() { return getToken(MQL4Parser.Semi, 0); }
		public TerminalNode Typename_() { return getToken(MQL4Parser.Typename_, 0); }
		public TerminalNode Doublecolon() { return getToken(MQL4Parser.Doublecolon, 0); }
		public UsingdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterUsingdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitUsingdeclaration(this);
		}
	}

	public final UsingdeclarationContext usingdeclaration() throws RecognitionException {
		UsingdeclarationContext _localctx = new UsingdeclarationContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_usingdeclaration);
		int _la;
		try {
			setState(1515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1502);
				match(Using);
				setState(1504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Typename_) {
					{
					setState(1503);
					match(Typename_);
					}
				}

				setState(1506);
				nestednamespecifier(0);
				setState(1507);
				unqualifiedid();
				setState(1508);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1510);
				match(Using);
				setState(1511);
				match(Doublecolon);
				setState(1512);
				unqualifiedid();
				setState(1513);
				match(Semi);
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

	public static class UsingdirectiveContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(MQL4Parser.Using, 0); }
		public TerminalNode Namespace() { return getToken(MQL4Parser.Namespace, 0); }
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public TerminalNode Semi() { return getToken(MQL4Parser.Semi, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public UsingdirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingdirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterUsingdirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitUsingdirective(this);
		}
	}

	public final UsingdirectiveContext usingdirective() throws RecognitionException {
		UsingdirectiveContext _localctx = new UsingdirectiveContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_usingdirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1517);
				attributespecifierseq(0);
				}
			}

			setState(1520);
			match(Using);
			setState(1521);
			match(Namespace);
			setState(1523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1522);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1525);
			namespacename();
			setState(1526);
			match(Semi);
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

	public static class AsmdefinitionContext extends ParserRuleContext {
		public TerminalNode Asm() { return getToken(MQL4Parser.Asm, 0); }
		public TerminalNode LeftParen() { return getToken(MQL4Parser.LeftParen, 0); }
		public TerminalNode Stringliteral() { return getToken(MQL4Parser.Stringliteral, 0); }
		public TerminalNode RightParen() { return getToken(MQL4Parser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(MQL4Parser.Semi, 0); }
		public AsmdefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmdefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterAsmdefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitAsmdefinition(this);
		}
	}

	public final AsmdefinitionContext asmdefinition() throws RecognitionException {
		AsmdefinitionContext _localctx = new AsmdefinitionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_asmdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1528);
			match(Asm);
			setState(1529);
			match(LeftParen);
			setState(1530);
			match(Stringliteral);
			setState(1531);
			match(RightParen);
			setState(1532);
			match(Semi);
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

	public static class LinkagespecificationContext extends ParserRuleContext {
		public TerminalNode Extern() { return getToken(MQL4Parser.Extern, 0); }
		public TerminalNode Stringliteral() { return getToken(MQL4Parser.Stringliteral, 0); }
		public TerminalNode LeftBrace() { return getToken(MQL4Parser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(MQL4Parser.RightBrace, 0); }
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public LinkagespecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkagespecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterLinkagespecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitLinkagespecification(this);
		}
	}

	public final LinkagespecificationContext linkagespecification() throws RecognitionException {
		LinkagespecificationContext _localctx = new LinkagespecificationContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_linkagespecification);
		int _la;
		try {
			setState(1544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1534);
				match(Extern);
				setState(1535);
				match(Stringliteral);
				setState(1536);
				match(LeftBrace);
				setState(1538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Color) | (1L << Const) | (1L << Constexpr) | (1L << Datetime) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Struct - 64)) | (1L << (Template - 64)) | (1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename_ - 64)) | (1L << (Uchar - 64)) | (1L << (Union - 64)) | (1L << (Unshort - 64)) | (1L << (Ulong - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (Doublecolon - 134)) | (1L << (Semi - 134)) | (1L << (Ellipsis - 134)) | (1L << (Identifier - 134)))) != 0)) {
					{
					setState(1537);
					declarationseq(0);
					}
				}

				setState(1540);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1541);
				match(Extern);
				setState(1542);
				match(Stringliteral);
				setState(1543);
				declaration();
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

	public static class AttributespecifierseqContext extends ParserRuleContext {
		public AttributespecifierContext attributespecifier() {
			return getRuleContext(AttributespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AttributespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributespecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterAttributespecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitAttributespecifierseq(this);
		}
	}

	public final AttributespecifierseqContext attributespecifierseq() throws RecognitionException {
		return attributespecifierseq(0);
	}

	private AttributespecifierseqContext attributespecifierseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AttributespecifierseqContext _localctx = new AttributespecifierseqContext(_ctx, _parentState);
		AttributespecifierseqContext _prevctx = _localctx;
		int _startState = 212;
		enterRecursionRule(_localctx, 212, RULE_attributespecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1547);
			attributespecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1553);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AttributespecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_attributespecifierseq);
					setState(1549);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1550);
					attributespecifier();
					}
					} 
				}
				setState(1555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AttributespecifierContext extends ParserRuleContext {
		public List<TerminalNode> LeftBracket() { return getTokens(MQL4Parser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(MQL4Parser.LeftBracket, i);
		}
		public AttributelistContext attributelist() {
			return getRuleContext(AttributelistContext.class,0);
		}
		public List<TerminalNode> RightBracket() { return getTokens(MQL4Parser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(MQL4Parser.RightBracket, i);
		}
		public AlignmentspecifierContext alignmentspecifier() {
			return getRuleContext(AlignmentspecifierContext.class,0);
		}
		public AttributespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterAttributespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitAttributespecifier(this);
		}
	}

	public final AttributespecifierContext attributespecifier() throws RecognitionException {
		AttributespecifierContext _localctx = new AttributespecifierContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_attributespecifier);
		try {
			setState(1563);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1556);
				match(LeftBracket);
				setState(1557);
				match(LeftBracket);
				setState(1558);
				attributelist(0);
				setState(1559);
				match(RightBracket);
				setState(1560);
				match(RightBracket);
				}
				break;
			case Alignas:
				enterOuterAlt(_localctx, 2);
				{
				setState(1562);
				alignmentspecifier();
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

	public static class AlignmentspecifierContext extends ParserRuleContext {
		public TerminalNode Alignas() { return getToken(MQL4Parser.Alignas, 0); }
		public TerminalNode LeftParen() { return getToken(MQL4Parser.LeftParen, 0); }
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MQL4Parser.RightParen, 0); }
		public TerminalNode Ellipsis() { return getToken(MQL4Parser.Ellipsis, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public AlignmentspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterAlignmentspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitAlignmentspecifier(this);
		}
	}

	public final AlignmentspecifierContext alignmentspecifier() throws RecognitionException {
		AlignmentspecifierContext _localctx = new AlignmentspecifierContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_alignmentspecifier);
		int _la;
		try {
			setState(1581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1565);
				match(Alignas);
				setState(1566);
				match(LeftParen);
				setState(1567);
				thetypeid();
				setState(1569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1568);
					match(Ellipsis);
					}
				}

				setState(1571);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1573);
				match(Alignas);
				setState(1574);
				match(LeftParen);
				setState(1575);
				constantexpression();
				setState(1577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1576);
					match(Ellipsis);
					}
				}

				setState(1579);
				match(RightParen);
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

	public static class AttributelistContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(MQL4Parser.Ellipsis, 0); }
		public AttributelistContext attributelist() {
			return getRuleContext(AttributelistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MQL4Parser.Comma, 0); }
		public AttributelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterAttributelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitAttributelist(this);
		}
	}

	public final AttributelistContext attributelist() throws RecognitionException {
		return attributelist(0);
	}

	private AttributelistContext attributelist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AttributelistContext _localctx = new AttributelistContext(_ctx, _parentState);
		AttributelistContext _prevctx = _localctx;
		int _startState = 218;
		enterRecursionRule(_localctx, 218, RULE_attributelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1585);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1584);
					attribute();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1587);
				attribute();
				setState(1588);
				match(Ellipsis);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1604);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1602);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
					case 1:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1592);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1593);
						match(Comma);
						setState(1595);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
						case 1:
							{
							setState(1594);
							attribute();
							}
							break;
						}
						}
						break;
					case 2:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1597);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1598);
						match(Comma);
						setState(1599);
						attribute();
						setState(1600);
						match(Ellipsis);
						}
						break;
					}
					} 
				}
				setState(1606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public AttributetokenContext attributetoken() {
			return getRuleContext(AttributetokenContext.class,0);
		}
		public AttributeargumentclauseContext attributeargumentclause() {
			return getRuleContext(AttributeargumentclauseContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1607);
			attributetoken();
			setState(1609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1608);
				attributeargumentclause();
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

	public static class AttributetokenContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MQL4Parser.Identifier, 0); }
		public AttributescopedtokenContext attributescopedtoken() {
			return getRuleContext(AttributescopedtokenContext.class,0);
		}
		public AttributetokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributetoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterAttributetoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitAttributetoken(this);
		}
	}

	public final AttributetokenContext attributetoken() throws RecognitionException {
		AttributetokenContext _localctx = new AttributetokenContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_attributetoken);
		try {
			setState(1613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1611);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1612);
				attributescopedtoken();
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

	public static class AttributescopedtokenContext extends ParserRuleContext {
		public AttributenamespaceContext attributenamespace() {
			return getRuleContext(AttributenamespaceContext.class,0);
		}
		public TerminalNode Doublecolon() { return getToken(MQL4Parser.Doublecolon, 0); }
		public TerminalNode Identifier() { return getToken(MQL4Parser.Identifier, 0); }
		public AttributescopedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributescopedtoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterAttributescopedtoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitAttributescopedtoken(this);
		}
	}

	public final AttributescopedtokenContext attributescopedtoken() throws RecognitionException {
		AttributescopedtokenContext _localctx = new AttributescopedtokenContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_attributescopedtoken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1615);
			attributenamespace();
			setState(1616);
			match(Doublecolon);
			setState(1617);
			match(Identifier);
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

	public static class AttributenamespaceContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MQL4Parser.Identifier, 0); }
		public AttributenamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributenamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterAttributenamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitAttributenamespace(this);
		}
	}

	public final AttributenamespaceContext attributenamespace() throws RecognitionException {
		AttributenamespaceContext _localctx = new AttributenamespaceContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_attributenamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1619);
			match(Identifier);
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

	public static class AttributeargumentclauseContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(MQL4Parser.LeftParen, 0); }
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MQL4Parser.RightParen, 0); }
		public AttributeargumentclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeargumentclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterAttributeargumentclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitAttributeargumentclause(this);
		}
	}

	public final AttributeargumentclauseContext attributeargumentclause() throws RecognitionException {
		AttributeargumentclauseContext _localctx = new AttributeargumentclauseContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_attributeargumentclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1621);
			match(LeftParen);
			setState(1622);
			balancedtokenseq(0);
			setState(1623);
			match(RightParen);
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

	public static class BalancedtokenseqContext extends ParserRuleContext {
		public BalancedtokenContext balancedtoken() {
			return getRuleContext(BalancedtokenContext.class,0);
		}
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public BalancedtokenseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedtokenseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterBalancedtokenseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitBalancedtokenseq(this);
		}
	}

	public final BalancedtokenseqContext balancedtokenseq() throws RecognitionException {
		return balancedtokenseq(0);
	}

	private BalancedtokenseqContext balancedtokenseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BalancedtokenseqContext _localctx = new BalancedtokenseqContext(_ctx, _parentState);
		BalancedtokenseqContext _prevctx = _localctx;
		int _startState = 230;
		enterRecursionRule(_localctx, 230, RULE_balancedtokenseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1626);
				balancedtoken();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1633);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BalancedtokenseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_balancedtokenseq);
					setState(1629);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1630);
					balancedtoken();
					}
					} 
				}
				setState(1635);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BalancedtokenContext extends ParserRuleContext {
		public List<TerminalNode> LeftParen() { return getTokens(MQL4Parser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(MQL4Parser.LeftParen, i);
		}
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(MQL4Parser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(MQL4Parser.RightParen, i);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(MQL4Parser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(MQL4Parser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(MQL4Parser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(MQL4Parser.RightBracket, i);
		}
		public List<TerminalNode> LeftBrace() { return getTokens(MQL4Parser.LeftBrace); }
		public TerminalNode LeftBrace(int i) {
			return getToken(MQL4Parser.LeftBrace, i);
		}
		public List<TerminalNode> RightBrace() { return getTokens(MQL4Parser.RightBrace); }
		public TerminalNode RightBrace(int i) {
			return getToken(MQL4Parser.RightBrace, i);
		}
		public BalancedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedtoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterBalancedtoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitBalancedtoken(this);
		}
	}

	public final BalancedtokenContext balancedtoken() throws RecognitionException {
		BalancedtokenContext _localctx = new BalancedtokenContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_balancedtoken);
		int _la;
		try {
			int _alt;
			setState(1653);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(1636);
				match(LeftParen);
				setState(1637);
				balancedtokenseq(0);
				setState(1638);
				match(RightParen);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1640);
				match(LeftBracket);
				setState(1641);
				balancedtokenseq(0);
				setState(1642);
				match(RightBracket);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(1644);
				match(LeftBrace);
				setState(1645);
				balancedtokenseq(0);
				setState(1646);
				match(RightBrace);
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case MultiLineMacro:
			case Directive:
			case Alignas:
			case Alignof:
			case Asm:
			case Auto:
			case Bool:
			case Break:
			case Case:
			case Catch:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Color:
			case Const:
			case Constexpr:
			case Const_cast:
			case Continue:
			case Datetime:
			case Decltype:
			case Default:
			case Delete:
			case Do:
			case Double:
			case Dynamic_cast:
			case Else:
			case Enum:
			case Explicit:
			case Export:
			case Extern:
			case False:
			case Final:
			case Float:
			case For:
			case Friend:
			case Goto:
			case If:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Namespace:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Override:
			case Private:
			case Protected:
			case Public:
			case Register:
			case Reinterpret_cast:
			case Return:
			case Short:
			case Signed:
			case Sizeof:
			case Static:
			case Static_assert:
			case Static_cast:
			case Struct:
			case Switch:
			case Template:
			case This:
			case Thread_local:
			case Throw:
			case True:
			case Try:
			case Typedef:
			case Typeid_:
			case Typename_:
			case Uchar:
			case Union:
			case Unshort:
			case Uint:
			case Ulong:
			case Unsigned:
			case Using:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case While:
			case Plus:
			case Minus:
			case Star:
			case Div:
			case Mod:
			case Caret:
			case And:
			case Or:
			case Tilde:
			case Not:
			case Assign:
			case Less:
			case Greater:
			case PlusAssign:
			case MinusAssign:
			case StarAssign:
			case DivAssign:
			case ModAssign:
			case XorAssign:
			case AndAssign:
			case OrAssign:
			case LeftShift:
			case RightShift:
			case LeftShiftAssign:
			case RightShiftAssign:
			case Equal:
			case NotEqual:
			case LessEqual:
			case GreaterEqual:
			case AndAnd:
			case OrOr:
			case PlusPlus:
			case MinusMinus:
			case Comma:
			case ArrowStar:
			case Arrow:
			case Question:
			case Colon:
			case Doublecolon:
			case Semi:
			case Dot:
			case DotStar:
			case Ellipsis:
			case Identifier:
			case Integerliteral:
			case Decimalliteral:
			case Octalliteral:
			case ColorLiteral:
			case DatetimeLiteral:
			case Hexadecimalliteral:
			case Binaryliteral:
			case Integersuffix:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
			case Whitespace:
			case Newline:
			case BlockComment:
			case LineComment:
				enterOuterAlt(_localctx, 4);
				{
				setState(1649); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1648);
						_la = _input.LA(1);
						if ( _la <= 0 || (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (LeftParen - 90)) | (1L << (RightParen - 90)) | (1L << (LeftBracket - 90)) | (1L << (RightBracket - 90)) | (1L << (LeftBrace - 90)) | (1L << (RightBrace - 90)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1651); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
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

	public static class InitdeclaratorlistContext extends ParserRuleContext {
		public InitdeclaratorContext initdeclarator() {
			return getRuleContext(InitdeclaratorContext.class,0);
		}
		public InitdeclaratorlistContext initdeclaratorlist() {
			return getRuleContext(InitdeclaratorlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MQL4Parser.Comma, 0); }
		public InitdeclaratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initdeclaratorlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterInitdeclaratorlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitInitdeclaratorlist(this);
		}
	}

	public final InitdeclaratorlistContext initdeclaratorlist() throws RecognitionException {
		return initdeclaratorlist(0);
	}

	private InitdeclaratorlistContext initdeclaratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitdeclaratorlistContext _localctx = new InitdeclaratorlistContext(_ctx, _parentState);
		InitdeclaratorlistContext _prevctx = _localctx;
		int _startState = 234;
		enterRecursionRule(_localctx, 234, RULE_initdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1656);
			initdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1663);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initdeclaratorlist);
					setState(1658);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1659);
					match(Comma);
					setState(1660);
					initdeclarator();
					}
					} 
				}
				setState(1665);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InitdeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterInitdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitInitdeclarator(this);
		}
	}

	public final InitdeclaratorContext initdeclarator() throws RecognitionException {
		InitdeclaratorContext _localctx = new InitdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_initdeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1666);
			declarator();
			setState(1668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1667);
				initializer();
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

	public static class DeclaratorContext extends ParserRuleContext {
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_declarator);
		try {
			setState(1675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1670);
				ptrdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1671);
				noptrdeclarator(0);
				setState(1672);
				parametersandqualifiers();
				setState(1673);
				trailingreturntype();
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

	public static class PtrdeclaratorContext extends ParserRuleContext {
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public PtrdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterPtrdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitPtrdeclarator(this);
		}
	}

	public final PtrdeclaratorContext ptrdeclarator() throws RecognitionException {
		PtrdeclaratorContext _localctx = new PtrdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_ptrdeclarator);
		try {
			setState(1681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1677);
				noptrdeclarator(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1678);
				ptroperator();
				setState(1679);
				ptrdeclarator();
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

	public static class NoptrdeclaratorContext extends ParserRuleContext {
		public DeclaratoridContext declaratorid() {
			return getRuleContext(DeclaratoridContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(MQL4Parser.LeftParen, 0); }
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MQL4Parser.RightParen, 0); }
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(MQL4Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(MQL4Parser.RightBracket, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoptrdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterNoptrdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitNoptrdeclarator(this);
		}
	}

	public final NoptrdeclaratorContext noptrdeclarator() throws RecognitionException {
		return noptrdeclarator(0);
	}

	private NoptrdeclaratorContext noptrdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrdeclaratorContext _localctx = new NoptrdeclaratorContext(_ctx, _parentState);
		NoptrdeclaratorContext _prevctx = _localctx;
		int _startState = 242;
		enterRecursionRule(_localctx, 242, RULE_noptrdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1692);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Ellipsis:
			case Identifier:
				{
				setState(1684);
				declaratorid();
				setState(1686);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1685);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case LeftParen:
				{
				setState(1688);
				match(LeftParen);
				setState(1689);
				ptrdeclarator();
				setState(1690);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1707);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1705);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1694);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1695);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1696);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1697);
						match(LeftBracket);
						setState(1699);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Color) | (1L << Const_cast) | (1L << Datetime) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Uchar - 66)) | (1L << (Unshort - 66)) | (1L << (Ulong - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (Doublecolon - 134)) | (1L << (Identifier - 134)) | (1L << (Integerliteral - 134)) | (1L << (ColorLiteral - 134)) | (1L << (DatetimeLiteral - 134)) | (1L << (Characterliteral - 134)) | (1L << (Floatingliteral - 134)) | (1L << (Stringliteral - 134)) | (1L << (Userdefinedintegerliteral - 134)) | (1L << (Userdefinedfloatingliteral - 134)) | (1L << (Userdefinedstringliteral - 134)) | (1L << (Userdefinedcharacterliteral - 134)))) != 0)) {
							{
							setState(1698);
							constantexpression();
							}
						}

						setState(1701);
						match(RightBracket);
						setState(1703);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
						case 1:
							{
							setState(1702);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1709);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParametersandqualifiersContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(MQL4Parser.LeftParen, 0); }
		public ParameterdeclarationclauseContext parameterdeclarationclause() {
			return getRuleContext(ParameterdeclarationclauseContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MQL4Parser.RightParen, 0); }
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public RefqualifierContext refqualifier() {
			return getRuleContext(RefqualifierContext.class,0);
		}
		public ExceptionspecificationContext exceptionspecification() {
			return getRuleContext(ExceptionspecificationContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ParametersandqualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersandqualifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterParametersandqualifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitParametersandqualifiers(this);
		}
	}

	public final ParametersandqualifiersContext parametersandqualifiers() throws RecognitionException {
		ParametersandqualifiersContext _localctx = new ParametersandqualifiersContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_parametersandqualifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1710);
			match(LeftParen);
			setState(1711);
			parameterdeclarationclause();
			setState(1712);
			match(RightParen);
			setState(1714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1713);
				cvqualifierseq();
				}
				break;
			}
			setState(1717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1716);
				refqualifier();
				}
				break;
			}
			setState(1720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1719);
				exceptionspecification();
				}
				break;
			}
			setState(1723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1722);
				attributespecifierseq(0);
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

	public static class TrailingreturntypeContext extends ParserRuleContext {
		public TerminalNode Arrow() { return getToken(MQL4Parser.Arrow, 0); }
		public TrailingtypespecifierseqContext trailingtypespecifierseq() {
			return getRuleContext(TrailingtypespecifierseqContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public TrailingreturntypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingreturntype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterTrailingreturntype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitTrailingreturntype(this);
		}
	}

	public final TrailingreturntypeContext trailingreturntype() throws RecognitionException {
		TrailingreturntypeContext _localctx = new TrailingreturntypeContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_trailingreturntype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1725);
			match(Arrow);
			setState(1726);
			trailingtypespecifierseq();
			setState(1728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1727);
				abstractdeclarator();
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

	public static class PtroperatorContext extends ParserRuleContext {
		public TerminalNode Star() { return getToken(MQL4Parser.Star, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public TerminalNode And() { return getToken(MQL4Parser.And, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public PtroperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptroperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterPtroperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitPtroperator(this);
		}
	}

	public final PtroperatorContext ptroperator() throws RecognitionException {
		PtroperatorContext _localctx = new PtroperatorContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_ptroperator);
		try {
			setState(1753);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Star:
				enterOuterAlt(_localctx, 1);
				{
				setState(1730);
				match(Star);
				setState(1732);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1731);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1735);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1734);
					cvqualifierseq();
					}
					break;
				}
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(1737);
				match(And);
				setState(1739);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1738);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(1741);
				match(T__2);
				setState(1743);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1742);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case Decltype:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(1745);
				nestednamespecifier(0);
				setState(1746);
				match(Star);
				setState(1748);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1747);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1751);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1750);
					cvqualifierseq();
					}
					break;
				}
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

	public static class CvqualifierseqContext extends ParserRuleContext {
		public CvqualifierContext cvqualifier() {
			return getRuleContext(CvqualifierContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public CvqualifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvqualifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterCvqualifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitCvqualifierseq(this);
		}
	}

	public final CvqualifierseqContext cvqualifierseq() throws RecognitionException {
		CvqualifierseqContext _localctx = new CvqualifierseqContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_cvqualifierseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			cvqualifier();
			setState(1757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1756);
				cvqualifierseq();
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

	public static class CvqualifierContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(MQL4Parser.Const, 0); }
		public TerminalNode Volatile() { return getToken(MQL4Parser.Volatile, 0); }
		public CvqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvqualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterCvqualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitCvqualifier(this);
		}
	}

	public final CvqualifierContext cvqualifier() throws RecognitionException {
		CvqualifierContext _localctx = new CvqualifierContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_cvqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1759);
			_la = _input.LA(1);
			if ( !(_la==Const || _la==Volatile) ) {
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

	public static class RefqualifierContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(MQL4Parser.And, 0); }
		public RefqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refqualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterRefqualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitRefqualifier(this);
		}
	}

	public final RefqualifierContext refqualifier() throws RecognitionException {
		RefqualifierContext _localctx = new RefqualifierContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_refqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1761);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==And) ) {
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

	public static class DeclaratoridContext extends ParserRuleContext {
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(MQL4Parser.Ellipsis, 0); }
		public DeclaratoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaratorid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterDeclaratorid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitDeclaratorid(this);
		}
	}

	public final DeclaratoridContext declaratorid() throws RecognitionException {
		DeclaratoridContext _localctx = new DeclaratoridContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_declaratorid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1763);
				match(Ellipsis);
				}
			}

			setState(1766);
			idexpression();
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

	public static class ThetypeidContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public ThetypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thetypeid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterThetypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitThetypeid(this);
		}
	}

	public final ThetypeidContext thetypeid() throws RecognitionException {
		ThetypeidContext _localctx = new ThetypeidContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_thetypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1768);
			typespecifierseq();
			setState(1770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1769);
				abstractdeclarator();
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

	public static class AbstractdeclaratorContext extends ParserRuleContext {
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public AbstractpackdeclaratorContext abstractpackdeclarator() {
			return getRuleContext(AbstractpackdeclaratorContext.class,0);
		}
		public AbstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterAbstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitAbstractdeclarator(this);
		}
	}

	public final AbstractdeclaratorContext abstractdeclarator() throws RecognitionException {
		AbstractdeclaratorContext _localctx = new AbstractdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_abstractdeclarator);
		try {
			setState(1780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1772);
				ptrabstractdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1774);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1773);
					noptrabstractdeclarator(0);
					}
					break;
				}
				setState(1776);
				parametersandqualifiers();
				setState(1777);
				trailingreturntype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1779);
				abstractpackdeclarator();
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

	public static class PtrabstractdeclaratorContext extends ParserRuleContext {
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public PtrabstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrabstractdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterPtrabstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitPtrabstractdeclarator(this);
		}
	}

	public final PtrabstractdeclaratorContext ptrabstractdeclarator() throws RecognitionException {
		PtrabstractdeclaratorContext _localctx = new PtrabstractdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_ptrabstractdeclarator);
		try {
			setState(1787);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1782);
				noptrabstractdeclarator(0);
				}
				break;
			case T__2:
			case Decltype:
			case Star:
			case And:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1783);
				ptroperator();
				setState(1785);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1784);
					ptrabstractdeclarator();
					}
					break;
				}
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

	public static class NoptrabstractdeclaratorContext extends ParserRuleContext {
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(MQL4Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(MQL4Parser.RightBracket, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(MQL4Parser.LeftParen, 0); }
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MQL4Parser.RightParen, 0); }
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public NoptrabstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrabstractdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterNoptrabstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitNoptrabstractdeclarator(this);
		}
	}

	public final NoptrabstractdeclaratorContext noptrabstractdeclarator() throws RecognitionException {
		return noptrabstractdeclarator(0);
	}

	private NoptrabstractdeclaratorContext noptrabstractdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrabstractdeclaratorContext _localctx = new NoptrabstractdeclaratorContext(_ctx, _parentState);
		NoptrabstractdeclaratorContext _prevctx = _localctx;
		int _startState = 264;
		enterRecursionRule(_localctx, 264, RULE_noptrabstractdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1790);
				parametersandqualifiers();
				}
				break;
			case 2:
				{
				setState(1791);
				match(LeftBracket);
				setState(1793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Color) | (1L << Const_cast) | (1L << Datetime) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Uchar - 66)) | (1L << (Unshort - 66)) | (1L << (Ulong - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (Doublecolon - 134)) | (1L << (Identifier - 134)) | (1L << (Integerliteral - 134)) | (1L << (ColorLiteral - 134)) | (1L << (DatetimeLiteral - 134)) | (1L << (Characterliteral - 134)) | (1L << (Floatingliteral - 134)) | (1L << (Stringliteral - 134)) | (1L << (Userdefinedintegerliteral - 134)) | (1L << (Userdefinedfloatingliteral - 134)) | (1L << (Userdefinedstringliteral - 134)) | (1L << (Userdefinedcharacterliteral - 134)))) != 0)) {
					{
					setState(1792);
					constantexpression();
					}
				}

				setState(1795);
				match(RightBracket);
				setState(1797);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1796);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1799);
				match(LeftParen);
				setState(1800);
				ptrabstractdeclarator();
				setState(1801);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1818);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1816);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1805);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1806);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1807);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1808);
						match(LeftBracket);
						setState(1810);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Color) | (1L << Const_cast) | (1L << Datetime) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Uchar - 66)) | (1L << (Unshort - 66)) | (1L << (Ulong - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (Doublecolon - 134)) | (1L << (Identifier - 134)) | (1L << (Integerliteral - 134)) | (1L << (ColorLiteral - 134)) | (1L << (DatetimeLiteral - 134)) | (1L << (Characterliteral - 134)) | (1L << (Floatingliteral - 134)) | (1L << (Stringliteral - 134)) | (1L << (Userdefinedintegerliteral - 134)) | (1L << (Userdefinedfloatingliteral - 134)) | (1L << (Userdefinedstringliteral - 134)) | (1L << (Userdefinedcharacterliteral - 134)))) != 0)) {
							{
							setState(1809);
							constantexpression();
							}
						}

						setState(1812);
						match(RightBracket);
						setState(1814);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
						case 1:
							{
							setState(1813);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1820);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AbstractpackdeclaratorContext extends ParserRuleContext {
		public NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() {
			return getRuleContext(NoptrabstractpackdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public AbstractpackdeclaratorContext abstractpackdeclarator() {
			return getRuleContext(AbstractpackdeclaratorContext.class,0);
		}
		public AbstractpackdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractpackdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterAbstractpackdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitAbstractpackdeclarator(this);
		}
	}

	public final AbstractpackdeclaratorContext abstractpackdeclarator() throws RecognitionException {
		AbstractpackdeclaratorContext _localctx = new AbstractpackdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_abstractpackdeclarator);
		try {
			setState(1825);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ellipsis:
				enterOuterAlt(_localctx, 1);
				{
				setState(1821);
				noptrabstractpackdeclarator(0);
				}
				break;
			case T__2:
			case Decltype:
			case Star:
			case And:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1822);
				ptroperator();
				setState(1823);
				abstractpackdeclarator();
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

	public static class NoptrabstractpackdeclaratorContext extends ParserRuleContext {
		public TerminalNode Ellipsis() { return getToken(MQL4Parser.Ellipsis, 0); }
		public NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() {
			return getRuleContext(NoptrabstractpackdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(MQL4Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(MQL4Parser.RightBracket, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NoptrabstractpackdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrabstractpackdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterNoptrabstractpackdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitNoptrabstractpackdeclarator(this);
		}
	}

	public final NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() throws RecognitionException {
		return noptrabstractpackdeclarator(0);
	}

	private NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrabstractpackdeclaratorContext _localctx = new NoptrabstractpackdeclaratorContext(_ctx, _parentState);
		NoptrabstractpackdeclaratorContext _prevctx = _localctx;
		int _startState = 268;
		enterRecursionRule(_localctx, 268, RULE_noptrabstractpackdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1828);
			match(Ellipsis);
			}
			_ctx.stop = _input.LT(-1);
			setState(1843);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1841);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1830);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1831);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1832);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1833);
						match(LeftBracket);
						setState(1835);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Color) | (1L << Const_cast) | (1L << Datetime) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Uchar - 66)) | (1L << (Unshort - 66)) | (1L << (Ulong - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (Doublecolon - 134)) | (1L << (Identifier - 134)) | (1L << (Integerliteral - 134)) | (1L << (ColorLiteral - 134)) | (1L << (DatetimeLiteral - 134)) | (1L << (Characterliteral - 134)) | (1L << (Floatingliteral - 134)) | (1L << (Stringliteral - 134)) | (1L << (Userdefinedintegerliteral - 134)) | (1L << (Userdefinedfloatingliteral - 134)) | (1L << (Userdefinedstringliteral - 134)) | (1L << (Userdefinedcharacterliteral - 134)))) != 0)) {
							{
							setState(1834);
							constantexpression();
							}
						}

						setState(1837);
						match(RightBracket);
						setState(1839);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
						case 1:
							{
							setState(1838);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1845);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,209,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterdeclarationclauseContext extends ParserRuleContext {
		public ParameterdeclarationlistContext parameterdeclarationlist() {
			return getRuleContext(ParameterdeclarationlistContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(MQL4Parser.Ellipsis, 0); }
		public TerminalNode Comma() { return getToken(MQL4Parser.Comma, 0); }
		public ParameterdeclarationclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclarationclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterParameterdeclarationclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitParameterdeclarationclause(this);
		}
	}

	public final ParameterdeclarationclauseContext parameterdeclarationclause() throws RecognitionException {
		ParameterdeclarationclauseContext _localctx = new ParameterdeclarationclauseContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_parameterdeclarationclause);
		int _la;
		try {
			setState(1856);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Color) | (1L << Const) | (1L << Constexpr) | (1L << Datetime) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Register) | (1L << Short) | (1L << Signed))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static - 64)) | (1L << (Struct - 64)) | (1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename_ - 64)) | (1L << (Uchar - 64)) | (1L << (Union - 64)) | (1L << (Unshort - 64)) | (1L << (Ulong - 64)) | (1L << (Unsigned - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftBracket - 64)))) != 0) || _la==Doublecolon || _la==Identifier) {
					{
					setState(1846);
					parameterdeclarationlist(0);
					}
				}

				setState(1850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1849);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1852);
				parameterdeclarationlist(0);
				setState(1853);
				match(Comma);
				setState(1854);
				match(Ellipsis);
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

	public static class ParameterdeclarationlistContext extends ParserRuleContext {
		public ParameterdeclarationContext parameterdeclaration() {
			return getRuleContext(ParameterdeclarationContext.class,0);
		}
		public ParameterdeclarationlistContext parameterdeclarationlist() {
			return getRuleContext(ParameterdeclarationlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MQL4Parser.Comma, 0); }
		public ParameterdeclarationlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclarationlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterParameterdeclarationlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitParameterdeclarationlist(this);
		}
	}

	public final ParameterdeclarationlistContext parameterdeclarationlist() throws RecognitionException {
		return parameterdeclarationlist(0);
	}

	private ParameterdeclarationlistContext parameterdeclarationlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterdeclarationlistContext _localctx = new ParameterdeclarationlistContext(_ctx, _parentState);
		ParameterdeclarationlistContext _prevctx = _localctx;
		int _startState = 272;
		enterRecursionRule(_localctx, 272, RULE_parameterdeclarationlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1859);
			parameterdeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1866);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterdeclarationlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterdeclarationlist);
					setState(1861);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1862);
					match(Comma);
					setState(1863);
					parameterdeclaration();
					}
					} 
				}
				setState(1868);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterdeclarationContext extends ParserRuleContext {
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Assign() { return getToken(MQL4Parser.Assign, 0); }
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public ParameterdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterParameterdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitParameterdeclaration(this);
		}
	}

	public final ParameterdeclarationContext parameterdeclaration() throws RecognitionException {
		ParameterdeclarationContext _localctx = new ParameterdeclarationContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_parameterdeclaration);
		int _la;
		try {
			setState(1900);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1870);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1869);
					attributespecifierseq(0);
					}
				}

				setState(1872);
				declspecifierseq();
				setState(1873);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1875);
					attributespecifierseq(0);
					}
				}

				setState(1878);
				declspecifierseq();
				setState(1879);
				declarator();
				setState(1880);
				match(Assign);
				setState(1881);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1883);
					attributespecifierseq(0);
					}
				}

				setState(1886);
				declspecifierseq();
				setState(1888);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1887);
					abstractdeclarator();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1890);
					attributespecifierseq(0);
					}
				}

				setState(1893);
				declspecifierseq();
				setState(1895);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2 || _la==Decltype || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (LeftParen - 90)) | (1L << (LeftBracket - 90)) | (1L << (Star - 90)) | (1L << (And - 90)) | (1L << (Doublecolon - 90)) | (1L << (Ellipsis - 90)) | (1L << (Identifier - 90)))) != 0)) {
					{
					setState(1894);
					abstractdeclarator();
					}
				}

				setState(1897);
				match(Assign);
				setState(1898);
				initializerclause();
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

	public static class FunctiondefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public FunctiondefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterFunctiondefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitFunctiondefinition(this);
		}
	}

	public final FunctiondefinitionContext functiondefinition() throws RecognitionException {
		FunctiondefinitionContext _localctx = new FunctiondefinitionContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_functiondefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1902);
				attributespecifierseq(0);
				}
			}

			setState(1906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				{
				setState(1905);
				declspecifierseq();
				}
				break;
			}
			setState(1908);
			declarator();
			setState(1910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Final || _la==Override) {
				{
				setState(1909);
				virtspecifierseq(0);
				}
			}

			setState(1912);
			functionbody();
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

	public static class FunctionbodyContext extends ParserRuleContext {
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public CtorinitializerContext ctorinitializer() {
			return getRuleContext(CtorinitializerContext.class,0);
		}
		public FunctiontryblockContext functiontryblock() {
			return getRuleContext(FunctiontryblockContext.class,0);
		}
		public TerminalNode Assign() { return getToken(MQL4Parser.Assign, 0); }
		public TerminalNode Default() { return getToken(MQL4Parser.Default, 0); }
		public TerminalNode Semi() { return getToken(MQL4Parser.Semi, 0); }
		public TerminalNode Delete() { return getToken(MQL4Parser.Delete, 0); }
		public FunctionbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterFunctionbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitFunctionbody(this);
		}
	}

	public final FunctionbodyContext functionbody() throws RecognitionException {
		FunctionbodyContext _localctx = new FunctionbodyContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_functionbody);
		int _la;
		try {
			setState(1925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1914);
					ctorinitializer();
					}
				}

				setState(1917);
				compoundstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1918);
				functiontryblock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1919);
				match(Assign);
				setState(1920);
				match(Default);
				setState(1921);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1922);
				match(Assign);
				setState(1923);
				match(Delete);
				setState(1924);
				match(Semi);
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

	public static class InitializerContext extends ParserRuleContext {
		public BraceorequalinitializerContext braceorequalinitializer() {
			return getRuleContext(BraceorequalinitializerContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(MQL4Parser.LeftParen, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MQL4Parser.RightParen, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_initializer);
		try {
			setState(1932);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1927);
				braceorequalinitializer();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(1928);
				match(LeftParen);
				setState(1929);
				expressionlist();
				setState(1930);
				match(RightParen);
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

	public static class BraceorequalinitializerContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(MQL4Parser.Assign, 0); }
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public BraceorequalinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braceorequalinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterBraceorequalinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitBraceorequalinitializer(this);
		}
	}

	public final BraceorequalinitializerContext braceorequalinitializer() throws RecognitionException {
		BraceorequalinitializerContext _localctx = new BraceorequalinitializerContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_braceorequalinitializer);
		try {
			setState(1937);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(1934);
				match(Assign);
				setState(1935);
				initializerclause();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1936);
				bracedinitlist();
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

	public static class InitializerclauseContext extends ParserRuleContext {
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public InitializerclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterInitializerclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitInitializerclause(this);
		}
	}

	public final InitializerclauseContext initializerclause() throws RecognitionException {
		InitializerclauseContext _localctx = new InitializerclauseContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_initializerclause);
		try {
			setState(1941);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case Alignof:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Color:
			case Const_cast:
			case Datetime:
			case Decltype:
			case Delete:
			case Double:
			case Dynamic_cast:
			case False:
			case Float:
			case Int:
			case Long:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Reinterpret_cast:
			case Short:
			case Signed:
			case Sizeof:
			case Static_cast:
			case This:
			case Throw:
			case True:
			case Typeid_:
			case Typename_:
			case Uchar:
			case Unshort:
			case Ulong:
			case Unsigned:
			case Void:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Or:
			case Tilde:
			case PlusPlus:
			case MinusMinus:
			case Doublecolon:
			case Identifier:
			case Integerliteral:
			case ColorLiteral:
			case DatetimeLiteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1939);
				assignmentexpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1940);
				bracedinitlist();
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

	public static class InitializerlistContext extends ParserRuleContext {
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(MQL4Parser.Ellipsis, 0); }
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MQL4Parser.Comma, 0); }
		public InitializerlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterInitializerlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitInitializerlist(this);
		}
	}

	public final InitializerlistContext initializerlist() throws RecognitionException {
		return initializerlist(0);
	}

	private InitializerlistContext initializerlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitializerlistContext _localctx = new InitializerlistContext(_ctx, _parentState);
		InitializerlistContext _prevctx = _localctx;
		int _startState = 286;
		enterRecursionRule(_localctx, 286, RULE_initializerlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1944);
			initializerclause();
			setState(1946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(1945);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1956);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerlist);
					setState(1948);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1949);
					match(Comma);
					setState(1950);
					initializerclause();
					setState(1952);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
					case 1:
						{
						setState(1951);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(1958);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,231,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BracedinitlistContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(MQL4Parser.LeftBrace, 0); }
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(MQL4Parser.RightBrace, 0); }
		public TerminalNode Comma() { return getToken(MQL4Parser.Comma, 0); }
		public BracedinitlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracedinitlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterBracedinitlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitBracedinitlist(this);
		}
	}

	public final BracedinitlistContext bracedinitlist() throws RecognitionException {
		BracedinitlistContext _localctx = new BracedinitlistContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_bracedinitlist);
		int _la;
		try {
			setState(1968);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1959);
				match(LeftBrace);
				setState(1960);
				initializerlist(0);
				setState(1962);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1961);
					match(Comma);
					}
				}

				setState(1964);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1966);
				match(LeftBrace);
				setState(1967);
				match(RightBrace);
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

	public static class ClassnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MQL4Parser.Identifier, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public ClassnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterClassname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitClassname(this);
		}
	}

	public final ClassnameContext classname() throws RecognitionException {
		ClassnameContext _localctx = new ClassnameContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_classname);
		try {
			setState(1972);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1970);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1971);
				simpletemplateid();
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

	public static class ClassspecifierContext extends ParserRuleContext {
		public ClassheadContext classhead() {
			return getRuleContext(ClassheadContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(MQL4Parser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(MQL4Parser.RightBrace, 0); }
		public MemberspecificationContext memberspecification() {
			return getRuleContext(MemberspecificationContext.class,0);
		}
		public ClassspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterClassspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitClassspecifier(this);
		}
	}

	public final ClassspecifierContext classspecifier() throws RecognitionException {
		ClassspecifierContext _localctx = new ClassspecifierContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_classspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1974);
			classhead();
			setState(1975);
			match(LeftBrace);
			setState(1977);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Color) | (1L << Const) | (1L << Constexpr) | (1L << Datetime) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Struct - 64)) | (1L << (Template - 64)) | (1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename_ - 64)) | (1L << (Uchar - 64)) | (1L << (Union - 64)) | (1L << (Unshort - 64)) | (1L << (Ulong - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (Colon - 133)) | (1L << (Doublecolon - 133)) | (1L << (Semi - 133)) | (1L << (Ellipsis - 133)) | (1L << (Identifier - 133)))) != 0)) {
				{
				setState(1976);
				memberspecification();
				}
			}

			setState(1979);
			match(RightBrace);
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

	public static class ClassheadContext extends ParserRuleContext {
		public ClasskeyContext classkey() {
			return getRuleContext(ClasskeyContext.class,0);
		}
		public ClassheadnameContext classheadname() {
			return getRuleContext(ClassheadnameContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ClassvirtspecifierContext classvirtspecifier() {
			return getRuleContext(ClassvirtspecifierContext.class,0);
		}
		public BaseclauseContext baseclause() {
			return getRuleContext(BaseclauseContext.class,0);
		}
		public ClassheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classhead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterClasshead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitClasshead(this);
		}
	}

	public final ClassheadContext classhead() throws RecognitionException {
		ClassheadContext _localctx = new ClassheadContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_classhead);
		int _la;
		try {
			setState(1999);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1981);
				classkey();
				setState(1983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1982);
					attributespecifierseq(0);
					}
				}

				setState(1985);
				classheadname();
				setState(1987);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Final) {
					{
					setState(1986);
					classvirtspecifier();
					}
				}

				setState(1990);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1989);
					baseclause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1992);
				classkey();
				setState(1994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1993);
					attributespecifierseq(0);
					}
				}

				setState(1997);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1996);
					baseclause();
					}
				}

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

	public static class ClassheadnameContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public ClassheadnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classheadname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterClassheadname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitClassheadname(this);
		}
	}

	public final ClassheadnameContext classheadname() throws RecognitionException {
		ClassheadnameContext _localctx = new ClassheadnameContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_classheadname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2002);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(2001);
				nestednamespecifier(0);
				}
				break;
			}
			setState(2004);
			classname();
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

	public static class ClassvirtspecifierContext extends ParserRuleContext {
		public TerminalNode Final() { return getToken(MQL4Parser.Final, 0); }
		public ClassvirtspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classvirtspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterClassvirtspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitClassvirtspecifier(this);
		}
	}

	public final ClassvirtspecifierContext classvirtspecifier() throws RecognitionException {
		ClassvirtspecifierContext _localctx = new ClassvirtspecifierContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_classvirtspecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2006);
			match(Final);
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

	public static class ClasskeyContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(MQL4Parser.Class, 0); }
		public TerminalNode Struct() { return getToken(MQL4Parser.Struct, 0); }
		public TerminalNode Union() { return getToken(MQL4Parser.Union, 0); }
		public ClasskeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classkey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterClasskey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitClasskey(this);
		}
	}

	public final ClasskeyContext classkey() throws RecognitionException {
		ClasskeyContext _localctx = new ClasskeyContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_classkey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2008);
			_la = _input.LA(1);
			if ( !(((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (Class - 20)) | (1L << (Struct - 20)) | (1L << (Union - 20)))) != 0)) ) {
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

	public static class MemberspecificationContext extends ParserRuleContext {
		public MemberdeclarationContext memberdeclaration() {
			return getRuleContext(MemberdeclarationContext.class,0);
		}
		public MemberspecificationContext memberspecification() {
			return getRuleContext(MemberspecificationContext.class,0);
		}
		public AccessspecifierContext accessspecifier() {
			return getRuleContext(AccessspecifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(MQL4Parser.Colon, 0); }
		public MemberspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterMemberspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitMemberspecification(this);
		}
	}

	public final MemberspecificationContext memberspecification() throws RecognitionException {
		MemberspecificationContext _localctx = new MemberspecificationContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_memberspecification);
		int _la;
		try {
			setState(2019);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case Alignas:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Color:
			case Const:
			case Constexpr:
			case Datetime:
			case Decltype:
			case Double:
			case Enum:
			case Explicit:
			case Extern:
			case Float:
			case Friend:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Operator:
			case Register:
			case Short:
			case Signed:
			case Static:
			case Static_assert:
			case Struct:
			case Template:
			case Thread_local:
			case Typedef:
			case Typename_:
			case Uchar:
			case Union:
			case Unshort:
			case Ulong:
			case Unsigned:
			case Using:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Star:
			case And:
			case Tilde:
			case Colon:
			case Doublecolon:
			case Semi:
			case Ellipsis:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2010);
				memberdeclaration();
				setState(2012);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Color) | (1L << Const) | (1L << Constexpr) | (1L << Datetime) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Struct - 64)) | (1L << (Template - 64)) | (1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename_ - 64)) | (1L << (Uchar - 64)) | (1L << (Union - 64)) | (1L << (Unshort - 64)) | (1L << (Ulong - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (Colon - 133)) | (1L << (Doublecolon - 133)) | (1L << (Semi - 133)) | (1L << (Ellipsis - 133)) | (1L << (Identifier - 133)))) != 0)) {
					{
					setState(2011);
					memberspecification();
					}
				}

				}
				break;
			case Private:
			case Protected:
			case Public:
				enterOuterAlt(_localctx, 2);
				{
				setState(2014);
				accessspecifier();
				setState(2015);
				match(Colon);
				setState(2017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Color) | (1L << Const) | (1L << Constexpr) | (1L << Datetime) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Static - 64)) | (1L << (Static_assert - 64)) | (1L << (Struct - 64)) | (1L << (Template - 64)) | (1L << (Thread_local - 64)) | (1L << (Typedef - 64)) | (1L << (Typename_ - 64)) | (1L << (Uchar - 64)) | (1L << (Union - 64)) | (1L << (Unshort - 64)) | (1L << (Ulong - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Tilde - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (Colon - 133)) | (1L << (Doublecolon - 133)) | (1L << (Semi - 133)) | (1L << (Ellipsis - 133)) | (1L << (Identifier - 133)))) != 0)) {
					{
					setState(2016);
					memberspecification();
					}
				}

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

	public static class MemberdeclarationContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(MQL4Parser.Semi, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public MemberdeclaratorlistContext memberdeclaratorlist() {
			return getRuleContext(MemberdeclaratorlistContext.class,0);
		}
		public FunctiondefinitionContext functiondefinition() {
			return getRuleContext(FunctiondefinitionContext.class,0);
		}
		public UsingdeclarationContext usingdeclaration() {
			return getRuleContext(UsingdeclarationContext.class,0);
		}
		public Static_assertdeclarationContext static_assertdeclaration() {
			return getRuleContext(Static_assertdeclarationContext.class,0);
		}
		public TemplatedeclarationContext templatedeclaration() {
			return getRuleContext(TemplatedeclarationContext.class,0);
		}
		public AliasdeclarationContext aliasdeclaration() {
			return getRuleContext(AliasdeclarationContext.class,0);
		}
		public EmptydeclarationContext emptydeclaration() {
			return getRuleContext(EmptydeclarationContext.class,0);
		}
		public MemberdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterMemberdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitMemberdeclaration(this);
		}
	}

	public final MemberdeclarationContext memberdeclaration() throws RecognitionException {
		MemberdeclarationContext _localctx = new MemberdeclarationContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_memberdeclaration);
		int _la;
		try {
			setState(2037);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2022);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(2021);
					attributespecifierseq(0);
					}
					break;
				}
				setState(2025);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
				case 1:
					{
					setState(2024);
					declspecifierseq();
					}
					break;
				}
				setState(2028);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << Alignas) | (1L << Decltype) | (1L << Operator))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (LeftParen - 90)) | (1L << (LeftBracket - 90)) | (1L << (Star - 90)) | (1L << (And - 90)) | (1L << (Tilde - 90)) | (1L << (Colon - 90)) | (1L << (Doublecolon - 90)) | (1L << (Ellipsis - 90)) | (1L << (Identifier - 90)))) != 0)) {
					{
					setState(2027);
					memberdeclaratorlist(0);
					}
				}

				setState(2030);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2031);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2032);
				usingdeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2033);
				static_assertdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2034);
				templatedeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2035);
				aliasdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2036);
				emptydeclaration();
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

	public static class MemberdeclaratorlistContext extends ParserRuleContext {
		public MemberdeclaratorContext memberdeclarator() {
			return getRuleContext(MemberdeclaratorContext.class,0);
		}
		public MemberdeclaratorlistContext memberdeclaratorlist() {
			return getRuleContext(MemberdeclaratorlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MQL4Parser.Comma, 0); }
		public MemberdeclaratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclaratorlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterMemberdeclaratorlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitMemberdeclaratorlist(this);
		}
	}

	public final MemberdeclaratorlistContext memberdeclaratorlist() throws RecognitionException {
		return memberdeclaratorlist(0);
	}

	private MemberdeclaratorlistContext memberdeclaratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MemberdeclaratorlistContext _localctx = new MemberdeclaratorlistContext(_ctx, _parentState);
		MemberdeclaratorlistContext _prevctx = _localctx;
		int _startState = 306;
		enterRecursionRule(_localctx, 306, RULE_memberdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2040);
			memberdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(2047);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MemberdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_memberdeclaratorlist);
					setState(2042);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2043);
					match(Comma);
					setState(2044);
					memberdeclarator();
					}
					} 
				}
				setState(2049);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MemberdeclaratorContext extends ParserRuleContext {
		public MemberdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclarator; }
	 
		public MemberdeclaratorContext() { }
		public void copyFrom(MemberdeclaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MemberInitContext extends MemberdeclaratorContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public BraceorequalinitializerContext braceorequalinitializer() {
			return getRuleContext(BraceorequalinitializerContext.class,0);
		}
		public MemberInitContext(MemberdeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterMemberInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitMemberInit(this);
		}
	}
	public static class MemberDecContext extends MemberdeclaratorContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public PurespecifierContext purespecifier() {
			return getRuleContext(PurespecifierContext.class,0);
		}
		public MemberDecContext(MemberdeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterMemberDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitMemberDec(this);
		}
	}
	public static class MemberConstantContext extends MemberdeclaratorContext {
		public TerminalNode Colon() { return getToken(MQL4Parser.Colon, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MQL4Parser.Identifier, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public MemberConstantContext(MemberdeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterMemberConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitMemberConstant(this);
		}
	}

	public final MemberdeclaratorContext memberdeclarator() throws RecognitionException {
		MemberdeclaratorContext _localctx = new MemberdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_memberdeclarator);
		int _la;
		try {
			setState(2069);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				_localctx = new MemberDecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2050);
				declarator();
				setState(2052);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
				case 1:
					{
					setState(2051);
					virtspecifierseq(0);
					}
					break;
				}
				setState(2055);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(2054);
					purespecifier();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new MemberInitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2057);
				declarator();
				setState(2059);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
				case 1:
					{
					setState(2058);
					braceorequalinitializer();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new MemberConstantContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2062);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2061);
					match(Identifier);
					}
				}

				setState(2065);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2064);
					attributespecifierseq(0);
					}
				}

				setState(2067);
				match(Colon);
				setState(2068);
				constantexpression();
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

	public static class VirtspecifierseqContext extends ParserRuleContext {
		public VirtspecifierContext virtspecifier() {
			return getRuleContext(VirtspecifierContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public VirtspecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtspecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterVirtspecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitVirtspecifierseq(this);
		}
	}

	public final VirtspecifierseqContext virtspecifierseq() throws RecognitionException {
		return virtspecifierseq(0);
	}

	private VirtspecifierseqContext virtspecifierseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VirtspecifierseqContext _localctx = new VirtspecifierseqContext(_ctx, _parentState);
		VirtspecifierseqContext _prevctx = _localctx;
		int _startState = 310;
		enterRecursionRule(_localctx, 310, RULE_virtspecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2072);
			virtspecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2078);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VirtspecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_virtspecifierseq);
					setState(2074);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2075);
					virtspecifier();
					}
					} 
				}
				setState(2080);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VirtspecifierContext extends ParserRuleContext {
		public TerminalNode Override() { return getToken(MQL4Parser.Override, 0); }
		public TerminalNode Final() { return getToken(MQL4Parser.Final, 0); }
		public VirtspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterVirtspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitVirtspecifier(this);
		}
	}

	public final VirtspecifierContext virtspecifier() throws RecognitionException {
		VirtspecifierContext _localctx = new VirtspecifierContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_virtspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2081);
			_la = _input.LA(1);
			if ( !(_la==Final || _la==Override) ) {
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

	public static class PurespecifierContext extends ParserRuleContext {
		public Token val;
		public TerminalNode Assign() { return getToken(MQL4Parser.Assign, 0); }
		public TerminalNode Octalliteral() { return getToken(MQL4Parser.Octalliteral, 0); }
		public PurespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_purespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterPurespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitPurespecifier(this);
		}
	}

	public final PurespecifierContext purespecifier() throws RecognitionException {
		PurespecifierContext _localctx = new PurespecifierContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_purespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2083);
			match(Assign);
			setState(2084);
			((PurespecifierContext)_localctx).val = match(Octalliteral);
			if((((PurespecifierContext)_localctx).val!=null?((PurespecifierContext)_localctx).val.getText():null).compareTo("0")!=0) throw new InputMismatchException(this);
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

	public static class BaseclauseContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(MQL4Parser.Colon, 0); }
		public BasespecifierlistContext basespecifierlist() {
			return getRuleContext(BasespecifierlistContext.class,0);
		}
		public BaseclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterBaseclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitBaseclause(this);
		}
	}

	public final BaseclauseContext baseclause() throws RecognitionException {
		BaseclauseContext _localctx = new BaseclauseContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_baseclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2087);
			match(Colon);
			setState(2088);
			basespecifierlist(0);
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

	public static class BasespecifierlistContext extends ParserRuleContext {
		public BasespecifierContext basespecifier() {
			return getRuleContext(BasespecifierContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(MQL4Parser.Ellipsis, 0); }
		public BasespecifierlistContext basespecifierlist() {
			return getRuleContext(BasespecifierlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MQL4Parser.Comma, 0); }
		public BasespecifierlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basespecifierlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterBasespecifierlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitBasespecifierlist(this);
		}
	}

	public final BasespecifierlistContext basespecifierlist() throws RecognitionException {
		return basespecifierlist(0);
	}

	private BasespecifierlistContext basespecifierlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BasespecifierlistContext _localctx = new BasespecifierlistContext(_ctx, _parentState);
		BasespecifierlistContext _prevctx = _localctx;
		int _startState = 318;
		enterRecursionRule(_localctx, 318, RULE_basespecifierlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2091);
			basespecifier();
			setState(2093);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				{
				setState(2092);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BasespecifierlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_basespecifierlist);
					setState(2095);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2096);
					match(Comma);
					setState(2097);
					basespecifier();
					setState(2099);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
					case 1:
						{
						setState(2098);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BasespecifierContext extends ParserRuleContext {
		public BasetypespecifierContext basetypespecifier() {
			return getRuleContext(BasetypespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Virtual() { return getToken(MQL4Parser.Virtual, 0); }
		public AccessspecifierContext accessspecifier() {
			return getRuleContext(AccessspecifierContext.class,0);
		}
		public BasespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterBasespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitBasespecifier(this);
		}
	}

	public final BasespecifierContext basespecifier() throws RecognitionException {
		BasespecifierContext _localctx = new BasespecifierContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_basespecifier);
		int _la;
		try {
			setState(2127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2106);
					attributespecifierseq(0);
					}
				}

				setState(2109);
				basetypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2110);
					attributespecifierseq(0);
					}
				}

				setState(2113);
				match(Virtual);
				setState(2115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) {
					{
					setState(2114);
					accessspecifier();
					}
				}

				setState(2117);
				basetypespecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2118);
					attributespecifierseq(0);
					}
				}

				setState(2121);
				accessspecifier();
				setState(2123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Virtual) {
					{
					setState(2122);
					match(Virtual);
					}
				}

				setState(2125);
				basetypespecifier();
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

	public static class ClassordecltypeContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public ClassordecltypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classordecltype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterClassordecltype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitClassordecltype(this);
		}
	}

	public final ClassordecltypeContext classordecltype() throws RecognitionException {
		ClassordecltypeContext _localctx = new ClassordecltypeContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_classordecltype);
		try {
			setState(2134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2130);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
				case 1:
					{
					setState(2129);
					nestednamespecifier(0);
					}
					break;
				}
				setState(2132);
				classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2133);
				decltypespecifier();
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

	public static class BasetypespecifierContext extends ParserRuleContext {
		public ClassordecltypeContext classordecltype() {
			return getRuleContext(ClassordecltypeContext.class,0);
		}
		public BasetypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basetypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterBasetypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitBasetypespecifier(this);
		}
	}

	public final BasetypespecifierContext basetypespecifier() throws RecognitionException {
		BasetypespecifierContext _localctx = new BasetypespecifierContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_basetypespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2136);
			classordecltype();
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

	public static class AccessspecifierContext extends ParserRuleContext {
		public TerminalNode Private() { return getToken(MQL4Parser.Private, 0); }
		public TerminalNode Protected() { return getToken(MQL4Parser.Protected, 0); }
		public TerminalNode Public() { return getToken(MQL4Parser.Public, 0); }
		public AccessspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterAccessspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitAccessspecifier(this);
		}
	}

	public final AccessspecifierContext accessspecifier() throws RecognitionException {
		AccessspecifierContext _localctx = new AccessspecifierContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_accessspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2138);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) ) {
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

	public static class ConversionfunctionidContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(MQL4Parser.Operator, 0); }
		public ConversiontypeidContext conversiontypeid() {
			return getRuleContext(ConversiontypeidContext.class,0);
		}
		public ConversionfunctionidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversionfunctionid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterConversionfunctionid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitConversionfunctionid(this);
		}
	}

	public final ConversionfunctionidContext conversionfunctionid() throws RecognitionException {
		ConversionfunctionidContext _localctx = new ConversionfunctionidContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_conversionfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2140);
			match(Operator);
			setState(2141);
			conversiontypeid();
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

	public static class ConversiontypeidContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public ConversiondeclaratorContext conversiondeclarator() {
			return getRuleContext(ConversiondeclaratorContext.class,0);
		}
		public ConversiontypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversiontypeid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterConversiontypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitConversiontypeid(this);
		}
	}

	public final ConversiontypeidContext conversiontypeid() throws RecognitionException {
		ConversiontypeidContext _localctx = new ConversiontypeidContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_conversiontypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2143);
			typespecifierseq();
			setState(2145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
			case 1:
				{
				setState(2144);
				conversiondeclarator();
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

	public static class ConversiondeclaratorContext extends ParserRuleContext {
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public ConversiondeclaratorContext conversiondeclarator() {
			return getRuleContext(ConversiondeclaratorContext.class,0);
		}
		public ConversiondeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversiondeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterConversiondeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitConversiondeclarator(this);
		}
	}

	public final ConversiondeclaratorContext conversiondeclarator() throws RecognitionException {
		ConversiondeclaratorContext _localctx = new ConversiondeclaratorContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_conversiondeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2147);
			ptroperator();
			setState(2149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				{
				setState(2148);
				conversiondeclarator();
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

	public static class CtorinitializerContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(MQL4Parser.Colon, 0); }
		public MeminitializerlistContext meminitializerlist() {
			return getRuleContext(MeminitializerlistContext.class,0);
		}
		public CtorinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctorinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterCtorinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitCtorinitializer(this);
		}
	}

	public final CtorinitializerContext ctorinitializer() throws RecognitionException {
		CtorinitializerContext _localctx = new CtorinitializerContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_ctorinitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2151);
			match(Colon);
			setState(2152);
			meminitializerlist();
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

	public static class MeminitializerlistContext extends ParserRuleContext {
		public MeminitializerContext meminitializer() {
			return getRuleContext(MeminitializerContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(MQL4Parser.Ellipsis, 0); }
		public TerminalNode Comma() { return getToken(MQL4Parser.Comma, 0); }
		public MeminitializerlistContext meminitializerlist() {
			return getRuleContext(MeminitializerlistContext.class,0);
		}
		public MeminitializerlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterMeminitializerlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitMeminitializerlist(this);
		}
	}

	public final MeminitializerlistContext meminitializerlist() throws RecognitionException {
		MeminitializerlistContext _localctx = new MeminitializerlistContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_meminitializerlist);
		int _la;
		try {
			setState(2165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2154);
				meminitializer();
				setState(2156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2155);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2158);
				meminitializer();
				setState(2160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2159);
					match(Ellipsis);
					}
				}

				setState(2162);
				match(Comma);
				setState(2163);
				meminitializerlist();
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

	public static class MeminitializerContext extends ParserRuleContext {
		public MeminitializeridContext meminitializerid() {
			return getRuleContext(MeminitializeridContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(MQL4Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(MQL4Parser.RightParen, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public MeminitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterMeminitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitMeminitializer(this);
		}
	}

	public final MeminitializerContext meminitializer() throws RecognitionException {
		MeminitializerContext _localctx = new MeminitializerContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_meminitializer);
		int _la;
		try {
			setState(2177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2167);
				meminitializerid();
				setState(2168);
				match(LeftParen);
				setState(2170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Color) | (1L << Const_cast) | (1L << Datetime) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (This - 66)) | (1L << (Throw - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Uchar - 66)) | (1L << (Unshort - 66)) | (1L << (Ulong - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (Doublecolon - 134)) | (1L << (Identifier - 134)) | (1L << (Integerliteral - 134)) | (1L << (ColorLiteral - 134)) | (1L << (DatetimeLiteral - 134)) | (1L << (Characterliteral - 134)) | (1L << (Floatingliteral - 134)) | (1L << (Stringliteral - 134)) | (1L << (Userdefinedintegerliteral - 134)) | (1L << (Userdefinedfloatingliteral - 134)) | (1L << (Userdefinedstringliteral - 134)) | (1L << (Userdefinedcharacterliteral - 134)))) != 0)) {
					{
					setState(2169);
					expressionlist();
					}
				}

				setState(2172);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2174);
				meminitializerid();
				setState(2175);
				bracedinitlist();
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

	public static class MeminitializeridContext extends ParserRuleContext {
		public ClassordecltypeContext classordecltype() {
			return getRuleContext(ClassordecltypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MQL4Parser.Identifier, 0); }
		public MeminitializeridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterMeminitializerid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitMeminitializerid(this);
		}
	}

	public final MeminitializeridContext meminitializerid() throws RecognitionException {
		MeminitializeridContext _localctx = new MeminitializeridContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_meminitializerid);
		try {
			setState(2181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2179);
				classordecltype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2180);
				match(Identifier);
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

	public static class OperatorfunctionidContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(MQL4Parser.Operator, 0); }
		public TheoperatorContext theoperator() {
			return getRuleContext(TheoperatorContext.class,0);
		}
		public OperatorfunctionidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorfunctionid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterOperatorfunctionid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitOperatorfunctionid(this);
		}
	}

	public final OperatorfunctionidContext operatorfunctionid() throws RecognitionException {
		OperatorfunctionidContext _localctx = new OperatorfunctionidContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_operatorfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2183);
			match(Operator);
			setState(2184);
			theoperator();
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

	public static class LiteraloperatoridContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(MQL4Parser.Operator, 0); }
		public TerminalNode Stringliteral() { return getToken(MQL4Parser.Stringliteral, 0); }
		public TerminalNode Identifier() { return getToken(MQL4Parser.Identifier, 0); }
		public TerminalNode Userdefinedstringliteral() { return getToken(MQL4Parser.Userdefinedstringliteral, 0); }
		public LiteraloperatoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literaloperatorid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterLiteraloperatorid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitLiteraloperatorid(this);
		}
	}

	public final LiteraloperatoridContext literaloperatorid() throws RecognitionException {
		LiteraloperatoridContext _localctx = new LiteraloperatoridContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_literaloperatorid);
		try {
			setState(2191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2186);
				match(Operator);
				setState(2187);
				match(Stringliteral);
				setState(2188);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2189);
				match(Operator);
				setState(2190);
				match(Userdefinedstringliteral);
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

	public static class TemplatedeclarationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(MQL4Parser.Template, 0); }
		public TerminalNode Less() { return getToken(MQL4Parser.Less, 0); }
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public TerminalNode Greater() { return getToken(MQL4Parser.Greater, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TemplatedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatedeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterTemplatedeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitTemplatedeclaration(this);
		}
	}

	public final TemplatedeclarationContext templatedeclaration() throws RecognitionException {
		TemplatedeclarationContext _localctx = new TemplatedeclarationContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_templatedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2193);
			match(Template);
			setState(2194);
			match(Less);
			setState(2195);
			templateparameterlist(0);
			setState(2196);
			match(Greater);
			setState(2197);
			declaration();
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

	public static class TemplateparameterlistContext extends ParserRuleContext {
		public TemplateparameterContext templateparameter() {
			return getRuleContext(TemplateparameterContext.class,0);
		}
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MQL4Parser.Comma, 0); }
		public TemplateparameterlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateparameterlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterTemplateparameterlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitTemplateparameterlist(this);
		}
	}

	public final TemplateparameterlistContext templateparameterlist() throws RecognitionException {
		return templateparameterlist(0);
	}

	private TemplateparameterlistContext templateparameterlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TemplateparameterlistContext _localctx = new TemplateparameterlistContext(_ctx, _parentState);
		TemplateparameterlistContext _prevctx = _localctx;
		int _startState = 348;
		enterRecursionRule(_localctx, 348, RULE_templateparameterlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2200);
			templateparameter();
			}
			_ctx.stop = _input.LT(-1);
			setState(2207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateparameterlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateparameterlist);
					setState(2202);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2203);
					match(Comma);
					setState(2204);
					templateparameter();
					}
					} 
				}
				setState(2209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TemplateparameterContext extends ParserRuleContext {
		public TypeparameterContext typeparameter() {
			return getRuleContext(TypeparameterContext.class,0);
		}
		public ParameterdeclarationContext parameterdeclaration() {
			return getRuleContext(ParameterdeclarationContext.class,0);
		}
		public TemplateparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterTemplateparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitTemplateparameter(this);
		}
	}

	public final TemplateparameterContext templateparameter() throws RecognitionException {
		TemplateparameterContext _localctx = new TemplateparameterContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_templateparameter);
		try {
			setState(2212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2210);
				typeparameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2211);
				parameterdeclaration();
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

	public static class TypeparameterContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(MQL4Parser.Class, 0); }
		public TerminalNode Ellipsis() { return getToken(MQL4Parser.Ellipsis, 0); }
		public TerminalNode Identifier() { return getToken(MQL4Parser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(MQL4Parser.Assign, 0); }
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public TerminalNode Typename_() { return getToken(MQL4Parser.Typename_, 0); }
		public TerminalNode Template() { return getToken(MQL4Parser.Template, 0); }
		public TerminalNode Less() { return getToken(MQL4Parser.Less, 0); }
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public TerminalNode Greater() { return getToken(MQL4Parser.Greater, 0); }
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TypeparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterTypeparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitTypeparameter(this);
		}
	}

	public final TypeparameterContext typeparameter() throws RecognitionException {
		TypeparameterContext _localctx = new TypeparameterContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_typeparameter);
		int _la;
		try {
			setState(2262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2214);
				match(Class);
				setState(2216);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
				case 1:
					{
					setState(2215);
					match(Ellipsis);
					}
					break;
				}
				setState(2219);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
				case 1:
					{
					setState(2218);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2221);
				match(Class);
				setState(2223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2222);
					match(Identifier);
					}
				}

				setState(2225);
				match(Assign);
				setState(2226);
				thetypeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2227);
				match(Typename_);
				setState(2229);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(2228);
					match(Ellipsis);
					}
					break;
				}
				setState(2232);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(2231);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2234);
				match(Typename_);
				setState(2236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2235);
					match(Identifier);
					}
				}

				setState(2238);
				match(Assign);
				setState(2239);
				thetypeid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2240);
				match(Template);
				setState(2241);
				match(Less);
				setState(2242);
				templateparameterlist(0);
				setState(2243);
				match(Greater);
				setState(2244);
				match(Class);
				setState(2246);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(2245);
					match(Ellipsis);
					}
					break;
				}
				setState(2249);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(2248);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2251);
				match(Template);
				setState(2252);
				match(Less);
				setState(2253);
				templateparameterlist(0);
				setState(2254);
				match(Greater);
				setState(2255);
				match(Class);
				setState(2257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2256);
					match(Identifier);
					}
				}

				setState(2259);
				match(Assign);
				setState(2260);
				idexpression();
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

	public static class SimpletemplateidContext extends ParserRuleContext {
		public TemplatenameContext templatename() {
			return getRuleContext(TemplatenameContext.class,0);
		}
		public TerminalNode Less() { return getToken(MQL4Parser.Less, 0); }
		public TerminalNode Greater() { return getToken(MQL4Parser.Greater, 0); }
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public SimpletemplateidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpletemplateid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterSimpletemplateid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitSimpletemplateid(this);
		}
	}

	public final SimpletemplateidContext simpletemplateid() throws RecognitionException {
		SimpletemplateidContext _localctx = new SimpletemplateidContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_simpletemplateid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2264);
			templatename();
			setState(2265);
			match(Less);
			setState(2267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Color) | (1L << Const) | (1L << Const_cast) | (1L << Datetime) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (Struct - 66)) | (1L << (This - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Uchar - 66)) | (1L << (Union - 66)) | (1L << (Unshort - 66)) | (1L << (Ulong - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (Doublecolon - 134)) | (1L << (Identifier - 134)) | (1L << (Integerliteral - 134)) | (1L << (ColorLiteral - 134)) | (1L << (DatetimeLiteral - 134)) | (1L << (Characterliteral - 134)) | (1L << (Floatingliteral - 134)) | (1L << (Stringliteral - 134)) | (1L << (Userdefinedintegerliteral - 134)) | (1L << (Userdefinedfloatingliteral - 134)) | (1L << (Userdefinedstringliteral - 134)) | (1L << (Userdefinedcharacterliteral - 134)))) != 0)) {
				{
				setState(2266);
				templateargumentlist(0);
				}
			}

			setState(2269);
			match(Greater);
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

	public static class TemplateidContext extends ParserRuleContext {
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public OperatorfunctionidContext operatorfunctionid() {
			return getRuleContext(OperatorfunctionidContext.class,0);
		}
		public TerminalNode Less() { return getToken(MQL4Parser.Less, 0); }
		public TerminalNode Greater() { return getToken(MQL4Parser.Greater, 0); }
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public LiteraloperatoridContext literaloperatorid() {
			return getRuleContext(LiteraloperatoridContext.class,0);
		}
		public TemplateidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterTemplateid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitTemplateid(this);
		}
	}

	public final TemplateidContext templateid() throws RecognitionException {
		TemplateidContext _localctx = new TemplateidContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_templateid);
		int _la;
		try {
			setState(2286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2271);
				simpletemplateid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2272);
				operatorfunctionid();
				setState(2273);
				match(Less);
				setState(2275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Color) | (1L << Const) | (1L << Const_cast) | (1L << Datetime) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (Struct - 66)) | (1L << (This - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Uchar - 66)) | (1L << (Union - 66)) | (1L << (Unshort - 66)) | (1L << (Ulong - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (Doublecolon - 134)) | (1L << (Identifier - 134)) | (1L << (Integerliteral - 134)) | (1L << (ColorLiteral - 134)) | (1L << (DatetimeLiteral - 134)) | (1L << (Characterliteral - 134)) | (1L << (Floatingliteral - 134)) | (1L << (Stringliteral - 134)) | (1L << (Userdefinedintegerliteral - 134)) | (1L << (Userdefinedfloatingliteral - 134)) | (1L << (Userdefinedstringliteral - 134)) | (1L << (Userdefinedcharacterliteral - 134)))) != 0)) {
					{
					setState(2274);
					templateargumentlist(0);
					}
				}

				setState(2277);
				match(Greater);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2279);
				literaloperatorid();
				setState(2280);
				match(Less);
				setState(2282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Color) | (1L << Const) | (1L << Const_cast) | (1L << Datetime) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Static_cast - 66)) | (1L << (Struct - 66)) | (1L << (This - 66)) | (1L << (True - 66)) | (1L << (Typeid_ - 66)) | (1L << (Typename_ - 66)) | (1L << (Uchar - 66)) | (1L << (Union - 66)) | (1L << (Unshort - 66)) | (1L << (Ulong - 66)) | (1L << (Unsigned - 66)) | (1L << (Void - 66)) | (1L << (Volatile - 66)) | (1L << (Wchar - 66)) | (1L << (LeftParen - 66)) | (1L << (LeftBracket - 66)) | (1L << (Plus - 66)) | (1L << (Minus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (Or - 66)) | (1L << (Tilde - 66)) | (1L << (PlusPlus - 66)) | (1L << (MinusMinus - 66)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (Doublecolon - 134)) | (1L << (Identifier - 134)) | (1L << (Integerliteral - 134)) | (1L << (ColorLiteral - 134)) | (1L << (DatetimeLiteral - 134)) | (1L << (Characterliteral - 134)) | (1L << (Floatingliteral - 134)) | (1L << (Stringliteral - 134)) | (1L << (Userdefinedintegerliteral - 134)) | (1L << (Userdefinedfloatingliteral - 134)) | (1L << (Userdefinedstringliteral - 134)) | (1L << (Userdefinedcharacterliteral - 134)))) != 0)) {
					{
					setState(2281);
					templateargumentlist(0);
					}
				}

				setState(2284);
				match(Greater);
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

	public static class TemplatenameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MQL4Parser.Identifier, 0); }
		public TemplatenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterTemplatename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitTemplatename(this);
		}
	}

	public final TemplatenameContext templatename() throws RecognitionException {
		TemplatenameContext _localctx = new TemplatenameContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_templatename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2288);
			match(Identifier);
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

	public static class TemplateargumentlistContext extends ParserRuleContext {
		public TemplateargumentContext templateargument() {
			return getRuleContext(TemplateargumentContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(MQL4Parser.Ellipsis, 0); }
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MQL4Parser.Comma, 0); }
		public TemplateargumentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateargumentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterTemplateargumentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitTemplateargumentlist(this);
		}
	}

	public final TemplateargumentlistContext templateargumentlist() throws RecognitionException {
		return templateargumentlist(0);
	}

	private TemplateargumentlistContext templateargumentlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TemplateargumentlistContext _localctx = new TemplateargumentlistContext(_ctx, _parentState);
		TemplateargumentlistContext _prevctx = _localctx;
		int _startState = 360;
		enterRecursionRule(_localctx, 360, RULE_templateargumentlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2291);
			templateargument();
			setState(2293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				{
				setState(2292);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateargumentlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateargumentlist);
					setState(2295);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2296);
					match(Comma);
					setState(2297);
					templateargument();
					setState(2299);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
					case 1:
						{
						setState(2298);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TemplateargumentContext extends ParserRuleContext {
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TemplateargumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateargument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterTemplateargument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitTemplateargument(this);
		}
	}

	public final TemplateargumentContext templateargument() throws RecognitionException {
		TemplateargumentContext _localctx = new TemplateargumentContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_templateargument);
		try {
			setState(2309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2306);
				thetypeid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2307);
				constantexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2308);
				idexpression();
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

	public static class TypenamespecifierContext extends ParserRuleContext {
		public TerminalNode Typename_() { return getToken(MQL4Parser.Typename_, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MQL4Parser.Identifier, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Template() { return getToken(MQL4Parser.Template, 0); }
		public TypenamespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typenamespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterTypenamespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitTypenamespecifier(this);
		}
	}

	public final TypenamespecifierContext typenamespecifier() throws RecognitionException {
		TypenamespecifierContext _localctx = new TypenamespecifierContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_typenamespecifier);
		int _la;
		try {
			setState(2322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2311);
				match(Typename_);
				setState(2312);
				nestednamespecifier(0);
				setState(2313);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2315);
				match(Typename_);
				setState(2316);
				nestednamespecifier(0);
				setState(2318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(2317);
					match(Template);
					}
				}

				setState(2320);
				simpletemplateid();
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

	public static class ExplicitinstantiationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(MQL4Parser.Template, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Extern() { return getToken(MQL4Parser.Extern, 0); }
		public ExplicitinstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitinstantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterExplicitinstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitExplicitinstantiation(this);
		}
	}

	public final ExplicitinstantiationContext explicitinstantiation() throws RecognitionException {
		ExplicitinstantiationContext _localctx = new ExplicitinstantiationContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_explicitinstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extern) {
				{
				setState(2324);
				match(Extern);
				}
			}

			setState(2327);
			match(Template);
			setState(2328);
			declaration();
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

	public static class ExplicitspecializationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(MQL4Parser.Template, 0); }
		public TerminalNode Less() { return getToken(MQL4Parser.Less, 0); }
		public TerminalNode Greater() { return getToken(MQL4Parser.Greater, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExplicitspecializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitspecialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterExplicitspecialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitExplicitspecialization(this);
		}
	}

	public final ExplicitspecializationContext explicitspecialization() throws RecognitionException {
		ExplicitspecializationContext _localctx = new ExplicitspecializationContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_explicitspecialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2330);
			match(Template);
			setState(2331);
			match(Less);
			setState(2332);
			match(Greater);
			setState(2333);
			declaration();
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

	public static class TryblockContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(MQL4Parser.Try, 0); }
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public TryblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterTryblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitTryblock(this);
		}
	}

	public final TryblockContext tryblock() throws RecognitionException {
		TryblockContext _localctx = new TryblockContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_tryblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2335);
			match(Try);
			setState(2336);
			compoundstatement();
			setState(2337);
			handlerseq();
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

	public static class FunctiontryblockContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(MQL4Parser.Try, 0); }
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public CtorinitializerContext ctorinitializer() {
			return getRuleContext(CtorinitializerContext.class,0);
		}
		public FunctiontryblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiontryblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterFunctiontryblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitFunctiontryblock(this);
		}
	}

	public final FunctiontryblockContext functiontryblock() throws RecognitionException {
		FunctiontryblockContext _localctx = new FunctiontryblockContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_functiontryblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2339);
			match(Try);
			setState(2341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(2340);
				ctorinitializer();
				}
			}

			setState(2343);
			compoundstatement();
			setState(2344);
			handlerseq();
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

	public static class HandlerseqContext extends ParserRuleContext {
		public HandlerContext handler() {
			return getRuleContext(HandlerContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public HandlerseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterHandlerseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitHandlerseq(this);
		}
	}

	public final HandlerseqContext handlerseq() throws RecognitionException {
		HandlerseqContext _localctx = new HandlerseqContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_handlerseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2346);
			handler();
			setState(2348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				{
				setState(2347);
				handlerseq();
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

	public static class HandlerContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(MQL4Parser.Catch, 0); }
		public TerminalNode LeftParen() { return getToken(MQL4Parser.LeftParen, 0); }
		public ExceptiondeclarationContext exceptiondeclaration() {
			return getRuleContext(ExceptiondeclarationContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MQL4Parser.RightParen, 0); }
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public HandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitHandler(this);
		}
	}

	public final HandlerContext handler() throws RecognitionException {
		HandlerContext _localctx = new HandlerContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_handler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2350);
			match(Catch);
			setState(2351);
			match(LeftParen);
			setState(2352);
			exceptiondeclaration();
			setState(2353);
			match(RightParen);
			setState(2354);
			compoundstatement();
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

	public static class ExceptiondeclarationContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(MQL4Parser.Ellipsis, 0); }
		public ExceptiondeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptiondeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterExceptiondeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitExceptiondeclaration(this);
		}
	}

	public final ExceptiondeclarationContext exceptiondeclaration() throws RecognitionException {
		ExceptiondeclarationContext _localctx = new ExceptiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_exceptiondeclaration);
		int _la;
		try {
			setState(2370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2356);
					attributespecifierseq(0);
					}
				}

				setState(2359);
				typespecifierseq();
				setState(2360);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2362);
					attributespecifierseq(0);
					}
				}

				setState(2365);
				typespecifierseq();
				setState(2367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2 || _la==Decltype || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (LeftParen - 90)) | (1L << (LeftBracket - 90)) | (1L << (Star - 90)) | (1L << (And - 90)) | (1L << (Doublecolon - 90)) | (1L << (Ellipsis - 90)) | (1L << (Identifier - 90)))) != 0)) {
					{
					setState(2366);
					abstractdeclarator();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2369);
				match(Ellipsis);
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

	public static class ThrowexpressionContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(MQL4Parser.Throw, 0); }
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ThrowexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterThrowexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitThrowexpression(this);
		}
	}

	public final ThrowexpressionContext throwexpression() throws RecognitionException {
		ThrowexpressionContext _localctx = new ThrowexpressionContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_throwexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2372);
			match(Throw);
			setState(2374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				{
				setState(2373);
				assignmentexpression();
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

	public static class ExceptionspecificationContext extends ParserRuleContext {
		public DynamicexceptionspecificationContext dynamicexceptionspecification() {
			return getRuleContext(DynamicexceptionspecificationContext.class,0);
		}
		public NoexceptspecificationContext noexceptspecification() {
			return getRuleContext(NoexceptspecificationContext.class,0);
		}
		public ExceptionspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterExceptionspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitExceptionspecification(this);
		}
	}

	public final ExceptionspecificationContext exceptionspecification() throws RecognitionException {
		ExceptionspecificationContext _localctx = new ExceptionspecificationContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_exceptionspecification);
		try {
			setState(2378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(2376);
				dynamicexceptionspecification();
				}
				break;
			case Noexcept:
				enterOuterAlt(_localctx, 2);
				{
				setState(2377);
				noexceptspecification();
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

	public static class DynamicexceptionspecificationContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(MQL4Parser.Throw, 0); }
		public TerminalNode LeftParen() { return getToken(MQL4Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(MQL4Parser.RightParen, 0); }
		public TypeidlistContext typeidlist() {
			return getRuleContext(TypeidlistContext.class,0);
		}
		public DynamicexceptionspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicexceptionspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterDynamicexceptionspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitDynamicexceptionspecification(this);
		}
	}

	public final DynamicexceptionspecificationContext dynamicexceptionspecification() throws RecognitionException {
		DynamicexceptionspecificationContext _localctx = new DynamicexceptionspecificationContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_dynamicexceptionspecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2380);
			match(Throw);
			setState(2381);
			match(LeftParen);
			setState(2383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (Auto - 12)) | (1L << (Bool - 12)) | (1L << (Char - 12)) | (1L << (Char16 - 12)) | (1L << (Char32 - 12)) | (1L << (Class - 12)) | (1L << (Color - 12)) | (1L << (Const - 12)) | (1L << (Datetime - 12)) | (1L << (Decltype - 12)) | (1L << (Double - 12)) | (1L << (Enum - 12)) | (1L << (Float - 12)) | (1L << (Int - 12)) | (1L << (Long - 12)) | (1L << (Short - 12)) | (1L << (Signed - 12)) | (1L << (Struct - 12)))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (Typename_ - 77)) | (1L << (Uchar - 77)) | (1L << (Union - 77)) | (1L << (Unshort - 77)) | (1L << (Ulong - 77)) | (1L << (Unsigned - 77)) | (1L << (Void - 77)) | (1L << (Volatile - 77)) | (1L << (Wchar - 77)) | (1L << (Doublecolon - 77)) | (1L << (Identifier - 77)))) != 0)) {
				{
				setState(2382);
				typeidlist(0);
				}
			}

			setState(2385);
			match(RightParen);
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

	public static class TypeidlistContext extends ParserRuleContext {
		public ThetypeidContext thetypeid() {
			return getRuleContext(ThetypeidContext.class,0);
		}
		public TerminalNode Ellipsis() { return getToken(MQL4Parser.Ellipsis, 0); }
		public TypeidlistContext typeidlist() {
			return getRuleContext(TypeidlistContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MQL4Parser.Comma, 0); }
		public TypeidlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeidlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterTypeidlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitTypeidlist(this);
		}
	}

	public final TypeidlistContext typeidlist() throws RecognitionException {
		return typeidlist(0);
	}

	private TypeidlistContext typeidlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeidlistContext _localctx = new TypeidlistContext(_ctx, _parentState);
		TypeidlistContext _prevctx = _localctx;
		int _startState = 386;
		enterRecursionRule(_localctx, 386, RULE_typeidlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2388);
			thetypeid();
			setState(2390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				{
				setState(2389);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeidlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeidlist);
					setState(2392);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2393);
					match(Comma);
					setState(2394);
					thetypeid();
					setState(2396);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
					case 1:
						{
						setState(2395);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NoexceptspecificationContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(MQL4Parser.Noexcept, 0); }
		public TerminalNode LeftParen() { return getToken(MQL4Parser.LeftParen, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MQL4Parser.RightParen, 0); }
		public NoexceptspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noexceptspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterNoexceptspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitNoexceptspecification(this);
		}
	}

	public final NoexceptspecificationContext noexceptspecification() throws RecognitionException {
		NoexceptspecificationContext _localctx = new NoexceptspecificationContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_noexceptspecification);
		try {
			setState(2409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2403);
				match(Noexcept);
				setState(2404);
				match(LeftParen);
				setState(2405);
				constantexpression();
				setState(2406);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2408);
				match(Noexcept);
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

	public static class TheoperatorContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(MQL4Parser.New, 0); }
		public TerminalNode Delete() { return getToken(MQL4Parser.Delete, 0); }
		public TerminalNode LeftBracket() { return getToken(MQL4Parser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(MQL4Parser.RightBracket, 0); }
		public TerminalNode Plus() { return getToken(MQL4Parser.Plus, 0); }
		public TerminalNode Minus() { return getToken(MQL4Parser.Minus, 0); }
		public TerminalNode Star() { return getToken(MQL4Parser.Star, 0); }
		public TerminalNode Div() { return getToken(MQL4Parser.Div, 0); }
		public TerminalNode Mod() { return getToken(MQL4Parser.Mod, 0); }
		public TerminalNode Caret() { return getToken(MQL4Parser.Caret, 0); }
		public TerminalNode And() { return getToken(MQL4Parser.And, 0); }
		public TerminalNode Or() { return getToken(MQL4Parser.Or, 0); }
		public TerminalNode Tilde() { return getToken(MQL4Parser.Tilde, 0); }
		public TerminalNode Assign() { return getToken(MQL4Parser.Assign, 0); }
		public TerminalNode Less() { return getToken(MQL4Parser.Less, 0); }
		public TerminalNode Greater() { return getToken(MQL4Parser.Greater, 0); }
		public TerminalNode PlusAssign() { return getToken(MQL4Parser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(MQL4Parser.MinusAssign, 0); }
		public TerminalNode StarAssign() { return getToken(MQL4Parser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(MQL4Parser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(MQL4Parser.ModAssign, 0); }
		public TerminalNode XorAssign() { return getToken(MQL4Parser.XorAssign, 0); }
		public TerminalNode AndAssign() { return getToken(MQL4Parser.AndAssign, 0); }
		public TerminalNode OrAssign() { return getToken(MQL4Parser.OrAssign, 0); }
		public TerminalNode LeftShift() { return getToken(MQL4Parser.LeftShift, 0); }
		public TerminalNode RightShift() { return getToken(MQL4Parser.RightShift, 0); }
		public TerminalNode RightShiftAssign() { return getToken(MQL4Parser.RightShiftAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(MQL4Parser.LeftShiftAssign, 0); }
		public TerminalNode Equal() { return getToken(MQL4Parser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(MQL4Parser.NotEqual, 0); }
		public TerminalNode LessEqual() { return getToken(MQL4Parser.LessEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(MQL4Parser.GreaterEqual, 0); }
		public TerminalNode PlusPlus() { return getToken(MQL4Parser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(MQL4Parser.MinusMinus, 0); }
		public TerminalNode Comma() { return getToken(MQL4Parser.Comma, 0); }
		public TerminalNode ArrowStar() { return getToken(MQL4Parser.ArrowStar, 0); }
		public TerminalNode Arrow() { return getToken(MQL4Parser.Arrow, 0); }
		public TerminalNode LeftParen() { return getToken(MQL4Parser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(MQL4Parser.RightParen, 0); }
		public TheoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterTheoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitTheoperator(this);
		}
	}

	public final TheoperatorContext theoperator() throws RecognitionException {
		TheoperatorContext _localctx = new TheoperatorContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_theoperator);
		try {
			setState(2462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2411);
				match(New);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2412);
				match(Delete);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2413);
				match(New);
				setState(2414);
				match(LeftBracket);
				setState(2415);
				match(RightBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2416);
				match(Delete);
				setState(2417);
				match(LeftBracket);
				setState(2418);
				match(RightBracket);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2419);
				match(Plus);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2420);
				match(Minus);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2421);
				match(Star);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2422);
				match(Div);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2423);
				match(Mod);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2424);
				match(Caret);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2425);
				match(And);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2426);
				match(Or);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2427);
				match(Tilde);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2428);
				match(T__0);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2429);
				match(T__1);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2430);
				match(Assign);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2431);
				match(Less);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2432);
				match(Greater);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2433);
				match(PlusAssign);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2434);
				match(MinusAssign);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2435);
				match(StarAssign);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2436);
				match(DivAssign);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2437);
				match(ModAssign);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2438);
				match(XorAssign);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2439);
				match(AndAssign);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2440);
				match(OrAssign);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2441);
				match(LeftShift);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2442);
				match(RightShift);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2443);
				match(RightShiftAssign);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2444);
				match(LeftShiftAssign);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2445);
				match(Equal);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2446);
				match(NotEqual);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2447);
				match(LessEqual);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2448);
				match(GreaterEqual);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2449);
				match(T__2);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2450);
				match(T__3);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2451);
				match(T__4);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2452);
				match(T__5);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2453);
				match(PlusPlus);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2454);
				match(MinusMinus);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2455);
				match(Comma);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2456);
				match(ArrowStar);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(2457);
				match(Arrow);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(2458);
				match(LeftParen);
				setState(2459);
				match(RightParen);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(2460);
				match(LeftBracket);
				setState(2461);
				match(RightBracket);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode Integerliteral() { return getToken(MQL4Parser.Integerliteral, 0); }
		public TerminalNode Characterliteral() { return getToken(MQL4Parser.Characterliteral, 0); }
		public TerminalNode Floatingliteral() { return getToken(MQL4Parser.Floatingliteral, 0); }
		public TerminalNode Stringliteral() { return getToken(MQL4Parser.Stringliteral, 0); }
		public TerminalNode ColorLiteral() { return getToken(MQL4Parser.ColorLiteral, 0); }
		public TerminalNode DatetimeLiteral() { return getToken(MQL4Parser.DatetimeLiteral, 0); }
		public BooleanliteralContext booleanliteral() {
			return getRuleContext(BooleanliteralContext.class,0);
		}
		public PointerliteralContext pointerliteral() {
			return getRuleContext(PointerliteralContext.class,0);
		}
		public UserdefinedliteralContext userdefinedliteral() {
			return getRuleContext(UserdefinedliteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_literal);
		try {
			setState(2473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integerliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2464);
				match(Integerliteral);
				}
				break;
			case Characterliteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2465);
				match(Characterliteral);
				}
				break;
			case Floatingliteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(2466);
				match(Floatingliteral);
				}
				break;
			case Stringliteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(2467);
				match(Stringliteral);
				}
				break;
			case ColorLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(2468);
				match(ColorLiteral);
				}
				break;
			case DatetimeLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(2469);
				match(DatetimeLiteral);
				}
				break;
			case False:
			case True:
				enterOuterAlt(_localctx, 7);
				{
				setState(2470);
				booleanliteral();
				}
				break;
			case Nullptr:
				enterOuterAlt(_localctx, 8);
				{
				setState(2471);
				pointerliteral();
				}
				break;
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 9);
				{
				setState(2472);
				userdefinedliteral();
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

	public static class BooleanliteralContext extends ParserRuleContext {
		public TerminalNode False() { return getToken(MQL4Parser.False, 0); }
		public TerminalNode True() { return getToken(MQL4Parser.True, 0); }
		public BooleanliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterBooleanliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitBooleanliteral(this);
		}
	}

	public final BooleanliteralContext booleanliteral() throws RecognitionException {
		BooleanliteralContext _localctx = new BooleanliteralContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_booleanliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2475);
			_la = _input.LA(1);
			if ( !(_la==False || _la==True) ) {
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

	public static class PointerliteralContext extends ParserRuleContext {
		public TerminalNode Nullptr() { return getToken(MQL4Parser.Nullptr, 0); }
		public PointerliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterPointerliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitPointerliteral(this);
		}
	}

	public final PointerliteralContext pointerliteral() throws RecognitionException {
		PointerliteralContext _localctx = new PointerliteralContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_pointerliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2477);
			match(Nullptr);
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

	public static class UserdefinedliteralContext extends ParserRuleContext {
		public TerminalNode Userdefinedintegerliteral() { return getToken(MQL4Parser.Userdefinedintegerliteral, 0); }
		public TerminalNode Userdefinedfloatingliteral() { return getToken(MQL4Parser.Userdefinedfloatingliteral, 0); }
		public TerminalNode Userdefinedstringliteral() { return getToken(MQL4Parser.Userdefinedstringliteral, 0); }
		public TerminalNode Userdefinedcharacterliteral() { return getToken(MQL4Parser.Userdefinedcharacterliteral, 0); }
		public UserdefinedliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userdefinedliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).enterUserdefinedliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MQL4Listener ) ((MQL4Listener)listener).exitUserdefinedliteral(this);
		}
	}

	public final UserdefinedliteralContext userdefinedliteral() throws RecognitionException {
		UserdefinedliteralContext _localctx = new UserdefinedliteralContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_userdefinedliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2479);
			_la = _input.LA(1);
			if ( !(((((_la - 151)) & ~0x3f) == 0 && ((1L << (_la - 151)) & ((1L << (Userdefinedintegerliteral - 151)) | (1L << (Userdefinedfloatingliteral - 151)) | (1L << (Userdefinedstringliteral - 151)) | (1L << (Userdefinedcharacterliteral - 151)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return nestednamespecifier_sempred((NestednamespecifierContext)_localctx, predIndex);
		case 10:
			return capturelist_sempred((CapturelistContext)_localctx, predIndex);
		case 15:
			return postfixexpression_sempred((PostfixexpressionContext)_localctx, predIndex);
		case 26:
			return noptrnewdeclarator_sempred((NoptrnewdeclaratorContext)_localctx, predIndex);
		case 31:
			return pmexpression_sempred((PmexpressionContext)_localctx, predIndex);
		case 32:
			return multiplicativeexpression_sempred((MultiplicativeexpressionContext)_localctx, predIndex);
		case 33:
			return additiveexpression_sempred((AdditiveexpressionContext)_localctx, predIndex);
		case 34:
			return shiftexpression_sempred((ShiftexpressionContext)_localctx, predIndex);
		case 36:
			return relationalexpression_sempred((RelationalexpressionContext)_localctx, predIndex);
		case 37:
			return equalityexpression_sempred((EqualityexpressionContext)_localctx, predIndex);
		case 38:
			return andexpression_sempred((AndexpressionContext)_localctx, predIndex);
		case 39:
			return exclusiveorexpression_sempred((ExclusiveorexpressionContext)_localctx, predIndex);
		case 40:
			return inclusiveorexpression_sempred((InclusiveorexpressionContext)_localctx, predIndex);
		case 41:
			return logicalandexpression_sempred((LogicalandexpressionContext)_localctx, predIndex);
		case 42:
			return logicalorexpression_sempred((LogicalorexpressionContext)_localctx, predIndex);
		case 46:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 52:
			return statementseq_sempred((StatementseqContext)_localctx, predIndex);
		case 61:
			return declarationseq_sempred((DeclarationseqContext)_localctx, predIndex);
		case 88:
			return enumeratorlist_sempred((EnumeratorlistContext)_localctx, predIndex);
		case 106:
			return attributespecifierseq_sempred((AttributespecifierseqContext)_localctx, predIndex);
		case 109:
			return attributelist_sempred((AttributelistContext)_localctx, predIndex);
		case 115:
			return balancedtokenseq_sempred((BalancedtokenseqContext)_localctx, predIndex);
		case 117:
			return initdeclaratorlist_sempred((InitdeclaratorlistContext)_localctx, predIndex);
		case 121:
			return noptrdeclarator_sempred((NoptrdeclaratorContext)_localctx, predIndex);
		case 132:
			return noptrabstractdeclarator_sempred((NoptrabstractdeclaratorContext)_localctx, predIndex);
		case 134:
			return noptrabstractpackdeclarator_sempred((NoptrabstractpackdeclaratorContext)_localctx, predIndex);
		case 136:
			return parameterdeclarationlist_sempred((ParameterdeclarationlistContext)_localctx, predIndex);
		case 143:
			return initializerlist_sempred((InitializerlistContext)_localctx, predIndex);
		case 153:
			return memberdeclaratorlist_sempred((MemberdeclaratorlistContext)_localctx, predIndex);
		case 155:
			return virtspecifierseq_sempred((VirtspecifierseqContext)_localctx, predIndex);
		case 159:
			return basespecifierlist_sempred((BasespecifierlistContext)_localctx, predIndex);
		case 174:
			return templateparameterlist_sempred((TemplateparameterlistContext)_localctx, predIndex);
		case 180:
			return templateargumentlist_sempred((TemplateargumentlistContext)_localctx, predIndex);
		case 193:
			return typeidlist_sempred((TypeidlistContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean nestednamespecifier_sempred(NestednamespecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean capturelist_sempred(CapturelistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixexpression_sempred(PostfixexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		case 11:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean noptrnewdeclarator_sempred(NoptrnewdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean pmexpression_sempred(PmexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeexpression_sempred(MultiplicativeexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveexpression_sempred(AdditiveexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftexpression_sempred(ShiftexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalexpression_sempred(RelationalexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 4);
		case 22:
			return precpred(_ctx, 3);
		case 23:
			return precpred(_ctx, 2);
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityexpression_sempred(EqualityexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 2);
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andexpression_sempred(AndexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveorexpression_sempred(ExclusiveorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveorexpression_sempred(InclusiveorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalandexpression_sempred(LogicalandexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 2);
		case 31:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalorexpression_sempred(LogicalorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 2);
		case 33:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statementseq_sempred(StatementseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarationseq_sempred(DeclarationseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean enumeratorlist_sempred(EnumeratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributespecifierseq_sempred(AttributespecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributelist_sempred(AttributelistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39:
			return precpred(_ctx, 3);
		case 40:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean balancedtokenseq_sempred(BalancedtokenseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initdeclaratorlist_sempred(InitdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean noptrdeclarator_sempred(NoptrdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 43:
			return precpred(_ctx, 3);
		case 44:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean noptrabstractdeclarator_sempred(NoptrabstractdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 45:
			return precpred(_ctx, 5);
		case 46:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean noptrabstractpackdeclarator_sempred(NoptrabstractpackdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return precpred(_ctx, 3);
		case 48:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean parameterdeclarationlist_sempred(ParameterdeclarationlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initializerlist_sempred(InitializerlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean memberdeclaratorlist_sempred(MemberdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean virtspecifierseq_sempred(VirtspecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean basespecifierlist_sempred(BasespecifierlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 53:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean templateparameterlist_sempred(TemplateparameterlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 54:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean templateargumentlist_sempred(TemplateargumentlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 55:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeidlist_sempred(TypeidlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 56:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00a0\u09b4\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\3\2\5\2\u0194\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\u01a0\n\3\3\4\3\4\5\4\u01a4\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5\u01af\n\5\3\6\3\6\5\6\u01b3\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u01c2\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u01c9\n"+
		"\7\3\7\3\7\3\7\7\7\u01ce\n\7\f\7\16\7\u01d1\13\7\3\b\3\b\5\b\u01d5\n\b"+
		"\3\b\3\b\3\t\3\t\5\t\u01db\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u01e5"+
		"\n\n\3\13\3\13\3\f\3\f\3\f\5\f\u01ec\n\f\3\f\3\f\3\f\3\f\5\f\u01f2\n\f"+
		"\7\f\u01f4\n\f\f\f\16\f\u01f7\13\f\3\r\3\r\5\r\u01fb\n\r\3\16\3\16\3\16"+
		"\3\16\5\16\u0201\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u0208\n\17\3\20\3"+
		"\20\3\20\3\20\5\20\u020e\n\20\3\20\5\20\u0211\n\20\3\20\5\20\u0214\n\20"+
		"\3\20\5\20\u0217\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u021e\n\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u0225\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u0259\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u0268\n\21\3\21\3\21\3\21\3\21\5\21\u026e\n\21\3"+
		"\21\3\21\3\21\3\21\5\21\u0274\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u0281\n\21\f\21\16\21\u0284\13\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\5\25\u028d\n\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u029c\n\25\3\25\3\25\3\25\3\25"+
		"\5\25\u02a2\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u02c0\n\26\3\27\3\27\3\30\5\30\u02c5\n\30\3\30\3"+
		"\30\5\30\u02c9\n\30\3\30\3\30\5\30\u02cd\n\30\3\30\5\30\u02d0\n\30\3\30"+
		"\3\30\5\30\u02d4\n\30\3\30\3\30\3\30\3\30\5\30\u02da\n\30\5\30\u02dc\n"+
		"\30\3\31\3\31\3\31\3\31\3\32\3\32\5\32\u02e4\n\32\3\33\3\33\5\33\u02e8"+
		"\n\33\3\33\5\33\u02eb\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u02f2\n\34\3"+
		"\34\3\34\3\34\3\34\3\34\5\34\u02f9\n\34\7\34\u02fb\n\34\f\34\16\34\u02fe"+
		"\13\34\3\35\3\35\5\35\u0302\n\35\3\35\3\35\5\35\u0306\n\35\3\36\5\36\u0309"+
		"\n\36\3\36\3\36\3\36\5\36\u030e\n\36\3\36\3\36\3\36\3\36\5\36\u0314\n"+
		"\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \5 \u0321\n \3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\7!\u032c\n!\f!\16!\u032f\13!\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u033d\n\"\f\"\16\"\u0340\13\"\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\7#\u034b\n#\f#\16#\u034e\13#\3$\3$\3$\3$\3$\3$\3$\7$"+
		"\u0357\n$\f$\16$\u035a\13$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\7&\u036d\n&\f&\16&\u0370\13&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\7\'\u037b\n\'\f\'\16\'\u037e\13\'\3(\3(\3(\3(\3(\3(\7(\u0386\n(\f("+
		"\16(\u0389\13(\3)\3)\3)\3)\3)\3)\7)\u0391\n)\f)\16)\u0394\13)\3*\3*\3"+
		"*\3*\3*\3*\7*\u039c\n*\f*\16*\u039f\13*\3+\3+\3+\3+\3+\3+\3+\3+\3+\7+"+
		"\u03aa\n+\f+\16+\u03ad\13+\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u03b8\n,\f,\16"+
		",\u03bb\13,\3-\3-\3-\3-\3-\3-\3-\5-\u03c4\n-\3.\3.\3.\3.\3.\3.\5.\u03cc"+
		"\n.\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u03d6\n\60\f\60\16\60\u03d9"+
		"\13\60\3\61\3\61\3\62\3\62\5\62\u03df\n\62\3\62\3\62\5\62\u03e3\n\62\3"+
		"\62\3\62\5\62\u03e7\n\62\3\62\3\62\5\62\u03eb\n\62\3\62\3\62\5\62\u03ef"+
		"\n\62\3\62\3\62\3\62\5\62\u03f4\n\62\3\62\5\62\u03f7\n\62\3\63\5\63\u03fa"+
		"\n\63\3\63\3\63\3\63\3\63\5\63\u0400\n\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\5\63\u0408\n\63\3\63\3\63\3\63\5\63\u040d\n\63\3\64\5\64\u0410\n\64\3"+
		"\64\3\64\3\65\3\65\5\65\u0416\n\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66"+
		"\7\66\u041f\n\66\f\66\16\66\u0422\13\66\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\5\67\u0438\n\67\38\38\58\u043c\n8\38\38\38\38\38\38\58\u0444\n8\38\3"+
		"8\38\38\58\u044a\n8\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\3"+
		"9\39\59\u045e\n9\39\39\59\u0462\n9\39\39\39\39\39\39\39\39\39\39\39\5"+
		"9\u046f\n9\3:\3:\5:\u0473\n:\3;\5;\u0476\n;\3;\3;\3;\3<\3<\5<\u047d\n"+
		"<\3=\3=\3=\3=\3=\3=\5=\u0485\n=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\5=\u0495\n=\3>\3>\3?\3?\3?\3?\3?\7?\u049e\n?\f?\16?\u04a1\13?\3@"+
		"\3@\3@\3@\3@\3@\3@\3@\3@\5@\u04ac\n@\3A\3A\3A\3A\3A\3A\3A\3A\5A\u04b6"+
		"\nA\3B\3B\3B\5B\u04bb\nB\3B\3B\3B\3B\3C\5C\u04c2\nC\3C\5C\u04c5\nC\3C"+
		"\3C\3C\5C\u04ca\nC\3C\3C\3C\5C\u04cf\nC\3D\3D\3D\3D\3D\3D\3D\3D\3E\3E"+
		"\3F\3F\3F\3G\3G\3G\3G\3G\3G\5G\u04e4\nG\3H\3H\5H\u04e8\nH\3H\3H\3H\5H"+
		"\u04ed\nH\3I\3I\3J\3J\3K\3K\3L\3L\3L\5L\u04f8\nL\3M\3M\3M\3M\5M\u04fe"+
		"\nM\3N\3N\5N\u0502\nN\3N\3N\3N\5N\u0507\nN\3O\3O\5O\u050b\nO\3O\3O\3O"+
		"\5O\u0510\nO\3P\5P\u0513\nP\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P"+
		"\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u052e\nP\3Q\3Q\3Q\3Q\5Q\u0534\nQ"+
		"\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u053f\nR\3S\3S\5S\u0543\nS\3S\5S\u0546"+
		"\nS\3S\3S\3S\3S\3S\3S\3S\3S\5S\u0550\nS\3S\3S\3S\3S\5S\u0556\nS\3S\5S"+
		"\u0559\nS\3T\3T\3U\3U\3U\5U\u0560\nU\3U\3U\3U\3U\3U\3U\3U\3U\5U\u056a"+
		"\nU\3V\3V\5V\u056e\nV\3V\5V\u0571\nV\3V\5V\u0574\nV\3V\3V\5V\u0578\nV"+
		"\3V\3V\3V\5V\u057d\nV\5V\u057f\nV\3W\3W\5W\u0583\nW\3W\3W\5W\u0587\nW"+
		"\3W\3W\3X\3X\3X\3X\3X\5X\u0590\nX\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\7Z\u059b"+
		"\nZ\fZ\16Z\u059e\13Z\3[\3[\3[\3[\3[\5[\u05a5\n[\3\\\3\\\3]\3]\5]\u05ab"+
		"\n]\3^\3^\3_\3_\5_\u05b1\n_\3`\3`\5`\u05b5\n`\3a\5a\u05b8\na\3a\3a\3a"+
		"\3a\3a\3a\3b\5b\u05c1\nb\3b\3b\3b\3b\3b\3b\3c\5c\u05ca\nc\3c\3c\3c\3c"+
		"\3c\3d\5d\u05d2\nd\3e\3e\3f\3f\3f\3f\3f\3f\3g\5g\u05dd\ng\3g\3g\3h\3h"+
		"\5h\u05e3\nh\3h\3h\3h\3h\3h\3h\3h\3h\3h\5h\u05ee\nh\3i\5i\u05f1\ni\3i"+
		"\3i\3i\5i\u05f6\ni\3i\3i\3i\3j\3j\3j\3j\3j\3j\3k\3k\3k\3k\5k\u0605\nk"+
		"\3k\3k\3k\3k\5k\u060b\nk\3l\3l\3l\3l\3l\7l\u0612\nl\fl\16l\u0615\13l\3"+
		"m\3m\3m\3m\3m\3m\3m\5m\u061e\nm\3n\3n\3n\3n\5n\u0624\nn\3n\3n\3n\3n\3"+
		"n\3n\5n\u062c\nn\3n\3n\5n\u0630\nn\3o\3o\5o\u0634\no\3o\3o\3o\5o\u0639"+
		"\no\3o\3o\3o\5o\u063e\no\3o\3o\3o\3o\3o\7o\u0645\no\fo\16o\u0648\13o\3"+
		"p\3p\5p\u064c\np\3q\3q\5q\u0650\nq\3r\3r\3r\3r\3s\3s\3t\3t\3t\3t\3u\3"+
		"u\5u\u065e\nu\3u\3u\7u\u0662\nu\fu\16u\u0665\13u\3v\3v\3v\3v\3v\3v\3v"+
		"\3v\3v\3v\3v\3v\3v\6v\u0674\nv\rv\16v\u0675\5v\u0678\nv\3w\3w\3w\3w\3"+
		"w\3w\7w\u0680\nw\fw\16w\u0683\13w\3x\3x\5x\u0687\nx\3y\3y\3y\3y\3y\5y"+
		"\u068e\ny\3z\3z\3z\3z\5z\u0694\nz\3{\3{\3{\5{\u0699\n{\3{\3{\3{\3{\5{"+
		"\u069f\n{\3{\3{\3{\3{\3{\5{\u06a6\n{\3{\3{\5{\u06aa\n{\7{\u06ac\n{\f{"+
		"\16{\u06af\13{\3|\3|\3|\3|\5|\u06b5\n|\3|\5|\u06b8\n|\3|\5|\u06bb\n|\3"+
		"|\5|\u06be\n|\3}\3}\3}\5}\u06c3\n}\3~\3~\5~\u06c7\n~\3~\5~\u06ca\n~\3"+
		"~\3~\5~\u06ce\n~\3~\3~\5~\u06d2\n~\3~\3~\3~\5~\u06d7\n~\3~\5~\u06da\n"+
		"~\5~\u06dc\n~\3\177\3\177\5\177\u06e0\n\177\3\u0080\3\u0080\3\u0081\3"+
		"\u0081\3\u0082\5\u0082\u06e7\n\u0082\3\u0082\3\u0082\3\u0083\3\u0083\5"+
		"\u0083\u06ed\n\u0083\3\u0084\3\u0084\5\u0084\u06f1\n\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\5\u0084\u06f7\n\u0084\3\u0085\3\u0085\3\u0085\5\u0085"+
		"\u06fc\n\u0085\5\u0085\u06fe\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086\5"+
		"\u0086\u0704\n\u0086\3\u0086\3\u0086\5\u0086\u0708\n\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\5\u0086\u070e\n\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\5\u0086\u0715\n\u0086\3\u0086\3\u0086\5\u0086\u0719\n\u0086\7"+
		"\u0086\u071b\n\u0086\f\u0086\16\u0086\u071e\13\u0086\3\u0087\3\u0087\3"+
		"\u0087\3\u0087\5\u0087\u0724\n\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3"+
		"\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u072e\n\u0088\3\u0088\3\u0088\5"+
		"\u0088\u0732\n\u0088\7\u0088\u0734\n\u0088\f\u0088\16\u0088\u0737\13\u0088"+
		"\3\u0089\5\u0089\u073a\n\u0089\3\u0089\5\u0089\u073d\n\u0089\3\u0089\3"+
		"\u0089\3\u0089\3\u0089\5\u0089\u0743\n\u0089\3\u008a\3\u008a\3\u008a\3"+
		"\u008a\3\u008a\3\u008a\7\u008a\u074b\n\u008a\f\u008a\16\u008a\u074e\13"+
		"\u008a\3\u008b\5\u008b\u0751\n\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5"+
		"\u008b\u0757\n\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5"+
		"\u008b\u075f\n\u008b\3\u008b\3\u008b\5\u008b\u0763\n\u008b\3\u008b\5\u008b"+
		"\u0766\n\u008b\3\u008b\3\u008b\5\u008b\u076a\n\u008b\3\u008b\3\u008b\3"+
		"\u008b\5\u008b\u076f\n\u008b\3\u008c\5\u008c\u0772\n\u008c\3\u008c\5\u008c"+
		"\u0775\n\u008c\3\u008c\3\u008c\5\u008c\u0779\n\u008c\3\u008c\3\u008c\3"+
		"\u008d\5\u008d\u077e\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3"+
		"\u008d\3\u008d\3\u008d\5\u008d\u0788\n\u008d\3\u008e\3\u008e\3\u008e\3"+
		"\u008e\3\u008e\5\u008e\u078f\n\u008e\3\u008f\3\u008f\3\u008f\5\u008f\u0794"+
		"\n\u008f\3\u0090\3\u0090\5\u0090\u0798\n\u0090\3\u0091\3\u0091\3\u0091"+
		"\5\u0091\u079d\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u07a3\n"+
		"\u0091\7\u0091\u07a5\n\u0091\f\u0091\16\u0091\u07a8\13\u0091\3\u0092\3"+
		"\u0092\3\u0092\5\u0092\u07ad\n\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5"+
		"\u0092\u07b3\n\u0092\3\u0093\3\u0093\5\u0093\u07b7\n\u0093\3\u0094\3\u0094"+
		"\3\u0094\5\u0094\u07bc\n\u0094\3\u0094\3\u0094\3\u0095\3\u0095\5\u0095"+
		"\u07c2\n\u0095\3\u0095\3\u0095\5\u0095\u07c6\n\u0095\3\u0095\5\u0095\u07c9"+
		"\n\u0095\3\u0095\3\u0095\5\u0095\u07cd\n\u0095\3\u0095\5\u0095\u07d0\n"+
		"\u0095\5\u0095\u07d2\n\u0095\3\u0096\5\u0096\u07d5\n\u0096\3\u0096\3\u0096"+
		"\3\u0097\3\u0097\3\u0098\3\u0098\3\u0099\3\u0099\5\u0099\u07df\n\u0099"+
		"\3\u0099\3\u0099\3\u0099\5\u0099\u07e4\n\u0099\5\u0099\u07e6\n\u0099\3"+
		"\u009a\5\u009a\u07e9\n\u009a\3\u009a\5\u009a\u07ec\n\u009a\3\u009a\5\u009a"+
		"\u07ef\n\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\5\u009a\u07f8\n\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\7\u009b\u0800\n\u009b\f\u009b\16\u009b\u0803\13\u009b\3\u009c\3\u009c"+
		"\5\u009c\u0807\n\u009c\3\u009c\5\u009c\u080a\n\u009c\3\u009c\3\u009c\5"+
		"\u009c\u080e\n\u009c\3\u009c\5\u009c\u0811\n\u009c\3\u009c\5\u009c\u0814"+
		"\n\u009c\3\u009c\3\u009c\5\u009c\u0818\n\u009c\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\7\u009d\u081f\n\u009d\f\u009d\16\u009d\u0822\13\u009d"+
		"\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u0830\n\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\5\u00a1\u0836\n\u00a1\7\u00a1\u0838\n\u00a1\f\u00a1\16\u00a1"+
		"\u083b\13\u00a1\3\u00a2\5\u00a2\u083e\n\u00a2\3\u00a2\3\u00a2\5\u00a2"+
		"\u0842\n\u00a2\3\u00a2\3\u00a2\5\u00a2\u0846\n\u00a2\3\u00a2\3\u00a2\5"+
		"\u00a2\u084a\n\u00a2\3\u00a2\3\u00a2\5\u00a2\u084e\n\u00a2\3\u00a2\3\u00a2"+
		"\5\u00a2\u0852\n\u00a2\3\u00a3\5\u00a3\u0855\n\u00a3\3\u00a3\3\u00a3\5"+
		"\u00a3\u0859\n\u00a3\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3"+
		"\u00a6\3\u00a7\3\u00a7\5\u00a7\u0864\n\u00a7\3\u00a8\3\u00a8\5\u00a8\u0868"+
		"\n\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00aa\3\u00aa\5\u00aa\u086f\n\u00aa"+
		"\3\u00aa\3\u00aa\5\u00aa\u0873\n\u00aa\3\u00aa\3\u00aa\3\u00aa\5\u00aa"+
		"\u0878\n\u00aa\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u087d\n\u00ab\3\u00ab\3"+
		"\u00ab\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u0884\n\u00ab\3\u00ac\3\u00ac\5"+
		"\u00ac\u0888\n\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae\3"+
		"\u00ae\3\u00ae\5\u00ae\u0892\n\u00ae\3\u00af\3\u00af\3\u00af\3\u00af\3"+
		"\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\7\u00b0"+
		"\u08a0\n\u00b0\f\u00b0\16\u00b0\u08a3\13\u00b0\3\u00b1\3\u00b1\5\u00b1"+
		"\u08a7\n\u00b1\3\u00b2\3\u00b2\5\u00b2\u08ab\n\u00b2\3\u00b2\5\u00b2\u08ae"+
		"\n\u00b2\3\u00b2\3\u00b2\5\u00b2\u08b2\n\u00b2\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\5\u00b2\u08b8\n\u00b2\3\u00b2\5\u00b2\u08bb\n\u00b2\3\u00b2\3"+
		"\u00b2\5\u00b2\u08bf\n\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3"+
		"\u00b2\3\u00b2\3\u00b2\5\u00b2\u08c9\n\u00b2\3\u00b2\5\u00b2\u08cc\n\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u08d4\n\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b2\5\u00b2\u08d9\n\u00b2\3\u00b3\3\u00b3\3\u00b3"+
		"\5\u00b3\u08de\n\u00b3\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\5\u00b4\u08e6\n\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4"+
		"\u08ed\n\u00b4\3\u00b4\3\u00b4\5\u00b4\u08f1\n\u00b4\3\u00b5\3\u00b5\3"+
		"\u00b6\3\u00b6\3\u00b6\5\u00b6\u08f8\n\u00b6\3\u00b6\3\u00b6\3\u00b6\3"+
		"\u00b6\5\u00b6\u08fe\n\u00b6\7\u00b6\u0900\n\u00b6\f\u00b6\16\u00b6\u0903"+
		"\13\u00b6\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0908\n\u00b7\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u0911\n\u00b8\3\u00b8"+
		"\3\u00b8\5\u00b8\u0915\n\u00b8\3\u00b9\5\u00b9\u0918\n\u00b9\3\u00b9\3"+
		"\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bc\3\u00bc\5\u00bc\u0928\n\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bd\3\u00bd\5\u00bd\u092f\n\u00bd\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\3\u00be\3\u00bf\5\u00bf\u0938\n\u00bf\3\u00bf\3\u00bf"+
		"\3\u00bf\3\u00bf\5\u00bf\u093e\n\u00bf\3\u00bf\3\u00bf\5\u00bf\u0942\n"+
		"\u00bf\3\u00bf\5\u00bf\u0945\n\u00bf\3\u00c0\3\u00c0\5\u00c0\u0949\n\u00c0"+
		"\3\u00c1\3\u00c1\5\u00c1\u094d\n\u00c1\3\u00c2\3\u00c2\3\u00c2\5\u00c2"+
		"\u0952\n\u00c2\3\u00c2\3\u00c2\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u0959\n"+
		"\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u095f\n\u00c3\7\u00c3\u0961"+
		"\n\u00c3\f\u00c3\16\u00c3\u0964\13\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\5\u00c4\u096c\n\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\5\u00c5\u09a1\n\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u09ac\n\u00c6\3\u00c7"+
		"\3\u00c7\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00c9\2$\f\26 \66@BDFJLNPR"+
		"TV^j|\u00b2\u00d6\u00dc\u00e8\u00ec\u00f4\u010a\u010e\u0112\u0120\u0134"+
		"\u0138\u0140\u015e\u016a\u0184\u00ca\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128"+
		"\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140"+
		"\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158"+
		"\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170"+
		"\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188"+
		"\u018a\u018c\u018e\u0190\2\20\4\2hhll\5\2\3\4bdhj\3\2wx\5\2llovyz\7\2"+
		"\'\'\62\62<<BBII\5\2%%//WW\3\2\\a\4\2\30\30YY\4\2\5\5hh\5\2\26\26EEQQ"+
		"\4\2))88\3\29;\4\2((KK\3\2\u0099\u009c\2\u0ad8\2\u0193\3\2\2\2\4\u019f"+
		"\3\2\2\2\6\u01a3\3\2\2\2\b\u01ae\3\2\2\2\n\u01b0\3\2\2\2\f\u01c1\3\2\2"+
		"\2\16\u01d2\3\2\2\2\20\u01d8\3\2\2\2\22\u01e4\3\2\2\2\24\u01e6\3\2\2\2"+
		"\26\u01e8\3\2\2\2\30\u01fa\3\2\2\2\32\u0200\3\2\2\2\34\u0207\3\2\2\2\36"+
		"\u0209\3\2\2\2 \u0258\3\2\2\2\"\u0285\3\2\2\2$\u0287\3\2\2\2&\u0289\3"+
		"\2\2\2(\u02a1\3\2\2\2*\u02bf\3\2\2\2,\u02c1\3\2\2\2.\u02db\3\2\2\2\60"+
		"\u02dd\3\2\2\2\62\u02e1\3\2\2\2\64\u02ea\3\2\2\2\66\u02ec\3\2\2\28\u0305"+
		"\3\2\2\2:\u0313\3\2\2\2<\u0315\3\2\2\2>\u0320\3\2\2\2@\u0322\3\2\2\2B"+
		"\u0330\3\2\2\2D\u0341\3\2\2\2F\u034f\3\2\2\2H\u035b\3\2\2\2J\u035d\3\2"+
		"\2\2L\u0371\3\2\2\2N\u037f\3\2\2\2P\u038a\3\2\2\2R\u0395\3\2\2\2T\u03a0"+
		"\3\2\2\2V\u03ae\3\2\2\2X\u03c3\3\2\2\2Z\u03cb\3\2\2\2\\\u03cd\3\2\2\2"+
		"^\u03cf\3\2\2\2`\u03da\3\2\2\2b\u03f6\3\2\2\2d\u040c\3\2\2\2f\u040f\3"+
		"\2\2\2h\u0413\3\2\2\2j\u0419\3\2\2\2l\u0437\3\2\2\2n\u0449\3\2\2\2p\u046e"+
		"\3\2\2\2r\u0472\3\2\2\2t\u0475\3\2\2\2v\u047c\3\2\2\2x\u0494\3\2\2\2z"+
		"\u0496\3\2\2\2|\u0498\3\2\2\2~\u04ab\3\2\2\2\u0080\u04b5\3\2\2\2\u0082"+
		"\u04b7\3\2\2\2\u0084\u04ce\3\2\2\2\u0086\u04d0\3\2\2\2\u0088\u04d8\3\2"+
		"\2\2\u008a\u04da\3\2\2\2\u008c\u04e3\3\2\2\2\u008e\u04ec\3\2\2\2\u0090"+
		"\u04ee\3\2\2\2\u0092\u04f0\3\2\2\2\u0094\u04f2\3\2\2\2\u0096\u04f7\3\2"+
		"\2\2\u0098\u04fd\3\2\2\2\u009a\u0506\3\2\2\2\u009c\u050f\3\2\2\2\u009e"+
		"\u052d\3\2\2\2\u00a0\u0533\3\2\2\2\u00a2\u053e\3\2\2\2\u00a4\u0558\3\2"+
		"\2\2\u00a6\u055a\3\2\2\2\u00a8\u0569\3\2\2\2\u00aa\u057e\3\2\2\2\u00ac"+
		"\u0580\3\2\2\2\u00ae\u058f\3\2\2\2\u00b0\u0591\3\2\2\2\u00b2\u0594\3\2"+
		"\2\2\u00b4\u05a4\3\2\2\2\u00b6\u05a6\3\2\2\2\u00b8\u05aa\3\2\2\2\u00ba"+
		"\u05ac\3\2\2\2\u00bc\u05b0\3\2\2\2\u00be\u05b4\3\2\2\2\u00c0\u05b7\3\2"+
		"\2\2\u00c2\u05c0\3\2\2\2\u00c4\u05c9\3\2\2\2\u00c6\u05d1\3\2\2\2\u00c8"+
		"\u05d3\3\2\2\2\u00ca\u05d5\3\2\2\2\u00cc\u05dc\3\2\2\2\u00ce\u05ed\3\2"+
		"\2\2\u00d0\u05f0\3\2\2\2\u00d2\u05fa\3\2\2\2\u00d4\u060a\3\2\2\2\u00d6"+
		"\u060c\3\2\2\2\u00d8\u061d\3\2\2\2\u00da\u062f\3\2\2\2\u00dc\u0638\3\2"+
		"\2\2\u00de\u0649\3\2\2\2\u00e0\u064f\3\2\2\2\u00e2\u0651\3\2\2\2\u00e4"+
		"\u0655\3\2\2\2\u00e6\u0657\3\2\2\2\u00e8\u065b\3\2\2\2\u00ea\u0677\3\2"+
		"\2\2\u00ec\u0679\3\2\2\2\u00ee\u0684\3\2\2\2\u00f0\u068d\3\2\2\2\u00f2"+
		"\u0693\3\2\2\2\u00f4\u069e\3\2\2\2\u00f6\u06b0\3\2\2\2\u00f8\u06bf\3\2"+
		"\2\2\u00fa\u06db\3\2\2\2\u00fc\u06dd\3\2\2\2\u00fe\u06e1\3\2\2\2\u0100"+
		"\u06e3\3\2\2\2\u0102\u06e6\3\2\2\2\u0104\u06ea\3\2\2\2\u0106\u06f6\3\2"+
		"\2\2\u0108\u06fd\3\2\2\2\u010a\u070d\3\2\2\2\u010c\u0723\3\2\2\2\u010e"+
		"\u0725\3\2\2\2\u0110\u0742\3\2\2\2\u0112\u0744\3\2\2\2\u0114\u076e\3\2"+
		"\2\2\u0116\u0771\3\2\2\2\u0118\u0787\3\2\2\2\u011a\u078e\3\2\2\2\u011c"+
		"\u0793\3\2\2\2\u011e\u0797\3\2\2\2\u0120\u0799\3\2\2\2\u0122\u07b2\3\2"+
		"\2\2\u0124\u07b6\3\2\2\2\u0126\u07b8\3\2\2\2\u0128\u07d1\3\2\2\2\u012a"+
		"\u07d4\3\2\2\2\u012c\u07d8\3\2\2\2\u012e\u07da\3\2\2\2\u0130\u07e5\3\2"+
		"\2\2\u0132\u07f7\3\2\2\2\u0134\u07f9\3\2\2\2\u0136\u0817\3\2\2\2\u0138"+
		"\u0819\3\2\2\2\u013a\u0823\3\2\2\2\u013c\u0825\3\2\2\2\u013e\u0829\3\2"+
		"\2\2\u0140\u082c\3\2\2\2\u0142\u0851\3\2\2\2\u0144\u0858\3\2\2\2\u0146"+
		"\u085a\3\2\2\2\u0148\u085c\3\2\2\2\u014a\u085e\3\2\2\2\u014c\u0861\3\2"+
		"\2\2\u014e\u0865\3\2\2\2\u0150\u0869\3\2\2\2\u0152\u0877\3\2\2\2\u0154"+
		"\u0883\3\2\2\2\u0156\u0887\3\2\2\2\u0158\u0889\3\2\2\2\u015a\u0891\3\2"+
		"\2\2\u015c\u0893\3\2\2\2\u015e\u0899\3\2\2\2\u0160\u08a6\3\2\2\2\u0162"+
		"\u08d8\3\2\2\2\u0164\u08da\3\2\2\2\u0166\u08f0\3\2\2\2\u0168\u08f2\3\2"+
		"\2\2\u016a\u08f4\3\2\2\2\u016c\u0907\3\2\2\2\u016e\u0914\3\2\2\2\u0170"+
		"\u0917\3\2\2\2\u0172\u091c\3\2\2\2\u0174\u0921\3\2\2\2\u0176\u0925\3\2"+
		"\2\2\u0178\u092c\3\2\2\2\u017a\u0930\3\2\2\2\u017c\u0944\3\2\2\2\u017e"+
		"\u0946\3\2\2\2\u0180\u094c\3\2\2\2\u0182\u094e\3\2\2\2\u0184\u0955\3\2"+
		"\2\2\u0186\u096b\3\2\2\2\u0188\u09a0\3\2\2\2\u018a\u09ab\3\2\2\2\u018c"+
		"\u09ad\3\2\2\2\u018e\u09af\3\2\2\2\u0190\u09b1\3\2\2\2\u0192\u0194\5|"+
		"?\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\u0196\7\2\2\3\u0196\3\3\2\2\2\u0197\u01a0\5\u018a\u00c6\2\u0198\u01a0"+
		"\7H\2\2\u0199\u019a\7\\\2\2\u019a\u019b\5^\60\2\u019b\u019c\7]\2\2\u019c"+
		"\u01a0\3\2\2\2\u019d\u01a0\5\6\4\2\u019e\u01a0\5\16\b\2\u019f\u0197\3"+
		"\2\2\2\u019f\u0198\3\2\2\2\u019f\u0199\3\2\2\2\u019f\u019d\3\2\2\2\u019f"+
		"\u019e\3\2\2\2\u01a0\5\3\2\2\2\u01a1\u01a4\5\b\5\2\u01a2\u01a4\5\n\6\2"+
		"\u01a3\u01a1\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4\7\3\2\2\2\u01a5\u01af\7"+
		"\u008d\2\2\u01a6\u01af\5\u0158\u00ad\2\u01a7\u01af\5\u014a\u00a6\2\u01a8"+
		"\u01af\5\u015a\u00ae\2\u01a9\u01aa\7j\2\2\u01aa\u01af\5\u0124\u0093\2"+
		"\u01ab\u01ac\7j\2\2\u01ac\u01af\5\u00a2R\2\u01ad\u01af\5\u0166\u00b4\2"+
		"\u01ae\u01a5\3\2\2\2\u01ae\u01a6\3\2\2\2\u01ae\u01a7\3\2\2\2\u01ae\u01a8"+
		"\3\2\2\2\u01ae\u01a9\3\2\2\2\u01ae\u01ab\3\2\2\2\u01ae\u01ad\3\2\2\2\u01af"+
		"\t\3\2\2\2\u01b0\u01b2\5\f\7\2\u01b1\u01b3\7G\2\2\u01b2\u01b1\3\2\2\2"+
		"\u01b2\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\5\b\5\2\u01b5\13"+
		"\3\2\2\2\u01b6\u01b7\b\7\1\2\u01b7\u01c2\7\u0088\2\2\u01b8\u01b9\5\u00a0"+
		"Q\2\u01b9\u01ba\7\u0088\2\2\u01ba\u01c2\3\2\2\2\u01bb\u01bc\5\u00b8]\2"+
		"\u01bc\u01bd\7\u0088\2\2\u01bd\u01c2\3\2\2\2\u01be\u01bf\5\u00a2R\2\u01bf"+
		"\u01c0\7\u0088\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01b6\3\2\2\2\u01c1\u01b8"+
		"\3\2\2\2\u01c1\u01bb\3\2\2\2\u01c1\u01be\3\2\2\2\u01c2\u01cf\3\2\2\2\u01c3"+
		"\u01c4\f\4\2\2\u01c4\u01c5\7\u008d\2\2\u01c5\u01ce\7\u0088\2\2\u01c6\u01c8"+
		"\f\3\2\2\u01c7\u01c9\7G\2\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\u01ca\3\2\2\2\u01ca\u01cb\5\u0164\u00b3\2\u01cb\u01cc\7\u0088\2\2\u01cc"+
		"\u01ce\3\2\2\2\u01cd\u01c3\3\2\2\2\u01cd\u01c6\3\2\2\2\u01ce\u01d1\3\2"+
		"\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\r\3\2\2\2\u01d1\u01cf"+
		"\3\2\2\2\u01d2\u01d4\5\20\t\2\u01d3\u01d5\5\36\20\2\u01d4\u01d3\3\2\2"+
		"\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\5h\65\2\u01d7\17"+
		"\3\2\2\2\u01d8\u01da\7^\2\2\u01d9\u01db\5\22\n\2\u01da\u01d9\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\7_\2\2\u01dd\21\3\2\2\2"+
		"\u01de\u01e5\5\24\13\2\u01df\u01e5\5\26\f\2\u01e0\u01e1\5\24\13\2\u01e1"+
		"\u01e2\7\u0083\2\2\u01e2\u01e3\5\26\f\2\u01e3\u01e5\3\2\2\2\u01e4\u01de"+
		"\3\2\2\2\u01e4\u01df\3\2\2\2\u01e4\u01e0\3\2\2\2\u01e5\23\3\2\2\2\u01e6"+
		"\u01e7\t\2\2\2\u01e7\25\3\2\2\2\u01e8\u01e9\b\f\1\2\u01e9\u01eb\5\30\r"+
		"\2\u01ea\u01ec\7\u008c\2\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"\u01f5\3\2\2\2\u01ed\u01ee\f\3\2\2\u01ee\u01ef\7\u0083\2\2\u01ef\u01f1"+
		"\5\30\r\2\u01f0\u01f2\7\u008c\2\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2"+
		"\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01ed\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5"+
		"\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\27\3\2\2\2\u01f7\u01f5\3\2\2"+
		"\2\u01f8\u01fb\5\32\16\2\u01f9\u01fb\5\34\17\2\u01fa\u01f8\3\2\2\2\u01fa"+
		"\u01f9\3\2\2\2\u01fb\31\3\2\2\2\u01fc\u0201\7\u008d\2\2\u01fd\u01fe\7"+
		"h\2\2\u01fe\u0201\7\u008d\2\2\u01ff\u0201\7H\2\2\u0200\u01fc\3\2\2\2\u0200"+
		"\u01fd\3\2\2\2\u0200\u01ff\3\2\2\2\u0201\33\3\2\2\2\u0202\u0203\7\u008d"+
		"\2\2\u0203\u0208\5\u011a\u008e\2\u0204\u0205\7h\2\2\u0205\u0206\7\u008d"+
		"\2\2\u0206\u0208\5\u011a\u008e\2\u0207\u0202\3\2\2\2\u0207\u0204\3\2\2"+
		"\2\u0208\35\3\2\2\2\u0209\u020a\7\\\2\2\u020a\u020b\5\u0110\u0089\2\u020b"+
		"\u020d\7]\2\2\u020c\u020e\7\62\2\2\u020d\u020c\3\2\2\2\u020d\u020e\3\2"+
		"\2\2\u020e\u0210\3\2\2\2\u020f\u0211\5\u0180\u00c1\2\u0210\u020f\3\2\2"+
		"\2\u0210\u0211\3\2\2\2\u0211\u0213\3\2\2\2\u0212\u0214\5\u00d6l\2\u0213"+
		"\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0216\3\2\2\2\u0215\u0217\5\u00f8"+
		"}\2\u0216\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217\37\3\2\2\2\u0218\u0219"+
		"\b\21\1\2\u0219\u0259\5\4\3\2\u021a\u021b\5\u009eP\2\u021b\u021d\7\\\2"+
		"\2\u021c\u021e\5&\24\2\u021d\u021c\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021f"+
		"\3\2\2\2\u021f\u0220\7]\2\2\u0220\u0259\3\2\2\2\u0221\u0222\5\u016e\u00b8"+
		"\2\u0222\u0224\7\\\2\2\u0223\u0225\5&\24\2\u0224\u0223\3\2\2\2\u0224\u0225"+
		"\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\7]\2\2\u0227\u0259\3\2\2\2\u0228"+
		"\u0229\5\u009eP\2\u0229\u022a\5\u0122\u0092\2\u022a\u0259\3\2\2\2\u022b"+
		"\u022c\5\u016e\u00b8\2\u022c\u022d\5\u0122\u0092\2\u022d\u0259\3\2\2\2"+
		"\u022e\u022f\7\"\2\2\u022f\u0230\7m\2\2\u0230\u0231\5\u0104\u0083\2\u0231"+
		"\u0232\7n\2\2\u0232\u0233\7\\\2\2\u0233\u0234\5^\60\2\u0234\u0235\7]\2"+
		"\2\u0235\u0259\3\2\2\2\u0236\u0237\7D\2\2\u0237\u0238\7m\2\2\u0238\u0239"+
		"\5\u0104\u0083\2\u0239\u023a\7n\2\2\u023a\u023b\7\\\2\2\u023b\u023c\5"+
		"^\60\2\u023c\u023d\7]\2\2\u023d\u0259\3\2\2\2\u023e\u023f\7=\2\2\u023f"+
		"\u0240\7m\2\2\u0240\u0241\5\u0104\u0083\2\u0241\u0242\7n\2\2\u0242\u0243"+
		"\7\\\2\2\u0243\u0244\5^\60\2\u0244\u0245\7]\2\2\u0245\u0259\3\2\2\2\u0246"+
		"\u0247\7\32\2\2\u0247\u0248\7m\2\2\u0248\u0249\5\u0104\u0083\2\u0249\u024a"+
		"\7n\2\2\u024a\u024b\7\\\2\2\u024b\u024c\5^\60\2\u024c\u024d\7]\2\2\u024d"+
		"\u0259\3\2\2\2\u024e\u024f\5$\23\2\u024f\u0250\7\\\2\2\u0250\u0251\5^"+
		"\60\2\u0251\u0252\7]\2\2\u0252\u0259\3\2\2\2\u0253\u0254\5$\23\2\u0254"+
		"\u0255\7\\\2\2\u0255\u0256\5\u0104\u0083\2\u0256\u0257\7]\2\2\u0257\u0259"+
		"\3\2\2\2\u0258\u0218\3\2\2\2\u0258\u021a\3\2\2\2\u0258\u0221\3\2\2\2\u0258"+
		"\u0228\3\2\2\2\u0258\u022b\3\2\2\2\u0258\u022e\3\2\2\2\u0258\u0236\3\2"+
		"\2\2\u0258\u023e\3\2\2\2\u0258\u0246\3\2\2\2\u0258\u024e\3\2\2\2\u0258"+
		"\u0253\3\2\2\2\u0259\u0282\3\2\2\2\u025a\u025b\f\25\2\2\u025b\u025c\7"+
		"^\2\2\u025c\u025d\5^\60\2\u025d\u025e\7_\2\2\u025e\u0281\3\2\2\2\u025f"+
		"\u0260\f\24\2\2\u0260\u0261\7^\2\2\u0261\u0262\5\u0122\u0092\2\u0262\u0263"+
		"\7_\2\2\u0263\u0281\3\2\2\2\u0264\u0265\f\23\2\2\u0265\u0267\7\\\2\2\u0266"+
		"\u0268\5&\24\2\u0267\u0266\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269\3\2"+
		"\2\2\u0269\u0281\7]\2\2\u026a\u026b\f\16\2\2\u026b\u026d\7\u008a\2\2\u026c"+
		"\u026e\7G\2\2\u026d\u026c\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026f\3\2"+
		"\2\2\u026f\u0281\5\6\4\2\u0270\u0271\f\r\2\2\u0271\u0273\7\u0085\2\2\u0272"+
		"\u0274\7G\2\2\u0273\u0272\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\3\2"+
		"\2\2\u0275\u0281\5\6\4\2\u0276\u0277\f\f\2\2\u0277\u0278\7\u008a\2\2\u0278"+
		"\u0281\5(\25\2\u0279\u027a\f\13\2\2\u027a\u027b\7\u0085\2\2\u027b\u0281"+
		"\5(\25\2\u027c\u027d\f\n\2\2\u027d\u0281\7\u0081\2\2\u027e\u027f\f\t\2"+
		"\2\u027f\u0281\7\u0082\2\2\u0280\u025a\3\2\2\2\u0280\u025f\3\2\2\2\u0280"+
		"\u0264\3\2\2\2\u0280\u026a\3\2\2\2\u0280\u0270\3\2\2\2\u0280\u0276\3\2"+
		"\2\2\u0280\u0279\3\2\2\2\u0280\u027c\3\2\2\2\u0280\u027e\3\2\2\2\u0281"+
		"\u0284\3\2\2\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283!\3\2\2\2"+
		"\u0284\u0282\3\2\2\2\u0285\u0286\7N\2\2\u0286#\3\2\2\2\u0287\u0288\7N"+
		"\2\2\u0288%\3\2\2\2\u0289\u028a\5\u0120\u0091\2\u028a\'\3\2\2\2\u028b"+
		"\u028d\5\f\7\2\u028c\u028b\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\3\2"+
		"\2\2\u028e\u028f\5\u00a0Q\2\u028f\u0290\7\u0088\2\2\u0290\u0291\7j\2\2"+
		"\u0291\u0292\5\u00a0Q\2\u0292\u02a2\3\2\2\2\u0293\u0294\5\f\7\2\u0294"+
		"\u0295\7G\2\2\u0295\u0296\5\u0164\u00b3\2\u0296\u0297\7\u0088\2\2\u0297"+
		"\u0298\7j\2\2\u0298\u0299\5\u00a0Q\2\u0299\u02a2\3\2\2\2\u029a\u029c\5"+
		"\f\7\2\u029b\u029a\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d\3\2\2\2\u029d"+
		"\u029e\7j\2\2\u029e\u02a2\5\u00a0Q\2\u029f\u02a0\7j\2\2\u02a0\u02a2\5"+
		"\u00a2R\2\u02a1\u028c\3\2\2\2\u02a1\u0293\3\2\2\2\u02a1\u029b\3\2\2\2"+
		"\u02a1\u029f\3\2\2\2\u02a2)\3\2\2\2\u02a3\u02c0\5 \21\2\u02a4\u02a5\7"+
		"\u0081\2\2\u02a5\u02c0\5> \2\u02a6\u02a7\7\u0082\2\2\u02a7\u02c0\5> \2"+
		"\u02a8\u02a9\5,\27\2\u02a9\u02aa\5> \2\u02aa\u02c0\3\2\2\2\u02ab\u02ac"+
		"\7A\2\2\u02ac\u02c0\5*\26\2\u02ad\u02ae\7A\2\2\u02ae\u02af\7\\\2\2\u02af"+
		"\u02b0\5\u0104\u0083\2\u02b0\u02b1\7]\2\2\u02b1\u02c0\3\2\2\2\u02b2\u02b3"+
		"\7A\2\2\u02b3\u02b4\7\u008c\2\2\u02b4\u02b5\7\\\2\2\u02b5\u02b6\7\u008d"+
		"\2\2\u02b6\u02c0\7]\2\2\u02b7\u02b8\7\f\2\2\u02b8\u02b9\7\\\2\2\u02b9"+
		"\u02ba\5\u0104\u0083\2\u02ba\u02bb\7]\2\2\u02bb\u02c0\3\2\2\2\u02bc\u02c0"+
		"\5<\37\2\u02bd\u02c0\5.\30\2\u02be\u02c0\5:\36\2\u02bf\u02a3\3\2\2\2\u02bf"+
		"\u02a4\3\2\2\2\u02bf\u02a6\3\2\2\2\u02bf\u02a8\3\2\2\2\u02bf\u02ab\3\2"+
		"\2\2\u02bf\u02ad\3\2\2\2\u02bf\u02b2\3\2\2\2\u02bf\u02b7\3\2\2\2\u02bf"+
		"\u02bc\3\2\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02be\3\2\2\2\u02c0+\3\2\2\2"+
		"\u02c1\u02c2\t\3\2\2\u02c2-\3\2\2\2\u02c3\u02c5\7\u0088\2\2\u02c4\u02c3"+
		"\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c8\7\64\2\2"+
		"\u02c7\u02c9\5\60\31\2\u02c8\u02c7\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca"+
		"\3\2\2\2\u02ca\u02cc\5\62\32\2\u02cb\u02cd\58\35\2\u02cc\u02cb\3\2\2\2"+
		"\u02cc\u02cd\3\2\2\2\u02cd\u02dc\3\2\2\2\u02ce\u02d0\7\u0088\2\2\u02cf"+
		"\u02ce\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d3\7\64"+
		"\2\2\u02d2\u02d4\5\60\31\2\u02d3\u02d2\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4"+
		"\u02d5\3\2\2\2\u02d5\u02d6\7\\\2\2\u02d6\u02d7\5\u0104\u0083\2\u02d7\u02d9"+
		"\7]\2\2\u02d8\u02da\58\35\2\u02d9\u02d8\3\2\2\2\u02d9\u02da\3\2\2\2\u02da"+
		"\u02dc\3\2\2\2\u02db\u02c4\3\2\2\2\u02db\u02cf\3\2\2\2\u02dc/\3\2\2\2"+
		"\u02dd\u02de\7\\\2\2\u02de\u02df\5&\24\2\u02df\u02e0\7]\2\2\u02e0\61\3"+
		"\2\2\2\u02e1\u02e3\5\u009aN\2\u02e2\u02e4\5\64\33\2\u02e3\u02e2\3\2\2"+
		"\2\u02e3\u02e4\3\2\2\2\u02e4\63\3\2\2\2\u02e5\u02e7\5\u00fa~\2\u02e6\u02e8"+
		"\5\64\33\2\u02e7\u02e6\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02eb\3\2\2\2"+
		"\u02e9\u02eb\5\66\34\2\u02ea\u02e5\3\2\2\2\u02ea\u02e9\3\2\2\2\u02eb\65"+
		"\3\2\2\2\u02ec\u02ed\b\34\1\2\u02ed\u02ee\7^\2\2\u02ee\u02ef\5^\60\2\u02ef"+
		"\u02f1\7_\2\2\u02f0\u02f2\5\u00d6l\2\u02f1\u02f0\3\2\2\2\u02f1\u02f2\3"+
		"\2\2\2\u02f2\u02fc\3\2\2\2\u02f3\u02f4\f\3\2\2\u02f4\u02f5\7^\2\2\u02f5"+
		"\u02f6\5`\61\2\u02f6\u02f8\7_\2\2\u02f7\u02f9\5\u00d6l\2\u02f8\u02f7\3"+
		"\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fb\3\2\2\2\u02fa\u02f3\3\2\2\2\u02fb"+
		"\u02fe\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\67\3\2\2"+
		"\2\u02fe\u02fc\3\2\2\2\u02ff\u0301\7\\\2\2\u0300\u0302\5&\24\2\u0301\u0300"+
		"\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0306\7]\2\2\u0304"+
		"\u0306\5\u0122\u0092\2\u0305\u02ff\3\2\2\2\u0305\u0304\3\2\2\2\u03069"+
		"\3\2\2\2\u0307\u0309\7\u0088\2\2\u0308\u0307\3\2\2\2\u0308\u0309\3\2\2"+
		"\2\u0309\u030a\3\2\2\2\u030a\u030b\7\37\2\2\u030b\u0314\5> \2\u030c\u030e"+
		"\7\u0088\2\2\u030d\u030c\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u030f\3\2\2"+
		"\2\u030f\u0310\7\37\2\2\u0310\u0311\7^\2\2\u0311\u0312\7_\2\2\u0312\u0314"+
		"\5> \2\u0313\u0308\3\2\2\2\u0313\u030d\3\2\2\2\u0314;\3\2\2\2\u0315\u0316"+
		"\7\65\2\2\u0316\u0317\7\\\2\2\u0317\u0318\5^\60\2\u0318\u0319\7]\2\2\u0319"+
		"=\3\2\2\2\u031a\u0321\5*\26\2\u031b\u031c\7\\\2\2\u031c\u031d\5\u0104"+
		"\u0083\2\u031d\u031e\7]\2\2\u031e\u031f\5> \2\u031f\u0321\3\2\2\2\u0320"+
		"\u031a\3\2\2\2\u0320\u031b\3\2\2\2\u0321?\3\2\2\2\u0322\u0323\b!\1\2\u0323"+
		"\u0324\5> \2\u0324\u032d\3\2\2\2\u0325\u0326\f\4\2\2\u0326\u0327\7\u008b"+
		"\2\2\u0327\u032c\5> \2\u0328\u0329\f\3\2\2\u0329\u032a\7\u0084\2\2\u032a"+
		"\u032c\5> \2\u032b\u0325\3\2\2\2\u032b\u0328\3\2\2\2\u032c\u032f\3\2\2"+
		"\2\u032d\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032eA\3\2\2\2\u032f\u032d"+
		"\3\2\2\2\u0330\u0331\b\"\1\2\u0331\u0332\5@!\2\u0332\u033e\3\2\2\2\u0333"+
		"\u0334\f\5\2\2\u0334\u0335\7d\2\2\u0335\u033d\5@!\2\u0336\u0337\f\4\2"+
		"\2\u0337\u0338\7e\2\2\u0338\u033d\5@!\2\u0339\u033a\f\3\2\2\u033a\u033b"+
		"\7f\2\2\u033b\u033d\5@!\2\u033c\u0333\3\2\2\2\u033c\u0336\3\2\2\2\u033c"+
		"\u0339\3\2\2\2\u033d\u0340\3\2\2\2\u033e\u033c\3\2\2\2\u033e\u033f\3\2"+
		"\2\2\u033fC\3\2\2\2\u0340\u033e\3\2\2\2\u0341\u0342\b#\1\2\u0342\u0343"+
		"\5B\"\2\u0343\u034c\3\2\2\2\u0344\u0345\f\4\2\2\u0345\u0346\7b\2\2\u0346"+
		"\u034b\5B\"\2\u0347\u0348\f\3\2\2\u0348\u0349\7c\2\2\u0349\u034b\5B\""+
		"\2\u034a\u0344\3\2\2\2\u034a\u0347\3\2\2\2\u034b\u034e\3\2\2\2\u034c\u034a"+
		"\3\2\2\2\u034c\u034d\3\2\2\2\u034dE\3\2\2\2\u034e\u034c\3\2\2\2\u034f"+
		"\u0350\b$\1\2\u0350\u0351\5D#\2\u0351\u0358\3\2\2\2\u0352\u0353\f\3\2"+
		"\2\u0353\u0354\5H%\2\u0354\u0355\5D#\2\u0355\u0357\3\2\2\2\u0356\u0352"+
		"\3\2\2\2\u0357\u035a\3\2\2\2\u0358\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359"+
		"G\3\2\2\2\u035a\u0358\3\2\2\2\u035b\u035c\t\4\2\2\u035cI\3\2\2\2\u035d"+
		"\u035e\b&\1\2\u035e\u035f\5F$\2\u035f\u036e\3\2\2\2\u0360\u0361\f\6\2"+
		"\2\u0361\u0362\7m\2\2\u0362\u036d\5F$\2\u0363\u0364\f\5\2\2\u0364\u0365"+
		"\7n\2\2\u0365\u036d\5F$\2\u0366\u0367\f\4\2\2\u0367\u0368\7}\2\2\u0368"+
		"\u036d\5F$\2\u0369\u036a\f\3\2\2\u036a\u036b\7~\2\2\u036b\u036d\5F$\2"+
		"\u036c\u0360\3\2\2\2\u036c\u0363\3\2\2\2\u036c\u0366\3\2\2\2\u036c\u0369"+
		"\3\2\2\2\u036d\u0370\3\2\2\2\u036e\u036c\3\2\2\2\u036e\u036f\3\2\2\2\u036f"+
		"K\3\2\2\2\u0370\u036e\3\2\2\2\u0371\u0372\b\'\1\2\u0372\u0373\5J&\2\u0373"+
		"\u037c\3\2\2\2\u0374\u0375\f\4\2\2\u0375\u0376\7{\2\2\u0376\u037b\5J&"+
		"\2\u0377\u0378\f\3\2\2\u0378\u0379\7|\2\2\u0379\u037b\5J&\2\u037a\u0374"+
		"\3\2\2\2\u037a\u0377\3\2\2\2\u037b\u037e\3\2\2\2\u037c\u037a\3\2\2\2\u037c"+
		"\u037d\3\2\2\2\u037dM\3\2\2\2\u037e\u037c\3\2\2\2\u037f\u0380\b(\1\2\u0380"+
		"\u0381\5L\'\2\u0381\u0387\3\2\2\2\u0382\u0383\f\3\2\2\u0383\u0384\7h\2"+
		"\2\u0384\u0386\5L\'\2\u0385\u0382\3\2\2\2\u0386\u0389\3\2\2\2\u0387\u0385"+
		"\3\2\2\2\u0387\u0388\3\2\2\2\u0388O\3\2\2\2\u0389\u0387\3\2\2\2\u038a"+
		"\u038b\b)\1\2\u038b\u038c\5N(\2\u038c\u0392\3\2\2\2\u038d\u038e\f\3\2"+
		"\2\u038e\u038f\7g\2\2\u038f\u0391\5N(\2\u0390\u038d\3\2\2\2\u0391\u0394"+
		"\3\2\2\2\u0392\u0390\3\2\2\2\u0392\u0393\3\2\2\2\u0393Q\3\2\2\2\u0394"+
		"\u0392\3\2\2\2\u0395\u0396\b*\1\2\u0396\u0397\5P)\2\u0397\u039d\3\2\2"+
		"\2\u0398\u0399\f\3\2\2\u0399\u039a\7i\2\2\u039a\u039c\5P)\2\u039b\u0398"+
		"\3\2\2\2\u039c\u039f\3\2\2\2\u039d\u039b\3\2\2\2\u039d\u039e\3\2\2\2\u039e"+
		"S\3\2\2\2\u039f\u039d\3\2\2\2\u03a0\u03a1\b+\1\2\u03a1\u03a2\5R*\2\u03a2"+
		"\u03ab\3\2\2\2\u03a3\u03a4\f\4\2\2\u03a4\u03a5\7\5\2\2\u03a5\u03aa\5R"+
		"*\2\u03a6\u03a7\f\3\2\2\u03a7\u03a8\7\6\2\2\u03a8\u03aa\5R*\2\u03a9\u03a3"+
		"\3\2\2\2\u03a9\u03a6\3\2\2\2\u03aa\u03ad\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ab"+
		"\u03ac\3\2\2\2\u03acU\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ae\u03af\b,\1\2\u03af"+
		"\u03b0\5T+\2\u03b0\u03b9\3\2\2\2\u03b1\u03b2\f\4\2\2\u03b2\u03b3\7\7\2"+
		"\2\u03b3\u03b8\5T+\2\u03b4\u03b5\f\3\2\2\u03b5\u03b6\7\b\2\2\u03b6\u03b8"+
		"\5T+\2\u03b7\u03b1\3\2\2\2\u03b7\u03b4\3\2\2\2\u03b8\u03bb\3\2\2\2\u03b9"+
		"\u03b7\3\2\2\2\u03b9\u03ba\3\2\2\2\u03baW\3\2\2\2\u03bb\u03b9\3\2\2\2"+
		"\u03bc\u03c4\5V,\2\u03bd\u03be\5V,\2\u03be\u03bf\7\u0086\2\2\u03bf\u03c0"+
		"\5^\60\2\u03c0\u03c1\7\u0087\2\2\u03c1\u03c2\5Z.\2\u03c2\u03c4\3\2\2\2"+
		"\u03c3\u03bc\3\2\2\2\u03c3\u03bd\3\2\2\2\u03c4Y\3\2\2\2\u03c5\u03cc\5"+
		"X-\2\u03c6\u03c7\5V,\2\u03c7\u03c8\5\\/\2\u03c8\u03c9\5\u011e\u0090\2"+
		"\u03c9\u03cc\3\2\2\2\u03ca\u03cc\5\u017e\u00c0\2\u03cb\u03c5\3\2\2\2\u03cb"+
		"\u03c6\3\2\2\2\u03cb\u03ca\3\2\2\2\u03cc[\3\2\2\2\u03cd\u03ce\t\5\2\2"+
		"\u03ce]\3\2\2\2\u03cf\u03d0\b\60\1\2\u03d0\u03d1\5Z.\2\u03d1\u03d7\3\2"+
		"\2\2\u03d2\u03d3\f\3\2\2\u03d3\u03d4\7\u0083\2\2\u03d4\u03d6\5Z.\2\u03d5"+
		"\u03d2\3\2\2\2\u03d6\u03d9\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8\3\2"+
		"\2\2\u03d8_\3\2\2\2\u03d9\u03d7\3\2\2\2\u03da\u03db\5X-\2\u03dba\3\2\2"+
		"\2\u03dc\u03f7\5d\63\2\u03dd\u03df\5\u00d6l\2\u03de\u03dd\3\2\2\2\u03de"+
		"\u03df\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03f7\5f\64\2\u03e1\u03e3\5\u00d6"+
		"l\2\u03e2\u03e1\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4"+
		"\u03f7\5h\65\2\u03e5\u03e7\5\u00d6l\2\u03e6\u03e5\3\2\2\2\u03e6\u03e7"+
		"\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03f7\5l\67\2\u03e9\u03eb\5\u00d6l"+
		"\2\u03ea\u03e9\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03f7"+
		"\5p9\2\u03ed\u03ef\5\u00d6l\2\u03ee\u03ed\3\2\2\2\u03ee\u03ef\3\2\2\2"+
		"\u03ef\u03f0\3\2\2\2\u03f0\u03f7\5x=\2\u03f1\u03f7\5z>\2\u03f2\u03f4\5"+
		"\u00d6l\2\u03f3\u03f2\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f5\3\2\2\2"+
		"\u03f5\u03f7\5\u0174\u00bb\2\u03f6\u03dc\3\2\2\2\u03f6\u03de\3\2\2\2\u03f6"+
		"\u03e2\3\2\2\2\u03f6\u03e6\3\2\2\2\u03f6\u03ea\3\2\2\2\u03f6\u03ee\3\2"+
		"\2\2\u03f6\u03f1\3\2\2\2\u03f6\u03f3\3\2\2\2\u03f7c\3\2\2\2\u03f8\u03fa"+
		"\5\u00d6l\2\u03f9\u03f8\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fb\3\2\2"+
		"\2\u03fb\u03fc\7\u008d\2\2\u03fc\u03fd\7\u0087\2\2\u03fd\u040d\5b\62\2"+
		"\u03fe\u0400\5\u00d6l\2\u03ff\u03fe\3\2\2\2\u03ff\u0400\3\2\2\2\u0400"+
		"\u0401\3\2\2\2\u0401\u0402\7\21\2\2\u0402\u0403\5`\61\2\u0403\u0404\7"+
		"\u0087\2\2\u0404\u0405\5b\62\2\u0405\u040d\3\2\2\2\u0406\u0408\5\u00d6"+
		"l\2\u0407\u0406\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409\3\2\2\2\u0409"+
		"\u040a\7\36\2\2\u040a\u040b\7\u0087\2\2\u040b\u040d\5b\62\2\u040c\u03f9"+
		"\3\2\2\2\u040c\u03ff\3\2\2\2\u040c\u0407\3\2\2\2\u040de\3\2\2\2\u040e"+
		"\u0410\5^\60\2\u040f\u040e\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0411\3\2"+
		"\2\2\u0411\u0412\7\u0089\2\2\u0412g\3\2\2\2\u0413\u0415\7`\2\2\u0414\u0416"+
		"\5j\66\2\u0415\u0414\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0417\3\2\2\2\u0417"+
		"\u0418\7a\2\2\u0418i\3\2\2\2\u0419\u041a\b\66\1\2\u041a\u041b\5b\62\2"+
		"\u041b\u0420\3\2\2\2\u041c\u041d\f\3\2\2\u041d\u041f\5b\62\2\u041e\u041c"+
		"\3\2\2\2\u041f\u0422\3\2\2\2\u0420\u041e\3\2\2\2\u0420\u0421\3\2\2\2\u0421"+
		"k\3\2\2\2\u0422\u0420\3\2\2\2\u0423\u0424\7.\2\2\u0424\u0425\7\\\2\2\u0425"+
		"\u0426\5n8\2\u0426\u0427\7]\2\2\u0427\u0428\5b\62\2\u0428\u0438\3\2\2"+
		"\2\u0429\u042a\7.\2\2\u042a\u042b\7\\\2\2\u042b\u042c\5n8\2\u042c\u042d"+
		"\7]\2\2\u042d\u042e\5b\62\2\u042e\u042f\7#\2\2\u042f\u0430\5b\62\2\u0430"+
		"\u0438\3\2\2\2\u0431\u0432\7F\2\2\u0432\u0433\7\\\2\2\u0433\u0434\5n8"+
		"\2\u0434\u0435\7]\2\2\u0435\u0436\5b\62\2\u0436\u0438\3\2\2\2\u0437\u0423"+
		"\3\2\2\2\u0437\u0429\3\2\2\2\u0437\u0431\3\2\2\2\u0438m\3\2\2\2\u0439"+
		"\u044a\5^\60\2\u043a\u043c\5\u00d6l\2\u043b\u043a\3\2\2\2\u043b\u043c"+
		"\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u043e\5\u008eH\2\u043e\u043f\5\u00f0"+
		"y\2\u043f\u0440\7l\2\2\u0440\u0441\5\u011e\u0090\2\u0441\u044a\3\2\2\2"+
		"\u0442\u0444\5\u00d6l\2\u0443\u0442\3\2\2\2\u0443\u0444\3\2\2\2\u0444"+
		"\u0445\3\2\2\2\u0445\u0446\5\u008eH\2\u0446\u0447\5\u00f0y\2\u0447\u0448"+
		"\5\u0122\u0092\2\u0448\u044a\3\2\2\2\u0449\u0439\3\2\2\2\u0449\u043b\3"+
		"\2\2\2\u0449\u0443\3\2\2\2\u044ao\3\2\2\2\u044b\u044c\7[\2\2\u044c\u044d"+
		"\7\\\2\2\u044d\u044e\5n8\2\u044e\u044f\7]\2\2\u044f\u0450\5b\62\2\u0450"+
		"\u046f\3\2\2\2\u0451\u0452\7 \2\2\u0452\u0453\5b\62\2\u0453\u0454\7[\2"+
		"\2\u0454\u0455\7\\\2\2\u0455\u0456\5^\60\2\u0456\u0457\7]\2\2\u0457\u0458"+
		"\7\u0089\2\2\u0458\u046f\3\2\2\2\u0459\u045a\7+\2\2\u045a\u045b\7\\\2"+
		"\2\u045b\u045d\5r:\2\u045c\u045e\5n8\2\u045d\u045c\3\2\2\2\u045d\u045e"+
		"\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0461\7\u0089\2\2\u0460\u0462\5^\60"+
		"\2\u0461\u0460\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0464"+
		"\7]\2\2\u0464\u0465\5b\62\2\u0465\u046f\3\2\2\2\u0466\u0467\7+\2\2\u0467"+
		"\u0468\7\\\2\2\u0468\u0469\5t;\2\u0469\u046a\7\u0087\2\2\u046a\u046b\5"+
		"v<\2\u046b\u046c\7]\2\2\u046c\u046d\5b\62\2\u046d\u046f\3\2\2\2\u046e"+
		"\u044b\3\2\2\2\u046e\u0451\3\2\2\2\u046e\u0459\3\2\2\2\u046e\u0466\3\2"+
		"\2\2\u046fq\3\2\2\2\u0470\u0473\5f\64\2\u0471\u0473\5\u0084C\2\u0472\u0470"+
		"\3\2\2\2\u0472\u0471\3\2\2\2\u0473s\3\2\2\2\u0474\u0476\5\u00d6l\2\u0475"+
		"\u0474\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0478\5\u008e"+
		"H\2\u0478\u0479\5\u00f0y\2\u0479u\3\2\2\2\u047a\u047d\5^\60\2\u047b\u047d"+
		"\5\u0122\u0092\2\u047c\u047a\3\2\2\2\u047c\u047b\3\2\2\2\u047dw\3\2\2"+
		"\2\u047e\u047f\7\20\2\2\u047f\u0495\7\u0089\2\2\u0480\u0481\7\33\2\2\u0481"+
		"\u0495\7\u0089\2\2\u0482\u0484\7>\2\2\u0483\u0485\5^\60\2\u0484\u0483"+
		"\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0495\7\u0089\2"+
		"\2\u0487\u0488\7>\2\2\u0488\u0489\5\u0122\u0092\2\u0489\u048a\7\u0089"+
		"\2\2\u048a\u0495\3\2\2\2\u048b\u048c\7>\2\2\u048c\u048d\7\\\2\2\u048d"+
		"\u048e\5^\60\2\u048e\u048f\7]\2\2\u048f\u0490\7\u0089\2\2\u0490\u0495"+
		"\3\2\2\2\u0491\u0492\7-\2\2\u0492\u0493\7\u008d\2\2\u0493\u0495\7\u0089"+
		"\2\2\u0494\u047e\3\2\2\2\u0494\u0480\3\2\2\2\u0494\u0482\3\2\2\2\u0494"+
		"\u0487\3\2\2\2\u0494\u048b\3\2\2\2\u0494\u0491\3\2\2\2\u0495y\3\2\2\2"+
		"\u0496\u0497\5\u0080A\2\u0497{\3\2\2\2\u0498\u0499\b?\1\2\u0499\u049a"+
		"\5~@\2\u049a\u049f\3\2\2\2\u049b\u049c\f\3\2\2\u049c\u049e\5~@\2\u049d"+
		"\u049b\3\2\2\2\u049e\u04a1\3\2\2\2\u049f\u049d\3\2\2\2\u049f\u04a0\3\2"+
		"\2\2\u04a0}\3\2\2\2\u04a1\u049f\3\2\2\2\u04a2\u04ac\5\u0080A\2\u04a3\u04ac"+
		"\5\u0116\u008c\2\u04a4\u04ac\5\u015c\u00af\2\u04a5\u04ac\5\u0170\u00b9"+
		"\2\u04a6\u04ac\5\u0172\u00ba\2\u04a7\u04ac\5\u00d4k\2\u04a8\u04ac\5\u00bc"+
		"_\2\u04a9\u04ac\5\u0088E\2\u04aa\u04ac\5\u008aF\2\u04ab\u04a2\3\2\2\2"+
		"\u04ab\u04a3\3\2\2\2\u04ab\u04a4\3\2\2\2\u04ab\u04a5\3\2\2\2\u04ab\u04a6"+
		"\3\2\2\2\u04ab\u04a7\3\2\2\2\u04ab\u04a8\3\2\2\2\u04ab\u04a9\3\2\2\2\u04ab"+
		"\u04aa\3\2\2\2\u04ac\177\3\2\2\2\u04ad\u04b6\5\u0084C\2\u04ae\u04b6\5"+
		"\u00d2j\2\u04af\u04b6\5\u00caf\2\u04b0\u04b6\5\u00ceh\2\u04b1\u04b6\5"+
		"\u00d0i\2\u04b2\u04b6\5\u0086D\2\u04b3\u04b6\5\u0082B\2\u04b4\u04b6\5"+
		"\u00acW\2\u04b5\u04ad\3\2\2\2\u04b5\u04ae\3\2\2\2\u04b5\u04af\3\2\2\2"+
		"\u04b5\u04b0\3\2\2\2\u04b5\u04b1\3\2\2\2\u04b5\u04b2\3\2\2\2\u04b5\u04b3"+
		"\3\2\2\2\u04b5\u04b4\3\2\2\2\u04b6\u0081\3\2\2\2\u04b7\u04b8\7V\2\2\u04b8"+
		"\u04ba\7\u008d\2\2\u04b9\u04bb\5\u00d6l\2\u04ba\u04b9\3\2\2\2\u04ba\u04bb"+
		"\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc\u04bd\7l\2\2\u04bd\u04be\5\u0104\u0083"+
		"\2\u04be\u04bf\7\u0089\2\2\u04bf\u0083\3\2\2\2\u04c0\u04c2\5\u008eH\2"+
		"\u04c1\u04c0\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c4\3\2\2\2\u04c3\u04c5"+
		"\5\u00ecw\2\u04c4\u04c3\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c6\3\2\2"+
		"\2\u04c6\u04cf\7\u0089\2\2\u04c7\u04c9\5\u00d6l\2\u04c8\u04ca\5\u008e"+
		"H\2\u04c9\u04c8\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb"+
		"\u04cc\5\u00ecw\2\u04cc\u04cd\7\u0089\2\2\u04cd\u04cf\3\2\2\2\u04ce\u04c1"+
		"\3\2\2\2\u04ce\u04c7\3\2\2\2\u04cf\u0085\3\2\2\2\u04d0\u04d1\7C\2\2\u04d1"+
		"\u04d2\7\\\2\2\u04d2\u04d3\5`\61\2\u04d3\u04d4\7\u0083\2\2\u04d4\u04d5"+
		"\7\u0098\2\2\u04d5\u04d6\7]\2\2\u04d6\u04d7\7\u0089\2\2\u04d7\u0087\3"+
		"\2\2\2\u04d8\u04d9\7\u0089\2\2\u04d9\u0089\3\2\2\2\u04da\u04db\5\u00d6"+
		"l\2\u04db\u04dc\7\u0089\2\2\u04dc\u008b\3\2\2\2\u04dd\u04e4\5\u0090I\2"+
		"\u04de\u04e4\5\u0096L\2\u04df\u04e4\5\u0092J\2\u04e0\u04e4\7,\2\2\u04e1"+
		"\u04e4\7M\2\2\u04e2\u04e4\7\31\2\2\u04e3\u04dd\3\2\2\2\u04e3\u04de\3\2"+
		"\2\2\u04e3\u04df\3\2\2\2\u04e3\u04e0\3\2\2\2\u04e3\u04e1\3\2\2\2\u04e3"+
		"\u04e2\3\2\2\2\u04e4\u008d\3\2\2\2\u04e5\u04e7\5\u008cG\2\u04e6\u04e8"+
		"\5\u00d6l\2\u04e7\u04e6\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04ed\3\2\2"+
		"\2\u04e9\u04ea\5\u008cG\2\u04ea\u04eb\5\u008eH\2\u04eb\u04ed\3\2\2\2\u04ec"+
		"\u04e5\3\2\2\2\u04ec\u04e9\3\2\2\2\u04ed\u008f\3\2\2\2\u04ee\u04ef\t\6"+
		"\2\2\u04ef\u0091\3\2\2\2\u04f0\u04f1\t\7\2\2\u04f1\u0093\3\2\2\2\u04f2"+
		"\u04f3\7\u008d\2\2\u04f3\u0095\3\2\2\2\u04f4\u04f8\5\u0098M\2\u04f5\u04f8"+
		"\5\u0126\u0094\2\u04f6\u04f8\5\u00a8U\2\u04f7\u04f4\3\2\2\2\u04f7\u04f5"+
		"\3\2\2\2\u04f7\u04f6\3\2\2\2\u04f8\u0097\3\2\2\2\u04f9\u04fe\5\u009eP"+
		"\2\u04fa\u04fe\5\u00a4S\2\u04fb\u04fe\5\u016e\u00b8\2\u04fc\u04fe\5\u00fe"+
		"\u0080\2\u04fd\u04f9\3\2\2\2\u04fd\u04fa\3\2\2\2\u04fd\u04fb\3\2\2\2\u04fd"+
		"\u04fc\3\2\2\2\u04fe\u0099\3\2\2\2\u04ff\u0501\5\u0096L\2\u0500\u0502"+
		"\5\u00d6l\2\u0501\u0500\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0507\3\2\2"+
		"\2\u0503\u0504\5\u0096L\2\u0504\u0505\5\u009aN\2\u0505\u0507\3\2\2\2\u0506"+
		"\u04ff\3\2\2\2\u0506\u0503\3\2\2\2\u0507\u009b\3\2\2\2\u0508\u050a\5\u0098"+
		"M\2\u0509\u050b\5\u00d6l\2\u050a\u0509\3\2\2\2\u050a\u050b\3\2\2\2\u050b"+
		"\u0510\3\2\2\2\u050c\u050d\5\u0098M\2\u050d\u050e\5\u009cO\2\u050e\u0510"+
		"\3\2\2\2\u050f\u0508\3\2\2\2\u050f\u050c\3\2\2\2\u0510\u009d\3\2\2\2\u0511"+
		"\u0513\5\f\7\2\u0512\u0511\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0514\3\2"+
		"\2\2\u0514\u052e\5\u00a0Q\2\u0515\u0516\5\f\7\2\u0516\u0517\7G\2\2\u0517"+
		"\u0518\5\u0164\u00b3\2\u0518\u052e\3\2\2\2\u0519\u052e\7\23\2\2\u051a"+
		"\u052e\7\24\2\2\u051b\u052e\7\25\2\2\u051c\u052e\7\27\2\2\u051d\u052e"+
		"\7\34\2\2\u051e\u052e\7Z\2\2\u051f\u052e\7\17\2\2\u0520\u052e\7?\2\2\u0521"+
		"\u052e\7\60\2\2\u0522\u052e\7\61\2\2\u0523\u052e\7@\2\2\u0524\u052e\7"+
		"P\2\2\u0525\u052e\7U\2\2\u0526\u052e\7R\2\2\u0527\u052e\7T\2\2\u0528\u052e"+
		"\7*\2\2\u0529\u052e\7!\2\2\u052a\u052e\7X\2\2\u052b\u052e\7\16\2\2\u052c"+
		"\u052e\5\u00a2R\2\u052d\u0512\3\2\2\2\u052d\u0515\3\2\2\2\u052d\u0519"+
		"\3\2\2\2\u052d\u051a\3\2\2\2\u052d\u051b\3\2\2\2\u052d\u051c\3\2\2\2\u052d"+
		"\u051d\3\2\2\2\u052d\u051e\3\2\2\2\u052d\u051f\3\2\2\2\u052d\u0520\3\2"+
		"\2\2\u052d\u0521\3\2\2\2\u052d\u0522\3\2\2\2\u052d\u0523\3\2\2\2\u052d"+
		"\u0524\3\2\2\2\u052d\u0525\3\2\2\2\u052d\u0526\3\2\2\2\u052d\u0527\3\2"+
		"\2\2\u052d\u0528\3\2\2\2\u052d\u0529\3\2\2\2\u052d\u052a\3\2\2\2\u052d"+
		"\u052b\3\2\2\2\u052d\u052c\3\2\2\2\u052e\u009f\3\2\2\2\u052f\u0534\5\u0124"+
		"\u0093\2\u0530\u0534\5\u00a6T\2\u0531\u0534\5\u0094K\2\u0532\u0534\5\u0164"+
		"\u00b3\2\u0533\u052f\3\2\2\2\u0533\u0530\3\2\2\2\u0533\u0531\3\2\2\2\u0533"+
		"\u0532\3\2\2\2\u0534\u00a1\3\2\2\2\u0535\u0536\7\35\2\2\u0536\u0537\7"+
		"\\\2\2\u0537\u0538\5^\60\2\u0538\u0539\7]\2\2\u0539\u053f\3\2\2\2\u053a"+
		"\u053b\7\35\2\2\u053b\u053c\7\\\2\2\u053c\u053d\7\16\2\2\u053d\u053f\7"+
		"]\2\2\u053e\u0535\3\2\2\2\u053e\u053a\3\2\2\2\u053f\u00a3\3\2\2\2\u0540"+
		"\u0542\5\u012e\u0098\2\u0541\u0543\5\u00d6l\2\u0542\u0541\3\2\2\2\u0542"+
		"\u0543\3\2\2\2\u0543\u0545\3\2\2\2\u0544\u0546\5\f\7\2\u0545\u0544\3\2"+
		"\2\2\u0545\u0546\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u0548\7\u008d\2\2\u0548"+
		"\u0559\3\2\2\2\u0549\u054a\5\u012e\u0098\2\u054a\u054b\5\u0164\u00b3\2"+
		"\u054b\u0559\3\2\2\2\u054c\u054d\5\u012e\u0098\2\u054d\u054f\5\f\7\2\u054e"+
		"\u0550\7G\2\2\u054f\u054e\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u0551\3\2"+
		"\2\2\u0551\u0552\5\u0164\u00b3\2\u0552\u0559\3\2\2\2\u0553\u0555\7$\2"+
		"\2\u0554\u0556\5\f\7\2\u0555\u0554\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0557"+
		"\3\2\2\2\u0557\u0559\7\u008d\2\2\u0558\u0540\3\2\2\2\u0558\u0549\3\2\2"+
		"\2\u0558\u054c\3\2\2\2\u0558\u0553\3\2\2\2\u0559\u00a5\3\2\2\2\u055a\u055b"+
		"\7\u008d\2\2\u055b\u00a7\3\2\2\2\u055c\u055d\5\u00aaV\2\u055d\u055f\7"+
		"`\2\2\u055e\u0560\5\u00b2Z\2\u055f\u055e\3\2\2\2\u055f\u0560\3\2\2\2\u0560"+
		"\u0561\3\2\2\2\u0561\u0562\7a\2\2\u0562\u056a\3\2\2\2\u0563\u0564\5\u00aa"+
		"V\2\u0564\u0565\7`\2\2\u0565\u0566\5\u00b2Z\2\u0566\u0567\7\u0083\2\2"+
		"\u0567\u0568\7a\2\2\u0568\u056a\3\2\2\2\u0569\u055c\3\2\2\2\u0569\u0563"+
		"\3\2\2\2\u056a\u00a9\3\2\2\2\u056b\u056d\5\u00aeX\2\u056c\u056e\5\u00d6"+
		"l\2\u056d\u056c\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u0570\3\2\2\2\u056f"+
		"\u0571\7\u008d\2\2\u0570\u056f\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u0573"+
		"\3\2\2\2\u0572\u0574\5\u00b0Y\2\u0573\u0572\3\2\2\2\u0573\u0574\3\2\2"+
		"\2\u0574\u057f\3\2\2\2\u0575\u0577\5\u00aeX\2\u0576\u0578\5\u00d6l\2\u0577"+
		"\u0576\3\2\2\2\u0577\u0578\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057a\5\f"+
		"\7\2\u057a\u057c\7\u008d\2\2\u057b\u057d\5\u00b0Y\2\u057c\u057b\3\2\2"+
		"\2\u057c\u057d\3\2\2\2\u057d\u057f\3\2\2\2\u057e\u056b\3\2\2\2\u057e\u0575"+
		"\3\2\2\2\u057f\u00ab\3\2\2\2\u0580\u0582\5\u00aeX\2\u0581\u0583\5\u00d6"+
		"l\2\u0582\u0581\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0584\3\2\2\2\u0584"+
		"\u0586\7\u008d\2\2\u0585\u0587\5\u00b0Y\2\u0586\u0585\3\2\2\2\u0586\u0587"+
		"\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u0589\7\u0089\2\2\u0589\u00ad\3\2\2"+
		"\2\u058a\u0590\7$\2\2\u058b\u058c\7$\2\2\u058c\u0590\7\26\2\2\u058d\u058e"+
		"\7$\2\2\u058e\u0590\7E\2\2\u058f\u058a\3\2\2\2\u058f\u058b\3\2\2\2\u058f"+
		"\u058d\3\2\2\2\u0590\u00af\3\2\2\2\u0591\u0592\7\u0087\2\2\u0592\u0593"+
		"\5\u009aN\2\u0593\u00b1\3\2\2\2\u0594\u0595\bZ\1\2\u0595\u0596\5\u00b4"+
		"[\2\u0596\u059c\3\2\2\2\u0597\u0598\f\3\2\2\u0598\u0599\7\u0083\2\2\u0599"+
		"\u059b\5\u00b4[\2\u059a\u0597\3\2\2\2\u059b\u059e\3\2\2\2\u059c\u059a"+
		"\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u00b3\3\2\2\2\u059e\u059c\3\2\2\2\u059f"+
		"\u05a5\5\u00b6\\\2\u05a0\u05a1\5\u00b6\\\2\u05a1\u05a2\7l\2\2\u05a2\u05a3"+
		"\5`\61\2\u05a3\u05a5\3\2\2\2\u05a4\u059f\3\2\2\2\u05a4\u05a0\3\2\2\2\u05a5"+
		"\u00b5\3\2\2\2\u05a6\u05a7\7\u008d\2\2\u05a7\u00b7\3\2\2\2\u05a8\u05ab"+
		"\5\u00ba^\2\u05a9\u05ab\5\u00c8e\2\u05aa\u05a8\3\2\2\2\u05aa\u05a9\3\2"+
		"\2\2\u05ab\u00b9\3\2\2\2\u05ac\u05ad\7\u008d\2\2\u05ad\u00bb\3\2\2\2\u05ae"+
		"\u05b1\5\u00be`\2\u05af\u05b1\5\u00c4c\2\u05b0\u05ae\3\2\2\2\u05b0\u05af"+
		"\3\2\2\2\u05b1\u00bd\3\2\2\2\u05b2\u05b5\5\u00c0a\2\u05b3\u05b5\5\u00c2"+
		"b\2\u05b4\u05b2\3\2\2\2\u05b4\u05b3\3\2\2\2\u05b5\u00bf\3\2\2\2\u05b6"+
		"\u05b8\7/\2\2\u05b7\u05b6\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05b9\3\2"+
		"\2\2\u05b9\u05ba\7\63\2\2\u05ba\u05bb\7\u008d\2\2\u05bb\u05bc\7`\2\2\u05bc"+
		"\u05bd\5\u00c6d\2\u05bd\u05be\7a\2\2\u05be\u00c1\3\2\2\2\u05bf\u05c1\7"+
		"/\2\2\u05c0\u05bf\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2"+
		"\u05c3\7\63\2\2\u05c3\u05c4\5\u00ba^\2\u05c4\u05c5\7`\2\2\u05c5\u05c6"+
		"\5\u00c6d\2\u05c6\u05c7\7a\2\2\u05c7\u00c3\3\2\2\2\u05c8\u05ca\7/\2\2"+
		"\u05c9\u05c8\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05cc"+
		"\7\63\2\2\u05cc\u05cd\7`\2\2\u05cd\u05ce\5\u00c6d\2\u05ce\u05cf\7a\2\2"+
		"\u05cf\u00c5\3\2\2\2\u05d0\u05d2\5|?\2\u05d1\u05d0\3\2\2\2\u05d1\u05d2"+
		"\3\2\2\2\u05d2\u00c7\3\2\2\2\u05d3\u05d4\7\u008d\2\2\u05d4\u00c9\3\2\2"+
		"\2\u05d5\u05d6\7\63\2\2\u05d6\u05d7\7\u008d\2\2\u05d7\u05d8\7l\2\2\u05d8"+
		"\u05d9\5\u00ccg\2\u05d9\u05da\7\u0089\2\2\u05da\u00cb\3\2\2\2\u05db\u05dd"+
		"\5\f\7\2\u05dc\u05db\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u05de\3\2\2\2\u05de"+
		"\u05df\5\u00b8]\2\u05df\u00cd\3\2\2\2\u05e0\u05e2\7V\2\2\u05e1\u05e3\7"+
		"O\2\2\u05e2\u05e1\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4"+
		"\u05e5\5\f\7\2\u05e5\u05e6\5\b\5\2\u05e6\u05e7\7\u0089\2\2\u05e7\u05ee"+
		"\3\2\2\2\u05e8\u05e9\7V\2\2\u05e9\u05ea\7\u0088\2\2\u05ea\u05eb\5\b\5"+
		"\2\u05eb\u05ec\7\u0089\2\2\u05ec\u05ee\3\2\2\2\u05ed\u05e0\3\2\2\2\u05ed"+
		"\u05e8\3\2\2\2\u05ee\u00cf\3\2\2\2\u05ef\u05f1\5\u00d6l\2\u05f0\u05ef"+
		"\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u05f3\7V\2\2\u05f3"+
		"\u05f5\7\63\2\2\u05f4\u05f6\5\f\7\2\u05f5\u05f4\3\2\2\2\u05f5\u05f6\3"+
		"\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f8\5\u00b8]\2\u05f8\u05f9\7\u0089"+
		"\2\2\u05f9\u00d1\3\2\2\2\u05fa\u05fb\7\r\2\2\u05fb\u05fc\7\\\2\2\u05fc"+
		"\u05fd\7\u0098\2\2\u05fd\u05fe\7]\2\2\u05fe\u05ff\7\u0089\2\2\u05ff\u00d3"+
		"\3\2\2\2\u0600\u0601\7\'\2\2\u0601\u0602\7\u0098\2\2\u0602\u0604\7`\2"+
		"\2\u0603\u0605\5|?\2\u0604\u0603\3\2\2\2\u0604\u0605\3\2\2\2\u0605\u0606"+
		"\3\2\2\2\u0606\u060b\7a\2\2\u0607\u0608\7\'\2\2\u0608\u0609\7\u0098\2"+
		"\2\u0609\u060b\5~@\2\u060a\u0600\3\2\2\2\u060a\u0607\3\2\2\2\u060b\u00d5"+
		"\3\2\2\2\u060c\u060d\bl\1\2\u060d\u060e\5\u00d8m\2\u060e\u0613\3\2\2\2"+
		"\u060f\u0610\f\3\2\2\u0610\u0612\5\u00d8m\2\u0611\u060f\3\2\2\2\u0612"+
		"\u0615\3\2\2\2\u0613\u0611\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u00d7\3\2"+
		"\2\2\u0615\u0613\3\2\2\2\u0616\u0617\7^\2\2\u0617\u0618\7^\2\2\u0618\u0619"+
		"\5\u00dco\2\u0619\u061a\7_\2\2\u061a\u061b\7_\2\2\u061b\u061e\3\2\2\2"+
		"\u061c\u061e\5\u00dan\2\u061d\u0616\3\2\2\2\u061d\u061c\3\2\2\2\u061e"+
		"\u00d9\3\2\2\2\u061f\u0620\7\13\2\2\u0620\u0621\7\\\2\2\u0621\u0623\5"+
		"\u0104\u0083\2\u0622\u0624\7\u008c\2\2\u0623\u0622\3\2\2\2\u0623\u0624"+
		"\3\2\2\2\u0624\u0625\3\2\2\2\u0625\u0626\7]\2\2\u0626\u0630\3\2\2\2\u0627"+
		"\u0628\7\13\2\2\u0628\u0629\7\\\2\2\u0629\u062b\5`\61\2\u062a\u062c\7"+
		"\u008c\2\2\u062b\u062a\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u062d\3\2\2\2"+
		"\u062d\u062e\7]\2\2\u062e\u0630\3\2\2\2\u062f\u061f\3\2\2\2\u062f\u0627"+
		"\3\2\2\2\u0630\u00db\3\2\2\2\u0631\u0633\bo\1\2\u0632\u0634\5\u00dep\2"+
		"\u0633\u0632\3\2\2\2\u0633\u0634\3\2\2\2\u0634\u0639\3\2\2\2\u0635\u0636"+
		"\5\u00dep\2\u0636\u0637\7\u008c\2\2\u0637\u0639\3\2\2\2\u0638\u0631\3"+
		"\2\2\2\u0638\u0635\3\2\2\2\u0639\u0646\3\2\2\2\u063a\u063b\f\5\2\2\u063b"+
		"\u063d\7\u0083\2\2\u063c\u063e\5\u00dep\2\u063d\u063c\3\2\2\2\u063d\u063e"+
		"\3\2\2\2\u063e\u0645\3\2\2\2\u063f\u0640\f\3\2\2\u0640\u0641\7\u0083\2"+
		"\2\u0641\u0642\5\u00dep\2\u0642\u0643\7\u008c\2\2\u0643\u0645\3\2\2\2"+
		"\u0644\u063a\3\2\2\2\u0644\u063f\3\2\2\2\u0645\u0648\3\2\2\2\u0646\u0644"+
		"\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u00dd\3\2\2\2\u0648\u0646\3\2\2\2\u0649"+
		"\u064b\5\u00e0q\2\u064a\u064c\5\u00e6t\2\u064b\u064a\3\2\2\2\u064b\u064c"+
		"\3\2\2\2\u064c\u00df\3\2\2\2\u064d\u0650\7\u008d\2\2\u064e\u0650\5\u00e2"+
		"r\2\u064f\u064d\3\2\2\2\u064f\u064e\3\2\2\2\u0650\u00e1\3\2\2\2\u0651"+
		"\u0652\5\u00e4s\2\u0652\u0653\7\u0088\2\2\u0653\u0654\7\u008d\2\2\u0654"+
		"\u00e3\3\2\2\2\u0655\u0656\7\u008d\2\2\u0656\u00e5\3\2\2\2\u0657\u0658"+
		"\7\\\2\2\u0658\u0659\5\u00e8u\2\u0659\u065a\7]\2\2\u065a\u00e7\3\2\2\2"+
		"\u065b\u065d\bu\1\2\u065c\u065e\5\u00eav\2\u065d\u065c\3\2\2\2\u065d\u065e"+
		"\3\2\2\2\u065e\u0663\3\2\2\2\u065f\u0660\f\3\2\2\u0660\u0662\5\u00eav"+
		"\2\u0661\u065f\3\2\2\2\u0662\u0665\3\2\2\2\u0663\u0661\3\2\2\2\u0663\u0664"+
		"\3\2\2\2\u0664\u00e9\3\2\2\2\u0665\u0663\3\2\2\2\u0666\u0667\7\\\2\2\u0667"+
		"\u0668\5\u00e8u\2\u0668\u0669\7]\2\2\u0669\u0678\3\2\2\2\u066a\u066b\7"+
		"^\2\2\u066b\u066c\5\u00e8u\2\u066c\u066d\7_\2\2\u066d\u0678\3\2\2\2\u066e"+
		"\u066f\7`\2\2\u066f\u0670\5\u00e8u\2\u0670\u0671\7a\2\2\u0671\u0678\3"+
		"\2\2\2\u0672\u0674\n\b\2\2\u0673\u0672\3\2\2\2\u0674\u0675\3\2\2\2\u0675"+
		"\u0673\3\2\2\2\u0675\u0676\3\2\2\2\u0676\u0678\3\2\2\2\u0677\u0666\3\2"+
		"\2\2\u0677\u066a\3\2\2\2\u0677\u066e\3\2\2\2\u0677\u0673\3\2\2\2\u0678"+
		"\u00eb\3\2\2\2\u0679\u067a\bw\1\2\u067a\u067b\5\u00eex\2\u067b\u0681\3"+
		"\2\2\2\u067c\u067d\f\3\2\2\u067d\u067e\7\u0083\2\2\u067e\u0680\5\u00ee"+
		"x\2\u067f\u067c\3\2\2\2\u0680\u0683\3\2\2\2\u0681\u067f\3\2\2\2\u0681"+
		"\u0682\3\2\2\2\u0682\u00ed\3\2\2\2\u0683\u0681\3\2\2\2\u0684\u0686\5\u00f0"+
		"y\2\u0685\u0687\5\u011a\u008e\2\u0686\u0685\3\2\2\2\u0686\u0687\3\2\2"+
		"\2\u0687\u00ef\3\2\2\2\u0688\u068e\5\u00f2z\2\u0689\u068a\5\u00f4{\2\u068a"+
		"\u068b\5\u00f6|\2\u068b\u068c\5\u00f8}\2\u068c\u068e\3\2\2\2\u068d\u0688"+
		"\3\2\2\2\u068d\u0689\3\2\2\2\u068e\u00f1\3\2\2\2\u068f\u0694\5\u00f4{"+
		"\2\u0690\u0691\5\u00fa~\2\u0691\u0692\5\u00f2z\2\u0692\u0694\3\2\2\2\u0693"+
		"\u068f\3\2\2\2\u0693\u0690\3\2\2\2\u0694\u00f3\3\2\2\2\u0695\u0696\b{"+
		"\1\2\u0696\u0698\5\u0102\u0082\2\u0697\u0699\5\u00d6l\2\u0698\u0697\3"+
		"\2\2\2\u0698\u0699\3\2\2\2\u0699\u069f\3\2\2\2\u069a\u069b\7\\\2\2\u069b"+
		"\u069c\5\u00f2z\2\u069c\u069d\7]\2\2\u069d\u069f\3\2\2\2\u069e\u0695\3"+
		"\2\2\2\u069e\u069a\3\2\2\2\u069f\u06ad\3\2\2\2\u06a0\u06a1\f\5\2\2\u06a1"+
		"\u06ac\5\u00f6|\2\u06a2\u06a3\f\4\2\2\u06a3\u06a5\7^\2\2\u06a4\u06a6\5"+
		"`\61\2\u06a5\u06a4\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7"+
		"\u06a9\7_\2\2\u06a8\u06aa\5\u00d6l\2\u06a9\u06a8\3\2\2\2\u06a9\u06aa\3"+
		"\2\2\2\u06aa\u06ac\3\2\2\2\u06ab\u06a0\3\2\2\2\u06ab\u06a2\3\2\2\2\u06ac"+
		"\u06af\3\2\2\2\u06ad\u06ab\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u00f5\3\2"+
		"\2\2\u06af\u06ad\3\2\2\2\u06b0\u06b1\7\\\2\2\u06b1\u06b2\5\u0110\u0089"+
		"\2\u06b2\u06b4\7]\2\2\u06b3\u06b5\5\u00fc\177\2\u06b4\u06b3\3\2\2\2\u06b4"+
		"\u06b5\3\2\2\2\u06b5\u06b7\3\2\2\2\u06b6\u06b8\5\u0100\u0081\2\u06b7\u06b6"+
		"\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06ba\3\2\2\2\u06b9\u06bb\5\u0180\u00c1"+
		"\2\u06ba\u06b9\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb\u06bd\3\2\2\2\u06bc\u06be"+
		"\5\u00d6l\2\u06bd\u06bc\3\2\2\2\u06bd\u06be\3\2\2\2\u06be\u00f7\3\2\2"+
		"\2\u06bf\u06c0\7\u0085\2\2\u06c0\u06c2\5\u009cO\2\u06c1\u06c3\5\u0106"+
		"\u0084\2\u06c2\u06c1\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u00f9\3\2\2\2\u06c4"+
		"\u06c6\7d\2\2\u06c5\u06c7\5\u00d6l\2\u06c6\u06c5\3\2\2\2\u06c6\u06c7\3"+
		"\2\2\2\u06c7\u06c9\3\2\2\2\u06c8\u06ca\5\u00fc\177\2\u06c9\u06c8\3\2\2"+
		"\2\u06c9\u06ca\3\2\2\2\u06ca\u06dc\3\2\2\2\u06cb\u06cd\7h\2\2\u06cc\u06ce"+
		"\5\u00d6l\2\u06cd\u06cc\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce\u06dc\3\2\2"+
		"\2\u06cf\u06d1\7\5\2\2\u06d0\u06d2\5\u00d6l\2\u06d1\u06d0\3\2\2\2\u06d1"+
		"\u06d2\3\2\2\2\u06d2\u06dc\3\2\2\2\u06d3\u06d4\5\f\7\2\u06d4\u06d6\7d"+
		"\2\2\u06d5\u06d7\5\u00d6l\2\u06d6\u06d5\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7"+
		"\u06d9\3\2\2\2\u06d8\u06da\5\u00fc\177\2\u06d9\u06d8\3\2\2\2\u06d9\u06da"+
		"\3\2\2\2\u06da\u06dc\3\2\2\2\u06db\u06c4\3\2\2\2\u06db\u06cb\3\2\2\2\u06db"+
		"\u06cf\3\2\2\2\u06db\u06d3\3\2\2\2\u06dc\u00fb\3\2\2\2\u06dd\u06df\5\u00fe"+
		"\u0080\2\u06de\u06e0\5\u00fc\177\2\u06df\u06de\3\2\2\2\u06df\u06e0\3\2"+
		"\2\2\u06e0\u00fd\3\2\2\2\u06e1\u06e2\t\t\2\2\u06e2\u00ff\3\2\2\2\u06e3"+
		"\u06e4\t\n\2\2\u06e4\u0101\3\2\2\2\u06e5\u06e7\7\u008c\2\2\u06e6\u06e5"+
		"\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06e8\3\2\2\2\u06e8\u06e9\5\6\4\2\u06e9"+
		"\u0103\3\2\2\2\u06ea\u06ec\5\u009aN\2\u06eb\u06ed\5\u0106\u0084\2\u06ec"+
		"\u06eb\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u0105\3\2\2\2\u06ee\u06f7\5\u0108"+
		"\u0085\2\u06ef\u06f1\5\u010a\u0086\2\u06f0\u06ef\3\2\2\2\u06f0\u06f1\3"+
		"\2\2\2\u06f1\u06f2\3\2\2\2\u06f2\u06f3\5\u00f6|\2\u06f3\u06f4\5\u00f8"+
		"}\2\u06f4\u06f7\3\2\2\2\u06f5\u06f7\5\u010c\u0087\2\u06f6\u06ee\3\2\2"+
		"\2\u06f6\u06f0\3\2\2\2\u06f6\u06f5\3\2\2\2\u06f7\u0107\3\2\2\2\u06f8\u06fe"+
		"\5\u010a\u0086\2\u06f9\u06fb\5\u00fa~\2\u06fa\u06fc\5\u0108\u0085\2\u06fb"+
		"\u06fa\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fc\u06fe\3\2\2\2\u06fd\u06f8\3\2"+
		"\2\2\u06fd\u06f9\3\2\2\2\u06fe\u0109\3\2\2\2\u06ff\u0700\b\u0086\1\2\u0700"+
		"\u070e\5\u00f6|\2\u0701\u0703\7^\2\2\u0702\u0704\5`\61\2\u0703\u0702\3"+
		"\2\2\2\u0703\u0704\3\2\2\2\u0704\u0705\3\2\2\2\u0705\u0707\7_\2\2\u0706"+
		"\u0708\5\u00d6l\2\u0707\u0706\3\2\2\2\u0707\u0708\3\2\2\2\u0708\u070e"+
		"\3\2\2\2\u0709\u070a\7\\\2\2\u070a\u070b\5\u0108\u0085\2\u070b\u070c\7"+
		"]\2\2\u070c\u070e\3\2\2\2\u070d\u06ff\3\2\2\2\u070d\u0701\3\2\2\2\u070d"+
		"\u0709\3\2\2\2\u070e\u071c\3\2\2\2\u070f\u0710\f\7\2\2\u0710\u071b\5\u00f6"+
		"|\2\u0711\u0712\f\5\2\2\u0712\u0714\7^\2\2\u0713\u0715\5`\61\2\u0714\u0713"+
		"\3\2\2\2\u0714\u0715\3\2\2\2\u0715\u0716\3\2\2\2\u0716\u0718\7_\2\2\u0717"+
		"\u0719\5\u00d6l\2\u0718\u0717\3\2\2\2\u0718\u0719\3\2\2\2\u0719\u071b"+
		"\3\2\2\2\u071a\u070f\3\2\2\2\u071a\u0711\3\2\2\2\u071b\u071e\3\2\2\2\u071c"+
		"\u071a\3\2\2\2\u071c\u071d\3\2\2\2\u071d\u010b\3\2\2\2\u071e\u071c\3\2"+
		"\2\2\u071f\u0724\5\u010e\u0088\2\u0720\u0721\5\u00fa~\2\u0721\u0722\5"+
		"\u010c\u0087\2\u0722\u0724\3\2\2\2\u0723\u071f\3\2\2\2\u0723\u0720\3\2"+
		"\2\2\u0724\u010d\3\2\2\2\u0725\u0726\b\u0088\1\2\u0726\u0727\7\u008c\2"+
		"\2\u0727\u0735\3\2\2\2\u0728\u0729\f\5\2\2\u0729\u0734\5\u00f6|\2\u072a"+
		"\u072b\f\4\2\2\u072b\u072d\7^\2\2\u072c\u072e\5`\61\2\u072d\u072c\3\2"+
		"\2\2\u072d\u072e\3\2\2\2\u072e\u072f\3\2\2\2\u072f\u0731\7_\2\2\u0730"+
		"\u0732\5\u00d6l\2\u0731\u0730\3\2\2\2\u0731\u0732\3\2\2\2\u0732\u0734"+
		"\3\2\2\2\u0733\u0728\3\2\2\2\u0733\u072a\3\2\2\2\u0734\u0737\3\2\2\2\u0735"+
		"\u0733\3\2\2\2\u0735\u0736\3\2\2\2\u0736\u010f\3\2\2\2\u0737\u0735\3\2"+
		"\2\2\u0738\u073a\5\u0112\u008a\2\u0739\u0738\3\2\2\2\u0739\u073a\3\2\2"+
		"\2\u073a\u073c\3\2\2\2\u073b\u073d\7\u008c\2\2\u073c\u073b\3\2\2\2\u073c"+
		"\u073d\3\2\2\2\u073d\u0743\3\2\2\2\u073e\u073f\5\u0112\u008a\2\u073f\u0740"+
		"\7\u0083\2\2\u0740\u0741\7\u008c\2\2\u0741\u0743\3\2\2\2\u0742\u0739\3"+
		"\2\2\2\u0742\u073e\3\2\2\2\u0743\u0111\3\2\2\2\u0744\u0745\b\u008a\1\2"+
		"\u0745\u0746\5\u0114\u008b\2\u0746\u074c\3\2\2\2\u0747\u0748\f\3\2\2\u0748"+
		"\u0749\7\u0083\2\2\u0749\u074b\5\u0114\u008b\2\u074a\u0747\3\2\2\2\u074b"+
		"\u074e\3\2\2\2\u074c\u074a\3\2\2\2\u074c\u074d\3\2\2\2\u074d\u0113\3\2"+
		"\2\2\u074e\u074c\3\2\2\2\u074f\u0751\5\u00d6l\2\u0750\u074f\3\2\2\2\u0750"+
		"\u0751\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u0753\5\u008eH\2\u0753\u0754"+
		"\5\u00f0y\2\u0754\u076f\3\2\2\2\u0755\u0757\5\u00d6l\2\u0756\u0755\3\2"+
		"\2\2\u0756\u0757\3\2\2\2\u0757\u0758\3\2\2\2\u0758\u0759\5\u008eH\2\u0759"+
		"\u075a\5\u00f0y\2\u075a\u075b\7l\2\2\u075b\u075c\5\u011e\u0090\2\u075c"+
		"\u076f\3\2\2\2\u075d\u075f\5\u00d6l\2\u075e\u075d\3\2\2\2\u075e\u075f"+
		"\3\2\2\2\u075f\u0760\3\2\2\2\u0760\u0762\5\u008eH\2\u0761\u0763\5\u0106"+
		"\u0084\2\u0762\u0761\3\2\2\2\u0762\u0763\3\2\2\2\u0763\u076f\3\2\2\2\u0764"+
		"\u0766\5\u00d6l\2\u0765\u0764\3\2\2\2\u0765\u0766\3\2\2\2\u0766\u0767"+
		"\3\2\2\2\u0767\u0769\5\u008eH\2\u0768\u076a\5\u0106\u0084\2\u0769\u0768"+
		"\3\2\2\2\u0769\u076a\3\2\2\2\u076a\u076b\3\2\2\2\u076b\u076c\7l\2\2\u076c"+
		"\u076d\5\u011e\u0090\2\u076d\u076f\3\2\2\2\u076e\u0750\3\2\2\2\u076e\u0756"+
		"\3\2\2\2\u076e\u075e\3\2\2\2\u076e\u0765\3\2\2\2\u076f\u0115\3\2\2\2\u0770"+
		"\u0772\5\u00d6l\2\u0771\u0770\3\2\2\2\u0771\u0772\3\2\2\2\u0772\u0774"+
		"\3\2\2\2\u0773\u0775\5\u008eH\2\u0774\u0773\3\2\2\2\u0774\u0775\3\2\2"+
		"\2\u0775\u0776\3\2\2\2\u0776\u0778\5\u00f0y\2\u0777\u0779\5\u0138\u009d"+
		"\2\u0778\u0777\3\2\2\2\u0778\u0779\3\2\2\2\u0779\u077a\3\2\2\2\u077a\u077b"+
		"\5\u0118\u008d\2\u077b\u0117\3\2\2\2\u077c\u077e\5\u0150\u00a9\2\u077d"+
		"\u077c\3\2\2\2\u077d\u077e\3\2\2\2\u077e\u077f\3\2\2\2\u077f\u0788\5h"+
		"\65\2\u0780\u0788\5\u0176\u00bc\2\u0781\u0782\7l\2\2\u0782\u0783\7\36"+
		"\2\2\u0783\u0788\7\u0089\2\2\u0784\u0785\7l\2\2\u0785\u0786\7\37\2\2\u0786"+
		"\u0788\7\u0089\2\2\u0787\u077d\3\2\2\2\u0787\u0780\3\2\2\2\u0787\u0781"+
		"\3\2\2\2\u0787\u0784\3\2\2\2\u0788\u0119\3\2\2\2\u0789\u078f\5\u011c\u008f"+
		"\2\u078a\u078b\7\\\2\2\u078b\u078c\5&\24\2\u078c\u078d\7]\2\2\u078d\u078f"+
		"\3\2\2\2\u078e\u0789\3\2\2\2\u078e\u078a\3\2\2\2\u078f\u011b\3\2\2\2\u0790"+
		"\u0791\7l\2\2\u0791\u0794\5\u011e\u0090\2\u0792\u0794\5\u0122\u0092\2"+
		"\u0793\u0790\3\2\2\2\u0793\u0792\3\2\2\2\u0794\u011d\3\2\2\2\u0795\u0798"+
		"\5Z.\2\u0796\u0798\5\u0122\u0092\2\u0797\u0795\3\2\2\2\u0797\u0796\3\2"+
		"\2\2\u0798\u011f\3\2\2\2\u0799\u079a\b\u0091\1\2\u079a\u079c\5\u011e\u0090"+
		"\2\u079b\u079d\7\u008c\2\2\u079c\u079b\3\2\2\2\u079c\u079d\3\2\2\2\u079d"+
		"\u07a6\3\2\2\2\u079e\u079f\f\3\2\2\u079f\u07a0\7\u0083\2\2\u07a0\u07a2"+
		"\5\u011e\u0090\2\u07a1\u07a3\7\u008c\2\2\u07a2\u07a1\3\2\2\2\u07a2\u07a3"+
		"\3\2\2\2\u07a3\u07a5\3\2\2\2\u07a4\u079e\3\2\2\2\u07a5\u07a8\3\2\2\2\u07a6"+
		"\u07a4\3\2\2\2\u07a6\u07a7\3\2\2\2\u07a7\u0121\3\2\2\2\u07a8\u07a6\3\2"+
		"\2\2\u07a9\u07aa\7`\2\2\u07aa\u07ac\5\u0120\u0091\2\u07ab\u07ad\7\u0083"+
		"\2\2\u07ac\u07ab\3\2\2\2\u07ac\u07ad\3\2\2\2\u07ad\u07ae\3\2\2\2\u07ae"+
		"\u07af\7a\2\2\u07af\u07b3\3\2\2\2\u07b0\u07b1\7`\2\2\u07b1\u07b3\7a\2"+
		"\2\u07b2\u07a9\3\2\2\2\u07b2\u07b0\3\2\2\2\u07b3\u0123\3\2\2\2\u07b4\u07b7"+
		"\7\u008d\2\2\u07b5\u07b7\5\u0164\u00b3\2\u07b6\u07b4\3\2\2\2\u07b6\u07b5"+
		"\3\2\2\2\u07b7\u0125\3\2\2\2\u07b8\u07b9\5\u0128\u0095\2\u07b9\u07bb\7"+
		"`\2\2\u07ba\u07bc\5\u0130\u0099\2\u07bb\u07ba\3\2\2\2\u07bb\u07bc\3\2"+
		"\2\2\u07bc\u07bd\3\2\2\2\u07bd\u07be\7a\2\2\u07be\u0127\3\2\2\2\u07bf"+
		"\u07c1\5\u012e\u0098\2\u07c0\u07c2\5\u00d6l\2\u07c1\u07c0\3\2\2\2\u07c1"+
		"\u07c2\3\2\2\2\u07c2\u07c3\3\2\2\2\u07c3\u07c5\5\u012a\u0096\2\u07c4\u07c6"+
		"\5\u012c\u0097\2\u07c5\u07c4\3\2\2\2\u07c5\u07c6\3\2\2\2\u07c6\u07c8\3"+
		"\2\2\2\u07c7\u07c9\5\u013e\u00a0\2\u07c8\u07c7\3\2\2\2\u07c8\u07c9\3\2"+
		"\2\2\u07c9\u07d2\3\2\2\2\u07ca\u07cc\5\u012e\u0098\2\u07cb\u07cd\5\u00d6"+
		"l\2\u07cc\u07cb\3\2\2\2\u07cc\u07cd\3\2\2\2\u07cd\u07cf\3\2\2\2\u07ce"+
		"\u07d0\5\u013e\u00a0\2\u07cf\u07ce\3\2\2\2\u07cf\u07d0\3\2\2\2\u07d0\u07d2"+
		"\3\2\2\2\u07d1\u07bf\3\2\2\2\u07d1\u07ca\3\2\2\2\u07d2\u0129\3\2\2\2\u07d3"+
		"\u07d5\5\f\7\2\u07d4\u07d3\3\2\2\2\u07d4\u07d5\3\2\2\2\u07d5\u07d6\3\2"+
		"\2\2\u07d6\u07d7\5\u0124\u0093\2\u07d7\u012b\3\2\2\2\u07d8\u07d9\7)\2"+
		"\2\u07d9\u012d\3\2\2\2\u07da\u07db\t\13\2\2\u07db\u012f\3\2\2\2\u07dc"+
		"\u07de\5\u0132\u009a\2\u07dd\u07df\5\u0130\u0099\2\u07de\u07dd\3\2\2\2"+
		"\u07de\u07df\3\2\2\2\u07df\u07e6\3\2\2\2\u07e0\u07e1\5\u0148\u00a5\2\u07e1"+
		"\u07e3\7\u0087\2\2\u07e2\u07e4\5\u0130\u0099\2\u07e3\u07e2\3\2\2\2\u07e3"+
		"\u07e4\3\2\2\2\u07e4\u07e6\3\2\2\2\u07e5\u07dc\3\2\2\2\u07e5\u07e0\3\2"+
		"\2\2\u07e6\u0131\3\2\2\2\u07e7\u07e9\5\u00d6l\2\u07e8\u07e7\3\2\2\2\u07e8"+
		"\u07e9\3\2\2\2\u07e9\u07eb\3\2\2\2\u07ea\u07ec\5\u008eH\2\u07eb\u07ea"+
		"\3\2\2\2\u07eb\u07ec\3\2\2\2\u07ec\u07ee\3\2\2\2\u07ed\u07ef\5\u0134\u009b"+
		"\2\u07ee\u07ed\3\2\2\2\u07ee\u07ef\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0\u07f8"+
		"\7\u0089\2\2\u07f1\u07f8\5\u0116\u008c\2\u07f2\u07f8\5\u00ceh\2\u07f3"+
		"\u07f8\5\u0086D\2\u07f4\u07f8\5\u015c\u00af\2\u07f5\u07f8\5\u0082B\2\u07f6"+
		"\u07f8\5\u0088E\2\u07f7\u07e8\3\2\2\2\u07f7\u07f1\3\2\2\2\u07f7\u07f2"+
		"\3\2\2\2\u07f7\u07f3\3\2\2\2\u07f7\u07f4\3\2\2\2\u07f7\u07f5\3\2\2\2\u07f7"+
		"\u07f6\3\2\2\2\u07f8\u0133\3\2\2\2\u07f9\u07fa\b\u009b\1\2\u07fa\u07fb"+
		"\5\u0136\u009c\2\u07fb\u0801\3\2\2\2\u07fc\u07fd\f\3\2\2\u07fd\u07fe\7"+
		"\u0083\2\2\u07fe\u0800\5\u0136\u009c\2\u07ff\u07fc\3\2\2\2\u0800\u0803"+
		"\3\2\2\2\u0801\u07ff\3\2\2\2\u0801\u0802\3\2\2\2\u0802\u0135\3\2\2\2\u0803"+
		"\u0801\3\2\2\2\u0804\u0806\5\u00f0y\2\u0805\u0807\5\u0138\u009d\2\u0806"+
		"\u0805\3\2\2\2\u0806\u0807\3\2\2\2\u0807\u0809\3\2\2\2\u0808\u080a\5\u013c"+
		"\u009f\2\u0809\u0808\3\2\2\2\u0809\u080a\3\2\2\2\u080a\u0818\3\2\2\2\u080b"+
		"\u080d\5\u00f0y\2\u080c\u080e\5\u011c\u008f\2\u080d\u080c\3\2\2\2\u080d"+
		"\u080e\3\2\2\2\u080e\u0818\3\2\2\2\u080f\u0811\7\u008d\2\2\u0810\u080f"+
		"\3\2\2\2\u0810\u0811\3\2\2\2\u0811\u0813\3\2\2\2\u0812\u0814\5\u00d6l"+
		"\2\u0813\u0812\3\2\2\2\u0813\u0814\3\2\2\2\u0814\u0815\3\2\2\2\u0815\u0816"+
		"\7\u0087\2\2\u0816\u0818\5`\61\2\u0817\u0804\3\2\2\2\u0817\u080b\3\2\2"+
		"\2\u0817\u0810\3\2\2\2\u0818\u0137\3\2\2\2\u0819\u081a\b\u009d\1\2\u081a"+
		"\u081b\5\u013a\u009e\2\u081b\u0820\3\2\2\2\u081c\u081d\f\3\2\2\u081d\u081f"+
		"\5\u013a\u009e\2\u081e\u081c\3\2\2\2\u081f\u0822\3\2\2\2\u0820\u081e\3"+
		"\2\2\2\u0820\u0821\3\2\2\2\u0821\u0139\3\2\2\2\u0822\u0820\3\2\2\2\u0823"+
		"\u0824\t\f\2\2\u0824\u013b\3\2\2\2\u0825\u0826\7l\2\2\u0826\u0827\7\u0090"+
		"\2\2\u0827\u0828\b\u009f\1\2\u0828\u013d\3\2\2\2\u0829\u082a\7\u0087\2"+
		"\2\u082a\u082b\5\u0140\u00a1\2\u082b\u013f\3\2\2\2\u082c\u082d\b\u00a1"+
		"\1\2\u082d\u082f\5\u0142\u00a2\2\u082e\u0830\7\u008c\2\2\u082f\u082e\3"+
		"\2\2\2\u082f\u0830\3\2\2\2\u0830\u0839\3\2\2\2\u0831\u0832\f\3\2\2\u0832"+
		"\u0833\7\u0083\2\2\u0833\u0835\5\u0142\u00a2\2\u0834\u0836\7\u008c\2\2"+
		"\u0835\u0834\3\2\2\2\u0835\u0836\3\2\2\2\u0836\u0838\3\2\2\2\u0837\u0831"+
		"\3\2\2\2\u0838\u083b\3\2\2\2\u0839\u0837\3\2\2\2\u0839\u083a\3\2\2\2\u083a"+
		"\u0141\3\2\2\2\u083b\u0839\3\2\2\2\u083c\u083e\5\u00d6l\2\u083d\u083c"+
		"\3\2\2\2\u083d\u083e\3\2\2\2\u083e\u083f\3\2\2\2\u083f\u0852\5\u0146\u00a4"+
		"\2\u0840\u0842\5\u00d6l\2\u0841\u0840\3\2\2\2\u0841\u0842\3\2\2\2\u0842"+
		"\u0843\3\2\2\2\u0843\u0845\7W\2\2\u0844\u0846\5\u0148\u00a5\2\u0845\u0844"+
		"\3\2\2\2\u0845\u0846\3\2\2\2\u0846\u0847\3\2\2\2\u0847\u0852\5\u0146\u00a4"+
		"\2\u0848\u084a\5\u00d6l\2\u0849\u0848\3\2\2\2\u0849\u084a\3\2\2\2\u084a"+
		"\u084b\3\2\2\2\u084b\u084d\5\u0148\u00a5\2\u084c\u084e\7W\2\2\u084d\u084c"+
		"\3\2\2\2\u084d\u084e\3\2\2\2\u084e\u084f\3\2\2\2\u084f\u0850\5\u0146\u00a4"+
		"\2\u0850\u0852\3\2\2\2\u0851\u083d\3\2\2\2\u0851\u0841\3\2\2\2\u0851\u0849"+
		"\3\2\2\2\u0852\u0143\3\2\2\2\u0853\u0855\5\f\7\2\u0854\u0853\3\2\2\2\u0854"+
		"\u0855\3\2\2\2\u0855\u0856\3\2\2\2\u0856\u0859\5\u0124\u0093\2\u0857\u0859"+
		"\5\u00a2R\2\u0858\u0854\3\2\2\2\u0858\u0857\3\2\2\2\u0859\u0145\3\2\2"+
		"\2\u085a\u085b\5\u0144\u00a3\2\u085b\u0147\3\2\2\2\u085c\u085d\t\r\2\2"+
		"\u085d\u0149\3\2\2\2\u085e\u085f\7\67\2\2\u085f\u0860\5\u014c\u00a7\2"+
		"\u0860\u014b\3\2\2\2\u0861\u0863\5\u009aN\2\u0862\u0864\5\u014e\u00a8"+
		"\2\u0863\u0862\3\2\2\2\u0863\u0864\3\2\2\2\u0864\u014d\3\2\2\2\u0865\u0867"+
		"\5\u00fa~\2\u0866\u0868\5\u014e\u00a8\2\u0867\u0866\3\2\2\2\u0867\u0868"+
		"\3\2\2\2\u0868\u014f\3\2\2\2\u0869\u086a\7\u0087\2\2\u086a\u086b\5\u0152"+
		"\u00aa\2\u086b\u0151\3\2\2\2\u086c\u086e\5\u0154\u00ab\2\u086d\u086f\7"+
		"\u008c\2\2\u086e\u086d\3\2\2\2\u086e\u086f\3\2\2\2\u086f\u0878\3\2\2\2"+
		"\u0870\u0872\5\u0154\u00ab\2\u0871\u0873\7\u008c\2\2\u0872\u0871\3\2\2"+
		"\2\u0872\u0873\3\2\2\2\u0873\u0874\3\2\2\2\u0874\u0875\7\u0083\2\2\u0875"+
		"\u0876\5\u0152\u00aa\2\u0876\u0878\3\2\2\2\u0877\u086c\3\2\2\2\u0877\u0870"+
		"\3\2\2\2\u0878\u0153\3\2\2\2\u0879\u087a\5\u0156\u00ac\2\u087a\u087c\7"+
		"\\\2\2\u087b\u087d\5&\24\2\u087c\u087b\3\2\2\2\u087c\u087d\3\2\2\2\u087d"+
		"\u087e\3\2\2\2\u087e\u087f\7]\2\2\u087f\u0884\3\2\2\2\u0880\u0881\5\u0156"+
		"\u00ac\2\u0881\u0882\5\u0122\u0092\2\u0882\u0884\3\2\2\2\u0883\u0879\3"+
		"\2\2\2\u0883\u0880\3\2\2\2\u0884\u0155\3\2\2\2\u0885\u0888\5\u0144\u00a3"+
		"\2\u0886\u0888\7\u008d\2\2\u0887\u0885\3\2\2\2\u0887\u0886\3\2\2\2\u0888"+
		"\u0157\3\2\2\2\u0889\u088a\7\67\2\2\u088a\u088b\5\u0188\u00c5\2\u088b"+
		"\u0159\3\2\2\2\u088c\u088d\7\67\2\2\u088d\u088e\7\u0098\2\2\u088e\u0892"+
		"\7\u008d\2\2\u088f\u0890\7\67\2\2\u0890\u0892\7\u009b\2\2\u0891\u088c"+
		"\3\2\2\2\u0891\u088f\3\2\2\2\u0892\u015b\3\2\2\2\u0893\u0894\7G\2\2\u0894"+
		"\u0895\7m\2\2\u0895\u0896\5\u015e\u00b0\2\u0896\u0897\7n\2\2\u0897\u0898"+
		"\5~@\2\u0898\u015d\3\2\2\2\u0899\u089a\b\u00b0\1\2\u089a\u089b\5\u0160"+
		"\u00b1\2\u089b\u08a1\3\2\2\2\u089c\u089d\f\3\2\2\u089d\u089e\7\u0083\2"+
		"\2\u089e\u08a0\5\u0160\u00b1\2\u089f\u089c\3\2\2\2\u08a0\u08a3\3\2\2\2"+
		"\u08a1\u089f\3\2\2\2\u08a1\u08a2\3\2\2\2\u08a2\u015f\3\2\2\2\u08a3\u08a1"+
		"\3\2\2\2\u08a4\u08a7\5\u0162\u00b2\2\u08a5\u08a7\5\u0114\u008b\2\u08a6"+
		"\u08a4\3\2\2\2\u08a6\u08a5\3\2\2\2\u08a7\u0161\3\2\2\2\u08a8\u08aa\7\26"+
		"\2\2\u08a9\u08ab\7\u008c\2\2\u08aa\u08a9\3\2\2\2\u08aa\u08ab\3\2\2\2\u08ab"+
		"\u08ad\3\2\2\2\u08ac\u08ae\7\u008d\2\2\u08ad\u08ac\3\2\2\2\u08ad\u08ae"+
		"\3\2\2\2\u08ae\u08d9\3\2\2\2\u08af\u08b1\7\26\2\2\u08b0\u08b2\7\u008d"+
		"\2\2\u08b1\u08b0\3\2\2\2\u08b1\u08b2\3\2\2\2\u08b2\u08b3\3\2\2\2\u08b3"+
		"\u08b4\7l\2\2\u08b4\u08d9\5\u0104\u0083\2\u08b5\u08b7\7O\2\2\u08b6\u08b8"+
		"\7\u008c\2\2\u08b7\u08b6\3\2\2\2\u08b7\u08b8\3\2\2\2\u08b8\u08ba\3\2\2"+
		"\2\u08b9\u08bb\7\u008d\2\2\u08ba\u08b9\3\2\2\2\u08ba\u08bb\3\2\2\2\u08bb"+
		"\u08d9\3\2\2\2\u08bc\u08be\7O\2\2\u08bd\u08bf\7\u008d\2\2\u08be\u08bd"+
		"\3\2\2\2\u08be\u08bf\3\2\2\2\u08bf\u08c0\3\2\2\2\u08c0\u08c1\7l\2\2\u08c1"+
		"\u08d9\5\u0104\u0083\2\u08c2\u08c3\7G\2\2\u08c3\u08c4\7m\2\2\u08c4\u08c5"+
		"\5\u015e\u00b0\2\u08c5\u08c6\7n\2\2\u08c6\u08c8\7\26\2\2\u08c7\u08c9\7"+
		"\u008c\2\2\u08c8\u08c7\3\2\2\2\u08c8\u08c9\3\2\2\2\u08c9\u08cb\3\2\2\2"+
		"\u08ca\u08cc\7\u008d\2\2\u08cb\u08ca\3\2\2\2\u08cb\u08cc\3\2\2\2\u08cc"+
		"\u08d9\3\2\2\2\u08cd\u08ce\7G\2\2\u08ce\u08cf\7m\2\2\u08cf\u08d0\5\u015e"+
		"\u00b0\2\u08d0\u08d1\7n\2\2\u08d1\u08d3\7\26\2\2\u08d2\u08d4\7\u008d\2"+
		"\2\u08d3\u08d2\3\2\2\2\u08d3\u08d4\3\2\2\2\u08d4\u08d5\3\2\2\2\u08d5\u08d6"+
		"\7l\2\2\u08d6\u08d7\5\6\4\2\u08d7\u08d9\3\2\2\2\u08d8\u08a8\3\2\2\2\u08d8"+
		"\u08af\3\2\2\2\u08d8\u08b5\3\2\2\2\u08d8\u08bc\3\2\2\2\u08d8\u08c2\3\2"+
		"\2\2\u08d8\u08cd\3\2\2\2\u08d9\u0163\3\2\2\2\u08da\u08db\5\u0168\u00b5"+
		"\2\u08db\u08dd\7m\2\2\u08dc\u08de\5\u016a\u00b6\2\u08dd\u08dc\3\2\2\2"+
		"\u08dd\u08de\3\2\2\2\u08de\u08df\3\2\2\2\u08df\u08e0\7n\2\2\u08e0\u0165"+
		"\3\2\2\2\u08e1\u08f1\5\u0164\u00b3\2\u08e2\u08e3\5\u0158\u00ad\2\u08e3"+
		"\u08e5\7m\2\2\u08e4\u08e6\5\u016a\u00b6\2\u08e5\u08e4\3\2\2\2\u08e5\u08e6"+
		"\3\2\2\2\u08e6\u08e7\3\2\2\2\u08e7\u08e8\7n\2\2\u08e8\u08f1\3\2\2\2\u08e9"+
		"\u08ea\5\u015a\u00ae\2\u08ea\u08ec\7m\2\2\u08eb\u08ed\5\u016a\u00b6\2"+
		"\u08ec\u08eb\3\2\2\2\u08ec\u08ed\3\2\2\2\u08ed\u08ee\3\2\2\2\u08ee\u08ef"+
		"\7n\2\2\u08ef\u08f1\3\2\2\2\u08f0\u08e1\3\2\2\2\u08f0\u08e2\3\2\2\2\u08f0"+
		"\u08e9\3\2\2\2\u08f1\u0167\3\2\2\2\u08f2\u08f3\7\u008d\2\2\u08f3\u0169"+
		"\3\2\2\2\u08f4\u08f5\b\u00b6\1\2\u08f5\u08f7\5\u016c\u00b7\2\u08f6\u08f8"+
		"\7\u008c\2\2\u08f7\u08f6\3\2\2\2\u08f7\u08f8\3\2\2\2\u08f8\u0901\3\2\2"+
		"\2\u08f9\u08fa\f\3\2\2\u08fa\u08fb\7\u0083\2\2\u08fb\u08fd\5\u016c\u00b7"+
		"\2\u08fc\u08fe\7\u008c\2\2\u08fd\u08fc\3\2\2\2\u08fd\u08fe\3\2\2\2\u08fe"+
		"\u0900\3\2\2\2\u08ff\u08f9\3\2\2\2\u0900\u0903\3\2\2\2\u0901\u08ff\3\2"+
		"\2\2\u0901\u0902\3\2\2\2\u0902\u016b\3\2\2\2\u0903\u0901\3\2\2\2\u0904"+
		"\u0908\5\u0104\u0083\2\u0905\u0908\5`\61\2\u0906\u0908\5\6\4\2\u0907\u0904"+
		"\3\2\2\2\u0907\u0905\3\2\2\2\u0907\u0906\3\2\2\2\u0908\u016d\3\2\2\2\u0909"+
		"\u090a\7O\2\2\u090a\u090b\5\f\7\2\u090b\u090c\7\u008d\2\2\u090c\u0915"+
		"\3\2\2\2\u090d\u090e\7O\2\2\u090e\u0910\5\f\7\2\u090f\u0911\7G\2\2\u0910"+
		"\u090f\3\2\2\2\u0910\u0911\3\2\2\2\u0911\u0912\3\2\2\2\u0912\u0913\5\u0164"+
		"\u00b3\2\u0913\u0915\3\2\2\2\u0914\u0909\3\2\2\2\u0914\u090d\3\2\2\2\u0915"+
		"\u016f\3\2\2\2\u0916\u0918\7\'\2\2\u0917\u0916\3\2\2\2\u0917\u0918\3\2"+
		"\2\2\u0918\u0919\3\2\2\2\u0919\u091a\7G\2\2\u091a\u091b\5~@\2\u091b\u0171"+
		"\3\2\2\2\u091c\u091d\7G\2\2\u091d\u091e\7m\2\2\u091e\u091f\7n\2\2\u091f"+
		"\u0920\5~@\2\u0920\u0173\3\2\2\2\u0921\u0922\7L\2\2\u0922\u0923\5h\65"+
		"\2\u0923\u0924\5\u0178\u00bd\2\u0924\u0175\3\2\2\2\u0925\u0927\7L\2\2"+
		"\u0926\u0928\5\u0150\u00a9\2\u0927\u0926\3\2\2\2\u0927\u0928\3\2\2\2\u0928"+
		"\u0929\3\2\2\2\u0929\u092a\5h\65\2\u092a\u092b\5\u0178\u00bd\2\u092b\u0177"+
		"\3\2\2\2\u092c\u092e\5\u017a\u00be\2\u092d\u092f\5\u0178\u00bd\2\u092e"+
		"\u092d\3\2\2\2\u092e\u092f\3\2\2\2\u092f\u0179\3\2\2\2\u0930\u0931\7\22"+
		"\2\2\u0931\u0932\7\\\2\2\u0932\u0933\5\u017c\u00bf\2\u0933\u0934\7]\2"+
		"\2\u0934\u0935\5h\65\2\u0935\u017b\3\2\2\2\u0936\u0938\5\u00d6l\2\u0937"+
		"\u0936\3\2\2\2\u0937\u0938\3\2\2\2\u0938\u0939\3\2\2\2\u0939\u093a\5\u009a"+
		"N\2\u093a\u093b\5\u00f0y\2\u093b\u0945\3\2\2\2\u093c\u093e\5\u00d6l\2"+
		"\u093d\u093c\3\2\2\2\u093d\u093e\3\2\2\2\u093e\u093f\3\2\2\2\u093f\u0941"+
		"\5\u009aN\2\u0940\u0942\5\u0106\u0084\2\u0941\u0940\3\2\2\2\u0941\u0942"+
		"\3\2\2\2\u0942\u0945\3\2\2\2\u0943\u0945\7\u008c\2\2\u0944\u0937\3\2\2"+
		"\2\u0944\u093d\3\2\2\2\u0944\u0943\3\2\2\2\u0945\u017d\3\2\2\2\u0946\u0948"+
		"\7J\2\2\u0947\u0949\5Z.\2\u0948\u0947\3\2\2\2\u0948\u0949\3\2\2\2\u0949"+
		"\u017f\3\2\2\2\u094a\u094d\5\u0182\u00c2\2\u094b\u094d\5\u0186\u00c4\2"+
		"\u094c\u094a\3\2\2\2\u094c\u094b\3\2\2\2\u094d\u0181\3\2\2\2\u094e\u094f"+
		"\7J\2\2\u094f\u0951\7\\\2\2\u0950\u0952\5\u0184\u00c3\2\u0951\u0950\3"+
		"\2\2\2\u0951\u0952\3\2\2\2\u0952\u0953\3\2\2\2\u0953\u0954\7]\2\2\u0954"+
		"\u0183\3\2\2\2\u0955\u0956\b\u00c3\1\2\u0956\u0958\5\u0104\u0083\2\u0957"+
		"\u0959\7\u008c\2\2\u0958\u0957\3\2\2\2\u0958\u0959\3\2\2\2\u0959\u0962"+
		"\3\2\2\2\u095a\u095b\f\3\2\2\u095b\u095c\7\u0083\2\2\u095c\u095e\5\u0104"+
		"\u0083\2\u095d\u095f\7\u008c\2\2\u095e\u095d\3\2\2\2\u095e\u095f\3\2\2"+
		"\2\u095f\u0961\3\2\2\2\u0960\u095a\3\2\2\2\u0961\u0964\3\2\2\2\u0962\u0960"+
		"\3\2\2\2\u0962\u0963\3\2\2\2\u0963\u0185\3\2\2\2\u0964\u0962\3\2\2\2\u0965"+
		"\u0966\7\65\2\2\u0966\u0967\7\\\2\2\u0967\u0968\5`\61\2\u0968\u0969\7"+
		"]\2\2\u0969\u096c\3\2\2\2\u096a\u096c\7\65\2\2\u096b\u0965\3\2\2\2\u096b"+
		"\u096a\3\2\2\2\u096c\u0187\3\2\2\2\u096d\u09a1\7\64\2\2\u096e\u09a1\7"+
		"\37\2\2\u096f\u0970\7\64\2\2\u0970\u0971\7^\2\2\u0971\u09a1\7_\2\2\u0972"+
		"\u0973\7\37\2\2\u0973\u0974\7^\2\2\u0974\u09a1\7_\2\2\u0975\u09a1\7b\2"+
		"\2\u0976\u09a1\7c\2\2\u0977\u09a1\7d\2\2\u0978\u09a1\7e\2\2\u0979\u09a1"+
		"\7f\2\2\u097a\u09a1\7g\2\2\u097b\u09a1\7h\2\2\u097c\u09a1\7i\2\2\u097d"+
		"\u09a1\7j\2\2\u097e\u09a1\7\3\2\2\u097f\u09a1\7\4\2\2\u0980\u09a1\7l\2"+
		"\2\u0981\u09a1\7m\2\2\u0982\u09a1\7n\2\2\u0983\u09a1\7o\2\2\u0984\u09a1"+
		"\7p\2\2\u0985\u09a1\7q\2\2\u0986\u09a1\7r\2\2\u0987\u09a1\7s\2\2\u0988"+
		"\u09a1\7t\2\2\u0989\u09a1\7u\2\2\u098a\u09a1\7v\2\2\u098b\u09a1\7w\2\2"+
		"\u098c\u09a1\7x\2\2\u098d\u09a1\7z\2\2\u098e\u09a1\7y\2\2\u098f\u09a1"+
		"\7{\2\2\u0990\u09a1\7|\2\2\u0991\u09a1\7}\2\2\u0992\u09a1\7~\2\2\u0993"+
		"\u09a1\7\5\2\2\u0994\u09a1\7\6\2\2\u0995\u09a1\7\7\2\2\u0996\u09a1\7\b"+
		"\2\2\u0997\u09a1\7\u0081\2\2\u0998\u09a1\7\u0082\2\2\u0999\u09a1\7\u0083"+
		"\2\2\u099a\u09a1\7\u0084\2\2\u099b\u09a1\7\u0085\2\2\u099c\u099d\7\\\2"+
		"\2";
	private static final String _serializedATNSegment1 =
		"\u099d\u09a1\7]\2\2\u099e\u099f\7^\2\2\u099f\u09a1\7_\2\2\u09a0\u096d"+
		"\3\2\2\2\u09a0\u096e\3\2\2\2\u09a0\u096f\3\2\2\2\u09a0\u0972\3\2\2\2\u09a0"+
		"\u0975\3\2\2\2\u09a0\u0976\3\2\2\2\u09a0\u0977\3\2\2\2\u09a0\u0978\3\2"+
		"\2\2\u09a0\u0979\3\2\2\2\u09a0\u097a\3\2\2\2\u09a0\u097b\3\2\2\2\u09a0"+
		"\u097c\3\2\2\2\u09a0\u097d\3\2\2\2\u09a0\u097e\3\2\2\2\u09a0\u097f\3\2"+
		"\2\2\u09a0\u0980\3\2\2\2\u09a0\u0981\3\2\2\2\u09a0\u0982\3\2\2\2\u09a0"+
		"\u0983\3\2\2\2\u09a0\u0984\3\2\2\2\u09a0\u0985\3\2\2\2\u09a0\u0986\3\2"+
		"\2\2\u09a0\u0987\3\2\2\2\u09a0\u0988\3\2\2\2\u09a0\u0989\3\2\2\2\u09a0"+
		"\u098a\3\2\2\2\u09a0\u098b\3\2\2\2\u09a0\u098c\3\2\2\2\u09a0\u098d\3\2"+
		"\2\2\u09a0\u098e\3\2\2\2\u09a0\u098f\3\2\2\2\u09a0\u0990\3\2\2\2\u09a0"+
		"\u0991\3\2\2\2\u09a0\u0992\3\2\2\2\u09a0\u0993\3\2\2\2\u09a0\u0994\3\2"+
		"\2\2\u09a0\u0995\3\2\2\2\u09a0\u0996\3\2\2\2\u09a0\u0997\3\2\2\2\u09a0"+
		"\u0998\3\2\2\2\u09a0\u0999\3\2\2\2\u09a0\u099a\3\2\2\2\u09a0\u099b\3\2"+
		"\2\2\u09a0\u099c\3\2\2\2\u09a0\u099e\3\2\2\2\u09a1\u0189\3\2\2\2\u09a2"+
		"\u09ac\7\u008e\2\2\u09a3\u09ac\7\u0096\2\2\u09a4\u09ac\7\u0097\2\2\u09a5"+
		"\u09ac\7\u0098\2\2\u09a6\u09ac\7\u0091\2\2\u09a7\u09ac\7\u0092\2\2\u09a8"+
		"\u09ac\5\u018c\u00c7\2\u09a9\u09ac\5\u018e\u00c8\2\u09aa\u09ac\5\u0190"+
		"\u00c9\2\u09ab\u09a2\3\2\2\2\u09ab\u09a3\3\2\2\2\u09ab\u09a4\3\2\2\2\u09ab"+
		"\u09a5\3\2\2\2\u09ab\u09a6\3\2\2\2\u09ab\u09a7\3\2\2\2\u09ab\u09a8\3\2"+
		"\2\2\u09ab\u09a9\3\2\2\2\u09ab\u09aa\3\2\2\2\u09ac\u018b\3\2\2\2\u09ad"+
		"\u09ae\t\16\2\2\u09ae\u018d\3\2\2\2\u09af\u09b0\7\66\2\2\u09b0\u018f\3"+
		"\2\2\2\u09b1\u09b2\t\17\2\2\u09b2\u0191\3\2\2\2\u013e\u0193\u019f\u01a3"+
		"\u01ae\u01b2\u01c1\u01c8\u01cd\u01cf\u01d4\u01da\u01e4\u01eb\u01f1\u01f5"+
		"\u01fa\u0200\u0207\u020d\u0210\u0213\u0216\u021d\u0224\u0258\u0267\u026d"+
		"\u0273\u0280\u0282\u028c\u029b\u02a1\u02bf\u02c4\u02c8\u02cc\u02cf\u02d3"+
		"\u02d9\u02db\u02e3\u02e7\u02ea\u02f1\u02f8\u02fc\u0301\u0305\u0308\u030d"+
		"\u0313\u0320\u032b\u032d\u033c\u033e\u034a\u034c\u0358\u036c\u036e\u037a"+
		"\u037c\u0387\u0392\u039d\u03a9\u03ab\u03b7\u03b9\u03c3\u03cb\u03d7\u03de"+
		"\u03e2\u03e6\u03ea\u03ee\u03f3\u03f6\u03f9\u03ff\u0407\u040c\u040f\u0415"+
		"\u0420\u0437\u043b\u0443\u0449\u045d\u0461\u046e\u0472\u0475\u047c\u0484"+
		"\u0494\u049f\u04ab\u04b5\u04ba\u04c1\u04c4\u04c9\u04ce\u04e3\u04e7\u04ec"+
		"\u04f7\u04fd\u0501\u0506\u050a\u050f\u0512\u052d\u0533\u053e\u0542\u0545"+
		"\u054f\u0555\u0558\u055f\u0569\u056d\u0570\u0573\u0577\u057c\u057e\u0582"+
		"\u0586\u058f\u059c\u05a4\u05aa\u05b0\u05b4\u05b7\u05c0\u05c9\u05d1\u05dc"+
		"\u05e2\u05ed\u05f0\u05f5\u0604\u060a\u0613\u061d\u0623\u062b\u062f\u0633"+
		"\u0638\u063d\u0644\u0646\u064b\u064f\u065d\u0663\u0675\u0677\u0681\u0686"+
		"\u068d\u0693\u0698\u069e\u06a5\u06a9\u06ab\u06ad\u06b4\u06b7\u06ba\u06bd"+
		"\u06c2\u06c6\u06c9\u06cd\u06d1\u06d6\u06d9\u06db\u06df\u06e6\u06ec\u06f0"+
		"\u06f6\u06fb\u06fd\u0703\u0707\u070d\u0714\u0718\u071a\u071c\u0723\u072d"+
		"\u0731\u0733\u0735\u0739\u073c\u0742\u074c\u0750\u0756\u075e\u0762\u0765"+
		"\u0769\u076e\u0771\u0774\u0778\u077d\u0787\u078e\u0793\u0797\u079c\u07a2"+
		"\u07a6\u07ac\u07b2\u07b6\u07bb\u07c1\u07c5\u07c8\u07cc\u07cf\u07d1\u07d4"+
		"\u07de\u07e3\u07e5\u07e8\u07eb\u07ee\u07f7\u0801\u0806\u0809\u080d\u0810"+
		"\u0813\u0817\u0820\u082f\u0835\u0839\u083d\u0841\u0845\u0849\u084d\u0851"+
		"\u0854\u0858\u0863\u0867\u086e\u0872\u0877\u087c\u0883\u0887\u0891\u08a1"+
		"\u08a6\u08aa\u08ad\u08b1\u08b7\u08ba\u08be\u08c8\u08cb\u08d3\u08d8\u08dd"+
		"\u08e5\u08ec\u08f0\u08f7\u08fd\u0901\u0907\u0910\u0914\u0917\u0927\u092e"+
		"\u0937\u093d\u0941\u0944\u0948\u094c\u0951\u0958\u095e\u0962\u096b\u09a0"+
		"\u09ab";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}