// Generated from C:\Users\Luccas\Documents\NetBeansProjects\CC2-Compilador-LA-C\CC2-Compilador-LA-C\src\grammars\capiroto.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class capirotoParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1;
	public static final String[] tokenNames = {
		"<INVALID>", "'helloworld'"
	};
	public static final int
		RULE_helloworld = 0;
	public static final String[] ruleNames = {
		"helloworld"
	};

	@Override
	public String getGrammarFileName() { return "capiroto.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public capirotoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class HelloworldContext extends ParserRuleContext {
		public HelloworldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_helloworld; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterHelloworld(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitHelloworld(this);
		}
	}

	public final HelloworldContext helloworld() throws RecognitionException {
		HelloworldContext _localctx = new HelloworldContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_helloworld);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2); match(1);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\3\7\4\2\t\2\3\2\3"+
		"\2\3\2\2\3\2\2\2\5\2\4\3\2\2\2\4\5\7\3\2\2\5\3\3\2\2\2\2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}