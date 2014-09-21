// Generated from C:\Users\Lucas\git\CC2-Compilador-LA-C\CC2-Compilador-LA-C\src\grammars\LAGrammar1_CodeGen.g4 by ANTLR 4.1
package antlr;

  import Semantic.TokenSymbol;
  import Semantic.TokenSymbolTable;
  import static Semantic.SemanticUtil.*;
  import CodeGeneration.Generator;
  import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LAGrammar1_CodeGenParser}.
 */
public interface LAGrammar1_CodeGenListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(@NotNull LAGrammar1_CodeGenParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(@NotNull LAGrammar1_CodeGenParser.TipoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#var_opcional}.
	 * @param ctx the parse tree
	 */
	void enterVar_opcional(@NotNull LAGrammar1_CodeGenParser.Var_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#var_opcional}.
	 * @param ctx the parse tree
	 */
	void exitVar_opcional(@NotNull LAGrammar1_CodeGenParser.Var_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(@NotNull LAGrammar1_CodeGenParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(@NotNull LAGrammar1_CodeGenParser.Fator_logicoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(@NotNull LAGrammar1_CodeGenParser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(@NotNull LAGrammar1_CodeGenParser.Parcela_logicaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#declaracoes_locais}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes_locais(@NotNull LAGrammar1_CodeGenParser.Declaracoes_locaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#declaracoes_locais}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes_locais(@NotNull LAGrammar1_CodeGenParser.Declaracoes_locaisContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull LAGrammar1_CodeGenParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull LAGrammar1_CodeGenParser.ProgramaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(@NotNull LAGrammar1_CodeGenParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(@NotNull LAGrammar1_CodeGenParser.ExpressaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#op_multiplicacao}.
	 * @param ctx the parse tree
	 */
	void enterOp_multiplicacao(@NotNull LAGrammar1_CodeGenParser.Op_multiplicacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#op_multiplicacao}.
	 * @param ctx the parse tree
	 */
	void exitOp_multiplicacao(@NotNull LAGrammar1_CodeGenParser.Op_multiplicacaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(@NotNull LAGrammar1_CodeGenParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(@NotNull LAGrammar1_CodeGenParser.DeclaracoesContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#ponteiros_opcionais}.
	 * @param ctx the parse tree
	 */
	void enterPonteiros_opcionais(@NotNull LAGrammar1_CodeGenParser.Ponteiros_opcionaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#ponteiros_opcionais}.
	 * @param ctx the parse tree
	 */
	void exitPonteiros_opcionais(@NotNull LAGrammar1_CodeGenParser.Ponteiros_opcionaisContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(@NotNull LAGrammar1_CodeGenParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(@NotNull LAGrammar1_CodeGenParser.TermoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#outros_fatores}.
	 * @param ctx the parse tree
	 */
	void enterOutros_fatores(@NotNull LAGrammar1_CodeGenParser.Outros_fatoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#outros_fatores}.
	 * @param ctx the parse tree
	 */
	void exitOutros_fatores(@NotNull LAGrammar1_CodeGenParser.Outros_fatoresContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(@NotNull LAGrammar1_CodeGenParser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(@NotNull LAGrammar1_CodeGenParser.Tipo_basico_identContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#op_opcional}.
	 * @param ctx the parse tree
	 */
	void enterOp_opcional(@NotNull LAGrammar1_CodeGenParser.Op_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#op_opcional}.
	 * @param ctx the parse tree
	 */
	void exitOp_opcional(@NotNull LAGrammar1_CodeGenParser.Op_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#chamada_parte}.
	 * @param ctx the parse tree
	 */
	void enterChamada_parte(@NotNull LAGrammar1_CodeGenParser.Chamada_parteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#chamada_parte}.
	 * @param ctx the parse tree
	 */
	void exitChamada_parte(@NotNull LAGrammar1_CodeGenParser.Chamada_parteContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#mais_ident}.
	 * @param ctx the parse tree
	 */
	void enterMais_ident(@NotNull LAGrammar1_CodeGenParser.Mais_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#mais_ident}.
	 * @param ctx the parse tree
	 */
	void exitMais_ident(@NotNull LAGrammar1_CodeGenParser.Mais_identContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(@NotNull LAGrammar1_CodeGenParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(@NotNull LAGrammar1_CodeGenParser.CorpoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(@NotNull LAGrammar1_CodeGenParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(@NotNull LAGrammar1_CodeGenParser.AtribuicaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(@NotNull LAGrammar1_CodeGenParser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(@NotNull LAGrammar1_CodeGenParser.Declaracao_localContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#chamada}.
	 * @param ctx the parse tree
	 */
	void enterChamada(@NotNull LAGrammar1_CodeGenParser.ChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#chamada}.
	 * @param ctx the parse tree
	 */
	void exitChamada(@NotNull LAGrammar1_CodeGenParser.ChamadaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(@NotNull LAGrammar1_CodeGenParser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(@NotNull LAGrammar1_CodeGenParser.Exp_relacionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#senao_opcional}.
	 * @param ctx the parse tree
	 */
	void enterSenao_opcional(@NotNull LAGrammar1_CodeGenParser.Senao_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#senao_opcional}.
	 * @param ctx the parse tree
	 */
	void exitSenao_opcional(@NotNull LAGrammar1_CodeGenParser.Senao_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(@NotNull LAGrammar1_CodeGenParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(@NotNull LAGrammar1_CodeGenParser.Termo_logicoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(@NotNull LAGrammar1_CodeGenParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(@NotNull LAGrammar1_CodeGenParser.DimensaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(@NotNull LAGrammar1_CodeGenParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(@NotNull LAGrammar1_CodeGenParser.VariavelContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(@NotNull LAGrammar1_CodeGenParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(@NotNull LAGrammar1_CodeGenParser.CmdContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(@NotNull LAGrammar1_CodeGenParser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(@NotNull LAGrammar1_CodeGenParser.Declaracao_globalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(@NotNull LAGrammar1_CodeGenParser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(@NotNull LAGrammar1_CodeGenParser.Parcela_nao_unarioContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(@NotNull LAGrammar1_CodeGenParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(@NotNull LAGrammar1_CodeGenParser.SelecaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(@NotNull LAGrammar1_CodeGenParser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(@NotNull LAGrammar1_CodeGenParser.Tipo_estendidoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(@NotNull LAGrammar1_CodeGenParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(@NotNull LAGrammar1_CodeGenParser.ParametroContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(@NotNull LAGrammar1_CodeGenParser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(@NotNull LAGrammar1_CodeGenParser.Op_unarioContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(@NotNull LAGrammar1_CodeGenParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(@NotNull LAGrammar1_CodeGenParser.ParcelaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#op_adicao}.
	 * @param ctx the parse tree
	 */
	void enterOp_adicao(@NotNull LAGrammar1_CodeGenParser.Op_adicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#op_adicao}.
	 * @param ctx the parse tree
	 */
	void exitOp_adicao(@NotNull LAGrammar1_CodeGenParser.Op_adicaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#intervalo_opcional}.
	 * @param ctx the parse tree
	 */
	void enterIntervalo_opcional(@NotNull LAGrammar1_CodeGenParser.Intervalo_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#intervalo_opcional}.
	 * @param ctx the parse tree
	 */
	void exitIntervalo_opcional(@NotNull LAGrammar1_CodeGenParser.Intervalo_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(@NotNull LAGrammar1_CodeGenParser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(@NotNull LAGrammar1_CodeGenParser.Decl_local_globalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#outros_ident}.
	 * @param ctx the parse tree
	 */
	void enterOutros_ident(@NotNull LAGrammar1_CodeGenParser.Outros_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#outros_ident}.
	 * @param ctx the parse tree
	 */
	void exitOutros_ident(@NotNull LAGrammar1_CodeGenParser.Outros_identContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#mais_variaveis}.
	 * @param ctx the parse tree
	 */
	void enterMais_variaveis(@NotNull LAGrammar1_CodeGenParser.Mais_variaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#mais_variaveis}.
	 * @param ctx the parse tree
	 */
	void exitMais_variaveis(@NotNull LAGrammar1_CodeGenParser.Mais_variaveisContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#outros_fatores_logicos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_fatores_logicos(@NotNull LAGrammar1_CodeGenParser.Outros_fatores_logicosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#outros_fatores_logicos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_fatores_logicos(@NotNull LAGrammar1_CodeGenParser.Outros_fatores_logicosContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#mais_expressao}.
	 * @param ctx the parse tree
	 */
	void enterMais_expressao(@NotNull LAGrammar1_CodeGenParser.Mais_expressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#mais_expressao}.
	 * @param ctx the parse tree
	 */
	void exitMais_expressao(@NotNull LAGrammar1_CodeGenParser.Mais_expressaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(@NotNull LAGrammar1_CodeGenParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(@NotNull LAGrammar1_CodeGenParser.Valor_constanteContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(@NotNull LAGrammar1_CodeGenParser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(@NotNull LAGrammar1_CodeGenParser.Parcela_unarioContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#parametros_opcional}.
	 * @param ctx the parse tree
	 */
	void enterParametros_opcional(@NotNull LAGrammar1_CodeGenParser.Parametros_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#parametros_opcional}.
	 * @param ctx the parse tree
	 */
	void exitParametros_opcional(@NotNull LAGrammar1_CodeGenParser.Parametros_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#outros_termos_logicos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_termos_logicos(@NotNull LAGrammar1_CodeGenParser.Outros_termos_logicosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#outros_termos_logicos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_termos_logicos(@NotNull LAGrammar1_CodeGenParser.Outros_termos_logicosContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(@NotNull LAGrammar1_CodeGenParser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(@NotNull LAGrammar1_CodeGenParser.Tipo_basicoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(@NotNull LAGrammar1_CodeGenParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(@NotNull LAGrammar1_CodeGenParser.ComandosContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_termos(@NotNull LAGrammar1_CodeGenParser.Outros_termosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_termos(@NotNull LAGrammar1_CodeGenParser.Outros_termosContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(@NotNull LAGrammar1_CodeGenParser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(@NotNull LAGrammar1_CodeGenParser.Exp_aritmeticaContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#mais_var}.
	 * @param ctx the parse tree
	 */
	void enterMais_var(@NotNull LAGrammar1_CodeGenParser.Mais_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#mais_var}.
	 * @param ctx the parse tree
	 */
	void exitMais_var(@NotNull LAGrammar1_CodeGenParser.Mais_varContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(@NotNull LAGrammar1_CodeGenParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(@NotNull LAGrammar1_CodeGenParser.RegistroContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(@NotNull LAGrammar1_CodeGenParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(@NotNull LAGrammar1_CodeGenParser.ConstantesContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#mais_constantes}.
	 * @param ctx the parse tree
	 */
	void enterMais_constantes(@NotNull LAGrammar1_CodeGenParser.Mais_constantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#mais_constantes}.
	 * @param ctx the parse tree
	 */
	void exitMais_constantes(@NotNull LAGrammar1_CodeGenParser.Mais_constantesContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#outras_parcelas}.
	 * @param ctx the parse tree
	 */
	void enterOutras_parcelas(@NotNull LAGrammar1_CodeGenParser.Outras_parcelasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#outras_parcelas}.
	 * @param ctx the parse tree
	 */
	void exitOutras_parcelas(@NotNull LAGrammar1_CodeGenParser.Outras_parcelasContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#chamada_metodo}.
	 * @param ctx the parse tree
	 */
	void enterChamada_metodo(@NotNull LAGrammar1_CodeGenParser.Chamada_metodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#chamada_metodo}.
	 * @param ctx the parse tree
	 */
	void exitChamada_metodo(@NotNull LAGrammar1_CodeGenParser.Chamada_metodoContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(@NotNull LAGrammar1_CodeGenParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(@NotNull LAGrammar1_CodeGenParser.FatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(@NotNull LAGrammar1_CodeGenParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(@NotNull LAGrammar1_CodeGenParser.Op_relacionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#argumentos_opcional}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos_opcional(@NotNull LAGrammar1_CodeGenParser.Argumentos_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#argumentos_opcional}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos_opcional(@NotNull LAGrammar1_CodeGenParser.Argumentos_opcionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(@NotNull LAGrammar1_CodeGenParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(@NotNull LAGrammar1_CodeGenParser.IdentificadorContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(@NotNull LAGrammar1_CodeGenParser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(@NotNull LAGrammar1_CodeGenParser.Numero_intervaloContext ctx);

	/**
	 * Enter a parse tree produced by {@link LAGrammar1_CodeGenParser#op_nao}.
	 * @param ctx the parse tree
	 */
	void enterOp_nao(@NotNull LAGrammar1_CodeGenParser.Op_naoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAGrammar1_CodeGenParser#op_nao}.
	 * @param ctx the parse tree
	 */
	void exitOp_nao(@NotNull LAGrammar1_CodeGenParser.Op_naoContext ctx);
}