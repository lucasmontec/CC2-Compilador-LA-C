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