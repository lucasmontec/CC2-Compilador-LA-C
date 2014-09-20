// Generated from /home/joaovitor/NetBeansProjects/CC2-Compilador-LA-C/CC2-Compilador-LA-C/src/grammars/LAGrammar1_CodeGen.g4 by ANTLR 4.1
package antlr;

  import Semantic.TokenSymbol;
  import Semantic.TokenSymbolTable;
  import static Semantic.SemanticUtil.*;
  import CodeGeneration.Generator;
  import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LAGrammar1_CodeGenParser extends Parser {
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
		RULE_var_opcional = 21, RULE_declaracoes_locais = 22, RULE_corpo = 23, 
		RULE_comandos = 24, RULE_cmd = 25, RULE_mais_expressao = 26, RULE_senao_opcional = 27, 
		RULE_atribuicao = 28, RULE_chamada = 29, RULE_argumentos_opcional = 30, 
		RULE_selecao = 31, RULE_mais_selecao = 32, RULE_constantes = 33, RULE_mais_constantes = 34, 
		RULE_numero_intervalo = 35, RULE_intervalo_opcional = 36, RULE_op_unario = 37, 
		RULE_exp_aritmetica = 38, RULE_op_multiplicacao = 39, RULE_op_adicao = 40, 
		RULE_termo = 41, RULE_outros_termos = 42, RULE_fator = 43, RULE_outros_fatores = 44, 
		RULE_parcela = 45, RULE_parcela_unario = 46, RULE_parcela_nao_unario = 47, 
		RULE_outras_parcelas = 48, RULE_chamada_metodo = 49, RULE_chamada_parte = 50, 
		RULE_exp_relacional = 51, RULE_op_opcional = 52, RULE_op_relacional = 53, 
		RULE_expressao = 54, RULE_op_nao = 55, RULE_termo_logico = 56, RULE_outros_termos_logicos = 57, 
		RULE_outros_fatores_logicos = 58, RULE_fator_logico = 59, RULE_parcela_logica = 60;
	public static final String[] ruleNames = {
		"programa", "declaracoes", "decl_local_global", "declaracao_local", "variavel", 
		"mais_var", "identificador", "ponteiros_opcionais", "outros_ident", "dimensao", 
		"tipo", "mais_ident", "mais_variaveis", "tipo_basico", "tipo_basico_ident", 
		"tipo_estendido", "valor_constante", "registro", "declaracao_global", 
		"parametros_opcional", "parametro", "var_opcional", "declaracoes_locais", 
		"corpo", "comandos", "cmd", "mais_expressao", "senao_opcional", "atribuicao", 
		"chamada", "argumentos_opcional", "selecao", "mais_selecao", "constantes", 
		"mais_constantes", "numero_intervalo", "intervalo_opcional", "op_unario", 
		"exp_aritmetica", "op_multiplicacao", "op_adicao", "termo", "outros_termos", 
		"fator", "outros_fatores", "parcela", "parcela_unario", "parcela_nao_unario", 
		"outras_parcelas", "chamada_metodo", "chamada_parte", "exp_relacional", 
		"op_opcional", "op_relacional", "expressao", "op_nao", "termo_logico", 
		"outros_termos_logicos", "outros_fatores_logicos", "fator_logico", "parcela_logica"
	};

	@Override
	public String getGrammarFileName() { return "LAGrammar1_CodeGen.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public LAGrammar1_CodeGenParser(TokenStream input) {
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
		public TerminalNode ALGORITMO() { return getToken(LAGrammar1_CodeGenParser.ALGORITMO, 0); }
		public TerminalNode FIM_ALGORITMO() { return getToken(LAGrammar1_CodeGenParser.FIM_ALGORITMO, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 
			             Generator.includes();
			             push(new TokenSymbolTable("decl_globais"));
			            
			setState(123); declaracoes();
			Generator.startAlgorithm();
			setState(125); match(ALGORITMO);
			setState(126); corpo();
			setState(127); match(FIM_ALGORITMO);

			                if(hasErrors())
			                   printErrors();
			                /*printSignatures();*/
			                pop();/*Decl globais*/
			                Generator.endAlgorithm();
			                Generator.printCode();
			            
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitDeclaracoes(this);
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
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterDecl_local_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitDecl_local_global(this);
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
		public String val;
		public Token DECLARE;
		public VariavelContext variavel;
		public Token IDENT;
		public Tipo_basicoContext tipo_basico;
		public Valor_constanteContext valor_constante;
		public TipoContext tipo;
		public TerminalNode TIPO() { return getToken(LAGrammar1_CodeGenParser.TIPO, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode CONSTANTE() { return getToken(LAGrammar1_CodeGenParser.CONSTANTE, 0); }
		public TerminalNode EQUALS() { return getToken(LAGrammar1_CodeGenParser.EQUALS, 0); }
		public TerminalNode DECLARE() { return getToken(LAGrammar1_CodeGenParser.DECLARE, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LAGrammar1_CodeGenParser.COLON, 0); }
		public TerminalNode IDENT() { return getToken(LAGrammar1_CodeGenParser.IDENT, 0); }
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterDeclaracao_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitDeclaracao_local(this);
		}
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_local);
		((Declaracao_localContext)_localctx).val =  "";
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
				                 else{
				                   /*adiciona a variável*/
				                   top().addToken(s, ((Declaracao_localContext)_localctx).variavel.t);
				                   /*adiciona subvariáveis de registros*/
				                   if(((Declaracao_localContext)_localctx).variavel.t.startsWith("$")){
				                         for(String st: structTypes(((Declaracao_localContext)_localctx).variavel.t))
				                               top().addToken(s + "." + getSubtypeName(st), getSubtypeType(st));
				                   }
				                   if(tokenType(((Declaracao_localContext)_localctx).variavel.t).startsWith("$")){
				                         for(String st: structTypes(tokenType(((Declaracao_localContext)_localctx).variavel.t)))
				                               top().addToken(s + "." + getSubtypeName(st), getSubtypeType(st));
				                   }
				                 }
				           }  
				        }else{
				           error("Undeclared variable type: "+((Declaracao_localContext)_localctx).variavel.t, ((Declaracao_localContext)_localctx).DECLARE.getLine()); 
				        }
				        ((Declaracao_localContext)_localctx).val =  ((Declaracao_localContext)_localctx).variavel.names.toString();
				    
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
				        ((Declaracao_localContext)_localctx).val =  ((Declaracao_localContext)_localctx).tipo_basico.val; 
				     
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
				        ((Declaracao_localContext)_localctx).val =  ((Declaracao_localContext)_localctx).tipo.val;
				     
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
		public ArrayList<String> names;
		public String t;
		public Token IDENT;
		public DimensaoContext dimensao;
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
		public TerminalNode COLON() { return getToken(LAGrammar1_CodeGenParser.COLON, 0); }
		public TerminalNode IDENT() { return getToken(LAGrammar1_CodeGenParser.IDENT, 0); }
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitVariavel(this);
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
			setState(161); ((VariavelContext)_localctx).dimensao = dimensao();
			setState(162); ((VariavelContext)_localctx).mais_var = mais_var();
			setState(163); match(COLON);
			setState(164); ((VariavelContext)_localctx).tipo = tipo();

			            ((VariavelContext)_localctx).t =  ((VariavelContext)_localctx).tipo.val;
			            _localctx.names.add((((VariavelContext)_localctx).IDENT!=null?((VariavelContext)_localctx).IDENT.getText():null));
			            _localctx.names.addAll(((VariavelContext)_localctx).mais_var.nomes);
			            Generator.declareVariable((((VariavelContext)_localctx).IDENT!=null?((VariavelContext)_localctx).IDENT.getText():null), ((VariavelContext)_localctx).tipo.val, (((VariavelContext)_localctx).dimensao!=null?_input.getText(((VariavelContext)_localctx).dimensao.start,((VariavelContext)_localctx).dimensao.stop):null));
			            
			            for(int i=0; i<((VariavelContext)_localctx).mais_var.nomes.size();i++){
			               String n = ((VariavelContext)_localctx).mais_var.nomes.get(i);
			               String dim = ((VariavelContext)_localctx).mais_var.dims.get(i);
			               Generator.declareVariable(n, ((VariavelContext)_localctx).tipo.val, dim);                 
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

	public static class Mais_varContext extends ParserRuleContext {
		public ArrayList<String> nomes;
		public ArrayList<String> dims;
		public Token IDENT;
		public DimensaoContext dimensao;
		public DimensaoContext dimensao(int i) {
			return getRuleContext(DimensaoContext.class,i);
		}
		public List<DimensaoContext> dimensao() {
			return getRuleContexts(DimensaoContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(LAGrammar1_CodeGenParser.COMMA); }
		public List<TerminalNode> IDENT() { return getTokens(LAGrammar1_CodeGenParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LAGrammar1_CodeGenParser.IDENT, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(LAGrammar1_CodeGenParser.COMMA, i);
		}
		public Mais_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterMais_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitMais_var(this);
		}
	}

	public final Mais_varContext mais_var() throws RecognitionException {
		Mais_varContext _localctx = new Mais_varContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mais_var);
		 ((Mais_varContext)_localctx).nomes =  new ArrayList<String>(); ((Mais_varContext)_localctx).dims =  new ArrayList<String>(); 
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
				setState(167); match(COMMA);
				setState(168); ((Mais_varContext)_localctx).IDENT = match(IDENT);
				 
				                  if(!isTokenPresent((((Mais_varContext)_localctx).IDENT!=null?((Mais_varContext)_localctx).IDENT.getText():null))){
				                      _localctx.nomes.add((((Mais_varContext)_localctx).IDENT!=null?((Mais_varContext)_localctx).IDENT.getText():null));
				                  }else{
				                      error("Identificador ja declarado: "+
				                      (((Mais_varContext)_localctx).IDENT!=null?((Mais_varContext)_localctx).IDENT.getText():null),((Mais_varContext)_localctx).IDENT.getLine());
				                  }
				                
				setState(170); ((Mais_varContext)_localctx).dimensao = dimensao();

				        _localctx.dims.add((((Mais_varContext)_localctx).dimensao!=null?_input.getText(((Mais_varContext)_localctx).dimensao.start,((Mais_varContext)_localctx).dimensao.stop):null));
				     
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
		public TerminalNode IDENT() { return getToken(LAGrammar1_CodeGenParser.IDENT, 0); }
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitIdentificador(this);
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
		public List<TerminalNode> UP_HAT() { return getTokens(LAGrammar1_CodeGenParser.UP_HAT); }
		public TerminalNode UP_HAT(int i) {
			return getToken(LAGrammar1_CodeGenParser.UP_HAT, i);
		}
		public Ponteiros_opcionaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponteiros_opcionais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterPonteiros_opcionais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitPonteiros_opcionais(this);
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
		public String fullName;
		public IdentificadorContext identificador;
		public TerminalNode DOT() { return getToken(LAGrammar1_CodeGenParser.DOT, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Outros_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterOutros_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitOutros_ident(this);
		}
	}

	public final Outros_identContext outros_ident() throws RecognitionException {
		Outros_identContext _localctx = new Outros_identContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_outros_ident);
		 ((Outros_identContext)_localctx).fullName =  ""; 
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
				 _localctx.fullName+="."+((Outros_identContext)_localctx).identificador.nome; 
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
		public List<TerminalNode> LBRACKET() { return getTokens(LAGrammar1_CodeGenParser.LBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(LAGrammar1_CodeGenParser.RBRACKET, i);
		}
		public TerminalNode LBRACKET(int i) {
			return getToken(LAGrammar1_CodeGenParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(LAGrammar1_CodeGenParser.RBRACKET); }
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitDimensao(this);
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
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitTipo(this);
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
		public ArrayList<String> idents;
		public IdentificadorContext identificador;
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(LAGrammar1_CodeGenParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LAGrammar1_CodeGenParser.COMMA, i);
		}
		public Mais_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterMais_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitMais_ident(this);
		}
	}

	public final Mais_identContext mais_ident() throws RecognitionException {
		Mais_identContext _localctx = new Mais_identContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mais_ident);
		 ((Mais_identContext)_localctx).idents =  new ArrayList<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(214); match(COMMA);
				setState(215); ((Mais_identContext)_localctx).identificador = identificador();
				_localctx.idents.add(((Mais_identContext)_localctx).identificador.nome);
				}
				}
				setState(222);
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
		public HashMap<String, String> nomes;
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
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterMais_variaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitMais_variaveis(this);
		}
	}

	public final Mais_variaveisContext mais_variaveis() throws RecognitionException {
		Mais_variaveisContext _localctx = new Mais_variaveisContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mais_variaveis);
		 ((Mais_variaveisContext)_localctx).tipos =  new ArrayList<>(); ((Mais_variaveisContext)_localctx).nomes =  new HashMap<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(223); ((Mais_variaveisContext)_localctx).variavel = variavel();
				_localctx.tipos.add(((Mais_variaveisContext)_localctx).variavel.t);
				               for(String s: ((Mais_variaveisContext)_localctx).variavel.names)
				                    _localctx.nomes.put(s, ((Mais_variaveisContext)_localctx).variavel.t);                
				               
				}
				}
				setState(230);
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
		public TerminalNode INTEIRO() { return getToken(LAGrammar1_CodeGenParser.INTEIRO, 0); }
		public TerminalNode LITERAL() { return getToken(LAGrammar1_CodeGenParser.LITERAL, 0); }
		public TerminalNode LOGICO() { return getToken(LAGrammar1_CodeGenParser.LOGICO, 0); }
		public TerminalNode REAL() { return getToken(LAGrammar1_CodeGenParser.REAL, 0); }
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterTipo_basico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitTipo_basico(this);
		}
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo_basico);
		 ((Tipo_basicoContext)_localctx).val =  ""; 
		try {
			setState(239);
			switch (_input.LA(1)) {
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(231); ((Tipo_basicoContext)_localctx).LITERAL = match(LITERAL);
				 ((Tipo_basicoContext)_localctx).val = (((Tipo_basicoContext)_localctx).LITERAL!=null?((Tipo_basicoContext)_localctx).LITERAL.getText():null); 
				}
				break;
			case INTEIRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(233); ((Tipo_basicoContext)_localctx).INTEIRO = match(INTEIRO);
				 ((Tipo_basicoContext)_localctx).val = (((Tipo_basicoContext)_localctx).INTEIRO!=null?((Tipo_basicoContext)_localctx).INTEIRO.getText():null); 
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(235); ((Tipo_basicoContext)_localctx).REAL = match(REAL);
				 ((Tipo_basicoContext)_localctx).val = (((Tipo_basicoContext)_localctx).REAL!=null?((Tipo_basicoContext)_localctx).REAL.getText():null); 
				}
				break;
			case LOGICO:
				enterOuterAlt(_localctx, 4);
				{
				setState(237); ((Tipo_basicoContext)_localctx).LOGICO = match(LOGICO);
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
		public TerminalNode IDENT() { return getToken(LAGrammar1_CodeGenParser.IDENT, 0); }
		public Tipo_basico_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterTipo_basico_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitTipo_basico_ident(this);
		}
	}

	public final Tipo_basico_identContext tipo_basico_ident() throws RecognitionException {
		Tipo_basico_identContext _localctx = new Tipo_basico_identContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipo_basico_ident);
		 ((Tipo_basico_identContext)_localctx).val =  ""; 
		try {
			setState(246);
			switch (_input.LA(1)) {
			case LITERAL:
			case INTEIRO:
			case REAL:
			case LOGICO:
				enterOuterAlt(_localctx, 1);
				{
				setState(241); ((Tipo_basico_identContext)_localctx).tipo_basico = tipo_basico();
				 ((Tipo_basico_identContext)_localctx).val = ((Tipo_basico_identContext)_localctx).tipo_basico.val; 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(244); ((Tipo_basico_identContext)_localctx).IDENT = match(IDENT);
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
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterTipo_estendido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitTipo_estendido(this);
		}
	}

	public final Tipo_estendidoContext tipo_estendido() throws RecognitionException {
		Tipo_estendidoContext _localctx = new Tipo_estendidoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tipo_estendido);
		 ((Tipo_estendidoContext)_localctx).val =  ""; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248); ((Tipo_estendidoContext)_localctx).ponteiros_opcionais = ponteiros_opcionais();
			setState(249); ((Tipo_estendidoContext)_localctx).tipo_basico_ident = tipo_basico_ident();
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
		public TerminalNode NUM_INT() { return getToken(LAGrammar1_CodeGenParser.NUM_INT, 0); }
		public TerminalNode FALSO() { return getToken(LAGrammar1_CodeGenParser.FALSO, 0); }
		public TerminalNode NUM_REAL() { return getToken(LAGrammar1_CodeGenParser.NUM_REAL, 0); }
		public TerminalNode VERDADEIRO() { return getToken(LAGrammar1_CodeGenParser.VERDADEIRO, 0); }
		public TerminalNode CADEIA() { return getToken(LAGrammar1_CodeGenParser.CADEIA, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterValor_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitValor_constante(this);
		}
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_valor_constante);
		 ((Valor_constanteContext)_localctx).val =  ""; 
		try {
			setState(262);
			switch (_input.LA(1)) {
			case CADEIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(252); match(CADEIA);
				 ((Valor_constanteContext)_localctx).val =  "literal"; 
				}
				break;
			case NUM_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(254); match(NUM_INT);
				 ((Valor_constanteContext)_localctx).val =  "inteiro"; 
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(256); match(NUM_REAL);
				 ((Valor_constanteContext)_localctx).val =  "real"; 
				}
				break;
			case VERDADEIRO:
				enterOuterAlt(_localctx, 4);
				{
				setState(258); match(VERDADEIRO);
				 ((Valor_constanteContext)_localctx).val =  "logico"; 
				}
				break;
			case FALSO:
				enterOuterAlt(_localctx, 5);
				{
				setState(260); match(FALSO);
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
		public TerminalNode FIM_REGISTRO() { return getToken(LAGrammar1_CodeGenParser.FIM_REGISTRO, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode REGISTRO() { return getToken(LAGrammar1_CodeGenParser.REGISTRO, 0); }
		public Mais_variaveisContext mais_variaveis() {
			return getRuleContext(Mais_variaveisContext.class,0);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitRegistro(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_registro);
		 ((RegistroContext)_localctx).val =  "$"; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); match(REGISTRO);
			setState(265); ((RegistroContext)_localctx).variavel = variavel();
			 _localctx.val += "[";
			        for(String s: ((RegistroContext)_localctx).variavel.names)
			            _localctx.val += s + ":" +((RegistroContext)_localctx).variavel.t+",";         
			     
			setState(267); ((RegistroContext)_localctx).mais_variaveis = mais_variaveis();
			 
			                     for(Map.Entry<String, String> e: ((RegistroContext)_localctx).mais_variaveis.nomes.entrySet()){                     
			                        _localctx.val += ","+e.getKey()+":"+e.getValue();
			                     }
			                    
			setState(269); match(FIM_REGISTRO);

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
		public Parametros_opcionalContext parametros_opcional;
		public ComandosContext comandos;
		public Tipo_estendidoContext tipo_estendido;
		public TerminalNode FIM_PROCEDIMENTO() { return getToken(LAGrammar1_CodeGenParser.FIM_PROCEDIMENTO, 0); }
		public Declaracoes_locaisContext declaracoes_locais() {
			return getRuleContext(Declaracoes_locaisContext.class,0);
		}
		public TerminalNode PROCEDIMENTO() { return getToken(LAGrammar1_CodeGenParser.PROCEDIMENTO, 0); }
		public TerminalNode FIM_FUNCAO() { return getToken(LAGrammar1_CodeGenParser.FIM_FUNCAO, 0); }
		public TerminalNode FUNCAO() { return getToken(LAGrammar1_CodeGenParser.FUNCAO, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode LPARENTHESIS() { return getToken(LAGrammar1_CodeGenParser.LPARENTHESIS, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LAGrammar1_CodeGenParser.COLON, 0); }
		public Parametros_opcionalContext parametros_opcional() {
			return getRuleContext(Parametros_opcionalContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAGrammar1_CodeGenParser.IDENT, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(LAGrammar1_CodeGenParser.RPARENTHESIS, 0); }
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterDeclaracao_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitDeclaracao_global(this);
		}
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaracao_global);
		try {
			setState(298);
			switch (_input.LA(1)) {
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(272); match(PROCEDIMENTO);
				setState(273); ((Declaracao_globalContext)_localctx).IDENT = match(IDENT);
				 push(new TokenSymbolTable("PROC")); 
				setState(275); match(LPARENTHESIS);
				setState(276); ((Declaracao_globalContext)_localctx).parametros_opcional = parametros_opcional();

				            for(Map.Entry<String,String> entry : ((Declaracao_globalContext)_localctx).parametros_opcional.nomes.entrySet()){
				                top().addToken(entry.getKey(), entry.getValue());
				                
				                /*adiciona subvariáveis de registros*/
				                if(entry.getValue().startsWith("$")){
				                      for(String st: structTypes(entry.getValue()))
				                            top().addToken(entry.getKey() + "." + getSubtypeName(st), getSubtypeType(st));
				                }
				                if(tokenType(entry.getValue()).startsWith("$")){
				                      for(String st: structTypes(tokenType(entry.getValue())))
				                            top().addToken(entry.getKey() + "." + getSubtypeName(st), getSubtypeType(st));
				                }
				            }
				        
				setState(278); match(RPARENTHESIS);
				setState(279); declaracoes_locais();
				setState(280); ((Declaracao_globalContext)_localctx).comandos = comandos();
				setState(281); match(FIM_PROCEDIMENTO);
				 
				            /*System.out.println("*******************");
				            System.out.println("*******************");
				            printSemanticTable();
				            System.out.println("*******************");
				            System.out.println("*******************");*/
				            String code = Generator.method((((Declaracao_globalContext)_localctx).IDENT!=null?((Declaracao_globalContext)_localctx).IDENT.getText():null), ((Declaracao_globalContext)_localctx).parametros_opcional.nomeList, 
				                ((Declaracao_globalContext)_localctx).parametros_opcional.tipoList, false, "", ((Declaracao_globalContext)_localctx).comandos.code);
				            Generator.addCode(code);
				            pop();
				            top().addToken((((Declaracao_globalContext)_localctx).IDENT!=null?((Declaracao_globalContext)_localctx).IDENT.getText():null), "PROC");
				            registerSignature((((Declaracao_globalContext)_localctx).IDENT!=null?((Declaracao_globalContext)_localctx).IDENT.getText():null), ((Declaracao_globalContext)_localctx).parametros_opcional.val);
				        
				}
				break;
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(284); match(FUNCAO);
				setState(285); ((Declaracao_globalContext)_localctx).IDENT = match(IDENT);
				 push(new TokenSymbolTable("FUNC")); 
				setState(287); match(LPARENTHESIS);
				setState(288); ((Declaracao_globalContext)_localctx).parametros_opcional = parametros_opcional();

				            for(Map.Entry<String,String> entry : ((Declaracao_globalContext)_localctx).parametros_opcional.nomes.entrySet()){
				                top().addToken(entry.getKey(), entry.getValue());
				                
				                /*adiciona subvariáveis de registros*/
				                if(entry.getValue().startsWith("$")){
				                      for(String st: structTypes(entry.getValue()))
				                            top().addToken(entry.getKey() + "." + getSubtypeName(st), getSubtypeType(st));
				                }
				                if(tokenType(entry.getValue()).startsWith("$")){
				                      for(String st: structTypes(tokenType(entry.getValue())))
				                            top().addToken(entry.getKey() + "." + getSubtypeName(st), getSubtypeType(st));
				                }
				            }
				        
				setState(290); match(RPARENTHESIS);
				setState(291); match(COLON);
				setState(292); ((Declaracao_globalContext)_localctx).tipo_estendido = tipo_estendido();
				setState(293); declaracoes_locais();
				setState(294); ((Declaracao_globalContext)_localctx).comandos = comandos();
				setState(295); match(FIM_FUNCAO);
				 
				            String code = Generator.method((((Declaracao_globalContext)_localctx).IDENT!=null?((Declaracao_globalContext)_localctx).IDENT.getText():null), ((Declaracao_globalContext)_localctx).parametros_opcional.nomeList, 
				                ((Declaracao_globalContext)_localctx).parametros_opcional.tipoList, true, ((Declaracao_globalContext)_localctx).tipo_estendido.val, ((Declaracao_globalContext)_localctx).comandos.code);
				            Generator.addCode(code);
				            pop(); 
				            top().addToken((((Declaracao_globalContext)_localctx).IDENT!=null?((Declaracao_globalContext)_localctx).IDENT.getText():null), ((Declaracao_globalContext)_localctx).tipo_estendido.val);
				            registerSignature((((Declaracao_globalContext)_localctx).IDENT!=null?((Declaracao_globalContext)_localctx).IDENT.getText():null), ((Declaracao_globalContext)_localctx).parametros_opcional.val);
				        
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
		public HashMap<String,String> nomes;
		public String val;
		public ArrayList<String> nomeList;
		public ArrayList<String> tipoList;
		public ParametroContext parametro;
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public Parametros_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterParametros_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitParametros_opcional(this);
		}
	}

	public final Parametros_opcionalContext parametros_opcional() throws RecognitionException {
		Parametros_opcionalContext _localctx = new Parametros_opcionalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parametros_opcional);

		        ((Parametros_opcionalContext)_localctx).val =  ""; 
		        ((Parametros_opcionalContext)_localctx).nomes =  new HashMap<>();
		        ((Parametros_opcionalContext)_localctx).nomeList =  new ArrayList<>();
		        ((Parametros_opcionalContext)_localctx).tipoList =  new ArrayList<>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP_HAT) | (1L << VAR) | (1L << IDENT))) != 0)) {
				{
				setState(300); ((Parametros_opcionalContext)_localctx).parametro = parametro();

				        ((Parametros_opcionalContext)_localctx).val =  ((Parametros_opcionalContext)_localctx).parametro.val; 
				        ((Parametros_opcionalContext)_localctx).nomes =  ((Parametros_opcionalContext)_localctx).parametro.nomes;
				        ((Parametros_opcionalContext)_localctx).nomeList =  ((Parametros_opcionalContext)_localctx).parametro.nomeList;
				        ((Parametros_opcionalContext)_localctx).tipoList =  ((Parametros_opcionalContext)_localctx).parametro.tipoList;
				    
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
		public HashMap<String,String> nomes;
		public String val;
		public ArrayList<String> nomeList;
		public ArrayList<String> tipoList;
		public IdentificadorContext identificador;
		public Mais_identContext mais_ident;
		public Tipo_estendidoContext tipo_estendido;
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public List<Var_opcionalContext> var_opcional() {
			return getRuleContexts(Var_opcionalContext.class);
		}
		public Var_opcionalContext var_opcional(int i) {
			return getRuleContext(Var_opcionalContext.class,i);
		}
		public Tipo_estendidoContext tipo_estendido(int i) {
			return getRuleContext(Tipo_estendidoContext.class,i);
		}
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(LAGrammar1_CodeGenParser.COMMA); }
		public List<Mais_identContext> mais_ident() {
			return getRuleContexts(Mais_identContext.class);
		}
		public TerminalNode COLON(int i) {
			return getToken(LAGrammar1_CodeGenParser.COLON, i);
		}
		public List<Tipo_estendidoContext> tipo_estendido() {
			return getRuleContexts(Tipo_estendidoContext.class);
		}
		public List<TerminalNode> COLON() { return getTokens(LAGrammar1_CodeGenParser.COLON); }
		public Mais_identContext mais_ident(int i) {
			return getRuleContext(Mais_identContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(LAGrammar1_CodeGenParser.COMMA, i);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parametro);

		            ((ParametroContext)_localctx).val =  "";
		            ((ParametroContext)_localctx).nomes =  new HashMap<>();
		            ((ParametroContext)_localctx).nomeList =  new ArrayList<>();
		            ((ParametroContext)_localctx).tipoList =  new ArrayList<>();
		          
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305); var_opcional();
			setState(306); ((ParametroContext)_localctx).identificador = identificador();
			setState(307); ((ParametroContext)_localctx).mais_ident = mais_ident();
			setState(308); match(COLON);
			setState(309); ((ParametroContext)_localctx).tipo_estendido = tipo_estendido();

			         _localctx.val += ((ParametroContext)_localctx).tipo_estendido.val;
			         _localctx.nomes.put(((ParametroContext)_localctx).identificador.nome,((ParametroContext)_localctx).tipo_estendido.val);
			         _localctx.nomeList.add((((ParametroContext)_localctx).identificador!=null?_input.getText(((ParametroContext)_localctx).identificador.start,((ParametroContext)_localctx).identificador.stop):null));
			         _localctx.tipoList.add(((ParametroContext)_localctx).tipo_estendido.val);
			         for(String s: ((ParametroContext)_localctx).mais_ident.idents){
			            _localctx.val += "," + ((ParametroContext)_localctx).tipo_estendido.val;
			            _localctx.nomes.put(s,((ParametroContext)_localctx).tipo_estendido.val);
			            _localctx.nomeList.add((((ParametroContext)_localctx).identificador!=null?_input.getText(((ParametroContext)_localctx).identificador.start,((ParametroContext)_localctx).identificador.stop):null));
			            _localctx.tipoList.add(((ParametroContext)_localctx).tipo_estendido.val);
			         }
			      
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(311); match(COMMA);
				_localctx.val += ",";
				setState(313); var_opcional();
				setState(314); ((ParametroContext)_localctx).identificador = identificador();
				setState(315); ((ParametroContext)_localctx).mais_ident = mais_ident();
				setState(316); match(COLON);
				setState(317); ((ParametroContext)_localctx).tipo_estendido = tipo_estendido();

				            _localctx.val += ((ParametroContext)_localctx).tipo_estendido.val;
				            _localctx.nomes.put(((ParametroContext)_localctx).identificador.nome,((ParametroContext)_localctx).tipo_estendido.val);
				            _localctx.nomeList.add((((ParametroContext)_localctx).identificador!=null?_input.getText(((ParametroContext)_localctx).identificador.start,((ParametroContext)_localctx).identificador.stop):null));
				            _localctx.tipoList.add(((ParametroContext)_localctx).tipo_estendido.val);
				            for(String s: ((ParametroContext)_localctx).mais_ident.idents){
				               _localctx.val += "," + ((ParametroContext)_localctx).tipo_estendido.val;
				               _localctx.nomes.put(s,((ParametroContext)_localctx).tipo_estendido.val);
				               _localctx.nomeList.add((((ParametroContext)_localctx).identificador!=null?_input.getText(((ParametroContext)_localctx).identificador.start,((ParametroContext)_localctx).identificador.stop):null));
				               _localctx.tipoList.add(((ParametroContext)_localctx).tipo_estendido.val);
				            }
				       
				}
				}
				setState(324);
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

	public static class Var_opcionalContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(LAGrammar1_CodeGenParser.VAR, 0); }
		public Var_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterVar_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitVar_opcional(this);
		}
	}

	public final Var_opcionalContext var_opcional() throws RecognitionException {
		Var_opcionalContext _localctx = new Var_opcionalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(325); match(VAR);
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
		public String val;
		public Declaracao_localContext declaracao_local;
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
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterDeclaracoes_locais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitDeclaracoes_locais(this);
		}
	}

	public final Declaracoes_locaisContext declaracoes_locais() throws RecognitionException {
		Declaracoes_locaisContext _localctx = new Declaracoes_locaisContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_declaracoes_locais);
		((Declaracoes_locaisContext)_localctx).val =  "";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO))) != 0)) {
				{
				{
				setState(328); ((Declaracoes_locaisContext)_localctx).declaracao_local = declaracao_local();
				_localctx.val += " " + ((Declaracoes_locaisContext)_localctx).declaracao_local.val;
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			_localctx.val.trim();
			}
		}
		catch (RecognitionException re) {
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
		public ComandosContext comandos;
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
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitCorpo(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338); declaracoes_locais();
			setState(339); ((CorpoContext)_localctx).comandos = comandos();
			 Generator.addCode(((CorpoContext)_localctx).comandos.code); 
			}
		}
		catch (RecognitionException re) {
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
		public String code;
		public CmdContext cmd;
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
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitComandos(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_comandos);
		 ((ComandosContext)_localctx).code =  ""; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP_HAT) | (1L << LEIA) | (1L << ESCREVA) | (1L << SE) | (1L << CASO) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << RETORNE) | (1L << IDENT))) != 0)) {
				{
				{
				setState(342); ((ComandosContext)_localctx).cmd = cmd();
				 _localctx.code += ((ComandosContext)_localctx).cmd.code+"\n"; 
				}
				}
				setState(349);
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
		public String code;
		public Token LEIA;
		public IdentificadorContext identificador;
		public Mais_identContext mais_ident;
		public ExpressaoContext expressao;
		public Mais_expressaoContext mais_expressao;
		public ComandosContext comandos;
		public Senao_opcionalContext senao_opcional;
		public Token IDENT;
		public Exp_aritmeticaContext exp_aritmetica;
		public Outros_identContext outros_ident;
		public ChamadaContext chamada;
		public AtribuicaoContext atribuicao;
		public Token RETORNE;
		public TerminalNode FIMCASO() { return getToken(LAGrammar1_CodeGenParser.FIMCASO, 0); }
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode FIMPARA() { return getToken(LAGrammar1_CodeGenParser.FIMPARA, 0); }
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public TerminalNode RETORNE() { return getToken(LAGrammar1_CodeGenParser.RETORNE, 0); }
		public ChamadaContext chamada() {
			return getRuleContext(ChamadaContext.class,0);
		}
		public TerminalNode ENQUANTO() { return getToken(LAGrammar1_CodeGenParser.ENQUANTO, 0); }
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public TerminalNode CASO() { return getToken(LAGrammar1_CodeGenParser.CASO, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TerminalNode UP_HAT() { return getToken(LAGrammar1_CodeGenParser.UP_HAT, 0); }
		public TerminalNode FIMENQUANTO() { return getToken(LAGrammar1_CodeGenParser.FIMENQUANTO, 0); }
		public TerminalNode ESCREVA() { return getToken(LAGrammar1_CodeGenParser.ESCREVA, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(LAGrammar1_CodeGenParser.LPARENTHESIS, 0); }
		public TerminalNode IDENT() { return getToken(LAGrammar1_CodeGenParser.IDENT, 0); }
		public TerminalNode LEIA() { return getToken(LAGrammar1_CodeGenParser.LEIA, 0); }
		public TerminalNode FIMSE() { return getToken(LAGrammar1_CodeGenParser.FIMSE, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FACA() { return getToken(LAGrammar1_CodeGenParser.FACA, 0); }
		public TerminalNode ARROW() { return getToken(LAGrammar1_CodeGenParser.ARROW, 0); }
		public Mais_identContext mais_ident() {
			return getRuleContext(Mais_identContext.class,0);
		}
		public TerminalNode SEJA() { return getToken(LAGrammar1_CodeGenParser.SEJA, 0); }
		public TerminalNode ENTAO() { return getToken(LAGrammar1_CodeGenParser.ENTAO, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(LAGrammar1_CodeGenParser.RPARENTHESIS, 0); }
		public TerminalNode SE() { return getToken(LAGrammar1_CodeGenParser.SE, 0); }
		public TerminalNode ATE() { return getToken(LAGrammar1_CodeGenParser.ATE, 0); }
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Senao_opcionalContext senao_opcional() {
			return getRuleContext(Senao_opcionalContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode PARA() { return getToken(LAGrammar1_CodeGenParser.PARA, 0); }
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cmd);
		 ((CmdContext)_localctx).code =  ""; 
		try {
			setState(432);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350); ((CmdContext)_localctx).LEIA = match(LEIA);
				setState(351); match(LPARENTHESIS);
				setState(352); ((CmdContext)_localctx).identificador = identificador();
				setState(353); ((CmdContext)_localctx).mais_ident = mais_ident();

				          if(!isTokenPresent(((CmdContext)_localctx).identificador.nome))
				            error("Identificador nao declarado: "+((CmdContext)_localctx).identificador.nome,
				            ((CmdContext)_localctx).LEIA.getLine());
				            
				          for(String s : ((CmdContext)_localctx).mais_ident.idents){
				               if(!isTokenPresent(s))
				                    error("Identificador nao declarado: "+s,
				                    ((CmdContext)_localctx).LEIA.getLine());                               
				          }
				       
				setState(355); match(RPARENTHESIS);

				            HashMap<String, String> nameToTypes = new HashMap<>();
				              nameToTypes.put(((CmdContext)_localctx).identificador.nome, tokenType(((CmdContext)_localctx).identificador.nome));
				              for(String s : ((CmdContext)_localctx).mais_ident.idents){
				                nameToTypes.put(s, tokenType(s));
				              }
				            ((CmdContext)_localctx).code =  Generator.read(nameToTypes);
				       
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358); match(ESCREVA);
				setState(359); match(LPARENTHESIS);
				setState(360); ((CmdContext)_localctx).expressao = expressao();
				setState(361); ((CmdContext)_localctx).mais_expressao = mais_expressao();
				setState(362); match(RPARENTHESIS);

				            ArrayList<String> names = new ArrayList<String>();
				            ArrayList<String> types = new ArrayList<String>();
				            
				            names.add((((CmdContext)_localctx).expressao!=null?_input.getText(((CmdContext)_localctx).expressao.start,((CmdContext)_localctx).expressao.stop):null));
				            types.add(((CmdContext)_localctx).expressao.val);
				            
				            names.addAll(((CmdContext)_localctx).mais_expressao.names);
				            types.addAll(((CmdContext)_localctx).mais_expressao.types);
				            
				            ((CmdContext)_localctx).code =  Generator.write(names, types);
				       
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				 push(new TokenSymbolTable("IF")); 
				setState(366); match(SE);
				setState(367); ((CmdContext)_localctx).expressao = expressao();
				setState(368); match(ENTAO);
				setState(369); ((CmdContext)_localctx).comandos = comandos();
				setState(370); ((CmdContext)_localctx).senao_opcional = senao_opcional();
				setState(371); match(FIMSE);

				            ((CmdContext)_localctx).code =  Generator.condition((((CmdContext)_localctx).expressao!=null?_input.getText(((CmdContext)_localctx).expressao.start,((CmdContext)_localctx).expressao.stop):null), ((CmdContext)_localctx).comandos.code, ((CmdContext)_localctx).senao_opcional.val);
				            pop();
				       
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				 push(new TokenSymbolTable("CASE")); 
				setState(375); match(CASO);
				setState(376); exp_aritmetica();
				setState(377); match(SEJA);
				setState(378); selecao();
				setState(379); senao_opcional();
				setState(380); match(FIMCASO);
				 
				        ((CmdContext)_localctx).code =  "case todo";
				        pop();
				       
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				 push(new TokenSymbolTable("FOR")); 
				setState(384); match(PARA);
				setState(385); ((CmdContext)_localctx).IDENT = match(IDENT);

				        if(!isTokenPresent((((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null)))
				            error("Contador de loop nao declarado: "+(((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null),((CmdContext)_localctx).IDENT.getLine());
				        
				        String expInit = "";
				        String expFim = "";
				       
				setState(387); match(ARROW);
				setState(388); ((CmdContext)_localctx).exp_aritmetica = exp_aritmetica();
				expInit = (((CmdContext)_localctx).exp_aritmetica!=null?_input.getText(((CmdContext)_localctx).exp_aritmetica.start,((CmdContext)_localctx).exp_aritmetica.stop):null);
				setState(390); match(ATE);
				setState(391); ((CmdContext)_localctx).exp_aritmetica = exp_aritmetica();
				expFim = (((CmdContext)_localctx).exp_aritmetica!=null?_input.getText(((CmdContext)_localctx).exp_aritmetica.start,((CmdContext)_localctx).exp_aritmetica.stop):null);
				setState(393); match(FACA);
				setState(394); ((CmdContext)_localctx).comandos = comandos();
				setState(395); match(FIMPARA);
				 
				            ((CmdContext)_localctx).code =  Generator.forLoop((((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null), expInit, expFim, ((CmdContext)_localctx).comandos.code);
				            pop();
				       
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				 push(new TokenSymbolTable("WHILE")); 
				setState(399); match(ENQUANTO);
				setState(400); ((CmdContext)_localctx).expressao = expressao();
				setState(401); match(FACA);
				setState(402); ((CmdContext)_localctx).comandos = comandos();
				setState(403); match(FIMENQUANTO);

				        ((CmdContext)_localctx).code =  Generator.whileLoop((((CmdContext)_localctx).expressao!=null?_input.getText(((CmdContext)_localctx).expressao.start,((CmdContext)_localctx).expressao.stop):null), ((CmdContext)_localctx).comandos.code);
				        pop();
				       
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				 push(new TokenSymbolTable("DO")); 
				setState(407); match(FACA);
				setState(408); ((CmdContext)_localctx).comandos = comandos();
				setState(409); match(ATE);
				setState(410); ((CmdContext)_localctx).expressao = expressao();

				        ((CmdContext)_localctx).code =  Generator.doWhileLoop((((CmdContext)_localctx).expressao!=null?_input.getText(((CmdContext)_localctx).expressao.start,((CmdContext)_localctx).expressao.stop):null), ((CmdContext)_localctx).comandos.code);
				        pop();
				       
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(413); match(UP_HAT);
				setState(414); ((CmdContext)_localctx).IDENT = match(IDENT);
				setState(415); ((CmdContext)_localctx).outros_ident = outros_ident();
				setState(416); dimensao();
				setState(417); match(ARROW);
				setState(418); ((CmdContext)_localctx).expressao = expressao();

				            if(!isTokenPresent((((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null)))
				                error("Ponteiro nao declarado: "+(((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null),((CmdContext)_localctx).IDENT.getLine());

				            String fullToken = (((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null)+((CmdContext)_localctx).outros_ident.fullName;

				            if(!tokenType(fullToken).replace("^","").equals(((CmdContext)_localctx).expressao.val))
				                if(
				                    !(tokenType(fullToken).replace("^","").equals("real")
				                    && ((CmdContext)_localctx).expressao.val.equals("inteiro"))
				                )
				                error("Atribuicao invalida: "+fullToken+" do tipo "+
				                tokenType(fullToken)+" nao pode receber a expressao"+
				                " do tipo "+((CmdContext)_localctx).expressao.val
				                ,((CmdContext)_localctx).IDENT.getLine());
				       
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(421); ((CmdContext)_localctx).IDENT = match(IDENT);
				setState(422); ((CmdContext)_localctx).chamada = chamada();

				        if(!isTokenPresent((((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null)))
				            error("Identificador nao declarado: "+(((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null),((CmdContext)_localctx).IDENT.getLine());
				        
				        if(getSignature((((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null)) != null)
				            if(!getSignature((((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null)).equals(((CmdContext)_localctx).chamada.val))
				                error("Assinatura de chamada de metodo errada: "+((CmdContext)_localctx).chamada.val
				                +"\nAssinatura esperada: "+getSignature((((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null))
				                ,((CmdContext)_localctx).IDENT.getLine());
				                
				         ((CmdContext)_localctx).code =  (((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null)+(((CmdContext)_localctx).chamada!=null?_input.getText(((CmdContext)_localctx).chamada.start,((CmdContext)_localctx).chamada.stop):null) ;
				       
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(425); ((CmdContext)_localctx).atribuicao = atribuicao();
				 ((CmdContext)_localctx).code =  ((CmdContext)_localctx).atribuicao.code ; 
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(428); ((CmdContext)_localctx).RETORNE = match(RETORNE);
				setState(429); ((CmdContext)_localctx).expressao = expressao();
				    boolean erro = true;
				            for(TokenSymbolTable currentTable : allTables()){
				              if(currentTable.getScope().equals("FUNC"))
				                erro = false;
				            }
				            if(erro){
				              error("Retorne em local inadequado", ((CmdContext)_localctx).RETORNE.getLine());       
				            }
				           ((CmdContext)_localctx).code =  "return " + Generator.normalizeExpression((((CmdContext)_localctx).expressao!=null?_input.getText(((CmdContext)_localctx).expressao.start,((CmdContext)_localctx).expressao.stop):null)) + ";";
				       
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
		public String val;
		public ArrayList<String> names;
		public ArrayList<String> types;
		public ExpressaoContext expressao;
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(LAGrammar1_CodeGenParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LAGrammar1_CodeGenParser.COMMA, i);
		}
		public Mais_expressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterMais_expressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitMais_expressao(this);
		}
	}

	public final Mais_expressaoContext mais_expressao() throws RecognitionException {
		Mais_expressaoContext _localctx = new Mais_expressaoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_mais_expressao);
		((Mais_expressaoContext)_localctx).val =  ""; ((Mais_expressaoContext)_localctx).names =  new ArrayList<>(); ((Mais_expressaoContext)_localctx).types =  new ArrayList<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(434); match(COMMA);
				setState(435); ((Mais_expressaoContext)_localctx).expressao = expressao();

				        _localctx.val += ","+((Mais_expressaoContext)_localctx).expressao.val;
				        _localctx.names.add((((Mais_expressaoContext)_localctx).expressao!=null?_input.getText(((Mais_expressaoContext)_localctx).expressao.start,((Mais_expressaoContext)_localctx).expressao.stop):null));
				        _localctx.types.add(((Mais_expressaoContext)_localctx).expressao.val);
				    
				}
				}
				setState(442);
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
		public String val;
		public ComandosContext comandos;
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode SENAO() { return getToken(LAGrammar1_CodeGenParser.SENAO, 0); }
		public Senao_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterSenao_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitSenao_opcional(this);
		}
	}

	public final Senao_opcionalContext senao_opcional() throws RecognitionException {
		Senao_opcionalContext _localctx = new Senao_opcionalContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_senao_opcional);
		((Senao_opcionalContext)_localctx).val =  "";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(443); match(SENAO);
				setState(444); ((Senao_opcionalContext)_localctx).comandos = comandos();
				_localctx.val += ((Senao_opcionalContext)_localctx).comandos.code;
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
		public String code;
		public Token IDENT;
		public Outros_identContext outros_ident;
		public DimensaoContext dimensao;
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
		public TerminalNode ARROW() { return getToken(LAGrammar1_CodeGenParser.ARROW, 0); }
		public TerminalNode IDENT() { return getToken(LAGrammar1_CodeGenParser.IDENT, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_atribuicao);
		 ((AtribuicaoContext)_localctx).code =  ""; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449); ((AtribuicaoContext)_localctx).IDENT = match(IDENT);
			setState(450); ((AtribuicaoContext)_localctx).outros_ident = outros_ident();
			setState(451); ((AtribuicaoContext)_localctx).dimensao = dimensao();
			setState(452); match(ARROW);
			setState(453); ((AtribuicaoContext)_localctx).expressao = expressao();

			                if(!isTokenPresent((((AtribuicaoContext)_localctx).IDENT!=null?((AtribuicaoContext)_localctx).IDENT.getText():null))){
			                    error("Variavel nao declarada: "+(((AtribuicaoContext)_localctx).IDENT!=null?((AtribuicaoContext)_localctx).IDENT.getText():null),((AtribuicaoContext)_localctx).IDENT.getLine());
			                }else{
			                    String fullToken = (((AtribuicaoContext)_localctx).IDENT!=null?((AtribuicaoContext)_localctx).IDENT.getText():null)+((AtribuicaoContext)_localctx).outros_ident.fullName;
			                    
			                    if(!tokenType(fullToken).equals(((AtribuicaoContext)_localctx).expressao.val))
			                        if(
			                        !((tokenType(fullToken).equals("real")
			                        && ((AtribuicaoContext)_localctx).expressao.val.equals("inteiro"))
			                        ||
			                        (tokenType(fullToken).equals("inteiro")
			                        && ((AtribuicaoContext)_localctx).expressao.val.equals("real")))
			                        )
			                            error("Atribuicao invalida: "+fullToken+" do tipo "+
			                            tokenType(fullToken)+" nao pode receber a expressao "+
			                            (((AtribuicaoContext)_localctx).expressao!=null?_input.getText(((AtribuicaoContext)_localctx).expressao.start,((AtribuicaoContext)_localctx).expressao.stop):null)+" do tipo "+((AtribuicaoContext)_localctx).expressao.val
			                            ,((AtribuicaoContext)_localctx).IDENT.getLine());
			                }
			                
			                String id = (((AtribuicaoContext)_localctx).IDENT!=null?((AtribuicaoContext)_localctx).IDENT.getText():null)+((AtribuicaoContext)_localctx).outros_ident.fullName+(((AtribuicaoContext)_localctx).dimensao!=null?_input.getText(((AtribuicaoContext)_localctx).dimensao.start,((AtribuicaoContext)_localctx).dimensao.stop):null);
			                ((AtribuicaoContext)_localctx).code =  Generator.attrib(id, (((AtribuicaoContext)_localctx).expressao!=null?_input.getText(((AtribuicaoContext)_localctx).expressao.start,((AtribuicaoContext)_localctx).expressao.stop):null));
			            
			}
		}
		catch (RecognitionException re) {
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
		public String val;
		public Argumentos_opcionalContext argumentos_opcional;
		public Argumentos_opcionalContext argumentos_opcional() {
			return getRuleContext(Argumentos_opcionalContext.class,0);
		}
		public TerminalNode LPARENTHESIS() { return getToken(LAGrammar1_CodeGenParser.LPARENTHESIS, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(LAGrammar1_CodeGenParser.RPARENTHESIS, 0); }
		public ChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitChamada(this);
		}
	}

	public final ChamadaContext chamada() throws RecognitionException {
		ChamadaContext _localctx = new ChamadaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_chamada);
		((ChamadaContext)_localctx).val =  "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456); match(LPARENTHESIS);
			setState(457); ((ChamadaContext)_localctx).argumentos_opcional = argumentos_opcional();
			setState(458); match(RPARENTHESIS);

			            _localctx.val += ((ChamadaContext)_localctx).argumentos_opcional.val;
			       
			}
		}
		catch (RecognitionException re) {
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
		public String val;
		public ExpressaoContext expressao;
		public Mais_expressaoContext mais_expressao;
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
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterArgumentos_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitArgumentos_opcional(this);
		}
	}

	public final Argumentos_opcionalContext argumentos_opcional() throws RecognitionException {
		Argumentos_opcionalContext _localctx = new Argumentos_opcionalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_argumentos_opcional);
		((Argumentos_opcionalContext)_localctx).val =  "";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP_HAT) | (1L << LPARENTHESIS) | (1L << MINUS) | (1L << COMMERCIAL_E) | (1L << NOT) | (1L << VERDADEIRO) | (1L << FALSO) | (1L << CADEIA) | (1L << NUM_INT) | (1L << NUM_REAL) | (1L << IDENT))) != 0)) {
				{
				setState(461); ((Argumentos_opcionalContext)_localctx).expressao = expressao();

				            _localctx.val += ((Argumentos_opcionalContext)_localctx).expressao.val;           
				         
				setState(463); ((Argumentos_opcionalContext)_localctx).mais_expressao = mais_expressao();

				            _localctx.val += ((Argumentos_opcionalContext)_localctx).mais_expressao.val;  
				         
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
		public TerminalNode COLON() { return getToken(LAGrammar1_CodeGenParser.COLON, 0); }
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitSelecao(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_selecao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468); constantes();
			setState(469); match(COLON);
			setState(470); comandos();
			setState(471); mais_selecao();
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterMais_selecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitMais_selecao(this);
		}
	}

	public final Mais_selecaoContext mais_selecao() throws RecognitionException {
		Mais_selecaoContext _localctx = new Mais_selecaoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mais_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_la = _input.LA(1);
			if (_la==MINUS || _la==NUM_INT) {
				{
				setState(473); selecao();
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
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitConstantes(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constantes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476); numero_intervalo();
			setState(477); mais_constantes();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COMMA() { return getToken(LAGrammar1_CodeGenParser.COMMA, 0); }
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public Mais_constantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterMais_constantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitMais_constantes(this);
		}
	}

	public final Mais_constantesContext mais_constantes() throws RecognitionException {
		Mais_constantesContext _localctx = new Mais_constantesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mais_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(479); match(COMMA);
				setState(480); constantes();
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
		public TerminalNode NUM_INT() { return getToken(LAGrammar1_CodeGenParser.NUM_INT, 0); }
		public Intervalo_opcionalContext intervalo_opcional() {
			return getRuleContext(Intervalo_opcionalContext.class,0);
		}
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterNumero_intervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitNumero_intervalo(this);
		}
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_numero_intervalo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483); op_unario();
			setState(484); match(NUM_INT);
			setState(485); intervalo_opcional();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode TWODOTS() { return getToken(LAGrammar1_CodeGenParser.TWODOTS, 0); }
		public TerminalNode NUM_INT() { return getToken(LAGrammar1_CodeGenParser.NUM_INT, 0); }
		public Intervalo_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalo_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterIntervalo_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitIntervalo_opcional(this);
		}
	}

	public final Intervalo_opcionalContext intervalo_opcional() throws RecognitionException {
		Intervalo_opcionalContext _localctx = new Intervalo_opcionalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_intervalo_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			_la = _input.LA(1);
			if (_la==TWODOTS) {
				{
				setState(487); match(TWODOTS);
				setState(488); op_unario();
				setState(489); match(NUM_INT);
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
		public TerminalNode MINUS() { return getToken(LAGrammar1_CodeGenParser.MINUS, 0); }
		public Op_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterOp_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitOp_unario(this);
		}
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_op_unario);
		((Op_unarioContext)_localctx).b =  false;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(493); match(MINUS);
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
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterExp_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitExp_aritmetica(this);
		}
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exp_aritmetica);
		((Exp_aritmeticaContext)_localctx).val =  "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497); ((Exp_aritmeticaContext)_localctx).termo = termo();
			setState(498); ((Exp_aritmeticaContext)_localctx).outros_termos = outros_termos();

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
		public TerminalNode DIV() { return getToken(LAGrammar1_CodeGenParser.DIV, 0); }
		public TerminalNode MULT() { return getToken(LAGrammar1_CodeGenParser.MULT, 0); }
		public Op_multiplicacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_multiplicacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterOp_multiplicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitOp_multiplicacao(this);
		}
	}

	public final Op_multiplicacaoContext op_multiplicacao() throws RecognitionException {
		Op_multiplicacaoContext _localctx = new Op_multiplicacaoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_op_multiplicacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
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
		public TerminalNode MINUS() { return getToken(LAGrammar1_CodeGenParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(LAGrammar1_CodeGenParser.PLUS, 0); }
		public Op_adicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_adicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterOp_adicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitOp_adicao(this);
		}
	}

	public final Op_adicaoContext op_adicao() throws RecognitionException {
		Op_adicaoContext _localctx = new Op_adicaoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_op_adicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
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
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_termo);
		((TermoContext)_localctx).val =  "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505); ((TermoContext)_localctx).fator = fator();
			setState(506); ((TermoContext)_localctx).outros_fatores = outros_fatores();

			          
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
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterOutros_termos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitOutros_termos(this);
		}
	}

	public final Outros_termosContext outros_termos() throws RecognitionException {
		Outros_termosContext _localctx = new Outros_termosContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_outros_termos);
		((Outros_termosContext)_localctx).val =  "";
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(509); op_adicao();
					setState(510); ((Outros_termosContext)_localctx).termo = termo();

					                   if(((Outros_termosContext)_localctx).termo.val.equals("inteiro")
					                   || ((Outros_termosContext)_localctx).termo.val.equals("real"))
					                    ((Outros_termosContext)_localctx).val =  ((Outros_termosContext)_localctx).termo.val;
					                   else
					                    ((Outros_termosContext)_localctx).val =  "tipo_invalido";
					                   
					}
					} 
				}
				setState(517);
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
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_fator);
		((FatorContext)_localctx).val =  "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518); ((FatorContext)_localctx).parcela = parcela();
			setState(519); ((FatorContext)_localctx).outras_parcelas = outras_parcelas();

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
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterOutros_fatores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitOutros_fatores(this);
		}
	}

	public final Outros_fatoresContext outros_fatores() throws RecognitionException {
		Outros_fatoresContext _localctx = new Outros_fatoresContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_outros_fatores);
		((Outros_fatoresContext)_localctx).val =  "";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(522); op_multiplicacao();
				setState(523); ((Outros_fatoresContext)_localctx).fator = fator();

				                   if(((Outros_fatoresContext)_localctx).fator.val.equals("inteiro")
				                   || ((Outros_fatoresContext)_localctx).fator.val.equals("real"))
				                    ((Outros_fatoresContext)_localctx).val =  ((Outros_fatoresContext)_localctx).fator.val;
				                   else
				                    ((Outros_fatoresContext)_localctx).val =  "tipo_invalido";
				                   
				}
				}
				setState(530);
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
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitParcela(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_parcela);
		((ParcelaContext)_localctx).val =  "";
		try {
			setState(538);
			switch (_input.LA(1)) {
			case UP_HAT:
			case LPARENTHESIS:
			case MINUS:
			case NUM_INT:
			case NUM_REAL:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(531); ((ParcelaContext)_localctx).op_unario = op_unario();
				setState(532); ((ParcelaContext)_localctx).parcela_unario = parcela_unario();
				  
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
				setState(535); ((ParcelaContext)_localctx).parcela_nao_unario = parcela_nao_unario();
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
		public Chamada_parteContext chamada_parte;
		public Chamada_metodoContext chamada_metodo;
		public ExpressaoContext expressao;
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TerminalNode UP_HAT() { return getToken(LAGrammar1_CodeGenParser.UP_HAT, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(LAGrammar1_CodeGenParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(LAGrammar1_CodeGenParser.NUM_REAL, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(LAGrammar1_CodeGenParser.LPARENTHESIS, 0); }
		public Chamada_metodoContext chamada_metodo() {
			return getRuleContext(Chamada_metodoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAGrammar1_CodeGenParser.IDENT, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(LAGrammar1_CodeGenParser.RPARENTHESIS, 0); }
		public Chamada_parteContext chamada_parte() {
			return getRuleContext(Chamada_parteContext.class,0);
		}
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterParcela_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitParcela_unario(this);
		}
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_parcela_unario);
		((Parcela_unarioContext)_localctx).val =  "";
		try {
			setState(565);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				switch (_input.LA(1)) {
				case NUM_INT:
					{
					setState(540); match(NUM_INT);
					((Parcela_unarioContext)_localctx).val =  "inteiro";
					}
					break;
				case NUM_REAL:
					{
					setState(542); match(NUM_REAL);
					((Parcela_unarioContext)_localctx).val =  "real";
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(546); match(UP_HAT);
				setState(547); ((Parcela_unarioContext)_localctx).IDENT = match(IDENT);
				setState(548); ((Parcela_unarioContext)_localctx).outros_ident = outros_ident();

				                        ((Parcela_unarioContext)_localctx).val =  tokenType((((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null)+((Parcela_unarioContext)_localctx).outros_ident.fullName);
				                    
				setState(550); dimensao();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(552); ((Parcela_unarioContext)_localctx).IDENT = match(IDENT);
				setState(553); ((Parcela_unarioContext)_localctx).chamada_parte = chamada_parte();

				                  if(!isTokenPresent((((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null)+((Parcela_unarioContext)_localctx).chamada_parte.fullName))
				                      error("Identificador nao declarado: "+(((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null),((Parcela_unarioContext)_localctx).IDENT.getLine());
				                        
				                   ((Parcela_unarioContext)_localctx).val =  tokenType((((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null)+((Parcela_unarioContext)_localctx).chamada_parte.fullName);
				                 
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(556); ((Parcela_unarioContext)_localctx).IDENT = match(IDENT);
				setState(557); ((Parcela_unarioContext)_localctx).chamada_metodo = chamada_metodo();

				                  if(!isTokenPresent((((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null)))
				                      error("Identificador nao declarado: "+(((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null),((Parcela_unarioContext)_localctx).IDENT.getLine());
				                  
				                  if(getSignature((((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null)) != null)
				                    if(!getSignature((((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null)).equals(((Parcela_unarioContext)_localctx).chamada_metodo.val))
				                        error("Assinatura de chamada de metodo errada: "+((Parcela_unarioContext)_localctx).chamada_metodo.val
				                          +"\nAssiantura esperada: "+getSignature((((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null))
				                          ,((Parcela_unarioContext)_localctx).IDENT.getLine()); 
				                        
				                   ((Parcela_unarioContext)_localctx).val =  tokenType((((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null));
				                 
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(560); match(LPARENTHESIS);
				setState(561); ((Parcela_unarioContext)_localctx).expressao = expressao();
				((Parcela_unarioContext)_localctx).val =  ((Parcela_unarioContext)_localctx).expressao.val;
				setState(563); match(RPARENTHESIS);
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
		public TerminalNode CADEIA() { return getToken(LAGrammar1_CodeGenParser.CADEIA, 0); }
		public TerminalNode IDENT() { return getToken(LAGrammar1_CodeGenParser.IDENT, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterParcela_nao_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitParcela_nao_unario(this);
		}
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parcela_nao_unario);
		((Parcela_nao_unarioContext)_localctx).val =  "";
		try {
			setState(575);
			switch (_input.LA(1)) {
			case COMMERCIAL_E:
				enterOuterAlt(_localctx, 1);
				{
				setState(567); match(COMMERCIAL_E);
				setState(568); ((Parcela_nao_unarioContext)_localctx).IDENT = match(IDENT);
				setState(569); ((Parcela_nao_unarioContext)_localctx).outros_ident = outros_ident();

				                       /*Coloca o UPHAT para fazer o typematch de ponteiro com endereco*/
				                       ((Parcela_nao_unarioContext)_localctx).val =  "^"+tokenType((((Parcela_nao_unarioContext)_localctx).IDENT!=null?((Parcela_nao_unarioContext)_localctx).IDENT.getText():null)+((Parcela_nao_unarioContext)_localctx).outros_ident.fullName);
				                      
				setState(571); dimensao();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(573); match(CADEIA);
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
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterOutras_parcelas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitOutras_parcelas(this);
		}
	}

	public final Outras_parcelasContext outras_parcelas() throws RecognitionException {
		Outras_parcelasContext _localctx = new Outras_parcelasContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_outras_parcelas);
		((Outras_parcelasContext)_localctx).val =  "";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PERCENT) {
				{
				{
				setState(577); match(PERCENT);
				setState(578); ((Outras_parcelasContext)_localctx).parcela = parcela();

				                         if(((Outras_parcelasContext)_localctx).parcela.val.equals("inteiro"))
				                            ((Outras_parcelasContext)_localctx).val =  ((Outras_parcelasContext)_localctx).parcela.val;
				                         else
				                            ((Outras_parcelasContext)_localctx).val =  "tipo_invalido";
				                        
				}
				}
				setState(585);
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

	public static class Chamada_metodoContext extends ParserRuleContext {
		public String val;
		public ChamadaContext chamada;
		public ChamadaContext chamada() {
			return getRuleContext(ChamadaContext.class,0);
		}
		public Chamada_metodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterChamada_metodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitChamada_metodo(this);
		}
	}

	public final Chamada_metodoContext chamada_metodo() throws RecognitionException {
		Chamada_metodoContext _localctx = new Chamada_metodoContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_chamada_metodo);
		((Chamada_metodoContext)_localctx).val =  "";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			_la = _input.LA(1);
			if (_la==LPARENTHESIS) {
				{
				setState(586); ((Chamada_metodoContext)_localctx).chamada = chamada();
				((Chamada_metodoContext)_localctx).val =  ((Chamada_metodoContext)_localctx).chamada.val;
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

	public static class Chamada_parteContext extends ParserRuleContext {
		public String fullName;
		public Outros_identContext outros_ident;
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public Chamada_parteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_parte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterChamada_parte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitChamada_parte(this);
		}
	}

	public final Chamada_parteContext chamada_parte() throws RecognitionException {
		Chamada_parteContext _localctx = new Chamada_parteContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_chamada_parte);
		((Chamada_parteContext)_localctx).fullName =  "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591); ((Chamada_parteContext)_localctx).outros_ident = outros_ident();
			 ((Chamada_parteContext)_localctx).fullName =  ((Chamada_parteContext)_localctx).outros_ident.fullName;
			setState(593); dimensao();
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterExp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitExp_relacional(this);
		}
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_exp_relacional);
		 ((Exp_relacionalContext)_localctx).val =  "tipo_invalido"; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595); ((Exp_relacionalContext)_localctx).exp_aritmetica = exp_aritmetica();
			((Exp_relacionalContext)_localctx).val =  ((Exp_relacionalContext)_localctx).exp_aritmetica.val;
			setState(597); ((Exp_relacionalContext)_localctx).op_opcional = op_opcional();
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
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterOp_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitOp_opcional(this);
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
			setState(604);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << DIFFERENT) | (1L << GREATERTHANEQ) | (1L << LESSTHANEQ) | (1L << GREATERTHAN) | (1L << LESSTHAN))) != 0)) {
				{
				setState(600); op_relacional();
				setState(601); exp_aritmetica();
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
		public TerminalNode EQUALS() { return getToken(LAGrammar1_CodeGenParser.EQUALS, 0); }
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitOp_relacional(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
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
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_expressao);
		 ((ExpressaoContext)_localctx).val =  "tipo_invalido"; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608); ((ExpressaoContext)_localctx).termo_logico = termo_logico();
			setState(609); ((ExpressaoContext)_localctx).outros_termos_logicos = outros_termos_logicos();

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
		public TerminalNode NOT() { return getToken(LAGrammar1_CodeGenParser.NOT, 0); }
		public Op_naoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_nao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterOp_nao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitOp_nao(this);
		}
	}

	public final Op_naoContext op_nao() throws RecognitionException {
		Op_naoContext _localctx = new Op_naoContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_op_nao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(612); match(NOT);
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
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitTermo_logico(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_termo_logico);
		 ((Termo_logicoContext)_localctx).val =  "tipo_invalido"; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615); ((Termo_logicoContext)_localctx).fator_logico = fator_logico();
			setState(616); ((Termo_logicoContext)_localctx).outros_fatores_logicos = outros_fatores_logicos();

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
		public List<TerminalNode> OR() { return getTokens(LAGrammar1_CodeGenParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(LAGrammar1_CodeGenParser.OR, i);
		}
		public Outros_termos_logicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_termos_logicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterOutros_termos_logicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitOutros_termos_logicos(this);
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
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(619); match(OR);
				setState(620); ((Outros_termos_logicosContext)_localctx).termo_logico = termo_logico();
				 tipos.add(((Outros_termos_logicosContext)_localctx).termo_logico.val); 
				}
				}
				setState(627);
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
		public List<TerminalNode> AND() { return getTokens(LAGrammar1_CodeGenParser.AND); }
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
		}
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public TerminalNode AND(int i) {
			return getToken(LAGrammar1_CodeGenParser.AND, i);
		}
		public Outros_fatores_logicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_fatores_logicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterOutros_fatores_logicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitOutros_fatores_logicos(this);
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
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(630); match(AND);
				setState(631); ((Outros_fatores_logicosContext)_localctx).fator_logico = fator_logico();
				 tipos.add(((Outros_fatores_logicosContext)_localctx).fator_logico.val); 
				}
				}
				setState(638);
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
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterFator_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitFator_logico(this);
		}
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_fator_logico);
		 ((Fator_logicoContext)_localctx).val =  "tipo_invalido"; 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641); op_nao();
			setState(642); ((Fator_logicoContext)_localctx).parcela_logica = parcela_logica();
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
		public TerminalNode FALSO() { return getToken(LAGrammar1_CodeGenParser.FALSO, 0); }
		public TerminalNode VERDADEIRO() { return getToken(LAGrammar1_CodeGenParser.VERDADEIRO, 0); }
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).enterParcela_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAGrammar1_CodeGenListener ) ((LAGrammar1_CodeGenListener)listener).exitParcela_logica(this);
		}
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_parcela_logica);
		 ((Parcela_logicaContext)_localctx).val =  "tipo_invalido"; 
		try {
			setState(654);
			switch (_input.LA(1)) {
			case VERDADEIRO:
			case FALSO:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				switch (_input.LA(1)) {
				case VERDADEIRO:
					{
					setState(645); match(VERDADEIRO);
					 ((Parcela_logicaContext)_localctx).val =  "logico"; 
					}
					break;
				case FALSO:
					{
					setState(647); match(FALSO);
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
				setState(651); ((Parcela_logicaContext)_localctx).exp_relacional = exp_relacional();
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3C\u0293\4\2\t\2\4"+
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
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00b0\n\7\f\7\16\7\u00b3\13\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\7\t\u00bd\n\t\f\t\16\t\u00c0\13\t\3\n\3\n\3\n\3"+
		"\n\5\n\u00c6\n\n\3\13\3\13\3\13\3\13\7\13\u00cc\n\13\f\13\16\13\u00cf"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d7\n\f\3\r\3\r\3\r\3\r\7\r\u00dd"+
		"\n\r\f\r\16\r\u00e0\13\r\3\16\3\16\3\16\7\16\u00e5\n\16\f\16\16\16\u00e8"+
		"\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f2\n\17\3\20\3"+
		"\20\3\20\3\20\3\20\5\20\u00f9\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0109\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u012d\n\24\3\25\3\25\3\25\5\25\u0132\n\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0143"+
		"\n\26\f\26\16\26\u0146\13\26\3\27\5\27\u0149\n\27\3\30\3\30\3\30\7\30"+
		"\u014e\n\30\f\30\16\30\u0151\13\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\7\32\u015c\n\32\f\32\16\32\u015f\13\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01b3\n\33\3\34\3\34\3\34"+
		"\3\34\7\34\u01b9\n\34\f\34\16\34\u01bc\13\34\3\35\3\35\3\35\3\35\5\35"+
		"\u01c2\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \5 \u01d5\n \3!\3!\3!\3!\3!\3\"\5\"\u01dd\n\"\3#\3#\3#"+
		"\3$\3$\5$\u01e4\n$\3%\3%\3%\3%\3&\3&\3&\3&\5&\u01ee\n&\3\'\3\'\5\'\u01f2"+
		"\n\'\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\7,\u0204\n,\f,\16"+
		",\u0207\13,\3-\3-\3-\3-\3.\3.\3.\3.\7.\u0211\n.\f.\16.\u0214\13.\3/\3"+
		"/\3/\3/\3/\3/\3/\5/\u021d\n/\3\60\3\60\3\60\3\60\5\60\u0223\n\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\5\60\u0238\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\5\61\u0242\n\61\3\62\3\62\3\62\3\62\7\62\u0248\n\62\f\62\16\62\u024b"+
		"\13\62\3\63\3\63\3\63\5\63\u0250\n\63\3\64\3\64\3\64\3\64\3\65\3\65\3"+
		"\65\3\65\3\65\3\66\3\66\3\66\3\66\5\66\u025f\n\66\3\67\3\67\38\38\38\3"+
		"8\39\59\u0268\n9\3:\3:\3:\3:\3;\3;\3;\3;\7;\u0272\n;\f;\16;\u0275\13;"+
		"\3;\3;\3<\3<\3<\3<\7<\u027d\n<\f<\16<\u0280\13<\3<\3<\3=\3=\3=\3=\3>\3"+
		">\3>\3>\5>\u028c\n>\3>\3>\3>\5>\u0291\n>\3>\2?\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz\2\5\3\2\24\25\3\2\22\23\3\2\30\35\u0290\2|\3\2\2\2\4\u0087\3\2\2\2"+
		"\6\u008c\3\2\2\2\b\u00a0\3\2\2\2\n\u00a2\3\2\2\2\f\u00b1\3\2\2\2\16\u00b4"+
		"\3\2\2\2\20\u00be\3\2\2\2\22\u00c5\3\2\2\2\24\u00cd\3\2\2\2\26\u00d6\3"+
		"\2\2\2\30\u00de\3\2\2\2\32\u00e6\3\2\2\2\34\u00f1\3\2\2\2\36\u00f8\3\2"+
		"\2\2 \u00fa\3\2\2\2\"\u0108\3\2\2\2$\u010a\3\2\2\2&\u012c\3\2\2\2(\u0131"+
		"\3\2\2\2*\u0133\3\2\2\2,\u0148\3\2\2\2.\u014f\3\2\2\2\60\u0154\3\2\2\2"+
		"\62\u015d\3\2\2\2\64\u01b2\3\2\2\2\66\u01ba\3\2\2\28\u01c1\3\2\2\2:\u01c3"+
		"\3\2\2\2<\u01ca\3\2\2\2>\u01d4\3\2\2\2@\u01d6\3\2\2\2B\u01dc\3\2\2\2D"+
		"\u01de\3\2\2\2F\u01e3\3\2\2\2H\u01e5\3\2\2\2J\u01ed\3\2\2\2L\u01f1\3\2"+
		"\2\2N\u01f3\3\2\2\2P\u01f7\3\2\2\2R\u01f9\3\2\2\2T\u01fb\3\2\2\2V\u0205"+
		"\3\2\2\2X\u0208\3\2\2\2Z\u0212\3\2\2\2\\\u021c\3\2\2\2^\u0237\3\2\2\2"+
		"`\u0241\3\2\2\2b\u0249\3\2\2\2d\u024f\3\2\2\2f\u0251\3\2\2\2h\u0255\3"+
		"\2\2\2j\u025e\3\2\2\2l\u0260\3\2\2\2n\u0262\3\2\2\2p\u0267\3\2\2\2r\u0269"+
		"\3\2\2\2t\u0273\3\2\2\2v\u027e\3\2\2\2x\u0283\3\2\2\2z\u0290\3\2\2\2|"+
		"}\b\2\1\2}~\5\4\3\2~\177\b\2\1\2\177\u0080\7\3\2\2\u0080\u0081\5\60\31"+
		"\2\u0081\u0082\7\4\2\2\u0082\u0083\b\2\1\2\u0083\3\3\2\2\2\u0084\u0086"+
		"\5\6\4\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\5\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008d\5\b\5\2"+
		"\u008b\u008d\5&\24\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\7\3"+
		"\2\2\2\u008e\u008f\7\5\2\2\u008f\u0090\5\n\6\2\u0090\u0091\b\5\1\2\u0091"+
		"\u00a1\3\2\2\2\u0092\u0093\7\6\2\2\u0093\u0094\7A\2\2\u0094\u0095\7\7"+
		"\2\2\u0095\u0096\5\34\17\2\u0096\u0097\7\30\2\2\u0097\u0098\5\"\22\2\u0098"+
		"\u0099\b\5\1\2\u0099\u00a1\3\2\2\2\u009a\u009b\7\b\2\2\u009b\u009c\7A"+
		"\2\2\u009c\u009d\7\7\2\2\u009d\u009e\5\26\f\2\u009e\u009f\b\5\1\2\u009f"+
		"\u00a1\3\2\2\2\u00a0\u008e\3\2\2\2\u00a0\u0092\3\2\2\2\u00a0\u009a\3\2"+
		"\2\2\u00a1\t\3\2\2\2\u00a2\u00a3\7A\2\2\u00a3\u00a4\5\24\13\2\u00a4\u00a5"+
		"\5\f\7\2\u00a5\u00a6\7\7\2\2\u00a6\u00a7\5\26\f\2\u00a7\u00a8\b\6\1\2"+
		"\u00a8\13\3\2\2\2\u00a9\u00aa\7\t\2\2\u00aa\u00ab\7A\2\2\u00ab\u00ac\b"+
		"\7\1\2\u00ac\u00ad\5\24\13\2\u00ad\u00ae\b\7\1\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u00a9\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\r\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\5\20\t\2\u00b5\u00b6"+
		"\7A\2\2\u00b6\u00b7\b\b\1\2\u00b7\u00b8\5\24\13\2\u00b8\u00b9\5\22\n\2"+
		"\u00b9\17\3\2\2\2\u00ba\u00bb\7\n\2\2\u00bb\u00bd\b\t\1\2\u00bc\u00ba"+
		"\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\21\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7\13\2\2\u00c2\u00c3\5\16"+
		"\b\2\u00c3\u00c4\b\n\1\2\u00c4\u00c6\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\23\3\2\2\2\u00c7\u00c8\7\f\2\2\u00c8\u00c9\5N(\2"+
		"\u00c9\u00ca\7\r\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cc\u00cf"+
		"\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\25\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00d1\5$\23\2\u00d1\u00d2\b\f\1\2\u00d2\u00d7\3\2"+
		"\2\2\u00d3\u00d4\5 \21\2\u00d4\u00d5\b\f\1\2\u00d5\u00d7\3\2\2\2\u00d6"+
		"\u00d0\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d7\27\3\2\2\2\u00d8\u00d9\7\t\2"+
		"\2\u00d9\u00da\5\16\b\2\u00da\u00db\b\r\1\2\u00db\u00dd\3\2\2\2\u00dc"+
		"\u00d8\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\31\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\5\n\6\2\u00e2\u00e3"+
		"\b\16\1\2\u00e3\u00e5\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e5\u00e8\3\2\2\2"+
		"\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\33\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e9\u00ea\7\37\2\2\u00ea\u00f2\b\17\1\2\u00eb\u00ec\7 \2\2"+
		"\u00ec\u00f2\b\17\1\2\u00ed\u00ee\7!\2\2\u00ee\u00f2\b\17\1\2\u00ef\u00f0"+
		"\7\"\2\2\u00f0\u00f2\b\17\1\2\u00f1\u00e9\3\2\2\2\u00f1\u00eb\3\2\2\2"+
		"\u00f1\u00ed\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\35\3\2\2\2\u00f3\u00f4"+
		"\5\34\17\2\u00f4\u00f5\b\20\1\2\u00f5\u00f9\3\2\2\2\u00f6\u00f7\7A\2\2"+
		"\u00f7\u00f9\b\20\1\2\u00f8\u00f3\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\37"+
		"\3\2\2\2\u00fa\u00fb\5\20\t\2\u00fb\u00fc\5\36\20\2\u00fc\u00fd\b\21\1"+
		"\2\u00fd!\3\2\2\2\u00fe\u00ff\7>\2\2\u00ff\u0109\b\22\1\2\u0100\u0101"+
		"\7?\2\2\u0101\u0109\b\22\1\2\u0102\u0103\7@\2\2\u0103\u0109\b\22\1\2\u0104"+
		"\u0105\7%\2\2\u0105\u0109\b\22\1\2\u0106\u0107\7&\2\2\u0107\u0109\b\22"+
		"\1\2\u0108\u00fe\3\2\2\2\u0108\u0100\3\2\2\2\u0108\u0102\3\2\2\2\u0108"+
		"\u0104\3\2\2\2\u0108\u0106\3\2\2\2\u0109#\3\2\2\2\u010a\u010b\7\'\2\2"+
		"\u010b\u010c\5\n\6\2\u010c\u010d\b\23\1\2\u010d\u010e\5\32\16\2\u010e"+
		"\u010f\b\23\1\2\u010f\u0110\7(\2\2\u0110\u0111\b\23\1\2\u0111%\3\2\2\2"+
		"\u0112\u0113\7)\2\2\u0113\u0114\7A\2\2\u0114\u0115\b\24\1\2\u0115\u0116"+
		"\7\16\2\2\u0116\u0117\5(\25\2\u0117\u0118\b\24\1\2\u0118\u0119\7\17\2"+
		"\2\u0119\u011a\5.\30\2\u011a\u011b\5\62\32\2\u011b\u011c\7*\2\2\u011c"+
		"\u011d\b\24\1\2\u011d\u012d\3\2\2\2\u011e\u011f\7+\2\2\u011f\u0120\7A"+
		"\2\2\u0120\u0121\b\24\1\2\u0121\u0122\7\16\2\2\u0122\u0123\5(\25\2\u0123"+
		"\u0124\b\24\1\2\u0124\u0125\7\17\2\2\u0125\u0126\7\7\2\2\u0126\u0127\5"+
		" \21\2\u0127\u0128\5.\30\2\u0128\u0129\5\62\32\2\u0129\u012a\7,\2\2\u012a"+
		"\u012b\b\24\1\2\u012b\u012d\3\2\2\2\u012c\u0112\3\2\2\2\u012c\u011e\3"+
		"\2\2\2\u012d\'\3\2\2\2\u012e\u012f\5*\26\2\u012f\u0130\b\25\1\2\u0130"+
		"\u0132\3\2\2\2\u0131\u012e\3\2\2\2\u0131\u0132\3\2\2\2\u0132)\3\2\2\2"+
		"\u0133\u0134\5,\27\2\u0134\u0135\5\16\b\2\u0135\u0136\5\30\r\2\u0136\u0137"+
		"\7\7\2\2\u0137\u0138\5 \21\2\u0138\u0144\b\26\1\2\u0139\u013a\7\t\2\2"+
		"\u013a\u013b\b\26\1\2\u013b\u013c\5,\27\2\u013c\u013d\5\16\b\2\u013d\u013e"+
		"\5\30\r\2\u013e\u013f\7\7\2\2\u013f\u0140\5 \21\2\u0140\u0141\b\26\1\2"+
		"\u0141\u0143\3\2\2\2\u0142\u0139\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142"+
		"\3\2\2\2\u0144\u0145\3\2\2\2\u0145+\3\2\2\2\u0146\u0144\3\2\2\2\u0147"+
		"\u0149\7-\2\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149-\3\2\2\2\u014a"+
		"\u014b\5\b\5\2\u014b\u014c\b\30\1\2\u014c\u014e\3\2\2\2\u014d\u014a\3"+
		"\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\b\30\1\2\u0153/\3\2\2\2"+
		"\u0154\u0155\5.\30\2\u0155\u0156\5\62\32\2\u0156\u0157\b\31\1\2\u0157"+
		"\61\3\2\2\2\u0158\u0159\5\64\33\2\u0159\u015a\b\32\1\2\u015a\u015c\3\2"+
		"\2\2\u015b\u0158\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\63\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\7.\2\2"+
		"\u0161\u0162\7\16\2\2\u0162\u0163\5\16\b\2\u0163\u0164\5\30\r\2\u0164"+
		"\u0165\b\33\1\2\u0165\u0166\7\17\2\2\u0166\u0167\b\33\1\2\u0167\u01b3"+
		"\3\2\2\2\u0168\u0169\7/\2\2\u0169\u016a\7\16\2\2\u016a\u016b\5n8\2\u016b"+
		"\u016c\5\66\34\2\u016c\u016d\7\17\2\2\u016d\u016e\b\33\1\2\u016e\u01b3"+
		"\3\2\2\2\u016f\u0170\b\33\1\2\u0170\u0171\7\60\2\2\u0171\u0172\5n8\2\u0172"+
		"\u0173\7\61\2\2\u0173\u0174\5\62\32\2\u0174\u0175\58\35\2\u0175\u0176"+
		"\7\62\2\2\u0176\u0177\b\33\1\2\u0177\u01b3\3\2\2\2\u0178\u0179\b\33\1"+
		"\2\u0179\u017a\7\63\2\2\u017a\u017b\5N(\2\u017b\u017c\7\65\2\2\u017c\u017d"+
		"\5@!\2\u017d\u017e\58\35\2\u017e\u017f\7\64\2\2\u017f\u0180\b\33\1\2\u0180"+
		"\u01b3\3\2\2\2\u0181\u0182\b\33\1\2\u0182\u0183\7\66\2\2\u0183\u0184\7"+
		"A\2\2\u0184\u0185\b\33\1\2\u0185\u0186\7\21\2\2\u0186\u0187\5N(\2\u0187"+
		"\u0188\b\33\1\2\u0188\u0189\7\67\2\2\u0189\u018a\5N(\2\u018a\u018b\b\33"+
		"\1\2\u018b\u018c\78\2\2\u018c\u018d\5\62\32\2\u018d\u018e\79\2\2\u018e"+
		"\u018f\b\33\1\2\u018f\u01b3\3\2\2\2\u0190\u0191\b\33\1\2\u0191\u0192\7"+
		":\2\2\u0192\u0193\5n8\2\u0193\u0194\78\2\2\u0194\u0195\5\62\32\2\u0195"+
		"\u0196\7;\2\2\u0196\u0197\b\33\1\2\u0197\u01b3\3\2\2\2\u0198\u0199\b\33"+
		"\1\2\u0199\u019a\78\2\2\u019a\u019b\5\62\32\2\u019b\u019c\7\67\2\2\u019c"+
		"\u019d\5n8\2\u019d\u019e\b\33\1\2\u019e\u01b3\3\2\2\2\u019f\u01a0\7\n"+
		"\2\2\u01a0\u01a1\7A\2\2\u01a1\u01a2\5\22\n\2\u01a2\u01a3\5\24\13\2\u01a3"+
		"\u01a4\7\21\2\2\u01a4\u01a5\5n8\2\u01a5\u01a6\b\33\1\2\u01a6\u01b3\3\2"+
		"\2\2\u01a7\u01a8\7A\2\2\u01a8\u01a9\5<\37\2\u01a9\u01aa\b\33\1\2\u01aa"+
		"\u01b3\3\2\2\2\u01ab\u01ac\5:\36\2\u01ac\u01ad\b\33\1\2\u01ad\u01b3\3"+
		"\2\2\2\u01ae\u01af\7<\2\2\u01af\u01b0\5n8\2\u01b0\u01b1\b\33\1\2\u01b1"+
		"\u01b3\3\2\2\2\u01b2\u0160\3\2\2\2\u01b2\u0168\3\2\2\2\u01b2\u016f\3\2"+
		"\2\2\u01b2\u0178\3\2\2\2\u01b2\u0181\3\2\2\2\u01b2\u0190\3\2\2\2\u01b2"+
		"\u0198\3\2\2\2\u01b2\u019f\3\2\2\2\u01b2\u01a7\3\2\2\2\u01b2\u01ab\3\2"+
		"\2\2\u01b2\u01ae\3\2\2\2\u01b3\65\3\2\2\2\u01b4\u01b5\7\t\2\2\u01b5\u01b6"+
		"\5n8\2\u01b6\u01b7\b\34\1\2\u01b7\u01b9\3\2\2\2\u01b8\u01b4\3\2\2\2\u01b9"+
		"\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\67\3\2\2"+
		"\2\u01bc\u01ba\3\2\2\2\u01bd\u01be\7=\2\2\u01be\u01bf\5\62\32\2\u01bf"+
		"\u01c0\b\35\1\2\u01c0\u01c2\3\2\2\2\u01c1\u01bd\3\2\2\2\u01c1\u01c2\3"+
		"\2\2\2\u01c29\3\2\2\2\u01c3\u01c4\7A\2\2\u01c4\u01c5\5\22\n\2\u01c5\u01c6"+
		"\5\24\13\2\u01c6\u01c7\7\21\2\2\u01c7\u01c8\5n8\2\u01c8\u01c9\b\36\1\2"+
		"\u01c9;\3\2\2\2\u01ca\u01cb\7\16\2\2\u01cb\u01cc\5> \2\u01cc\u01cd\7\17"+
		"\2\2\u01cd\u01ce\b\37\1\2\u01ce=\3\2\2\2\u01cf\u01d0\5n8\2\u01d0\u01d1"+
		"\b \1\2\u01d1\u01d2\5\66\34\2\u01d2\u01d3\b \1\2\u01d3\u01d5\3\2\2\2\u01d4"+
		"\u01cf\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5?\3\2\2\2\u01d6\u01d7\5D#\2\u01d7"+
		"\u01d8\7\7\2\2\u01d8\u01d9\5\62\32\2\u01d9\u01da\5B\"\2\u01daA\3\2\2\2"+
		"\u01db\u01dd\5@!\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2\2\2\u01ddC\3\2"+
		"\2\2\u01de\u01df\5H%\2\u01df\u01e0\5F$\2\u01e0E\3\2\2\2\u01e1\u01e2\7"+
		"\t\2\2\u01e2\u01e4\5D#\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"G\3\2\2\2\u01e5\u01e6\5L\'\2\u01e6\u01e7\7?\2\2\u01e7\u01e8\5J&\2\u01e8"+
		"I\3\2\2\2\u01e9\u01ea\7\20\2\2\u01ea\u01eb\5L\'\2\u01eb\u01ec\7?\2\2\u01ec"+
		"\u01ee\3\2\2\2\u01ed\u01e9\3\2\2\2\u01ed\u01ee\3\2\2\2\u01eeK\3\2\2\2"+
		"\u01ef\u01f0\7\22\2\2\u01f0\u01f2\b\'\1\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2"+
		"\3\2\2\2\u01f2M\3\2\2\2\u01f3\u01f4\5T+\2\u01f4\u01f5\5V,\2\u01f5\u01f6"+
		"\b(\1\2\u01f6O\3\2\2\2\u01f7\u01f8\t\2\2\2\u01f8Q\3\2\2\2\u01f9\u01fa"+
		"\t\3\2\2\u01faS\3\2\2\2\u01fb\u01fc\5X-\2\u01fc\u01fd\5Z.\2\u01fd\u01fe"+
		"\b+\1\2\u01feU\3\2\2\2\u01ff\u0200\5R*\2\u0200\u0201\5T+\2\u0201\u0202"+
		"\b,\1\2\u0202\u0204\3\2\2\2\u0203\u01ff\3\2\2\2\u0204\u0207\3\2\2\2\u0205"+
		"\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206W\3\2\2\2\u0207\u0205\3\2\2\2"+
		"\u0208\u0209\5\\/\2\u0209\u020a\5b\62\2\u020a\u020b\b-\1\2\u020bY\3\2"+
		"\2\2\u020c\u020d\5P)\2\u020d\u020e\5X-\2\u020e\u020f\b.\1\2\u020f\u0211"+
		"\3\2\2\2\u0210\u020c\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212"+
		"\u0213\3\2\2\2\u0213[\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0216\5L\'\2\u0216"+
		"\u0217\5^\60\2\u0217\u0218\b/\1\2\u0218\u021d\3\2\2\2\u0219\u021a\5`\61"+
		"\2\u021a\u021b\b/\1\2\u021b\u021d\3\2\2\2\u021c\u0215\3\2\2\2\u021c\u0219"+
		"\3\2\2\2\u021d]\3\2\2\2\u021e\u021f\7?\2\2\u021f\u0223\b\60\1\2\u0220"+
		"\u0221\7@\2\2\u0221\u0223\b\60\1\2\u0222\u021e\3\2\2\2\u0222\u0220\3\2"+
		"\2\2\u0223\u0238\3\2\2\2\u0224\u0225\7\n\2\2\u0225\u0226\7A\2\2\u0226"+
		"\u0227\5\22\n\2\u0227\u0228\b\60\1\2\u0228\u0229\5\24\13\2\u0229\u0238"+
		"\3\2\2\2\u022a\u022b\7A\2\2\u022b\u022c\5f\64\2\u022c\u022d\b\60\1\2\u022d"+
		"\u0238\3\2\2\2\u022e\u022f\7A\2\2\u022f\u0230\5d\63\2\u0230\u0231\b\60"+
		"\1\2\u0231\u0238\3\2\2\2\u0232\u0233\7\16\2\2\u0233\u0234\5n8\2\u0234"+
		"\u0235\b\60\1\2\u0235\u0236\7\17\2\2\u0236\u0238\3\2\2\2\u0237\u0222\3"+
		"\2\2\2\u0237\u0224\3\2\2\2\u0237\u022a\3\2\2\2\u0237\u022e\3\2\2\2\u0237"+
		"\u0232\3\2\2\2\u0238_\3\2\2\2\u0239\u023a\7\26\2\2\u023a\u023b\7A\2\2"+
		"\u023b\u023c\5\22\n\2\u023c\u023d\b\61\1\2\u023d\u023e\5\24\13\2\u023e"+
		"\u0242\3\2\2\2\u023f\u0240\7>\2\2\u0240\u0242\b\61\1\2\u0241\u0239\3\2"+
		"\2\2\u0241\u023f\3\2\2\2\u0242a\3\2\2\2\u0243\u0244\7\27\2\2\u0244\u0245"+
		"\5\\/\2\u0245\u0246\b\62\1\2\u0246\u0248\3\2\2\2\u0247\u0243\3\2\2\2\u0248"+
		"\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024ac\3\2\2\2"+
		"\u024b\u0249\3\2\2\2\u024c\u024d\5<\37\2\u024d\u024e\b\63\1\2\u024e\u0250"+
		"\3\2\2\2\u024f\u024c\3\2\2\2\u024f\u0250\3\2\2\2\u0250e\3\2\2\2\u0251"+
		"\u0252\5\22\n\2\u0252\u0253\b\64\1\2\u0253\u0254\5\24\13\2\u0254g\3\2"+
		"\2\2\u0255\u0256\5N(\2\u0256\u0257\b\65\1\2\u0257\u0258\5j\66\2\u0258"+
		"\u0259\b\65\1\2\u0259i\3\2\2\2\u025a\u025b\5l\67\2\u025b\u025c\5N(\2\u025c"+
		"\u025d\b\66\1\2\u025d\u025f\3\2\2\2\u025e\u025a\3\2\2\2\u025e\u025f\3"+
		"\2\2\2\u025fk\3\2\2\2\u0260\u0261\t\4\2\2\u0261m\3\2\2\2\u0262\u0263\5"+
		"r:\2\u0263\u0264\5t;\2\u0264\u0265\b8\1\2\u0265o\3\2\2\2\u0266\u0268\7"+
		"\36\2\2\u0267\u0266\3\2\2\2\u0267\u0268\3\2\2\2\u0268q\3\2\2\2\u0269\u026a"+
		"\5x=\2\u026a\u026b\5v<\2\u026b\u026c\b:\1\2\u026cs\3\2\2\2\u026d\u026e"+
		"\7#\2\2\u026e\u026f\5r:\2\u026f\u0270\b;\1\2\u0270\u0272\3\2\2\2\u0271"+
		"\u026d\3\2\2\2\u0272\u0275\3\2\2\2\u0273\u0271\3\2\2\2\u0273\u0274\3\2"+
		"\2\2\u0274\u0276\3\2\2\2\u0275\u0273\3\2\2\2\u0276\u0277\b;\1\2\u0277"+
		"u\3\2\2\2\u0278\u0279\7$\2\2\u0279\u027a\5x=\2\u027a\u027b\b<\1\2\u027b"+
		"\u027d\3\2\2\2\u027c\u0278\3\2\2\2\u027d\u0280\3\2\2\2\u027e\u027c\3\2"+
		"\2\2\u027e\u027f\3\2\2\2\u027f\u0281\3\2\2\2\u0280\u027e\3\2\2\2\u0281"+
		"\u0282\b<\1\2\u0282w\3\2\2\2\u0283\u0284\5p9\2\u0284\u0285\5z>\2\u0285"+
		"\u0286\b=\1\2\u0286y\3\2\2\2\u0287\u0288\7%\2\2\u0288\u028c\b>\1\2\u0289"+
		"\u028a\7&\2\2\u028a\u028c\b>\1\2\u028b\u0287\3\2\2\2\u028b\u0289\3\2\2"+
		"\2\u028c\u0291\3\2\2\2\u028d\u028e\5h\65\2\u028e\u028f\b>\1\2\u028f\u0291"+
		"\3\2\2\2\u0290\u028b\3\2\2\2\u0290\u028d\3\2\2\2\u0291{\3\2\2\2+\u0087"+
		"\u008c\u00a0\u00b1\u00be\u00c5\u00cd\u00d6\u00de\u00e6\u00f1\u00f8\u0108"+
		"\u012c\u0131\u0144\u0148\u014f\u015d\u01b2\u01ba\u01c1\u01d4\u01dc\u01e3"+
		"\u01ed\u01f1\u0205\u0212\u021c\u0222\u0237\u0241\u0249\u024f\u025e\u0267"+
		"\u0273\u027e\u028b\u0290";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}