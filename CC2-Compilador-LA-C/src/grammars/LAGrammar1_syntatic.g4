grammar LAGrammar1_syntatic;


/*SYNTAX*/

/*1. Programa LA*/
programa: declaracoes ALGORITMO corpo FIM_ALGORITMO;
        

/*2. Lista de declara��es do programa*/
declaracoes:
    decl_local_global*;

/*3. Jun��o de declara��o local ou global*/
decl_local_global:
            declaracao_local | declaracao_global;         

/*4. Regra de declara��o local*/
declaracao_local:
    DECLARE variavel
    | CONSTANTE IDENT COLON tipo_basico EQUALS valor_constante  
    | TIPO IDENT COLON tipo;


/*5. Lista de variaveis com variaveis a mais do mesmo tipo opcionais*/
variavel:
    IDENT dimensao mais_var COLON tipo;

/*6. Extens�o da lista de vari�veis*/
mais_var:
    (COMMA IDENT dimensao)*;

/*7. Listagem de identificadores*/
identificador:
    ponteiros_opcionais IDENT 
    dimensao outros_ident;

/*8. Listagem de ponteiros n�o obrigat�ria*/
ponteiros_opcionais: (UP_HAT)*;

/*9.*/
outros_ident:
     /*Retorna cada nome. O ultimo � o tipo da lista de chamadas.*/
    (DOT identificador)?;

/*10. Dimens�o de listas*/
dimensao: (LBRACKET exp_aritmetica RBRACKET)*;

/*11.*/
tipo:
    registro |
    tipo_estendido;

/*12. Lista de identificadores*/
mais_ident:
    (COMMA identificador)*;

/*13. Lista de pelomenos uma vari�vel*/
mais_variaveis:  (variavel)*;

/*14. Tipos de elementos b�sicos*/
tipo_basico: (LITERAL|INTEIRO|REAL|LOGICO);

/*15. Tipo basico ou identificador*/
tipo_basico_ident:
    /*Retorna um dos tipos basicos*/
    tipo_basico |
    /*Retorna o tipo como sendo o identificador de tipo*/
    IDENT;

/*16. */
tipo_estendido:
    ponteiros_opcionais tipo_basico_ident;

/*17. Regra de valores constantes*/
valor_constante:
     (CADEIA|
     NUM_INT |
     NUM_REAL |
     VERDADEIRO |
     FALSO);

/*18. Registros - Struct*/
registro:
     REGISTRO variavel mais_variaveis FIM_REGISTRO;

/*19. Procedimentos globais*/
declaracao_global:
      PROCEDIMENTO IDENT LPARENTHESIS parametros_opcional
        RPARENTHESIS declaracoes_locais comandos FIM_PROCEDIMENTO
      
      | FUNCAO IDENT LPARENTHESIS parametros_opcional
        RPARENTHESIS COLON tipo_estendido declaracoes_locais comandos
        FIM_FUNCAO;

/*20. Parametros 0 ou mais*/
parametros_opcional: (parametro)?;

/*21.Parametro*/
parametro:
      var_opcional identificador mais_ident COLON tipo_estendido
      /*mais_parametros*/
      (COMMA var_opcional identificador mais_ident COLON tipo_estendido)*;

/*22. Declaracao de variavel opcional*/
var_opcional: VAR?;

/*23. Lista de parametros*/
/*mais_parametros:
      (COMMA parametro)?;*/

/*24. Declaracoes de escopo local*/
declaracoes_locais: (declaracao_local)*;

/*25.*/
corpo:
      declaracoes_locais comandos;

/*26. Lista de comandos*/
comandos:
      cmd*;

/*27. Comandos da linguagem*/
cmd:
       LEIA LPARENTHESIS identificador mais_ident RPARENTHESIS
       
   |   ESCREVA LPARENTHESIS expressao mais_expressao RPARENTHESIS
       
   |   SE expressao ENTAO comandos senao_opcional FIMSE
   |   CASO exp_aritmetica SEJA selecao senao_opcional FIMCASO
       
   |   PARA IDENT ARROW exp_aritmetica ATE exp_aritmetica FACA comandos FIMPARA
       
   |   ENQUANTO expressao FACA comandos FIMENQUANTO
       
   |   FACA comandos ATE expressao
       
   |   UP_HAT IDENT outros_ident dimensao ARROW expressao /*Atrib de ponteiro*/
       
   |   IDENT chamada /*Chamada de funcao regra 30b*/
       
   |   atribuicao /*Atribuicao regra 30a*/
       
   |   RETORNE expressao;
     
/*28. Repeti��o de express�o para listagem de express�es*/
mais_expressao:
    (COMMA expressao)*;

/*29. Else opcional*/
senao_opcional:
       (SENAO comandos)?;

/*30. Atribuicao ou chamada de funcao - Depreciada*/
/*chamada_atribuicao:
       LPARENTHESIS argumentos_opcional RPARENTHESIS | outros_ident dimensao ARROW expressao;*/

/*30a. Atribuicao*/
atribuicao:
           IDENT outros_ident dimensao ARROW expressao;
/*30b. Chamada de funcao*/
chamada:
       LPARENTHESIS argumentos_opcional RPARENTHESIS;

/*31. Lista de argumentos opcional com expressao*/
argumentos_opcional:
        (expressao mais_expressao)?;

/*32. */
selecao:
           constantes COLON comandos mais_selecao;

/*33.*/
mais_selecao:
                selecao?;

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

/*38. Op un�rio unico de negativo*/
op_unario:
          (MINUS)?;

/*39.*/
exp_aritmetica:
                 termo  outros_termos;

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
                 (op_adicao termo)*;

/*44.*/
fator:
         parcela outras_parcelas;

/*45.*/
outros_fatores:
                  (op_multiplicacao fator)*;

/*46.*/
parcela:
           op_unario parcela_unario
           | parcela_nao_unario;

/*47.*/
parcela_unario:
                 (NUM_INT | NUM_REAL)
                 | UP_HAT IDENT outros_ident dimensao
                 | IDENT chamada_parte
                 | IDENT chamada_metodo
                 | LPARENTHESIS expressao RPARENTHESIS;

/*48.*/
parcela_nao_unario:
                      '&' IDENT outros_ident
                      dimensao | CADEIA;

/*49. TODO: Descobrir o que o operador % faz*/
outras_parcelas:
                   ('%' parcela)*;

/*50.*/
/*chamada_partes:
                LPARENTHESIS expressao mais_expressao RPARENTHESIS |
                outros_ident dimensao | ;*/

/*50a.*/
chamada_metodo:
     (chamada)?;

/*50b.*/
chamada_parte:
                outros_ident dimensao;

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
          NOT?;

/*56.*/
termo_logico:
                fator_logico outros_fatores_logicos;

/*57.*/
outros_termos_logicos:
       (OR termo_logico)*;

/*58.*/
outros_fatores_logicos:
        (AND fator_logico)*;

/*59.*/
fator_logico: op_nao parcela_logica;

/*60.*/
parcela_logica: (VERDADEIRO| FALSO) | exp_relacional;

/*LEX*/

ALGORITMO:'algoritmo';
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
ARROW: '<-';
MINUS: '-';
PLUS: '+';
MULT: '*';
DIV: '/';
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

fragment
NameChar
   : NameStartChar
   | '0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9'
   | '_';
fragment
NameStartChar
   : [a-zA-Z];

/*String*/
CADEIA: '"' (~[\r\n"] | '""')* '"' ; 
/*Numero inteiro seq digitos 0-9*/
NUM_INT: ('0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9')+; 
/*Numero real com pelomenos um digito antes do ponto*/
NUM_REAL: ('0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9')+'.'('0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9')+; 
/*Sequencia de letras, digitos, _, come�ando por letra ou _*/
IDENT: NameStartChar NameChar*; 

COMMENT : '{' .*? '}' -> channel(HIDDEN);
WSNL : [ \r\t\n]+ -> channel(HIDDEN) ;
