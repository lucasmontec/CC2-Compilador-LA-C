grammar LAGrammar1;

/*Code*/
@header {
  import Semantic.TokenSymbol;
  import Semantic.TokenSymbolTable;
  import static Semantic.SemanticUtil.*;
}

/*SYNTAX*/

/*1. Programa LA*/
programa:
            { push(new TokenSymbolTable("decl_globais")); }
        declaracoes ALGORITMO corpo
            { printSemanticTable(); }
            FIM_ALGORITMO
            {
             if(hasErrors())
                printErrors();
             pop();/*Decl globais*/
             }
        ;
        

/*2. Lista de declarações do programa*/
declaracoes:
    decl_local_global*;

/*3. Junção de declaração local ou global*/
decl_local_global:
            declaracao_local | declaracao_global;         

/*4. Regra de declaração local*/
declaracao_local:
    DECLARE variavel
    {
     top().addTokens($variavel.names,$variavel.t);
    }
    | CONSTANTE IDENT COLON tipo_basico EQUALS valor_constante 
    | TIPO IDENT COLON tipo_basico EQUALS valor_constante
    | TIPO IDENT COLON tipo;

/*5. Lista de variaveis com variaveis a mais do mesmo tipo opcionais*/
variavel
    returns [ List<String> names, String t ]
    @init{ $names = new ArrayList<>(); $t = ""; }
    :
    IDENT dimensao mais_var COLON tipo
            {
             $t = $tipo.val;
             $names.add($IDENT.text);
             $names.addAll($mais_var.nomes);
             } /*adicionar tipo*/
        ;

/*6. Extensão da lista de variáveis*/
mais_var returns [ List<String> nomes ]
    @init { $nomes = new ArrayList<String>(); }
    :
    (COMMA IDENT { $nomes.add($IDENT.text); } dimensao)*;

/*7. Listagem de identificadores*/
identificador
    returns [ String nome ]
    @init{ $nome = ""; }
    :
    ponteiros_opcionais IDENT 
    { $nome = $ponteiros_opcionais.val + $IDENT.text; } 
    dimensao outros_ident;

/*8. Listagem de ponteiros não obrigatória*/
ponteiros_opcionais
    returns [ String val ]
    @init{ $val = ""; }
    : (UP_HAT { $val += $UP_HAT.text; } )*;

/*9.*/
outros_ident
    /*Last name é o nome do ultimo identificador*/
    returns [ String lastName ]
    @init{ $lastName = ""; }
    :
     /*Retorna cada nome. O ultimo é o tipo da lista de chamadas.*/
    (DOT identificador { $lastName=$identificador.nome; })?;

/*10. Dimensão de listas*/
dimensao: (LBRACKET exp_aritmetica RBRACKET)*;

/*11.*/
tipo
    returns [ String val ]
    @init{ $val = ""; }
    :
    registro {
              $val=$registro.val;
              /*match de string da definicao de registro*/
              } |
    tipo_estendido { $val=$tipo_estendido.val; };

/*12. Lista de identificadores*/
mais_ident:
    (COMMA identificador)*;

/*13. Lista de pelomenos uma variável*/
mais_variaveis
    returns [ List<String> tipos ]
    @init{ $tipos = new ArrayList<>(); }
    :
    (variavel {$tipos.add($variavel.t);} )*;

/*14. Tipos de elementos básicos*/
tipo_basico
    returns [ String val ]
    @init{ $val = ""; }
    :
    /*Retorna o token como texto para ser o tipo*/
    LITERAL{ $val=$LITERAL.text; }|
    INTEIRO{ $val=$INTEIRO.text; } |
    REAL{ $val=$REAL.text; } |
    LOGICO{ $val=$LOGICO.text; };

/*15. Tipo basico ou identificador*/
tipo_basico_ident
    returns [ String val ]
    @init{ $val = ""; }
    :
    /*Retorna um dos tipos basicos*/
    tipo_basico { $val=$tipo_basico.val; } |
    /*Retorna o tipo como sendo o identificador de tipo*/
    IDENT { $val=$IDENT.text; };

/*16. */
tipo_estendido
    returns [ String val ]
    @init{ $val = ""; }
    :
    ponteiros_opcionais tipo_basico_ident
    { $val= $ponteiros_opcionais.val + $tipo_basico_ident.val; };

/*17. Regra de valores constantes*/
valor_constante:
     CADEIA | NUM_INT | NUM_REAL | VERDADEIRO | FALSO;

/*18. Registros - Struct*/
registro
    returns [ String val ]
    @init{ $val = "reg"; }
    :
     REGISTRO variavel { $val += "["+$variavel.t; } 
     mais_variaveis { 
                     for(String s : $mais_variaveis.tipos){
                        $val += ","+s;                                    
                     }
                    }
     FIM_REGISTRO
     { $val += "]"; }
    ;

/*19. Procedimentos globais*/
declaracao_global:
      PROCEDIMENTO IDENT 
        { push(new TokenSymbolTable("PROC")); }
        LPARENTHESIS parametros_opcional RPARENTHESIS declaracoes_locais comandos FIM_PROCEDIMENTO
        { pop(); top().addToken($IDENT.text, "PROC"); }
      
      | FUNCAO IDENT
        { push(new TokenSymbolTable("FUNC")); }
        LPARENTHESIS parametros_opcional RPARENTHESIS COLON tipo_estendido declaracoes_locais comandos FIM_FUNCAO
        { pop(); top().addToken($IDENT.text, "FUNC"); }           
      ;

/*20. Parametros 0 ou mais*/
parametros_opcional: parametro?;

/*21.Parametro*/
parametro:
      var_opcional identificador mais_ident COLON tipo_estendido mais_parametros;

/*22. Declaracao de variavel opcional*/
var_opcional: VAR?;

/*23. Lista de parametros*/
mais_parametros:
      (COMMA parametro)?;

/*24. Declaracoes de escopo local*/
declaracoes_locais: declaracao_local*;

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
       
   |   PARA IDENT /*TODO precisa checar se esta declarado*/
       ARROW exp_aritmetica ATE exp_aritmetica FACA comandos FIMPARA
       
   |   ENQUANTO expressao FACA comandos FIMENQUANTO
   |   FACA comandos ATE expressao
       
   |   UP_HAT IDENT outros_ident dimensao ARROW expressao /*Atrib de ponteiro*/
       /*Verifica se o token esta declarado e se os tipos batem*/
       {
        if(!isTokenPresent($IDENT.text))
            error("Ponteiro nao declarado: "+$IDENT.text,$IDENT.getLine());
       }
   |   IDENT chamada_atribuicao
       /*Verifica se o token esta declarado e se os tipos batem*/
       {
        if(!isTokenPresent($IDENT.text))
            error("Variavel nao declarada: "+$IDENT.text,$IDENT.getLine());
       }
       
   |   RETORNE expressao
       { if(!top().getScope().equals("FUNC"))
            error("retorne em local inadequado.",$RETORNE.getLine());
       }
   ;
     
/*28. Repetição de expressão para listagem de expressões*/
mais_expressao:
    (COMMA expressao)*;

/*29. Else opcional*/
senao_opcional:
       (SENAO comandos)?;

/*30. Atribuicao*/
chamada_atribuicao:
       LPARENTHESIS argumentos_opcional RPARENTHESIS | outros_ident dimensao ARROW expressao;

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

/*38. Op unário unico de negativo*/
op_unario:
             MINUS?;

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
                 (op_adicao termo)*;

/*44.*/
fator:
         parcela outras_parcelas;

/*45.*/
outros_fatores:
                  (op_multiplicacao fator)*;

/*46.*/
parcela:
           op_unario parcela_unario | parcela_nao_unario;

/*47.*/
parcela_unario:
                 (NUM_INT | NUM_REAL)
                 | UP_HAT IDENT outros_ident dimensao
                 | IDENT chamada_partes
                 | LPARENTHESIS expressao RPARENTHESIS;

/*48.*/
parcela_nao_unario:
                      '&' IDENT outros_ident dimensao | CADEIA;

/*49.*/
outras_parcelas:
                   ('%' parcela)*;

/*50. TODO: add epsilon*/
chamada_partes:
                 LPARENTHESIS expressao mais_expressao RPARENTHESIS
                 | outros_ident dimensao;

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
                         ('ou' termo_logico)*;

/*58.*/
outros_fatores_logicos:
                          ('e' fator_logico)*;

/*59.*/
fator_logico: op_nao parcela_logica;

/*60.*/
parcela_logica: (VERDADEIRO | FALSO) | exp_relacional;

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
NUM_INT: ['0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9']+; 
/*Numero real com pelomenos um digito antes do ponto*/
NUM_REAL: ['0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9']+'.'['0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9']+; 
/*Sequencia de letras, digitos, _, começando por letra ou _*/
IDENT: NameStartChar NameChar*; 

COMMENT : '{' .*? '}' -> channel(HIDDEN);
WSNL : [ \r\t\n]+ -> channel(HIDDEN) ;
