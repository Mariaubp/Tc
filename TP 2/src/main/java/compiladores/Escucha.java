package compiladores;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

//import compiladores.compiladoresParser.AsignacionContext;
import compiladores.compiladoresParser.ProgramaContext;

/**
 *
 * @author Jonathan Mora
 */
/** 
 * Esta clase proporciona una implementación vacía de {@link Escucha}, 
 * que se puede ampliar para crear un oyente que solo necesita manejar 
 * un subconjunto de los métodos disponibles.
 */

public class Escucha extends compiladoresBaseListener{
    private int cantidadNodos;
    
    public Escucha () {
        cantidadNodos = 0;
    }
    
    @Override public void enterInstructions(compiladoresParser.InstructionsContext ctx) {
        System.out.println("Entrando a nodo Instr");
        cantidadNodos++;
    }
//    @Override public void exitVarDeclaration(@NotNull compiladoresParser.VarDeclarationContext ctx) {
//        System.out.println("Entrando a nodo VarDeclaration");
//        System.out.println(ctx.getText()); 
//    }
    
    @Override 
    public void exitPyC(compiladoresParser.PYCContext ctx) { 
        if(ctx.PYC()!=null){
            if(!ctx.PYC().getText().equals(";")){ //Si esta, devuelve ";", sino "<missing ';'>"... Comparamos negativamente
             System.out.println("Error sintáctico: Falta punto y coma.(Linea "+ctx.getParent().start.getLine()+")");
            }
        }
    }    
    
   
    @Override
    public void visitTerminal(TerminalNode node) {
//        System.out.println(node);
    }
    
    @Override
    public String toString () {
        return "Soy Escucha y he visitado " + cantidadNodos + " nodos";
    }
}





/* 
public class Escucha extends compiladoresBaseListener {
    private Integer nodos = 0;
    private Integer tokens = 0;
    private Integer errores = 0;

    //todos los CTX son subarboles
    @Override
    public void enterPrograma(ProgramaContext ctx) {
        System.out.println("\nComienza el parsing...");
        super.enterPrograma(ctx);
    }

    @Override
    public void exitPrograma(ProgramaContext ctx) {
        super.exitPrograma(ctx);
        System.out.println("Termina el parsing...");
        System.out.println("\nSe visitaron " + nodos + " nodos");
        System.out.println("- Hay " + tokens + " tokens");
        System.out.println("\nSe encontraron " + errores + " errores");
        
    }

    @Override
    public void enterAsignacion(AsignacionContext ctx) {
        System.out.println("\nNueva asignacion: | " + ctx.getText() + " | - hijos = " + ctx.getChildCount());
        super.enterAsignacion(ctx);
    }

    @Override
    public void exitAsignacion(AsignacionContext ctx) {
        System.out.println("\n --> Fin asignacion: | " + ctx.getText() + " | - hijos = " + ctx.getChildCount());
        super.exitAsignacion(ctx);
    }
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        nodos++;
        super.enterEveryRule(ctx);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        errores++;
        super.visitErrorNode(node);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        tokens++;
        super.visitTerminal(node);
    }
}
*/
