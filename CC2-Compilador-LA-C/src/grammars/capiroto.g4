grammar capiroto;

/*LEX*/

/*Sequencia de letras, digitos, _, começando por letra ou _*/
IDENT: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*; 
/*String*/
CADEIA: '\"' (~('\"'|'\\'|'\n'))* '\"' ; 
/*Numero inteiro seq digitos 0-9*/
NUM_INT: ('0'..'9')+; 
/*Numero real com pelomenos um digito antes do ponto*/
NUM_REAL: ('0'..'9')+'.'('0'..'9')+; 

COMENTARIO: ('{' .*? '}') {skip();} ;
WS : ( ' '| '\n' | '\t'| '\r') {skip();} ;

ALGORITMO: 'algoritmo';
FIM_ALGORITMO: 'fim_algoritmo';
DECLARE: 'declare';
CONSTANTE: 'constante';
COLON: ':';
TIPO: 'tipo';
COMMA: ',';
UP_HAT: '^';
DOT: '.';
LBRACKET: '[';
RBRACKET: ']';
LPARENTHESIS: '(';
RPARENTHESIS: ')';
TWODOTS: '..';
MINUS: '-';
PLUS: '+';
MULT: '*';
DIV: '/';
ARROW: '<-'; 
COMMERCIAL_E: '&';
PERCENT: '%'; 

EQUALS: '=';
DIFFERENT: '<>';
GREATERTHANEQ: '>=';
LESSTHANEQ: '<=';
GREATERTHAN: '>';
LESSTHAN: '<';
NOT:'nao'; 

LITERAL: 'literal';
INTEIRO: 'inteiro';
REAL: 'real'; 
LOGICO: 'logico';
OR: 'ou';
AND: 'e';

VERDADEIRO: 'verdadeiro';
FALSO: 'falso';

REGISTRO: 'registro';
FIM_REGISTRO: 'fim_registro';
PROCEDIMENTO: 'procedimento';
FIM_PROCEDIMENTO: 'fim_procedimento';
FUNCAO: 'funcao';
FIM_FUNCAO: 'fim_funcao';
VAR: 'var';
LEIA: 'leia';
ESCREVA: 'escreva'; 
SE: 'se';
ENTAO: 'entao';
FIMSE: 'fim_se';
CASO: 'caso';
FIMCASO: 'fim_caso';
SEJA: 'seja';
PARA: 'para';
ATE: 'ate';
FACA: 'faca'; 
FIMPARA: 'fim_para'; 
ENQUANTO: 'enquanto'; 
FIMENQUANTO: 'fim_enquanto';
RETORNE: 'retorne';
SENAO: 'senao'; 

/*SYNTAX*/

/*1. Programa LA*/
programa:
        declaracoes ALGORITMO corpo FIM_ALGORITMO;

/*2. Lista de declarações do programa*/
declaracoes:
    (decl_local_global declaracoes)?;

/*3. Junção de declaração local ou global*/
decl_local_global:
            declaracao_local | declaracao_global;         

/*4. Regra de declaração local*/
declaracao_local:
    DECLARE variavel
    | CONSTANTE IDENT COLON tipo_basico EQUALS valor_constante 
    | TIPO IDENT COLON tipo_basico EQUALS valor_constante
    | TIPO IDENT COLON tipo;

/*5. Lista de variaveis com variaveis a mais do mesmo tipo opcionais*/
variavel:
    IDENT dimensao mais_var COLON tipo;

/*6. Extensão da lista de variáveis*/
mais_var:
    (COMMA IDENT dimensao mais_var)?;

/*7. Listagem de identificadores*/
identificador:
    ponteiros_opcionais IDENT dimensao outros_ident;

/*8. Listagem de ponteiros não obrigatória*/
ponteiros_opcionais:
    (UP_HAT ponteiros_opcionais)?;

/*9.*/
outros_ident:
    (DOT identificador)?;

/*10. Dimensão de listas*/
dimensao: (LBRACKET exp_aritmetica RBRACKET dimensao)?;

/*11.*/
tipo:
    registro | tipo_estendido;

/*12. Lista de identificadores*/
mais_ident:
    (COMMA identificador mais_ident)?;

/*13. Lista de pelomenos uma variável*/
mais_variaveis:
    (variavel mais_variaveis)?;

/*14. Tipos de elementos básicos*/
tipo_basico:
    LITERAL| INTEIRO | REAL | LOGICO;

/*15. Tipo basico ou identificador*/
tipo_basico_ident:
    tipo_basico | IDENT;

/*16. */
/*tipo_estendido:
    ponteiro_opcional tipo_basico_ident;*/
tipo_estendido:
    ponteiros_opcionais tipo_basico_ident;

/*17. Regra de valores constantes*/
valor_constante:
     CADEIA | NUM_INT | NUM_REAL | VERDADEIRO | FALSO;

/*18. Registros - Struct*/
registro:
     REGISTRO variavel mais_variaveis FIM_REGISTRO;

/*19. Procedimentos globais*/
declaracao_global:
      PROCEDIMENTO IDENT LPARENTHESIS parametros_opcional RPARENTHESIS declaracoes_locais comandos FIM_PROCEDIMENTO
      | FUNCAO IDENT LPARENTHESIS parametros_opcional RPARENTHESIS COLON tipo_estendido declaracoes_locais comandos FIM_FUNCAO;

/*20. Parametros 0 ou mais*/
parametros_opcional:
      (parametro)?;

/*21.Parametro*/
parametro:
      var_opcional identificador mais_ident COLON tipo_estendido mais_parametros;

/*22. Declaracao de variavel opcional*/
var_opcional:
      (VAR)?;

/*23. Lista de parametros*/
mais_parametros:
      (COMMA parametro)?;

/*24. Declaracoes de escopo local*/
declaracoes_locais:
      (declaracao_local declaracoes_locais)?;

/*25.*/
corpo:
      declaracoes_locais comandos;

/*26. Lista de comandos*/
comandos:
      (cmd comandos)?;

/*27. Comandos da linguagem*/
cmd:
       LEIA LPARENTHESIS identificador mais_ident RPARENTHESIS |
       ESCREVA LPARENTHESIS expressao mais_expressao RPARENTHESIS |
       SE expressao ENTAO comandos senao_opcional FIMSE |
       CASO exp_aritmetica SEJA selecao senao_opcional FIMCASO |
       PARA IDENT ARROW exp_aritmetica ATE exp_aritmetica FACA comandos FIMPARA |
       ENQUANTO expressao FACA comandos FIMENQUANTO |
       FACA comandos ATE expressao |
       UP_HAT IDENT outros_ident dimensao ARROW expressao |
       IDENT chamada_atribuicao |
       RETORNE expressao;
     
/*28. Repetição de expressão para listagem de expressões*/
mais_expressao:
    (COMMA expressao mais_expressao)?;

/*29. Else opcional*/
senao_opcional:
       (SENAO comandos)?;

/*30. Atribuicao*/
chamada_atribuicao:
       LPARENTHESIS argumentos_opcional RPARENTHESIS outros_ident dimensao ARROW expressao;

/*31. Lista de argumentos opcional com expressao*/
argumentos_opcional:
        (expressao mais_expressao)?;

/*32. */
selecao:
           constantes COLON comandos mais_selecao;

/*33.*/
mais_selecao:
                (selecao)?;

/*34. Lista de constantes*/
constantes:
              numero_intervalo mais_constantes;

/*35. */
mais_constantes:
                   (COMMA constantes)?;

/*36.*/
numero_intervalo:
                    op_unario NUM_INT intervalo_opcional;

/*37.*/
intervalo_opcional:
                      (TWODOTS op_unario NUM_INT)?;

/*38. Op unário unico de negativo*/
op_unario:
             (MINUS)?;

/*39.*/
exp_aritmetica:
                  termo outros_termos;

/*40.*/
op_multiplicacao:
                    MULT | DIV;

/*41.*/
op_adicao:
             PLUS | MINUS;

/*42.*/
termo:
         fator outros_fatores;

/*43.*/
outros_termos:
                 (op_adicao termo outros_termos)?;

/*44.*/
fator:
         parcela outras_parcelas;

/*45.*/
outros_fatores:
                  (op_multiplicacao fator outros_fatores)?;

/*46.*/
parcela:
           op_unario parcela_unario | parcela_nao_unario;

/*47.*/
parcela_unario:
                  UP_HAT IDENT outros_ident dimensao | IDENT chamada_partes
              | (NUM_INT | NUM_REAL) | LPARENTHESIS expressao RPARENTHESIS;

/*48.*/
parcela_nao_unario:
                      '&' IDENT outros_ident dimensao | CADEIA;

/*49.*/
outras_parcelas:
                   ('%' parcela outras_parcelas)?;

/*50.*/
chamada_partes:
                 LPARENTHESIS expressao mais_expressao RPARENTHESIS |
                  outros_ident dimensao | /*epsilon*/;

/*51.*/
exp_relacional:
                  exp_aritmetica op_opcional;

/*52.*/
op_opcional:
                 (op_relacional exp_aritmetica)?;

/*53. Operadores relacionais*/
op_relacional:
                 EQUALS | '<>' | '>=' | '<=' | '>' | '<';

/*54.*/
expressao:
             termo_logico outros_termos_logicos;

/*55.*/
op_nao:
          ('nao')?;

/*56.*/
termo_logico:
                fator_logico outros_fatores_logicos;

/*57.*/
outros_termos_logicos:
                         ('ou' termo_logico outros_termos_logicos)?;

/*58.*/
outros_fatores_logicos:
                          ('e' fator_logico outros_fatores_logicos)?;

/*59.*/
fator_logico:
                op_nao parcela_logica;

/*60.*/
parcela_logica:
                  (VERDADEIRO | FALSO) | exp_relacional;