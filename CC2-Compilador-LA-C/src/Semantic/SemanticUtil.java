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

    private static final Stack<TokenSymbolTable> stack = new Stack<>();

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

    public static String print() {
        String body = "";
        for (TokenSymbolTable ts : stack) {
            body += ts;
        }
        return "SemanticUtil{\n" +body+ "\n}";
    }

}
