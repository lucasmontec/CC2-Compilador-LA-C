/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;


import antlr.LAGrammar1Lexer;
import antlr.LAGrammar1Parser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *  Classe principal de teste de gramática.
 * 
 * @author joaovitor & Lucas M Carvalhaes
 */
public class Main {
    public static void main(String ...args){
        //Stream de texto
        ANTLRInputStream inputStream = new ANTLRInputStream(TesteLAScripts.algoritimo_1_erro_semantico);
        //Lexer para gerar os tokens
        LAGrammar1Lexer lexer = new LAGrammar1Lexer(inputStream);
        //Estrutura comum de stream de tokens
        CommonTokenStream stream = new CommonTokenStream(lexer);
        //Parser do programa
        LAGrammar1Parser parser = new LAGrammar1Parser(stream);
        
        //Chama o token inicial
        parser.programa();
        //System.out.println(parser.programa().toStringTree());
    }
}
