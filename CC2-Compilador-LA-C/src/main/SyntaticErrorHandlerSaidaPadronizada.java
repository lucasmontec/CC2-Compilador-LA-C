/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 *
 * @author Lucas
 */
public class SyntaticErrorHandlerSaidaPadronizada extends BaseErrorListener {

    public static SyntaticErrorHandlerSaidaPadronizada INSTANCE = new SyntaticErrorHandlerSaidaPadronizada();
    
    private static final boolean REPORT_SYNTAX_ERRORS = true;
    
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
            int line, int charPositionInLine,
            String msg, RecognitionException e) {
        if (!REPORT_SYNTAX_ERRORS) {
            return;
        }

        String token = ((CommonToken) offendingSymbol).getText();
        token = token.replace("<EOF>", "EOF");
        SErrorList.sErrors.add("Linha " + line + ": erro sintatico proximo a " + token );
    }

}
