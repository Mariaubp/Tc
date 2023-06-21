// Generated from c:\Users\flore\OneDrive\Documentos\Semestre9\TC\parcial2\tp2\src\main\java\compiladores\compiladores.g4 by ANTLR 4.9.2

package compiladores;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link compiladoresParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface compiladoresVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#concatenacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenacion(compiladoresParser.ConcatenacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#op_logicos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logicos(compiladoresParser.Op_logicosContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#op_booleanas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_booleanas(compiladoresParser.Op_booleanasContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#bucle_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucle_while(compiladoresParser.Bucle_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#condicional_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional_if(compiladoresParser.Condicional_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#bucle_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucle_for(compiladoresParser.Bucle_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_funcion(compiladoresParser.Declaracion_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#declaracion_argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_argumentos(compiladoresParser.Declaracion_argumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#concatenacion_argumentos_declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenacion_argumentos_declaracion(compiladoresParser.Concatenacion_argumentos_declaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#asignacion_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_funcion(compiladoresParser.Asignacion_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#asignacion_argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_argumentos(compiladoresParser.Asignacion_argumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#concatenacion_argumentos_asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenacion_argumentos_asignacion(compiladoresParser.Concatenacion_argumentos_asignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#bloque_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_funcion(compiladoresParser.Bloque_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#instrucciones_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones_funcion(compiladoresParser.Instrucciones_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#instruccion_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion_funcion(compiladoresParser.Instruccion_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#return_tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_tipo(compiladoresParser.Return_tipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#tipo_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_var(compiladoresParser.Tipo_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#post_pre_incremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPost_pre_incremento(compiladoresParser.Post_pre_incrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(compiladoresParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#comparadores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparadores(compiladoresParser.ComparadoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(compiladoresParser.EContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(compiladoresParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(compiladoresParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(compiladoresParser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(compiladoresParser.FactorContext ctx);
}