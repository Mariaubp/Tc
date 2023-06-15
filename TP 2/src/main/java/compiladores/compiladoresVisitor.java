// Generated from /Users/jony/Documents/UBP/VSCode/TC/BaseCompiladores/src/main/java/compiladores/compiladores.g4 by ANTLR 4.9.2

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
	 * Visit a parse tree produced by {@link compiladoresParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(compiladoresParser.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#intr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntr(compiladoresParser.IntrContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(compiladoresParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#listaVarDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaVarDecl(compiladoresParser.ListaVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#varDeclIni}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclIni(compiladoresParser.VarDeclIniContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#varId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarId(compiladoresParser.VarIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#especificarType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEspecificarType(compiladoresParser.EspecificarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#returnEspecificarType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnEspecificarType(compiladoresParser.ReturnEspecificarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#funcDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclaration(compiladoresParser.FuncDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#listaParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaParam(compiladoresParser.ListaParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#bloqueInst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueInst(compiladoresParser.BloqueInstContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#listaDecla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDecla(compiladoresParser.ListaDeclaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#declararEspecifica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclararEspecifica(compiladoresParser.DeclararEspecificaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#selectionDecla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionDecla(compiladoresParser.SelectionDeclaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#iterationDecla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationDecla(compiladoresParser.IterationDeclaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#whileDecla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileDecla(compiladoresParser.WhileDeclaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#forDecla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDecla(compiladoresParser.ForDeclaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#forDefinicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDefinicion(compiladoresParser.ForDefinicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(compiladoresParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#returnDecla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnDecla(compiladoresParser.ReturnDeclaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(compiladoresParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#expresionSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionSimple(compiladoresParser.ExpresionSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(compiladoresParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#expresionRelUnitaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionRelUnitaria(compiladoresParser.ExpresionRelUnitariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#expresionRel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionRel(compiladoresParser.ExpresionRelContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#sumaExpresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumaExpresion(compiladoresParser.SumaExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#operadorSumaAritm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorSumaAritm(compiladoresParser.OperadorSumaAritmContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(compiladoresParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#operadorMultiAritm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorMultiAritm(compiladoresParser.OperadorMultiAritmContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#expresionUnitaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionUnitaria(compiladoresParser.ExpresionUnitariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#operadorUnitaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorUnitaria(compiladoresParser.OperadorUnitariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(compiladoresParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(compiladoresParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#argumento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumento(compiladoresParser.ArgumentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#listaArgumento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaArgumento(compiladoresParser.ListaArgumentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#resValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResValue(compiladoresParser.ResValueContext ctx);
}