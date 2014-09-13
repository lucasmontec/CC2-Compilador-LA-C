/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Semantic;

/**
 *
 * @author Lucas
 */
public class SemanticError {
    
    private final int lineNumber;
    private final String message;
    
    public SemanticError(String msg, int line){
        message = msg;
        lineNumber = line;
    }
    
    public String getMessage(){
        return message;
    }
    
    public int getLineNumber(){
        return lineNumber;
    }
    
    @Override
    public String toString(){
        return message+" at line "+lineNumber;
    }
}
