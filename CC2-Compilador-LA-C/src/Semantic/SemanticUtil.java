/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semantic;

import java.util.List;
import java.util.Stack;

/**
 *
 * @author Lucas
 */
public class SemanticUtil {

    private static Stack<TokenSymbolTable> stack = new Stack<>();
    private static Stack<SemanticError> errors = new Stack<>();

    public static void reset(){
        stack = new Stack<>();
        errors = new Stack<>();
    }
    
    public static boolean hasErrors(){
        return !errors.empty();
    }
    
    public static void error(String description, int line){
        errors.push(new SemanticError(description, line));
    }
    
    public static void push(TokenSymbolTable table) {
        stack.push(table);
    }

    public static TokenSymbolTable top() {
        return stack.peek();
    }

    public static boolean isTokenPresent(String name) {
        for (TokenSymbolTable ts : stack) {
            if (ts.isTokenPresent(name)) {
                return true;
            }
        }
        return false;
    }

    public static TokenSymbolTable pop() {
        return stack.pop();
    }

    public static List allTables() {
        return stack;
    }

    public static void printSemanticTable() {
        String body = "";
        for (TokenSymbolTable ts : stack) {
            body += ts;
        }
        System.out.println("SemanticTable{\n" +body+ "\n}");
    }
    
    public static void printErrors(){
        String body = "";
        for (SemanticError ts : errors) {
            body += ts+"\n";
        }
        System.out.println("Errors{\n" +body+ "\n}");
    }

}
