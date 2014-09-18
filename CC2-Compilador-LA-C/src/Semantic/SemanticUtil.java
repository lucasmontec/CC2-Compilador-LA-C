/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semantic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Lucas
 */
public class SemanticUtil {

    private static Stack<TokenSymbolTable> stack = new Stack<>();
    private static Stack<SemanticError> errors = new Stack<>();

    /*
    Methods and data to handle structures and complex types
    */
    
    private static HashMap<String,String> composedTypeRegistry = new HashMap<>();
    
    public static void registerStruct(String token, String types){
        composedTypeRegistry.put(token, types);
    }
    
    public static String structType(String token){
        return composedTypeRegistry.get(token);
    }
    
    public static String structType(String token, int index){
        String type = composedTypeRegistry.get(token);
        if(type == null)
            return "tipo_invalido";
        
        ArrayList<String> types = structTypes(type);
        if(index < types.size() && index >= 0)
            return types.get(index);
        
        return "tipo_invalido";
    }
    
    public static ArrayList<String> structTypes(String compoundType){
        String[] types = compoundType.replace("$[", "").replace("]", "").split(",");
        return new ArrayList<>(Arrays.asList(types));
    }
    
    /*
    Methods and data to handle general semantic rules
    */
    
    public static void reset(){
        stack = new Stack<>();
        errors = new Stack<>();
        composedTypeRegistry = new HashMap<>();
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

    public static String tokenType(String token){
        for (TokenSymbolTable ts : stack) {
            String t = ts.tokenType(token);
            if(t != null)
                return t;
        }
        return "tipo_invalido";
    }
    
    public static TokenSymbolTable pop() {
        return stack.pop();
    }

    public static ArrayList<TokenSymbolTable> allTables() {
        return new ArrayList<>(stack);
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
