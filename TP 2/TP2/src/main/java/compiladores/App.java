package compiladores;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

// Las diferentes entradas se explicaran oportunamente
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("************* Inicio del Compilador *************");
        // create a CharStream that reads from file
        CharStream input = CharStreams.fromFileName("input/Prueba2.txt");

        // create a lexer that feeds off of input CharStream
        compiladoresLexer lexer = new compiladoresLexer(input);
        
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // create a parser that feeds off the tokens buffer
        compiladoresParser parser = new compiladoresParser(tokens);
                
        // create Listener
        compiladoresBaseListener escucha = new Escucha();

        // Conecto el objeto con Listeners al parser
        parser.addParseListener(escucha);

        
        // El parse devuelve un arbol sintactico
        ParseTree tree =  parser.programa();
        
        // Imprime el arbol obtenido
        System.out.println("|-------------- START SEMANTIC TREE --------------|");
        System.out.println(tree.toStringTree(parser));
        System.out.println("|-------------- END SEMANTIC TREE --------------|\n\n");

        
        // System.out.println(escucha);
        
    }
}
