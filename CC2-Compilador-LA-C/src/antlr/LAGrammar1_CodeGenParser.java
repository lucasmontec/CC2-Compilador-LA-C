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
			             Generator.startAlgorithm();
			            
			setState(123); declaracoes();
			setState(124); match(ALGORITMO);
			setState(125); corpo();
			setState(126); match(FIM_ALGORITMO);

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
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO) | (1L << PROCEDIMENTO) | (1L << FUNCAO))) != 0)) {
				{
				{
				setState(129); decl_local_global();
				}
				}
				setState(134);
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
			setState(137);
			switch (_input.LA(1)) {
			case DECLARE:
			case CONSTANTE:
			case TIPO:
				enterOuterAlt(_localctx, 1);
				{
				setState(135); declaracao_local();
				}
				break;
			case PROCEDIMENTO:
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(136); declaracao_global();
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
			setState(157);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(139); ((Declaracao_localContext)_localctx).DECLARE = match(DECLARE);
				setState(140); ((Declaracao_localContext)_localctx).variavel = variavel();

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
				setState(143); match(CONSTANTE);
				setState(144); ((Declaracao_localContext)_localctx).IDENT = match(IDENT);
				setState(145); match(COLON);
				setState(146); ((Declaracao_localContext)_localctx).tipo_basico = tipo_basico();
				setState(147); match(EQUALS);
				setState(148); ((Declaracao_localContext)_localctx).valor_constante = valor_constante();

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
				setState(151); match(TIPO);
				setState(152); ((Declaracao_localContext)_localctx).IDENT = match(IDENT);
				setState(153); match(COLON);
				setState(154); ((Declaracao_localContext)_localctx).tipo = tipo();

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
			setState(159); ((VariavelContext)_localctx).IDENT = match(IDENT);
			setState(160); ((VariavelContext)_localctx).dimensao = dimensao();
			setState(161); ((VariavelContext)_localctx).mais_var = mais_var();
			setState(162); match(COLON);
			setState(163); ((VariavelContext)_localctx).tipo = tipo();

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
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(166); match(COMMA);
				setState(167); ((Mais_varContext)_localctx).IDENT = match(IDENT);
				 
				                  if(!isTokenPresent((((Mais_varContext)_localctx).IDENT!=null?((Mais_varContext)_localctx).IDENT.getText():null))){
				                      _localctx.nomes.add((((Mais_varContext)_localctx).IDENT!=null?((Mais_varContext)_localctx).IDENT.getText():null));
				                  }else{
				                      error("Identificador ja declarado: "+
				                      (((Mais_varContext)_localctx).IDENT!=null?((Mais_varContext)_localctx).IDENT.getText():null),((Mais_varContext)_localctx).IDENT.getLine());
				                  }
				                
				setState(169); ((Mais_varContext)_localctx).dimensao = dimensao();

				        _localctx.dims.add((((Mais_varContext)_localctx).dimensao!=null?_input.getText(((Mais_varContext)_localctx).dimensao.start,((Mais_varContext)_localctx).dimensao.stop):null));
				     
				}
				}
				setState(176);
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
			setState(177); ((IdentificadorContext)_localctx).ponteiros_opcionais = ponteiros_opcionais();
			setState(178); ((IdentificadorContext)_localctx).IDENT = match(IDENT);
			 ((IdentificadorContext)_localctx).nome =  ((IdentificadorContext)_localctx).ponteiros_opcionais.val + (((IdentificadorContext)_localctx).IDENT!=null?((IdentificadorContext)_localctx).IDENT.getText():null); 
			setState(180); dimensao();
			setState(181); outros_ident();
			}
		}
		catch (RecognitionException re) {
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
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UP_HAT) {
				{
				{
				setState(183); ((Ponteiros_opcionaisContext)_localctx).UP_HAT = match(UP_HAT);
				 _localctx.val += (((Ponteiros_opcionaisContext)_localctx).UP_HAT!=null?((Ponteiros_opcionaisContext)_localctx).UP_HAT.getText():null); 
				}
				}
				setState(189);
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
			setState(194);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(190); match(DOT);
				setState(191); ((Outros_identContext)_localctx).identificador = identificador();
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
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(196); match(LBRACKET);
					setState(197); exp_aritmetica();
					setState(198); match(RBRACKET);
					}
					} 
				}
				setState(204);
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
			setState(211);
			switch (_input.LA(1)) {
			case REGISTRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(205); ((TipoContext)_localctx).registro = registro();

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
				setState(208); ((TipoContext)_localctx).tipo_estendido = tipo_estendido();
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
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(213); match(COMMA);
				setState(214); ((Mais_identContext)_localctx).identificador = identificador();
				_localctx.idents.add(((Mais_identContext)_localctx).identificador.nome);
				}
				}
				setState(221);
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
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(222); ((Mais_variaveisContext)_localctx).variavel = variavel();
				_localctx.tipos.add(((Mais_variaveisContext)_localctx).variavel.t);
				               for(String s: ((Mais_variaveisContext)_localctx).variavel.names)
				                    _localctx.nomes.put(s, ((Mais_variaveisContext)_localctx).variavel.t);                
				               
				}
				}
				setState(229);
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
			setState(238);
			switch (_input.LA(1)) {
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(230); ((Tipo_basicoContext)_localctx).LITERAL = match(LITERAL);
				 ((Tipo_basicoContext)_localctx).val = (((Tipo_basicoContext)_localctx).LITERAL!=null?((Tipo_basicoContext)_localctx).LITERAL.getText():null); 
				}
				break;
			case INTEIRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(232); ((Tipo_basicoContext)_localctx).INTEIRO = match(INTEIRO);
				 ((Tipo_basicoContext)_localctx).val = (((Tipo_basicoContext)_localctx).INTEIRO!=null?((Tipo_basicoContext)_localctx).INTEIRO.getText():null); 
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(234); ((Tipo_basicoContext)_localctx).REAL = match(REAL);
				 ((Tipo_basicoContext)_localctx).val = (((Tipo_basicoContext)_localctx).REAL!=null?((Tipo_basicoContext)_localctx).REAL.getText():null); 
				}
				break;
			case LOGICO:
				enterOuterAlt(_localctx, 4);
				{
				setState(236); ((Tipo_basicoContext)_localctx).LOGICO = match(LOGICO);
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
			setState(245);
			switch (_input.LA(1)) {
			case LITERAL:
			case INTEIRO:
			case REAL:
			case LOGICO:
				enterOuterAlt(_localctx, 1);
				{
				setState(240); ((Tipo_basico_identContext)_localctx).tipo_basico = tipo_basico();
				 ((Tipo_basico_identContext)_localctx).val = ((Tipo_basico_identContext)_localctx).tipo_basico.val; 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(243); ((Tipo_basico_identContext)_localctx).IDENT = match(IDENT);
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
			setState(247); ((Tipo_estendidoContext)_localctx).ponteiros_opcionais = ponteiros_opcionais();
			setState(248); ((Tipo_estendidoContext)_localctx).tipo_basico_ident = tipo_basico_ident();
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
			setState(261);
			switch (_input.LA(1)) {
			case CADEIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(251); match(CADEIA);
				 ((Valor_constanteContext)_localctx).val =  "literal"; 
				}
				break;
			case NUM_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(253); match(NUM_INT);
				 ((Valor_constanteContext)_localctx).val =  "inteiro"; 
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(255); match(NUM_REAL);
				 ((Valor_constanteContext)_localctx).val =  "real"; 
				}
				break;
			case VERDADEIRO:
				enterOuterAlt(_localctx, 4);
				{
				setState(257); match(VERDADEIRO);
				 ((Valor_constanteContext)_localctx).val =  "logico"; 
				}
				break;
			case FALSO:
				enterOuterAlt(_localctx, 5);
				{
				setState(259); match(FALSO);
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
			setState(263); match(REGISTRO);
			setState(264); ((RegistroContext)_localctx).variavel = variavel();
			 _localctx.val += "[";
			        for(String s: ((RegistroContext)_localctx).variavel.names)
			            _localctx.val += s + ":" +((RegistroContext)_localctx).variavel.t+",";         
			     
			setState(266); ((RegistroContext)_localctx).mais_variaveis = mais_variaveis();
			 
			                     for(Map.Entry<String, String> e: ((RegistroContext)_localctx).mais_variaveis.nomes.entrySet()){                     
			                        _localctx.val += ","+e.getKey()+":"+e.getValue();
			                     }
			                    
			setState(268); match(FIM_REGISTRO);

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
			setState(297);
			switch (_input.LA(1)) {
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(271); match(PROCEDIMENTO);
				setState(272); ((Declaracao_globalContext)_localctx).IDENT = match(IDENT);
				 push(new TokenSymbolTable("PROC")); 
				setState(274); match(LPARENTHESIS);
				setState(275); ((Declaracao_globalContext)_localctx).parametros_opcional = parametros_opcional();

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
				        
				setState(277); match(RPARENTHESIS);
				setState(278); declaracoes_locais();
				setState(279); comandos();
				setState(280); match(FIM_PROCEDIMENTO);
				 
				            /*System.out.println("*******************");
				            System.out.println("*******************");
				            printSemanticTable();
				            System.out.println("*******************");
				            System.out.println("*******************");*/
				            pop();
				            top().addToken((((Declaracao_globalContext)_localctx).IDENT!=null?((Declaracao_globalContext)_localctx).IDENT.getText():null), "PROC");
				            registerSignature((((Declaracao_globalContext)_localctx).IDENT!=null?((Declaracao_globalContext)_localctx).IDENT.getText():null), ((Declaracao_globalContext)_localctx).parametros_opcional.val); 
				        
				}
				break;
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(283); match(FUNCAO);
				setState(284); ((Declaracao_globalContext)_localctx).IDENT = match(IDENT);
				 push(new TokenSymbolTable("FUNC")); 
				setState(286); match(LPARENTHESIS);
				setState(287); ((Declaracao_globalContext)_localctx).parametros_opcional = parametros_opcional();

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
				        
				setState(289); match(RPARENTHESIS);
				setState(290); match(COLON);
				setState(291); ((Declaracao_globalContext)_localctx).tipo_estendido = tipo_estendido();
				setState(292); declaracoes_locais();
				setState(293); comandos();
				setState(294); match(FIM_FUNCAO);
				 
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
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP_HAT) | (1L << VAR) | (1L << IDENT))) != 0)) {
				{
				setState(299); ((Parametros_opcionalContext)_localctx).parametro = parametro();
				((Parametros_opcionalContext)_localctx).val =  ((Parametros_opcionalContext)_localctx).parametro.val; ((Parametros_opcionalContext)_localctx).nomes =  ((Parametros_opcionalContext)_localctx).parametro.nomes;
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
		          
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304); var_opcional();
			setState(305); ((ParametroContext)_localctx).identificador = identificador();
			setState(306); ((ParametroContext)_localctx).mais_ident = mais_ident();
			setState(307); match(COLON);
			setState(308); ((ParametroContext)_localctx).tipo_estendido = tipo_estendido();

			         _localctx.val += ((ParametroContext)_localctx).tipo_estendido.val;
			         _localctx.nomes.put(((ParametroContext)_localctx).identificador.nome,((ParametroContext)_localctx).tipo_estendido.val);
			         for(String s: ((ParametroContext)_localctx).mais_ident.idents){
			            _localctx.val += "," + ((ParametroContext)_localctx).tipo_estendido.val;
			            _localctx.nomes.put(s,((ParametroContext)_localctx).tipo_estendido.val);
			         }
			      
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(310); match(COMMA);
				_localctx.val += ",";
				setState(312); var_opcional();
				setState(313); ((ParametroContext)_localctx).identificador = identificador();
				setState(314); ((ParametroContext)_localctx).mais_ident = mais_ident();
				setState(315); match(COLON);
				setState(316); ((ParametroContext)_localctx).tipo_estendido = tipo_estendido();

				            _localctx.val += ((ParametroContext)_localctx).tipo_estendido.val;
				            _localctx.nomes.put(((ParametroContext)_localctx).identificador.nome,((ParametroContext)_localctx).tipo_estendido.val);
				            for(String s: ((ParametroContext)_localctx).mais_ident.idents){
				               _localctx.val += "," + ((ParametroContext)_localctx).tipo_estendido.val;
				               _localctx.nomes.put(s,((ParametroContext)_localctx).tipo_estendido.val);
				            }
				       
				}
				}
				setState(323);
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
			setState(325);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(324); match(VAR);
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
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO))) != 0)) {
				{
				{
				setState(327); ((Declaracoes_locaisContext)_localctx).declaracao_local = declaracao_local();
				_localctx.val += " " + ((Declaracoes_locaisContext)_localctx).declaracao_local.val;
				}
				}
				setState(334);
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
			setState(337); declaracoes_locais();
			setState(338); ((CorpoContext)_localctx).comandos = comandos();
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
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP_HAT) | (1L << LEIA) | (1L << ESCREVA) | (1L << SE) | (1L << CASO) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << RETORNE) | (1L << IDENT))) != 0)) {
				{
				{
				setState(341); ((ComandosContext)_localctx).cmd = cmd();
				 _localctx.code += ((ComandosContext)_localctx).cmd.code+"\n"; 
				}
				}
				setState(348);
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
			setState(431);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349); ((CmdContext)_localctx).LEIA = match(LEIA);
				setState(350); match(LPARENTHESIS);
				setState(351); ((CmdContext)_localctx).identificador = identificador();
				setState(352); ((CmdContext)_localctx).mais_ident = mais_ident();

				          if(!isTokenPresent(((CmdContext)_localctx).identificador.nome))
				            error("Identificador nao declarado: "+((CmdContext)_localctx).identificador.nome,
				            ((CmdContext)_localctx).LEIA.getLine());
				            
				          for(String s : ((CmdContext)_localctx).mais_ident.idents){
				               if(!isTokenPresent(s))
				                    error("Identificador nao declarado: "+s,
				                    ((CmdContext)_localctx).LEIA.getLine());                               
				          }
				       
				setState(354); match(RPARENTHESIS);

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
				setState(357); match(ESCREVA);
				setState(358); match(LPARENTHESIS);
				setState(359); ((CmdContext)_localctx).expressao = expressao();
				setState(360); ((CmdContext)_localctx).mais_expressao = mais_expressao();
				setState(361); match(RPARENTHESIS);

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
				setState(365); match(SE);
				setState(366); ((CmdContext)_localctx).expressao = expressao();
				setState(367); match(ENTAO);
				setState(368); ((CmdContext)_localctx).comandos = comandos();
				setState(369); ((CmdContext)_localctx).senao_opcional = senao_opcional();
				setState(370); match(FIMSE);

				            ((CmdContext)_localctx).code =  Generator.condition((((CmdContext)_localctx).expressao!=null?_input.getText(((CmdContext)_localctx).expressao.start,((CmdContext)_localctx).expressao.stop):null), ((CmdContext)_localctx).comandos.code, ((CmdContext)_localctx).senao_opcional.val);
				            pop();
				       
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				 push(new TokenSymbolTable("CASE")); 
				setState(374); match(CASO);
				setState(375); exp_aritmetica();
				setState(376); match(SEJA);
				setState(377); selecao();
				setState(378); senao_opcional();
				setState(379); match(FIMCASO);
				 
				        ((CmdContext)_localctx).code =  "case todo";
				        pop();
				       
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				 push(new TokenSymbolTable("FOR")); 
				setState(383); match(PARA);
				setState(384); ((CmdContext)_localctx).IDENT = match(IDENT);

				        if(!isTokenPresent((((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null)))
				            error("Contador de loop nao declarado: "+(((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null),((CmdContext)_localctx).IDENT.getLine());
				        
				        String expInit = "";
				        String expFim = "";
				       
				setState(386); match(ARROW);
				setState(387); ((CmdContext)_localctx).exp_aritmetica = exp_aritmetica();
				expInit = (((CmdContext)_localctx).exp_aritmetica!=null?_input.getText(((CmdContext)_localctx).exp_aritmetica.start,((CmdContext)_localctx).exp_aritmetica.stop):null);
				setState(389); match(ATE);
				setState(390); ((CmdContext)_localctx).exp_aritmetica = exp_aritmetica();
				expFim = (((CmdContext)_localctx).exp_aritmetica!=null?_input.getText(((CmdContext)_localctx).exp_aritmetica.start,((CmdContext)_localctx).exp_aritmetica.stop):null);
				setState(392); match(FACA);
				setState(393); ((CmdContext)_localctx).comandos = comandos();
				setState(394); match(FIMPARA);
				 
				            ((CmdContext)_localctx).code =  Generator.forLoop((((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null), expInit, expFim, ((CmdContext)_localctx).comandos.code);
				            pop();
				       
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				 push(new TokenSymbolTable("WHILE")); 
				setState(398); match(ENQUANTO);
				setState(399); ((CmdContext)_localctx).expressao = expressao();
				setState(400); match(FACA);
				setState(401); ((CmdContext)_localctx).comandos = comandos();
				setState(402); match(FIMENQUANTO);

				        ((CmdContext)_localctx).code =  Generator.whileLoop((((CmdContext)_localctx).expressao!=null?_input.getText(((CmdContext)_localctx).expressao.start,((CmdContext)_localctx).expressao.stop):null), ((CmdContext)_localctx).comandos.code);
				        pop();
				       
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				 push(new TokenSymbolTable("DO")); 
				setState(406); match(FACA);
				setState(407); ((CmdContext)_localctx).comandos = comandos();
				setState(408); match(ATE);
				setState(409); ((CmdContext)_localctx).expressao = expressao();

				        ((CmdContext)_localctx).code =  Generator.doWhileLoop((((CmdContext)_localctx).expressao!=null?_input.getText(((CmdContext)_localctx).expressao.start,((CmdContext)_localctx).expressao.stop):null), ((CmdContext)_localctx).comandos.code);
				        pop();
				       
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(412); match(UP_HAT);
				setState(413); ((CmdContext)_localctx).IDENT = match(IDENT);
				setState(414); ((CmdContext)_localctx).outros_ident = outros_ident();
				setState(415); dimensao();
				setState(416); match(ARROW);
				setState(417); ((CmdContext)_localctx).expressao = expressao();

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
				setState(420); ((CmdContext)_localctx).IDENT = match(IDENT);
				setState(421); ((CmdContext)_localctx).chamada = chamada();

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
				setState(424); ((CmdContext)_localctx).atribuicao = atribuicao();
				 ((CmdContext)_localctx).code =  ((CmdContext)_localctx).atribuicao.code ; 
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(427); ((CmdContext)_localctx).RETORNE = match(RETORNE);
				setState(428); expressao();
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
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(433); match(COMMA);
				setState(434); ((Mais_expressaoContext)_localctx).expressao = expressao();

				        _localctx.val += ","+((Mais_expressaoContext)_localctx).expressao.val;
				        _localctx.names.add((((Mais_expressaoContext)_localctx).expressao!=null?_input.getText(((Mais_expressaoContext)_localctx).expressao.start,((Mais_expressaoContext)_localctx).expressao.stop):null));
				        _localctx.types.add(((Mais_expressaoContext)_localctx).expressao.val);
				    
				}
				}
				setState(441);
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
			setState(446);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(442); match(SENAO);
				setState(443); ((Senao_opcionalContext)_localctx).comandos = comandos();
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
			setState(448); ((AtribuicaoContext)_localctx).IDENT = match(IDENT);
			setState(449); ((AtribuicaoContext)_localctx).outros_ident = outros_ident();
			setState(450); ((AtribuicaoContext)_localctx).dimensao = dimensao();
			setState(451); match(ARROW);
			setState(452); ((AtribuicaoContext)_localctx).expressao = expressao();

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
			setState(455); match(LPARENTHESIS);
			setState(456); ((ChamadaContext)_localctx).argumentos_opcional = argumentos_opcional();
			setState(457); match(RPARENTHESIS);

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
			setState(465);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP_HAT) | (1L << LPARENTHESIS) | (1L << MINUS) | (1L << COMMERCIAL_E) | (1L << NOT) | (1L << VERDADEIRO) | (1L << FALSO) | (1L << CADEIA) | (1L << NUM_INT) | (1L << NUM_REAL) | (1L << IDENT))) != 0)) {
				{
				setState(460); ((Argumentos_opcionalContext)_localctx).expressao = expressao();

				            _localctx.val += ((Argumentos_opcionalContext)_localctx).expressao.val;           
				         
				setState(462); ((Argumentos_opcionalContext)_localctx).mais_expressao = mais_expressao();

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
			setState(467); constantes();
			setState(468); match(COLON);
			setState(469); comandos();
			setState(470); mais_selecao();
			}
		}
		catch (RecognitionException re) {
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
			setState(473);
			_la = _input.LA(1);
			if (_la==MINUS || _la==NUM_INT) {
				{
				setState(472); selecao();
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
			setState(475); numero_intervalo();
			setState(476); mais_constantes();
			}
		}
		catch (RecognitionException re) {
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
			setState(480);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(478); match(COMMA);
				setState(479); constantes();
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
			setState(482); op_unario();
			setState(483); match(NUM_INT);
			setState(484); intervalo_opcional();
			}
		}
		catch (RecognitionException re) {
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
			setState(490);
			_la = _input.LA(1);
			if (_la==TWODOTS) {
				{
				setState(486); match(TWODOTS);
				setState(487); op_unario();
				setState(488); match(NUM_INT);
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
			setState(494);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(492); match(MINUS);
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
			setState(496); ((Exp_aritmeticaContext)_localctx).termo = termo();
			setState(497); ((Exp_aritmeticaContext)_localctx).outros_termos = outros_termos();

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
			setState(500);
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
			setState(502);
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
			setState(504); ((TermoContext)_localctx).fator = fator();
			setState(505); ((TermoContext)_localctx).outros_fatores = outros_fatores();

			          
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
			setState(514);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(508); op_adicao();
					setState(509); ((Outros_termosContext)_localctx).termo = termo();

					                   if(((Outros_termosContext)_localctx).termo.val.equals("inteiro")
					                   || ((Outros_termosContext)_localctx).termo.val.equals("real"))
					                    ((Outros_termosContext)_localctx).val =  ((Outros_termosContext)_localctx).termo.val;
					                   else
					                    ((Outros_termosContext)_localctx).val =  "tipo_invalido";
					                   
					}
					} 
				}
				setState(516);
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
			setState(517); ((FatorContext)_localctx).parcela = parcela();
			setState(518); ((FatorContext)_localctx).outras_parcelas = outras_parcelas();

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
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(521); op_multiplicacao();
				setState(522); ((Outros_fatoresContext)_localctx).fator = fator();

				                   if(((Outros_fatoresContext)_localctx).fator.val.equals("inteiro")
				                   || ((Outros_fatoresContext)_localctx).fator.val.equals("real"))
				                    ((Outros_fatoresContext)_localctx).val =  ((Outros_fatoresContext)_localctx).fator.val;
				                   else
				                    ((Outros_fatoresContext)_localctx).val =  "tipo_invalido";
				                   
				}
				}
				setState(529);
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
			setState(537);
			switch (_input.LA(1)) {
			case UP_HAT:
			case LPARENTHESIS:
			case MINUS:
			case NUM_INT:
			case NUM_REAL:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(530); ((ParcelaContext)_localctx).op_unario = op_unario();
				setState(531); ((ParcelaContext)_localctx).parcela_unario = parcela_unario();
				  
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
				setState(534); ((ParcelaContext)_localctx).parcela_nao_unario = parcela_nao_unario();
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
			setState(564);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				switch (_input.LA(1)) {
				case NUM_INT:
					{
					setState(539); match(NUM_INT);
					((Parcela_unarioContext)_localctx).val =  "inteiro";
					}
					break;
				case NUM_REAL:
					{
					setState(541); match(NUM_REAL);
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
				setState(545); match(UP_HAT);
				setState(546); ((Parcela_unarioContext)_localctx).IDENT = match(IDENT);
				setState(547); ((Parcela_unarioContext)_localctx).outros_ident = outros_ident();

				                        ((Parcela_unarioContext)_localctx).val =  tokenType((((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null)+((Parcela_unarioContext)_localctx).outros_ident.fullName);
				                    
				setState(549); dimensao();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(551); ((Parcela_unarioContext)_localctx).IDENT = match(IDENT);
				setState(552); ((Parcela_unarioContext)_localctx).chamada_parte = chamada_parte();

				                  if(!isTokenPresent((((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null)+((Parcela_unarioContext)_localctx).chamada_parte.fullName))
				                      error("Identificador nao declarado: "+(((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null),((Parcela_unarioContext)_localctx).IDENT.getLine());
				                        
				                   ((Parcela_unarioContext)_localctx).val =  tokenType((((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null)+((Parcela_unarioContext)_localctx).chamada_parte.fullName);
				                 
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(555); ((Parcela_unarioContext)_localctx).IDENT = match(IDENT);
				setState(556); ((Parcela_unarioContext)_localctx).chamada_metodo = chamada_metodo();

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
				setState(559); match(LPARENTHESIS);
				setState(560); ((Parcela_unarioContext)_localctx).expressao = expressao();
				((Parcela_unarioContext)_localctx).val =  ((Parcela_unarioContext)_localctx).expressao.val;
				setState(562); match(RPARENTHESIS);
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
			setState(574);
			switch (_input.LA(1)) {
			case COMMERCIAL_E:
				enterOuterAlt(_localctx, 1);
				{
				setState(566); match(COMMERCIAL_E);
				setState(567); ((Parcela_nao_unarioContext)_localctx).IDENT = match(IDENT);
				setState(568); ((Parcela_nao_unarioContext)_localctx).outros_ident = outros_ident();

				                       /*Coloca o UPHAT para fazer o typematch de ponteiro com endereco*/
				                       ((Parcela_nao_unarioContext)_localctx).val =  "^"+tokenType((((Parcela_nao_unarioContext)_localctx).IDENT!=null?((Parcela_nao_unarioContext)_localctx).IDENT.getText():null)+((Parcela_nao_unarioContext)_localctx).outros_ident.fullName);
				                      
				setState(570); dimensao();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(572); match(CADEIA);
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
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PERCENT) {
				{
				{
				setState(576); match(PERCENT);
				setState(577); ((Outras_parcelasContext)_localctx).parcela = parcela();

				                         if(((Outras_parcelasContext)_localctx).parcela.val.equals("inteiro"))
				                            ((Outras_parcelasContext)_localctx).val =  ((Outras_parcelasContext)_localctx).parcela.val;
				                         else
				                            ((Outras_parcelasContext)_localctx).val =  "tipo_invalido";
				                        
				}
				}
				setState(584);
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
			setState(588);
			_la = _input.LA(1);
			if (_la==LPARENTHESIS) {
				{
				setState(585); ((Chamada_metodoContext)_localctx).chamada = chamada();
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
			setState(590); ((Chamada_parteContext)_localctx).outros_ident = outros_ident();
			 ((Chamada_parteContext)_localctx).fullName =  ((Chamada_parteContext)_localctx).outros_ident.fullName;
			setState(592); dimensao();
			}
		}
		catch (RecognitionException re) {
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
			setState(594); ((Exp_relacionalContext)_localctx).exp_aritmetica = exp_aritmetica();
			((Exp_relacionalContext)_localctx).val =  ((Exp_relacionalContext)_localctx).exp_aritmetica.val;
			setState(596); ((Exp_relacionalContext)_localctx).op_opcional = op_opcional();
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
			setState(603);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << DIFFERENT) | (1L << GREATERTHANEQ) | (1L << LESSTHANEQ) | (1L << GREATERTHAN) | (1L << LESSTHAN))) != 0)) {
				{
				setState(599); op_relacional();
				setState(600); exp_aritmetica();
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
			setState(605);
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
			setState(607); ((ExpressaoContext)_localctx).termo_logico = termo_logico();
			setState(608); ((ExpressaoContext)_localctx).outros_termos_logicos = outros_termos_logicos();

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
			setState(612);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(611); match(NOT);
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
			setState(614); ((Termo_logicoContext)_localctx).fator_logico = fator_logico();
			setState(615); ((Termo_logicoContext)_localctx).outros_fatores_logicos = outros_fatores_logicos();

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
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(618); match(OR);
				setState(619); ((Outros_termos_logicosContext)_localctx).termo_logico = termo_logico();
				 tipos.add(((Outros_termos_logicosContext)_localctx).termo_logico.val); 
				}
				}
				setState(626);
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
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(629); match(AND);
				setState(630); ((Outros_fatores_logicosContext)_localctx).fator_logico = fator_logico();
				 tipos.add(((Outros_fatores_logicosContext)_localctx).fator_logico.val); 
				}
				}
				setState(637);
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
			setState(640); op_nao();
			setState(641); ((Fator_logicoContext)_localctx).parcela_logica = parcela_logica();
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
			setState(653);
			switch (_input.LA(1)) {
			case VERDADEIRO:
			case FALSO:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				switch (_input.LA(1)) {
				case VERDADEIRO:
					{
					setState(644); match(VERDADEIRO);
					 ((Parcela_logicaContext)_localctx).val =  "logico"; 
					}
					break;
				case FALSO:
					{
					setState(646); match(FALSO);
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
				setState(650); ((Parcela_logicaContext)_localctx).exp_relacional = exp_relacional();
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3C\u0292\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\7\3\u0085\n\3\f\3\16\3\u0088\13"+
		"\3\3\4\3\4\5\4\u008c\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a0\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7\u00af\n\7\f\7\16\7\u00b2\13\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\7\t\u00bc\n\t\f\t\16\t\u00bf\13\t\3\n\3\n\3\n\3\n\5"+
		"\n\u00c5\n\n\3\13\3\13\3\13\3\13\7\13\u00cb\n\13\f\13\16\13\u00ce\13\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d6\n\f\3\r\3\r\3\r\3\r\7\r\u00dc\n\r\f"+
		"\r\16\r\u00df\13\r\3\16\3\16\3\16\7\16\u00e4\n\16\f\16\16\16\u00e7\13"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f1\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00f8\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0108\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u012c\n\24\3\25\3\25\3\25\5\25\u0131\n\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0142"+
		"\n\26\f\26\16\26\u0145\13\26\3\27\5\27\u0148\n\27\3\30\3\30\3\30\7\30"+
		"\u014d\n\30\f\30\16\30\u0150\13\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\7\32\u015b\n\32\f\32\16\32\u015e\13\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01b2\n\33\3\34\3\34\3\34"+
		"\3\34\7\34\u01b8\n\34\f\34\16\34\u01bb\13\34\3\35\3\35\3\35\3\35\5\35"+
		"\u01c1\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \5 \u01d4\n \3!\3!\3!\3!\3!\3\"\5\"\u01dc\n\"\3#\3#\3#"+
		"\3$\3$\5$\u01e3\n$\3%\3%\3%\3%\3&\3&\3&\3&\5&\u01ed\n&\3\'\3\'\5\'\u01f1"+
		"\n\'\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\7,\u0203\n,\f,\16"+
		",\u0206\13,\3-\3-\3-\3-\3.\3.\3.\3.\7.\u0210\n.\f.\16.\u0213\13.\3/\3"+
		"/\3/\3/\3/\3/\3/\5/\u021c\n/\3\60\3\60\3\60\3\60\5\60\u0222\n\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\5\60\u0237\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\5\61\u0241\n\61\3\62\3\62\3\62\3\62\7\62\u0247\n\62\f\62\16\62\u024a"+
		"\13\62\3\63\3\63\3\63\5\63\u024f\n\63\3\64\3\64\3\64\3\64\3\65\3\65\3"+
		"\65\3\65\3\65\3\66\3\66\3\66\3\66\5\66\u025e\n\66\3\67\3\67\38\38\38\3"+
		"8\39\59\u0267\n9\3:\3:\3:\3:\3;\3;\3;\3;\7;\u0271\n;\f;\16;\u0274\13;"+
		"\3;\3;\3<\3<\3<\3<\7<\u027c\n<\f<\16<\u027f\13<\3<\3<\3=\3=\3=\3=\3>\3"+
		">\3>\3>\5>\u028b\n>\3>\3>\3>\5>\u0290\n>\3>\2?\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz\2\5\3\2\24\25\3\2\22\23\3\2\30\35\u028f\2|\3\2\2\2\4\u0086\3\2\2\2"+
		"\6\u008b\3\2\2\2\b\u009f\3\2\2\2\n\u00a1\3\2\2\2\f\u00b0\3\2\2\2\16\u00b3"+
		"\3\2\2\2\20\u00bd\3\2\2\2\22\u00c4\3\2\2\2\24\u00cc\3\2\2\2\26\u00d5\3"+
		"\2\2\2\30\u00dd\3\2\2\2\32\u00e5\3\2\2\2\34\u00f0\3\2\2\2\36\u00f7\3\2"+
		"\2\2 \u00f9\3\2\2\2\"\u0107\3\2\2\2$\u0109\3\2\2\2&\u012b\3\2\2\2(\u0130"+
		"\3\2\2\2*\u0132\3\2\2\2,\u0147\3\2\2\2.\u014e\3\2\2\2\60\u0153\3\2\2\2"+
		"\62\u015c\3\2\2\2\64\u01b1\3\2\2\2\66\u01b9\3\2\2\28\u01c0\3\2\2\2:\u01c2"+
		"\3\2\2\2<\u01c9\3\2\2\2>\u01d3\3\2\2\2@\u01d5\3\2\2\2B\u01db\3\2\2\2D"+
		"\u01dd\3\2\2\2F\u01e2\3\2\2\2H\u01e4\3\2\2\2J\u01ec\3\2\2\2L\u01f0\3\2"+
		"\2\2N\u01f2\3\2\2\2P\u01f6\3\2\2\2R\u01f8\3\2\2\2T\u01fa\3\2\2\2V\u0204"+
		"\3\2\2\2X\u0207\3\2\2\2Z\u0211\3\2\2\2\\\u021b\3\2\2\2^\u0236\3\2\2\2"+
		"`\u0240\3\2\2\2b\u0248\3\2\2\2d\u024e\3\2\2\2f\u0250\3\2\2\2h\u0254\3"+
		"\2\2\2j\u025d\3\2\2\2l\u025f\3\2\2\2n\u0261\3\2\2\2p\u0266\3\2\2\2r\u0268"+
		"\3\2\2\2t\u0272\3\2\2\2v\u027d\3\2\2\2x\u0282\3\2\2\2z\u028f\3\2\2\2|"+
		"}\b\2\1\2}~\5\4\3\2~\177\7\3\2\2\177\u0080\5\60\31\2\u0080\u0081\7\4\2"+
		"\2\u0081\u0082\b\2\1\2\u0082\3\3\2\2\2\u0083\u0085\5\6\4\2\u0084\u0083"+
		"\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\5\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008c\5\b\5\2\u008a\u008c\5&\24\2"+
		"\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\7\3\2\2\2\u008d\u008e\7"+
		"\5\2\2\u008e\u008f\5\n\6\2\u008f\u0090\b\5\1\2\u0090\u00a0\3\2\2\2\u0091"+
		"\u0092\7\6\2\2\u0092\u0093\7A\2\2\u0093\u0094\7\7\2\2\u0094\u0095\5\34"+
		"\17\2\u0095\u0096\7\30\2\2\u0096\u0097\5\"\22\2\u0097\u0098\b\5\1\2\u0098"+
		"\u00a0\3\2\2\2\u0099\u009a\7\b\2\2\u009a\u009b\7A\2\2\u009b\u009c\7\7"+
		"\2\2\u009c\u009d\5\26\f\2\u009d\u009e\b\5\1\2\u009e\u00a0\3\2\2\2\u009f"+
		"\u008d\3\2\2\2\u009f\u0091\3\2\2\2\u009f\u0099\3\2\2\2\u00a0\t\3\2\2\2"+
		"\u00a1\u00a2\7A\2\2\u00a2\u00a3\5\24\13\2\u00a3\u00a4\5\f\7\2\u00a4\u00a5"+
		"\7\7\2\2\u00a5\u00a6\5\26\f\2\u00a6\u00a7\b\6\1\2\u00a7\13\3\2\2\2\u00a8"+
		"\u00a9\7\t\2\2\u00a9\u00aa\7A\2\2\u00aa\u00ab\b\7\1\2\u00ab\u00ac\5\24"+
		"\13\2\u00ac\u00ad\b\7\1\2\u00ad\u00af\3\2\2\2\u00ae\u00a8\3\2\2\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\r\3\2\2\2"+
		"\u00b2\u00b0\3\2\2\2\u00b3\u00b4\5\20\t\2\u00b4\u00b5\7A\2\2\u00b5\u00b6"+
		"\b\b\1\2\u00b6\u00b7\5\24\13\2\u00b7\u00b8\5\22\n\2\u00b8\17\3\2\2\2\u00b9"+
		"\u00ba\7\n\2\2\u00ba\u00bc\b\t\1\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\21\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00c0\u00c1\7\13\2\2\u00c1\u00c2\5\16\b\2\u00c2\u00c3\b\n\1\2"+
		"\u00c3\u00c5\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\23"+
		"\3\2\2\2\u00c6\u00c7\7\f\2\2\u00c7\u00c8\5N(\2\u00c8\u00c9\7\r\2\2\u00c9"+
		"\u00cb\3\2\2\2\u00ca\u00c6\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\25\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0"+
		"\5$\23\2\u00d0\u00d1\b\f\1\2\u00d1\u00d6\3\2\2\2\u00d2\u00d3\5 \21\2\u00d3"+
		"\u00d4\b\f\1\2\u00d4\u00d6\3\2\2\2\u00d5\u00cf\3\2\2\2\u00d5\u00d2\3\2"+
		"\2\2\u00d6\27\3\2\2\2\u00d7\u00d8\7\t\2\2\u00d8\u00d9\5\16\b\2\u00d9\u00da"+
		"\b\r\1\2\u00da\u00dc\3\2\2\2\u00db\u00d7\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\31\3\2\2\2\u00df\u00dd\3\2\2"+
		"\2\u00e0\u00e1\5\n\6\2\u00e1\u00e2\b\16\1\2\u00e2\u00e4\3\2\2\2\u00e3"+
		"\u00e0\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\33\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7\37\2\2\u00e9\u00f1"+
		"\b\17\1\2\u00ea\u00eb\7 \2\2\u00eb\u00f1\b\17\1\2\u00ec\u00ed\7!\2\2\u00ed"+
		"\u00f1\b\17\1\2\u00ee\u00ef\7\"\2\2\u00ef\u00f1\b\17\1\2\u00f0\u00e8\3"+
		"\2\2\2\u00f0\u00ea\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1"+
		"\35\3\2\2\2\u00f2\u00f3\5\34\17\2\u00f3\u00f4\b\20\1\2\u00f4\u00f8\3\2"+
		"\2\2\u00f5\u00f6\7A\2\2\u00f6\u00f8\b\20\1\2\u00f7\u00f2\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\37\3\2\2\2\u00f9\u00fa\5\20\t\2\u00fa\u00fb\5\36"+
		"\20\2\u00fb\u00fc\b\21\1\2\u00fc!\3\2\2\2\u00fd\u00fe\7>\2\2\u00fe\u0108"+
		"\b\22\1\2\u00ff\u0100\7?\2\2\u0100\u0108\b\22\1\2\u0101\u0102\7@\2\2\u0102"+
		"\u0108\b\22\1\2\u0103\u0104\7%\2\2\u0104\u0108\b\22\1\2\u0105\u0106\7"+
		"&\2\2\u0106\u0108\b\22\1\2\u0107\u00fd\3\2\2\2\u0107\u00ff\3\2\2\2\u0107"+
		"\u0101\3\2\2\2\u0107\u0103\3\2\2\2\u0107\u0105\3\2\2\2\u0108#\3\2\2\2"+
		"\u0109\u010a\7\'\2\2\u010a\u010b\5\n\6\2\u010b\u010c\b\23\1\2\u010c\u010d"+
		"\5\32\16\2\u010d\u010e\b\23\1\2\u010e\u010f\7(\2\2\u010f\u0110\b\23\1"+
		"\2\u0110%\3\2\2\2\u0111\u0112\7)\2\2\u0112\u0113\7A\2\2\u0113\u0114\b"+
		"\24\1\2\u0114\u0115\7\16\2\2\u0115\u0116\5(\25\2\u0116\u0117\b\24\1\2"+
		"\u0117\u0118\7\17\2\2\u0118\u0119\5.\30\2\u0119\u011a\5\62\32\2\u011a"+
		"\u011b\7*\2\2\u011b\u011c\b\24\1\2\u011c\u012c\3\2\2\2\u011d\u011e\7+"+
		"\2\2\u011e\u011f\7A\2\2\u011f\u0120\b\24\1\2\u0120\u0121\7\16\2\2\u0121"+
		"\u0122\5(\25\2\u0122\u0123\b\24\1\2\u0123\u0124\7\17\2\2\u0124\u0125\7"+
		"\7\2\2\u0125\u0126\5 \21\2\u0126\u0127\5.\30\2\u0127\u0128\5\62\32\2\u0128"+
		"\u0129\7,\2\2\u0129\u012a\b\24\1\2\u012a\u012c\3\2\2\2\u012b\u0111\3\2"+
		"\2\2\u012b\u011d\3\2\2\2\u012c\'\3\2\2\2\u012d\u012e\5*\26\2\u012e\u012f"+
		"\b\25\1\2\u012f\u0131\3\2\2\2\u0130\u012d\3\2\2\2\u0130\u0131\3\2\2\2"+
		"\u0131)\3\2\2\2\u0132\u0133\5,\27\2\u0133\u0134\5\16\b\2\u0134\u0135\5"+
		"\30\r\2\u0135\u0136\7\7\2\2\u0136\u0137\5 \21\2\u0137\u0143\b\26\1\2\u0138"+
		"\u0139\7\t\2\2\u0139\u013a\b\26\1\2\u013a\u013b\5,\27\2\u013b\u013c\5"+
		"\16\b\2\u013c\u013d\5\30\r\2\u013d\u013e\7\7\2\2\u013e\u013f\5 \21\2\u013f"+
		"\u0140\b\26\1\2\u0140\u0142\3\2\2\2\u0141\u0138\3\2\2\2\u0142\u0145\3"+
		"\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144+\3\2\2\2\u0145\u0143"+
		"\3\2\2\2\u0146\u0148\7-\2\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"-\3\2\2\2\u0149\u014a\5\b\5\2\u014a\u014b\b\30\1\2\u014b\u014d\3\2\2\2"+
		"\u014c\u0149\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f"+
		"\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\b\30\1\2"+
		"\u0152/\3\2\2\2\u0153\u0154\5.\30\2\u0154\u0155\5\62\32\2\u0155\u0156"+
		"\b\31\1\2\u0156\61\3\2\2\2\u0157\u0158\5\64\33\2\u0158\u0159\b\32\1\2"+
		"\u0159\u015b\3\2\2\2\u015a\u0157\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a"+
		"\3\2\2\2\u015c\u015d\3\2\2\2\u015d\63\3\2\2\2\u015e\u015c\3\2\2\2\u015f"+
		"\u0160\7.\2\2\u0160\u0161\7\16\2\2\u0161\u0162\5\16\b\2\u0162\u0163\5"+
		"\30\r\2\u0163\u0164\b\33\1\2\u0164\u0165\7\17\2\2\u0165\u0166\b\33\1\2"+
		"\u0166\u01b2\3\2\2\2\u0167\u0168\7/\2\2\u0168\u0169\7\16\2\2\u0169\u016a"+
		"\5n8\2\u016a\u016b\5\66\34\2\u016b\u016c\7\17\2\2\u016c\u016d\b\33\1\2"+
		"\u016d\u01b2\3\2\2\2\u016e\u016f\b\33\1\2\u016f\u0170\7\60\2\2\u0170\u0171"+
		"\5n8\2\u0171\u0172\7\61\2\2\u0172\u0173\5\62\32\2\u0173\u0174\58\35\2"+
		"\u0174\u0175\7\62\2\2\u0175\u0176\b\33\1\2\u0176\u01b2\3\2\2\2\u0177\u0178"+
		"\b\33\1\2\u0178\u0179\7\63\2\2\u0179\u017a\5N(\2\u017a\u017b\7\65\2\2"+
		"\u017b\u017c\5@!\2\u017c\u017d\58\35\2\u017d\u017e\7\64\2\2\u017e\u017f"+
		"\b\33\1\2\u017f\u01b2\3\2\2\2\u0180\u0181\b\33\1\2\u0181\u0182\7\66\2"+
		"\2\u0182\u0183\7A\2\2\u0183\u0184\b\33\1\2\u0184\u0185\7\21\2\2\u0185"+
		"\u0186\5N(\2\u0186\u0187\b\33\1\2\u0187\u0188\7\67\2\2\u0188\u0189\5N"+
		"(\2\u0189\u018a\b\33\1\2\u018a\u018b\78\2\2\u018b\u018c\5\62\32\2\u018c"+
		"\u018d\79\2\2\u018d\u018e\b\33\1\2\u018e\u01b2\3\2\2\2\u018f\u0190\b\33"+
		"\1\2\u0190\u0191\7:\2\2\u0191\u0192\5n8\2\u0192\u0193\78\2\2\u0193\u0194"+
		"\5\62\32\2\u0194\u0195\7;\2\2\u0195\u0196\b\33\1\2\u0196\u01b2\3\2\2\2"+
		"\u0197\u0198\b\33\1\2\u0198\u0199\78\2\2\u0199\u019a\5\62\32\2\u019a\u019b"+
		"\7\67\2\2\u019b\u019c\5n8\2\u019c\u019d\b\33\1\2\u019d\u01b2\3\2\2\2\u019e"+
		"\u019f\7\n\2\2\u019f\u01a0\7A\2\2\u01a0\u01a1\5\22\n\2\u01a1\u01a2\5\24"+
		"\13\2\u01a2\u01a3\7\21\2\2\u01a3\u01a4\5n8\2\u01a4\u01a5\b\33\1\2\u01a5"+
		"\u01b2\3\2\2\2\u01a6\u01a7\7A\2\2\u01a7\u01a8\5<\37\2\u01a8\u01a9\b\33"+
		"\1\2\u01a9\u01b2\3\2\2\2\u01aa\u01ab\5:\36\2\u01ab\u01ac\b\33\1\2\u01ac"+
		"\u01b2\3\2\2\2\u01ad\u01ae\7<\2\2\u01ae\u01af\5n8\2\u01af\u01b0\b\33\1"+
		"\2\u01b0\u01b2\3\2\2\2\u01b1\u015f\3\2\2\2\u01b1\u0167\3\2\2\2\u01b1\u016e"+
		"\3\2\2\2\u01b1\u0177\3\2\2\2\u01b1\u0180\3\2\2\2\u01b1\u018f\3\2\2\2\u01b1"+
		"\u0197\3\2\2\2\u01b1\u019e\3\2\2\2\u01b1\u01a6\3\2\2\2\u01b1\u01aa\3\2"+
		"\2\2\u01b1\u01ad\3\2\2\2\u01b2\65\3\2\2\2\u01b3\u01b4\7\t\2\2\u01b4\u01b5"+
		"\5n8\2\u01b5\u01b6\b\34\1\2\u01b6\u01b8\3\2\2\2\u01b7\u01b3\3\2\2\2\u01b8"+
		"\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\67\3\2\2"+
		"\2\u01bb\u01b9\3\2\2\2\u01bc\u01bd\7=\2\2\u01bd\u01be\5\62\32\2\u01be"+
		"\u01bf\b\35\1\2\u01bf\u01c1\3\2\2\2\u01c0\u01bc\3\2\2\2\u01c0\u01c1\3"+
		"\2\2\2\u01c19\3\2\2\2\u01c2\u01c3\7A\2\2\u01c3\u01c4\5\22\n\2\u01c4\u01c5"+
		"\5\24\13\2\u01c5\u01c6\7\21\2\2\u01c6\u01c7\5n8\2\u01c7\u01c8\b\36\1\2"+
		"\u01c8;\3\2\2\2\u01c9\u01ca\7\16\2\2\u01ca\u01cb\5> \2\u01cb\u01cc\7\17"+
		"\2\2\u01cc\u01cd\b\37\1\2\u01cd=\3\2\2\2\u01ce\u01cf\5n8\2\u01cf\u01d0"+
		"\b \1\2\u01d0\u01d1\5\66\34\2\u01d1\u01d2\b \1\2\u01d2\u01d4\3\2\2\2\u01d3"+
		"\u01ce\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4?\3\2\2\2\u01d5\u01d6\5D#\2\u01d6"+
		"\u01d7\7\7\2\2\u01d7\u01d8\5\62\32\2\u01d8\u01d9\5B\"\2\u01d9A\3\2\2\2"+
		"\u01da\u01dc\5@!\2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dcC\3\2"+
		"\2\2\u01dd\u01de\5H%\2\u01de\u01df\5F$\2\u01dfE\3\2\2\2\u01e0\u01e1\7"+
		"\t\2\2\u01e1\u01e3\5D#\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"G\3\2\2\2\u01e4\u01e5\5L\'\2\u01e5\u01e6\7?\2\2\u01e6\u01e7\5J&\2\u01e7"+
		"I\3\2\2\2\u01e8\u01e9\7\20\2\2\u01e9\u01ea\5L\'\2\u01ea\u01eb\7?\2\2\u01eb"+
		"\u01ed\3\2\2\2\u01ec\u01e8\3\2\2\2\u01ec\u01ed\3\2\2\2\u01edK\3\2\2\2"+
		"\u01ee\u01ef\7\22\2\2\u01ef\u01f1\b\'\1\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1"+
		"\3\2\2\2\u01f1M\3\2\2\2\u01f2\u01f3\5T+\2\u01f3\u01f4\5V,\2\u01f4\u01f5"+
		"\b(\1\2\u01f5O\3\2\2\2\u01f6\u01f7\t\2\2\2\u01f7Q\3\2\2\2\u01f8\u01f9"+
		"\t\3\2\2\u01f9S\3\2\2\2\u01fa\u01fb\5X-\2\u01fb\u01fc\5Z.\2\u01fc\u01fd"+
		"\b+\1\2\u01fdU\3\2\2\2\u01fe\u01ff\5R*\2\u01ff\u0200\5T+\2\u0200\u0201"+
		"\b,\1\2\u0201\u0203\3\2\2\2\u0202\u01fe\3\2\2\2\u0203\u0206\3\2\2\2\u0204"+
		"\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205W\3\2\2\2\u0206\u0204\3\2\2\2"+
		"\u0207\u0208\5\\/\2\u0208\u0209\5b\62\2\u0209\u020a\b-\1\2\u020aY\3\2"+
		"\2\2\u020b\u020c\5P)\2\u020c\u020d\5X-\2\u020d\u020e\b.\1\2\u020e\u0210"+
		"\3\2\2\2\u020f\u020b\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211"+
		"\u0212\3\2\2\2\u0212[\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0215\5L\'\2\u0215"+
		"\u0216\5^\60\2\u0216\u0217\b/\1\2\u0217\u021c\3\2\2\2\u0218\u0219\5`\61"+
		"\2\u0219\u021a\b/\1\2\u021a\u021c\3\2\2\2\u021b\u0214\3\2\2\2\u021b\u0218"+
		"\3\2\2\2\u021c]\3\2\2\2\u021d\u021e\7?\2\2\u021e\u0222\b\60\1\2\u021f"+
		"\u0220\7@\2\2\u0220\u0222\b\60\1\2\u0221\u021d\3\2\2\2\u0221\u021f\3\2"+
		"\2\2\u0222\u0237\3\2\2\2\u0223\u0224\7\n\2\2\u0224\u0225\7A\2\2\u0225"+
		"\u0226\5\22\n\2\u0226\u0227\b\60\1\2\u0227\u0228\5\24\13\2\u0228\u0237"+
		"\3\2\2\2\u0229\u022a\7A\2\2\u022a\u022b\5f\64\2\u022b\u022c\b\60\1\2\u022c"+
		"\u0237\3\2\2\2\u022d\u022e\7A\2\2\u022e\u022f\5d\63\2\u022f\u0230\b\60"+
		"\1\2\u0230\u0237\3\2\2\2\u0231\u0232\7\16\2\2\u0232\u0233\5n8\2\u0233"+
		"\u0234\b\60\1\2\u0234\u0235\7\17\2\2\u0235\u0237\3\2\2\2\u0236\u0221\3"+
		"\2\2\2\u0236\u0223\3\2\2\2\u0236\u0229\3\2\2\2\u0236\u022d\3\2\2\2\u0236"+
		"\u0231\3\2\2\2\u0237_\3\2\2\2\u0238\u0239\7\26\2\2\u0239\u023a\7A\2\2"+
		"\u023a\u023b\5\22\n\2\u023b\u023c\b\61\1\2\u023c\u023d\5\24\13\2\u023d"+
		"\u0241\3\2\2\2\u023e\u023f\7>\2\2\u023f\u0241\b\61\1\2\u0240\u0238\3\2"+
		"\2\2\u0240\u023e\3\2\2\2\u0241a\3\2\2\2\u0242\u0243\7\27\2\2\u0243\u0244"+
		"\5\\/\2\u0244\u0245\b\62\1\2\u0245\u0247\3\2\2\2\u0246\u0242\3\2\2\2\u0247"+
		"\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249c\3\2\2\2"+
		"\u024a\u0248\3\2\2\2\u024b\u024c\5<\37\2\u024c\u024d\b\63\1\2\u024d\u024f"+
		"\3\2\2\2\u024e\u024b\3\2\2\2\u024e\u024f\3\2\2\2\u024fe\3\2\2\2\u0250"+
		"\u0251\5\22\n\2\u0251\u0252\b\64\1\2\u0252\u0253\5\24\13\2\u0253g\3\2"+
		"\2\2\u0254\u0255\5N(\2\u0255\u0256\b\65\1\2\u0256\u0257\5j\66\2\u0257"+
		"\u0258\b\65\1\2\u0258i\3\2\2\2\u0259\u025a\5l\67\2\u025a\u025b\5N(\2\u025b"+
		"\u025c\b\66\1\2\u025c\u025e\3\2\2\2\u025d\u0259\3\2\2\2\u025d\u025e\3"+
		"\2\2\2\u025ek\3\2\2\2\u025f\u0260\t\4\2\2\u0260m\3\2\2\2\u0261\u0262\5"+
		"r:\2\u0262\u0263\5t;\2\u0263\u0264\b8\1\2\u0264o\3\2\2\2\u0265\u0267\7"+
		"\36\2\2\u0266\u0265\3\2\2\2\u0266\u0267\3\2\2\2\u0267q\3\2\2\2\u0268\u0269"+
		"\5x=\2\u0269\u026a\5v<\2\u026a\u026b\b:\1\2\u026bs\3\2\2\2\u026c\u026d"+
		"\7#\2\2\u026d\u026e\5r:\2\u026e\u026f\b;\1\2\u026f\u0271\3\2\2\2\u0270"+
		"\u026c\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2"+
		"\2\2\u0273\u0275\3\2\2\2\u0274\u0272\3\2\2\2\u0275\u0276\b;\1\2\u0276"+
		"u\3\2\2\2\u0277\u0278\7$\2\2\u0278\u0279\5x=\2\u0279\u027a\b<\1\2\u027a"+
		"\u027c\3\2\2\2\u027b\u0277\3\2\2\2\u027c\u027f\3\2\2\2\u027d\u027b\3\2"+
		"\2\2\u027d\u027e\3\2\2\2\u027e\u0280\3\2\2\2\u027f\u027d\3\2\2\2\u0280"+
		"\u0281\b<\1\2\u0281w\3\2\2\2\u0282\u0283\5p9\2\u0283\u0284\5z>\2\u0284"+
		"\u0285\b=\1\2\u0285y\3\2\2\2\u0286\u0287\7%\2\2\u0287\u028b\b>\1\2\u0288"+
		"\u0289\7&\2\2\u0289\u028b\b>\1\2\u028a\u0286\3\2\2\2\u028a\u0288\3\2\2"+
		"\2\u028b\u0290\3\2\2\2\u028c\u028d\5h\65\2\u028d\u028e\b>\1\2\u028e\u0290"+
		"\3\2\2\2\u028f\u028a\3\2\2\2\u028f\u028c\3\2\2\2\u0290{\3\2\2\2+\u0086"+
		"\u008b\u009f\u00b0\u00bd\u00c4\u00cc\u00d5\u00dd\u00e5\u00f0\u00f7\u0107"+
		"\u012b\u0130\u0143\u0147\u014e\u015c\u01b1\u01b9\u01c0\u01d3\u01db\u01e2"+
		"\u01ec\u01f0\u0204\u0211\u021b\u0221\u0236\u0240\u0248\u024e\u025d\u0266"+
		"\u0272\u027d\u028a\u028f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}