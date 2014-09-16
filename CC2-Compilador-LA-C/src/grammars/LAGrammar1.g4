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
        

/*2. Lista de declara��es do programa*/
declaracoes:
    decl_local_global*;

/*3. Jun��o de declara��o local ou global*/
decl_local_global:
            declaracao_local | declaracao_global;         

/*4. Regra de declara��o local*/
declaracao_local:
    DECLARE variavel
    {
        if($variavel.t.trim().replace("^","").equals("literal") 
        || $variavel.t.trim().replace("^","").equals("inteiro") 
        || $variavel.t.trim().replace("^","").equals("real") 
        || $variavel.t.trim().replace("^","").equals("logico") ){
               /*Check each token names to see if it was already declared */
               for (String s : $variavel.names){
               if(top().isTokenPresent(s))
                   error("Identificador ja declarado: "+s, $DECLARE.getLine());
                 else
                   top().addToken(s, $variavel.t);
               }
        }else if(isTokenPresent($variavel.t)){ /*verificar se eh do tipo custom*/
           /*Check each token names to see if it was already declared */
           for (String s : $variavel.names){
               if(top().isTokenPresent(s))
                   error("Identificador ja declarado: "+s, $DECLARE.getLine());
                 else
                   top().addToken(s, $variavel.t);
           }  
        }else{
           error("Undeclared variable type: "+$variavel.t, $DECLARE.getLine()); 
        }
    }
    | CONSTANTE IDENT COLON tipo_basico EQUALS valor_constante 
     {
      if(!$tipo_basico.val.equals($valor_constante.val)){
         error("Atribuicao invalida: "+$IDENT.text+
         " tipo "+$tipo_basico.val+" com "+$valor_constante.val,
         $IDENT.getLine());  
      }
      if(top().isTokenPresent($IDENT.text))
        error("Constante ja declarada: "+$IDENT.text, $IDENT.getLine());
      else
        top().addToken($IDENT.text, $tipo_basico.val);
     }      
    | TIPO IDENT COLON tipo
     {
      if(top().isTokenPresent($IDENT.text))
        error("Tipo ja declarado: "+$IDENT.text, $IDENT.getLine());
      else
        top().addToken($IDENT.text, $tipo.val);
     };


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
         };

/*6. Extens�o da lista de vari�veis*/
mais_var returns [ List<String> nomes ]
    @init { $nomes = new ArrayList<String>(); }
    :
    (COMMA IDENT { 
                  if(!isTokenPresent($IDENT.text)){
                      $nomes.add($IDENT.text);
                  }else{
                      error("Identificador ja declarado: "+
                      $IDENT.text,$IDENT.getLine());
                  }
                }
     dimensao)*;

/*7. Listagem de identificadores*/
identificador
    returns [ String nome ]
    @init{ $nome = ""; }
    :
    ponteiros_opcionais IDENT 
    { $nome = $ponteiros_opcionais.val + $IDENT.text; } 
    dimensao outros_ident;

/*8. Listagem de ponteiros n�o obrigat�ria*/
ponteiros_opcionais
    returns [ String val ]
    @init{ $val = ""; }
    : (UP_HAT { $val += $UP_HAT.text; } )*;

/*9.*/
outros_ident
    /*Last name � o nome do ultimo identificador*/
    returns [ String lastName ]
    @init{ $lastName = ""; }
    :
     /*Retorna cada nome. O ultimo � o tipo da lista de chamadas.*/
    (DOT identificador { $lastName=$identificador.nome; })?;

/*10. Dimens�o de listas*/
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

/*13. Lista de pelomenos uma vari�vel*/
mais_variaveis
    returns [ List<String> tipos ]
    @init{ $tipos = new ArrayList<>(); }
    :
    (variavel {$tipos.add($variavel.t);} )*;

/*14. Tipos de elementos b�sicos*/
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
valor_constante
    returns [ String val ]
    @init{ $val = ""; }
    :
     CADEIA { $val = "literal"; } |
     NUM_INT { $val = "inteiro"; } |
     NUM_REAL { $val = "real"; } |
     VERDADEIRO { $val = "logico"; } |
     FALSO { $val = "logico"; };

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
     {
      $val += "]";
      /*Registra o tipo pra in-line*/
      top().addToken($val,$val);
      }
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
       
   |   PARA IDENT
       /*Verifica se o token esta declarado*/
       {
        if(!isTokenPresent($IDENT.text))
            error("Contador de loop nao declarado: "+$IDENT.text,$IDENT.getLine());
       }
       ARROW exp_aritmetica ATE exp_aritmetica FACA comandos FIMPARA
       
   |   ENQUANTO expressao FACA comandos FIMENQUANTO
   |   FACA comandos ATE expressao
       
   |   UP_HAT IDENT outros_ident dimensao ARROW expressao /*Atrib de ponteiro*/
       /*Verifica se o token esta declarado*/
       {
        if(!isTokenPresent($IDENT.text))
            error("Ponteiro nao declarado: "+$IDENT.text,$IDENT.getLine());
       }
   |   IDENT chamada /*Chamada de funcao regra 30b*/
       /*Verifica se o token esta declarado e se os tipos batem*/
       {
        if(!isTokenPresent($IDENT.text))
            error("Identificador nao declarado: "+$IDENT.text,$IDENT.getLine());
       }
       
   |   atribuicao /*Atribuicao regra 30a*/
       
   |   RETORNE expressao/*LUCCAS*/
       {    boolean erro = true;
            for(TokenSymbolTable currentTable : allTables()){
              if(currentTable.getScope().equals("FUNC"))
                erro = false;
            }
            if(erro){
              error("Retorne em local inadequado", $RETORNE.getLine());       
            }
       }/*FIM-LUCCAS*/
   ;
     
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
           IDENT outros_ident dimensao ARROW expressao
           {
                if(!isTokenPresent($IDENT.text)){
                    error("Variavel nao declarada: "+$IDENT.text,$IDENT.getLine());
                }else{
                    String correctToken = $IDENT.text;
                    
                    if($outros_ident.lastName.length() > 0)
                        correctToken = $outros_ident.lastName;
                    
                    if(!tokenType(correctToken).equals($expressao.val))
                        error("Atribuicao invalida: "+correctToken+" do tipo "+
                        tokenType(correctToken)+" nao pode receber a expressao"+
                        " do tipo "+$expressao.val
                        ,$IDENT.getLine());
                }
            }
          ;
/*30b. Chamada de funcao*/
chamada:
       LPARENTHESIS argumentos_opcional RPARENTHESIS
       ;

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
op_unario
    returns [boolean b]
    @init{$b = false;}:
             (MINUS{$b = true;})?;

/*39.*/
exp_aritmetica
    returns [String val]
    @init {$val = "";}:
                 termo  outros_termos
                {
                /*Combinacao com outros fatores em op adicao*/
                if($outros_termos.val.length() > 0){
                     if($outros_termos.val.equals("tipo_invalido"))
                      $val = "tipo_invalido";/*sobe tipo invalido direto*/
                     else {
                        /*Se o tipo de outros fatores e valido
                        entao vemos o tipo de fator*/
                        if($termo.val.equals("inteiro") ||
                           $termo.val.equals("real")
                        ){
                            if($outros_termos.val.equals("real"))
                             $val = "real";/*Caso real, real prevalece*/
                            else
                             $val = $termo.val; /*caso inteiro, tipo de fator prevalece*/
                        }else
                            $val = "tipo_invalido";
                     }
                }else{/*Apenas fator esta presente*/
                    $val = $termo.val;                                
                }
             }
             ;

/*40.*/
op_multiplicacao:
                    MULT | DIV;

/*41.*/
op_adicao:
             PLUS | MINUS;

/*42.*/
termo
    returns [String val]
    @init {$val = "";}
    :
         fator outros_fatores
         {
          
            /*Combinacao com outros fatores em op mult*/
            if($outros_fatores.val.length() > 0){
                 if($outros_fatores.val.equals("tipo_invalido"))
                  $val = "tipo_invalido";/*sobe tipo invalido direto*/
                 else {
                    /*Se o tipo de outros fatores e valido
                    entao vemos o tipo de fator*/
                    if($fator.val.equals("inteiro") ||
                       $fator.val.equals("real")
                    ){
                        if($outros_fatores.val.equals("real"))
                         $val = "real";/*Caso real, real prevalece*/
                        else
                         $val = $fator.val; /*caso inteiro, tipo de fator prevalece*/
                    }else
                        $val = "tipo_invalido";
                 }
            }else{/*Apenas fator esta presente*/
                $val = $fator.val;                                
            }
         }
         ;

/*43.*/
outros_termos
    returns [String val]
    @init {$val = "";}
    :
                 (op_adicao termo
                  {
                   if($termo.val.equals("inteiro")
                   || $termo.val.equals("real"))
                    $val = $termo.val;
                   else
                    $val = "tipo_invalido";
                   }
                 )*;

/*44.*/
fator
    returns [String val]
    @init {$val = "";}:
         parcela outras_parcelas
         {
            if($outras_parcelas.val.length() > 0){
                if($outras_parcelas.val.equals("tipo_invalido"))
                    $val = "tipo_invalido";
                else if($parcela.val.equals("inteiro"))
                    $val = "inteiro";
            }else
                $val = $parcela.val;
                    
         };

/*45.*/
outros_fatores
    returns [String val]
    @init {$val = "";}
    :
                  (op_multiplicacao fator
                  {
                   if($fator.val.equals("inteiro")
                   || $fator.val.equals("real"))
                    $val = $fator.val;
                   else
                    $val = "tipo_invalido";
                   })*;

/*46.*/
parcela
    returns [String val]
    @init {$val = "";}:
           op_unario parcela_unario
           {  
                if($op_unario.b){        
                    if($parcela_unario.val.equals("real") ||
                        $parcela_unario.val.equals("inteiro"))
                        $val = $parcela_unario.val;
                    else
                        $val = "tipo_invalido";
                }else
                    $val = $parcela_unario.val;
           }
           | parcela_nao_unario {$val = $parcela_nao_unario.val;};

/*47.*/
parcela_unario
    returns [String val]
    @init {$val = "";}:
                 (NUM_INT {$val = "inteiro";}
                 | NUM_REAL {$val = "real";})
                 | UP_HAT IDENT {$val = tokenType($IDENT.text);} 
                 outros_ident 
                    { if($outros_ident.lastName.length() > 0)
                                    $val = tokenType($outros_ident.lastName);
                    }
                 dimensao
                 | IDENT chamada_partes {$val = tokenType($IDENT.text);} 
                 | LPARENTHESIS expressao {$val = $expressao.val;} RPARENTHESIS;

/*48.*/
parcela_nao_unario
    returns [String val]
    @init {$val = "";}:
                      '&' IDENT outros_ident
                      {
                       String identifier = $IDENT.text;
                       if($outros_ident.lastName.length() > 0){
                            identifier = $outros_ident.lastName;                        
                       }
                       $val = "^"+tokenType(identifier);
                      }
                      dimensao | CADEIA {$val = "literal";};

/*49. TODO: Descobrir o que o operador % faz*/
outras_parcelas
    returns [String val]
    @init {$val = "";}:
                   ('%' parcela 
                        {
                         if($parcela.val.equals("inteiro"))
                            $val = $parcela.val;
                         else
                            $val = "tipo_invalido";
                        })*;

/*50. TODO: add epsilon*/
chamada_partes:
                 LPARENTHESIS expressao mais_expressao RPARENTHESIS
                 | outros_ident dimensao;

/*51.*/
exp_relacional
    returns [String val]
    @init{ $val = "tipo_invalido"; }
    :
                  exp_aritmetica {$val = $exp_aritmetica.val;} 
                  op_opcional{if($op_opcional.b)
                                $val = "logico";}
    ;

/*52.*/
op_opcional
    returns [boolean b]
    @init{ $b = false; }:
                 (op_relacional exp_aritmetica {$b = true;})?;

/*53. Operadores relacionais*/
op_relacional:
                 EQUALS | '<>' | '>=' | '<=' | '>' | '<';

/*54.*/
expressao
    /*Val eh o tipo*/
    returns [ String val ]
    @init{ $val = "tipo_invalido"; }
    :
             termo_logico outros_termos_logicos
            {
                    if($outros_termos_logicos.val != null){
                       if($termo_logico.val.equals($outros_termos_logicos.val)){
                           $val = $termo_logico.val;
                       }/*else deixa ser invalido*/
                    }else{
                          $val = $termo_logico.val;
                    }
                }
    ;

/*55.*/
op_nao:
          NOT?;

/*56.*/
termo_logico
    /*Val eh o tipo*/
    returns [ String val ]
    @init{ $val = "tipo_invalido"; }
    :
                fator_logico outros_fatores_logicos
                {
                    if($outros_fatores_logicos.val != null){
                       if($fator_logico.val.equals($outros_fatores_logicos.val)){
                           $val = $fator_logico.val;
                       }/*else deixa ser invalido*/
                    }else{
                          $val = $fator_logico.val;
                    }
                }
    ;

/*57.*/
outros_termos_logicos
    /*Val eh o tipo*/
    returns [ String val ]
    @init{ $val = null;
          List<String> tipos = new ArrayList<>(); }
    :
       (OR termo_logico { tipos.add($termo_logico.val); })*
       {
            if(tipos.size() > 0){
                String aux = tipos.get(0);
                for(String tipo : tipos){
                   if(!aux.equals(tipo)){
                    aux = "tipo_invalido";
                    break;
                   }
                }
                $val = aux;
            }
         }
    ;

/*58.*/
outros_fatores_logicos
    /*Val eh o tipo*/
    returns [ String val ]
    @init{ $val = null;
          List<String> tipos = new ArrayList<>(); }
    :
        (AND fator_logico { tipos.add($fator_logico.val); } )*
        {
            if(tipos.size() > 0){
                String aux = tipos.get(0);
                for(String tipo : tipos){
                   if(!aux.equals(tipo)){
                    aux = "tipo_invalido";
                    break;
                   }
                }
                $val = aux;
            }
         }
    ;

/*59.*/
fator_logico
    /*Val eh o tipo*/
    returns [ String val ]
    @init{ $val = "tipo_invalido"; }
    : op_nao parcela_logica { $val = $parcela_logica.val; };

/*60.*/
parcela_logica
    returns [ String val ]
    @init{ $val = "tipo_invalido"; }
    : (
        VERDADEIRO { $val = "logico"; }
      | FALSO { $val = "logico"; }
      ) 
      | exp_relacional { $val = $exp_relacional.val; };

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
NUM_INT: ['0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9']+; 
/*Numero real com pelomenos um digito antes do ponto*/
NUM_REAL: ['0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9']+'.'['0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9']+; 
/*Sequencia de letras, digitos, _, come�ando por letra ou _*/
IDENT: NameStartChar NameChar*; 

COMMENT : '{' .*? '}' -> channel(HIDDEN);
WSNL : [ \r\t\n]+ -> channel(HIDDEN) ;
