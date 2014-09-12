// Generated from C:\Users\Lucas\git\CC2-Compilador-LA-C\CC2-Compilador-LA-C\src\grammars\capiroto.g4 by ANTLR 4.1
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class capirotoLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDENT=1, CADEIA=2, NUM_INT=3, NUM_REAL=4, COMENTARIO=5, WS=6, ALGORITMO=7, 
		FIM_ALGORITMO=8, DECLARE=9, CONSTANTE=10, COLON=11, TIPO=12, COMMA=13, 
		UP_HAT=14, DOT=15, LBRACKET=16, RBRACKET=17, LPARENTHESIS=18, RPARENTHESIS=19, 
		TWODOTS=20, MINUS=21, PLUS=22, MULT=23, DIV=24, ARROW=25, COMMERCIAL_E=26, 
		PERCENT=27, EQUALS=28, DIFFERENT=29, GREATERTHANEQ=30, LESSTHANEQ=31, 
		GREATERTHAN=32, LESSTHAN=33, NOT=34, LITERAL=35, INTEIRO=36, REAL=37, 
		LOGICO=38, OR=39, AND=40, VERDADEIRO=41, FALSO=42, REGISTRO=43, FIM_REGISTRO=44, 
		PROCEDIMENTO=45, FIM_PROCEDIMENTO=46, FUNCAO=47, FIM_FUNCAO=48, VAR=49, 
		LEIA=50, ESCREVA=51, SE=52, ENTAO=53, FIMSE=54, CASO=55, FIMCASO=56, SEJA=57, 
		PARA=58, ATE=59, FACA=60, FIMPARA=61, ENQUANTO=62, FIMENQUANTO=63, RETORNE=64, 
		SENAO=65;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"IDENT", "CADEIA", "NUM_INT", "NUM_REAL", "COMENTARIO", "WS", "'algoritmo'", 
		"'fim_algoritmo'", "'declare'", "'constante'", "':'", "'tipo'", "','", 
		"'^'", "'.'", "'['", "']'", "'('", "')'", "'..'", "'-'", "'+'", "'*'", 
		"'/'", "'<-'", "'&'", "'%'", "'='", "'<>'", "'>='", "'<='", "'>'", "'<'", 
		"'nao'", "'literal'", "'inteiro'", "'real'", "'logico'", "'ou'", "'e'", 
		"'verdadeiro'", "'falso'", "'registro'", "'fim_registro'", "'procedimento'", 
		"'fim_procedimento'", "'funcao'", "'fim_funcao'", "'var'", "'leia'", "'escreva'", 
		"'se'", "'entao'", "'fim_se'", "'caso'", "'fim_caso'", "'seja'", "'para'", 
		"'ate'", "'faca'", "'fim_para'", "'enquanto'", "'fim_enquanto'", "'retorne'", 
		"'senao'"
	};
	public static final String[] ruleNames = {
		"IDENT", "CADEIA", "NUM_INT", "NUM_REAL", "COMENTARIO", "WS", "ALGORITMO", 
		"FIM_ALGORITMO", "DECLARE", "CONSTANTE", "COLON", "TIPO", "COMMA", "UP_HAT", 
		"DOT", "LBRACKET", "RBRACKET", "LPARENTHESIS", "RPARENTHESIS", "TWODOTS", 
		"MINUS", "PLUS", "MULT", "DIV", "ARROW", "COMMERCIAL_E", "PERCENT", "EQUALS", 
		"DIFFERENT", "GREATERTHANEQ", "LESSTHANEQ", "GREATERTHAN", "LESSTHAN", 
		"NOT", "LITERAL", "INTEIRO", "REAL", "LOGICO", "OR", "AND", "VERDADEIRO", 
		"FALSO", "REGISTRO", "FIM_REGISTRO", "PROCEDIMENTO", "FIM_PROCEDIMENTO", 
		"FUNCAO", "FIM_FUNCAO", "VAR", "LEIA", "ESCREVA", "SE", "ENTAO", "FIMSE", 
		"CASO", "FIMCASO", "SEJA", "PARA", "ATE", "FACA", "FIMPARA", "ENQUANTO", 
		"FIMENQUANTO", "RETORNE", "SENAO"
	};


	public capirotoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "capiroto.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 4: COMENTARIO_action((RuleContext)_localctx, actionIndex); break;

		case 5: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2C\u01fe\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\7\2\u0088\n\2\f\2\16\2\u008b\13"+
		"\2\3\3\3\3\7\3\u008f\n\3\f\3\16\3\u0092\13\3\3\3\3\3\3\4\6\4\u0097\n\4"+
		"\r\4\16\4\u0098\3\5\6\5\u009c\n\5\r\5\16\5\u009d\3\5\3\5\6\5\u00a2\n\5"+
		"\r\5\16\5\u00a3\3\6\3\6\7\6\u00a8\n\6\f\6\16\6\u00ab\13\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		")\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\39\3"+
		"9\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3=\3"+
		"=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3"+
		"B\3B\3B\3\u00a9C\3\3\1\5\4\1\7\5\1\t\6\1\13\7\2\r\b\3\17\t\1\21\n\1\23"+
		"\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1"+
		"\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1"+
		";\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1["+
		"/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65\1i\66\1k\67\1m8\1o9\1q:\1s;\1u<"+
		"\1w=\1y>\1{?\1}@\1\177A\1\u0081B\1\u0083C\1\3\2\6\5\2C\\aac|\6\2\62;C"+
		"\\aac|\5\2\f\f$$^^\5\2\13\f\17\17\"\"\u0203\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2"+
		"s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\3\u0085\3\2\2\2\5\u008c\3\2\2"+
		"\2\7\u0096\3\2\2\2\t\u009b\3\2\2\2\13\u00a5\3\2\2\2\r\u00b0\3\2\2\2\17"+
		"\u00b3\3\2\2\2\21\u00bd\3\2\2\2\23\u00cb\3\2\2\2\25\u00d3\3\2\2\2\27\u00dd"+
		"\3\2\2\2\31\u00df\3\2\2\2\33\u00e4\3\2\2\2\35\u00e6\3\2\2\2\37\u00e8\3"+
		"\2\2\2!\u00ea\3\2\2\2#\u00ec\3\2\2\2%\u00ee\3\2\2\2\'\u00f0\3\2\2\2)\u00f2"+
		"\3\2\2\2+\u00f5\3\2\2\2-\u00f7\3\2\2\2/\u00f9\3\2\2\2\61\u00fb\3\2\2\2"+
		"\63\u00fd\3\2\2\2\65\u0100\3\2\2\2\67\u0102\3\2\2\29\u0104\3\2\2\2;\u0106"+
		"\3\2\2\2=\u0109\3\2\2\2?\u010c\3\2\2\2A\u010f\3\2\2\2C\u0111\3\2\2\2E"+
		"\u0113\3\2\2\2G\u0117\3\2\2\2I\u011f\3\2\2\2K\u0127\3\2\2\2M\u012c\3\2"+
		"\2\2O\u0133\3\2\2\2Q\u0136\3\2\2\2S\u0138\3\2\2\2U\u0143\3\2\2\2W\u0149"+
		"\3\2\2\2Y\u0152\3\2\2\2[\u015f\3\2\2\2]\u016c\3\2\2\2_\u017d\3\2\2\2a"+
		"\u0184\3\2\2\2c\u018f\3\2\2\2e\u0193\3\2\2\2g\u0198\3\2\2\2i\u01a0\3\2"+
		"\2\2k\u01a3\3\2\2\2m\u01a9\3\2\2\2o\u01b0\3\2\2\2q\u01b5\3\2\2\2s\u01be"+
		"\3\2\2\2u\u01c3\3\2\2\2w\u01c8\3\2\2\2y\u01cc\3\2\2\2{\u01d1\3\2\2\2}"+
		"\u01da\3\2\2\2\177\u01e3\3\2\2\2\u0081\u01f0\3\2\2\2\u0083\u01f8\3\2\2"+
		"\2\u0085\u0089\t\2\2\2\u0086\u0088\t\3\2\2\u0087\u0086\3\2\2\2\u0088\u008b"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\4\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u0090\7$\2\2\u008d\u008f\n\4\2\2\u008e\u008d\3\2"+
		"\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7$\2\2\u0094\6\3\2\2\2"+
		"\u0095\u0097\4\62;\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\b\3\2\2\2\u009a\u009c\4\62;\2\u009b"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\7\60\2\2\u00a0\u00a2\4\62;\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\n\3\2\2\2\u00a5\u00a9\7}\2\2\u00a6\u00a8\13\2\2\2\u00a7\u00a6"+
		"\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7\177\2\2\u00ad\u00ae\3"+
		"\2\2\2\u00ae\u00af\b\6\2\2\u00af\f\3\2\2\2\u00b0\u00b1\t\5\2\2\u00b1\u00b2"+
		"\b\7\3\2\u00b2\16\3\2\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7n\2\2\u00b5"+
		"\u00b6\7i\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7k\2\2"+
		"\u00b9\u00ba\7v\2\2\u00ba\u00bb\7o\2\2\u00bb\u00bc\7q\2\2\u00bc\20\3\2"+
		"\2\2\u00bd\u00be\7h\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7o\2\2\u00c0\u00c1"+
		"\7a\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7i\2\2\u00c4"+
		"\u00c5\7q\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7v\2\2"+
		"\u00c8\u00c9\7o\2\2\u00c9\u00ca\7q\2\2\u00ca\22\3\2\2\2\u00cb\u00cc\7"+
		"f\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0"+
		"\7c\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7g\2\2\u00d2\24\3\2\2\2\u00d3\u00d4"+
		"\7e\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7p\2\2\u00d6\u00d7\7u\2\2\u00d7"+
		"\u00d8\7v\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7v\2\2"+
		"\u00db\u00dc\7g\2\2\u00dc\26\3\2\2\2\u00dd\u00de\7<\2\2\u00de\30\3\2\2"+
		"\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7r\2\2\u00e2\u00e3"+
		"\7q\2\2\u00e3\32\3\2\2\2\u00e4\u00e5\7.\2\2\u00e5\34\3\2\2\2\u00e6\u00e7"+
		"\7`\2\2\u00e7\36\3\2\2\2\u00e8\u00e9\7\60\2\2\u00e9 \3\2\2\2\u00ea\u00eb"+
		"\7]\2\2\u00eb\"\3\2\2\2\u00ec\u00ed\7_\2\2\u00ed$\3\2\2\2\u00ee\u00ef"+
		"\7*\2\2\u00ef&\3\2\2\2\u00f0\u00f1\7+\2\2\u00f1(\3\2\2\2\u00f2\u00f3\7"+
		"\60\2\2\u00f3\u00f4\7\60\2\2\u00f4*\3\2\2\2\u00f5\u00f6\7/\2\2\u00f6,"+
		"\3\2\2\2\u00f7\u00f8\7-\2\2\u00f8.\3\2\2\2\u00f9\u00fa\7,\2\2\u00fa\60"+
		"\3\2\2\2\u00fb\u00fc\7\61\2\2\u00fc\62\3\2\2\2\u00fd\u00fe\7>\2\2\u00fe"+
		"\u00ff\7/\2\2\u00ff\64\3\2\2\2\u0100\u0101\7(\2\2\u0101\66\3\2\2\2\u0102"+
		"\u0103\7\'\2\2\u01038\3\2\2\2\u0104\u0105\7?\2\2\u0105:\3\2\2\2\u0106"+
		"\u0107\7>\2\2\u0107\u0108\7@\2\2\u0108<\3\2\2\2\u0109\u010a\7@\2\2\u010a"+
		"\u010b\7?\2\2\u010b>\3\2\2\2\u010c\u010d\7>\2\2\u010d\u010e\7?\2\2\u010e"+
		"@\3\2\2\2\u010f\u0110\7@\2\2\u0110B\3\2\2\2\u0111\u0112\7>\2\2\u0112D"+
		"\3\2\2\2\u0113\u0114\7p\2\2\u0114\u0115\7c\2\2\u0115\u0116\7q\2\2\u0116"+
		"F\3\2\2\2\u0117\u0118\7n\2\2\u0118\u0119\7k\2\2\u0119\u011a\7v\2\2\u011a"+
		"\u011b\7g\2\2\u011b\u011c\7t\2\2\u011c\u011d\7c\2\2\u011d\u011e\7n\2\2"+
		"\u011eH\3\2\2\2\u011f\u0120\7k\2\2\u0120\u0121\7p\2\2\u0121\u0122\7v\2"+
		"\2\u0122\u0123\7g\2\2\u0123\u0124\7k\2\2\u0124\u0125\7t\2\2\u0125\u0126"+
		"\7q\2\2\u0126J\3\2\2\2\u0127\u0128\7t\2\2\u0128\u0129\7g\2\2\u0129\u012a"+
		"\7c\2\2\u012a\u012b\7n\2\2\u012bL\3\2\2\2\u012c\u012d\7n\2\2\u012d\u012e"+
		"\7q\2\2\u012e\u012f\7i\2\2\u012f\u0130\7k\2\2\u0130\u0131\7e\2\2\u0131"+
		"\u0132\7q\2\2\u0132N\3\2\2\2\u0133\u0134\7q\2\2\u0134\u0135\7w\2\2\u0135"+
		"P\3\2\2\2\u0136\u0137\7g\2\2\u0137R\3\2\2\2\u0138\u0139\7x\2\2\u0139\u013a"+
		"\7g\2\2\u013a\u013b\7t\2\2\u013b\u013c\7f\2\2\u013c\u013d\7c\2\2\u013d"+
		"\u013e\7f\2\2\u013e\u013f\7g\2\2\u013f\u0140\7k\2\2\u0140\u0141\7t\2\2"+
		"\u0141\u0142\7q\2\2\u0142T\3\2\2\2\u0143\u0144\7h\2\2\u0144\u0145\7c\2"+
		"\2\u0145\u0146\7n\2\2\u0146\u0147\7u\2\2\u0147\u0148\7q\2\2\u0148V\3\2"+
		"\2\2\u0149\u014a\7t\2\2\u014a\u014b\7g\2\2\u014b\u014c\7i\2\2\u014c\u014d"+
		"\7k\2\2\u014d\u014e\7u\2\2\u014e\u014f\7v\2\2\u014f\u0150\7t\2\2\u0150"+
		"\u0151\7q\2\2\u0151X\3\2\2\2\u0152\u0153\7h\2\2\u0153\u0154\7k\2\2\u0154"+
		"\u0155\7o\2\2\u0155\u0156\7a\2\2\u0156\u0157\7t\2\2\u0157\u0158\7g\2\2"+
		"\u0158\u0159\7i\2\2\u0159\u015a\7k\2\2\u015a\u015b\7u\2\2\u015b\u015c"+
		"\7v\2\2\u015c\u015d\7t\2\2\u015d\u015e\7q\2\2\u015eZ\3\2\2\2\u015f\u0160"+
		"\7r\2\2\u0160\u0161\7t\2\2\u0161\u0162\7q\2\2\u0162\u0163\7e\2\2\u0163"+
		"\u0164\7g\2\2\u0164\u0165\7f\2\2\u0165\u0166\7k\2\2\u0166\u0167\7o\2\2"+
		"\u0167\u0168\7g\2\2\u0168\u0169\7p\2\2\u0169\u016a\7v\2\2\u016a\u016b"+
		"\7q\2\2\u016b\\\3\2\2\2\u016c\u016d\7h\2\2\u016d\u016e\7k\2\2\u016e\u016f"+
		"\7o\2\2\u016f\u0170\7a\2\2\u0170\u0171\7r\2\2\u0171\u0172\7t\2\2\u0172"+
		"\u0173\7q\2\2\u0173\u0174\7e\2\2\u0174\u0175\7g\2\2\u0175\u0176\7f\2\2"+
		"\u0176\u0177\7k\2\2\u0177\u0178\7o\2\2\u0178\u0179\7g\2\2\u0179\u017a"+
		"\7p\2\2\u017a\u017b\7v\2\2\u017b\u017c\7q\2\2\u017c^\3\2\2\2\u017d\u017e"+
		"\7h\2\2\u017e\u017f\7w\2\2\u017f\u0180\7p\2\2\u0180\u0181\7e\2\2\u0181"+
		"\u0182\7c\2\2\u0182\u0183\7q\2\2\u0183`\3\2\2\2\u0184\u0185\7h\2\2\u0185"+
		"\u0186\7k\2\2\u0186\u0187\7o\2\2\u0187\u0188\7a\2\2\u0188\u0189\7h\2\2"+
		"\u0189\u018a\7w\2\2\u018a\u018b\7p\2\2\u018b\u018c\7e\2\2\u018c\u018d"+
		"\7c\2\2\u018d\u018e\7q\2\2\u018eb\3\2\2\2\u018f\u0190\7x\2\2\u0190\u0191"+
		"\7c\2\2\u0191\u0192\7t\2\2\u0192d\3\2\2\2\u0193\u0194\7n\2\2\u0194\u0195"+
		"\7g\2\2\u0195\u0196\7k\2\2\u0196\u0197\7c\2\2\u0197f\3\2\2\2\u0198\u0199"+
		"\7g\2\2\u0199\u019a\7u\2\2\u019a\u019b\7e\2\2\u019b\u019c\7t\2\2\u019c"+
		"\u019d\7g\2\2\u019d\u019e\7x\2\2\u019e\u019f\7c\2\2\u019fh\3\2\2\2\u01a0"+
		"\u01a1\7u\2\2\u01a1\u01a2\7g\2\2\u01a2j\3\2\2\2\u01a3\u01a4\7g\2\2\u01a4"+
		"\u01a5\7p\2\2\u01a5\u01a6\7v\2\2\u01a6\u01a7\7c\2\2\u01a7\u01a8\7q\2\2"+
		"\u01a8l\3\2\2\2\u01a9\u01aa\7h\2\2\u01aa\u01ab\7k\2\2\u01ab\u01ac\7o\2"+
		"\2\u01ac\u01ad\7a\2\2\u01ad\u01ae\7u\2\2\u01ae\u01af\7g\2\2\u01afn\3\2"+
		"\2\2\u01b0\u01b1\7e\2\2\u01b1\u01b2\7c\2\2\u01b2\u01b3\7u\2\2\u01b3\u01b4"+
		"\7q\2\2\u01b4p\3\2\2\2\u01b5\u01b6\7h\2\2\u01b6\u01b7\7k\2\2\u01b7\u01b8"+
		"\7o\2\2\u01b8\u01b9\7a\2\2\u01b9\u01ba\7e\2\2\u01ba\u01bb\7c\2\2\u01bb"+
		"\u01bc\7u\2\2\u01bc\u01bd\7q\2\2\u01bdr\3\2\2\2\u01be\u01bf\7u\2\2\u01bf"+
		"\u01c0\7g\2\2\u01c0\u01c1\7l\2\2\u01c1\u01c2\7c\2\2\u01c2t\3\2\2\2\u01c3"+
		"\u01c4\7r\2\2\u01c4\u01c5\7c\2\2\u01c5\u01c6\7t\2\2\u01c6\u01c7\7c\2\2"+
		"\u01c7v\3\2\2\2\u01c8\u01c9\7c\2\2\u01c9\u01ca\7v\2\2\u01ca\u01cb\7g\2"+
		"\2\u01cbx\3\2\2\2\u01cc\u01cd\7h\2\2\u01cd\u01ce\7c\2\2\u01ce\u01cf\7"+
		"e\2\2\u01cf\u01d0\7c\2\2\u01d0z\3\2\2\2\u01d1\u01d2\7h\2\2\u01d2\u01d3"+
		"\7k\2\2\u01d3\u01d4\7o\2\2\u01d4\u01d5\7a\2\2\u01d5\u01d6\7r\2\2\u01d6"+
		"\u01d7\7c\2\2\u01d7\u01d8\7t\2\2\u01d8\u01d9\7c\2\2\u01d9|\3\2\2\2\u01da"+
		"\u01db\7g\2\2\u01db\u01dc\7p\2\2\u01dc\u01dd\7s\2\2\u01dd\u01de\7w\2\2"+
		"\u01de\u01df\7c\2\2\u01df\u01e0\7p\2\2\u01e0\u01e1\7v\2\2\u01e1\u01e2"+
		"\7q\2\2\u01e2~\3\2\2\2\u01e3\u01e4\7h\2\2\u01e4\u01e5\7k\2\2\u01e5\u01e6"+
		"\7o\2\2\u01e6\u01e7\7a\2\2\u01e7\u01e8\7g\2\2\u01e8\u01e9\7p\2\2\u01e9"+
		"\u01ea\7s\2\2\u01ea\u01eb\7w\2\2\u01eb\u01ec\7c\2\2\u01ec\u01ed\7p\2\2"+
		"\u01ed\u01ee\7v\2\2\u01ee\u01ef\7q\2\2\u01ef\u0080\3\2\2\2\u01f0\u01f1"+
		"\7t\2\2\u01f1\u01f2\7g\2\2\u01f2\u01f3\7v\2\2\u01f3\u01f4\7q\2\2\u01f4"+
		"\u01f5\7t\2\2\u01f5\u01f6\7p\2\2\u01f6\u01f7\7g\2\2\u01f7\u0082\3\2\2"+
		"\2\u01f8\u01f9\7u\2\2\u01f9\u01fa\7g\2\2\u01fa\u01fb\7p\2\2\u01fb\u01fc"+
		"\7c\2\2\u01fc\u01fd\7q\2\2\u01fd\u0084\3\2\2\2\t\2\u0089\u0090\u0098\u009d"+
		"\u00a3\u00a9";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}