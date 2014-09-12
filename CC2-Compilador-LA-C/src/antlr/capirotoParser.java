// Generated from C:\Users\Lucas\git\CC2-Compilador-LA-C\CC2-Compilador-LA-C\src\grammars\capiroto.g4 by ANTLR 4.1
package antlr;
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
	public static final String[] tokenNames = {
		"<INVALID>", "IDENT", "CADEIA", "NUM_INT", "NUM_REAL", "COMENTARIO", "WS", 
		"'algoritmo'", "'fim_algoritmo'", "'declare'", "'constante'", "':'", "'tipo'", 
		"','", "'^'", "'.'", "'['", "']'", "'('", "')'", "'..'", "'-'", "'+'", 
		"'*'", "'/'", "'<-'", "'&'", "'%'", "'='", "'<>'", "'>='", "'<='", "'>'", 
		"'<'", "'nao'", "'literal'", "'inteiro'", "'real'", "'logico'", "'ou'", 
		"'e'", "'verdadeiro'", "'falso'", "'registro'", "'fim_registro'", "'procedimento'", 
		"'fim_procedimento'", "'funcao'", "'fim_funcao'", "'var'", "'leia'", "'escreva'", 
		"'se'", "'entao'", "'fim_se'", "'caso'", "'fim_caso'", "'seja'", "'para'", 
		"'ate'", "'faca'", "'fim_para'", "'enquanto'", "'fim_enquanto'", "'retorne'", 
		"'senao'"
	};
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_decl_local_global = 2, RULE_declaracao_local = 3, 
		RULE_variavel = 4, RULE_mais_var = 5, RULE_identificador = 6, RULE_ponteiros_opcionais = 7, 
		RULE_outros_ident = 8, RULE_dimensao = 9, RULE_tipo = 10, RULE_mais_ident = 11, 
		RULE_mais_variaveis = 12, RULE_tipo_basico = 13, RULE_tipo_basico_ident = 14, 
		RULE_tipo_estendido = 15, RULE_valor_constante = 16, RULE_registro = 17, 
		RULE_declaracao_global = 18, RULE_parametros_opcional = 19, RULE_parametro = 20, 
		RULE_var_opcional = 21, RULE_mais_parametros = 22, RULE_declaracoes_locais = 23, 
		RULE_corpo = 24, RULE_comandos = 25, RULE_cmd = 26, RULE_mais_expressao = 27, 
		RULE_senao_opcional = 28, RULE_chamada_atribuicao = 29, RULE_argumentos_opcional = 30, 
		RULE_selecao = 31, RULE_mais_selecao = 32, RULE_constantes = 33, RULE_mais_constantes = 34, 
		RULE_numero_intervalo = 35, RULE_intervalo_opcional = 36, RULE_op_unario = 37, 
		RULE_exp_aritmetica = 38, RULE_op_multiplicacao = 39, RULE_op_adicao = 40, 
		RULE_termo = 41, RULE_outros_termos = 42, RULE_fator = 43, RULE_outros_fatores = 44, 
		RULE_parcela = 45, RULE_parcela_unario = 46, RULE_parcela_nao_unario = 47, 
		RULE_outras_parcelas = 48, RULE_chamada_partes = 49, RULE_exp_relacional = 50, 
		RULE_op_opcional = 51, RULE_op_relacional = 52, RULE_expressao = 53, RULE_op_nao = 54, 
		RULE_termo_logico = 55, RULE_outros_termos_logicos = 56, RULE_outros_fatores_logicos = 57, 
		RULE_fator_logico = 58, RULE_parcela_logica = 59;
	public static final String[] ruleNames = {
		"programa", "declaracoes", "decl_local_global", "declaracao_local", "variavel", 
		"mais_var", "identificador", "ponteiros_opcionais", "outros_ident", "dimensao", 
		"tipo", "mais_ident", "mais_variaveis", "tipo_basico", "tipo_basico_ident", 
		"tipo_estendido", "valor_constante", "registro", "declaracao_global", 
		"parametros_opcional", "parametro", "var_opcional", "mais_parametros", 
		"declaracoes_locais", "corpo", "comandos", "cmd", "mais_expressao", "senao_opcional", 
		"chamada_atribuicao", "argumentos_opcional", "selecao", "mais_selecao", 
		"constantes", "mais_constantes", "numero_intervalo", "intervalo_opcional", 
		"op_unario", "exp_aritmetica", "op_multiplicacao", "op_adicao", "termo", 
		"outros_termos", "fator", "outros_fatores", "parcela", "parcela_unario", 
		"parcela_nao_unario", "outras_parcelas", "chamada_partes", "exp_relacional", 
		"op_opcional", "op_relacional", "expressao", "op_nao", "termo_logico", 
		"outros_termos_logicos", "outros_fatores_logicos", "fator_logico", "parcela_logica"
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
	public static class ProgramaContext extends ParserRuleContext {
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public TerminalNode ALGORITMO() { return getToken(capirotoParser.ALGORITMO, 0); }
		public TerminalNode FIM_ALGORITMO() { return getToken(capirotoParser.FIM_ALGORITMO, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); declaracoes();
			setState(121); match(ALGORITMO);
			setState(122); corpo();
			setState(123); match(FIM_ALGORITMO);
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

	public static class DeclaracoesContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public Decl_local_globalContext decl_local_global() {
			return getRuleContext(Decl_local_globalContext.class,0);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitDeclaracoes(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO) | (1L << PROCEDIMENTO) | (1L << FUNCAO))) != 0)) {
				{
				setState(125); decl_local_global();
				setState(126); declaracoes();
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

	public static class Decl_local_globalContext extends ParserRuleContext {
		public Declaracao_globalContext declaracao_global() {
			return getRuleContext(Declaracao_globalContext.class,0);
		}
		public Declaracao_localContext declaracao_local() {
			return getRuleContext(Declaracao_localContext.class,0);
		}
		public Decl_local_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_local_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterDecl_local_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitDecl_local_global(this);
		}
	}

	public final Decl_local_globalContext decl_local_global() throws RecognitionException {
		Decl_local_globalContext _localctx = new Decl_local_globalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_local_global);
		try {
			setState(132);
			switch (_input.LA(1)) {
			case DECLARE:
			case CONSTANTE:
			case TIPO:
				enterOuterAlt(_localctx, 1);
				{
				setState(130); declaracao_local();
				}
				break;
			case PROCEDIMENTO:
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(131); declaracao_global();
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

	public static class Declaracao_localContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(capirotoParser.EQUALS, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode DECLARE() { return getToken(capirotoParser.DECLARE, 0); }
		public TerminalNode TIPO() { return getToken(capirotoParser.TIPO, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode COLON() { return getToken(capirotoParser.COLON, 0); }
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public TerminalNode CONSTANTE() { return getToken(capirotoParser.CONSTANTE, 0); }
		public TerminalNode IDENT() { return getToken(capirotoParser.IDENT, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterDeclaracao_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitDeclaracao_local(this);
		}
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_local);
		try {
			setState(154);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134); match(DECLARE);
				setState(135); variavel();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136); match(CONSTANTE);
				setState(137); match(IDENT);
				setState(138); match(COLON);
				setState(139); tipo_basico();
				setState(140); match(EQUALS);
				setState(141); valor_constante();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143); match(TIPO);
				setState(144); match(IDENT);
				setState(145); match(COLON);
				setState(146); tipo_basico();
				setState(147); match(EQUALS);
				setState(148); valor_constante();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150); match(TIPO);
				setState(151); match(IDENT);
				setState(152); match(COLON);
				setState(153); tipo();
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

	public static class VariavelContext extends ParserRuleContext {
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode COLON() { return getToken(capirotoParser.COLON, 0); }
		public Mais_varContext mais_var() {
			return getRuleContext(Mais_varContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(capirotoParser.IDENT, 0); }
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitVariavel(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(IDENT);
			setState(157); dimensao();
			setState(158); mais_var();
			setState(159); match(COLON);
			setState(160); tipo();
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

	public static class Mais_varContext extends ParserRuleContext {
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(capirotoParser.COMMA, 0); }
		public Mais_varContext mais_var() {
			return getRuleContext(Mais_varContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(capirotoParser.IDENT, 0); }
		public Mais_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterMais_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitMais_var(this);
		}
	}

	public final Mais_varContext mais_var() throws RecognitionException {
		Mais_varContext _localctx = new Mais_varContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mais_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(162); match(COMMA);
				setState(163); match(IDENT);
				setState(164); dimensao();
				setState(165); mais_var();
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

	public static class IdentificadorContext extends ParserRuleContext {
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(capirotoParser.IDENT, 0); }
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitIdentificador(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); ponteiros_opcionais();
			setState(170); match(IDENT);
			setState(171); dimensao();
			setState(172); outros_ident();
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

	public static class Ponteiros_opcionaisContext extends ParserRuleContext {
		public TerminalNode UP_HAT() { return getToken(capirotoParser.UP_HAT, 0); }
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public Ponteiros_opcionaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponteiros_opcionais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterPonteiros_opcionais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitPonteiros_opcionais(this);
		}
	}

	public final Ponteiros_opcionaisContext ponteiros_opcionais() throws RecognitionException {
		Ponteiros_opcionaisContext _localctx = new Ponteiros_opcionaisContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ponteiros_opcionais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if (_la==UP_HAT) {
				{
				setState(174); match(UP_HAT);
				setState(175); ponteiros_opcionais();
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

	public static class Outros_identContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(capirotoParser.DOT, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Outros_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterOutros_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitOutros_ident(this);
		}
	}

	public final Outros_identContext outros_ident() throws RecognitionException {
		Outros_identContext _localctx = new Outros_identContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_outros_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(178); match(DOT);
				setState(179); identificador();
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

	public static class DimensaoContext extends ParserRuleContext {
		public TerminalNode RBRACKET() { return getToken(capirotoParser.RBRACKET, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(capirotoParser.LBRACKET, 0); }
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitDimensao(this);
		}
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dimensao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(182); match(LBRACKET);
				setState(183); exp_aritmetica();
				setState(184); match(RBRACKET);
				setState(185); dimensao();
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

	public static class TipoContext extends ParserRuleContext {
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo);
		try {
			setState(191);
			switch (_input.LA(1)) {
			case REGISTRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(189); registro();
				}
				break;
			case IDENT:
			case UP_HAT:
			case LITERAL:
			case INTEIRO:
			case REAL:
			case LOGICO:
				enterOuterAlt(_localctx, 2);
				{
				setState(190); tipo_estendido();
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

	public static class Mais_identContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Mais_identContext mais_ident() {
			return getRuleContext(Mais_identContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(capirotoParser.COMMA, 0); }
		public Mais_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterMais_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitMais_ident(this);
		}
	}

	public final Mais_identContext mais_ident() throws RecognitionException {
		Mais_identContext _localctx = new Mais_identContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mais_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(193); match(COMMA);
				setState(194); identificador();
				setState(195); mais_ident();
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

	public static class Mais_variaveisContext extends ParserRuleContext {
		public Mais_variaveisContext mais_variaveis() {
			return getRuleContext(Mais_variaveisContext.class,0);
		}
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Mais_variaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_variaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterMais_variaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitMais_variaveis(this);
		}
	}

	public final Mais_variaveisContext mais_variaveis() throws RecognitionException {
		Mais_variaveisContext _localctx = new Mais_variaveisContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mais_variaveis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(199); variavel();
				setState(200); mais_variaveis();
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

	public static class Tipo_basicoContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(capirotoParser.REAL, 0); }
		public TerminalNode INTEIRO() { return getToken(capirotoParser.INTEIRO, 0); }
		public TerminalNode LOGICO() { return getToken(capirotoParser.LOGICO, 0); }
		public TerminalNode LITERAL() { return getToken(capirotoParser.LITERAL, 0); }
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterTipo_basico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitTipo_basico(this);
		}
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo_basico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LITERAL) | (1L << INTEIRO) | (1L << REAL) | (1L << LOGICO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Tipo_basico_identContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(capirotoParser.IDENT, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public Tipo_basico_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterTipo_basico_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitTipo_basico_ident(this);
		}
	}

	public final Tipo_basico_identContext tipo_basico_ident() throws RecognitionException {
		Tipo_basico_identContext _localctx = new Tipo_basico_identContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipo_basico_ident);
		try {
			setState(208);
			switch (_input.LA(1)) {
			case LITERAL:
			case INTEIRO:
			case REAL:
			case LOGICO:
				enterOuterAlt(_localctx, 1);
				{
				setState(206); tipo_basico();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(207); match(IDENT);
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

	public static class Tipo_estendidoContext extends ParserRuleContext {
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public Tipo_basico_identContext tipo_basico_ident() {
			return getRuleContext(Tipo_basico_identContext.class,0);
		}
		public Tipo_estendidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_estendido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterTipo_estendido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitTipo_estendido(this);
		}
	}

	public final Tipo_estendidoContext tipo_estendido() throws RecognitionException {
		Tipo_estendidoContext _localctx = new Tipo_estendidoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tipo_estendido);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); ponteiros_opcionais();
			setState(211); tipo_basico_ident();
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

	public static class Valor_constanteContext extends ParserRuleContext {
		public TerminalNode NUM_REAL() { return getToken(capirotoParser.NUM_REAL, 0); }
		public TerminalNode VERDADEIRO() { return getToken(capirotoParser.VERDADEIRO, 0); }
		public TerminalNode CADEIA() { return getToken(capirotoParser.CADEIA, 0); }
		public TerminalNode FALSO() { return getToken(capirotoParser.FALSO, 0); }
		public TerminalNode NUM_INT() { return getToken(capirotoParser.NUM_INT, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterValor_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitValor_constante(this);
		}
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CADEIA) | (1L << NUM_INT) | (1L << NUM_REAL) | (1L << VERDADEIRO) | (1L << FALSO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class RegistroContext extends ParserRuleContext {
		public Mais_variaveisContext mais_variaveis() {
			return getRuleContext(Mais_variaveisContext.class,0);
		}
		public TerminalNode REGISTRO() { return getToken(capirotoParser.REGISTRO, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode FIM_REGISTRO() { return getToken(capirotoParser.FIM_REGISTRO, 0); }
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitRegistro(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_registro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215); match(REGISTRO);
			setState(216); variavel();
			setState(217); mais_variaveis();
			setState(218); match(FIM_REGISTRO);
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

	public static class Declaracao_globalContext extends ParserRuleContext {
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode PROCEDIMENTO() { return getToken(capirotoParser.PROCEDIMENTO, 0); }
		public Declaracoes_locaisContext declaracoes_locais() {
			return getRuleContext(Declaracoes_locaisContext.class,0);
		}
		public TerminalNode FIM_FUNCAO() { return getToken(capirotoParser.FIM_FUNCAO, 0); }
		public Parametros_opcionalContext parametros_opcional() {
			return getRuleContext(Parametros_opcionalContext.class,0);
		}
		public TerminalNode FUNCAO() { return getToken(capirotoParser.FUNCAO, 0); }
		public TerminalNode COLON() { return getToken(capirotoParser.COLON, 0); }
		public TerminalNode FIM_PROCEDIMENTO() { return getToken(capirotoParser.FIM_PROCEDIMENTO, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(capirotoParser.LPARENTHESIS, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(capirotoParser.IDENT, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(capirotoParser.RPARENTHESIS, 0); }
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterDeclaracao_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitDeclaracao_global(this);
		}
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaracao_global);
		try {
			setState(240);
			switch (_input.LA(1)) {
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(220); match(PROCEDIMENTO);
				setState(221); match(IDENT);
				setState(222); match(LPARENTHESIS);
				setState(223); parametros_opcional();
				setState(224); match(RPARENTHESIS);
				setState(225); declaracoes_locais();
				setState(226); comandos();
				setState(227); match(FIM_PROCEDIMENTO);
				}
				break;
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(229); match(FUNCAO);
				setState(230); match(IDENT);
				setState(231); match(LPARENTHESIS);
				setState(232); parametros_opcional();
				setState(233); match(RPARENTHESIS);
				setState(234); match(COLON);
				setState(235); tipo_estendido();
				setState(236); declaracoes_locais();
				setState(237); comandos();
				setState(238); match(FIM_FUNCAO);
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

	public static class Parametros_opcionalContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public Parametros_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterParametros_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitParametros_opcional(this);
		}
	}

	public final Parametros_opcionalContext parametros_opcional() throws RecognitionException {
		Parametros_opcionalContext _localctx = new Parametros_opcionalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parametros_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENT) | (1L << UP_HAT) | (1L << VAR))) != 0)) {
				{
				setState(242); parametro();
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

	public static class ParametroContext extends ParserRuleContext {
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Var_opcionalContext var_opcional() {
			return getRuleContext(Var_opcionalContext.class,0);
		}
		public Mais_identContext mais_ident() {
			return getRuleContext(Mais_identContext.class,0);
		}
		public Mais_parametrosContext mais_parametros() {
			return getRuleContext(Mais_parametrosContext.class,0);
		}
		public TerminalNode COLON() { return getToken(capirotoParser.COLON, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245); var_opcional();
			setState(246); identificador();
			setState(247); mais_ident();
			setState(248); match(COLON);
			setState(249); tipo_estendido();
			setState(250); mais_parametros();
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

	public static class Var_opcionalContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(capirotoParser.VAR, 0); }
		public Var_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterVar_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitVar_opcional(this);
		}
	}

	public final Var_opcionalContext var_opcional() throws RecognitionException {
		Var_opcionalContext _localctx = new Var_opcionalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(252); match(VAR);
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

	public static class Mais_parametrosContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(capirotoParser.COMMA, 0); }
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public Mais_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterMais_parametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitMais_parametros(this);
		}
	}

	public final Mais_parametrosContext mais_parametros() throws RecognitionException {
		Mais_parametrosContext _localctx = new Mais_parametrosContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mais_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(255); match(COMMA);
				setState(256); parametro();
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

	public static class Declaracoes_locaisContext extends ParserRuleContext {
		public Declaracoes_locaisContext declaracoes_locais() {
			return getRuleContext(Declaracoes_locaisContext.class,0);
		}
		public Declaracao_localContext declaracao_local() {
			return getRuleContext(Declaracao_localContext.class,0);
		}
		public Declaracoes_locaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes_locais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterDeclaracoes_locais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitDeclaracoes_locais(this);
		}
	}

	public final Declaracoes_locaisContext declaracoes_locais() throws RecognitionException {
		Declaracoes_locaisContext _localctx = new Declaracoes_locaisContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declaracoes_locais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO))) != 0)) {
				{
				setState(259); declaracao_local();
				setState(260); declaracoes_locais();
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

	public static class CorpoContext extends ParserRuleContext {
		public Declaracoes_locaisContext declaracoes_locais() {
			return getRuleContext(Declaracoes_locaisContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitCorpo(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); declaracoes_locais();
			setState(265); comandos();
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

	public static class ComandosContext extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitComandos(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_la = _input.LA(1);
			if (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (IDENT - 1)) | (1L << (UP_HAT - 1)) | (1L << (LEIA - 1)) | (1L << (ESCREVA - 1)) | (1L << (SE - 1)) | (1L << (CASO - 1)) | (1L << (PARA - 1)) | (1L << (FACA - 1)) | (1L << (ENQUANTO - 1)) | (1L << (RETORNE - 1)))) != 0)) {
				{
				setState(267); cmd();
				setState(268); comandos();
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

	public static class CmdContext extends ParserRuleContext {
		public TerminalNode UP_HAT() { return getToken(capirotoParser.UP_HAT, 0); }
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public Senao_opcionalContext senao_opcional() {
			return getRuleContext(Senao_opcionalContext.class,0);
		}
		public TerminalNode FIMSE() { return getToken(capirotoParser.FIMSE, 0); }
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public TerminalNode FIMENQUANTO() { return getToken(capirotoParser.FIMENQUANTO, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(capirotoParser.IDENT, 0); }
		public TerminalNode ARROW() { return getToken(capirotoParser.ARROW, 0); }
		public Chamada_atribuicaoContext chamada_atribuicao() {
			return getRuleContext(Chamada_atribuicaoContext.class,0);
		}
		public TerminalNode FIMCASO() { return getToken(capirotoParser.FIMCASO, 0); }
		public TerminalNode ENQUANTO() { return getToken(capirotoParser.ENQUANTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ATE() { return getToken(capirotoParser.ATE, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(capirotoParser.LPARENTHESIS, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode RETORNE() { return getToken(capirotoParser.RETORNE, 0); }
		public TerminalNode LEIA() { return getToken(capirotoParser.LEIA, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(capirotoParser.RPARENTHESIS, 0); }
		public TerminalNode FACA() { return getToken(capirotoParser.FACA, 0); }
		public Mais_identContext mais_ident() {
			return getRuleContext(Mais_identContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TerminalNode PARA() { return getToken(capirotoParser.PARA, 0); }
		public TerminalNode ENTAO() { return getToken(capirotoParser.ENTAO, 0); }
		public TerminalNode SE() { return getToken(capirotoParser.SE, 0); }
		public TerminalNode ESCREVA() { return getToken(capirotoParser.ESCREVA, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode FIMPARA() { return getToken(capirotoParser.FIMPARA, 0); }
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public TerminalNode SEJA() { return getToken(capirotoParser.SEJA, 0); }
		public TerminalNode CASO() { return getToken(capirotoParser.CASO, 0); }
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cmd);
		try {
			setState(330);
			switch (_input.LA(1)) {
			case LEIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(272); match(LEIA);
				setState(273); match(LPARENTHESIS);
				setState(274); identificador();
				setState(275); mais_ident();
				setState(276); match(RPARENTHESIS);
				}
				break;
			case ESCREVA:
				enterOuterAlt(_localctx, 2);
				{
				setState(278); match(ESCREVA);
				setState(279); match(LPARENTHESIS);
				setState(280); expressao();
				setState(281); mais_expressao();
				setState(282); match(RPARENTHESIS);
				}
				break;
			case SE:
				enterOuterAlt(_localctx, 3);
				{
				setState(284); match(SE);
				setState(285); expressao();
				setState(286); match(ENTAO);
				setState(287); comandos();
				setState(288); senao_opcional();
				setState(289); match(FIMSE);
				}
				break;
			case CASO:
				enterOuterAlt(_localctx, 4);
				{
				setState(291); match(CASO);
				setState(292); exp_aritmetica();
				setState(293); match(SEJA);
				setState(294); selecao();
				setState(295); senao_opcional();
				setState(296); match(FIMCASO);
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 5);
				{
				setState(298); match(PARA);
				setState(299); match(IDENT);
				setState(300); match(ARROW);
				setState(301); exp_aritmetica();
				setState(302); match(ATE);
				setState(303); exp_aritmetica();
				setState(304); match(FACA);
				setState(305); comandos();
				setState(306); match(FIMPARA);
				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 6);
				{
				setState(308); match(ENQUANTO);
				setState(309); expressao();
				setState(310); match(FACA);
				setState(311); comandos();
				setState(312); match(FIMENQUANTO);
				}
				break;
			case FACA:
				enterOuterAlt(_localctx, 7);
				{
				setState(314); match(FACA);
				setState(315); comandos();
				setState(316); match(ATE);
				setState(317); expressao();
				}
				break;
			case UP_HAT:
				enterOuterAlt(_localctx, 8);
				{
				setState(319); match(UP_HAT);
				setState(320); match(IDENT);
				setState(321); outros_ident();
				setState(322); dimensao();
				setState(323); match(ARROW);
				setState(324); expressao();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 9);
				{
				setState(326); match(IDENT);
				setState(327); chamada_atribuicao();
				}
				break;
			case RETORNE:
				enterOuterAlt(_localctx, 10);
				{
				setState(328); match(RETORNE);
				setState(329); expressao();
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

	public static class Mais_expressaoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(capirotoParser.COMMA, 0); }
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public Mais_expressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterMais_expressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitMais_expressao(this);
		}
	}

	public final Mais_expressaoContext mais_expressao() throws RecognitionException {
		Mais_expressaoContext _localctx = new Mais_expressaoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mais_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(332); match(COMMA);
				setState(333); expressao();
				setState(334); mais_expressao();
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

	public static class Senao_opcionalContext extends ParserRuleContext {
		public TerminalNode SENAO() { return getToken(capirotoParser.SENAO, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Senao_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterSenao_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitSenao_opcional(this);
		}
	}

	public final Senao_opcionalContext senao_opcional() throws RecognitionException {
		Senao_opcionalContext _localctx = new Senao_opcionalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_senao_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(338); match(SENAO);
				setState(339); comandos();
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

	public static class Chamada_atribuicaoContext extends ParserRuleContext {
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode LPARENTHESIS() { return getToken(capirotoParser.LPARENTHESIS, 0); }
		public Argumentos_opcionalContext argumentos_opcional() {
			return getRuleContext(Argumentos_opcionalContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(capirotoParser.RPARENTHESIS, 0); }
		public TerminalNode ARROW() { return getToken(capirotoParser.ARROW, 0); }
		public Chamada_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterChamada_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitChamada_atribuicao(this);
		}
	}

	public final Chamada_atribuicaoContext chamada_atribuicao() throws RecognitionException {
		Chamada_atribuicaoContext _localctx = new Chamada_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_chamada_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342); match(LPARENTHESIS);
			setState(343); argumentos_opcional();
			setState(344); match(RPARENTHESIS);
			setState(345); outros_ident();
			setState(346); dimensao();
			setState(347); match(ARROW);
			setState(348); expressao();
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

	public static class Argumentos_opcionalContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public Argumentos_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterArgumentos_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitArgumentos_opcional(this);
		}
	}

	public final Argumentos_opcionalContext argumentos_opcional() throws RecognitionException {
		Argumentos_opcionalContext _localctx = new Argumentos_opcionalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_argumentos_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENT) | (1L << CADEIA) | (1L << NUM_INT) | (1L << NUM_REAL) | (1L << UP_HAT) | (1L << LPARENTHESIS) | (1L << MINUS) | (1L << COMMERCIAL_E) | (1L << NOT) | (1L << VERDADEIRO) | (1L << FALSO))) != 0)) {
				{
				setState(350); expressao();
				setState(351); mais_expressao();
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

	public static class SelecaoContext extends ParserRuleContext {
		public Mais_selecaoContext mais_selecao() {
			return getRuleContext(Mais_selecaoContext.class,0);
		}
		public TerminalNode COLON() { return getToken(capirotoParser.COLON, 0); }
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitSelecao(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_selecao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355); constantes();
			setState(356); match(COLON);
			setState(357); comandos();
			setState(358); mais_selecao();
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

	public static class Mais_selecaoContext extends ParserRuleContext {
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public Mais_selecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterMais_selecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitMais_selecao(this);
		}
	}

	public final Mais_selecaoContext mais_selecao() throws RecognitionException {
		Mais_selecaoContext _localctx = new Mais_selecaoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mais_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_la = _input.LA(1);
			if (_la==NUM_INT || _la==MINUS) {
				{
				setState(360); selecao();
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

	public static class ConstantesContext extends ParserRuleContext {
		public Numero_intervaloContext numero_intervalo() {
			return getRuleContext(Numero_intervaloContext.class,0);
		}
		public Mais_constantesContext mais_constantes() {
			return getRuleContext(Mais_constantesContext.class,0);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitConstantes(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constantes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363); numero_intervalo();
			setState(364); mais_constantes();
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

	public static class Mais_constantesContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(capirotoParser.COMMA, 0); }
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public Mais_constantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterMais_constantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitMais_constantes(this);
		}
	}

	public final Mais_constantesContext mais_constantes() throws RecognitionException {
		Mais_constantesContext _localctx = new Mais_constantesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mais_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(366); match(COMMA);
				setState(367); constantes();
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

	public static class Numero_intervaloContext extends ParserRuleContext {
		public Intervalo_opcionalContext intervalo_opcional() {
			return getRuleContext(Intervalo_opcionalContext.class,0);
		}
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(capirotoParser.NUM_INT, 0); }
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterNumero_intervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitNumero_intervalo(this);
		}
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_numero_intervalo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370); op_unario();
			setState(371); match(NUM_INT);
			setState(372); intervalo_opcional();
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

	public static class Intervalo_opcionalContext extends ParserRuleContext {
		public TerminalNode TWODOTS() { return getToken(capirotoParser.TWODOTS, 0); }
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(capirotoParser.NUM_INT, 0); }
		public Intervalo_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalo_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterIntervalo_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitIntervalo_opcional(this);
		}
	}

	public final Intervalo_opcionalContext intervalo_opcional() throws RecognitionException {
		Intervalo_opcionalContext _localctx = new Intervalo_opcionalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_intervalo_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_la = _input.LA(1);
			if (_la==TWODOTS) {
				{
				setState(374); match(TWODOTS);
				setState(375); op_unario();
				setState(376); match(NUM_INT);
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

	public static class Op_unarioContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(capirotoParser.MINUS, 0); }
		public Op_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterOp_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitOp_unario(this);
		}
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_op_unario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(380); match(MINUS);
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

	public static class Exp_aritmeticaContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Outros_termosContext outros_termos() {
			return getRuleContext(Outros_termosContext.class,0);
		}
		public Exp_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterExp_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitExp_aritmetica(this);
		}
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exp_aritmetica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383); termo();
			setState(384); outros_termos();
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

	public static class Op_multiplicacaoContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(capirotoParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(capirotoParser.DIV, 0); }
		public Op_multiplicacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_multiplicacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterOp_multiplicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitOp_multiplicacao(this);
		}
	}

	public final Op_multiplicacaoContext op_multiplicacao() throws RecognitionException {
		Op_multiplicacaoContext _localctx = new Op_multiplicacaoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_op_multiplicacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_la = _input.LA(1);
			if ( !(_la==MULT || _la==DIV) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Op_adicaoContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(capirotoParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(capirotoParser.MINUS, 0); }
		public Op_adicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_adicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterOp_adicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitOp_adicao(this);
		}
	}

	public final Op_adicaoContext op_adicao() throws RecognitionException {
		Op_adicaoContext _localctx = new Op_adicaoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_op_adicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_la = _input.LA(1);
			if ( !(_la==MINUS || _la==PLUS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class TermoContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Outros_fatoresContext outros_fatores() {
			return getRuleContext(Outros_fatoresContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_termo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390); fator();
			setState(391); outros_fatores();
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

	public static class Outros_termosContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Op_adicaoContext op_adicao() {
			return getRuleContext(Op_adicaoContext.class,0);
		}
		public Outros_termosContext outros_termos() {
			return getRuleContext(Outros_termosContext.class,0);
		}
		public Outros_termosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_termos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterOutros_termos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitOutros_termos(this);
		}
	}

	public final Outros_termosContext outros_termos() throws RecognitionException {
		Outros_termosContext _localctx = new Outros_termosContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_outros_termos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(393); op_adicao();
				setState(394); termo();
				setState(395); outros_termos();
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

	public static class FatorContext extends ParserRuleContext {
		public ParcelaContext parcela() {
			return getRuleContext(ParcelaContext.class,0);
		}
		public Outras_parcelasContext outras_parcelas() {
			return getRuleContext(Outras_parcelasContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_fator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399); parcela();
			setState(400); outras_parcelas();
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

	public static class Outros_fatoresContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Op_multiplicacaoContext op_multiplicacao() {
			return getRuleContext(Op_multiplicacaoContext.class,0);
		}
		public Outros_fatoresContext outros_fatores() {
			return getRuleContext(Outros_fatoresContext.class,0);
		}
		public Outros_fatoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_fatores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterOutros_fatores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitOutros_fatores(this);
		}
	}

	public final Outros_fatoresContext outros_fatores() throws RecognitionException {
		Outros_fatoresContext _localctx = new Outros_fatoresContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_outros_fatores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_la = _input.LA(1);
			if (_la==MULT || _la==DIV) {
				{
				setState(402); op_multiplicacao();
				setState(403); fator();
				setState(404); outros_fatores();
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

	public static class ParcelaContext extends ParserRuleContext {
		public Parcela_nao_unarioContext parcela_nao_unario() {
			return getRuleContext(Parcela_nao_unarioContext.class,0);
		}
		public Parcela_unarioContext parcela_unario() {
			return getRuleContext(Parcela_unarioContext.class,0);
		}
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitParcela(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_parcela);
		try {
			setState(412);
			switch (_input.LA(1)) {
			case IDENT:
			case NUM_INT:
			case NUM_REAL:
			case UP_HAT:
			case LPARENTHESIS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(408); op_unario();
				setState(409); parcela_unario();
				}
				break;
			case CADEIA:
			case COMMERCIAL_E:
				enterOuterAlt(_localctx, 2);
				{
				setState(411); parcela_nao_unario();
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

	public static class Parcela_unarioContext extends ParserRuleContext {
		public TerminalNode UP_HAT() { return getToken(capirotoParser.UP_HAT, 0); }
		public TerminalNode NUM_REAL() { return getToken(capirotoParser.NUM_REAL, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Chamada_partesContext chamada_partes() {
			return getRuleContext(Chamada_partesContext.class,0);
		}
		public TerminalNode LPARENTHESIS() { return getToken(capirotoParser.LPARENTHESIS, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(capirotoParser.NUM_INT, 0); }
		public TerminalNode IDENT() { return getToken(capirotoParser.IDENT, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(capirotoParser.RPARENTHESIS, 0); }
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterParcela_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitParcela_unario(this);
		}
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_parcela_unario);
		int _la;
		try {
			setState(426);
			switch (_input.LA(1)) {
			case UP_HAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(414); match(UP_HAT);
				setState(415); match(IDENT);
				setState(416); outros_ident();
				setState(417); dimensao();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(419); match(IDENT);
				setState(420); chamada_partes();
				}
				break;
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				_la = _input.LA(1);
				if ( !(_la==NUM_INT || _la==NUM_REAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case LPARENTHESIS:
				enterOuterAlt(_localctx, 4);
				{
				setState(422); match(LPARENTHESIS);
				setState(423); expressao();
				setState(424); match(RPARENTHESIS);
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

	public static class Parcela_nao_unarioContext extends ParserRuleContext {
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(capirotoParser.CADEIA, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(capirotoParser.IDENT, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterParcela_nao_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitParcela_nao_unario(this);
		}
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parcela_nao_unario);
		try {
			setState(434);
			switch (_input.LA(1)) {
			case COMMERCIAL_E:
				enterOuterAlt(_localctx, 1);
				{
				setState(428); match(COMMERCIAL_E);
				setState(429); match(IDENT);
				setState(430); outros_ident();
				setState(431); dimensao();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(433); match(CADEIA);
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

	public static class Outras_parcelasContext extends ParserRuleContext {
		public ParcelaContext parcela() {
			return getRuleContext(ParcelaContext.class,0);
		}
		public Outras_parcelasContext outras_parcelas() {
			return getRuleContext(Outras_parcelasContext.class,0);
		}
		public Outras_parcelasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outras_parcelas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterOutras_parcelas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitOutras_parcelas(this);
		}
	}

	public final Outras_parcelasContext outras_parcelas() throws RecognitionException {
		Outras_parcelasContext _localctx = new Outras_parcelasContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_outras_parcelas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			_la = _input.LA(1);
			if (_la==PERCENT) {
				{
				setState(436); match(PERCENT);
				setState(437); parcela();
				setState(438); outras_parcelas();
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

	public static class Chamada_partesContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public TerminalNode LPARENTHESIS() { return getToken(capirotoParser.LPARENTHESIS, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(capirotoParser.RPARENTHESIS, 0); }
		public Chamada_partesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_partes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterChamada_partes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitChamada_partes(this);
		}
	}

	public final Chamada_partesContext chamada_partes() throws RecognitionException {
		Chamada_partesContext _localctx = new Chamada_partesContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_chamada_partes);
		try {
			setState(451);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(442); match(LPARENTHESIS);
				setState(443); expressao();
				setState(444); mais_expressao();
				setState(445); match(RPARENTHESIS);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447); outros_ident();
				setState(448); dimensao();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Exp_relacionalContext extends ParserRuleContext {
		public Op_opcionalContext op_opcional() {
			return getRuleContext(Op_opcionalContext.class,0);
		}
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public Exp_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterExp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitExp_relacional(this);
		}
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_exp_relacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453); exp_aritmetica();
			setState(454); op_opcional();
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

	public static class Op_opcionalContext extends ParserRuleContext {
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public Op_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterOp_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitOp_opcional(this);
		}
	}

	public final Op_opcionalContext op_opcional() throws RecognitionException {
		Op_opcionalContext _localctx = new Op_opcionalContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_op_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << DIFFERENT) | (1L << GREATERTHANEQ) | (1L << LESSTHANEQ) | (1L << GREATERTHAN) | (1L << LESSTHAN))) != 0)) {
				{
				setState(456); op_relacional();
				setState(457); exp_aritmetica();
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

	public static class Op_relacionalContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(capirotoParser.EQUALS, 0); }
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitOp_relacional(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << DIFFERENT) | (1L << GREATERTHANEQ) | (1L << LESSTHANEQ) | (1L << GREATERTHAN) | (1L << LESSTHAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ExpressaoContext extends ParserRuleContext {
		public Outros_termos_logicosContext outros_termos_logicos() {
			return getRuleContext(Outros_termos_logicosContext.class,0);
		}
		public Termo_logicoContext termo_logico() {
			return getRuleContext(Termo_logicoContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463); termo_logico();
			setState(464); outros_termos_logicos();
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

	public static class Op_naoContext extends ParserRuleContext {
		public Op_naoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_nao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterOp_nao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitOp_nao(this);
		}
	}

	public final Op_naoContext op_nao() throws RecognitionException {
		Op_naoContext _localctx = new Op_naoContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_op_nao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(466); match(NOT);
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

	public static class Termo_logicoContext extends ParserRuleContext {
		public Fator_logicoContext fator_logico() {
			return getRuleContext(Fator_logicoContext.class,0);
		}
		public Outros_fatores_logicosContext outros_fatores_logicos() {
			return getRuleContext(Outros_fatores_logicosContext.class,0);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitTermo_logico(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_termo_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469); fator_logico();
			setState(470); outros_fatores_logicos();
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

	public static class Outros_termos_logicosContext extends ParserRuleContext {
		public Outros_termos_logicosContext outros_termos_logicos() {
			return getRuleContext(Outros_termos_logicosContext.class,0);
		}
		public Termo_logicoContext termo_logico() {
			return getRuleContext(Termo_logicoContext.class,0);
		}
		public Outros_termos_logicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_termos_logicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterOutros_termos_logicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitOutros_termos_logicos(this);
		}
	}

	public final Outros_termos_logicosContext outros_termos_logicos() throws RecognitionException {
		Outros_termos_logicosContext _localctx = new Outros_termos_logicosContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_outros_termos_logicos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(472); match(OR);
				setState(473); termo_logico();
				setState(474); outros_termos_logicos();
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

	public static class Outros_fatores_logicosContext extends ParserRuleContext {
		public Fator_logicoContext fator_logico() {
			return getRuleContext(Fator_logicoContext.class,0);
		}
		public Outros_fatores_logicosContext outros_fatores_logicos() {
			return getRuleContext(Outros_fatores_logicosContext.class,0);
		}
		public Outros_fatores_logicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_fatores_logicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterOutros_fatores_logicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitOutros_fatores_logicos(this);
		}
	}

	public final Outros_fatores_logicosContext outros_fatores_logicos() throws RecognitionException {
		Outros_fatores_logicosContext _localctx = new Outros_fatores_logicosContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_outros_fatores_logicos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(478); match(AND);
				setState(479); fator_logico();
				setState(480); outros_fatores_logicos();
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

	public static class Fator_logicoContext extends ParserRuleContext {
		public Op_naoContext op_nao() {
			return getRuleContext(Op_naoContext.class,0);
		}
		public Parcela_logicaContext parcela_logica() {
			return getRuleContext(Parcela_logicaContext.class,0);
		}
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterFator_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitFator_logico(this);
		}
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_fator_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484); op_nao();
			setState(485); parcela_logica();
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

	public static class Parcela_logicaContext extends ParserRuleContext {
		public Exp_relacionalContext exp_relacional() {
			return getRuleContext(Exp_relacionalContext.class,0);
		}
		public TerminalNode VERDADEIRO() { return getToken(capirotoParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(capirotoParser.FALSO, 0); }
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).enterParcela_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof capirotoListener ) ((capirotoListener)listener).exitParcela_logica(this);
		}
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_parcela_logica);
		int _la;
		try {
			setState(489);
			switch (_input.LA(1)) {
			case VERDADEIRO:
			case FALSO:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				_la = _input.LA(1);
				if ( !(_la==VERDADEIRO || _la==FALSO) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case IDENT:
			case CADEIA:
			case NUM_INT:
			case NUM_REAL:
			case UP_HAT:
			case LPARENTHESIS:
			case MINUS:
			case COMMERCIAL_E:
				enterOuterAlt(_localctx, 2);
				{
				setState(488); exp_relacional();
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3C\u01ee\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3\u0083\n\3\3\4\3\4\5\4\u0087\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u009d\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u00aa\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u00b3\n\t\3\n\3\n\5\n\u00b7"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u00be\n\13\3\f\3\f\5\f\u00c2\n\f\3"+
		"\r\3\r\3\r\3\r\5\r\u00c8\n\r\3\16\3\16\3\16\5\16\u00cd\n\16\3\17\3\17"+
		"\3\20\3\20\5\20\u00d3\n\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f3\n\24\3\25\5\25\u00f6\n"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\5\27\u0100\n\27\3\30\3\30"+
		"\5\30\u0104\n\30\3\31\3\31\3\31\5\31\u0109\n\31\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\5\33\u0111\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u014d\n\34\3\35\3\35\3\35\3\35"+
		"\5\35\u0153\n\35\3\36\3\36\5\36\u0157\n\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3 \3 \3 \5 \u0164\n \3!\3!\3!\3!\3!\3\"\5\"\u016c\n\"\3"+
		"#\3#\3#\3$\3$\5$\u0173\n$\3%\3%\3%\3%\3&\3&\3&\3&\5&\u017d\n&\3\'\5\'"+
		"\u0180\n\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3,\5,\u0190\n,\3-\3"+
		"-\3-\3.\3.\3.\3.\5.\u0199\n.\3/\3/\3/\3/\5/\u019f\n/\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u01ad\n\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\5\61\u01b5\n\61\3\62\3\62\3\62\3\62\5\62\u01bb\n"+
		"\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u01c6\n\63\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\5\65\u01ce\n\65\3\66\3\66\3\67\3\67\3\67\38"+
		"\58\u01d6\n8\39\39\39\3:\3:\3:\3:\5:\u01df\n:\3;\3;\3;\3;\5;\u01e5\n;"+
		"\3<\3<\3<\3=\3=\5=\u01ec\n=\3=\2>\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\2\t\3\2%(\4"+
		"\2\4\6+,\3\2\31\32\3\2\27\30\3\2\5\6\3\2\36#\3\2+,\u01e3\2z\3\2\2\2\4"+
		"\u0082\3\2\2\2\6\u0086\3\2\2\2\b\u009c\3\2\2\2\n\u009e\3\2\2\2\f\u00a9"+
		"\3\2\2\2\16\u00ab\3\2\2\2\20\u00b2\3\2\2\2\22\u00b6\3\2\2\2\24\u00bd\3"+
		"\2\2\2\26\u00c1\3\2\2\2\30\u00c7\3\2\2\2\32\u00cc\3\2\2\2\34\u00ce\3\2"+
		"\2\2\36\u00d2\3\2\2\2 \u00d4\3\2\2\2\"\u00d7\3\2\2\2$\u00d9\3\2\2\2&\u00f2"+
		"\3\2\2\2(\u00f5\3\2\2\2*\u00f7\3\2\2\2,\u00ff\3\2\2\2.\u0103\3\2\2\2\60"+
		"\u0108\3\2\2\2\62\u010a\3\2\2\2\64\u0110\3\2\2\2\66\u014c\3\2\2\28\u0152"+
		"\3\2\2\2:\u0156\3\2\2\2<\u0158\3\2\2\2>\u0163\3\2\2\2@\u0165\3\2\2\2B"+
		"\u016b\3\2\2\2D\u016d\3\2\2\2F\u0172\3\2\2\2H\u0174\3\2\2\2J\u017c\3\2"+
		"\2\2L\u017f\3\2\2\2N\u0181\3\2\2\2P\u0184\3\2\2\2R\u0186\3\2\2\2T\u0188"+
		"\3\2\2\2V\u018f\3\2\2\2X\u0191\3\2\2\2Z\u0198\3\2\2\2\\\u019e\3\2\2\2"+
		"^\u01ac\3\2\2\2`\u01b4\3\2\2\2b\u01ba\3\2\2\2d\u01c5\3\2\2\2f\u01c7\3"+
		"\2\2\2h\u01cd\3\2\2\2j\u01cf\3\2\2\2l\u01d1\3\2\2\2n\u01d5\3\2\2\2p\u01d7"+
		"\3\2\2\2r\u01de\3\2\2\2t\u01e4\3\2\2\2v\u01e6\3\2\2\2x\u01eb\3\2\2\2z"+
		"{\5\4\3\2{|\7\t\2\2|}\5\62\32\2}~\7\n\2\2~\3\3\2\2\2\177\u0080\5\6\4\2"+
		"\u0080\u0081\5\4\3\2\u0081\u0083\3\2\2\2\u0082\177\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\5\3\2\2\2\u0084\u0087\5\b\5\2\u0085\u0087\5&\24\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\7\3\2\2\2\u0088\u0089\7\13\2"+
		"\2\u0089\u009d\5\n\6\2\u008a\u008b\7\f\2\2\u008b\u008c\7\3\2\2\u008c\u008d"+
		"\7\r\2\2\u008d\u008e\5\34\17\2\u008e\u008f\7\36\2\2\u008f\u0090\5\"\22"+
		"\2\u0090\u009d\3\2\2\2\u0091\u0092\7\16\2\2\u0092\u0093\7\3\2\2\u0093"+
		"\u0094\7\r\2\2\u0094\u0095\5\34\17\2\u0095\u0096\7\36\2\2\u0096\u0097"+
		"\5\"\22\2\u0097\u009d\3\2\2\2\u0098\u0099\7\16\2\2\u0099\u009a\7\3\2\2"+
		"\u009a\u009b\7\r\2\2\u009b\u009d\5\26\f\2\u009c\u0088\3\2\2\2\u009c\u008a"+
		"\3\2\2\2\u009c\u0091\3\2\2\2\u009c\u0098\3\2\2\2\u009d\t\3\2\2\2\u009e"+
		"\u009f\7\3\2\2\u009f\u00a0\5\24\13\2\u00a0\u00a1\5\f\7\2\u00a1\u00a2\7"+
		"\r\2\2\u00a2\u00a3\5\26\f\2\u00a3\13\3\2\2\2\u00a4\u00a5\7\17\2\2\u00a5"+
		"\u00a6\7\3\2\2\u00a6\u00a7\5\24\13\2\u00a7\u00a8\5\f\7\2\u00a8\u00aa\3"+
		"\2\2\2\u00a9\u00a4\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\r\3\2\2\2\u00ab\u00ac"+
		"\5\20\t\2\u00ac\u00ad\7\3\2\2\u00ad\u00ae\5\24\13\2\u00ae\u00af\5\22\n"+
		"\2\u00af\17\3\2\2\2\u00b0\u00b1\7\20\2\2\u00b1\u00b3\5\20\t\2\u00b2\u00b0"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\21\3\2\2\2\u00b4\u00b5\7\21\2\2\u00b5"+
		"\u00b7\5\16\b\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\23\3\2\2"+
		"\2\u00b8\u00b9\7\22\2\2\u00b9\u00ba\5N(\2\u00ba\u00bb\7\23\2\2\u00bb\u00bc"+
		"\5\24\13\2\u00bc\u00be\3\2\2\2\u00bd\u00b8\3\2\2\2\u00bd\u00be\3\2\2\2"+
		"\u00be\25\3\2\2\2\u00bf\u00c2\5$\23\2\u00c0\u00c2\5 \21\2\u00c1\u00bf"+
		"\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\27\3\2\2\2\u00c3\u00c4\7\17\2\2\u00c4"+
		"\u00c5\5\16\b\2\u00c5\u00c6\5\30\r\2\u00c6\u00c8\3\2\2\2\u00c7\u00c3\3"+
		"\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\31\3\2\2\2\u00c9\u00ca\5\n\6\2\u00ca"+
		"\u00cb\5\32\16\2\u00cb\u00cd\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cc\u00cd\3"+
		"\2\2\2\u00cd\33\3\2\2\2\u00ce\u00cf\t\2\2\2\u00cf\35\3\2\2\2\u00d0\u00d3"+
		"\5\34\17\2\u00d1\u00d3\7\3\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2"+
		"\u00d3\37\3\2\2\2\u00d4\u00d5\5\20\t\2\u00d5\u00d6\5\36\20\2\u00d6!\3"+
		"\2\2\2\u00d7\u00d8\t\3\2\2\u00d8#\3\2\2\2\u00d9\u00da\7-\2\2\u00da\u00db"+
		"\5\n\6\2\u00db\u00dc\5\32\16\2\u00dc\u00dd\7.\2\2\u00dd%\3\2\2\2\u00de"+
		"\u00df\7/\2\2\u00df\u00e0\7\3\2\2\u00e0\u00e1\7\24\2\2\u00e1\u00e2\5("+
		"\25\2\u00e2\u00e3\7\25\2\2\u00e3\u00e4\5\60\31\2\u00e4\u00e5\5\64\33\2"+
		"\u00e5\u00e6\7\60\2\2\u00e6\u00f3\3\2\2\2\u00e7\u00e8\7\61\2\2\u00e8\u00e9"+
		"\7\3\2\2\u00e9\u00ea\7\24\2\2\u00ea\u00eb\5(\25\2\u00eb\u00ec\7\25\2\2"+
		"\u00ec\u00ed\7\r\2\2\u00ed\u00ee\5 \21\2\u00ee\u00ef\5\60\31\2\u00ef\u00f0"+
		"\5\64\33\2\u00f0\u00f1\7\62\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00de\3\2\2"+
		"\2\u00f2\u00e7\3\2\2\2\u00f3\'\3\2\2\2\u00f4\u00f6\5*\26\2\u00f5\u00f4"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6)\3\2\2\2\u00f7\u00f8\5,\27\2\u00f8"+
		"\u00f9\5\16\b\2\u00f9\u00fa\5\30\r\2\u00fa\u00fb\7\r\2\2\u00fb\u00fc\5"+
		" \21\2\u00fc\u00fd\5.\30\2\u00fd+\3\2\2\2\u00fe\u0100\7\63\2\2\u00ff\u00fe"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100-\3\2\2\2\u0101\u0102\7\17\2\2\u0102"+
		"\u0104\5*\26\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104/\3\2\2\2"+
		"\u0105\u0106\5\b\5\2\u0106\u0107\5\60\31\2\u0107\u0109\3\2\2\2\u0108\u0105"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109\61\3\2\2\2\u010a\u010b\5\60\31\2\u010b"+
		"\u010c\5\64\33\2\u010c\63\3\2\2\2\u010d\u010e\5\66\34\2\u010e\u010f\5"+
		"\64\33\2\u010f\u0111\3\2\2\2\u0110\u010d\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\65\3\2\2\2\u0112\u0113\7\64\2\2\u0113\u0114\7\24\2\2\u0114\u0115\5\16"+
		"\b\2\u0115\u0116\5\30\r\2\u0116\u0117\7\25\2\2\u0117\u014d\3\2\2\2\u0118"+
		"\u0119\7\65\2\2\u0119\u011a\7\24\2\2\u011a\u011b\5l\67\2\u011b\u011c\5"+
		"8\35\2\u011c\u011d\7\25\2\2\u011d\u014d\3\2\2\2\u011e\u011f\7\66\2\2\u011f"+
		"\u0120\5l\67\2\u0120\u0121\7\67\2\2\u0121\u0122\5\64\33\2\u0122\u0123"+
		"\5:\36\2\u0123\u0124\78\2\2\u0124\u014d\3\2\2\2\u0125\u0126\79\2\2\u0126"+
		"\u0127\5N(\2\u0127\u0128\7;\2\2\u0128\u0129\5@!\2\u0129\u012a\5:\36\2"+
		"\u012a\u012b\7:\2\2\u012b\u014d\3\2\2\2\u012c\u012d\7<\2\2\u012d\u012e"+
		"\7\3\2\2\u012e\u012f\7\33\2\2\u012f\u0130\5N(\2\u0130\u0131\7=\2\2\u0131"+
		"\u0132\5N(\2\u0132\u0133\7>\2\2\u0133\u0134\5\64\33\2\u0134\u0135\7?\2"+
		"\2\u0135\u014d\3\2\2\2\u0136\u0137\7@\2\2\u0137\u0138\5l\67\2\u0138\u0139"+
		"\7>\2\2\u0139\u013a\5\64\33\2\u013a\u013b\7A\2\2\u013b\u014d\3\2\2\2\u013c"+
		"\u013d\7>\2\2\u013d\u013e\5\64\33\2\u013e\u013f\7=\2\2\u013f\u0140\5l"+
		"\67\2\u0140\u014d\3\2\2\2\u0141\u0142\7\20\2\2\u0142\u0143\7\3\2\2\u0143"+
		"\u0144\5\22\n\2\u0144\u0145\5\24\13\2\u0145\u0146\7\33\2\2\u0146\u0147"+
		"\5l\67\2\u0147\u014d\3\2\2\2\u0148\u0149\7\3\2\2\u0149\u014d\5<\37\2\u014a"+
		"\u014b\7B\2\2\u014b\u014d\5l\67\2\u014c\u0112\3\2\2\2\u014c\u0118\3\2"+
		"\2\2\u014c\u011e\3\2\2\2\u014c\u0125\3\2\2\2\u014c\u012c\3\2\2\2\u014c"+
		"\u0136\3\2\2\2\u014c\u013c\3\2\2\2\u014c\u0141\3\2\2\2\u014c\u0148\3\2"+
		"\2\2\u014c\u014a\3\2\2\2\u014d\67\3\2\2\2\u014e\u014f\7\17\2\2\u014f\u0150"+
		"\5l\67\2\u0150\u0151\58\35\2\u0151\u0153\3\2\2\2\u0152\u014e\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u01539\3\2\2\2\u0154\u0155\7C\2\2\u0155\u0157\5\64\33\2"+
		"\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157;\3\2\2\2\u0158\u0159\7"+
		"\24\2\2\u0159\u015a\5> \2\u015a\u015b\7\25\2\2\u015b\u015c\5\22\n\2\u015c"+
		"\u015d\5\24\13\2\u015d\u015e\7\33\2\2\u015e\u015f\5l\67\2\u015f=\3\2\2"+
		"\2\u0160\u0161\5l\67\2\u0161\u0162\58\35\2\u0162\u0164\3\2\2\2\u0163\u0160"+
		"\3\2\2\2\u0163\u0164\3\2\2\2\u0164?\3\2\2\2\u0165\u0166\5D#\2\u0166\u0167"+
		"\7\r\2\2\u0167\u0168\5\64\33\2\u0168\u0169\5B\"\2\u0169A\3\2\2\2\u016a"+
		"\u016c\5@!\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016cC\3\2\2\2\u016d"+
		"\u016e\5H%\2\u016e\u016f\5F$\2\u016fE\3\2\2\2\u0170\u0171\7\17\2\2\u0171"+
		"\u0173\5D#\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173G\3\2\2\2\u0174"+
		"\u0175\5L\'\2\u0175\u0176\7\5\2\2\u0176\u0177\5J&\2\u0177I\3\2\2\2\u0178"+
		"\u0179\7\26\2\2\u0179\u017a\5L\'\2\u017a\u017b\7\5\2\2\u017b\u017d\3\2"+
		"\2\2\u017c\u0178\3\2\2\2\u017c\u017d\3\2\2\2\u017dK\3\2\2\2\u017e\u0180"+
		"\7\27\2\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180M\3\2\2\2\u0181"+
		"\u0182\5T+\2\u0182\u0183\5V,\2\u0183O\3\2\2\2\u0184\u0185\t\4\2\2\u0185"+
		"Q\3\2\2\2\u0186\u0187\t\5\2\2\u0187S\3\2\2\2\u0188\u0189\5X-\2\u0189\u018a"+
		"\5Z.\2\u018aU\3\2\2\2\u018b\u018c\5R*\2\u018c\u018d\5T+\2\u018d\u018e"+
		"\5V,\2\u018e\u0190\3\2\2\2\u018f\u018b\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"W\3\2\2\2\u0191\u0192\5\\/\2\u0192\u0193\5b\62\2\u0193Y\3\2\2\2\u0194"+
		"\u0195\5P)\2\u0195\u0196\5X-\2\u0196\u0197\5Z.\2\u0197\u0199\3\2\2\2\u0198"+
		"\u0194\3\2\2\2\u0198\u0199\3\2\2\2\u0199[\3\2\2\2\u019a\u019b\5L\'\2\u019b"+
		"\u019c\5^\60\2\u019c\u019f\3\2\2\2\u019d\u019f\5`\61\2\u019e\u019a\3\2"+
		"\2\2\u019e\u019d\3\2\2\2\u019f]\3\2\2\2\u01a0\u01a1\7\20\2\2\u01a1\u01a2"+
		"\7\3\2\2\u01a2\u01a3\5\22\n\2\u01a3\u01a4\5\24\13\2\u01a4\u01ad\3\2\2"+
		"\2\u01a5\u01a6\7\3\2\2\u01a6\u01ad\5d\63\2\u01a7\u01ad\t\6\2\2\u01a8\u01a9"+
		"\7\24\2\2\u01a9\u01aa\5l\67\2\u01aa\u01ab\7\25\2\2\u01ab\u01ad\3\2\2\2"+
		"\u01ac\u01a0\3\2\2\2\u01ac\u01a5\3\2\2\2\u01ac\u01a7\3\2\2\2\u01ac\u01a8"+
		"\3\2\2\2\u01ad_\3\2\2\2\u01ae\u01af\7\34\2\2\u01af\u01b0\7\3\2\2\u01b0"+
		"\u01b1\5\22\n\2\u01b1\u01b2\5\24\13\2\u01b2\u01b5\3\2\2\2\u01b3\u01b5"+
		"\7\4\2\2\u01b4\u01ae\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5a\3\2\2\2\u01b6"+
		"\u01b7\7\35\2\2\u01b7\u01b8\5\\/\2\u01b8\u01b9\5b\62\2\u01b9\u01bb\3\2"+
		"\2\2\u01ba\u01b6\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bbc\3\2\2\2\u01bc\u01bd"+
		"\7\24\2\2\u01bd\u01be\5l\67\2\u01be\u01bf\58\35\2\u01bf\u01c0\7\25\2\2"+
		"\u01c0\u01c6\3\2\2\2\u01c1\u01c2\5\22\n\2\u01c2\u01c3\5\24\13\2\u01c3"+
		"\u01c6\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01bc\3\2\2\2\u01c5\u01c1\3\2"+
		"\2\2\u01c5\u01c4\3\2\2\2\u01c6e\3\2\2\2\u01c7\u01c8\5N(\2\u01c8\u01c9"+
		"\5h\65\2\u01c9g\3\2\2\2\u01ca\u01cb\5j\66\2\u01cb\u01cc\5N(\2\u01cc\u01ce"+
		"\3\2\2\2\u01cd\u01ca\3\2\2\2\u01cd\u01ce\3\2\2\2\u01cei\3\2\2\2\u01cf"+
		"\u01d0\t\7\2\2\u01d0k\3\2\2\2\u01d1\u01d2\5p9\2\u01d2\u01d3\5r:\2\u01d3"+
		"m\3\2\2\2\u01d4\u01d6\7$\2\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6"+
		"o\3\2\2\2\u01d7\u01d8\5v<\2\u01d8\u01d9\5t;\2\u01d9q\3\2\2\2\u01da\u01db"+
		"\7)\2\2\u01db\u01dc\5p9\2\u01dc\u01dd\5r:\2\u01dd\u01df\3\2\2\2\u01de"+
		"\u01da\3\2\2\2\u01de\u01df\3\2\2\2\u01dfs\3\2\2\2\u01e0\u01e1\7*\2\2\u01e1"+
		"\u01e2\5v<\2\u01e2\u01e3\5t;\2\u01e3\u01e5\3\2\2\2\u01e4\u01e0\3\2\2\2"+
		"\u01e4\u01e5\3\2\2\2\u01e5u\3\2\2\2\u01e6\u01e7\5n8\2\u01e7\u01e8\5x="+
		"\2\u01e8w\3\2\2\2\u01e9\u01ec\t\b\2\2\u01ea\u01ec\5f\64\2\u01eb\u01e9"+
		"\3\2\2\2\u01eb\u01ea\3\2\2\2\u01ecy\3\2\2\2\'\u0082\u0086\u009c\u00a9"+
		"\u00b2\u00b6\u00bd\u00c1\u00c7\u00cc\u00d2\u00f2\u00f5\u00ff\u0103\u0108"+
		"\u0110\u014c\u0152\u0156\u0163\u016b\u0172\u017c\u017f\u018f\u0198\u019e"+
		"\u01ac\u01b4\u01ba\u01c5\u01cd\u01d5\u01de\u01e4\u01eb";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}