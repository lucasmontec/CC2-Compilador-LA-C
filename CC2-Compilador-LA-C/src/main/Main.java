/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;


import CodeGeneration.Generator;
import Semantic.SemanticUtil;
import antlr.LAGrammar1_CodeGenLexer;
import antlr.LAGrammar1_CodeGenParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *  Classe principal de teste de gramática.
 * 
 * @author joaovitor & Lucas M Carvalhaes
 */
public class Main {
   /* public static void main(String ...args){
        //Stream de texto
        ANTLRInputStream inputStream = new ANTLRInputStream(TesteLAScripts.algoritmo_16);
        //Lexer para gerar os tokens
        LAGrammar1_CodeGenLexer lexer = new LAGrammar1_CodeGenLexer(inputStream);
        //Estrutura comum de stream de tokens
        CommonTokenStream stream = new CommonTokenStream(lexer);
        //Parser do programa
        LAGrammar1_CodeGenParser parser = new LAGrammar1_CodeGenParser(stream);
        
        //Chama o token inicial
        parser.programa();
        if(SemanticUtil.hasErrors() || parser.getNumberOfSyntaxErrors() > 0){
            System.err.println("Compilation errors!");
            if(SemanticUtil.hasErrors()){
                System.err.println("Semantic errors:");
                SemanticUtil.printErrors();
            }
            if(parser.getNumberOfSyntaxErrors() > 0){
                System.err.println("Syntatic errors.");
            }
        }else{
            System.out.println("Compilation successful!");
            Generator.printCode();
        }
        
        Generator.reset();
        SemanticUtil.reset();
    }*/
}
