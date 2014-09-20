/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Lucas
 */
public class TesteLAScripts {

    public static String algoritmo_1
            = "algoritmo\n"
            + "  declare\n"
            + "    x: inteiro\n"
            + "  leia(x)\n"
            + "  escreva(x)\n"
            + "fim_algoritmo";

    public static String algoritmo_2
            = "algoritmo\n"
            + "  declare x: inteiro\n"
            + "  declare endx: ^inteiro\n"
            + "  x <- 0\n"
            + "  escreva(x,\" e \")\n"
            + "  endx <- &x\n"
            + "  ^endx <- 1\n"
            + "  escreva(x)\n"
            + "fim_algoritmo";

    public static String algoritmo_3 = "algoritmo\n"
            + "  declare vetor[5]: inteiro\n"
            + "  declare i: inteiro\n"
            + "  para i <- 0 ate 4 faca\n"
            + "    vetor[i] <- i+1\n"
            + "  fim_para\n"
            + "  escreva(vetor[0])\n"
            + "fim_algoritmo";

    public static String algoritmo_4 = "algoritmo\n"
            + "  declare vetor[5], a, vec[3][4]: inteiro\n"
            + "  declare i: inteiro\n"
            + "  para i <- 0 ate 4 faca\n"
            + "    vetor[i] <- i+1\n"
            + "  fim_para\n"
            + "  escreva(vetor[0])\n"
            + "fim_algoritmo";

    public static String algoritmo_5 = "algoritmo\n"
            + "  declare i: inteiro\n"
            + "  i <- 1\n"
            + "  enquanto i <= 5 faca\n"
            + "    escreva(i,\"\\n\")\n"
            + "    i <- i + 1\n"
            + "  fim_enquanto\n"
            + "fim_algoritmo";

    public static String algoritmo_5b = "constante bagulho :inteiro = 5"
            + "algoritmo\n"
            + "  declare i: inteiro\n"
            + "  i <- 1\n"
            + "  enquanto i = 5 faca\n"
            + "    escreva(i,\"\\n\")\n"
            + "    i <- i + 1\n"
            + "  fim_enquanto\n"
            + "fim_algoritmo";

    public static String algoritmo_6
            = "algoritmo\n"
            + "  declare\n"
            + "    x, y: inteiro\n"
            + "  declare\n"
            + "    teste: literal\n"
            + "  leia(x,y,teste)\n"
            + "  escreva(x)\n"
            + "  escreva(x,y, teste)\n"
            + "  escreva(\"valor de x \",x,\"lol\")\n"
            + "fim_algoritmo";

    public static String algoritmo_7
            = "funcao demonio(var x[5] : logico, var ^y: inteiro): logico\n"
            + "x[0] <- verdadeiro\n	"
            + "retorne x  ou nao x\n"
            + "fim_funcao\n"
            + "\n"
            + "algoritmo\n"
            + "  declare\n"
            + "    x: logico\n"
            + "  \n"
            + "    x <- (( verdadeiro ou falso ) e verdadeiro ) ou demonio(falso, 50)\n"
            + "    escreva(x)\n"
            + "fim_algoritmo";

    public static String algoritmo_8
            = "algoritmo\n"
            + "  caso 2 seja\n"
            + "  0..1: escreva(\"ERRO\")\n"
            + "  2: escreva(\"OK\")\n"
            + "  3..100: escreva(\"ERRO\")\n"
            + "  senao\n"
            + "    escreva(\"ERRO\")\n"
            + "  fim_caso\n"
            + "fim_algoritmo";
    
    public static String algoritmo_16
            = "algoritmo\n"
            + "  declare \n"
            + "    reg: registro\n"
            + "      nome: literal\n"
            + "      idade: inteiro\n"
            + "    fim_registro\n"
            + "  reg.nome <- \"Maria\"\n"
            + "  reg.idade <- 24\n"
            + "  escreva(reg.nome,\" tem \",reg.idade,\" anos\")"
            + "fim_algoritmo";

    public static String algoritmo_1_erro_semantico
            = "{ dado o comprimento de um arco, calcular seu cosseno pela soma \n"
            + "cos(x) = S x^i/i! para um dado numero de termos } \n"
            + "algoritmo \n"
            + "declare i, baseFatorial, fatorial, numeroTermos: inteiro \n"
            + "declare cosseno, angulo: real \n"
            + "{ leitura do arco e do numero de termos } \n"
            + "leia(angulo, numeroTermos) { angulo em radianos } \n"
            + "{ calculo da aproximacao do cosseno } \n"
            + "cosseno <- 0 { acumulador do resultado } \n"
            + "baseFatorial <- 1 \n"
            + "fatorial <- 1 \n"
            + "termo <- 1 \n"
            + "para i <- 1 ate numeroTermos faca \n"
            + "{ faz o somatorio } \n"
            + "se i % 2 = 1 entao \n"
            + "cosseno <- cosseno + termo { soma termos impares } \n"
            + "senao \n"
            + "cosseno <- cosseno - termo { subtrai termos pares } \n"
            + "fim_se \n"
            + "{ calcula o proximo termo } \n"
            + "fatorial <- fatorial * baseFatorial * (baseFatorial + 1) \n"
            + "baseFatorial <- baseFatorial + 2 \n"
            + "termo <- pot(x, i + 1)/fatorial \n"
            + "fim_para \n"
            + "{ resultado calculado } \n"
            + "escreva(\"cos(\", angulo, \") = \", cosseno) \n"
            + "fim_algoritmo";

}
