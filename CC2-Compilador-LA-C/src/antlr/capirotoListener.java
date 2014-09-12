// Generated from C:\Users\Lucas\git\CC2-Compilador-LA-C\CC2-Compilador-LA-C\src\grammars\capiroto.g4 by ANTLR 4.1
package antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link capirotoParser}.
 */
public interface capirotoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link capirotoParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(@NotNull capirotoParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(@NotNull capirotoParser.TipoContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#var_opcional}.
	 * @param ctx the parse tree
	 */
	void enterVar_opcional(@NotNull capirotoParser.Var_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#var_opcional}.
	 * @param ctx the parse tree
	 */
	void exitVar_opcional(@NotNull capirotoParser.Var_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(@NotNull capirotoParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(@NotNull capirotoParser.Fator_logicoContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(@NotNull capirotoParser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(@NotNull capirotoParser.Parcela_logicaContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#declaracoes_locais}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes_locais(@NotNull capirotoParser.Declaracoes_locaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#declaracoes_locais}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes_locais(@NotNull capirotoParser.Declaracoes_locaisContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull capirotoParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull capirotoParser.ProgramaContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(@NotNull capirotoParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(@NotNull capirotoParser.ExpressaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#op_multiplicacao}.
	 * @param ctx the parse tree
	 */
	void enterOp_multiplicacao(@NotNull capirotoParser.Op_multiplicacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#op_multiplicacao}.
	 * @param ctx the parse tree
	 */
	void exitOp_multiplicacao(@NotNull capirotoParser.Op_multiplicacaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(@NotNull capirotoParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(@NotNull capirotoParser.DeclaracoesContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#ponteiros_opcionais}.
	 * @param ctx the parse tree
	 */
	void enterPonteiros_opcionais(@NotNull capirotoParser.Ponteiros_opcionaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#ponteiros_opcionais}.
	 * @param ctx the parse tree
	 */
	void exitPonteiros_opcionais(@NotNull capirotoParser.Ponteiros_opcionaisContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(@NotNull capirotoParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(@NotNull capirotoParser.TermoContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#outros_fatores}.
	 * @param ctx the parse tree
	 */
	void enterOutros_fatores(@NotNull capirotoParser.Outros_fatoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#outros_fatores}.
	 * @param ctx the parse tree
	 */
	void exitOutros_fatores(@NotNull capirotoParser.Outros_fatoresContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(@NotNull capirotoParser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(@NotNull capirotoParser.Tipo_basico_identContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#op_opcional}.
	 * @param ctx the parse tree
	 */
	void enterOp_opcional(@NotNull capirotoParser.Op_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#op_opcional}.
	 * @param ctx the parse tree
	 */
	void exitOp_opcional(@NotNull capirotoParser.Op_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#chamada_partes}.
	 * @param ctx the parse tree
	 */
	void enterChamada_partes(@NotNull capirotoParser.Chamada_partesContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#chamada_partes}.
	 * @param ctx the parse tree
	 */
	void exitChamada_partes(@NotNull capirotoParser.Chamada_partesContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#mais_ident}.
	 * @param ctx the parse tree
	 */
	void enterMais_ident(@NotNull capirotoParser.Mais_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#mais_ident}.
	 * @param ctx the parse tree
	 */
	void exitMais_ident(@NotNull capirotoParser.Mais_identContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(@NotNull capirotoParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(@NotNull capirotoParser.CorpoContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(@NotNull capirotoParser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(@NotNull capirotoParser.Declaracao_localContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(@NotNull capirotoParser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(@NotNull capirotoParser.Exp_relacionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#senao_opcional}.
	 * @param ctx the parse tree
	 */
	void enterSenao_opcional(@NotNull capirotoParser.Senao_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#senao_opcional}.
	 * @param ctx the parse tree
	 */
	void exitSenao_opcional(@NotNull capirotoParser.Senao_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(@NotNull capirotoParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(@NotNull capirotoParser.Termo_logicoContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(@NotNull capirotoParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(@NotNull capirotoParser.DimensaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#mais_selecao}.
	 * @param ctx the parse tree
	 */
	void enterMais_selecao(@NotNull capirotoParser.Mais_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#mais_selecao}.
	 * @param ctx the parse tree
	 */
	void exitMais_selecao(@NotNull capirotoParser.Mais_selecaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(@NotNull capirotoParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(@NotNull capirotoParser.VariavelContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(@NotNull capirotoParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(@NotNull capirotoParser.CmdContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(@NotNull capirotoParser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(@NotNull capirotoParser.Declaracao_globalContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(@NotNull capirotoParser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(@NotNull capirotoParser.Parcela_nao_unarioContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(@NotNull capirotoParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(@NotNull capirotoParser.SelecaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(@NotNull capirotoParser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(@NotNull capirotoParser.Tipo_estendidoContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(@NotNull capirotoParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(@NotNull capirotoParser.ParametroContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(@NotNull capirotoParser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(@NotNull capirotoParser.Op_unarioContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#mais_parametros}.
	 * @param ctx the parse tree
	 */
	void enterMais_parametros(@NotNull capirotoParser.Mais_parametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#mais_parametros}.
	 * @param ctx the parse tree
	 */
	void exitMais_parametros(@NotNull capirotoParser.Mais_parametrosContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(@NotNull capirotoParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(@NotNull capirotoParser.ParcelaContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#op_adicao}.
	 * @param ctx the parse tree
	 */
	void enterOp_adicao(@NotNull capirotoParser.Op_adicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#op_adicao}.
	 * @param ctx the parse tree
	 */
	void exitOp_adicao(@NotNull capirotoParser.Op_adicaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#intervalo_opcional}.
	 * @param ctx the parse tree
	 */
	void enterIntervalo_opcional(@NotNull capirotoParser.Intervalo_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#intervalo_opcional}.
	 * @param ctx the parse tree
	 */
	void exitIntervalo_opcional(@NotNull capirotoParser.Intervalo_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(@NotNull capirotoParser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(@NotNull capirotoParser.Decl_local_globalContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#outros_ident}.
	 * @param ctx the parse tree
	 */
	void enterOutros_ident(@NotNull capirotoParser.Outros_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#outros_ident}.
	 * @param ctx the parse tree
	 */
	void exitOutros_ident(@NotNull capirotoParser.Outros_identContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#mais_variaveis}.
	 * @param ctx the parse tree
	 */
	void enterMais_variaveis(@NotNull capirotoParser.Mais_variaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#mais_variaveis}.
	 * @param ctx the parse tree
	 */
	void exitMais_variaveis(@NotNull capirotoParser.Mais_variaveisContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#outros_fatores_logicos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_fatores_logicos(@NotNull capirotoParser.Outros_fatores_logicosContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#outros_fatores_logicos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_fatores_logicos(@NotNull capirotoParser.Outros_fatores_logicosContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#mais_expressao}.
	 * @param ctx the parse tree
	 */
	void enterMais_expressao(@NotNull capirotoParser.Mais_expressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#mais_expressao}.
	 * @param ctx the parse tree
	 */
	void exitMais_expressao(@NotNull capirotoParser.Mais_expressaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(@NotNull capirotoParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(@NotNull capirotoParser.Valor_constanteContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(@NotNull capirotoParser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(@NotNull capirotoParser.Parcela_unarioContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#parametros_opcional}.
	 * @param ctx the parse tree
	 */
	void enterParametros_opcional(@NotNull capirotoParser.Parametros_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#parametros_opcional}.
	 * @param ctx the parse tree
	 */
	void exitParametros_opcional(@NotNull capirotoParser.Parametros_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#outros_termos_logicos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_termos_logicos(@NotNull capirotoParser.Outros_termos_logicosContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#outros_termos_logicos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_termos_logicos(@NotNull capirotoParser.Outros_termos_logicosContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(@NotNull capirotoParser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(@NotNull capirotoParser.Tipo_basicoContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(@NotNull capirotoParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(@NotNull capirotoParser.ComandosContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_termos(@NotNull capirotoParser.Outros_termosContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_termos(@NotNull capirotoParser.Outros_termosContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(@NotNull capirotoParser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(@NotNull capirotoParser.Exp_aritmeticaContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#mais_var}.
	 * @param ctx the parse tree
	 */
	void enterMais_var(@NotNull capirotoParser.Mais_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#mais_var}.
	 * @param ctx the parse tree
	 */
	void exitMais_var(@NotNull capirotoParser.Mais_varContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(@NotNull capirotoParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(@NotNull capirotoParser.RegistroContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(@NotNull capirotoParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(@NotNull capirotoParser.ConstantesContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#mais_constantes}.
	 * @param ctx the parse tree
	 */
	void enterMais_constantes(@NotNull capirotoParser.Mais_constantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#mais_constantes}.
	 * @param ctx the parse tree
	 */
	void exitMais_constantes(@NotNull capirotoParser.Mais_constantesContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#outras_parcelas}.
	 * @param ctx the parse tree
	 */
	void enterOutras_parcelas(@NotNull capirotoParser.Outras_parcelasContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#outras_parcelas}.
	 * @param ctx the parse tree
	 */
	void exitOutras_parcelas(@NotNull capirotoParser.Outras_parcelasContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(@NotNull capirotoParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(@NotNull capirotoParser.FatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(@NotNull capirotoParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(@NotNull capirotoParser.Op_relacionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#argumentos_opcional}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos_opcional(@NotNull capirotoParser.Argumentos_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#argumentos_opcional}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos_opcional(@NotNull capirotoParser.Argumentos_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#chamada_atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterChamada_atribuicao(@NotNull capirotoParser.Chamada_atribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#chamada_atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitChamada_atribuicao(@NotNull capirotoParser.Chamada_atribuicaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(@NotNull capirotoParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(@NotNull capirotoParser.IdentificadorContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(@NotNull capirotoParser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(@NotNull capirotoParser.Numero_intervaloContext ctx);

	/**
	 * Enter a parse tree produced by {@link capirotoParser#op_nao}.
	 * @param ctx the parse tree
	 */
	void enterOp_nao(@NotNull capirotoParser.Op_naoContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#op_nao}.
	 * @param ctx the parse tree
	 */
	void exitOp_nao(@NotNull capirotoParser.Op_naoContext ctx);
}