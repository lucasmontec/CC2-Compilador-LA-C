// Generated from C:\Users\Lucas\git\CC2-Compilador-LA-C\CC2-Compilador-LA-C\src\grammars\LAGrammar1.g4 by ANTLR 4.1
package antlr;

  import Semantic.TokenSymbol;
  import Semantic.TokenSymbolTable;
  import static Semantic.SemanticUtil.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LAGrammar1Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALGORITMO=1, FIM_ALGORITMO=2, DECLARE=3, CONSTANTE=4, COLON=5, TIPO=6, 
		COMMA=7, UP_HAT=8, DOT=9, LBRACKET=10, RBRACKET=11, LPARENTHESIS=12, RPARENTHESIS=13, 
		TWODOTS=14, MINUS=15, PLUS=16, MULT=17, DIV=18, ARROW=19, COMMERCIAL_E=20, 
		PERCENT=21, EQUALS=22, DIFFERENT=23, GREATERTHANEQ=24, LESSTHANEQ=25, 
		GREATERTHAN=26, LESSTHAN=27, NOT=28, LITERAL=29, INTEIRO=30, REAL=31, 
		LOGICO=32, OR=33, AND=34, VERDADEIRO=35, FALSO=36, REGISTRO=37, FIM_REGISTRO=38, 
		PROCEDIMENTO=39, FIM_PROCEDIMENTO=40, FUNCAO=41, FIM_FUNCAO=42, VAR=43, 
		LEIA=44, ESCREVA=45, SE=46, ENTAO=47, FIMSE=48, CASO=49, FIMCASO=50, SEJA=51, 
		PARA=52, ATE=53, FACA=54, FIMPARA=55, ENQUANTO=56, FIMENQUANTO=57, RETORNE=58, 
		SENAO=59, CADEIA=60, NUM_INT=61, NUM_REAL=62, IDENT=63, COMMENT=64, WSNL=65;
	public static final String[] tokenNames = {
		"<INVALID>", "'algoritmo'", "'fim_algoritmo'", "'declare'", "'constante'", 
		"':'", "'tipo'", "','", "'^'", "'.'", "'['", "']'", "'('", "')'", "'..'", 
		"'-'", "'+'", "'*'", "'/'", "'<-'", "'&'", "'%'", "'='", "'<>'", "'>='", 
		"'<='", "'>'", "'<'", "'nao'", "'literal'", "'inteiro'", "'real'", "'logico'", 
		"'ou'", "'e'", "'verdadeiro'", "'falso'", "'registro'", "'fim_registro'", 
		"'procedimento'", "'fim_procedimento'", "'funcao'", "'fim_funcao'", "'var'", 
		"'leia'", "'escreva'", "'se'", "'entao'", "'fim_se'", "'caso'", "'fim_caso'", 
		"'seja'", "'para'", "'ate'", "'faca'", "'fim_para'", "'enquanto'", "'fim_enquanto'", 
		"'retorne'", "'senao'", "CADEIA", "NUM_INT", "NUM_REAL", "IDENT", "COMMENT", 
		"WSNL"
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
	public String getGrammarFileName() { return "LAGrammar1.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public LAGrammar1Parser(TokenStream input) {
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
		public TerminalNode ALGORITMO() { return getToken(LAGrammar1Parser.ALGORITMO, 0); }
		public TerminalNode FIM_ALGORITMO() { return getToken(LAGrammar1Parser.FIM_ALGORITMO, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 push(new TokenSymbolTable("decl_globais")); 
			setState(121); declaracoes();
			setState(122); match(ALGORITMO);
			setState(123); corpo();
			 printSemanticTable(); 
			setState(125); match(FIM_ALGORITMO);

			             if(hasErrors())
			                printErrors();
			             pop();/*Decl globais*/
			             
			}
		}
		catch (RecognitionException re) {
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
		public List<Decl_local_globalContext> decl_local_global() {
			return getRuleContexts(Decl_local_globalContext.class);
		}
		public Decl_local_globalContext decl_local_global(int i) {
			return getRuleContext(Decl_local_globalContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitDeclaracoes(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO) | (1L << PROCEDIMENTO) | (1L << FUNCAO))) != 0)) {
				{
				{
				setState(128); decl_local_global();
				}
				}
				setState(133);
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
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterDecl_local_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitDecl_local_global(this);
		}
	}

	public final Decl_local_globalContext decl_local_global() throws RecognitionException {
		Decl_local_globalContext _localctx = new Decl_local_globalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_local_global);
		try {
			setState(136);
			switch (_input.LA(1)) {
			case DECLARE:
			case CONSTANTE:
			case TIPO:
				enterOuterAlt(_localctx, 1);
				{
				setState(134); declaracao_local();
				}
				break;
			case PROCEDIMENTO:
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(135); declaracao_global();
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
		public VariavelContext variavel;
		public TerminalNode EQUALS() { return getToken(LAGrammar1Parser.EQUALS, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode DECLARE() { return getToken(LAGrammar1Parser.DECLARE, 0); }
		public TerminalNode TIPO() { return getToken(LAGrammar1Parser.TIPO, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LAGrammar1Parser.COLON, 0); }
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public TerminalNode CONSTANTE() { return getToken(LAGrammar1Parser.CONSTANTE, 0); }
		public TerminalNode IDENT() { return getToken(LAGrammar1Parser.IDENT, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterDeclaracao_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitDeclaracao_local(this);
		}
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_local);
		try {
			setState(160);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138); match(DECLARE);
				setState(139); ((Declaracao_localContext)_localctx).variavel = variavel();

				     top().addTokens(((Declaracao_localContext)_localctx).variavel.names,((Declaracao_localContext)_localctx).variavel.t);
				    
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142); match(CONSTANTE);
				setState(143); match(IDENT);
				setState(144); match(COLON);
				setState(145); tipo_basico();
				setState(146); match(EQUALS);
				setState(147); valor_constante();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149); match(TIPO);
				setState(150); match(IDENT);
				setState(151); match(COLON);
				setState(152); tipo_basico();
				setState(153); match(EQUALS);
				setState(154); valor_constante();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156); match(TIPO);
				setState(157); match(IDENT);
				setState(158); match(COLON);
				setState(159); tipo();
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
		public List<String> names;
		public String t;
		public Token IDENT;
		public Mais_varContext mais_var;
		public TipoContext tipo;
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LAGrammar1Parser.COLON, 0); }
		public Mais_varContext mais_var() {
			return getRuleContext(Mais_varContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAGrammar1Parser.IDENT, 0); }
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitVariavel(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variavel);
		 ((VariavelContext)_localctx).names =  new ArrayList<>(); ((VariavelContext)_localctx).t =  ""; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); ((VariavelContext)_localctx).IDENT = match(IDENT);
			setState(163); dimensao();
			setState(164); ((VariavelContext)_localctx).mais_var = mais_var();
			setState(165); match(COLON);
			setState(166); ((VariavelContext)_localctx).tipo = tipo();

			             ((VariavelContext)_localctx).t =  ((VariavelContext)_localctx).tipo.val;
			             _localctx.names.add((((VariavelContext)_localctx).IDENT!=null?((VariavelContext)_localctx).IDENT.getText():null));
			             _localctx.names.addAll(((VariavelContext)_localctx).mais_var.nomes);
			             
			}
		}
		catch (RecognitionException re) {
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
		public List<String> nomes;
		public Token IDENT;
		public DimensaoContext dimensao(int i) {
			return getRuleContext(DimensaoContext.class,i);
		}
		public List<DimensaoContext> dimensao() {
			return getRuleContexts(DimensaoContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(LAGrammar1Parser.COMMA); }
		public TerminalNode IDENT(int i) {
			return getToken(LAGrammar1Parser.IDENT, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(LAGrammar1Parser.COMMA, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(LAGrammar1Parser.IDENT); }
		public Mais_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterMais_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitMais_var(this);
		}
	}

	public final Mais_varContext mais_var() throws RecognitionException {
		Mais_varContext _localctx = new Mais_varContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mais_var);
		 ((Mais_varContext)_localctx).nomes =  new ArrayList<String>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(169); match(COMMA);
				setState(170); ((Mais_varContext)_localctx).IDENT = match(IDENT);
				 _localctx.nomes.add((((Mais_varContext)_localctx).IDENT!=null?((Mais_varContext)_localctx).IDENT.getText():null)); 
				setState(172); dimensao();
				}
				}
				setState(177);
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

	public static class IdentificadorContext extends ParserRuleContext {
		public String nome;
		public Ponteiros_opcionaisContext ponteiros_opcionais;
		public Token IDENT;
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAGrammar1Parser.IDENT, 0); }
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitIdentificador(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identificador);
		 ((IdentificadorContext)_localctx).nome =  ""; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); ((IdentificadorContext)_localctx).ponteiros_opcionais = ponteiros_opcionais();
			setState(179); ((IdentificadorContext)_localctx).IDENT = match(IDENT);
			 ((IdentificadorContext)_localctx).nome =  ((IdentificadorContext)_localctx).ponteiros_opcionais.val + (((IdentificadorContext)_localctx).IDENT!=null?((IdentificadorContext)_localctx).IDENT.getText():null); 
			setState(181); dimensao();
			setState(182); outros_ident();
			}
		}
		catch (RecognitionException re) {
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
		public String val;
		public Token UP_HAT;
		public List<TerminalNode> UP_HAT() { return getTokens(LAGrammar1Parser.UP_HAT); }
		public TerminalNode UP_HAT(int i) {
			return getToken(LAGrammar1Parser.UP_HAT, i);
		}
		public Ponteiros_opcionaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponteiros_opcionais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterPonteiros_opcionais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitPonteiros_opcionais(this);
		}
	}

	public final Ponteiros_opcionaisContext ponteiros_opcionais() throws RecognitionException {
		Ponteiros_opcionaisContext _localctx = new Ponteiros_opcionaisContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ponteiros_opcionais);
		 ((Ponteiros_opcionaisContext)_localctx).val =  ""; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UP_HAT) {
				{
				{
				setState(184); ((Ponteiros_opcionaisContext)_localctx).UP_HAT = match(UP_HAT);
				 _localctx.val += (((Ponteiros_opcionaisContext)_localctx).UP_HAT!=null?((Ponteiros_opcionaisContext)_localctx).UP_HAT.getText():null); 
				}
				}
				setState(190);
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

	public static class Outros_identContext extends ParserRuleContext {
		public String lastName;
		public IdentificadorContext identificador;
		public TerminalNode DOT() { return getToken(LAGrammar1Parser.DOT, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Outros_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterOutros_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitOutros_ident(this);
		}
	}

	public final Outros_identContext outros_ident() throws RecognitionException {
		Outros_identContext _localctx = new Outros_identContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_outros_ident);
		 ((Outros_identContext)_localctx).lastName =  ""; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(191); match(DOT);
				setState(192); ((Outros_identContext)_localctx).identificador = identificador();
				 ((Outros_identContext)_localctx).lastName = ((Outros_identContext)_localctx).identificador.nome; 
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
		public List<TerminalNode> RBRACKET() { return getTokens(LAGrammar1Parser.RBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(LAGrammar1Parser.LBRACKET, i);
		}
		public TerminalNode RBRACKET(int i) {
			return getToken(LAGrammar1Parser.RBRACKET, i);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(LAGrammar1Parser.LBRACKET); }
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitDimensao(this);
		}
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dimensao);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(197); match(LBRACKET);
					setState(198); exp_aritmetica();
					setState(199); match(RBRACKET);
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		public String val;
		public RegistroContext registro;
		public Tipo_estendidoContext tipo_estendido;
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
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo);
		 ((TipoContext)_localctx).val =  ""; 
		try {
			setState(212);
			switch (_input.LA(1)) {
			case REGISTRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(206); ((TipoContext)_localctx).registro = registro();

				              ((TipoContext)_localctx).val = ((TipoContext)_localctx).registro.val;
				              /*match de string da definicao de registro*/
				              
				}
				break;
			case UP_HAT:
			case LITERAL:
			case INTEIRO:
			case REAL:
			case LOGICO:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(209); ((TipoContext)_localctx).tipo_estendido = tipo_estendido();
				 ((TipoContext)_localctx).val = ((TipoContext)_localctx).tipo_estendido.val; 
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
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LAGrammar1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LAGrammar1Parser.COMMA, i);
		}
		public Mais_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterMais_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitMais_ident(this);
		}
	}

	public final Mais_identContext mais_ident() throws RecognitionException {
		Mais_identContext _localctx = new Mais_identContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mais_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(214); match(COMMA);
				setState(215); identificador();
				}
				}
				setState(220);
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

	public static class Mais_variaveisContext extends ParserRuleContext {
		public List<String> tipos;
		public VariavelContext variavel;
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public Mais_variaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_variaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterMais_variaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitMais_variaveis(this);
		}
	}

	public final Mais_variaveisContext mais_variaveis() throws RecognitionException {
		Mais_variaveisContext _localctx = new Mais_variaveisContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mais_variaveis);
		 ((Mais_variaveisContext)_localctx).tipos =  new ArrayList<>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(221); ((Mais_variaveisContext)_localctx).variavel = variavel();
				_localctx.tipos.add(((Mais_variaveisContext)_localctx).variavel.t);
				}
				}
				setState(228);
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

	public static class Tipo_basicoContext extends ParserRuleContext {
		public String val;
		public Token LITERAL;
		public Token INTEIRO;
		public Token REAL;
		public Token LOGICO;
		public TerminalNode REAL() { return getToken(LAGrammar1Parser.REAL, 0); }
		public TerminalNode INTEIRO() { return getToken(LAGrammar1Parser.INTEIRO, 0); }
		public TerminalNode LOGICO() { return getToken(LAGrammar1Parser.LOGICO, 0); }
		public TerminalNode LITERAL() { return getToken(LAGrammar1Parser.LITERAL, 0); }
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterTipo_basico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitTipo_basico(this);
		}
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo_basico);
		 ((Tipo_basicoContext)_localctx).val =  ""; 
		try {
			setState(237);
			switch (_input.LA(1)) {
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(229); ((Tipo_basicoContext)_localctx).LITERAL = match(LITERAL);
				 ((Tipo_basicoContext)_localctx).val = (((Tipo_basicoContext)_localctx).LITERAL!=null?((Tipo_basicoContext)_localctx).LITERAL.getText():null); 
				}
				break;
			case INTEIRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(231); ((Tipo_basicoContext)_localctx).INTEIRO = match(INTEIRO);
				 ((Tipo_basicoContext)_localctx).val = (((Tipo_basicoContext)_localctx).INTEIRO!=null?((Tipo_basicoContext)_localctx).INTEIRO.getText():null); 
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(233); ((Tipo_basicoContext)_localctx).REAL = match(REAL);
				 ((Tipo_basicoContext)_localctx).val = (((Tipo_basicoContext)_localctx).REAL!=null?((Tipo_basicoContext)_localctx).REAL.getText():null); 
				}
				break;
			case LOGICO:
				enterOuterAlt(_localctx, 4);
				{
				setState(235); ((Tipo_basicoContext)_localctx).LOGICO = match(LOGICO);
				 ((Tipo_basicoContext)_localctx).val = (((Tipo_basicoContext)_localctx).LOGICO!=null?((Tipo_basicoContext)_localctx).LOGICO.getText():null); 
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

	public static class Tipo_basico_identContext extends ParserRuleContext {
		public String val;
		public Tipo_basicoContext tipo_basico;
		public Token IDENT;
		public TerminalNode IDENT() { return getToken(LAGrammar1Parser.IDENT, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public Tipo_basico_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterTipo_basico_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitTipo_basico_ident(this);
		}
	}

	public final Tipo_basico_identContext tipo_basico_ident() throws RecognitionException {
		Tipo_basico_identContext _localctx = new Tipo_basico_identContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipo_basico_ident);
		 ((Tipo_basico_identContext)_localctx).val =  ""; 
		try {
			setState(244);
			switch (_input.LA(1)) {
			case LITERAL:
			case INTEIRO:
			case REAL:
			case LOGICO:
				enterOuterAlt(_localctx, 1);
				{
				setState(239); ((Tipo_basico_identContext)_localctx).tipo_basico = tipo_basico();
				 ((Tipo_basico_identContext)_localctx).val = ((Tipo_basico_identContext)_localctx).tipo_basico.val; 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(242); ((Tipo_basico_identContext)_localctx).IDENT = match(IDENT);
				 ((Tipo_basico_identContext)_localctx).val = (((Tipo_basico_identContext)_localctx).IDENT!=null?((Tipo_basico_identContext)_localctx).IDENT.getText():null); 
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
		public String val;
		public Ponteiros_opcionaisContext ponteiros_opcionais;
		public Tipo_basico_identContext tipo_basico_ident;
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
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterTipo_estendido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitTipo_estendido(this);
		}
	}

	public final Tipo_estendidoContext tipo_estendido() throws RecognitionException {
		Tipo_estendidoContext _localctx = new Tipo_estendidoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tipo_estendido);
		 ((Tipo_estendidoContext)_localctx).val =  ""; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246); ((Tipo_estendidoContext)_localctx).ponteiros_opcionais = ponteiros_opcionais();
			setState(247); ((Tipo_estendidoContext)_localctx).tipo_basico_ident = tipo_basico_ident();
			 ((Tipo_estendidoContext)_localctx).val =  ((Tipo_estendidoContext)_localctx).ponteiros_opcionais.val + ((Tipo_estendidoContext)_localctx).tipo_basico_ident.val; 
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode NUM_REAL() { return getToken(LAGrammar1Parser.NUM_REAL, 0); }
		public TerminalNode VERDADEIRO() { return getToken(LAGrammar1Parser.VERDADEIRO, 0); }
		public TerminalNode CADEIA() { return getToken(LAGrammar1Parser.CADEIA, 0); }
		public TerminalNode FALSO() { return getToken(LAGrammar1Parser.FALSO, 0); }
		public TerminalNode NUM_INT() { return getToken(LAGrammar1Parser.NUM_INT, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterValor_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitValor_constante(this);
		}
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VERDADEIRO) | (1L << FALSO) | (1L << CADEIA) | (1L << NUM_INT) | (1L << NUM_REAL))) != 0)) ) {
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
		public String val;
		public VariavelContext variavel;
		public Mais_variaveisContext mais_variaveis;
		public Mais_variaveisContext mais_variaveis() {
			return getRuleContext(Mais_variaveisContext.class,0);
		}
		public TerminalNode REGISTRO() { return getToken(LAGrammar1Parser.REGISTRO, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode FIM_REGISTRO() { return getToken(LAGrammar1Parser.FIM_REGISTRO, 0); }
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitRegistro(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_registro);
		 ((RegistroContext)_localctx).val =  "reg"; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); match(REGISTRO);
			setState(253); ((RegistroContext)_localctx).variavel = variavel();
			 _localctx.val += "["+((RegistroContext)_localctx).variavel.t; 
			setState(255); ((RegistroContext)_localctx).mais_variaveis = mais_variaveis();
			 
			                     for(String s : ((RegistroContext)_localctx).mais_variaveis.tipos){
			                        _localctx.val += ","+s;                                    
			                     }
			                    
			setState(257); match(FIM_REGISTRO);
			 _localctx.val += "]"; 
			}
		}
		catch (RecognitionException re) {
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
		public Token IDENT;
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode PROCEDIMENTO() { return getToken(LAGrammar1Parser.PROCEDIMENTO, 0); }
		public Declaracoes_locaisContext declaracoes_locais() {
			return getRuleContext(Declaracoes_locaisContext.class,0);
		}
		public TerminalNode FIM_FUNCAO() { return getToken(LAGrammar1Parser.FIM_FUNCAO, 0); }
		public Parametros_opcionalContext parametros_opcional() {
			return getRuleContext(Parametros_opcionalContext.class,0);
		}
		public TerminalNode FUNCAO() { return getToken(LAGrammar1Parser.FUNCAO, 0); }
		public TerminalNode COLON() { return getToken(LAGrammar1Parser.COLON, 0); }
		public TerminalNode FIM_PROCEDIMENTO() { return getToken(LAGrammar1Parser.FIM_PROCEDIMENTO, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(LAGrammar1Parser.LPARENTHESIS, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAGrammar1Parser.IDENT, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(LAGrammar1Parser.RPARENTHESIS, 0); }
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterDeclaracao_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitDeclaracao_global(this);
		}
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaracao_global);
		try {
			setState(284);
			switch (_input.LA(1)) {
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(260); match(PROCEDIMENTO);
				setState(261); ((Declaracao_globalContext)_localctx).IDENT = match(IDENT);
				 push(new TokenSymbolTable("PROC")); 
				setState(263); match(LPARENTHESIS);
				setState(264); parametros_opcional();
				setState(265); match(RPARENTHESIS);
				setState(266); declaracoes_locais();
				setState(267); comandos();
				setState(268); match(FIM_PROCEDIMENTO);
				 pop(); top().addToken((((Declaracao_globalContext)_localctx).IDENT!=null?((Declaracao_globalContext)_localctx).IDENT.getText():null), "PROC"); 
				}
				break;
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(271); match(FUNCAO);
				setState(272); ((Declaracao_globalContext)_localctx).IDENT = match(IDENT);
				 push(new TokenSymbolTable("FUNC")); 
				setState(274); match(LPARENTHESIS);
				setState(275); parametros_opcional();
				setState(276); match(RPARENTHESIS);
				setState(277); match(COLON);
				setState(278); tipo_estendido();
				setState(279); declaracoes_locais();
				setState(280); comandos();
				setState(281); match(FIM_FUNCAO);
				 pop(); top().addToken((((Declaracao_globalContext)_localctx).IDENT!=null?((Declaracao_globalContext)_localctx).IDENT.getText():null), "FUNC"); 
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
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterParametros_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitParametros_opcional(this);
		}
	}

	public final Parametros_opcionalContext parametros_opcional() throws RecognitionException {
		Parametros_opcionalContext _localctx = new Parametros_opcionalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parametros_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP_HAT) | (1L << VAR) | (1L << IDENT))) != 0)) {
				{
				setState(286); parametro();
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
		public TerminalNode COLON() { return getToken(LAGrammar1Parser.COLON, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289); var_opcional();
			setState(290); identificador();
			setState(291); mais_ident();
			setState(292); match(COLON);
			setState(293); tipo_estendido();
			setState(294); mais_parametros();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode VAR() { return getToken(LAGrammar1Parser.VAR, 0); }
		public Var_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterVar_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitVar_opcional(this);
		}
	}

	public final Var_opcionalContext var_opcional() throws RecognitionException {
		Var_opcionalContext _localctx = new Var_opcionalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(296); match(VAR);
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
		public TerminalNode COMMA() { return getToken(LAGrammar1Parser.COMMA, 0); }
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public Mais_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterMais_parametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitMais_parametros(this);
		}
	}

	public final Mais_parametrosContext mais_parametros() throws RecognitionException {
		Mais_parametrosContext _localctx = new Mais_parametrosContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mais_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(299); match(COMMA);
				setState(300); parametro();
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
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public Declaracoes_locaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes_locais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterDeclaracoes_locais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitDeclaracoes_locais(this);
		}
	}

	public final Declaracoes_locaisContext declaracoes_locais() throws RecognitionException {
		Declaracoes_locaisContext _localctx = new Declaracoes_locaisContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declaracoes_locais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO))) != 0)) {
				{
				{
				setState(303); declaracao_local();
				}
				}
				setState(308);
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
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitCorpo(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309); declaracoes_locais();
			setState(310); comandos();
			}
		}
		catch (RecognitionException re) {
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
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitComandos(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP_HAT) | (1L << LEIA) | (1L << ESCREVA) | (1L << SE) | (1L << CASO) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << RETORNE) | (1L << IDENT))) != 0)) {
				{
				{
				setState(312); cmd();
				}
				}
				setState(317);
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

	public static class CmdContext extends ParserRuleContext {
		public Token IDENT;
		public Token RETORNE;
		public TerminalNode UP_HAT() { return getToken(LAGrammar1Parser.UP_HAT, 0); }
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public Senao_opcionalContext senao_opcional() {
			return getRuleContext(Senao_opcionalContext.class,0);
		}
		public TerminalNode FIMSE() { return getToken(LAGrammar1Parser.FIMSE, 0); }
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public TerminalNode FIMENQUANTO() { return getToken(LAGrammar1Parser.FIMENQUANTO, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAGrammar1Parser.IDENT, 0); }
		public TerminalNode ARROW() { return getToken(LAGrammar1Parser.ARROW, 0); }
		public Chamada_atribuicaoContext chamada_atribuicao() {
			return getRuleContext(Chamada_atribuicaoContext.class,0);
		}
		public TerminalNode FIMCASO() { return getToken(LAGrammar1Parser.FIMCASO, 0); }
		public TerminalNode ENQUANTO() { return getToken(LAGrammar1Parser.ENQUANTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ATE() { return getToken(LAGrammar1Parser.ATE, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(LAGrammar1Parser.LPARENTHESIS, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode RETORNE() { return getToken(LAGrammar1Parser.RETORNE, 0); }
		public TerminalNode LEIA() { return getToken(LAGrammar1Parser.LEIA, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(LAGrammar1Parser.RPARENTHESIS, 0); }
		public TerminalNode FACA() { return getToken(LAGrammar1Parser.FACA, 0); }
		public Mais_identContext mais_ident() {
			return getRuleContext(Mais_identContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TerminalNode PARA() { return getToken(LAGrammar1Parser.PARA, 0); }
		public TerminalNode ENTAO() { return getToken(LAGrammar1Parser.ENTAO, 0); }
		public TerminalNode SE() { return getToken(LAGrammar1Parser.SE, 0); }
		public TerminalNode ESCREVA() { return getToken(LAGrammar1Parser.ESCREVA, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode FIMPARA() { return getToken(LAGrammar1Parser.FIMPARA, 0); }
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public TerminalNode SEJA() { return getToken(LAGrammar1Parser.SEJA, 0); }
		public TerminalNode CASO() { return getToken(LAGrammar1Parser.CASO, 0); }
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cmd);
		try {
			setState(381);
			switch (_input.LA(1)) {
			case LEIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(318); match(LEIA);
				setState(319); match(LPARENTHESIS);
				setState(320); identificador();
				setState(321); mais_ident();
				setState(322); match(RPARENTHESIS);
				}
				break;
			case ESCREVA:
				enterOuterAlt(_localctx, 2);
				{
				setState(324); match(ESCREVA);
				setState(325); match(LPARENTHESIS);
				setState(326); expressao();
				setState(327); mais_expressao();
				setState(328); match(RPARENTHESIS);
				}
				break;
			case SE:
				enterOuterAlt(_localctx, 3);
				{
				setState(330); match(SE);
				setState(331); expressao();
				setState(332); match(ENTAO);
				setState(333); comandos();
				setState(334); senao_opcional();
				setState(335); match(FIMSE);
				}
				break;
			case CASO:
				enterOuterAlt(_localctx, 4);
				{
				setState(337); match(CASO);
				setState(338); exp_aritmetica();
				setState(339); match(SEJA);
				setState(340); selecao();
				setState(341); senao_opcional();
				setState(342); match(FIMCASO);
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 5);
				{
				setState(344); match(PARA);
				setState(345); match(IDENT);
				setState(346); match(ARROW);
				setState(347); exp_aritmetica();
				setState(348); match(ATE);
				setState(349); exp_aritmetica();
				setState(350); match(FACA);
				setState(351); comandos();
				setState(352); match(FIMPARA);
				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 6);
				{
				setState(354); match(ENQUANTO);
				setState(355); expressao();
				setState(356); match(FACA);
				setState(357); comandos();
				setState(358); match(FIMENQUANTO);
				}
				break;
			case FACA:
				enterOuterAlt(_localctx, 7);
				{
				setState(360); match(FACA);
				setState(361); comandos();
				setState(362); match(ATE);
				setState(363); expressao();
				}
				break;
			case UP_HAT:
				enterOuterAlt(_localctx, 8);
				{
				setState(365); match(UP_HAT);
				setState(366); ((CmdContext)_localctx).IDENT = match(IDENT);
				setState(367); outros_ident();
				setState(368); dimensao();
				setState(369); match(ARROW);
				setState(370); expressao();

				        if(!isTokenPresent((((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null)))
				            error("Ponteiro nao declarado: "+(((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null),((CmdContext)_localctx).IDENT.getLine());
				       
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 9);
				{
				setState(373); ((CmdContext)_localctx).IDENT = match(IDENT);
				setState(374); chamada_atribuicao();

				        if(!isTokenPresent((((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null)))
				            error("Variavel nao declarada: "+(((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null),((CmdContext)_localctx).IDENT.getLine());
				       
				}
				break;
			case RETORNE:
				enterOuterAlt(_localctx, 10);
				{
				setState(377); ((CmdContext)_localctx).RETORNE = match(RETORNE);
				setState(378); expressao();
				 if(!top().getScope().equals("FUNC"))
				            error("retorne em local inadequado.",((CmdContext)_localctx).RETORNE.getLine());
				       
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
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(LAGrammar1Parser.COMMA); }
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(LAGrammar1Parser.COMMA, i);
		}
		public Mais_expressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterMais_expressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitMais_expressao(this);
		}
	}

	public final Mais_expressaoContext mais_expressao() throws RecognitionException {
		Mais_expressaoContext _localctx = new Mais_expressaoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mais_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(383); match(COMMA);
				setState(384); expressao();
				}
				}
				setState(389);
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

	public static class Senao_opcionalContext extends ParserRuleContext {
		public TerminalNode SENAO() { return getToken(LAGrammar1Parser.SENAO, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Senao_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterSenao_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitSenao_opcional(this);
		}
	}

	public final Senao_opcionalContext senao_opcional() throws RecognitionException {
		Senao_opcionalContext _localctx = new Senao_opcionalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_senao_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(390); match(SENAO);
				setState(391); comandos();
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
		public TerminalNode LPARENTHESIS() { return getToken(LAGrammar1Parser.LPARENTHESIS, 0); }
		public Argumentos_opcionalContext argumentos_opcional() {
			return getRuleContext(Argumentos_opcionalContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(LAGrammar1Parser.RPARENTHESIS, 0); }
		public TerminalNode ARROW() { return getToken(LAGrammar1Parser.ARROW, 0); }
		public Chamada_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterChamada_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitChamada_atribuicao(this);
		}
	}

	public final Chamada_atribuicaoContext chamada_atribuicao() throws RecognitionException {
		Chamada_atribuicaoContext _localctx = new Chamada_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_chamada_atribuicao);
		try {
			setState(403);
			switch (_input.LA(1)) {
			case LPARENTHESIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(394); match(LPARENTHESIS);
				setState(395); argumentos_opcional();
				setState(396); match(RPARENTHESIS);
				}
				break;
			case DOT:
			case LBRACKET:
			case ARROW:
				enterOuterAlt(_localctx, 2);
				{
				setState(398); outros_ident();
				setState(399); dimensao();
				setState(400); match(ARROW);
				setState(401); expressao();
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
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterArgumentos_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitArgumentos_opcional(this);
		}
	}

	public final Argumentos_opcionalContext argumentos_opcional() throws RecognitionException {
		Argumentos_opcionalContext _localctx = new Argumentos_opcionalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_argumentos_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP_HAT) | (1L << LPARENTHESIS) | (1L << MINUS) | (1L << COMMERCIAL_E) | (1L << NOT) | (1L << VERDADEIRO) | (1L << FALSO) | (1L << CADEIA) | (1L << NUM_INT) | (1L << NUM_REAL) | (1L << IDENT))) != 0)) {
				{
				setState(405); expressao();
				setState(406); mais_expressao();
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
		public TerminalNode COLON() { return getToken(LAGrammar1Parser.COLON, 0); }
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
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitSelecao(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_selecao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410); constantes();
			setState(411); match(COLON);
			setState(412); comandos();
			setState(413); mais_selecao();
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterMais_selecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitMais_selecao(this);
		}
	}

	public final Mais_selecaoContext mais_selecao() throws RecognitionException {
		Mais_selecaoContext _localctx = new Mais_selecaoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mais_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_la = _input.LA(1);
			if (_la==MINUS || _la==NUM_INT) {
				{
				setState(415); selecao();
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
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitConstantes(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constantes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418); numero_intervalo();
			setState(419); mais_constantes();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COMMA() { return getToken(LAGrammar1Parser.COMMA, 0); }
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public Mais_constantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterMais_constantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitMais_constantes(this);
		}
	}

	public final Mais_constantesContext mais_constantes() throws RecognitionException {
		Mais_constantesContext _localctx = new Mais_constantesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mais_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(421); match(COMMA);
				setState(422); constantes();
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
		public TerminalNode NUM_INT() { return getToken(LAGrammar1Parser.NUM_INT, 0); }
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterNumero_intervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitNumero_intervalo(this);
		}
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_numero_intervalo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425); op_unario();
			setState(426); match(NUM_INT);
			setState(427); intervalo_opcional();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode TWODOTS() { return getToken(LAGrammar1Parser.TWODOTS, 0); }
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(LAGrammar1Parser.NUM_INT, 0); }
		public Intervalo_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalo_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterIntervalo_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitIntervalo_opcional(this);
		}
	}

	public final Intervalo_opcionalContext intervalo_opcional() throws RecognitionException {
		Intervalo_opcionalContext _localctx = new Intervalo_opcionalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_intervalo_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_la = _input.LA(1);
			if (_la==TWODOTS) {
				{
				setState(429); match(TWODOTS);
				setState(430); op_unario();
				setState(431); match(NUM_INT);
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
		public TerminalNode MINUS() { return getToken(LAGrammar1Parser.MINUS, 0); }
		public Op_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterOp_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitOp_unario(this);
		}
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_op_unario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(435); match(MINUS);
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
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterExp_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitExp_aritmetica(this);
		}
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exp_aritmetica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438); termo();
			setState(439); outros_termos();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode MULT() { return getToken(LAGrammar1Parser.MULT, 0); }
		public TerminalNode DIV() { return getToken(LAGrammar1Parser.DIV, 0); }
		public Op_multiplicacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_multiplicacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterOp_multiplicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitOp_multiplicacao(this);
		}
	}

	public final Op_multiplicacaoContext op_multiplicacao() throws RecognitionException {
		Op_multiplicacaoContext _localctx = new Op_multiplicacaoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_op_multiplicacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
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
		public TerminalNode PLUS() { return getToken(LAGrammar1Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LAGrammar1Parser.MINUS, 0); }
		public Op_adicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_adicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterOp_adicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitOp_adicao(this);
		}
	}

	public final Op_adicaoContext op_adicao() throws RecognitionException {
		Op_adicaoContext _localctx = new Op_adicaoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_op_adicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
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
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_termo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445); fator();
			setState(446); outros_fatores();
			}
		}
		catch (RecognitionException re) {
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
		public Op_adicaoContext op_adicao(int i) {
			return getRuleContext(Op_adicaoContext.class,i);
		}
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<Op_adicaoContext> op_adicao() {
			return getRuleContexts(Op_adicaoContext.class);
		}
		public Outros_termosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_termos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterOutros_termos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitOutros_termos(this);
		}
	}

	public final Outros_termosContext outros_termos() throws RecognitionException {
		Outros_termosContext _localctx = new Outros_termosContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_outros_termos);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(448); op_adicao();
					setState(449); termo();
					}
					} 
				}
				setState(455);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_fator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456); parcela();
			setState(457); outras_parcelas();
			}
		}
		catch (RecognitionException re) {
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
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public List<Op_multiplicacaoContext> op_multiplicacao() {
			return getRuleContexts(Op_multiplicacaoContext.class);
		}
		public Op_multiplicacaoContext op_multiplicacao(int i) {
			return getRuleContext(Op_multiplicacaoContext.class,i);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public Outros_fatoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_fatores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterOutros_fatores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitOutros_fatores(this);
		}
	}

	public final Outros_fatoresContext outros_fatores() throws RecognitionException {
		Outros_fatoresContext _localctx = new Outros_fatoresContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_outros_fatores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(459); op_multiplicacao();
				setState(460); fator();
				}
				}
				setState(466);
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
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitParcela(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_parcela);
		try {
			setState(471);
			switch (_input.LA(1)) {
			case UP_HAT:
			case LPARENTHESIS:
			case MINUS:
			case NUM_INT:
			case NUM_REAL:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(467); op_unario();
				setState(468); parcela_unario();
				}
				break;
			case COMMERCIAL_E:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(470); parcela_nao_unario();
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
		public TerminalNode UP_HAT() { return getToken(LAGrammar1Parser.UP_HAT, 0); }
		public TerminalNode NUM_REAL() { return getToken(LAGrammar1Parser.NUM_REAL, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Chamada_partesContext chamada_partes() {
			return getRuleContext(Chamada_partesContext.class,0);
		}
		public TerminalNode LPARENTHESIS() { return getToken(LAGrammar1Parser.LPARENTHESIS, 0); }
		public TerminalNode NUM_INT() { return getToken(LAGrammar1Parser.NUM_INT, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAGrammar1Parser.IDENT, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(LAGrammar1Parser.RPARENTHESIS, 0); }
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterParcela_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitParcela_unario(this);
		}
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_parcela_unario);
		int _la;
		try {
			setState(485);
			switch (_input.LA(1)) {
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				_la = _input.LA(1);
				if ( !(_la==NUM_INT || _la==NUM_REAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case UP_HAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(474); match(UP_HAT);
				setState(475); match(IDENT);
				setState(476); outros_ident();
				setState(477); dimensao();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(479); match(IDENT);
				setState(480); chamada_partes();
				}
				break;
			case LPARENTHESIS:
				enterOuterAlt(_localctx, 4);
				{
				setState(481); match(LPARENTHESIS);
				setState(482); expressao();
				setState(483); match(RPARENTHESIS);
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
		public TerminalNode CADEIA() { return getToken(LAGrammar1Parser.CADEIA, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAGrammar1Parser.IDENT, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterParcela_nao_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitParcela_nao_unario(this);
		}
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parcela_nao_unario);
		try {
			setState(493);
			switch (_input.LA(1)) {
			case COMMERCIAL_E:
				enterOuterAlt(_localctx, 1);
				{
				setState(487); match(COMMERCIAL_E);
				setState(488); match(IDENT);
				setState(489); outros_ident();
				setState(490); dimensao();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(492); match(CADEIA);
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
		public ParcelaContext parcela(int i) {
			return getRuleContext(ParcelaContext.class,i);
		}
		public List<ParcelaContext> parcela() {
			return getRuleContexts(ParcelaContext.class);
		}
		public Outras_parcelasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outras_parcelas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterOutras_parcelas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitOutras_parcelas(this);
		}
	}

	public final Outras_parcelasContext outras_parcelas() throws RecognitionException {
		Outras_parcelasContext _localctx = new Outras_parcelasContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_outras_parcelas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PERCENT) {
				{
				{
				setState(495); match(PERCENT);
				setState(496); parcela();
				}
				}
				setState(501);
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
		public TerminalNode LPARENTHESIS() { return getToken(LAGrammar1Parser.LPARENTHESIS, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode RPARENTHESIS() { return getToken(LAGrammar1Parser.RPARENTHESIS, 0); }
		public Chamada_partesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_partes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterChamada_partes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitChamada_partes(this);
		}
	}

	public final Chamada_partesContext chamada_partes() throws RecognitionException {
		Chamada_partesContext _localctx = new Chamada_partesContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_chamada_partes);
		try {
			setState(510);
			switch (_input.LA(1)) {
			case LPARENTHESIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(502); match(LPARENTHESIS);
				setState(503); expressao();
				setState(504); mais_expressao();
				setState(505); match(RPARENTHESIS);
				}
				break;
			case FIM_ALGORITMO:
			case COMMA:
			case UP_HAT:
			case DOT:
			case LBRACKET:
			case RBRACKET:
			case RPARENTHESIS:
			case MINUS:
			case PLUS:
			case MULT:
			case DIV:
			case PERCENT:
			case EQUALS:
			case DIFFERENT:
			case GREATERTHANEQ:
			case LESSTHANEQ:
			case GREATERTHAN:
			case LESSTHAN:
			case OR:
			case AND:
			case FIM_PROCEDIMENTO:
			case FIM_FUNCAO:
			case LEIA:
			case ESCREVA:
			case SE:
			case ENTAO:
			case FIMSE:
			case CASO:
			case FIMCASO:
			case SEJA:
			case PARA:
			case ATE:
			case FACA:
			case FIMPARA:
			case ENQUANTO:
			case FIMENQUANTO:
			case RETORNE:
			case SENAO:
			case NUM_INT:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(507); outros_ident();
				setState(508); dimensao();
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
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterExp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitExp_relacional(this);
		}
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_exp_relacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512); exp_aritmetica();
			setState(513); op_opcional();
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterOp_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitOp_opcional(this);
		}
	}

	public final Op_opcionalContext op_opcional() throws RecognitionException {
		Op_opcionalContext _localctx = new Op_opcionalContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_op_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << DIFFERENT) | (1L << GREATERTHANEQ) | (1L << LESSTHANEQ) | (1L << GREATERTHAN) | (1L << LESSTHAN))) != 0)) {
				{
				setState(515); op_relacional();
				setState(516); exp_aritmetica();
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
		public TerminalNode EQUALS() { return getToken(LAGrammar1Parser.EQUALS, 0); }
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitOp_relacional(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
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
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522); termo_logico();
			setState(523); outros_termos_logicos();
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterOp_nao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitOp_nao(this);
		}
	}

	public final Op_naoContext op_nao() throws RecognitionException {
		Op_naoContext _localctx = new Op_naoContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_op_nao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(525); match(NOT);
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
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitTermo_logico(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_termo_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528); fator_logico();
			setState(529); outros_fatores_logicos();
			}
		}
		catch (RecognitionException re) {
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
		public Termo_logicoContext termo_logico(int i) {
			return getRuleContext(Termo_logicoContext.class,i);
		}
		public List<Termo_logicoContext> termo_logico() {
			return getRuleContexts(Termo_logicoContext.class);
		}
		public Outros_termos_logicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_termos_logicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterOutros_termos_logicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitOutros_termos_logicos(this);
		}
	}

	public final Outros_termos_logicosContext outros_termos_logicos() throws RecognitionException {
		Outros_termos_logicosContext _localctx = new Outros_termos_logicosContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_outros_termos_logicos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(531); match(OR);
				setState(532); termo_logico();
				}
				}
				setState(537);
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

	public static class Outros_fatores_logicosContext extends ParserRuleContext {
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
		}
		public Outros_fatores_logicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_fatores_logicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterOutros_fatores_logicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitOutros_fatores_logicos(this);
		}
	}

	public final Outros_fatores_logicosContext outros_fatores_logicos() throws RecognitionException {
		Outros_fatores_logicosContext _localctx = new Outros_fatores_logicosContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_outros_fatores_logicos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(538); match(AND);
				setState(539); fator_logico();
				}
				}
				setState(544);
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
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterFator_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitFator_logico(this);
		}
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_fator_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545); op_nao();
			setState(546); parcela_logica();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode VERDADEIRO() { return getToken(LAGrammar1Parser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(LAGrammar1Parser.FALSO, 0); }
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterParcela_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitParcela_logica(this);
		}
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_parcela_logica);
		int _la;
		try {
			setState(550);
			switch (_input.LA(1)) {
			case VERDADEIRO:
			case FALSO:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				_la = _input.LA(1);
				if ( !(_la==VERDADEIRO || _la==FALSO) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case UP_HAT:
			case LPARENTHESIS:
			case MINUS:
			case COMMERCIAL_E:
			case CADEIA:
			case NUM_INT:
			case NUM_REAL:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(549); exp_relacional();
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3C\u022b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\7\3\u0084\n\3\f\3\16\3\u0087\13\3"+
		"\3\4\3\4\5\4\u008b\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a3\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u00b0\n\7\f\7\16\7\u00b3\13\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\7\t\u00bd\n\t\f\t\16\t\u00c0\13\t\3\n\3\n\3\n"+
		"\3\n\5\n\u00c6\n\n\3\13\3\13\3\13\3\13\7\13\u00cc\n\13\f\13\16\13\u00cf"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d7\n\f\3\r\3\r\7\r\u00db\n\r\f\r"+
		"\16\r\u00de\13\r\3\16\3\16\3\16\7\16\u00e3\n\16\f\16\16\16\u00e6\13\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f0\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00f7\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u011f\n\24\3\25\5\25\u0122\n\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\5\27\u012c\n\27\3\30\3\30\5\30\u0130\n\30\3\31\7\31\u0133"+
		"\n\31\f\31\16\31\u0136\13\31\3\32\3\32\3\32\3\33\7\33\u013c\n\33\f\33"+
		"\16\33\u013f\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0180\n\34"+
		"\3\35\3\35\7\35\u0184\n\35\f\35\16\35\u0187\13\35\3\36\3\36\5\36\u018b"+
		"\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0196\n\37\3 "+
		"\3 \3 \5 \u019b\n \3!\3!\3!\3!\3!\3\"\5\"\u01a3\n\"\3#\3#\3#\3$\3$\5$"+
		"\u01aa\n$\3%\3%\3%\3%\3&\3&\3&\3&\5&\u01b4\n&\3\'\5\'\u01b7\n\'\3(\3("+
		"\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\7,\u01c6\n,\f,\16,\u01c9\13,\3-\3-\3"+
		"-\3.\3.\3.\7.\u01d1\n.\f.\16.\u01d4\13.\3/\3/\3/\3/\5/\u01da\n/\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u01e8\n\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u01f0\n\61\3\62\3\62\7\62\u01f4\n"+
		"\62\f\62\16\62\u01f7\13\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63"+
		"\u0201\n\63\3\64\3\64\3\64\3\65\3\65\3\65\5\65\u0209\n\65\3\66\3\66\3"+
		"\67\3\67\3\67\38\58\u0211\n8\39\39\39\3:\3:\7:\u0218\n:\f:\16:\u021b\13"+
		":\3;\3;\7;\u021f\n;\f;\16;\u0222\13;\3<\3<\3<\3=\3=\5=\u0229\n=\3=\2>"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvx\2\b\4\2%&>@\3\2\23\24\3\2\21\22\3\2?@\3\2\30"+
		"\35\3\2%&\u0223\2z\3\2\2\2\4\u0085\3\2\2\2\6\u008a\3\2\2\2\b\u00a2\3\2"+
		"\2\2\n\u00a4\3\2\2\2\f\u00b1\3\2\2\2\16\u00b4\3\2\2\2\20\u00be\3\2\2\2"+
		"\22\u00c5\3\2\2\2\24\u00cd\3\2\2\2\26\u00d6\3\2\2\2\30\u00dc\3\2\2\2\32"+
		"\u00e4\3\2\2\2\34\u00ef\3\2\2\2\36\u00f6\3\2\2\2 \u00f8\3\2\2\2\"\u00fc"+
		"\3\2\2\2$\u00fe\3\2\2\2&\u011e\3\2\2\2(\u0121\3\2\2\2*\u0123\3\2\2\2,"+
		"\u012b\3\2\2\2.\u012f\3\2\2\2\60\u0134\3\2\2\2\62\u0137\3\2\2\2\64\u013d"+
		"\3\2\2\2\66\u017f\3\2\2\28\u0185\3\2\2\2:\u018a\3\2\2\2<\u0195\3\2\2\2"+
		">\u019a\3\2\2\2@\u019c\3\2\2\2B\u01a2\3\2\2\2D\u01a4\3\2\2\2F\u01a9\3"+
		"\2\2\2H\u01ab\3\2\2\2J\u01b3\3\2\2\2L\u01b6\3\2\2\2N\u01b8\3\2\2\2P\u01bb"+
		"\3\2\2\2R\u01bd\3\2\2\2T\u01bf\3\2\2\2V\u01c7\3\2\2\2X\u01ca\3\2\2\2Z"+
		"\u01d2\3\2\2\2\\\u01d9\3\2\2\2^\u01e7\3\2\2\2`\u01ef\3\2\2\2b\u01f5\3"+
		"\2\2\2d\u0200\3\2\2\2f\u0202\3\2\2\2h\u0208\3\2\2\2j\u020a\3\2\2\2l\u020c"+
		"\3\2\2\2n\u0210\3\2\2\2p\u0212\3\2\2\2r\u0219\3\2\2\2t\u0220\3\2\2\2v"+
		"\u0223\3\2\2\2x\u0228\3\2\2\2z{\b\2\1\2{|\5\4\3\2|}\7\3\2\2}~\5\62\32"+
		"\2~\177\b\2\1\2\177\u0080\7\4\2\2\u0080\u0081\b\2\1\2\u0081\3\3\2\2\2"+
		"\u0082\u0084\5\6\4\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\5\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u008b\5\b\5\2\u0089\u008b\5&\24\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2"+
		"\2\2\u008b\7\3\2\2\2\u008c\u008d\7\5\2\2\u008d\u008e\5\n\6\2\u008e\u008f"+
		"\b\5\1\2\u008f\u00a3\3\2\2\2\u0090\u0091\7\6\2\2\u0091\u0092\7A\2\2\u0092"+
		"\u0093\7\7\2\2\u0093\u0094\5\34\17\2\u0094\u0095\7\30\2\2\u0095\u0096"+
		"\5\"\22\2\u0096\u00a3\3\2\2\2\u0097\u0098\7\b\2\2\u0098\u0099\7A\2\2\u0099"+
		"\u009a\7\7\2\2\u009a\u009b\5\34\17\2\u009b\u009c\7\30\2\2\u009c\u009d"+
		"\5\"\22\2\u009d\u00a3\3\2\2\2\u009e\u009f\7\b\2\2\u009f\u00a0\7A\2\2\u00a0"+
		"\u00a1\7\7\2\2\u00a1\u00a3\5\26\f\2\u00a2\u008c\3\2\2\2\u00a2\u0090\3"+
		"\2\2\2\u00a2\u0097\3\2\2\2\u00a2\u009e\3\2\2\2\u00a3\t\3\2\2\2\u00a4\u00a5"+
		"\7A\2\2\u00a5\u00a6\5\24\13\2\u00a6\u00a7\5\f\7\2\u00a7\u00a8\7\7\2\2"+
		"\u00a8\u00a9\5\26\f\2\u00a9\u00aa\b\6\1\2\u00aa\13\3\2\2\2\u00ab\u00ac"+
		"\7\t\2\2\u00ac\u00ad\7A\2\2\u00ad\u00ae\b\7\1\2\u00ae\u00b0\5\24\13\2"+
		"\u00af\u00ab\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\r\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\5\20\t\2\u00b5"+
		"\u00b6\7A\2\2\u00b6\u00b7\b\b\1\2\u00b7\u00b8\5\24\13\2\u00b8\u00b9\5"+
		"\22\n\2\u00b9\17\3\2\2\2\u00ba\u00bb\7\n\2\2\u00bb\u00bd\b\t\1\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\21\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7\13\2\2\u00c2\u00c3"+
		"\5\16\b\2\u00c3\u00c4\b\n\1\2\u00c4\u00c6\3\2\2\2\u00c5\u00c1\3\2\2\2"+
		"\u00c5\u00c6\3\2\2\2\u00c6\23\3\2\2\2\u00c7\u00c8\7\f\2\2\u00c8\u00c9"+
		"\5N(\2\u00c9\u00ca\7\r\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cc"+
		"\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\25\3\2\2"+
		"\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\5$\23\2\u00d1\u00d2\b\f\1\2\u00d2\u00d7"+
		"\3\2\2\2\u00d3\u00d4\5 \21\2\u00d4\u00d5\b\f\1\2\u00d5\u00d7\3\2\2\2\u00d6"+
		"\u00d0\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d7\27\3\2\2\2\u00d8\u00d9\7\t\2"+
		"\2\u00d9\u00db\5\16\b\2\u00da\u00d8\3\2\2\2\u00db\u00de\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\31\3\2\2\2\u00de\u00dc\3\2\2"+
		"\2\u00df\u00e0\5\n\6\2\u00e0\u00e1\b\16\1\2\u00e1\u00e3\3\2\2\2\u00e2"+
		"\u00df\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\33\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7\37\2\2\u00e8\u00f0"+
		"\b\17\1\2\u00e9\u00ea\7 \2\2\u00ea\u00f0\b\17\1\2\u00eb\u00ec\7!\2\2\u00ec"+
		"\u00f0\b\17\1\2\u00ed\u00ee\7\"\2\2\u00ee\u00f0\b\17\1\2\u00ef\u00e7\3"+
		"\2\2\2\u00ef\u00e9\3\2\2\2\u00ef\u00eb\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\35\3\2\2\2\u00f1\u00f2\5\34\17\2\u00f2\u00f3\b\20\1\2\u00f3\u00f7\3\2"+
		"\2\2\u00f4\u00f5\7A\2\2\u00f5\u00f7\b\20\1\2\u00f6\u00f1\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f7\37\3\2\2\2\u00f8\u00f9\5\20\t\2\u00f9\u00fa\5\36"+
		"\20\2\u00fa\u00fb\b\21\1\2\u00fb!\3\2\2\2\u00fc\u00fd\t\2\2\2\u00fd#\3"+
		"\2\2\2\u00fe\u00ff\7\'\2\2\u00ff\u0100\5\n\6\2\u0100\u0101\b\23\1\2\u0101"+
		"\u0102\5\32\16\2\u0102\u0103\b\23\1\2\u0103\u0104\7(\2\2\u0104\u0105\b"+
		"\23\1\2\u0105%\3\2\2\2\u0106\u0107\7)\2\2\u0107\u0108\7A\2\2\u0108\u0109"+
		"\b\24\1\2\u0109\u010a\7\16\2\2\u010a\u010b\5(\25\2\u010b\u010c\7\17\2"+
		"\2\u010c\u010d\5\60\31\2\u010d\u010e\5\64\33\2\u010e\u010f\7*\2\2\u010f"+
		"\u0110\b\24\1\2\u0110\u011f\3\2\2\2\u0111\u0112\7+\2\2\u0112\u0113\7A"+
		"\2\2\u0113\u0114\b\24\1\2\u0114\u0115\7\16\2\2\u0115\u0116\5(\25\2\u0116"+
		"\u0117\7\17\2\2\u0117\u0118\7\7\2\2\u0118\u0119\5 \21\2\u0119\u011a\5"+
		"\60\31\2\u011a\u011b\5\64\33\2\u011b\u011c\7,\2\2\u011c\u011d\b\24\1\2"+
		"\u011d\u011f\3\2\2\2\u011e\u0106\3\2\2\2\u011e\u0111\3\2\2\2\u011f\'\3"+
		"\2\2\2\u0120\u0122\5*\26\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		")\3\2\2\2\u0123\u0124\5,\27\2\u0124\u0125\5\16\b\2\u0125\u0126\5\30\r"+
		"\2\u0126\u0127\7\7\2\2\u0127\u0128\5 \21\2\u0128\u0129\5.\30\2\u0129+"+
		"\3\2\2\2\u012a\u012c\7-\2\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"-\3\2\2\2\u012d\u012e\7\t\2\2\u012e\u0130\5*\26\2\u012f\u012d\3\2\2\2"+
		"\u012f\u0130\3\2\2\2\u0130/\3\2\2\2\u0131\u0133\5\b\5\2\u0132\u0131\3"+
		"\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\61\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\5\60\31\2\u0138\u0139\5\64"+
		"\33\2\u0139\63\3\2\2\2\u013a\u013c\5\66\34\2\u013b\u013a\3\2\2\2\u013c"+
		"\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\65\3\2\2"+
		"\2\u013f\u013d\3\2\2\2\u0140\u0141\7.\2\2\u0141\u0142\7\16\2\2\u0142\u0143"+
		"\5\16\b\2\u0143\u0144\5\30\r\2\u0144\u0145\7\17\2\2\u0145\u0180\3\2\2"+
		"\2\u0146\u0147\7/\2\2\u0147\u0148\7\16\2\2\u0148\u0149\5l\67\2\u0149\u014a"+
		"\58\35\2\u014a\u014b\7\17\2\2\u014b\u0180\3\2\2\2\u014c\u014d\7\60\2\2"+
		"\u014d\u014e\5l\67\2\u014e\u014f\7\61\2\2\u014f\u0150\5\64\33\2\u0150"+
		"\u0151\5:\36\2\u0151\u0152\7\62\2\2\u0152\u0180\3\2\2\2\u0153\u0154\7"+
		"\63\2\2\u0154\u0155\5N(\2\u0155\u0156\7\65\2\2\u0156\u0157\5@!\2\u0157"+
		"\u0158\5:\36\2\u0158\u0159\7\64\2\2\u0159\u0180\3\2\2\2\u015a\u015b\7"+
		"\66\2\2\u015b\u015c\7A\2\2\u015c\u015d\7\25\2\2\u015d\u015e\5N(\2\u015e"+
		"\u015f\7\67\2\2\u015f\u0160\5N(\2\u0160\u0161\78\2\2\u0161\u0162\5\64"+
		"\33\2\u0162\u0163\79\2\2\u0163\u0180\3\2\2\2\u0164\u0165\7:\2\2\u0165"+
		"\u0166\5l\67\2\u0166\u0167\78\2\2\u0167\u0168\5\64\33\2\u0168\u0169\7"+
		";\2\2\u0169\u0180\3\2\2\2\u016a\u016b\78\2\2\u016b\u016c\5\64\33\2\u016c"+
		"\u016d\7\67\2\2\u016d\u016e\5l\67\2\u016e\u0180\3\2\2\2\u016f\u0170\7"+
		"\n\2\2\u0170\u0171\7A\2\2\u0171\u0172\5\22\n\2\u0172\u0173\5\24\13\2\u0173"+
		"\u0174\7\25\2\2\u0174\u0175\5l\67\2\u0175\u0176\b\34\1\2\u0176\u0180\3"+
		"\2\2\2\u0177\u0178\7A\2\2\u0178\u0179\5<\37\2\u0179\u017a\b\34\1\2\u017a"+
		"\u0180\3\2\2\2\u017b\u017c\7<\2\2\u017c\u017d\5l\67\2\u017d\u017e\b\34"+
		"\1\2\u017e\u0180\3\2\2\2\u017f\u0140\3\2\2\2\u017f\u0146\3\2\2\2\u017f"+
		"\u014c\3\2\2\2\u017f\u0153\3\2\2\2\u017f\u015a\3\2\2\2\u017f\u0164\3\2"+
		"\2\2\u017f\u016a\3\2\2\2\u017f\u016f\3\2\2\2\u017f\u0177\3\2\2\2\u017f"+
		"\u017b\3\2\2\2\u0180\67\3\2\2\2\u0181\u0182\7\t\2\2\u0182\u0184\5l\67"+
		"\2\u0183\u0181\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186"+
		"\3\2\2\2\u01869\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u0189\7=\2\2\u0189\u018b"+
		"\5\64\33\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b;\3\2\2\2\u018c"+
		"\u018d\7\16\2\2\u018d\u018e\5> \2\u018e\u018f\7\17\2\2\u018f\u0196\3\2"+
		"\2\2\u0190\u0191\5\22\n\2\u0191\u0192\5\24\13\2\u0192\u0193\7\25\2\2\u0193"+
		"\u0194\5l\67\2\u0194\u0196\3\2\2\2\u0195\u018c\3\2\2\2\u0195\u0190\3\2"+
		"\2\2\u0196=\3\2\2\2\u0197\u0198\5l\67\2\u0198\u0199\58\35\2\u0199\u019b"+
		"\3\2\2\2\u019a\u0197\3\2\2\2\u019a\u019b\3\2\2\2\u019b?\3\2\2\2\u019c"+
		"\u019d\5D#\2\u019d\u019e\7\7\2\2\u019e\u019f\5\64\33\2\u019f\u01a0\5B"+
		"\"\2\u01a0A\3\2\2\2\u01a1\u01a3\5@!\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3"+
		"\3\2\2\2\u01a3C\3\2\2\2\u01a4\u01a5\5H%\2\u01a5\u01a6\5F$\2\u01a6E\3\2"+
		"\2\2\u01a7\u01a8\7\t\2\2\u01a8\u01aa\5D#\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa"+
		"\3\2\2\2\u01aaG\3\2\2\2\u01ab\u01ac\5L\'\2\u01ac\u01ad\7?\2\2\u01ad\u01ae"+
		"\5J&\2\u01aeI\3\2\2\2\u01af\u01b0\7\20\2\2\u01b0\u01b1\5L\'\2\u01b1\u01b2"+
		"\7?\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01af\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4"+
		"K\3\2\2\2\u01b5\u01b7\7\21\2\2\u01b6\u01b5\3\2\2\2\u01b6\u01b7\3\2\2\2"+
		"\u01b7M\3\2\2\2\u01b8\u01b9\5T+\2\u01b9\u01ba\5V,\2\u01baO\3\2\2\2\u01bb"+
		"\u01bc\t\3\2\2\u01bcQ\3\2\2\2\u01bd\u01be\t\4\2\2\u01beS\3\2\2\2\u01bf"+
		"\u01c0\5X-\2\u01c0\u01c1\5Z.\2\u01c1U\3\2\2\2\u01c2\u01c3\5R*\2\u01c3"+
		"\u01c4\5T+\2\u01c4\u01c6\3\2\2\2\u01c5\u01c2\3\2\2\2\u01c6\u01c9\3\2\2"+
		"\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8W\3\2\2\2\u01c9\u01c7"+
		"\3\2\2\2\u01ca\u01cb\5\\/\2\u01cb\u01cc\5b\62\2\u01ccY\3\2\2\2\u01cd\u01ce"+
		"\5P)\2\u01ce\u01cf\5X-\2\u01cf\u01d1\3\2\2\2\u01d0\u01cd\3\2\2\2\u01d1"+
		"\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3[\3\2\2\2"+
		"\u01d4\u01d2\3\2\2\2\u01d5\u01d6\5L\'\2\u01d6\u01d7\5^\60\2\u01d7\u01da"+
		"\3\2\2\2\u01d8\u01da\5`\61\2\u01d9\u01d5\3\2\2\2\u01d9\u01d8\3\2\2\2\u01da"+
		"]\3\2\2\2\u01db\u01e8\t\5\2\2\u01dc\u01dd\7\n\2\2\u01dd\u01de\7A\2\2\u01de"+
		"\u01df\5\22\n\2\u01df\u01e0\5\24\13\2\u01e0\u01e8\3\2\2\2\u01e1\u01e2"+
		"\7A\2\2\u01e2\u01e8\5d\63\2\u01e3\u01e4\7\16\2\2\u01e4\u01e5\5l\67\2\u01e5"+
		"\u01e6\7\17\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01db\3\2\2\2\u01e7\u01dc\3"+
		"\2\2\2\u01e7\u01e1\3\2\2\2\u01e7\u01e3\3\2\2\2\u01e8_\3\2\2\2\u01e9\u01ea"+
		"\7\26\2\2\u01ea\u01eb\7A\2\2\u01eb\u01ec\5\22\n\2\u01ec\u01ed\5\24\13"+
		"\2\u01ed\u01f0\3\2\2\2\u01ee\u01f0\7>\2\2\u01ef\u01e9\3\2\2\2\u01ef\u01ee"+
		"\3\2\2\2\u01f0a\3\2\2\2\u01f1\u01f2\7\27\2\2\u01f2\u01f4\5\\/\2\u01f3"+
		"\u01f1\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2"+
		"\2\2\u01f6c\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01f9\7\16\2\2\u01f9\u01fa"+
		"\5l\67\2\u01fa\u01fb\58\35\2\u01fb\u01fc\7\17\2\2\u01fc\u0201\3\2\2\2"+
		"\u01fd\u01fe\5\22\n\2\u01fe\u01ff\5\24\13\2\u01ff\u0201\3\2\2\2\u0200"+
		"\u01f8\3\2\2\2\u0200\u01fd\3\2\2\2\u0201e\3\2\2\2\u0202\u0203\5N(\2\u0203"+
		"\u0204\5h\65\2\u0204g\3\2\2\2\u0205\u0206\5j\66\2\u0206\u0207\5N(\2\u0207"+
		"\u0209\3\2\2\2\u0208\u0205\3\2\2\2\u0208\u0209\3\2\2\2\u0209i\3\2\2\2"+
		"\u020a\u020b\t\6\2\2\u020bk\3\2\2\2\u020c\u020d\5p9\2\u020d\u020e\5r:"+
		"\2\u020em\3\2\2\2\u020f\u0211\7\36\2\2\u0210\u020f\3\2\2\2\u0210\u0211"+
		"\3\2\2\2\u0211o\3\2\2\2\u0212\u0213\5v<\2\u0213\u0214\5t;\2\u0214q\3\2"+
		"\2\2\u0215\u0216\7#\2\2\u0216\u0218\5p9\2\u0217\u0215\3\2\2\2\u0218\u021b"+
		"\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021as\3\2\2\2\u021b"+
		"\u0219\3\2\2\2\u021c\u021d\7$\2\2\u021d\u021f\5v<\2\u021e\u021c\3\2\2"+
		"\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221u"+
		"\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0224\5n8\2\u0224\u0225\5x=\2\u0225"+
		"w\3\2\2\2\u0226\u0229\t\7\2\2\u0227\u0229\5f\64\2\u0228\u0226\3\2\2\2"+
		"\u0228\u0227\3\2\2\2\u0229y\3\2\2\2)\u0085\u008a\u00a2\u00b1\u00be\u00c5"+
		"\u00cd\u00d6\u00dc\u00e4\u00ef\u00f6\u011e\u0121\u012b\u012f\u0134\u013d"+
		"\u017f\u0185\u018a\u0195\u019a\u01a2\u01a9\u01b3\u01b6\u01c7\u01d2\u01d9"+
		"\u01e7\u01ef\u01f5\u0200\u0208\u0210\u0219\u0220\u0228";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}