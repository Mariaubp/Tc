// Generated from c:\Users\flore\OneDrive\Documentos\Semestre9\TC\parcial2\tp2\src\main\java\compiladores\compiladores.g4 by ANTLR 4.9.2

package compiladores;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compiladoresParser}.
 */
public interface compiladoresListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#concatenacion}.
	 * @param ctx the parse tree
	 */
	void enterConcatenacion(compiladoresParser.ConcatenacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#concatenacion}.
	 * @param ctx the parse tree
	 */
	void exitConcatenacion(compiladoresParser.ConcatenacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#op_logicos}.
	 * @param ctx the parse tree
	 */
	void enterOp_logicos(compiladoresParser.Op_logicosContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#op_logicos}.
	 * @param ctx the parse tree
	 */
	void exitOp_logicos(compiladoresParser.Op_logicosContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#op_booleanas}.
	 * @param ctx the parse tree
	 */
	void enterOp_booleanas(compiladoresParser.Op_booleanasContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#op_booleanas}.
	 * @param ctx the parse tree
	 */
	void exitOp_booleanas(compiladoresParser.Op_booleanasContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#bucle_while}.
	 * @param ctx the parse tree
	 */
	void enterBucle_while(compiladoresParser.Bucle_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#bucle_while}.
	 * @param ctx the parse tree
	 */
	void exitBucle_while(compiladoresParser.Bucle_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#condicional_if}.
	 * @param ctx the parse tree
	 */
	void enterCondicional_if(compiladoresParser.Condicional_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#condicional_if}.
	 * @param ctx the parse tree
	 */
	void exitCondicional_if(compiladoresParser.Condicional_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#bucle_for}.
	 * @param ctx the parse tree
	 */
	void enterBucle_for(compiladoresParser.Bucle_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#bucle_for}.
	 * @param ctx the parse tree
	 */
	void exitBucle_for(compiladoresParser.Bucle_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_funcion(compiladoresParser.Declaracion_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_funcion(compiladoresParser.Declaracion_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#declaracion_argumentos}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_argumentos(compiladoresParser.Declaracion_argumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#declaracion_argumentos}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_argumentos(compiladoresParser.Declaracion_argumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#concatenacion_argumentos_declaracion}.
	 * @param ctx the parse tree
	 */
	void enterConcatenacion_argumentos_declaracion(compiladoresParser.Concatenacion_argumentos_declaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#concatenacion_argumentos_declaracion}.
	 * @param ctx the parse tree
	 */
	void exitConcatenacion_argumentos_declaracion(compiladoresParser.Concatenacion_argumentos_declaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#asignacion_funcion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_funcion(compiladoresParser.Asignacion_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#asignacion_funcion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_funcion(compiladoresParser.Asignacion_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#asignacion_argumentos}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_argumentos(compiladoresParser.Asignacion_argumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#asignacion_argumentos}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_argumentos(compiladoresParser.Asignacion_argumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#concatenacion_argumentos_asignacion}.
	 * @param ctx the parse tree
	 */
	void enterConcatenacion_argumentos_asignacion(compiladoresParser.Concatenacion_argumentos_asignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#concatenacion_argumentos_asignacion}.
	 * @param ctx the parse tree
	 */
	void exitConcatenacion_argumentos_asignacion(compiladoresParser.Concatenacion_argumentos_asignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#bloque_funcion}.
	 * @param ctx the parse tree
	 */
	void enterBloque_funcion(compiladoresParser.Bloque_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#bloque_funcion}.
	 * @param ctx the parse tree
	 */
	void exitBloque_funcion(compiladoresParser.Bloque_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#instrucciones_funcion}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones_funcion(compiladoresParser.Instrucciones_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instrucciones_funcion}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones_funcion(compiladoresParser.Instrucciones_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#instruccion_funcion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion_funcion(compiladoresParser.Instruccion_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instruccion_funcion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion_funcion(compiladoresParser.Instruccion_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#return_tipo}.
	 * @param ctx the parse tree
	 */
	void enterReturn_tipo(compiladoresParser.Return_tipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#return_tipo}.
	 * @param ctx the parse tree
	 */
	void exitReturn_tipo(compiladoresParser.Return_tipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#tipo_var}.
	 * @param ctx the parse tree
	 */
	void enterTipo_var(compiladoresParser.Tipo_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#tipo_var}.
	 * @param ctx the parse tree
	 */
	void exitTipo_var(compiladoresParser.Tipo_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#post_pre_incremento}.
	 * @param ctx the parse tree
	 */
	void enterPost_pre_incremento(compiladoresParser.Post_pre_incrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#post_pre_incremento}.
	 * @param ctx the parse tree
	 */
	void exitPost_pre_incremento(compiladoresParser.Post_pre_incrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(compiladoresParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(compiladoresParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#comparadores}.
	 * @param ctx the parse tree
	 */
	void enterComparadores(compiladoresParser.ComparadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#comparadores}.
	 * @param ctx the parse tree
	 */
	void exitComparadores(compiladoresParser.ComparadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(compiladoresParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(compiladoresParser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(compiladoresParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(compiladoresParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(compiladoresParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(compiladoresParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(compiladoresParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(compiladoresParser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(compiladoresParser.FactorContext ctx);
}