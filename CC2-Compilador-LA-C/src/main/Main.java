/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import antlr.capirotoLexer;
import antlr.capirotoParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

/**
 *  Classe principal de teste de gramática.
 * 
 * @author joaovitor & Lucas M Carvalhaes
 */
public class Main {
    public static void main(String ...args){
        //Stream de texto
        ANTLRInputStream inputStream = new ANTLRInputStream("helloworld");
        //Lexer para gerar os tokens
        capirotoLexer lexer = new capirotoLexer(inputStream);
        //Estrutura comum de stream de tokens
        CommonTokenStream stream = new CommonTokenStream(lexer);
        //Parser do programa
        capirotoParser parser = new capirotoParser(stream);
        
        //Chama o token inicial
        System.out.println(parser.helloworld().toStringTree());
    }
}
