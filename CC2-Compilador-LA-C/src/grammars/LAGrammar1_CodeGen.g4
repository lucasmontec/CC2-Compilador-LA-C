grammar LAGrammar1_CodeGen;


/*Code*/
@header {
  import Semantic.TokenSymbol;
  import Semantic.TokenSymbolTable;
  import static Semantic.SemanticUtil.*;
  import CodeGeneration.Generator;
  import java.util.*;
}

/*SYNTAX*/

/*1. Programa LA*/
programa:
            { 
             Generator.includes();
             push(new TokenSymbolTable("decl_globais"));
            }
        declaracoes
        {Generator.startAlgorithm();}
        ALGORITMO corpo
            /*{ printSemanticTable(); }*/
            FIM_ALGORITMO
            {
                if(hasErrors())
                   printErrors();
                /*printSignatures();*/
                pop();/*Decl globais*/
                Generator.endAlgorithm();
                Generator.printCode();
            }
        ;
        

/*2. Lista de declara��es do programa*/
declaracoes:
    decl_local_global*;

/*3. Jun��o de declara��o local ou global*/
decl_local_global:
            declaracao_local | declaracao_global;         

/*4. Regra de declara��o local*/
declaracao_local
    returns[String val]
    @init{$val = "";}
    :
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
                 else{
                   /*adiciona a variável*/
                   top().addToken(s, $variavel.t);
                   /*adiciona subvariáveis de registros*/
                   if($variavel.t.startsWith("$")){
                         for(String st: structTypes($variavel.t))
                               top().addToken(s + "." + getSubtypeName(st), getSubtypeType(st));
                   }
                   if(tokenType($variavel.t).startsWith("$")){
                         for(String st: structTypes(tokenType($variavel.t)))
                               top().addToken(s + "." + getSubtypeName(st), getSubtypeType(st));
                   }
                 }
           }  
        }else{
           error("Undeclared variable type: "+$variavel.t, $DECLARE.getLine()); 
        }
        $val = $variavel.names.toString();
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
        $val = $tipo_basico.val; 
        
        Generator.addCode(Generator.declCte($IDENT.text, $tipo_basico.val, $valor_constante.text));
     }      
    | TIPO IDENT COLON tipo
     {
        if(top().isTokenPresent($IDENT.text))
          error("Tipo ja declarado: "+$IDENT.text, $IDENT.getLine());
        else
          top().addToken($IDENT.text, $tipo.val);
        $val = $tipo.val;
     };


/*5. Lista de variaveis com variaveis a mais do mesmo tipo opcionais*/
variavel
    returns [ ArrayList<String> names, String t]
    @init{ $names = new ArrayList<>(); $t = ""; }
    :
    IDENT dimensao mais_var COLON tipo
        {
            $t = $tipo.val;
            $names.add($IDENT.text);
            $names.addAll($mais_var.nomes);
            Generator.declareVariable($IDENT.text, $tipo.val, $dimensao.text);
            
            for(int i=0; i<$mais_var.nomes.size();i++){
               String n = $mais_var.nomes.get(i);
               String dim = $mais_var.dims.get(i);
               Generator.declareVariable(n, $tipo.val, dim);                 
            }
         };

/*6. Extens�o da lista de vari�veis*/
mais_var returns [ ArrayList<String> nomes, ArrayList<String> dims ]
    @init { $nomes = new ArrayList<String>(); $dims = new ArrayList<String>(); }
    :
    (COMMA IDENT { 
                  if(!isTokenPresent($IDENT.text)){
                      $nomes.add($IDENT.text);
                  }else{
                      error("Identificador ja declarado: "+
                      $IDENT.text,$IDENT.getLine());
                  }
                }
     dimensao
     {
        $dims.add($dimensao.text);
     }
    )*;

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
    returns [ String fullName ]
    @init{ $fullName = ""; }
    :
     /*Retorna cada nome. O ultimo � o tipo da lista de chamadas.*/
    (DOT identificador { $fullName+="."+$identificador.nome; })?;

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
mais_ident
    returns [ ArrayList<String> idents]
    @init{ $idents = new ArrayList<>();}
    :
    (COMMA identificador{$idents.add($identificador.nome);})*;

/*13. Lista de pelomenos uma vari�vel*/
mais_variaveis
    returns [ HashMap<String, String> nomes, List<String> tipos ]
    @init{ $tipos = new ArrayList<>(); $nomes = new HashMap<>();}
    :
    (variavel {$tipos.add($variavel.t);
               for(String s: $variavel.names)
                    $nomes.put(s, $variavel.t);                
               } )*;

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
    @init{ $val = "$"; }
    :
     REGISTRO variavel 
     { $val += "[";
        for(String s: $variavel.names)
            $val += s + ":" +$variavel.t+",";         
     }
     mais_variaveis { 
                     for(Map.Entry<String, String> e: $mais_variaveis.nomes.entrySet()){                     
                        $val += ","+e.getKey()+":"+e.getValue();
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
declaracao_global
    :
      PROCEDIMENTO IDENT 
        { push(new TokenSymbolTable("PROC")); }
        LPARENTHESIS parametros_opcional
        {
            for(Map.Entry<String,String> entry : $parametros_opcional.nomes.entrySet()){
                top().addToken(entry.getKey(), entry.getValue());
                
                /*adiciona subvariáveis de registros*/
                if(entry.getValue().startsWith("$")){
                      for(String st: structTypes(entry.getValue()))
                            top().addToken(entry.getKey() + "." + getSubtypeName(st), getSubtypeType(st));
                }
                if(tokenType(entry.getValue()).startsWith("$")){
                      for(String st: structTypes(tokenType(entry.getValue())))
                            top().addToken(entry.getKey() + "." + getSubtypeName(st), getSubtypeType(st));
                }
            }
        }
        RPARENTHESIS declaracoes_locais comandos FIM_PROCEDIMENTO
        { 
            /*System.out.println("*******************");
            System.out.println("*******************");
            printSemanticTable();
            System.out.println("*******************");
            System.out.println("*******************");*/
            String code = Generator.method($IDENT.text, $parametros_opcional.nomeList, 
                $parametros_opcional.tipoList, false, "", $comandos.code);
            Generator.addCode(code);
            pop();
            top().addToken($IDENT.text, "PROC");
            registerSignature($IDENT.text, $parametros_opcional.val);
        }
      
      | FUNCAO IDENT
        { push(new TokenSymbolTable("FUNC")); }
        LPARENTHESIS parametros_opcional
        {
            for(Map.Entry<String,String> entry : $parametros_opcional.nomes.entrySet()){
                top().addToken(entry.getKey(), entry.getValue());
                
                /*adiciona subvariáveis de registros*/
                if(entry.getValue().startsWith("$")){
                      for(String st: structTypes(entry.getValue()))
                            top().addToken(entry.getKey() + "." + getSubtypeName(st), getSubtypeType(st));
                }
                if(tokenType(entry.getValue()).startsWith("$")){
                      for(String st: structTypes(tokenType(entry.getValue())))
                            top().addToken(entry.getKey() + "." + getSubtypeName(st), getSubtypeType(st));
                }
            }
        }
        RPARENTHESIS COLON tipo_estendido declaracoes_locais comandos FIM_FUNCAO
        { 
            String code = Generator.method($IDENT.text, $parametros_opcional.nomeList, 
                $parametros_opcional.tipoList, true, $tipo_estendido.val, $comandos.code);
            Generator.addCode(code);
            pop(); 
            top().addToken($IDENT.text, $tipo_estendido.val);
            registerSignature($IDENT.text, $parametros_opcional.val);
        }           
      ;

/*20. Parametros 0 ou mais*/
parametros_opcional
    returns [ HashMap<String,String> nomes, String val, ArrayList<String> nomeList, ArrayList<String> tipoList]
    @init{
        $val = ""; 
        $nomes = new HashMap<>();
        $nomeList = new ArrayList<>();
        $tipoList = new ArrayList<>();
    }
    : (parametro{
        $val = $parametro.val; 
        $nomes = $parametro.nomes;
        $nomeList = $parametro.nomeList;
        $tipoList = $parametro.tipoList;
    })?;

/*21.Parametro*/
parametro
    returns [ HashMap<String,String> nomes, String val, ArrayList<String> nomeList, ArrayList<String> tipoList]
    @init{
            $val = "";
            $nomes = new HashMap<>();
            $nomeList = new ArrayList<>();
            $tipoList = new ArrayList<>();
          }
    :
      var_opcional identificador mais_ident COLON tipo_estendido
      {
         $val += $tipo_estendido.val;
         $nomes.put($identificador.nome,$tipo_estendido.val);
         $nomeList.add($identificador.text);
         $tipoList.add($tipo_estendido.val);
         for(String s: $mais_ident.idents){
            $val += "," + $tipo_estendido.val;
            $nomes.put(s,$tipo_estendido.val);
            $nomeList.add($identificador.text);
            $tipoList.add($tipo_estendido.val);
         }
      }
      /*mais_parametros*/
      (COMMA
       {$val += ",";}
       var_opcional identificador mais_ident COLON tipo_estendido
       {
            $val += $tipo_estendido.val;
            $nomes.put($identificador.nome,$tipo_estendido.val);
            $nomeList.add($identificador.text);
            $tipoList.add($tipo_estendido.val);
            for(String s: $mais_ident.idents){
               $val += "," + $tipo_estendido.val;
               $nomes.put(s,$tipo_estendido.val);
               $nomeList.add($identificador.text);
               $tipoList.add($tipo_estendido.val);
            }
       }
      )*
    ;

/*22. Declaracao de variavel opcional*/
var_opcional: VAR?;

/*23. Lista de parametros*/
/*mais_parametros:
      (COMMA parametro)?;*/

/*24. Declaracoes de escopo local*/
declaracoes_locais
    returns[String val]
    @init{$val = "";}
    : (declaracao_local{$val += " " + $declaracao_local.val;})*
    {$val.trim();}                    
 ;

/*25.*/
corpo:
      declaracoes_locais comandos { Generator.addCode($comandos.code); };

/*26. Lista de comandos*/
comandos
    returns [ String code ]
    @init{ $code = ""; }
    :
      (cmd { $code += $cmd.code+"\n"; } )*;

/*27. Comandos da linguagem*/
cmd
    returns [ String code ]
    @init{ $code = ""; }
    :
       LEIA LPARENTHESIS identificador mais_ident 
       {
          if(!isTokenPresent($identificador.nome))
            error("Identificador nao declarado: "+$identificador.nome,
            $LEIA.getLine());
            
          for(String s : $mais_ident.idents){
               if(!isTokenPresent(s))
                    error("Identificador nao declarado: "+s,
                    $LEIA.getLine());                               
          }
       }
       RPARENTHESIS
       {
            HashMap<String, String> nameToTypes = new HashMap<>();
              nameToTypes.put($identificador.nome, tokenType($identificador.nome));
              for(String s : $mais_ident.idents){
                nameToTypes.put(s, tokenType(s));
              }
            $code = Generator.read(nameToTypes);
       }
       
   |   ESCREVA LPARENTHESIS expressao mais_expressao RPARENTHESIS
       {
            ArrayList<String> names = new ArrayList<String>();
            ArrayList<String> types = new ArrayList<String>();
            
            names.add($expressao.text);
            types.add($expressao.val);
            
            names.addAll($mais_expressao.names);
            types.addAll($mais_expressao.types);
            
            $code = Generator.write(names, types);
       }
       
   |   { push(new TokenSymbolTable("IF")); }
       SE expressao ENTAO comandos senao_opcional FIMSE
       {
            $code = Generator.condition($expressao.text, $comandos.code, $senao_opcional.val);
            pop();
       }
       
   |   { push(new TokenSymbolTable("CASE")); }
       CASO exp_aritmetica SEJA selecao senao_opcional FIMCASO
       { 
        $code = Generator.caseCondition(
            $exp_aritmetica.text,
            $selecao.caseData,
            $selecao.caseCode,
            $senao_opcional.val
            );
        pop();
       }
       
   |   { push(new TokenSymbolTable("FOR")); }
       PARA IDENT
       /*Verifica se o token esta declarado*/
       {
        if(!isTokenPresent($IDENT.text))
            error("Contador de loop nao declarado: "+$IDENT.text,$IDENT.getLine());
        
        String expInit = "";
        String expFim = "";
       }
       ARROW exp_aritmetica {expInit = $exp_aritmetica.text;}
       ATE exp_aritmetica {expFim = $exp_aritmetica.text;}
       FACA comandos FIMPARA
       { 
            $code = Generator.forLoop($IDENT.text, expInit, expFim, $comandos.code);
            pop();
       }
       
   |   { push(new TokenSymbolTable("WHILE")); }
       ENQUANTO expressao FACA comandos FIMENQUANTO
       {
        $code = Generator.whileLoop($expressao.text, $comandos.code);
        pop();
       }
       
   |   { push(new TokenSymbolTable("DO")); }
       FACA comandos ATE expressao
       {
        $code = Generator.doWhileLoop($expressao.text, $comandos.code);
        pop();
       }
       
   |   UP_HAT IDENT outros_ident dimensao ARROW expressao /*Atrib de ponteiro*/
       /*TODO - TYPECHECK*/
       /*Verifica se o token esta declarado*/
       {
            if(!isTokenPresent($IDENT.text))
                error("Ponteiro nao declarado: "+$IDENT.text,$IDENT.getLine());

            String fullToken = $IDENT.text+$outros_ident.fullName;

            if(!tokenType(fullToken).replace("^","").equals($expressao.val))
                if(
                    !(tokenType(fullToken).replace("^","").equals("real")
                    && $expressao.val.equals("inteiro"))
                )
                error("Atribuicao invalida: "+fullToken+" do tipo "+
                tokenType(fullToken)+" nao pode receber a expressao"+
                " do tipo "+$expressao.val
                ,$IDENT.getLine());
                
           $code = Generator.attribPointer($IDENT.text+ $outros_ident.fullName, $dimensao.text, $expressao.text);
       }
   |   IDENT chamada /*Chamada de funcao regra 30b*/
       /*Verifica se o token esta declarado e se os tipos batem*/
       {
        if(!isTokenPresent($IDENT.text))
            error("Identificador nao declarado: "+$IDENT.text,$IDENT.getLine());
        
        if(getSignature($IDENT.text) != null)
            if(!getSignature($IDENT.text).equals($chamada.val))
                error("Assinatura de chamada de metodo errada: "+$chamada.val
                +"\nAssinatura esperada: "+getSignature($IDENT.text)
                ,$IDENT.getLine());
                
         $code = $IDENT.text+$chamada.text ;
       }
       
   |   atribuicao  { $code = $atribuicao.code ; }/*Atribuicao regra 30a*/
       
   |   RETORNE expressao/*LUCCAS*/
       {    boolean erro = true;
            for(TokenSymbolTable currentTable : allTables()){
              if(currentTable.getScope().equals("FUNC"))
                erro = false;
            }
            if(erro){
              error("Retorne em local inadequado", $RETORNE.getLine());       
            }
           $code = "return " + Generator.normalizeExpression($expressao.text) + ";";
       }/*FIM-LUCCAS*/
   ;
     
/*28. Repeti��o de express�o para listagem de express�es*/
mais_expressao
    returns [String val, ArrayList<String> names, ArrayList<String> types]
    @init{$val = ""; $names = new ArrayList<>(); $types = new ArrayList<>();}
    :
    (COMMA expressao {
        $val += ","+$expressao.val;
        $names.add($expressao.text);
        $types.add($expressao.val);
    })*;

/*29. Else opcional*/
senao_opcional
    returns [String val]
    @init{$val = "";}
    :
       (SENAO comandos {$val += $comandos.code;})?;

/*30. Atribuicao ou chamada de funcao - Depreciada*/
/*chamada_atribuicao:
       LPARENTHESIS argumentos_opcional RPARENTHESIS | outros_ident dimensao ARROW expressao;*/

/*30a. Atribuicao*/
atribuicao
    returns [ String code ]
    @init{ $code = ""; }
    :
           IDENT outros_ident dimensao ARROW expressao
           {
                if(!isTokenPresent($IDENT.text)){
                    error("Variavel nao declarada: "+$IDENT.text,$IDENT.getLine());
                }else{
                    String fullToken = $IDENT.text+$outros_ident.fullName;
                    
                    if(!tokenType(fullToken).equals($expressao.val))
                        if(
                        !((tokenType(fullToken).equals("real")
                        && $expressao.val.equals("inteiro"))
                        ||
                        (tokenType(fullToken).equals("inteiro")
                        && $expressao.val.equals("real")))
                        )
                            error("Atribuicao invalida: "+fullToken+" do tipo "+
                            tokenType(fullToken)+" nao pode receber a expressao "+
                            $expressao.text+" do tipo "+$expressao.val
                            ,$IDENT.getLine());
                }
                
                String id = $IDENT.text+$outros_ident.fullName+$dimensao.text;
                $code = Generator.attrib(id, $expressao.text);
            }
          ;
/*30b. Chamada de funcao*/
chamada
    returns [String val]
    @init {$val = "";}
    :
       LPARENTHESIS argumentos_opcional RPARENTHESIS
       {
            $val += $argumentos_opcional.val;
       }
       ;

/*31. Lista de argumentos opcional com expressao*/
argumentos_opcional
    returns [String val]
    @init {$val = "";}
    :
        (expressao
         {
            $val += $expressao.val;           
         }
         mais_expressao
         {
            $val += $mais_expressao.val;  
         }
        )?;

/*32. */
selecao
    returns [ ArrayList<String> caseData, ArrayList<String> caseCode ]
    @init{ $caseData = new ArrayList<>(); $caseCode = new ArrayList<>(); }
    :
           constantes COLON comandos 
           {
                $caseData.add($constantes.data);
                $caseCode.add($comandos.code);
           }
           
           (constantes COLON comandos
            {
                $caseData.add($constantes.data);
                $caseCode.add($comandos.code); 
            })*
           
    ;

/*33.*/
/*mais_selecao:
                selecao?;*/

/*34. Lista de constantes*/
constantes 
    returns [ String data ]
    @init{ $data = ""; }
    :
              numero_intervalo mais_constantes 
              { $data += $numero_intervalo.text + $mais_constantes.text; }
    ;
              

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
                 | UP_HAT IDENT outros_ident 
                    {
                        $val = tokenType($IDENT.text+$outros_ident.fullName);
                    }
                 dimensao
                 | 
                 IDENT chamada_parte
                 {
                  if(!isTokenPresent($IDENT.text+$chamada_parte.fullName))
                      error("Identificador nao declarado: "+$IDENT.text,$IDENT.getLine());
                        
                   $val = tokenType($IDENT.text+$chamada_parte.fullName);
                 }
                 |
                 IDENT chamada_metodo
                 {
                  if(!isTokenPresent($IDENT.text))
                      error("Identificador nao declarado: "+$IDENT.text,$IDENT.getLine());
                  
                  if(getSignature($IDENT.text) != null)
                    if(!getSignature($IDENT.text).equals($chamada_metodo.val))
                        error("Assinatura de chamada de metodo errada: "+$chamada_metodo.val
                          +"\nAssiantura esperada: "+getSignature($IDENT.text)
                          ,$IDENT.getLine()); 
                        
                   $val = tokenType($IDENT.text);
                 }
                 | LPARENTHESIS expressao {$val = $expressao.val;} RPARENTHESIS;

/*48.*/
parcela_nao_unario
    returns [String val]
    @init {$val = "";}:
                      '&' IDENT outros_ident
                      {
                       /*Coloca o UPHAT para fazer o typematch de ponteiro com endereco*/
                       $val = "^"+tokenType($IDENT.text+$outros_ident.fullName);
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

/*50.*/
/*chamada_partes:
                LPARENTHESIS expressao mais_expressao RPARENTHESIS |
                outros_ident dimensao | ;*/

/*50a.*/
chamada_metodo
    returns [String val]
    @init {$val = "";}
    :
     (chamada {$val = $chamada.val;})?;

/*50b.*/
chamada_parte
    returns [String fullName]
    @init {$fullName = "";}
    :
                outros_ident { $fullName = $outros_ident.fullName;} dimensao;

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
   : [a-zA-Z]
   | '_';

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
