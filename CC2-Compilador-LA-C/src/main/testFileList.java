package main;

/*import Semantic.SemanticUtil;
import antlr.LAGrammar1Lexer;
import antlr.LAGrammar1Parser;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;*/

/**
 *
 * @author Lucas
 */
public class testFileList {

    /*static File dir = new File("testFiles/sem_erro");
    //static File dir = new File("testFiles/erro_semantico");
    //static File dir = new File("testFiles/erro_sintatico");
    static ArrayList<File> algoritmos;

    public static void main(String... args) {
        algoritmos = new ArrayList<>();
        
        for (final File fileEntry : dir.listFiles()) {
            if (!fileEntry.isDirectory() && fileEntry.getName().contains(".alg")) {
                algoritmos.add(fileEntry);
            }
        }
        
        for(File f : algoritmos){
            System.out.println("\nFile: "+f.getName());
            int errors = parse(f);
            String syntaticResult = (errors>0?(errors+" syntax erros."):"");
            String semanticResult = (SemanticUtil.hasErrors()?" Semantic errors!": "");
            String result = (
                    (syntaticResult.length()+semanticResult.length())>0?
                    syntaticResult+semanticResult
                    :
                    "Success");
            System.out.println("\nResult: "+result+"\n");
            SemanticUtil.reset();
        }
    }
    
    private static int parse(File f){
        //Stream de texto
        ANTLRInputStream inputStream = null;
        try {
            inputStream = new ANTLRInputStream(new FileInputStream(f));
        } catch (IOException ex) {
            Logger.getLogger(testFileList.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(inputStream == null){
            System.err.println("Couldn't read file!");
            return 0;
        }
        
        //Lexer para gerar os tokens
        LAGrammar1Lexer lexer = new LAGrammar1Lexer(inputStream);
        //Estrutura comum de stream de tokens
        CommonTokenStream stream = new CommonTokenStream(lexer);
        //Parser do programa
        LAGrammar1Parser parser = new LAGrammar1Parser(stream);
        
        //Chama o token inicial
        parser.programa();
        
        return parser.getNumberOfSyntaxErrors();
    }*/
}
