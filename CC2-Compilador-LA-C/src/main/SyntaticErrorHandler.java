/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 *
 * @author Lucas
 */
public class SyntaticErrorHandler extends BaseErrorListener {

    public static SyntaticErrorHandler INSTANCE = new SyntaticErrorHandler();
    
    private static final boolean REPORT_SYNTAX_ERRORS = true;
    
    private final ArrayList<String> syntaticErrors = new ArrayList<>();
    
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
            int line, int charPositionInLine,
            String msg, RecognitionException e) {
        if (!REPORT_SYNTAX_ERRORS) {
            return;
        }

        syntaticErrors.add("line " + line + ":" + msg );
    }

    public ArrayList<String> getSyntaticErrors() {
        return syntaticErrors;
    }

    public String listSyntaticErrors(){
        String ret = "Syntatic errors:\n";
        for(String err : syntaticErrors){
            ret += err+"\n";
        }
        return ret;
    }
}
