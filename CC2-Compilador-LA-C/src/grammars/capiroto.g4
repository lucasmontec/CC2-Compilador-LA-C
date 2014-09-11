/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar capiroto;

helloworld:
              'helloworld';

programa:
        declaracoes 'algoritmo' corpo fim_algoritmo;

declaracoes:
    decl_local_global declaracoes;

declaracao_local:
    'declare' variavel | 'constante' IDENT: tipo_basico '=' valor_constante | 
     'tipo' IDENT : tipo_basico '=' valor_constante | 'tipo' IDENT ':' tipo;

variavel:
    IDENT dimensao mais_var ':' tipo;

mais_var:
    ',' IDENT dimensao mais_var;

identificador:
    ponteiros_opcionais IDENT dimensao outros_ident;

ponteiros_opcionais:
    ^ ponteiros_opcionais;

outros_ident:
    . identificador;

dimensao: '[' exp_aritmetica ']' dimensao;

tipo:
    registro | tipo_estendido;

mais_ident:
    ',' identificador mais_ident;

mais_variaveis:
    variavel mais_variaveis;

tipo_basico:
    'literal'| 'inteiro' | 'real' | 'logico';

tipo_basico_ident:
    tipo_basico | IDENT;

tipo_estendido:
    ponteiro_opcional tipo_basico_ident;

valor_constante:
     CADEIA | NUM_INT | NUM_REAL | 'verdadeiro' | 'falso';

registro:
     'registro' variavel mais_variaveis 'fim_registro';

declaracao_global:
      'procedimento' IDENT '('parametros_opcional')' declaracoes_locais comandos 'fim_procedimento';
      
parametros_opcional:
      parametro;

parametro:
      var_opcional identificador mais_ident ':' tipo_estendido mais_parametros;

var_opcional:
      'var';

mais_parametros:
      ',' parametro;

declaracoes_locais:
      declaracao_local declaracoes_locais;

corpo:
      declaracoes_locais comandos;

comandos:
      cmd comandos;

cmd:
       'leia' '('identificador mais_ident')' |
       'escreva' '('expressao mais_expressao')' |
       'se' expressao 'entao' comandos senao_opcional 'fim_se' |
       'caso' exp_aritmetica 'seja' selecao senao_opcional 'fim_caso' |
       'para' IDENT '<' exp_aritmetica 'ate' exp_aritmetica 'faca' comandos 'fim_para' |
       'enquanto' expressao 'faca' comandos 'fim_enquanto' |
       'faca' comandos 'ate' expressao |
       '^' IDENT outros_ident dimensao '<-' expressao |
       IDENT chamada_atribuicao |
       'retorne' expressao;
           
mais_expressao:
       ',' expressao mais_expressao;

senao_opcional:
       'senao' comandos;

chamada_atribuicao:
       '('argumentos_opcional')' outros_ident dimensao '<-' expressao;

argumentos_opcional:
        expressao mais_expressao;

selecao:
           constantes ':' comandos mais_selecao;

mais_selecao:
                (selecao)?;

constantes:
              numero_intervalo mais_constantes;

mais_constantes:
                   (',' constantes)?;

numero_intervalo:
                    op_unario NUM_INT intervalo_opcional;

intervalo_opcional:
                      ('..' op_unario NUM_INT)?;

op_unario:
             ('-')?;

exp_aritmetica:
                  termo outros_termos;

op_multiplicacao:
                    '*' | '/';

op_adicao:
             '+' | '-';

termo:
         fator outros_fatores;