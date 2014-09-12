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
    
    public static String algoritimo_1 = 
            "{ dado o comprimento de um arco, calcular seu cosseno pela soma \n" +
            "cos(x) = S x^i/i! para um dado numero de termos } \n" +
            "algoritmo \n" +
            "declare i, termo, baseFatorial, fatorial, numeroTermos: inteiro \n" +
            "declare cosseno, angulo: real \n" +
            "{ leitura do arco e do numero de termos } \n" +
            "leia(angulo, numeroTermos) { angulo em radianos } \n" +
            "{ calculo da aproximacao do cosseno } \n" +
            "cosseno <- 0 { acumulador do resultado } \n" +
            "baseFatorial <- 1 \n" +
            "fatorial <- 1 \n" +
            "termo <- 1 \n" +
            "para i <- 1 ate numeroTermos faca \n" +
            "{ faz o somatorio } \n" +
            "se i % 2 = 1 entao \n" +
            "cosseno <- cosseno + termo { soma termos impares } \n" +
            "senao \n" +
            "cosseno <- cosseno - termo { subtrai termos pares } \n" +
            "fim_se \n" +
            "{ calcula o proximo termo } \n" +
            "fatorial <- fatorial * baseFatorial * (baseFatorial + 1) \n" +
            "baseFatorial <- baseFatorial + 2 \n" +
            "termo <- pot(x, i + 1)/fatorial \n" +
            "fim_para \n" +
            "{ resultado calculado } \n" +
            "escreva(\"cos(\", angulo, \") = \", cosseno) \n" +
            "fim_algoritmo";
    
}
