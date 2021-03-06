// Generated from C:\Users\Lucas\git\CC2-Compilador-LA-C\CC2-Compilador-LA-C\src\grammars\LAGrammar1_CodeGen.g4 by ANTLR 4.1
package antlr;

  import Semantic.TokenSymbol;
  import Semantic.TokenSymbolTable;
  import static Semantic.SemanticUtil.*;
  import CodeGeneration.Generator;
  import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LAGrammar1_CodeGenLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALGORITMO=1, FIM_ALGORITMO=2, DECLARE=3, CONSTANTE=4, COLON=5, TIPO=6, 
		COMMA=7, UP_HAT=8, DOT=9, LBRACKET=10, RBRACKET=11, LPARENTHESIS=12, RPARENTHESIS=13, 
		TWODOTS=14, ARROW=15, MINUS=16, PLUS=17, MULT=18, DIV=19, COMMERCIAL_E=20, 
		PERCENT=21, EQUALS=22, DIFFERENT=23, GREATERTHANEQ=24, LESSTHANEQ=25, 
		GREATERTHAN=26, LESSTHAN=27, NOT=28, LITERAL=29, INTEIRO=30, REAL=31, 
		LOGICO=32, OR=33, AND=34, VERDADEIRO=35, FALSO=36, REGISTRO=37, FIM_REGISTRO=38, 
		PROCEDIMENTO=39, FIM_PROCEDIMENTO=40, FUNCAO=41, FIM_FUNCAO=42, VAR=43, 
		LEIA=44, ESCREVA=45, SE=46, ENTAO=47, FIMSE=48, CASO=49, FIMCASO=50, SEJA=51, 
		PARA=52, ATE=53, FACA=54, FIMPARA=55, ENQUANTO=56, FIMENQUANTO=57, RETORNE=58, 
		SENAO=59, CADEIA=60, NUM_INT=61, NUM_REAL=62, IDENT=63, COMMENT=64, WSNL=65;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'algoritmo'", "'fim_algoritmo'", "'declare'", "'constante'", "':'", "'tipo'", 
		"','", "'^'", "'.'", "'['", "']'", "'('", "')'", "'..'", "'<-'", "'-'", 
		"'+'", "'*'", "'/'", "'&'", "'%'", "'='", "'<>'", "'>='", "'<='", "'>'", 
		"'<'", "'nao'", "'literal'", "'inteiro'", "'real'", "'logico'", "'ou'", 
		"'e'", "'verdadeiro'", "'falso'", "'registro'", "'fim_registro'", "'procedimento'", 
		"'fim_procedimento'", "'funcao'", "'fim_funcao'", "'var'", "'leia'", "'escreva'", 
		"'se'", "'entao'", "'fim_se'", "'caso'", "'fim_caso'", "'seja'", "'para'", 
		"'ate'", "'faca'", "'fim_para'", "'enquanto'", "'fim_enquanto'", "'retorne'", 
		"'senao'", "CADEIA", "NUM_INT", "NUM_REAL", "IDENT", "COMMENT", "WSNL"
	};
	public static final String[] ruleNames = {
		"ALGORITMO", "FIM_ALGORITMO", "DECLARE", "CONSTANTE", "COLON", "TIPO", 
		"COMMA", "UP_HAT", "DOT", "LBRACKET", "RBRACKET", "LPARENTHESIS", "RPARENTHESIS", 
		"TWODOTS", "ARROW", "MINUS", "PLUS", "MULT", "DIV", "COMMERCIAL_E", "PERCENT", 
		"EQUALS", "DIFFERENT", "GREATERTHANEQ", "LESSTHANEQ", "GREATERTHAN", "LESSTHAN", 
		"NOT", "LITERAL", "INTEIRO", "REAL", "LOGICO", "OR", "AND", "VERDADEIRO", 
		"FALSO", "REGISTRO", "FIM_REGISTRO", "PROCEDIMENTO", "FIM_PROCEDIMENTO", 
		"FUNCAO", "FIM_FUNCAO", "VAR", "LEIA", "ESCREVA", "SE", "ENTAO", "FIMSE", 
		"CASO", "FIMCASO", "SEJA", "PARA", "ATE", "FACA", "FIMPARA", "ENQUANTO", 
		"FIMENQUANTO", "RETORNE", "SENAO", "NameChar", "NameStartChar", "CADEIA", 
		"NUM_INT", "NUM_REAL", "IDENT", "COMMENT", "WSNL"
	};


	public LAGrammar1_CodeGenLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LAGrammar1_CodeGen.g4"; }

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
		case 65: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 66: WSNL_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WSNL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: _channel = HIDDEN;  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = HIDDEN;  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2C\u020f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-"+
		"\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\3"+
		"8\38\38\38\38\38\38\38\39\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\5"+
		"=\u01d7\n=\3>\5>\u01da\n>\3?\3?\3?\3?\7?\u01e0\n?\f?\16?\u01e3\13?\3?"+
		"\3?\3@\6@\u01e8\n@\r@\16@\u01e9\3A\6A\u01ed\nA\rA\16A\u01ee\3A\3A\6A\u01f3"+
		"\nA\rA\16A\u01f4\3B\3B\7B\u01f9\nB\fB\16B\u01fc\13B\3C\3C\7C\u0200\nC"+
		"\fC\16C\u0203\13C\3C\3C\3C\3C\3D\6D\u020a\nD\rD\16D\u020b\3D\3D\3\u0201"+
		"E\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27"+
		"\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27"+
		"\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\""+
		"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62"+
		"\1c\63\1e\64\1g\65\1i\66\1k\67\1m8\1o9\1q:\1s;\1u<\1w=\1y\2\1{\2\1}>\1"+
		"\177?\1\u0081@\1\u0083A\1\u0085B\2\u0087C\3\3\2\6\4\2\62;aa\5\2C\\aac"+
		"|\5\2\f\f\17\17$$\5\2\13\f\17\17\"\"\u0215\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s"+
		"\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\3\u0089\3\2\2\2\5\u0093"+
		"\3\2\2\2\7\u00a1\3\2\2\2\t\u00a9\3\2\2\2\13\u00b3\3\2\2\2\r\u00b5\3\2"+
		"\2\2\17\u00ba\3\2\2\2\21\u00bc\3\2\2\2\23\u00be\3\2\2\2\25\u00c0\3\2\2"+
		"\2\27\u00c2\3\2\2\2\31\u00c4\3\2\2\2\33\u00c6\3\2\2\2\35\u00c8\3\2\2\2"+
		"\37\u00cb\3\2\2\2!\u00ce\3\2\2\2#\u00d0\3\2\2\2%\u00d2\3\2\2\2\'\u00d4"+
		"\3\2\2\2)\u00d6\3\2\2\2+\u00d8\3\2\2\2-\u00da\3\2\2\2/\u00dc\3\2\2\2\61"+
		"\u00df\3\2\2\2\63\u00e2\3\2\2\2\65\u00e5\3\2\2\2\67\u00e7\3\2\2\29\u00e9"+
		"\3\2\2\2;\u00ed\3\2\2\2=\u00f5\3\2\2\2?\u00fd\3\2\2\2A\u0102\3\2\2\2C"+
		"\u0109\3\2\2\2E\u010c\3\2\2\2G\u010e\3\2\2\2I\u0119\3\2\2\2K\u011f\3\2"+
		"\2\2M\u0128\3\2\2\2O\u0135\3\2\2\2Q\u0142\3\2\2\2S\u0153\3\2\2\2U\u015a"+
		"\3\2\2\2W\u0165\3\2\2\2Y\u0169\3\2\2\2[\u016e\3\2\2\2]\u0176\3\2\2\2_"+
		"\u0179\3\2\2\2a\u017f\3\2\2\2c\u0186\3\2\2\2e\u018b\3\2\2\2g\u0194\3\2"+
		"\2\2i\u0199\3\2\2\2k\u019e\3\2\2\2m\u01a2\3\2\2\2o\u01a7\3\2\2\2q\u01b0"+
		"\3\2\2\2s\u01b9\3\2\2\2u\u01c6\3\2\2\2w\u01ce\3\2\2\2y\u01d6\3\2\2\2{"+
		"\u01d9\3\2\2\2}\u01db\3\2\2\2\177\u01e7\3\2\2\2\u0081\u01ec\3\2\2\2\u0083"+
		"\u01f6\3\2\2\2\u0085\u01fd\3\2\2\2\u0087\u0209\3\2\2\2\u0089\u008a\7c"+
		"\2\2\u008a\u008b\7n\2\2\u008b\u008c\7i\2\2\u008c\u008d\7q\2\2\u008d\u008e"+
		"\7t\2\2\u008e\u008f\7k\2\2\u008f\u0090\7v\2\2\u0090\u0091\7o\2\2\u0091"+
		"\u0092\7q\2\2\u0092\4\3\2\2\2\u0093\u0094\7h\2\2\u0094\u0095\7k\2\2\u0095"+
		"\u0096\7o\2\2\u0096\u0097\7a\2\2\u0097\u0098\7c\2\2\u0098\u0099\7n\2\2"+
		"\u0099\u009a\7i\2\2\u009a\u009b\7q\2\2\u009b\u009c\7t\2\2\u009c\u009d"+
		"\7k\2\2\u009d\u009e\7v\2\2\u009e\u009f\7o\2\2\u009f\u00a0\7q\2\2\u00a0"+
		"\6\3\2\2\2\u00a1\u00a2\7f\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7e\2\2\u00a4"+
		"\u00a5\7n\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7g\2\2"+
		"\u00a8\b\3\2\2\2\u00a9\u00aa\7e\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7p"+
		"\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7c\2\2\u00af\u00b0"+
		"\7p\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7g\2\2\u00b2\n\3\2\2\2\u00b3\u00b4"+
		"\7<\2\2\u00b4\f\3\2\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8"+
		"\7r\2\2\u00b8\u00b9\7q\2\2\u00b9\16\3\2\2\2\u00ba\u00bb\7.\2\2\u00bb\20"+
		"\3\2\2\2\u00bc\u00bd\7`\2\2\u00bd\22\3\2\2\2\u00be\u00bf\7\60\2\2\u00bf"+
		"\24\3\2\2\2\u00c0\u00c1\7]\2\2\u00c1\26\3\2\2\2\u00c2\u00c3\7_\2\2\u00c3"+
		"\30\3\2\2\2\u00c4\u00c5\7*\2\2\u00c5\32\3\2\2\2\u00c6\u00c7\7+\2\2\u00c7"+
		"\34\3\2\2\2\u00c8\u00c9\7\60\2\2\u00c9\u00ca\7\60\2\2\u00ca\36\3\2\2\2"+
		"\u00cb\u00cc\7>\2\2\u00cc\u00cd\7/\2\2\u00cd \3\2\2\2\u00ce\u00cf\7/\2"+
		"\2\u00cf\"\3\2\2\2\u00d0\u00d1\7-\2\2\u00d1$\3\2\2\2\u00d2\u00d3\7,\2"+
		"\2\u00d3&\3\2\2\2\u00d4\u00d5\7\61\2\2\u00d5(\3\2\2\2\u00d6\u00d7\7(\2"+
		"\2\u00d7*\3\2\2\2\u00d8\u00d9\7\'\2\2\u00d9,\3\2\2\2\u00da\u00db\7?\2"+
		"\2\u00db.\3\2\2\2\u00dc\u00dd\7>\2\2\u00dd\u00de\7@\2\2\u00de\60\3\2\2"+
		"\2\u00df\u00e0\7@\2\2\u00e0\u00e1\7?\2\2\u00e1\62\3\2\2\2\u00e2\u00e3"+
		"\7>\2\2\u00e3\u00e4\7?\2\2\u00e4\64\3\2\2\2\u00e5\u00e6\7@\2\2\u00e6\66"+
		"\3\2\2\2\u00e7\u00e8\7>\2\2\u00e88\3\2\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb"+
		"\7c\2\2\u00eb\u00ec\7q\2\2\u00ec:\3\2\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef"+
		"\7k\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7t\2\2\u00f2"+
		"\u00f3\7c\2\2\u00f3\u00f4\7n\2\2\u00f4<\3\2\2\2\u00f5\u00f6\7k\2\2\u00f6"+
		"\u00f7\7p\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7k\2\2"+
		"\u00fa\u00fb\7t\2\2\u00fb\u00fc\7q\2\2\u00fc>\3\2\2\2\u00fd\u00fe\7t\2"+
		"\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7n\2\2\u0101@\3\2"+
		"\2\2\u0102\u0103\7n\2\2\u0103\u0104\7q\2\2\u0104\u0105\7i\2\2\u0105\u0106"+
		"\7k\2\2\u0106\u0107\7e\2\2\u0107\u0108\7q\2\2\u0108B\3\2\2\2\u0109\u010a"+
		"\7q\2\2\u010a\u010b\7w\2\2\u010bD\3\2\2\2\u010c\u010d\7g\2\2\u010dF\3"+
		"\2\2\2\u010e\u010f\7x\2\2\u010f\u0110\7g\2\2\u0110\u0111\7t\2\2\u0111"+
		"\u0112\7f\2\2\u0112\u0113\7c\2\2\u0113\u0114\7f\2\2\u0114\u0115\7g\2\2"+
		"\u0115\u0116\7k\2\2\u0116\u0117\7t\2\2\u0117\u0118\7q\2\2\u0118H\3\2\2"+
		"\2\u0119\u011a\7h\2\2\u011a\u011b\7c\2\2\u011b\u011c\7n\2\2\u011c\u011d"+
		"\7u\2\2\u011d\u011e\7q\2\2\u011eJ\3\2\2\2\u011f\u0120\7t\2\2\u0120\u0121"+
		"\7g\2\2\u0121\u0122\7i\2\2\u0122\u0123\7k\2\2\u0123\u0124\7u\2\2\u0124"+
		"\u0125\7v\2\2\u0125\u0126\7t\2\2\u0126\u0127\7q\2\2\u0127L\3\2\2\2\u0128"+
		"\u0129\7h\2\2\u0129\u012a\7k\2\2\u012a\u012b\7o\2\2\u012b\u012c\7a\2\2"+
		"\u012c\u012d\7t\2\2\u012d\u012e\7g\2\2\u012e\u012f\7i\2\2\u012f\u0130"+
		"\7k\2\2\u0130\u0131\7u\2\2\u0131\u0132\7v\2\2\u0132\u0133\7t\2\2\u0133"+
		"\u0134\7q\2\2\u0134N\3\2\2\2\u0135\u0136\7r\2\2\u0136\u0137\7t\2\2\u0137"+
		"\u0138\7q\2\2\u0138\u0139\7e\2\2\u0139\u013a\7g\2\2\u013a\u013b\7f\2\2"+
		"\u013b\u013c\7k\2\2\u013c\u013d\7o\2\2\u013d\u013e\7g\2\2\u013e\u013f"+
		"\7p\2\2\u013f\u0140\7v\2\2\u0140\u0141\7q\2\2\u0141P\3\2\2\2\u0142\u0143"+
		"\7h\2\2\u0143\u0144\7k\2\2\u0144\u0145\7o\2\2\u0145\u0146\7a\2\2\u0146"+
		"\u0147\7r\2\2\u0147\u0148\7t\2\2\u0148\u0149\7q\2\2\u0149\u014a\7e\2\2"+
		"\u014a\u014b\7g\2\2\u014b\u014c\7f\2\2\u014c\u014d\7k\2\2\u014d\u014e"+
		"\7o\2\2\u014e\u014f\7g\2\2\u014f\u0150\7p\2\2\u0150\u0151\7v\2\2\u0151"+
		"\u0152\7q\2\2\u0152R\3\2\2\2\u0153\u0154\7h\2\2\u0154\u0155\7w\2\2\u0155"+
		"\u0156\7p\2\2\u0156\u0157\7e\2\2\u0157\u0158\7c\2\2\u0158\u0159\7q\2\2"+
		"\u0159T\3\2\2\2\u015a\u015b\7h\2\2\u015b\u015c\7k\2\2\u015c\u015d\7o\2"+
		"\2\u015d\u015e\7a\2\2\u015e\u015f\7h\2\2\u015f\u0160\7w\2\2\u0160\u0161"+
		"\7p\2\2\u0161\u0162\7e\2\2\u0162\u0163\7c\2\2\u0163\u0164\7q\2\2\u0164"+
		"V\3\2\2\2\u0165\u0166\7x\2\2\u0166\u0167\7c\2\2\u0167\u0168\7t\2\2\u0168"+
		"X\3\2\2\2\u0169\u016a\7n\2\2\u016a\u016b\7g\2\2\u016b\u016c\7k\2\2\u016c"+
		"\u016d\7c\2\2\u016dZ\3\2\2\2\u016e\u016f\7g\2\2\u016f\u0170\7u\2\2\u0170"+
		"\u0171\7e\2\2\u0171\u0172\7t\2\2\u0172\u0173\7g\2\2\u0173\u0174\7x\2\2"+
		"\u0174\u0175\7c\2\2\u0175\\\3\2\2\2\u0176\u0177\7u\2\2\u0177\u0178\7g"+
		"\2\2\u0178^\3\2\2\2\u0179\u017a\7g\2\2\u017a\u017b\7p\2\2\u017b\u017c"+
		"\7v\2\2\u017c\u017d\7c\2\2\u017d\u017e\7q\2\2\u017e`\3\2\2\2\u017f\u0180"+
		"\7h\2\2\u0180\u0181\7k\2\2\u0181\u0182\7o\2\2\u0182\u0183\7a\2\2\u0183"+
		"\u0184\7u\2\2\u0184\u0185\7g\2\2\u0185b\3\2\2\2\u0186\u0187\7e\2\2\u0187"+
		"\u0188\7c\2\2\u0188\u0189\7u\2\2\u0189\u018a\7q\2\2\u018ad\3\2\2\2\u018b"+
		"\u018c\7h\2\2\u018c\u018d\7k\2\2\u018d\u018e\7o\2\2\u018e\u018f\7a\2\2"+
		"\u018f\u0190\7e\2\2\u0190\u0191\7c\2\2\u0191\u0192\7u\2\2\u0192\u0193"+
		"\7q\2\2\u0193f\3\2\2\2\u0194\u0195\7u\2\2\u0195\u0196\7g\2\2\u0196\u0197"+
		"\7l\2\2\u0197\u0198\7c\2\2\u0198h\3\2\2\2\u0199\u019a\7r\2\2\u019a\u019b"+
		"\7c\2\2\u019b\u019c\7t\2\2\u019c\u019d\7c\2\2\u019dj\3\2\2\2\u019e\u019f"+
		"\7c\2\2\u019f\u01a0\7v\2\2\u01a0\u01a1\7g\2\2\u01a1l\3\2\2\2\u01a2\u01a3"+
		"\7h\2\2\u01a3\u01a4\7c\2\2\u01a4\u01a5\7e\2\2\u01a5\u01a6\7c\2\2\u01a6"+
		"n\3\2\2\2\u01a7\u01a8\7h\2\2\u01a8\u01a9\7k\2\2\u01a9\u01aa\7o\2\2\u01aa"+
		"\u01ab\7a\2\2\u01ab\u01ac\7r\2\2\u01ac\u01ad\7c\2\2\u01ad\u01ae\7t\2\2"+
		"\u01ae\u01af\7c\2\2\u01afp\3\2\2\2\u01b0\u01b1\7g\2\2\u01b1\u01b2\7p\2"+
		"\2\u01b2\u01b3\7s\2\2\u01b3\u01b4\7w\2\2\u01b4\u01b5\7c\2\2\u01b5\u01b6"+
		"\7p\2\2\u01b6\u01b7\7v\2\2\u01b7\u01b8\7q\2\2\u01b8r\3\2\2\2\u01b9\u01ba"+
		"\7h\2\2\u01ba\u01bb\7k\2\2\u01bb\u01bc\7o\2\2\u01bc\u01bd\7a\2\2\u01bd"+
		"\u01be\7g\2\2\u01be\u01bf\7p\2\2\u01bf\u01c0\7s\2\2\u01c0\u01c1\7w\2\2"+
		"\u01c1\u01c2\7c\2\2\u01c2\u01c3\7p\2\2\u01c3\u01c4\7v\2\2\u01c4\u01c5"+
		"\7q\2\2\u01c5t\3\2\2\2\u01c6\u01c7\7t\2\2\u01c7\u01c8\7g\2\2\u01c8\u01c9"+
		"\7v\2\2\u01c9\u01ca\7q\2\2\u01ca\u01cb\7t\2\2\u01cb\u01cc\7p\2\2\u01cc"+
		"\u01cd\7g\2\2\u01cdv\3\2\2\2\u01ce\u01cf\7u\2\2\u01cf\u01d0\7g\2\2\u01d0"+
		"\u01d1\7p\2\2\u01d1\u01d2\7c\2\2\u01d2\u01d3\7q\2\2\u01d3x\3\2\2\2\u01d4"+
		"\u01d7\5{>\2\u01d5\u01d7\t\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d5\3\2\2"+
		"\2\u01d7z\3\2\2\2\u01d8\u01da\t\3\2\2\u01d9\u01d8\3\2\2\2\u01da|\3\2\2"+
		"\2\u01db\u01e1\7$\2\2\u01dc\u01e0\n\4\2\2\u01dd\u01de\7$\2\2\u01de\u01e0"+
		"\7$\2\2\u01df\u01dc\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1"+
		"\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01e1\3\2"+
		"\2\2\u01e4\u01e5\7$\2\2\u01e5~\3\2\2\2\u01e6\u01e8\4\62;\2\u01e7\u01e6"+
		"\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"\u0080\3\2\2\2\u01eb\u01ed\4\62;\2\u01ec\u01eb\3\2\2\2\u01ed\u01ee\3\2"+
		"\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"\u01f2\7\60\2\2\u01f1\u01f3\4\62;\2\u01f2\u01f1\3\2\2\2\u01f3\u01f4\3"+
		"\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u0082\3\2\2\2\u01f6"+
		"\u01fa\5{>\2\u01f7\u01f9\5y=\2\u01f8\u01f7\3\2\2\2\u01f9\u01fc\3\2\2\2"+
		"\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u0084\3\2\2\2\u01fc\u01fa"+
		"\3\2\2\2\u01fd\u0201\7}\2\2\u01fe\u0200\13\2\2\2\u01ff\u01fe\3\2\2\2\u0200"+
		"\u0203\3\2\2\2\u0201\u0202\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u0204\3\2"+
		"\2\2\u0203\u0201\3\2\2\2\u0204\u0205\7\177\2\2\u0205\u0206\3\2\2\2\u0206"+
		"\u0207\bC\2\2\u0207\u0086\3\2\2\2\u0208\u020a\t\5\2\2\u0209\u0208\3\2"+
		"\2\2\u020a\u020b\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u020d\3\2\2\2\u020d\u020e\bD\3\2\u020e\u0088\3\2\2\2\r\2\u01d6\u01d9"+
		"\u01df\u01e1\u01e9\u01ee\u01f4\u01fa\u0201\u020b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}