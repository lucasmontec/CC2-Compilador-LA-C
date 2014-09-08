// Generated from /home/joaovitor/NetBeansProjects/CC2-Compilador-LA-C/CC2-Compilador-LA-C/src/grammars/capiroto.g4 by ANTLR 4.1
package antlr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link capirotoParser}.
 */
public interface capirotoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link capirotoParser#helloworld}.
	 * @param ctx the parse tree
	 */
	void enterHelloworld(@NotNull capirotoParser.HelloworldContext ctx);
	/**
	 * Exit a parse tree produced by {@link capirotoParser#helloworld}.
	 * @param ctx the parse tree
	 */
	void exitHelloworld(@NotNull capirotoParser.HelloworldContext ctx);
}