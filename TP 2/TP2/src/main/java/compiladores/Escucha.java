package compiladores;

import compiladores.compiladoresParser.BloqueContext;
import compiladores.compiladoresParser.ConcatenacionContext;
import compiladores.compiladoresParser.CondContext;
import compiladores.compiladoresParser.EContext;
import compiladores.compiladoresParser.ProgramaContext;

import java.util.ArrayList;
import java.util.HashMap;

import compiladores.Clases.*;

public class Escucha extends compiladoresBaseListener {

    // Variable para indicar si se debe mostrar la tabla de símbolos
    private boolean showTabla = true;

    // Instancia de la tabla de símbolos
    private TablaDeSimbolos TablaSimbolos = TablaDeSimbolos.getInstance();

    // Lista para almacenar las variables no utilizadas
    private ArrayList<ID> noUsadas = new ArrayList<ID>();

    @Override
    public void exitCond(CondContext ctx) {

        // Verificación semántica: se verifica que las variables utilizadas en la condición estén declaradas
        boolean isViable = true;
        for (EContext e : ctx.e()) {
            if (e.term().factor().VAR() != null) {
                if (!this.TablaSimbolos.isVariableDeclared(e.term().factor().VAR().getText())) {
                    System.out.println("Error semantico --> La variable " + e.term().factor().VAR().getText() + " no esta declarada");
                    isViable = false;
                }
            }
        }

        // Si las variables son viables, se marcan como utilizadas en la tabla de símbolos
        if (isViable) {
            for (EContext e : ctx.e()) {
                if (e.term().factor().VAR() != null) {
                    this.TablaSimbolos.setUsedId(e.term().factor().VAR().getText());
                }
            }
        }
    }

    @Override
    public void enterBloque(BloqueContext ctx) {
        // Agrega un contexto a la tabla de símbolos
        this.TablaSimbolos.addContext();
    }

    @Override
    public void exitDeclaracion(compiladoresParser.DeclaracionContext declaracionInicial) {

        ID.TipoDato varActual = null;

        // Guarda el tipo de variable en una variable
        if (declaracionInicial.INT() != null) {
            varActual = ID.TipoDato.valueOf("INT");
        } else if (declaracionInicial.DOUBLE() != null) {
            varActual = ID.TipoDato.valueOf("DOUBLE");
        } else if (declaracionInicial.BOOL() != null) {
            varActual = ID.TipoDato.valueOf("BOOL");
        }

        // Crea una instancia de la variable con el tipo y el nombre especificados
        ID id = new Variable(varActual, declaracionInicial.VAR().getText());

        // Agrega la variable a la tabla de símbolos si no está declarada previamente
        if (!this.TablaSimbolos.isVariableDeclared(id.getNombre())) {
            this.TablaSimbolos.addId(id);
        } else {
            System.out.println("\nError semantico --> La variable " + id.getNombre() + " ya existe");
        }

        // Si hay una concatenación, crea las variables adicionales y las agrega a la tabla de símbolos
        if (declaracionInicial.concatenacion().getText() != "") {

            ConcatenacionContext concatCtx = declaracionInicial.concatenacion();

            do {
                id = new Variable(varActual, concatCtx.VAR().getText());
                if (!this.TablaSimbolos.isVariableDeclared(id.getNombre())) {
                    this.TablaSimbolos.addId(id);
                } else {
                    System.out.println("\nError semantico --> La variable " + id.getNombre() + " ya existe");
                }
                concatCtx = concatCtx.concatenacion();
            } while (concatCtx.getText() != "");
        }

    }

    @Override
    public void exitAsignacion(compiladoresParser.AsignacionContext ctxAsignacion) {

        // Verifica si la variable de la izquierda está declarada en la tabla de símbolos
        if (this.TablaSimbolos.isVariableDeclared(ctxAsignacion.VAR(0).getText())) {

            // Obtiene la variable de la tabla de símbolos
            Variable varTabla = this.TablaSimbolos.getVariableDeclared(ctxAsignacion.VAR(0).getText());

            // Variable para almacenar el tipo de dato de los valores primitivos
            ID.TipoDato varActual = null;

            // Si el valor asignado es un entero
            if (ctxAsignacion.ENTERO() != null) {
                varActual = ID.TipoDato.valueOf("INT");
            } else if (ctxAsignacion.DOBLE() != null) { // Si el valor asignado es un doble
                varActual = ID.TipoDato.valueOf("DOUBLE");
            } else if (ctxAsignacion.BOOLEANO() != null) { // Si el valor asignado es un booleano
                varActual = ID.TipoDato.valueOf("BOOL");
            } else if (ctxAsignacion.VAR() != null) { // Si es una asignación de variables

                // Verifica si la variable de la derecha está declarada en la tabla de símbolos
                if (this.TablaSimbolos.isVariableDeclared(ctxAsignacion.VAR(1).getText())) {

                    // Obtiene la variable de la derecha de la tabla de símbolos
                    Variable varDerecha = this.TablaSimbolos.getVariableDeclared(ctxAsignacion.VAR(1).getText());

                    // Verifica si las variables son del mismo tipo
                    if (varTabla.getTipo() == varDerecha.getTipo()) {

                        // Verifica si la variable de la derecha está inicializada
                        if (varDerecha.getValor() != null) {

                            // Asigna el valor de la variable de la derecha a la variable de la izquierda
                            varTabla.setValor(varDerecha.getValor());

                            // Marca la variable de la derecha como utilizada
                            varDerecha.setUsada(true);

                            // Actualiza la variable de la izquierda en la tabla de símbolos
                            this.TablaSimbolos.asignacionId(varTabla);

                            // Actualiza la variable de la derecha en la tabla de símbolos
                            this.TablaSimbolos.asignacionId(varDerecha);

                        } else {
                            System.out.println("\nError semantico --> La segunda variable no esta inicializada");
                        }
                    } else {
                        System.out.println("\nError semantico --> Las dos variables no son del mismo tipo");
                    }
                } else {
                    System.out.println("\nError semantico --> La segunda variable no esta declarada");
                }
            }

            // Si se asigna un valor primitivo
            if (varActual != null) {
                // Si el valor asignado es del mismo tipo que la variable
                if (varActual == varTabla.getTipo()) {

                    if (ctxAsignacion.ENTERO() != null) {
                        varTabla.setValor(ctxAsignacion.ENTERO().getText());
                    } else if (ctxAsignacion.DOBLE() != null) {
                        varTabla.setValor(ctxAsignacion.DOBLE().getText());
                    } else if (ctxAsignacion.BOOLEANO() != null) {
                        varTabla.setValor(ctxAsignacion.BOOLEANO().getText());
                    }

                    // Actualiza la variable en la tabla de símbolos
                    this.TablaSimbolos.asignacionId(varTabla);
                } else {
                    System.out.println("\nError semantico --> Se intenta declarar de un tipo diferente - ERROR");
                }
            }

        } else {
            System.out.println("\nError --> No se puede inicializar una variable no declarada");
        }
    }

    @Override
    public void exitBloque(BloqueContext ctx) {

        // Extrae el último contexto para verificar si todas las variables dentro de él fueron utilizadas
        HashMap<String, ID> lastContext = this.TablaSimbolos.getLastContext();

        // Itera a través de los valores del HashMap
        for (ID id : lastContext.values()) {
            // Si el ID es una Variable y no fue utilizada
            if (id.getClass().equals(Variable.class) && !id.getUsada()) {
                System.out.println("\nError semantico --> La variable " + id + " no fue utilizada");
            }
        }

        // Elimina el último contexto
        this.TablaSimbolos.removeContext();
    }

    @Override
    public void enterPrograma(ProgramaContext ctx) {
        System.out.println("\n\n\n");
    }

    @Override
    public void exitPrograma(ProgramaContext ctx) {
        // Verifica las variables no utilizadas
        for (ID id : noUsadas) {
            System.out.println("\n Error semantico --> La variable " + id + " no fue utilizada");
        }

        if (showTabla) {
            // Imprime la tabla de símbolos
            System.out.println("\n************** START SYMBOL TABLE ***************");
            this.TablaSimbolos.printTable(true);
            System.out.println("\n************** END SYMBOL TABLE ***************");
        }

        System.out.println("\n\n");
    }
}

