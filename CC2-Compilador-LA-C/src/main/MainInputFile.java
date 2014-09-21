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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *
 * @author Lucas
 */
public class MainInputFile {
    
    public static void main(String ...args){
        //System.out.println(Arrays.toString(args));
        
        String outputFile = "";
        String inputFile = "";
          
        if(args.length == 0)
            return;
        
        if(args.length == 1){
            inputFile = outputFile = args[0];
            outputFile += ".c";
        }
        
        if(args.length == 2){
            inputFile = args[0];
            outputFile = args[1];
        }
        
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(new File(inputFile));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainInputFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(fis == null)
            return;
        
        //Stream de texto
        ANTLRInputStream inputStream = null;
        try {
            inputStream = new ANTLRInputStream(fis);
        } catch (IOException ex) {
            Logger.getLogger(MainInputFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(inputStream == null)
            return;
        
        //Lexer para gerar os tokens
        LAGrammar1_CodeGenLexer lexer = new LAGrammar1_CodeGenLexer(inputStream);
        //Estrutura comum de stream de tokens
        CommonTokenStream stream = new CommonTokenStream(lexer);
        //Parser do programa
        LAGrammar1_CodeGenParser parser = new LAGrammar1_CodeGenParser(stream);
        
        parser.addErrorListener(SyntaticErrorHandlerSaidaPadronizada.INSTANCE);
        lexer.addErrorListener(LexErrorHandlerSaidaPadronizada.INSTANCE);
        
        //Chama o token inicial
        parser.programa();
        if(SemanticUtil.hasErrors() || parser.getNumberOfSyntaxErrors() > 0){
            System.err.println("Compilation errors!");
            if(SemanticUtil.hasErrors()){
                System.err.println("Semantic errors:");
                SemanticUtil.printErrors();
                try {
                    Generator.publishLog(outputFile, SemanticUtil.listErrors());
                } catch (IOException ex) {
                    Logger.getLogger(MainInputFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(parser.getNumberOfSyntaxErrors() > 0){
                System.err.println(SyntaticErrorHandler.INSTANCE.listSyntaticErrors());
                try {
                    if(SErrorList.sErrors.size() > 0){
                        Generator.publishLog(outputFile,SErrorList.sErrors.get(0)+"\nFim da compilacao\n");
                    }
                } catch (IOException ex) {
                    Logger.getLogger(MainInputFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else{
            System.out.println("Compilation successful!");
            try {
                Generator.publishCode(outputFile);
            } catch (IOException ex) {
                Logger.getLogger(MainInputFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        Generator.reset();
        SemanticUtil.reset();
    }
    
}
