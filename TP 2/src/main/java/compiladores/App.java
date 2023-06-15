package compiladores;

/**
 *
 * @author Jonthan Mora Colodrero - Constanza Gigli
 */

import java.io.FileInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

// Las diferentes entradas se explicaran oportunamente
public class App {
    public static void main(String[] args){ //throws Exception 
        try{
            //System.out.println("Hello, Compilador!!!");
            // create a CharStream that reads from file
            CharStream input = CharStreams.fromFileName("input/programa.txt");

            String testPath = "/Users/jony/Documents/UBP/VSCode/TC/BaseCompiladores/src/main/java/compiladores/test/";
            // create a CharStream that reads from file
            //ANTLRFileStream input = new ANTLRFileStream("prueba.c");

            // create a lexer that feeds off of input CharStream
            compiladoresLexer lexer = new compiladoresLexer(input);
            //LEXER : reconocer las palabras y generar el lenguaje


            // create a buffer of tokens pulled from the lexer

            //tokenstream: una cadena de tokens
            //a travez de los tokens se arma el arbol sintactico 
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            // create a parser that feeds off the tokens buffer
            //por eficiencia el PARSER se pide tokens 
            compiladoresParser parser = new compiladoresParser(tokens);
            //PARSER arma el arbol       
            
            // create Listener
            compiladoresBaseListener escucha = new Escucha();       // crea el parser para escucha
            // Conecto el objeto con Listeners al parser
            parser.addParseListener(escucha);           //conecta el parser con el listener 

            ParseTree tree = parser.programa();
            
            // Imprime estadisticas
            System.out.println(escucha);
            // Imprime el arbol obtenido
            System.out.println(tree.toStringTree(parser));         
            
        } catch (Exception e) {
            System.out.println("Error");
    
            //cualquier error, capturamos la exception.   
            e.printStackTrace();
        }
    }
        
    /* 
        // Solicito al parser que comience indicando una regla gramatical
        // En este caso la regla es el simbolo inicial

        //parser.s();              // con este se ejecuta y listo, con el de abajo compila y guarda el arbol 
        ParseTree tree =  parser.programa();
        // Conectamos el visitor
        Caminante walker = new Caminante();     // crea la clase de tipo VISITOR    
        walker.visit(tree);                 //recorre el arbol = visita el arbol
        // System.out.println(visitor);
        //System.out.println(visitor.getErrorNodes());
        // Imprime el arbol obtenido
         System.out.println(tree.toStringTree(parser));  // MUESTRA EL ARBOL
        // System.out.println(escucha);
      */  
    }

