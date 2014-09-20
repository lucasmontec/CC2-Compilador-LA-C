// Generated from /home/joaovitor/NetBeansProjects/CC2-Compilador-LA-C/CC2-Compilador-LA-C/src/grammars/LAGrammar1_CodeGen.g4 by ANTLR 4.1
package antlr;

  import Semantic.TokenSymbol;
  import Semantic.TokenSymbolTable;
  import static Semantic.SemanticUtil.*;
  import CodeGeneration.Generator;
  import java.util.*;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * This class provides an empty implementation of {@link LAGrammar1_CodeGenListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class LAGrammar1_CodeGenBaseListener implements LAGrammar1_CodeGenListener {
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterTermo(@NotNull LAGrammar1_CodeGenParser.TermoContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitTermo(@NotNull LAGrammar1_CodeGenParser.TermoContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterOp_multiplicacao(@NotNull LAGrammar1_CodeGenParser.Op_multiplicacaoContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitOp_multiplicacao(@NotNull LAGrammar1_CodeGenParser.Op_multiplicacaoContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterChamada_metodo(@NotNull LAGrammar1_CodeGenParser.Chamada_metodoContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitChamada_metodo(@NotNull LAGrammar1_CodeGenParser.Chamada_metodoContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterIntervalo_opcional(@NotNull LAGrammar1_CodeGenParser.Intervalo_opcionalContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitIntervalo_opcional(@NotNull LAGrammar1_CodeGenParser.Intervalo_opcionalContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterParcela_logica(@NotNull LAGrammar1_CodeGenParser.Parcela_logicaContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitParcela_logica(@NotNull LAGrammar1_CodeGenParser.Parcela_logicaContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterPrograma(@NotNull LAGrammar1_CodeGenParser.ProgramaContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitPrograma(@NotNull LAGrammar1_CodeGenParser.ProgramaContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterOutros_termos_logicos(@NotNull LAGrammar1_CodeGenParser.Outros_termos_logicosContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitOutros_termos_logicos(@NotNull LAGrammar1_CodeGenParser.Outros_termos_logicosContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterDeclaracao_local(@NotNull LAGrammar1_CodeGenParser.Declaracao_localContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitDeclaracao_local(@NotNull LAGrammar1_CodeGenParser.Declaracao_localContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterPonteiros_opcionais(@NotNull LAGrammar1_CodeGenParser.Ponteiros_opcionaisContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitPonteiros_opcionais(@NotNull LAGrammar1_CodeGenParser.Ponteiros_opcionaisContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterTipo_basico(@NotNull LAGrammar1_CodeGenParser.Tipo_basicoContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitTipo_basico(@NotNull LAGrammar1_CodeGenParser.Tipo_basicoContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterFator_logico(@NotNull LAGrammar1_CodeGenParser.Fator_logicoContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitFator_logico(@NotNull LAGrammar1_CodeGenParser.Fator_logicoContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterOp_opcional(@NotNull LAGrammar1_CodeGenParser.Op_opcionalContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitOp_opcional(@NotNull LAGrammar1_CodeGenParser.Op_opcionalContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterOutros_ident(@NotNull LAGrammar1_CodeGenParser.Outros_identContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitOutros_ident(@NotNull LAGrammar1_CodeGenParser.Outros_identContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterChamada_parte(@NotNull LAGrammar1_CodeGenParser.Chamada_parteContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitChamada_parte(@NotNull LAGrammar1_CodeGenParser.Chamada_parteContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterOutros_fatores(@NotNull LAGrammar1_CodeGenParser.Outros_fatoresContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitOutros_fatores(@NotNull LAGrammar1_CodeGenParser.Outros_fatoresContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterFator(@NotNull LAGrammar1_CodeGenParser.FatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitFator(@NotNull LAGrammar1_CodeGenParser.FatorContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterParametro(@NotNull LAGrammar1_CodeGenParser.ParametroContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitParametro(@NotNull LAGrammar1_CodeGenParser.ParametroContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterMais_expressao(@NotNull LAGrammar1_CodeGenParser.Mais_expressaoContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitMais_expressao(@NotNull LAGrammar1_CodeGenParser.Mais_expressaoContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterDeclaracao_global(@NotNull LAGrammar1_CodeGenParser.Declaracao_globalContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitDeclaracao_global(@NotNull LAGrammar1_CodeGenParser.Declaracao_globalContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterParcela_nao_unario(@NotNull LAGrammar1_CodeGenParser.Parcela_nao_unarioContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitParcela_nao_unario(@NotNull LAGrammar1_CodeGenParser.Parcela_nao_unarioContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterMais_var(@NotNull LAGrammar1_CodeGenParser.Mais_varContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitMais_var(@NotNull LAGrammar1_CodeGenParser.Mais_varContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterOp_nao(@NotNull LAGrammar1_CodeGenParser.Op_naoContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitOp_nao(@NotNull LAGrammar1_CodeGenParser.Op_naoContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterMais_ident(@NotNull LAGrammar1_CodeGenParser.Mais_identContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitMais_ident(@NotNull LAGrammar1_CodeGenParser.Mais_identContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterCmd(@NotNull LAGrammar1_CodeGenParser.CmdContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitCmd(@NotNull LAGrammar1_CodeGenParser.CmdContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterRegistro(@NotNull LAGrammar1_CodeGenParser.RegistroContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitRegistro(@NotNull LAGrammar1_CodeGenParser.RegistroContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterChamada(@NotNull LAGrammar1_CodeGenParser.ChamadaContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitChamada(@NotNull LAGrammar1_CodeGenParser.ChamadaContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterOutros_fatores_logicos(@NotNull LAGrammar1_CodeGenParser.Outros_fatores_logicosContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitOutros_fatores_logicos(@NotNull LAGrammar1_CodeGenParser.Outros_fatores_logicosContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterDeclaracoes_locais(@NotNull LAGrammar1_CodeGenParser.Declaracoes_locaisContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitDeclaracoes_locais(@NotNull LAGrammar1_CodeGenParser.Declaracoes_locaisContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterMais_variaveis(@NotNull LAGrammar1_CodeGenParser.Mais_variaveisContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitMais_variaveis(@NotNull LAGrammar1_CodeGenParser.Mais_variaveisContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterExpressao(@NotNull LAGrammar1_CodeGenParser.ExpressaoContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitExpressao(@NotNull LAGrammar1_CodeGenParser.ExpressaoContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterArgumentos_opcional(@NotNull LAGrammar1_CodeGenParser.Argumentos_opcionalContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitArgumentos_opcional(@NotNull LAGrammar1_CodeGenParser.Argumentos_opcionalContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterVar_opcional(@NotNull LAGrammar1_CodeGenParser.Var_opcionalContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitVar_opcional(@NotNull LAGrammar1_CodeGenParser.Var_opcionalContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterOutros_termos(@NotNull LAGrammar1_CodeGenParser.Outros_termosContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitOutros_termos(@NotNull LAGrammar1_CodeGenParser.Outros_termosContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterParcela_unario(@NotNull LAGrammar1_CodeGenParser.Parcela_unarioContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitParcela_unario(@NotNull LAGrammar1_CodeGenParser.Parcela_unarioContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterConstantes(@NotNull LAGrammar1_CodeGenParser.ConstantesContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitConstantes(@NotNull LAGrammar1_CodeGenParser.ConstantesContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterOutras_parcelas(@NotNull LAGrammar1_CodeGenParser.Outras_parcelasContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitOutras_parcelas(@NotNull LAGrammar1_CodeGenParser.Outras_parcelasContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterCorpo(@NotNull LAGrammar1_CodeGenParser.CorpoContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitCorpo(@NotNull LAGrammar1_CodeGenParser.CorpoContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterExp_relacional(@NotNull LAGrammar1_CodeGenParser.Exp_relacionalContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitExp_relacional(@NotNull LAGrammar1_CodeGenParser.Exp_relacionalContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterTipo_basico_ident(@NotNull LAGrammar1_CodeGenParser.Tipo_basico_identContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitTipo_basico_ident(@NotNull LAGrammar1_CodeGenParser.Tipo_basico_identContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterVariavel(@NotNull LAGrammar1_CodeGenParser.VariavelContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitVariavel(@NotNull LAGrammar1_CodeGenParser.VariavelContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterAtribuicao(@NotNull LAGrammar1_CodeGenParser.AtribuicaoContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitAtribuicao(@NotNull LAGrammar1_CodeGenParser.AtribuicaoContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterDecl_local_global(@NotNull LAGrammar1_CodeGenParser.Decl_local_globalContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitDecl_local_global(@NotNull LAGrammar1_CodeGenParser.Decl_local_globalContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterNumero_intervalo(@NotNull LAGrammar1_CodeGenParser.Numero_intervaloContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitNumero_intervalo(@NotNull LAGrammar1_CodeGenParser.Numero_intervaloContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterMais_selecao(@NotNull LAGrammar1_CodeGenParser.Mais_selecaoContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitMais_selecao(@NotNull LAGrammar1_CodeGenParser.Mais_selecaoContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterDeclaracoes(@NotNull LAGrammar1_CodeGenParser.DeclaracoesContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitDeclaracoes(@NotNull LAGrammar1_CodeGenParser.DeclaracoesContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterTipo_estendido(@NotNull LAGrammar1_CodeGenParser.Tipo_estendidoContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitTipo_estendido(@NotNull LAGrammar1_CodeGenParser.Tipo_estendidoContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterParcela(@NotNull LAGrammar1_CodeGenParser.ParcelaContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitParcela(@NotNull LAGrammar1_CodeGenParser.ParcelaContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterComandos(@NotNull LAGrammar1_CodeGenParser.ComandosContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitComandos(@NotNull LAGrammar1_CodeGenParser.ComandosContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterOp_unario(@NotNull LAGrammar1_CodeGenParser.Op_unarioContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitOp_unario(@NotNull LAGrammar1_CodeGenParser.Op_unarioContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterExp_aritmetica(@NotNull LAGrammar1_CodeGenParser.Exp_aritmeticaContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitExp_aritmetica(@NotNull LAGrammar1_CodeGenParser.Exp_aritmeticaContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterValor_constante(@NotNull LAGrammar1_CodeGenParser.Valor_constanteContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitValor_constante(@NotNull LAGrammar1_CodeGenParser.Valor_constanteContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterMais_constantes(@NotNull LAGrammar1_CodeGenParser.Mais_constantesContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitMais_constantes(@NotNull LAGrammar1_CodeGenParser.Mais_constantesContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterOp_adicao(@NotNull LAGrammar1_CodeGenParser.Op_adicaoContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitOp_adicao(@NotNull LAGrammar1_CodeGenParser.Op_adicaoContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterDimensao(@NotNull LAGrammar1_CodeGenParser.DimensaoContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitDimensao(@NotNull LAGrammar1_CodeGenParser.DimensaoContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterSelecao(@NotNull LAGrammar1_CodeGenParser.SelecaoContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitSelecao(@NotNull LAGrammar1_CodeGenParser.SelecaoContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterIdentificador(@NotNull LAGrammar1_CodeGenParser.IdentificadorContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitIdentificador(@NotNull LAGrammar1_CodeGenParser.IdentificadorContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterOp_relacional(@NotNull LAGrammar1_CodeGenParser.Op_relacionalContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitOp_relacional(@NotNull LAGrammar1_CodeGenParser.Op_relacionalContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterTipo(@NotNull LAGrammar1_CodeGenParser.TipoContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitTipo(@NotNull LAGrammar1_CodeGenParser.TipoContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterSenao_opcional(@NotNull LAGrammar1_CodeGenParser.Senao_opcionalContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitSenao_opcional(@NotNull LAGrammar1_CodeGenParser.Senao_opcionalContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterTermo_logico(@NotNull LAGrammar1_CodeGenParser.Termo_logicoContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitTermo_logico(@NotNull LAGrammar1_CodeGenParser.Termo_logicoContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterParametros_opcional(@NotNull LAGrammar1_CodeGenParser.Parametros_opcionalContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitParametros_opcional(@NotNull LAGrammar1_CodeGenParser.Parametros_opcionalContext ctx) { }

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void enterEveryRule(@NotNull ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitEveryRule(@NotNull ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void visitTerminal(@NotNull TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void visitErrorNode(@NotNull ErrorNode node) { }
}