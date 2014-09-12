/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Semantic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas
 */
public class TokenSymbolTable {
    
    private final ArrayList<TokenSymbol> table;
    private final String scope;
    
    public TokenSymbolTable(String scope){
        table = new ArrayList<>();
        this.scope = scope;
    }
    
    public void addToken(String nome, String tipo){
        table.add(new TokenSymbol(nome, tipo));
    }
    
    public void addTokens(List<String> nomes, String tipo){
        for(String s : nomes){
            table.add(new TokenSymbol(s, tipo));
        }
    }
    
    public boolean isTokenPresent(String lex){
        for(TokenSymbol ts : table){
            if(ts.name.equals(lex))
                return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        String ret = "Scope["+scope+"]";
        for(TokenSymbol ts : table) {
            ret += "\n "+ts;
        }
        return ret;
    }
}
