// Generated from /home/joaovitor/NetBeansProjects/CC2-Compilador-LA-C/CC2-Compilador-LA-C/src/grammars/LAGrammar1.g4 by ANTLR 4.1
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
		TWODOTS=14, ARROW=15, MINUS=16, PLUS=17, MULT=18, DIV=19, COMMERCIAL_E=20, 
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
		"'<-'", "'-'", "'+'", "'*'", "'/'", "'&'", "'%'", "'='", "'<>'", "'>='", 
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
		RULE_senao_opcional = 28, RULE_atribuicao = 29, RULE_chamada = 30, RULE_argumentos_opcional = 31, 
		RULE_selecao = 32, RULE_mais_selecao = 33, RULE_constantes = 34, RULE_mais_constantes = 35, 
		RULE_numero_intervalo = 36, RULE_intervalo_opcional = 37, RULE_op_unario = 38, 
		RULE_exp_aritmetica = 39, RULE_op_multiplicacao = 40, RULE_op_adicao = 41, 
		RULE_termo = 42, RULE_outros_termos = 43, RULE_fator = 44, RULE_outros_fatores = 45, 
		RULE_parcela = 46, RULE_parcela_unario = 47, RULE_parcela_nao_unario = 48, 
		RULE_outras_parcelas = 49, RULE_chamada_partes = 50, RULE_exp_relacional = 51, 
		RULE_op_opcional = 52, RULE_op_relacional = 53, RULE_expressao = 54, RULE_op_nao = 55, 
		RULE_termo_logico = 56, RULE_outros_termos_logicos = 57, RULE_outros_fatores_logicos = 58, 
		RULE_fator_logico = 59, RULE_parcela_logica = 60;
	public static final String[] ruleNames = {
		"programa", "declaracoes", "decl_local_global", "declaracao_local", "variavel", 
		"mais_var", "identificador", "ponteiros_opcionais", "outros_ident", "dimensao", 
		"tipo", "mais_ident", "mais_variaveis", "tipo_basico", "tipo_basico_ident", 
		"tipo_estendido", "valor_constante", "registro", "declaracao_global", 
		"parametros_opcional", "parametro", "var_opcional", "mais_parametros", 
		"declaracoes_locais", "corpo", "comandos", "cmd", "mais_expressao", "senao_opcional", 
		"atribuicao", "chamada", "argumentos_opcional", "selecao", "mais_selecao", 
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
			setState(123); declaracoes();
			setState(124); match(ALGORITMO);
			setState(125); corpo();
			 printSemanticTable(); 
			setState(127); match(FIM_ALGORITMO);

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
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO) | (1L << PROCEDIMENTO) | (1L << FUNCAO))) != 0)) {
				{
				{
				setState(130); decl_local_global();
				}
				}
				setState(135);
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
			setState(138);
			switch (_input.LA(1)) {
			case DECLARE:
			case CONSTANTE:
			case TIPO:
				enterOuterAlt(_localctx, 1);
				{
				setState(136); declaracao_local();
				}
				break;
			case PROCEDIMENTO:
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(137); declaracao_global();
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
		public Token DECLARE;
		public VariavelContext variavel;
		public Token IDENT;
		public Tipo_basicoContext tipo_basico;
		public Valor_constanteContext valor_constante;
		public TipoContext tipo;
		public TerminalNode TIPO() { return getToken(LAGrammar1Parser.TIPO, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode CONSTANTE() { return getToken(LAGrammar1Parser.CONSTANTE, 0); }
		public TerminalNode EQUALS() { return getToken(LAGrammar1Parser.EQUALS, 0); }
		public TerminalNode DECLARE() { return getToken(LAGrammar1Parser.DECLARE, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LAGrammar1Parser.COLON, 0); }
		public TerminalNode IDENT() { return getToken(LAGrammar1Parser.IDENT, 0); }
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
			setState(158);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(140); ((Declaracao_localContext)_localctx).DECLARE = match(DECLARE);
				setState(141); ((Declaracao_localContext)_localctx).variavel = variavel();

				        if(((Declaracao_localContext)_localctx).variavel.t.trim().replace("^","").equals("literal") 
				        || ((Declaracao_localContext)_localctx).variavel.t.trim().replace("^","").equals("inteiro") 
				        || ((Declaracao_localContext)_localctx).variavel.t.trim().replace("^","").equals("real") 
				        || ((Declaracao_localContext)_localctx).variavel.t.trim().replace("^","").equals("logico") ){
				               /*Check each token names to see if it was already declared */
				               for (String s : ((Declaracao_localContext)_localctx).variavel.names){
				               if(top().isTokenPresent(s))
				                   error("Identificador ja declarado: "+s, ((Declaracao_localContext)_localctx).DECLARE.getLine());
				                 else
				                   top().addToken(s, ((Declaracao_localContext)_localctx).variavel.t);
				               }
				        }else if(isTokenPresent(((Declaracao_localContext)_localctx).variavel.t)){ /*verificar se eh do tipo custom*/
				           /*Check each token names to see if it was already declared */
				           for (String s : ((Declaracao_localContext)_localctx).variavel.names){
				               if(top().isTokenPresent(s))
				                   error("Identificador ja declarado: "+s, ((Declaracao_localContext)_localctx).DECLARE.getLine());
				                 else
				                   top().addToken(s, ((Declaracao_localContext)_localctx).variavel.t);
				           }  
				        }else{
				           error("Undeclared variable type: "+((Declaracao_localContext)_localctx).variavel.t, ((Declaracao_localContext)_localctx).DECLARE.getLine()); 
				        }
				    
				}
				break;
			case CONSTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(144); match(CONSTANTE);
				setState(145); ((Declaracao_localContext)_localctx).IDENT = match(IDENT);
				setState(146); match(COLON);
				setState(147); ((Declaracao_localContext)_localctx).tipo_basico = tipo_basico();
				setState(148); match(EQUALS);
				setState(149); ((Declaracao_localContext)_localctx).valor_constante = valor_constante();

				      if(!((Declaracao_localContext)_localctx).tipo_basico.val.equals(((Declaracao_localContext)_localctx).valor_constante.val)){
				         error("Atribuicao invalida: "+(((Declaracao_localContext)_localctx).IDENT!=null?((Declaracao_localContext)_localctx).IDENT.getText():null)+
				         " tipo "+((Declaracao_localContext)_localctx).tipo_basico.val+" com "+((Declaracao_localContext)_localctx).valor_constante.val,
				         ((Declaracao_localContext)_localctx).IDENT.getLine());  
				      }
				      if(top().isTokenPresent((((Declaracao_localContext)_localctx).IDENT!=null?((Declaracao_localContext)_localctx).IDENT.getText():null)))
				        error("Constante ja declarada: "+(((Declaracao_localContext)_localctx).IDENT!=null?((Declaracao_localContext)_localctx).IDENT.getText():null), ((Declaracao_localContext)_localctx).IDENT.getLine());
				      else
				        top().addToken((((Declaracao_localContext)_localctx).IDENT!=null?((Declaracao_localContext)_localctx).IDENT.getText():null), ((Declaracao_localContext)_localctx).tipo_basico.val);
				     
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 3);
				{
				setState(152); match(TIPO);
				setState(153); ((Declaracao_localContext)_localctx).IDENT = match(IDENT);
				setState(154); match(COLON);
				setState(155); ((Declaracao_localContext)_localctx).tipo = tipo();

				      if(top().isTokenPresent((((Declaracao_localContext)_localctx).IDENT!=null?((Declaracao_localContext)_localctx).IDENT.getText():null)))
				        error("Tipo ja declarado: "+(((Declaracao_localContext)_localctx).IDENT!=null?((Declaracao_localContext)_localctx).IDENT.getText():null), ((Declaracao_localContext)_localctx).IDENT.getLine());
				      else
				        top().addToken((((Declaracao_localContext)_localctx).IDENT!=null?((Declaracao_localContext)_localctx).IDENT.getText():null), ((Declaracao_localContext)_localctx).tipo.val);
				     
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

	public static class VariavelContext extends ParserRuleContext {
		public List<String> names;
		public String t;
		public Token IDENT;
		public Mais_varContext mais_var;
		public TipoContext tipo;
		public Mais_varContext mais_var() {
			return getRuleContext(Mais_varContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LAGrammar1Parser.COLON, 0); }
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
			setState(160); ((VariavelContext)_localctx).IDENT = match(IDENT);
			setState(161); dimensao();
			setState(162); ((VariavelContext)_localctx).mais_var = mais_var();
			setState(163); match(COLON);
			setState(164); ((VariavelContext)_localctx).tipo = tipo();

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
		public List<TerminalNode> IDENT() { return getTokens(LAGrammar1Parser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LAGrammar1Parser.IDENT, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(LAGrammar1Parser.COMMA, i);
		}
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
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(167); match(COMMA);
				setState(168); ((Mais_varContext)_localctx).IDENT = match(IDENT);
				 
				                  if(!isTokenPresent((((Mais_varContext)_localctx).IDENT!=null?((Mais_varContext)_localctx).IDENT.getText():null))){
				                      _localctx.nomes.add((((Mais_varContext)_localctx).IDENT!=null?((Mais_varContext)_localctx).IDENT.getText():null));
				                  }else{
				                      error("Identificador ja declarado: "+
				                      (((Mais_varContext)_localctx).IDENT!=null?((Mais_varContext)_localctx).IDENT.getText():null),((Mais_varContext)_localctx).IDENT.getLine());
				                  }
				                
				setState(170); dimensao();
				}
				}
				setState(175);
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
			setState(176); ((IdentificadorContext)_localctx).ponteiros_opcionais = ponteiros_opcionais();
			setState(177); ((IdentificadorContext)_localctx).IDENT = match(IDENT);
			 ((IdentificadorContext)_localctx).nome =  ((IdentificadorContext)_localctx).ponteiros_opcionais.val + (((IdentificadorContext)_localctx).IDENT!=null?((IdentificadorContext)_localctx).IDENT.getText():null); 
			setState(179); dimensao();
			setState(180); outros_ident();
			}
		}
		catch (RecognitionException re) {
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
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UP_HAT) {
				{
				{
				setState(182); ((Ponteiros_opcionaisContext)_localctx).UP_HAT = match(UP_HAT);
				 _localctx.val += (((Ponteiros_opcionaisContext)_localctx).UP_HAT!=null?((Ponteiros_opcionaisContext)_localctx).UP_HAT.getText():null); 
				}
				}
				setState(188);
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
			setState(193);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(189); match(DOT);
				setState(190); ((Outros_identContext)_localctx).identificador = identificador();
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
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(LAGrammar1Parser.LBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(LAGrammar1Parser.RBRACKET, i);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(LAGrammar1Parser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(LAGrammar1Parser.RBRACKET); }
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
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(195); match(LBRACKET);
					setState(196); exp_aritmetica();
					setState(197); match(RBRACKET);
					}
					} 
				}
				setState(203);
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
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
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
			setState(210);
			switch (_input.LA(1)) {
			case REGISTRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(204); ((TipoContext)_localctx).registro = registro();

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
				setState(207); ((TipoContext)_localctx).tipo_estendido = tipo_estendido();
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
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
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
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(212); match(COMMA);
				setState(213); identificador();
				}
				}
				setState(218);
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
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
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
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(219); ((Mais_variaveisContext)_localctx).variavel = variavel();
				_localctx.tipos.add(((Mais_variaveisContext)_localctx).variavel.t);
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

	public static class Tipo_basicoContext extends ParserRuleContext {
		public String val;
		public Token LITERAL;
		public Token INTEIRO;
		public Token REAL;
		public Token LOGICO;
		public TerminalNode INTEIRO() { return getToken(LAGrammar1Parser.INTEIRO, 0); }
		public TerminalNode LITERAL() { return getToken(LAGrammar1Parser.LITERAL, 0); }
		public TerminalNode LOGICO() { return getToken(LAGrammar1Parser.LOGICO, 0); }
		public TerminalNode REAL() { return getToken(LAGrammar1Parser.REAL, 0); }
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
			setState(235);
			switch (_input.LA(1)) {
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(227); ((Tipo_basicoContext)_localctx).LITERAL = match(LITERAL);
				 ((Tipo_basicoContext)_localctx).val = (((Tipo_basicoContext)_localctx).LITERAL!=null?((Tipo_basicoContext)_localctx).LITERAL.getText():null); 
				}
				break;
			case INTEIRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(229); ((Tipo_basicoContext)_localctx).INTEIRO = match(INTEIRO);
				 ((Tipo_basicoContext)_localctx).val = (((Tipo_basicoContext)_localctx).INTEIRO!=null?((Tipo_basicoContext)_localctx).INTEIRO.getText():null); 
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(231); ((Tipo_basicoContext)_localctx).REAL = match(REAL);
				 ((Tipo_basicoContext)_localctx).val = (((Tipo_basicoContext)_localctx).REAL!=null?((Tipo_basicoContext)_localctx).REAL.getText():null); 
				}
				break;
			case LOGICO:
				enterOuterAlt(_localctx, 4);
				{
				setState(233); ((Tipo_basicoContext)_localctx).LOGICO = match(LOGICO);
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
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAGrammar1Parser.IDENT, 0); }
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
			setState(242);
			switch (_input.LA(1)) {
			case LITERAL:
			case INTEIRO:
			case REAL:
			case LOGICO:
				enterOuterAlt(_localctx, 1);
				{
				setState(237); ((Tipo_basico_identContext)_localctx).tipo_basico = tipo_basico();
				 ((Tipo_basico_identContext)_localctx).val = ((Tipo_basico_identContext)_localctx).tipo_basico.val; 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(240); ((Tipo_basico_identContext)_localctx).IDENT = match(IDENT);
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
		public Tipo_basico_identContext tipo_basico_ident() {
			return getRuleContext(Tipo_basico_identContext.class,0);
		}
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
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
			setState(244); ((Tipo_estendidoContext)_localctx).ponteiros_opcionais = ponteiros_opcionais();
			setState(245); ((Tipo_estendidoContext)_localctx).tipo_basico_ident = tipo_basico_ident();
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
		public String val;
		public TerminalNode NUM_INT() { return getToken(LAGrammar1Parser.NUM_INT, 0); }
		public TerminalNode FALSO() { return getToken(LAGrammar1Parser.FALSO, 0); }
		public TerminalNode NUM_REAL() { return getToken(LAGrammar1Parser.NUM_REAL, 0); }
		public TerminalNode VERDADEIRO() { return getToken(LAGrammar1Parser.VERDADEIRO, 0); }
		public TerminalNode CADEIA() { return getToken(LAGrammar1Parser.CADEIA, 0); }
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
		 ((Valor_constanteContext)_localctx).val =  ""; 
		try {
			setState(258);
			switch (_input.LA(1)) {
			case CADEIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(248); match(CADEIA);
				 ((Valor_constanteContext)_localctx).val =  "literal"; 
				}
				break;
			case NUM_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(250); match(NUM_INT);
				 ((Valor_constanteContext)_localctx).val =  "inteiro"; 
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(252); match(NUM_REAL);
				 ((Valor_constanteContext)_localctx).val =  "real"; 
				}
				break;
			case VERDADEIRO:
				enterOuterAlt(_localctx, 4);
				{
				setState(254); match(VERDADEIRO);
				 ((Valor_constanteContext)_localctx).val =  "logico"; 
				}
				break;
			case FALSO:
				enterOuterAlt(_localctx, 5);
				{
				setState(256); match(FALSO);
				 ((Valor_constanteContext)_localctx).val =  "logico"; 
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

	public static class RegistroContext extends ParserRuleContext {
		public String val;
		public VariavelContext variavel;
		public Mais_variaveisContext mais_variaveis;
		public TerminalNode FIM_REGISTRO() { return getToken(LAGrammar1Parser.FIM_REGISTRO, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode REGISTRO() { return getToken(LAGrammar1Parser.REGISTRO, 0); }
		public Mais_variaveisContext mais_variaveis() {
			return getRuleContext(Mais_variaveisContext.class,0);
		}
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
			setState(260); match(REGISTRO);
			setState(261); ((RegistroContext)_localctx).variavel = variavel();
			 _localctx.val += "["+((RegistroContext)_localctx).variavel.t; 
			setState(263); ((RegistroContext)_localctx).mais_variaveis = mais_variaveis();
			 
			                     for(String s : ((RegistroContext)_localctx).mais_variaveis.tipos){
			                        _localctx.val += ","+s;                                    
			                     }
			                    
			setState(265); match(FIM_REGISTRO);

			      _localctx.val += "]";
			      /*Registra o tipo pra in-line*/
			      top().addToken(_localctx.val,_localctx.val);
			      
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode FIM_PROCEDIMENTO() { return getToken(LAGrammar1Parser.FIM_PROCEDIMENTO, 0); }
		public Declaracoes_locaisContext declaracoes_locais() {
			return getRuleContext(Declaracoes_locaisContext.class,0);
		}
		public TerminalNode PROCEDIMENTO() { return getToken(LAGrammar1Parser.PROCEDIMENTO, 0); }
		public TerminalNode FIM_FUNCAO() { return getToken(LAGrammar1Parser.FIM_FUNCAO, 0); }
		public TerminalNode FUNCAO() { return getToken(LAGrammar1Parser.FUNCAO, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode LPARENTHESIS() { return getToken(LAGrammar1Parser.LPARENTHESIS, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LAGrammar1Parser.COLON, 0); }
		public Parametros_opcionalContext parametros_opcional() {
			return getRuleContext(Parametros_opcionalContext.class,0);
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
			setState(292);
			switch (_input.LA(1)) {
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(268); match(PROCEDIMENTO);
				setState(269); ((Declaracao_globalContext)_localctx).IDENT = match(IDENT);
				 push(new TokenSymbolTable("PROC")); 
				setState(271); match(LPARENTHESIS);
				setState(272); parametros_opcional();
				setState(273); match(RPARENTHESIS);
				setState(274); declaracoes_locais();
				setState(275); comandos();
				setState(276); match(FIM_PROCEDIMENTO);
				 pop(); top().addToken((((Declaracao_globalContext)_localctx).IDENT!=null?((Declaracao_globalContext)_localctx).IDENT.getText():null), "PROC"); 
				}
				break;
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(279); match(FUNCAO);
				setState(280); ((Declaracao_globalContext)_localctx).IDENT = match(IDENT);
				 push(new TokenSymbolTable("FUNC")); 
				setState(282); match(LPARENTHESIS);
				setState(283); parametros_opcional();
				setState(284); match(RPARENTHESIS);
				setState(285); match(COLON);
				setState(286); tipo_estendido();
				setState(287); declaracoes_locais();
				setState(288); comandos();
				setState(289); match(FIM_FUNCAO);
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
			setState(295);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP_HAT) | (1L << VAR) | (1L << IDENT))) != 0)) {
				{
				setState(294); parametro();
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
		public Var_opcionalContext var_opcional() {
			return getRuleContext(Var_opcionalContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Mais_parametrosContext mais_parametros() {
			return getRuleContext(Mais_parametrosContext.class,0);
		}
		public Mais_identContext mais_ident() {
			return getRuleContext(Mais_identContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
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
			setState(297); var_opcional();
			setState(298); identificador();
			setState(299); mais_ident();
			setState(300); match(COLON);
			setState(301); tipo_estendido();
			setState(302); mais_parametros();
			}
		}
		catch (RecognitionException re) {
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
			setState(305);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(304); match(VAR);
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
			setState(309);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(307); match(COMMA);
				setState(308); parametro();
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
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO))) != 0)) {
				{
				{
				setState(311); declaracao_local();
				}
				}
				setState(316);
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
			setState(317); declaracoes_locais();
			setState(318); comandos();
			}
		}
		catch (RecognitionException re) {
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
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP_HAT) | (1L << LEIA) | (1L << ESCREVA) | (1L << SE) | (1L << CASO) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << RETORNE) | (1L << IDENT))) != 0)) {
				{
				{
				setState(320); cmd();
				}
				}
				setState(325);
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
		public TerminalNode FIMCASO() { return getToken(LAGrammar1Parser.FIMCASO, 0); }
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode FIMPARA() { return getToken(LAGrammar1Parser.FIMPARA, 0); }
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public TerminalNode RETORNE() { return getToken(LAGrammar1Parser.RETORNE, 0); }
		public ChamadaContext chamada() {
			return getRuleContext(ChamadaContext.class,0);
		}
		public TerminalNode ENQUANTO() { return getToken(LAGrammar1Parser.ENQUANTO, 0); }
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public TerminalNode CASO() { return getToken(LAGrammar1Parser.CASO, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TerminalNode UP_HAT() { return getToken(LAGrammar1Parser.UP_HAT, 0); }
		public TerminalNode FIMENQUANTO() { return getToken(LAGrammar1Parser.FIMENQUANTO, 0); }
		public TerminalNode ESCREVA() { return getToken(LAGrammar1Parser.ESCREVA, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(LAGrammar1Parser.LPARENTHESIS, 0); }
		public TerminalNode IDENT() { return getToken(LAGrammar1Parser.IDENT, 0); }
		public TerminalNode LEIA() { return getToken(LAGrammar1Parser.LEIA, 0); }
		public TerminalNode FIMSE() { return getToken(LAGrammar1Parser.FIMSE, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FACA() { return getToken(LAGrammar1Parser.FACA, 0); }
		public TerminalNode ARROW() { return getToken(LAGrammar1Parser.ARROW, 0); }
		public Mais_identContext mais_ident() {
			return getRuleContext(Mais_identContext.class,0);
		}
		public TerminalNode SEJA() { return getToken(LAGrammar1Parser.SEJA, 0); }
		public TerminalNode ENTAO() { return getToken(LAGrammar1Parser.ENTAO, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(LAGrammar1Parser.RPARENTHESIS, 0); }
		public TerminalNode SE() { return getToken(LAGrammar1Parser.SE, 0); }
		public TerminalNode ATE() { return getToken(LAGrammar1Parser.ATE, 0); }
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Senao_opcionalContext senao_opcional() {
			return getRuleContext(Senao_opcionalContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode PARA() { return getToken(LAGrammar1Parser.PARA, 0); }
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
			setState(391);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326); match(LEIA);
				setState(327); match(LPARENTHESIS);
				setState(328); identificador();
				setState(329); mais_ident();
				setState(330); match(RPARENTHESIS);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332); match(ESCREVA);
				setState(333); match(LPARENTHESIS);
				setState(334); expressao();
				setState(335); mais_expressao();
				setState(336); match(RPARENTHESIS);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(338); match(SE);
				setState(339); expressao();
				setState(340); match(ENTAO);
				setState(341); comandos();
				setState(342); senao_opcional();
				setState(343); match(FIMSE);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(345); match(CASO);
				setState(346); exp_aritmetica();
				setState(347); match(SEJA);
				setState(348); selecao();
				setState(349); senao_opcional();
				setState(350); match(FIMCASO);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(352); match(PARA);
				setState(353); ((CmdContext)_localctx).IDENT = match(IDENT);

				        if(!isTokenPresent((((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null)))
				            error("Contador de loop nao declarado: "+(((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null),((CmdContext)_localctx).IDENT.getLine());
				       
				setState(355); match(ARROW);
				setState(356); exp_aritmetica();
				setState(357); match(ATE);
				setState(358); exp_aritmetica();
				setState(359); match(FACA);
				setState(360); comandos();
				setState(361); match(FIMPARA);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(363); match(ENQUANTO);
				setState(364); expressao();
				setState(365); match(FACA);
				setState(366); comandos();
				setState(367); match(FIMENQUANTO);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(369); match(FACA);
				setState(370); comandos();
				setState(371); match(ATE);
				setState(372); expressao();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(374); match(UP_HAT);
				setState(375); ((CmdContext)_localctx).IDENT = match(IDENT);
				setState(376); outros_ident();
				setState(377); dimensao();
				setState(378); match(ARROW);
				setState(379); expressao();

				        if(!isTokenPresent((((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null)))
				            error("Ponteiro nao declarado: "+(((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null),((CmdContext)_localctx).IDENT.getLine());
				       
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(382); ((CmdContext)_localctx).IDENT = match(IDENT);
				setState(383); chamada();

				        if(!isTokenPresent((((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null)))
				            error("Identificador nao declarado: "+(((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null),((CmdContext)_localctx).IDENT.getLine());
				       
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(386); atribuicao();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(387); ((CmdContext)_localctx).RETORNE = match(RETORNE);
				setState(388); expressao();
				    boolean erro = true;
				            for(TokenSymbolTable currentTable : allTables()){
				              if(currentTable.getScope().equals("FUNC"))
				                erro = false;
				            }
				            if(erro){
				              error("Retorne em local inadequado", ((CmdContext)_localctx).RETORNE.getLine());       
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

	public static class Mais_expressaoContext extends ParserRuleContext {
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(LAGrammar1Parser.COMMA); }
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
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(393); match(COMMA);
				setState(394); expressao();
				}
				}
				setState(399);
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
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode SENAO() { return getToken(LAGrammar1Parser.SENAO, 0); }
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
			setState(402);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(400); match(SENAO);
				setState(401); comandos();
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public Token IDENT;
		public Outros_identContext outros_ident;
		public ExpressaoContext expressao;
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(LAGrammar1Parser.ARROW, 0); }
		public TerminalNode IDENT() { return getToken(LAGrammar1Parser.IDENT, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404); ((AtribuicaoContext)_localctx).IDENT = match(IDENT);
			setState(405); ((AtribuicaoContext)_localctx).outros_ident = outros_ident();
			setState(406); dimensao();
			setState(407); match(ARROW);
			setState(408); ((AtribuicaoContext)_localctx).expressao = expressao();

			                if(!isTokenPresent((((AtribuicaoContext)_localctx).IDENT!=null?((AtribuicaoContext)_localctx).IDENT.getText():null))){
			                    error("Variavel nao declarada: "+(((AtribuicaoContext)_localctx).IDENT!=null?((AtribuicaoContext)_localctx).IDENT.getText():null),((AtribuicaoContext)_localctx).IDENT.getLine());
			                }else{
			                    String correctToken = (((AtribuicaoContext)_localctx).IDENT!=null?((AtribuicaoContext)_localctx).IDENT.getText():null);
			                    
			                    if(((AtribuicaoContext)_localctx).outros_ident.lastName.length() > 0)
			                        correctToken = ((AtribuicaoContext)_localctx).outros_ident.lastName;
			                    
			                    if(!tokenType(correctToken).equals(((AtribuicaoContext)_localctx).expressao.val))
			                        error("Atribuicao invalida: "+correctToken+" do tipo "+
			                        tokenType(correctToken)+" nao pode receber a expressao"+
			                        " do tipo "+((AtribuicaoContext)_localctx).expressao.val
			                        ,((AtribuicaoContext)_localctx).IDENT.getLine());
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

	public static class ChamadaContext extends ParserRuleContext {
		public Argumentos_opcionalContext argumentos_opcional() {
			return getRuleContext(Argumentos_opcionalContext.class,0);
		}
		public TerminalNode LPARENTHESIS() { return getToken(LAGrammar1Parser.LPARENTHESIS, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(LAGrammar1Parser.RPARENTHESIS, 0); }
		public ChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).enterChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1Listener ) ((LAGrammar1Listener)listener).exitChamada(this);
		}
	}

	public final ChamadaContext chamada() throws RecognitionException {
		ChamadaContext _localctx = new ChamadaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_chamada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411); match(LPARENTHESIS);
			setState(412); argumentos_opcional();
			setState(413); match(RPARENTHESIS);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 62, RULE_argumentos_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP_HAT) | (1L << LPARENTHESIS) | (1L << MINUS) | (1L << COMMERCIAL_E) | (1L << NOT) | (1L << VERDADEIRO) | (1L << FALSO) | (1L << CADEIA) | (1L << NUM_INT) | (1L << NUM_REAL) | (1L << IDENT))) != 0)) {
				{
				setState(415); expressao();
				setState(416); mais_expressao();
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
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LAGrammar1Parser.COLON, 0); }
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
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
		enterRule(_localctx, 64, RULE_selecao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420); constantes();
			setState(421); match(COLON);
			setState(422); comandos();
			setState(423); mais_selecao();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 66, RULE_mais_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_la = _input.LA(1);
			if (_la==MINUS || _la==NUM_INT) {
				{
				setState(425); selecao();
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
		public Mais_constantesContext mais_constantes() {
			return getRuleContext(Mais_constantesContext.class,0);
		}
		public Numero_intervaloContext numero_intervalo() {
			return getRuleContext(Numero_intervaloContext.class,0);
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
		enterRule(_localctx, 68, RULE_constantes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428); numero_intervalo();
			setState(429); mais_constantes();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 70, RULE_mais_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(431); match(COMMA);
				setState(432); constantes();
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
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(LAGrammar1Parser.NUM_INT, 0); }
		public Intervalo_opcionalContext intervalo_opcional() {
			return getRuleContext(Intervalo_opcionalContext.class,0);
		}
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
		enterRule(_localctx, 72, RULE_numero_intervalo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); op_unario();
			setState(436); match(NUM_INT);
			setState(437); intervalo_opcional();
			}
		}
		catch (RecognitionException re) {
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
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public TerminalNode TWODOTS() { return getToken(LAGrammar1Parser.TWODOTS, 0); }
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
		enterRule(_localctx, 74, RULE_intervalo_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_la = _input.LA(1);
			if (_la==TWODOTS) {
				{
				setState(439); match(TWODOTS);
				setState(440); op_unario();
				setState(441); match(NUM_INT);
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
		public boolean b;
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
		enterRule(_localctx, 76, RULE_op_unario);
		((Op_unarioContext)_localctx).b =  false;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(445); match(MINUS);
				((Op_unarioContext)_localctx).b =  true;
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
		public String val;
		public TermoContext termo;
		public Outros_termosContext outros_termos;
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
		enterRule(_localctx, 78, RULE_exp_aritmetica);
		((Exp_aritmeticaContext)_localctx).val =  "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449); ((Exp_aritmeticaContext)_localctx).termo = termo();
			setState(450); ((Exp_aritmeticaContext)_localctx).outros_termos = outros_termos();

			                /*Combinacao com outros fatores em op adicao*/
			                if(((Exp_aritmeticaContext)_localctx).outros_termos.val.length() > 0){
			                     if(((Exp_aritmeticaContext)_localctx).outros_termos.val.equals("tipo_invalido"))
			                      ((Exp_aritmeticaContext)_localctx).val =  "tipo_invalido";/*sobe tipo invalido direto*/
			                     else {
			                        /*Se o tipo de outros fatores e valido
			                        entao vemos o tipo de fator*/
			                        if(((Exp_aritmeticaContext)_localctx).termo.val.equals("inteiro") ||
			                           ((Exp_aritmeticaContext)_localctx).termo.val.equals("real")
			                        ){
			                            if(((Exp_aritmeticaContext)_localctx).outros_termos.val.equals("real"))
			                             ((Exp_aritmeticaContext)_localctx).val =  "real";/*Caso real, real prevalece*/
			                            else
			                             ((Exp_aritmeticaContext)_localctx).val =  ((Exp_aritmeticaContext)_localctx).termo.val; /*caso inteiro, tipo de fator prevalece*/
			                        }else
			                            ((Exp_aritmeticaContext)_localctx).val =  "tipo_invalido";
			                     }
			                }else{/*Apenas fator esta presente*/
			                    ((Exp_aritmeticaContext)_localctx).val =  ((Exp_aritmeticaContext)_localctx).termo.val;                                
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

	public static class Op_multiplicacaoContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(LAGrammar1Parser.DIV, 0); }
		public TerminalNode MULT() { return getToken(LAGrammar1Parser.MULT, 0); }
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
		enterRule(_localctx, 80, RULE_op_multiplicacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
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
		public TerminalNode MINUS() { return getToken(LAGrammar1Parser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(LAGrammar1Parser.PLUS, 0); }
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
		enterRule(_localctx, 82, RULE_op_adicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
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
		public String val;
		public FatorContext fator;
		public Outros_fatoresContext outros_fatores;
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
		enterRule(_localctx, 84, RULE_termo);
		((TermoContext)_localctx).val =  "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457); ((TermoContext)_localctx).fator = fator();
			setState(458); ((TermoContext)_localctx).outros_fatores = outros_fatores();

			          
			            /*Combinacao com outros fatores em op mult*/
			            if(((TermoContext)_localctx).outros_fatores.val.length() > 0){
			                 if(((TermoContext)_localctx).outros_fatores.val.equals("tipo_invalido"))
			                  ((TermoContext)_localctx).val =  "tipo_invalido";/*sobe tipo invalido direto*/
			                 else {
			                    /*Se o tipo de outros fatores e valido
			                    entao vemos o tipo de fator*/
			                    if(((TermoContext)_localctx).fator.val.equals("inteiro") ||
			                       ((TermoContext)_localctx).fator.val.equals("real")
			                    ){
			                        if(((TermoContext)_localctx).outros_fatores.val.equals("real"))
			                         ((TermoContext)_localctx).val =  "real";/*Caso real, real prevalece*/
			                        else
			                         ((TermoContext)_localctx).val =  ((TermoContext)_localctx).fator.val; /*caso inteiro, tipo de fator prevalece*/
			                    }else
			                        ((TermoContext)_localctx).val =  "tipo_invalido";
			                 }
			            }else{/*Apenas fator esta presente*/
			                ((TermoContext)_localctx).val =  ((TermoContext)_localctx).fator.val;                                
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

	public static class Outros_termosContext extends ParserRuleContext {
		public String val;
		public TermoContext termo;
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<Op_adicaoContext> op_adicao() {
			return getRuleContexts(Op_adicaoContext.class);
		}
		public Op_adicaoContext op_adicao(int i) {
			return getRuleContext(Op_adicaoContext.class,i);
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
		enterRule(_localctx, 86, RULE_outros_termos);
		((Outros_termosContext)_localctx).val =  "";
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(461); op_adicao();
					setState(462); ((Outros_termosContext)_localctx).termo = termo();

					                   if(((Outros_termosContext)_localctx).termo.val.equals("inteiro")
					                   || ((Outros_termosContext)_localctx).termo.val.equals("real"))
					                    ((Outros_termosContext)_localctx).val =  ((Outros_termosContext)_localctx).termo.val;
					                   else
					                    ((Outros_termosContext)_localctx).val =  "tipo_invalido";
					                   
					}
					} 
				}
				setState(469);
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
		public String val;
		public ParcelaContext parcela;
		public Outras_parcelasContext outras_parcelas;
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
		enterRule(_localctx, 88, RULE_fator);
		((FatorContext)_localctx).val =  "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470); ((FatorContext)_localctx).parcela = parcela();
			setState(471); ((FatorContext)_localctx).outras_parcelas = outras_parcelas();

			            if(((FatorContext)_localctx).outras_parcelas.val.length() > 0){
			                if(((FatorContext)_localctx).outras_parcelas.val.equals("tipo_invalido"))
			                    ((FatorContext)_localctx).val =  "tipo_invalido";
			                else if(((FatorContext)_localctx).parcela.val.equals("inteiro"))
			                    ((FatorContext)_localctx).val =  "inteiro";
			            }else
			                ((FatorContext)_localctx).val =  ((FatorContext)_localctx).parcela.val;
			                    
			         
			}
		}
		catch (RecognitionException re) {
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
		public String val;
		public FatorContext fator;
		public List<Op_multiplicacaoContext> op_multiplicacao() {
			return getRuleContexts(Op_multiplicacaoContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public Op_multiplicacaoContext op_multiplicacao(int i) {
			return getRuleContext(Op_multiplicacaoContext.class,i);
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
		enterRule(_localctx, 90, RULE_outros_fatores);
		((Outros_fatoresContext)_localctx).val =  "";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(474); op_multiplicacao();
				setState(475); ((Outros_fatoresContext)_localctx).fator = fator();

				                   if(((Outros_fatoresContext)_localctx).fator.val.equals("inteiro")
				                   || ((Outros_fatoresContext)_localctx).fator.val.equals("real"))
				                    ((Outros_fatoresContext)_localctx).val =  ((Outros_fatoresContext)_localctx).fator.val;
				                   else
				                    ((Outros_fatoresContext)_localctx).val =  "tipo_invalido";
				                   
				}
				}
				setState(482);
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
		public String val;
		public Op_unarioContext op_unario;
		public Parcela_unarioContext parcela_unario;
		public Parcela_nao_unarioContext parcela_nao_unario;
		public Parcela_unarioContext parcela_unario() {
			return getRuleContext(Parcela_unarioContext.class,0);
		}
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public Parcela_nao_unarioContext parcela_nao_unario() {
			return getRuleContext(Parcela_nao_unarioContext.class,0);
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
		enterRule(_localctx, 92, RULE_parcela);
		((ParcelaContext)_localctx).val =  "";
		try {
			setState(490);
			switch (_input.LA(1)) {
			case UP_HAT:
			case LPARENTHESIS:
			case MINUS:
			case NUM_INT:
			case NUM_REAL:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(483); ((ParcelaContext)_localctx).op_unario = op_unario();
				setState(484); ((ParcelaContext)_localctx).parcela_unario = parcela_unario();
				  
				                if(((ParcelaContext)_localctx).op_unario.b){        
				                    if(((ParcelaContext)_localctx).parcela_unario.val.equals("real") ||
				                        ((ParcelaContext)_localctx).parcela_unario.val.equals("inteiro"))
				                        ((ParcelaContext)_localctx).val =  ((ParcelaContext)_localctx).parcela_unario.val;
				                    else
				                        ((ParcelaContext)_localctx).val =  "tipo_invalido";
				                }else
				                    ((ParcelaContext)_localctx).val =  ((ParcelaContext)_localctx).parcela_unario.val;
				           
				}
				break;
			case COMMERCIAL_E:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(487); ((ParcelaContext)_localctx).parcela_nao_unario = parcela_nao_unario();
				((ParcelaContext)_localctx).val =  ((ParcelaContext)_localctx).parcela_nao_unario.val;
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
		public String val;
		public Token IDENT;
		public Outros_identContext outros_ident;
		public ExpressaoContext expressao;
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TerminalNode UP_HAT() { return getToken(LAGrammar1Parser.UP_HAT, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(LAGrammar1Parser.NUM_INT, 0); }
		public Chamada_partesContext chamada_partes() {
			return getRuleContext(Chamada_partesContext.class,0);
		}
		public TerminalNode NUM_REAL() { return getToken(LAGrammar1Parser.NUM_REAL, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(LAGrammar1Parser.LPARENTHESIS, 0); }
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
		enterRule(_localctx, 94, RULE_parcela_unario);
		((Parcela_unarioContext)_localctx).val =  "";
		try {
			setState(514);
			switch (_input.LA(1)) {
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				switch (_input.LA(1)) {
				case NUM_INT:
					{
					setState(492); match(NUM_INT);
					((Parcela_unarioContext)_localctx).val =  "inteiro";
					}
					break;
				case NUM_REAL:
					{
					setState(494); match(NUM_REAL);
					((Parcela_unarioContext)_localctx).val =  "real";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case UP_HAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(498); match(UP_HAT);
				setState(499); ((Parcela_unarioContext)_localctx).IDENT = match(IDENT);
				((Parcela_unarioContext)_localctx).val =  tokenType((((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null));
				setState(501); ((Parcela_unarioContext)_localctx).outros_ident = outros_ident();
				 if(((Parcela_unarioContext)_localctx).outros_ident.lastName.length() > 0)
				                                    ((Parcela_unarioContext)_localctx).val =  tokenType(((Parcela_unarioContext)_localctx).outros_ident.lastName);
				                    
				setState(503); dimensao();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(505); ((Parcela_unarioContext)_localctx).IDENT = match(IDENT);
				setState(506); chamada_partes();
				((Parcela_unarioContext)_localctx).val =  tokenType((((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null));
				}
				break;
			case LPARENTHESIS:
				enterOuterAlt(_localctx, 4);
				{
				setState(509); match(LPARENTHESIS);
				setState(510); ((Parcela_unarioContext)_localctx).expressao = expressao();
				((Parcela_unarioContext)_localctx).val =  ((Parcela_unarioContext)_localctx).expressao.val;
				setState(512); match(RPARENTHESIS);
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
		public String val;
		public Token IDENT;
		public Outros_identContext outros_ident;
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(LAGrammar1Parser.CADEIA, 0); }
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
		enterRule(_localctx, 96, RULE_parcela_nao_unario);
		((Parcela_nao_unarioContext)_localctx).val =  "";
		try {
			setState(524);
			switch (_input.LA(1)) {
			case COMMERCIAL_E:
				enterOuterAlt(_localctx, 1);
				{
				setState(516); match(COMMERCIAL_E);
				setState(517); ((Parcela_nao_unarioContext)_localctx).IDENT = match(IDENT);
				setState(518); ((Parcela_nao_unarioContext)_localctx).outros_ident = outros_ident();

				                       String identifier = (((Parcela_nao_unarioContext)_localctx).IDENT!=null?((Parcela_nao_unarioContext)_localctx).IDENT.getText():null);
				                       if(((Parcela_nao_unarioContext)_localctx).outros_ident.lastName.length() > 0){
				                            identifier = ((Parcela_nao_unarioContext)_localctx).outros_ident.lastName;                        
				                       }
				                       ((Parcela_nao_unarioContext)_localctx).val =  "^"+tokenType(identifier);
				                      
				setState(520); dimensao();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(522); match(CADEIA);
				((Parcela_nao_unarioContext)_localctx).val =  "literal";
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
		public String val;
		public ParcelaContext parcela;
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
		enterRule(_localctx, 98, RULE_outras_parcelas);
		((Outras_parcelasContext)_localctx).val =  "";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PERCENT) {
				{
				{
				setState(526); match(PERCENT);
				setState(527); ((Outras_parcelasContext)_localctx).parcela = parcela();

				                         if(((Outras_parcelasContext)_localctx).parcela.val.equals("inteiro"))
				                            ((Outras_parcelasContext)_localctx).val =  ((Outras_parcelasContext)_localctx).parcela.val;
				                         else
				                            ((Outras_parcelasContext)_localctx).val =  "tipo_invalido";
				                        
				}
				}
				setState(534);
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
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public TerminalNode LPARENTHESIS() { return getToken(LAGrammar1Parser.LPARENTHESIS, 0); }
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
		enterRule(_localctx, 100, RULE_chamada_partes);
		try {
			setState(543);
			switch (_input.LA(1)) {
			case LPARENTHESIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(535); match(LPARENTHESIS);
				setState(536); expressao();
				setState(537); mais_expressao();
				setState(538); match(RPARENTHESIS);
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
				setState(540); outros_ident();
				setState(541); dimensao();
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
		public String val;
		public Exp_aritmeticaContext exp_aritmetica;
		public Op_opcionalContext op_opcional;
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
		enterRule(_localctx, 102, RULE_exp_relacional);
		 ((Exp_relacionalContext)_localctx).val =  "tipo_invalido"; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545); ((Exp_relacionalContext)_localctx).exp_aritmetica = exp_aritmetica();
			((Exp_relacionalContext)_localctx).val =  ((Exp_relacionalContext)_localctx).exp_aritmetica.val;
			setState(547); ((Exp_relacionalContext)_localctx).op_opcional = op_opcional();
			if(((Exp_relacionalContext)_localctx).op_opcional.b)
			                                ((Exp_relacionalContext)_localctx).val =  "logico";
			}
		}
		catch (RecognitionException re) {
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
		public boolean b;
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
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
		enterRule(_localctx, 104, RULE_op_opcional);
		 ((Op_opcionalContext)_localctx).b =  false; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << DIFFERENT) | (1L << GREATERTHANEQ) | (1L << LESSTHANEQ) | (1L << GREATERTHAN) | (1L << LESSTHAN))) != 0)) {
				{
				setState(550); op_relacional();
				setState(551); exp_aritmetica();
				((Op_opcionalContext)_localctx).b =  true;
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
		enterRule(_localctx, 106, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
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
		public String val;
		public Termo_logicoContext termo_logico;
		public Outros_termos_logicosContext outros_termos_logicos;
		public Termo_logicoContext termo_logico() {
			return getRuleContext(Termo_logicoContext.class,0);
		}
		public Outros_termos_logicosContext outros_termos_logicos() {
			return getRuleContext(Outros_termos_logicosContext.class,0);
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
		enterRule(_localctx, 108, RULE_expressao);
		 ((ExpressaoContext)_localctx).val =  "tipo_invalido"; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558); ((ExpressaoContext)_localctx).termo_logico = termo_logico();
			setState(559); ((ExpressaoContext)_localctx).outros_termos_logicos = outros_termos_logicos();

			                    if(((ExpressaoContext)_localctx).outros_termos_logicos.val != null){
			                       if(((ExpressaoContext)_localctx).termo_logico.val.equals(((ExpressaoContext)_localctx).outros_termos_logicos.val)){
			                           ((ExpressaoContext)_localctx).val =  ((ExpressaoContext)_localctx).termo_logico.val;
			                       }/*else deixa ser invalido*/
			                    }else{
			                          ((ExpressaoContext)_localctx).val =  ((ExpressaoContext)_localctx).termo_logico.val;
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

	public static class Op_naoContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(LAGrammar1Parser.NOT, 0); }
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
		enterRule(_localctx, 110, RULE_op_nao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(562); match(NOT);
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
		public String val;
		public Fator_logicoContext fator_logico;
		public Outros_fatores_logicosContext outros_fatores_logicos;
		public Outros_fatores_logicosContext outros_fatores_logicos() {
			return getRuleContext(Outros_fatores_logicosContext.class,0);
		}
		public Fator_logicoContext fator_logico() {
			return getRuleContext(Fator_logicoContext.class,0);
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
		enterRule(_localctx, 112, RULE_termo_logico);
		 ((Termo_logicoContext)_localctx).val =  "tipo_invalido"; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565); ((Termo_logicoContext)_localctx).fator_logico = fator_logico();
			setState(566); ((Termo_logicoContext)_localctx).outros_fatores_logicos = outros_fatores_logicos();

			                    if(((Termo_logicoContext)_localctx).outros_fatores_logicos.val != null){
			                       if(((Termo_logicoContext)_localctx).fator_logico.val.equals(((Termo_logicoContext)_localctx).outros_fatores_logicos.val)){
			                           ((Termo_logicoContext)_localctx).val =  ((Termo_logicoContext)_localctx).fator_logico.val;
			                       }/*else deixa ser invalido*/
			                    }else{
			                          ((Termo_logicoContext)_localctx).val =  ((Termo_logicoContext)_localctx).fator_logico.val;
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

	public static class Outros_termos_logicosContext extends ParserRuleContext {
		public String val;
		public Termo_logicoContext termo_logico;
		public Termo_logicoContext termo_logico(int i) {
			return getRuleContext(Termo_logicoContext.class,i);
		}
		public List<Termo_logicoContext> termo_logico() {
			return getRuleContexts(Termo_logicoContext.class);
		}
		public List<TerminalNode> OR() { return getTokens(LAGrammar1Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(LAGrammar1Parser.OR, i);
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
		enterRule(_localctx, 114, RULE_outros_termos_logicos);
		 ((Outros_termos_logicosContext)_localctx).val =  null;
		          List<String> tipos = new ArrayList<>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(569); match(OR);
				setState(570); ((Outros_termos_logicosContext)_localctx).termo_logico = termo_logico();
				 tipos.add(((Outros_termos_logicosContext)_localctx).termo_logico.val); 
				}
				}
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			            if(tipos.size() > 0){
			                String aux = tipos.get(0);
			                for(String tipo : tipos){
			                   if(!aux.equals(tipo)){
			                    aux = "tipo_invalido";
			                    break;
			                   }
			                }
			                ((Outros_termos_logicosContext)_localctx).val =  aux;
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
		public String val;
		public Fator_logicoContext fator_logico;
		public List<TerminalNode> AND() { return getTokens(LAGrammar1Parser.AND); }
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
		}
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public TerminalNode AND(int i) {
			return getToken(LAGrammar1Parser.AND, i);
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
		enterRule(_localctx, 116, RULE_outros_fatores_logicos);
		 ((Outros_fatores_logicosContext)_localctx).val =  null;
		          List<String> tipos = new ArrayList<>(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(580); match(AND);
				setState(581); ((Outros_fatores_logicosContext)_localctx).fator_logico = fator_logico();
				 tipos.add(((Outros_fatores_logicosContext)_localctx).fator_logico.val); 
				}
				}
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			            if(tipos.size() > 0){
			                String aux = tipos.get(0);
			                for(String tipo : tipos){
			                   if(!aux.equals(tipo)){
			                    aux = "tipo_invalido";
			                    break;
			                   }
			                }
			                ((Outros_fatores_logicosContext)_localctx).val =  aux;
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
		public String val;
		public Parcela_logicaContext parcela_logica;
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
		enterRule(_localctx, 118, RULE_fator_logico);
		 ((Fator_logicoContext)_localctx).val =  "tipo_invalido"; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591); op_nao();
			setState(592); ((Fator_logicoContext)_localctx).parcela_logica = parcela_logica();
			 ((Fator_logicoContext)_localctx).val =  ((Fator_logicoContext)_localctx).parcela_logica.val; 
			}
		}
		catch (RecognitionException re) {
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
		public String val;
		public Exp_relacionalContext exp_relacional;
		public Exp_relacionalContext exp_relacional() {
			return getRuleContext(Exp_relacionalContext.class,0);
		}
		public TerminalNode FALSO() { return getToken(LAGrammar1Parser.FALSO, 0); }
		public TerminalNode VERDADEIRO() { return getToken(LAGrammar1Parser.VERDADEIRO, 0); }
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
		enterRule(_localctx, 120, RULE_parcela_logica);
		 ((Parcela_logicaContext)_localctx).val =  "tipo_invalido"; 
		try {
			setState(604);
			switch (_input.LA(1)) {
			case VERDADEIRO:
			case FALSO:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				switch (_input.LA(1)) {
				case VERDADEIRO:
					{
					setState(595); match(VERDADEIRO);
					 ((Parcela_logicaContext)_localctx).val =  "logico"; 
					}
					break;
				case FALSO:
					{
					setState(597); match(FALSO);
					 ((Parcela_logicaContext)_localctx).val =  "logico"; 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
				setState(601); ((Parcela_logicaContext)_localctx).exp_relacional = exp_relacional();
				 ((Parcela_logicaContext)_localctx).val =  ((Parcela_logicaContext)_localctx).exp_relacional.val; 
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3C\u0261\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\7\3\u0086\n\3\f\3\16\3\u0089"+
		"\13\3\3\4\3\4\5\4\u008d\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a1\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\7\7\u00ae\n\7\f\7\16\7\u00b1\13\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\7\t\u00bb\n\t\f\t\16\t\u00be\13\t\3\n\3\n\3\n\3\n\5\n\u00c4"+
		"\n\n\3\13\3\13\3\13\3\13\7\13\u00ca\n\13\f\13\16\13\u00cd\13\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00d5\n\f\3\r\3\r\7\r\u00d9\n\r\f\r\16\r\u00dc"+
		"\13\r\3\16\3\16\3\16\7\16\u00e1\n\16\f\16\16\16\u00e4\13\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ee\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00f5\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u0105\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0127\n\24\3\25"+
		"\5\25\u012a\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\5\27\u0134\n"+
		"\27\3\30\3\30\5\30\u0138\n\30\3\31\7\31\u013b\n\31\f\31\16\31\u013e\13"+
		"\31\3\32\3\32\3\32\3\33\7\33\u0144\n\33\f\33\16\33\u0147\13\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u018a\n\34\3\35\3\35\7\35"+
		"\u018e\n\35\f\35\16\35\u0191\13\35\3\36\3\36\5\36\u0195\n\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\5!\u01a5\n!\3\"\3\"\3\""+
		"\3\"\3\"\3#\5#\u01ad\n#\3$\3$\3$\3%\3%\5%\u01b4\n%\3&\3&\3&\3&\3\'\3\'"+
		"\3\'\3\'\5\'\u01be\n\'\3(\3(\5(\u01c2\n(\3)\3)\3)\3)\3*\3*\3+\3+\3,\3"+
		",\3,\3,\3-\3-\3-\3-\7-\u01d4\n-\f-\16-\u01d7\13-\3.\3.\3.\3.\3/\3/\3/"+
		"\3/\7/\u01e1\n/\f/\16/\u01e4\13/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5"+
		"\60\u01ed\n\60\3\61\3\61\3\61\3\61\5\61\u01f3\n\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0205"+
		"\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u020f\n\62\3\63\3\63"+
		"\3\63\3\63\7\63\u0215\n\63\f\63\16\63\u0218\13\63\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\5\64\u0222\n\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\66\5\66\u022d\n\66\3\67\3\67\38\38\38\38\39\59\u0236\n9\3:\3:"+
		"\3:\3:\3;\3;\3;\3;\7;\u0240\n;\f;\16;\u0243\13;\3;\3;\3<\3<\3<\3<\7<\u024b"+
		"\n<\f<\16<\u024e\13<\3<\3<\3=\3=\3=\3=\3>\3>\3>\3>\5>\u025a\n>\3>\3>\3"+
		">\5>\u025f\n>\3>\2?\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz\2\5\3\2\24\25\3\2\22\23\3"+
		"\2\30\35\u025d\2|\3\2\2\2\4\u0087\3\2\2\2\6\u008c\3\2\2\2\b\u00a0\3\2"+
		"\2\2\n\u00a2\3\2\2\2\f\u00af\3\2\2\2\16\u00b2\3\2\2\2\20\u00bc\3\2\2\2"+
		"\22\u00c3\3\2\2\2\24\u00cb\3\2\2\2\26\u00d4\3\2\2\2\30\u00da\3\2\2\2\32"+
		"\u00e2\3\2\2\2\34\u00ed\3\2\2\2\36\u00f4\3\2\2\2 \u00f6\3\2\2\2\"\u0104"+
		"\3\2\2\2$\u0106\3\2\2\2&\u0126\3\2\2\2(\u0129\3\2\2\2*\u012b\3\2\2\2,"+
		"\u0133\3\2\2\2.\u0137\3\2\2\2\60\u013c\3\2\2\2\62\u013f\3\2\2\2\64\u0145"+
		"\3\2\2\2\66\u0189\3\2\2\28\u018f\3\2\2\2:\u0194\3\2\2\2<\u0196\3\2\2\2"+
		">\u019d\3\2\2\2@\u01a4\3\2\2\2B\u01a6\3\2\2\2D\u01ac\3\2\2\2F\u01ae\3"+
		"\2\2\2H\u01b3\3\2\2\2J\u01b5\3\2\2\2L\u01bd\3\2\2\2N\u01c1\3\2\2\2P\u01c3"+
		"\3\2\2\2R\u01c7\3\2\2\2T\u01c9\3\2\2\2V\u01cb\3\2\2\2X\u01d5\3\2\2\2Z"+
		"\u01d8\3\2\2\2\\\u01e2\3\2\2\2^\u01ec\3\2\2\2`\u0204\3\2\2\2b\u020e\3"+
		"\2\2\2d\u0216\3\2\2\2f\u0221\3\2\2\2h\u0223\3\2\2\2j\u022c\3\2\2\2l\u022e"+
		"\3\2\2\2n\u0230\3\2\2\2p\u0235\3\2\2\2r\u0237\3\2\2\2t\u0241\3\2\2\2v"+
		"\u024c\3\2\2\2x\u0251\3\2\2\2z\u025e\3\2\2\2|}\b\2\1\2}~\5\4\3\2~\177"+
		"\7\3\2\2\177\u0080\5\62\32\2\u0080\u0081\b\2\1\2\u0081\u0082\7\4\2\2\u0082"+
		"\u0083\b\2\1\2\u0083\3\3\2\2\2\u0084\u0086\5\6\4\2\u0085\u0084\3\2\2\2"+
		"\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\5\3"+
		"\2\2\2\u0089\u0087\3\2\2\2\u008a\u008d\5\b\5\2\u008b\u008d\5&\24\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\7\3\2\2\2\u008e\u008f\7\5\2\2"+
		"\u008f\u0090\5\n\6\2\u0090\u0091\b\5\1\2\u0091\u00a1\3\2\2\2\u0092\u0093"+
		"\7\6\2\2\u0093\u0094\7A\2\2\u0094\u0095\7\7\2\2\u0095\u0096\5\34\17\2"+
		"\u0096\u0097\7\30\2\2\u0097\u0098\5\"\22\2\u0098\u0099\b\5\1\2\u0099\u00a1"+
		"\3\2\2\2\u009a\u009b\7\b\2\2\u009b\u009c\7A\2\2\u009c\u009d\7\7\2\2\u009d"+
		"\u009e\5\26\f\2\u009e\u009f\b\5\1\2\u009f\u00a1\3\2\2\2\u00a0\u008e\3"+
		"\2\2\2\u00a0\u0092\3\2\2\2\u00a0\u009a\3\2\2\2\u00a1\t\3\2\2\2\u00a2\u00a3"+
		"\7A\2\2\u00a3\u00a4\5\24\13\2\u00a4\u00a5\5\f\7\2\u00a5\u00a6\7\7\2\2"+
		"\u00a6\u00a7\5\26\f\2\u00a7\u00a8\b\6\1\2\u00a8\13\3\2\2\2\u00a9\u00aa"+
		"\7\t\2\2\u00aa\u00ab\7A\2\2\u00ab\u00ac\b\7\1\2\u00ac\u00ae\5\24\13\2"+
		"\u00ad\u00a9\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\r\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\5\20\t\2\u00b3"+
		"\u00b4\7A\2\2\u00b4\u00b5\b\b\1\2\u00b5\u00b6\5\24\13\2\u00b6\u00b7\5"+
		"\22\n\2\u00b7\17\3\2\2\2\u00b8\u00b9\7\n\2\2\u00b9\u00bb\b\t\1\2\u00ba"+
		"\u00b8\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\21\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7\13\2\2\u00c0\u00c1"+
		"\5\16\b\2\u00c1\u00c2\b\n\1\2\u00c2\u00c4\3\2\2\2\u00c3\u00bf\3\2\2\2"+
		"\u00c3\u00c4\3\2\2\2\u00c4\23\3\2\2\2\u00c5\u00c6\7\f\2\2\u00c6\u00c7"+
		"\5P)\2\u00c7\u00c8\7\r\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c5\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\25\3\2\2"+
		"\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\5$\23\2\u00cf\u00d0\b\f\1\2\u00d0\u00d5"+
		"\3\2\2\2\u00d1\u00d2\5 \21\2\u00d2\u00d3\b\f\1\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00ce\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d5\27\3\2\2\2\u00d6\u00d7\7\t\2"+
		"\2\u00d7\u00d9\5\16\b\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\31\3\2\2\2\u00dc\u00da\3\2\2"+
		"\2\u00dd\u00de\5\n\6\2\u00de\u00df\b\16\1\2\u00df\u00e1\3\2\2\2\u00e0"+
		"\u00dd\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\33\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7\37\2\2\u00e6\u00ee"+
		"\b\17\1\2\u00e7\u00e8\7 \2\2\u00e8\u00ee\b\17\1\2\u00e9\u00ea\7!\2\2\u00ea"+
		"\u00ee\b\17\1\2\u00eb\u00ec\7\"\2\2\u00ec\u00ee\b\17\1\2\u00ed\u00e5\3"+
		"\2\2\2\u00ed\u00e7\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\35\3\2\2\2\u00ef\u00f0\5\34\17\2\u00f0\u00f1\b\20\1\2\u00f1\u00f5\3\2"+
		"\2\2\u00f2\u00f3\7A\2\2\u00f3\u00f5\b\20\1\2\u00f4\u00ef\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f5\37\3\2\2\2\u00f6\u00f7\5\20\t\2\u00f7\u00f8\5\36"+
		"\20\2\u00f8\u00f9\b\21\1\2\u00f9!\3\2\2\2\u00fa\u00fb\7>\2\2\u00fb\u0105"+
		"\b\22\1\2\u00fc\u00fd\7?\2\2\u00fd\u0105\b\22\1\2\u00fe\u00ff\7@\2\2\u00ff"+
		"\u0105\b\22\1\2\u0100\u0101\7%\2\2\u0101\u0105\b\22\1\2\u0102\u0103\7"+
		"&\2\2\u0103\u0105\b\22\1\2\u0104\u00fa\3\2\2\2\u0104\u00fc\3\2\2\2\u0104"+
		"\u00fe\3\2\2\2\u0104\u0100\3\2\2\2\u0104\u0102\3\2\2\2\u0105#\3\2\2\2"+
		"\u0106\u0107\7\'\2\2\u0107\u0108\5\n\6\2\u0108\u0109\b\23\1\2\u0109\u010a"+
		"\5\32\16\2\u010a\u010b\b\23\1\2\u010b\u010c\7(\2\2\u010c\u010d\b\23\1"+
		"\2\u010d%\3\2\2\2\u010e\u010f\7)\2\2\u010f\u0110\7A\2\2\u0110\u0111\b"+
		"\24\1\2\u0111\u0112\7\16\2\2\u0112\u0113\5(\25\2\u0113\u0114\7\17\2\2"+
		"\u0114\u0115\5\60\31\2\u0115\u0116\5\64\33\2\u0116\u0117\7*\2\2\u0117"+
		"\u0118\b\24\1\2\u0118\u0127\3\2\2\2\u0119\u011a\7+\2\2\u011a\u011b\7A"+
		"\2\2\u011b\u011c\b\24\1\2\u011c\u011d\7\16\2\2\u011d\u011e\5(\25\2\u011e"+
		"\u011f\7\17\2\2\u011f\u0120\7\7\2\2\u0120\u0121\5 \21\2\u0121\u0122\5"+
		"\60\31\2\u0122\u0123\5\64\33\2\u0123\u0124\7,\2\2\u0124\u0125\b\24\1\2"+
		"\u0125\u0127\3\2\2\2\u0126\u010e\3\2\2\2\u0126\u0119\3\2\2\2\u0127\'\3"+
		"\2\2\2\u0128\u012a\5*\26\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		")\3\2\2\2\u012b\u012c\5,\27\2\u012c\u012d\5\16\b\2\u012d\u012e\5\30\r"+
		"\2\u012e\u012f\7\7\2\2\u012f\u0130\5 \21\2\u0130\u0131\5.\30\2\u0131+"+
		"\3\2\2\2\u0132\u0134\7-\2\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"-\3\2\2\2\u0135\u0136\7\t\2\2\u0136\u0138\5*\26\2\u0137\u0135\3\2\2\2"+
		"\u0137\u0138\3\2\2\2\u0138/\3\2\2\2\u0139\u013b\5\b\5\2\u013a\u0139\3"+
		"\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\61\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\5\60\31\2\u0140\u0141\5\64"+
		"\33\2\u0141\63\3\2\2\2\u0142\u0144\5\66\34\2\u0143\u0142\3\2\2\2\u0144"+
		"\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\65\3\2\2"+
		"\2\u0147\u0145\3\2\2\2\u0148\u0149\7.\2\2\u0149\u014a\7\16\2\2\u014a\u014b"+
		"\5\16\b\2\u014b\u014c\5\30\r\2\u014c\u014d\7\17\2\2\u014d\u018a\3\2\2"+
		"\2\u014e\u014f\7/\2\2\u014f\u0150\7\16\2\2\u0150\u0151\5n8\2\u0151\u0152"+
		"\58\35\2\u0152\u0153\7\17\2\2\u0153\u018a\3\2\2\2\u0154\u0155\7\60\2\2"+
		"\u0155\u0156\5n8\2\u0156\u0157\7\61\2\2\u0157\u0158\5\64\33\2\u0158\u0159"+
		"\5:\36\2\u0159\u015a\7\62\2\2\u015a\u018a\3\2\2\2\u015b\u015c\7\63\2\2"+
		"\u015c\u015d\5P)\2\u015d\u015e\7\65\2\2\u015e\u015f\5B\"\2\u015f\u0160"+
		"\5:\36\2\u0160\u0161\7\64\2\2\u0161\u018a\3\2\2\2\u0162\u0163\7\66\2\2"+
		"\u0163\u0164\7A\2\2\u0164\u0165\b\34\1\2\u0165\u0166\7\21\2\2\u0166\u0167"+
		"\5P)\2\u0167\u0168\7\67\2\2\u0168\u0169\5P)\2\u0169\u016a\78\2\2\u016a"+
		"\u016b\5\64\33\2\u016b\u016c\79\2\2\u016c\u018a\3\2\2\2\u016d\u016e\7"+
		":\2\2\u016e\u016f\5n8\2\u016f\u0170\78\2\2\u0170\u0171\5\64\33\2\u0171"+
		"\u0172\7;\2\2\u0172\u018a\3\2\2\2\u0173\u0174\78\2\2\u0174\u0175\5\64"+
		"\33\2\u0175\u0176\7\67\2\2\u0176\u0177\5n8\2\u0177\u018a\3\2\2\2\u0178"+
		"\u0179\7\n\2\2\u0179\u017a\7A\2\2\u017a\u017b\5\22\n\2\u017b\u017c\5\24"+
		"\13\2\u017c\u017d\7\21\2\2\u017d\u017e\5n8\2\u017e\u017f\b\34\1\2\u017f"+
		"\u018a\3\2\2\2\u0180\u0181\7A\2\2\u0181\u0182\5> \2\u0182\u0183\b\34\1"+
		"\2\u0183\u018a\3\2\2\2\u0184\u018a\5<\37\2\u0185\u0186\7<\2\2\u0186\u0187"+
		"\5n8\2\u0187\u0188\b\34\1\2\u0188\u018a\3\2\2\2\u0189\u0148\3\2\2\2\u0189"+
		"\u014e\3\2\2\2\u0189\u0154\3\2\2\2\u0189\u015b\3\2\2\2\u0189\u0162\3\2"+
		"\2\2\u0189\u016d\3\2\2\2\u0189\u0173\3\2\2\2\u0189\u0178\3\2\2\2\u0189"+
		"\u0180\3\2\2\2\u0189\u0184\3\2\2\2\u0189\u0185\3\2\2\2\u018a\67\3\2\2"+
		"\2\u018b\u018c\7\t\2\2\u018c\u018e\5n8\2\u018d\u018b\3\2\2\2\u018e\u0191"+
		"\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u01909\3\2\2\2\u0191"+
		"\u018f\3\2\2\2\u0192\u0193\7=\2\2\u0193\u0195\5\64\33\2\u0194\u0192\3"+
		"\2\2\2\u0194\u0195\3\2\2\2\u0195;\3\2\2\2\u0196\u0197\7A\2\2\u0197\u0198"+
		"\5\22\n\2\u0198\u0199\5\24\13\2\u0199\u019a\7\21\2\2\u019a\u019b\5n8\2"+
		"\u019b\u019c\b\37\1\2\u019c=\3\2\2\2\u019d\u019e\7\16\2\2\u019e\u019f"+
		"\5@!\2\u019f\u01a0\7\17\2\2\u01a0?\3\2\2\2\u01a1\u01a2\5n8\2\u01a2\u01a3"+
		"\58\35\2\u01a3\u01a5\3\2\2\2\u01a4\u01a1\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"A\3\2\2\2\u01a6\u01a7\5F$\2\u01a7\u01a8\7\7\2\2\u01a8\u01a9\5\64\33\2"+
		"\u01a9\u01aa\5D#\2\u01aaC\3\2\2\2\u01ab\u01ad\5B\"\2\u01ac\u01ab\3\2\2"+
		"\2\u01ac\u01ad\3\2\2\2\u01adE\3\2\2\2\u01ae\u01af\5J&\2\u01af\u01b0\5"+
		"H%\2\u01b0G\3\2\2\2\u01b1\u01b2\7\t\2\2\u01b2\u01b4\5F$\2\u01b3\u01b1"+
		"\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4I\3\2\2\2\u01b5\u01b6\5N(\2\u01b6\u01b7"+
		"\7?\2\2\u01b7\u01b8\5L\'\2\u01b8K\3\2\2\2\u01b9\u01ba\7\20\2\2\u01ba\u01bb"+
		"\5N(\2\u01bb\u01bc\7?\2\2\u01bc\u01be\3\2\2\2\u01bd\u01b9\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01beM\3\2\2\2\u01bf\u01c0\7\22\2\2\u01c0\u01c2\b(\1\2"+
		"\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2O\3\2\2\2\u01c3\u01c4\5"+
		"V,\2\u01c4\u01c5\5X-\2\u01c5\u01c6\b)\1\2\u01c6Q\3\2\2\2\u01c7\u01c8\t"+
		"\2\2\2\u01c8S\3\2\2\2\u01c9\u01ca\t\3\2\2\u01caU\3\2\2\2\u01cb\u01cc\5"+
		"Z.\2\u01cc\u01cd\5\\/\2\u01cd\u01ce\b,\1\2\u01ceW\3\2\2\2\u01cf\u01d0"+
		"\5T+\2\u01d0\u01d1\5V,\2\u01d1\u01d2\b-\1\2\u01d2\u01d4\3\2\2\2\u01d3"+
		"\u01cf\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2"+
		"\2\2\u01d6Y\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9\5^\60\2\u01d9\u01da"+
		"\5d\63\2\u01da\u01db\b.\1\2\u01db[\3\2\2\2\u01dc\u01dd\5R*\2\u01dd\u01de"+
		"\5Z.\2\u01de\u01df\b/\1\2\u01df\u01e1\3\2\2\2\u01e0\u01dc\3\2\2\2\u01e1"+
		"\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3]\3\2\2\2"+
		"\u01e4\u01e2\3\2\2\2\u01e5\u01e6\5N(\2\u01e6\u01e7\5`\61\2\u01e7\u01e8"+
		"\b\60\1\2\u01e8\u01ed\3\2\2\2\u01e9\u01ea\5b\62\2\u01ea\u01eb\b\60\1\2"+
		"\u01eb\u01ed\3\2\2\2\u01ec\u01e5\3\2\2\2\u01ec\u01e9\3\2\2\2\u01ed_\3"+
		"\2\2\2\u01ee\u01ef\7?\2\2\u01ef\u01f3\b\61\1\2\u01f0\u01f1\7@\2\2\u01f1"+
		"\u01f3\b\61\1\2\u01f2\u01ee\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u0205\3"+
		"\2\2\2\u01f4\u01f5\7\n\2\2\u01f5\u01f6\7A\2\2\u01f6\u01f7\b\61\1\2\u01f7"+
		"\u01f8\5\22\n\2\u01f8\u01f9\b\61\1\2\u01f9\u01fa\5\24\13\2\u01fa\u0205"+
		"\3\2\2\2\u01fb\u01fc\7A\2\2\u01fc\u01fd\5f\64\2\u01fd\u01fe\b\61\1\2\u01fe"+
		"\u0205\3\2\2\2\u01ff\u0200\7\16\2\2\u0200\u0201\5n8\2\u0201\u0202\b\61"+
		"\1\2\u0202\u0203\7\17\2\2\u0203\u0205\3\2\2\2\u0204\u01f2\3\2\2\2\u0204"+
		"\u01f4\3\2\2\2\u0204\u01fb\3\2\2\2\u0204\u01ff\3\2\2\2\u0205a\3\2\2\2"+
		"\u0206\u0207\7\26\2\2\u0207\u0208\7A\2\2\u0208\u0209\5\22\n\2\u0209\u020a"+
		"\b\62\1\2\u020a\u020b\5\24\13\2\u020b\u020f\3\2\2\2\u020c\u020d\7>\2\2"+
		"\u020d\u020f\b\62\1\2\u020e\u0206\3\2\2\2\u020e\u020c\3\2\2\2\u020fc\3"+
		"\2\2\2\u0210\u0211\7\27\2\2\u0211\u0212\5^\60\2\u0212\u0213\b\63\1\2\u0213"+
		"\u0215\3\2\2\2\u0214\u0210\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2"+
		"\2\2\u0216\u0217\3\2\2\2\u0217e\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021a"+
		"\7\16\2\2\u021a\u021b\5n8\2\u021b\u021c\58\35\2\u021c\u021d\7\17\2\2\u021d"+
		"\u0222\3\2\2\2\u021e\u021f\5\22\n\2\u021f\u0220\5\24\13\2\u0220\u0222"+
		"\3\2\2\2\u0221\u0219\3\2\2\2\u0221\u021e\3\2\2\2\u0222g\3\2\2\2\u0223"+
		"\u0224\5P)\2\u0224\u0225\b\65\1\2\u0225\u0226\5j\66\2\u0226\u0227\b\65"+
		"\1\2\u0227i\3\2\2\2\u0228\u0229\5l\67\2\u0229\u022a\5P)\2\u022a\u022b"+
		"\b\66\1\2\u022b\u022d\3\2\2\2\u022c\u0228\3\2\2\2\u022c\u022d\3\2\2\2"+
		"\u022dk\3\2\2\2\u022e\u022f\t\4\2\2\u022fm\3\2\2\2\u0230\u0231\5r:\2\u0231"+
		"\u0232\5t;\2\u0232\u0233\b8\1\2\u0233o\3\2\2\2\u0234\u0236\7\36\2\2\u0235"+
		"\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236q\3\2\2\2\u0237\u0238\5x=\2\u0238"+
		"\u0239\5v<\2\u0239\u023a\b:\1\2\u023as\3\2\2\2\u023b\u023c\7#\2\2\u023c"+
		"\u023d\5r:\2\u023d\u023e\b;\1\2\u023e\u0240\3\2\2\2\u023f\u023b\3\2\2"+
		"\2\u0240\u0243\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244"+
		"\3\2\2\2\u0243\u0241\3\2\2\2\u0244\u0245\b;\1\2\u0245u\3\2\2\2\u0246\u0247"+
		"\7$\2\2\u0247\u0248\5x=\2\u0248\u0249\b<\1\2\u0249\u024b\3\2\2\2\u024a"+
		"\u0246\3\2\2\2\u024b\u024e\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2"+
		"\2\2\u024d\u024f\3\2\2\2\u024e\u024c\3\2\2\2\u024f\u0250\b<\1\2\u0250"+
		"w\3\2\2\2\u0251\u0252\5p9\2\u0252\u0253\5z>\2\u0253\u0254\b=\1\2\u0254"+
		"y\3\2\2\2\u0255\u0256\7%\2\2\u0256\u025a\b>\1\2\u0257\u0258\7&\2\2\u0258"+
		"\u025a\b>\1\2\u0259\u0255\3\2\2\2\u0259\u0257\3\2\2\2\u025a\u025f\3\2"+
		"\2\2\u025b\u025c\5h\65\2\u025c\u025d\b>\1\2\u025d\u025f\3\2\2\2\u025e"+
		"\u0259\3\2\2\2\u025e\u025b\3\2\2\2\u025f{\3\2\2\2+\u0087\u008c\u00a0\u00af"+
		"\u00bc\u00c3\u00cb\u00d4\u00da\u00e2\u00ed\u00f4\u0104\u0126\u0129\u0133"+
		"\u0137\u013c\u0145\u0189\u018f\u0194\u01a4\u01ac\u01b3\u01bd\u01c1\u01d5"+
		"\u01e2\u01ec\u01f2\u0204\u020e\u0216\u0221\u022c\u0235\u0241\u024c\u0259"+
		"\u025e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}