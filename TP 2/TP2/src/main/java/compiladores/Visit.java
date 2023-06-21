package compiladores;

import compiladores.compiladoresParser.ProgramaContext;

//recorrer y procesar los nodos del arbol
public class Visit extends compiladoresBaseVisitor<String> {

    @Override
    public String visitPrograma(ProgramaContext ctx) {
        System.out.println("Recorrer el arbol");

        // Invoca al método visitPrograma de la clase padre y devuelve el resultado
        return super.visitPrograma(ctx);
    }
    
}
