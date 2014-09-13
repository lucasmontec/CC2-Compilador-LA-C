/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Semantic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Map token->type
 * @author Lucas
 */
public class TokenSymbolTable {
    
    private final HashMap<String, String> table;
    private final String scope;
    
    public TokenSymbolTable(String scope){
        table = new HashMap<>();
        this.scope = scope;
    }
    
    public void addToken(String nome, String tipo){
        table.put(nome,tipo);
    }
    
    public void addTokens(List<String> nomes, String tipo){
        for(String s : nomes){
            table.put(s,tipo);
        }
    }
    
    public String tokenType(String token){
        return table.get(token);
    }
    
    public boolean isTokenPresent(String lex){
        return table.containsKey(lex);
    }
    
    public String getScope(){
        return scope;
    }
    
    @Override
    public String toString() {
        String ret = "Scope["+scope+"]";
        for(Map.Entry<String, String> ts : table.entrySet()) {
            ret += "\n "+ts.getKey()+"("+ts.getValue()+")";
        }
        return ret;
    }
}
