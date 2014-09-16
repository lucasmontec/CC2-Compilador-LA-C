// Generated from /home/joaovitor/NetBeansProjects/CC2-Compilador-LA-C/CC2-Compilador-LA-C/src/grammars/LAGrammar1.g4 by ANTLR 4.1
package antlr;

  import Semantic.TokenSymbol;
  import Semantic.TokenSymbolTable;
  import static Semantic.SemanticUtil.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LAGrammar1Parser}.
 */
public interface LAGrammar1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(@NotNull LAGrammar1Parser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(@NotNull LAGrammar1Parser.TermoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#op_multiplicacao}.
	 * @param ctx the parse tree
	 */
	void enterOp_multiplicacao(@NotNull LAGrammar1Parser.Op_multiplicacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#op_multiplicacao}.
	 * @param ctx the parse tree
	 */
	void exitOp_multiplicacao(@NotNull LAGrammar1Parser.Op_multiplicacaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#intervalo_opcional}.
	 * @param ctx the parse tree
	 */
	void enterIntervalo_opcional(@NotNull LAGrammar1Parser.Intervalo_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#intervalo_opcional}.
	 * @param ctx the parse tree
	 */
	void exitIntervalo_opcional(@NotNull LAGrammar1Parser.Intervalo_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(@NotNull LAGrammar1Parser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(@NotNull LAGrammar1Parser.Parcela_logicaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull LAGrammar1Parser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull LAGrammar1Parser.ProgramaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#outros_termos_logicos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_termos_logicos(@NotNull LAGrammar1Parser.Outros_termos_logicosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#outros_termos_logicos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_termos_logicos(@NotNull LAGrammar1Parser.Outros_termos_logicosContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(@NotNull LAGrammar1Parser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(@NotNull LAGrammar1Parser.Declaracao_localContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#ponteiros_opcionais}.
	 * @param ctx the parse tree
	 */
	void enterPonteiros_opcionais(@NotNull LAGrammar1Parser.Ponteiros_opcionaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#ponteiros_opcionais}.
	 * @param ctx the parse tree
	 */
	void exitPonteiros_opcionais(@NotNull LAGrammar1Parser.Ponteiros_opcionaisContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(@NotNull LAGrammar1Parser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(@NotNull LAGrammar1Parser.Tipo_basicoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(@NotNull LAGrammar1Parser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(@NotNull LAGrammar1Parser.Fator_logicoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#op_opcional}.
	 * @param ctx the parse tree
	 */
	void enterOp_opcional(@NotNull LAGrammar1Parser.Op_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#op_opcional}.
	 * @param ctx the parse tree
	 */
	void exitOp_opcional(@NotNull LAGrammar1Parser.Op_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#outros_ident}.
	 * @param ctx the parse tree
	 */
	void enterOutros_ident(@NotNull LAGrammar1Parser.Outros_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#outros_ident}.
	 * @param ctx the parse tree
	 */
	void exitOutros_ident(@NotNull LAGrammar1Parser.Outros_identContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#outros_fatores}.
	 * @param ctx the parse tree
	 */
	void enterOutros_fatores(@NotNull LAGrammar1Parser.Outros_fatoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#outros_fatores}.
	 * @param ctx the parse tree
	 */
	void exitOutros_fatores(@NotNull LAGrammar1Parser.Outros_fatoresContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(@NotNull LAGrammar1Parser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(@NotNull LAGrammar1Parser.FatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(@NotNull LAGrammar1Parser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(@NotNull LAGrammar1Parser.ParametroContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#mais_expressao}.
	 * @param ctx the parse tree
	 */
	void enterMais_expressao(@NotNull LAGrammar1Parser.Mais_expressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#mais_expressao}.
	 * @param ctx the parse tree
	 */
	void exitMais_expressao(@NotNull LAGrammar1Parser.Mais_expressaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(@NotNull LAGrammar1Parser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(@NotNull LAGrammar1Parser.Parcela_nao_unarioContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(@NotNull LAGrammar1Parser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(@NotNull LAGrammar1Parser.Declaracao_globalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#mais_var}.
	 * @param ctx the parse tree
	 */
	void enterMais_var(@NotNull LAGrammar1Parser.Mais_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#mais_var}.
	 * @param ctx the parse tree
	 */
	void exitMais_var(@NotNull LAGrammar1Parser.Mais_varContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#op_nao}.
	 * @param ctx the parse tree
	 */
	void enterOp_nao(@NotNull LAGrammar1Parser.Op_naoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#op_nao}.
	 * @param ctx the parse tree
	 */
	void exitOp_nao(@NotNull LAGrammar1Parser.Op_naoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#mais_ident}.
	 * @param ctx the parse tree
	 */
	void enterMais_ident(@NotNull LAGrammar1Parser.Mais_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#mais_ident}.
	 * @param ctx the parse tree
	 */
	void exitMais_ident(@NotNull LAGrammar1Parser.Mais_identContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(@NotNull LAGrammar1Parser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(@NotNull LAGrammar1Parser.CmdContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#chamada_partes}.
	 * @param ctx the parse tree
	 */
	void enterChamada_partes(@NotNull LAGrammar1Parser.Chamada_partesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#chamada_partes}.
	 * @param ctx the parse tree
	 */
	void exitChamada_partes(@NotNull LAGrammar1Parser.Chamada_partesContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(@NotNull LAGrammar1Parser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(@NotNull LAGrammar1Parser.RegistroContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#chamada}.
	 * @param ctx the parse tree
	 */
	void enterChamada(@NotNull LAGrammar1Parser.ChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#chamada}.
	 * @param ctx the parse tree
	 */
	void exitChamada(@NotNull LAGrammar1Parser.ChamadaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#outros_fatores_logicos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_fatores_logicos(@NotNull LAGrammar1Parser.Outros_fatores_logicosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#outros_fatores_logicos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_fatores_logicos(@NotNull LAGrammar1Parser.Outros_fatores_logicosContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#declaracoes_locais}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes_locais(@NotNull LAGrammar1Parser.Declaracoes_locaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#declaracoes_locais}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes_locais(@NotNull LAGrammar1Parser.Declaracoes_locaisContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#mais_variaveis}.
	 * @param ctx the parse tree
	 */
	void enterMais_variaveis(@NotNull LAGrammar1Parser.Mais_variaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#mais_variaveis}.
	 * @param ctx the parse tree
	 */
	void exitMais_variaveis(@NotNull LAGrammar1Parser.Mais_variaveisContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(@NotNull LAGrammar1Parser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(@NotNull LAGrammar1Parser.ExpressaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#argumentos_opcional}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos_opcional(@NotNull LAGrammar1Parser.Argumentos_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#argumentos_opcional}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos_opcional(@NotNull LAGrammar1Parser.Argumentos_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#var_opcional}.
	 * @param ctx the parse tree
	 */
	void enterVar_opcional(@NotNull LAGrammar1Parser.Var_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#var_opcional}.
	 * @param ctx the parse tree
	 */
	void exitVar_opcional(@NotNull LAGrammar1Parser.Var_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_termos(@NotNull LAGrammar1Parser.Outros_termosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_termos(@NotNull LAGrammar1Parser.Outros_termosContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(@NotNull LAGrammar1Parser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(@NotNull LAGrammar1Parser.Parcela_unarioContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(@NotNull LAGrammar1Parser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(@NotNull LAGrammar1Parser.ConstantesContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#outras_parcelas}.
	 * @param ctx the parse tree
	 */
	void enterOutras_parcelas(@NotNull LAGrammar1Parser.Outras_parcelasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#outras_parcelas}.
	 * @param ctx the parse tree
	 */
	void exitOutras_parcelas(@NotNull LAGrammar1Parser.Outras_parcelasContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(@NotNull LAGrammar1Parser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(@NotNull LAGrammar1Parser.CorpoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(@NotNull LAGrammar1Parser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(@NotNull LAGrammar1Parser.Exp_relacionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(@NotNull LAGrammar1Parser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(@NotNull LAGrammar1Parser.Tipo_basico_identContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(@NotNull LAGrammar1Parser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(@NotNull LAGrammar1Parser.VariavelContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(@NotNull LAGrammar1Parser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(@NotNull LAGrammar1Parser.AtribuicaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(@NotNull LAGrammar1Parser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(@NotNull LAGrammar1Parser.Decl_local_globalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(@NotNull LAGrammar1Parser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(@NotNull LAGrammar1Parser.Numero_intervaloContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#mais_selecao}.
	 * @param ctx the parse tree
	 */
	void enterMais_selecao(@NotNull LAGrammar1Parser.Mais_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#mais_selecao}.
	 * @param ctx the parse tree
	 */
	void exitMais_selecao(@NotNull LAGrammar1Parser.Mais_selecaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(@NotNull LAGrammar1Parser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(@NotNull LAGrammar1Parser.DeclaracoesContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#mais_parametros}.
	 * @param ctx the parse tree
	 */
	void enterMais_parametros(@NotNull LAGrammar1Parser.Mais_parametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#mais_parametros}.
	 * @param ctx the parse tree
	 */
	void exitMais_parametros(@NotNull LAGrammar1Parser.Mais_parametrosContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(@NotNull LAGrammar1Parser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(@NotNull LAGrammar1Parser.Tipo_estendidoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(@NotNull LAGrammar1Parser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(@NotNull LAGrammar1Parser.ParcelaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(@NotNull LAGrammar1Parser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(@NotNull LAGrammar1Parser.ComandosContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(@NotNull LAGrammar1Parser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(@NotNull LAGrammar1Parser.Op_unarioContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(@NotNull LAGrammar1Parser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(@NotNull LAGrammar1Parser.Exp_aritmeticaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(@NotNull LAGrammar1Parser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(@NotNull LAGrammar1Parser.Valor_constanteContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#mais_constantes}.
	 * @param ctx the parse tree
	 */
	void enterMais_constantes(@NotNull LAGrammar1Parser.Mais_constantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#mais_constantes}.
	 * @param ctx the parse tree
	 */
	void exitMais_constantes(@NotNull LAGrammar1Parser.Mais_constantesContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#op_adicao}.
	 * @param ctx the parse tree
	 */
	void enterOp_adicao(@NotNull LAGrammar1Parser.Op_adicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#op_adicao}.
	 * @param ctx the parse tree
	 */
	void exitOp_adicao(@NotNull LAGrammar1Parser.Op_adicaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(@NotNull LAGrammar1Parser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(@NotNull LAGrammar1Parser.DimensaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(@NotNull LAGrammar1Parser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(@NotNull LAGrammar1Parser.SelecaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(@NotNull LAGrammar1Parser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(@NotNull LAGrammar1Parser.IdentificadorContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(@NotNull LAGrammar1Parser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(@NotNull LAGrammar1Parser.Op_relacionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(@NotNull LAGrammar1Parser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(@NotNull LAGrammar1Parser.TipoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#senao_opcional}.
	 * @param ctx the parse tree
	 */
	void enterSenao_opcional(@NotNull LAGrammar1Parser.Senao_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#senao_opcional}.
	 * @param ctx the parse tree
	 */
	void exitSenao_opcional(@NotNull LAGrammar1Parser.Senao_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(@NotNull LAGrammar1Parser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(@NotNull LAGrammar1Parser.Termo_logicoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1Parser#parametros_opcional}.
	 * @param ctx the parse tree
	 */
	void enterParametros_opcional(@NotNull LAGrammar1Parser.Parametros_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1Parser#parametros_opcional}.
	 * @param ctx the parse tree
	 */
	void exitParametros_opcional(@NotNull LAGrammar1Parser.Parametros_opcionalContext ctx);
}