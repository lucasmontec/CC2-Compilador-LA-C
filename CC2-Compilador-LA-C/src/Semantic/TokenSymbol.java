package Semantic;

/**
 *
 * @author Lucas
 */
public class TokenSymbol {
    String name, type;
    
    /**
     * 
     * @param n The token name, lexem
     * @param t The token type
     */
    public TokenSymbol(String n, String t){
        name = n;
        type = t;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return name+"("+type+")";
    }
    
}
