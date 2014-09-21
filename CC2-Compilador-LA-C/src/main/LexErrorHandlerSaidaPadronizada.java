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
public class LexErrorHandlerSaidaPadronizada extends BaseErrorListener {

    public static LexErrorHandlerSaidaPadronizada INSTANCE = new LexErrorHandlerSaidaPadronizada();
    
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
            int line, int charPositionInLine,
            String msg, RecognitionException e) {

        String token = msg.substring(msg.indexOf('\'')+1, msg.lastIndexOf('\''));
        token = token.replace("<EOF>", "EOF");
        
        if(!token.equals("EOF"))
            token = token.substring(0,1);
        
        if(token.equals("{")) {
            SErrorList.sErrors.add("Linha " + (line+1) + ": comentario nao fechado\n");
        }
        else {
            SErrorList.sErrors.add("Linha " + line + ": " + token + " - simbolo nao identificado\n");
        }
    }
}
