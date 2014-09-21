/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semantic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/**
 *
 * @author Lucas
 */
public class SemanticUtil {

    private static Stack<TokenSymbolTable> stack = new Stack<>();
    private static Stack<SemanticError> errors = new Stack<>();
    private static HashMap<String, String> methodSignature = new HashMap<>();
    /*
    Methods and data to handle structures and complex types
    */
    
    public static String structType(String composedType, int index){
        if(composedType == null)
            return "tipo_invalido";
        
        ArrayList<String> types = structTypes(composedType);
        if(index < types.size() && index >= 0)
            return types.get(index);
        
        return "tipo_invalido";
    }
    
    public static ArrayList<String> structTypes(String compoundType){
        String[] types = compoundType.replace("$[", "")
                .replace(",,",",").replace("]", "").split(",");
        return new ArrayList<>(Arrays.asList(types));
    }
    
    public static String getSubtypeName(String composedTypePart){
        return composedTypePart.split(":")[0];
    }
    
    public static String getSubtypeType(String composedTypePart){
        return composedTypePart.split(":")[1];
    }
    
    //Method to handle signature of functions and procedures
    public static void registerSignature(String method, String signature){
        methodSignature.put(method, signature);
    }
    
    public static String getSignature(String method){
        return methodSignature.get(method);
                
    }
    
    public static void printSignatures(){
         System.out.println("Signatures{\n" +methodSignature+ "\n}");
    }
    
    /*
    Methods and data to handle general semantic rules
    */
    
    public static void reset(){
        stack = new Stack<>();
        errors = new Stack<>();
        methodSignature = new HashMap<>();
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
    
    public static String listErrors(){
        String body = "";
        for (SemanticError ts : errors) {
            body += ts+"\n";
        }
        return "Erros semanticos:\n" +body;
    }

}
