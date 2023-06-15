// Generated from /Users/jony/Documents/UBP/VSCode/TC/BaseCompiladores/src/main/java/compiladores/compiladores.g4 by ANTLR 4.9.2

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
	 * Enter a parse tree produced by {@link compiladoresParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(compiladoresParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(compiladoresParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#intr}.
	 * @param ctx the parse tree
	 */
	void enterIntr(compiladoresParser.IntrContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#intr}.
	 * @param ctx the parse tree
	 */
	void exitIntr(compiladoresParser.IntrContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(compiladoresParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(compiladoresParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#listaVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterListaVarDecl(compiladoresParser.ListaVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#listaVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitListaVarDecl(compiladoresParser.ListaVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#varDeclIni}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclIni(compiladoresParser.VarDeclIniContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#varDeclIni}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclIni(compiladoresParser.VarDeclIniContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#varId}.
	 * @param ctx the parse tree
	 */
	void enterVarId(compiladoresParser.VarIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#varId}.
	 * @param ctx the parse tree
	 */
	void exitVarId(compiladoresParser.VarIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#especificarType}.
	 * @param ctx the parse tree
	 */
	void enterEspecificarType(compiladoresParser.EspecificarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#especificarType}.
	 * @param ctx the parse tree
	 */
	void exitEspecificarType(compiladoresParser.EspecificarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#returnEspecificarType}.
	 * @param ctx the parse tree
	 */
	void enterReturnEspecificarType(compiladoresParser.ReturnEspecificarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#returnEspecificarType}.
	 * @param ctx the parse tree
	 */
	void exitReturnEspecificarType(compiladoresParser.ReturnEspecificarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#funcDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclaration(compiladoresParser.FuncDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#funcDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclaration(compiladoresParser.FuncDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#listaParam}.
	 * @param ctx the parse tree
	 */
	void enterListaParam(compiladoresParser.ListaParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#listaParam}.
	 * @param ctx the parse tree
	 */
	void exitListaParam(compiladoresParser.ListaParamContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#bloqueInst}.
	 * @param ctx the parse tree
	 */
	void enterBloqueInst(compiladoresParser.BloqueInstContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#bloqueInst}.
	 * @param ctx the parse tree
	 */
	void exitBloqueInst(compiladoresParser.BloqueInstContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#listaDecla}.
	 * @param ctx the parse tree
	 */
	void enterListaDecla(compiladoresParser.ListaDeclaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#listaDecla}.
	 * @param ctx the parse tree
	 */
	void exitListaDecla(compiladoresParser.ListaDeclaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#declararEspecifica}.
	 * @param ctx the parse tree
	 */
	void enterDeclararEspecifica(compiladoresParser.DeclararEspecificaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#declararEspecifica}.
	 * @param ctx the parse tree
	 */
	void exitDeclararEspecifica(compiladoresParser.DeclararEspecificaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#selectionDecla}.
	 * @param ctx the parse tree
	 */
	void enterSelectionDecla(compiladoresParser.SelectionDeclaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#selectionDecla}.
	 * @param ctx the parse tree
	 */
	void exitSelectionDecla(compiladoresParser.SelectionDeclaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#iterationDecla}.
	 * @param ctx the parse tree
	 */
	void enterIterationDecla(compiladoresParser.IterationDeclaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#iterationDecla}.
	 * @param ctx the parse tree
	 */
	void exitIterationDecla(compiladoresParser.IterationDeclaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#whileDecla}.
	 * @param ctx the parse tree
	 */
	void enterWhileDecla(compiladoresParser.WhileDeclaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#whileDecla}.
	 * @param ctx the parse tree
	 */
	void exitWhileDecla(compiladoresParser.WhileDeclaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#forDecla}.
	 * @param ctx the parse tree
	 */
	void enterForDecla(compiladoresParser.ForDeclaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#forDecla}.
	 * @param ctx the parse tree
	 */
	void exitForDecla(compiladoresParser.ForDeclaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#forDefinicion}.
	 * @param ctx the parse tree
	 */
	void enterForDefinicion(compiladoresParser.ForDefinicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#forDefinicion}.
	 * @param ctx the parse tree
	 */
	void exitForDefinicion(compiladoresParser.ForDefinicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(compiladoresParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(compiladoresParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#returnDecla}.
	 * @param ctx the parse tree
	 */
	void enterReturnDecla(compiladoresParser.ReturnDeclaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#returnDecla}.
	 * @param ctx the parse tree
	 */
	void exitReturnDecla(compiladoresParser.ReturnDeclaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(compiladoresParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(compiladoresParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#expresionSimple}.
	 * @param ctx the parse tree
	 */
	void enterExpresionSimple(compiladoresParser.ExpresionSimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#expresionSimple}.
	 * @param ctx the parse tree
	 */
	void exitExpresionSimple(compiladoresParser.ExpresionSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(compiladoresParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(compiladoresParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#expresionRelUnitaria}.
	 * @param ctx the parse tree
	 */
	void enterExpresionRelUnitaria(compiladoresParser.ExpresionRelUnitariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#expresionRelUnitaria}.
	 * @param ctx the parse tree
	 */
	void exitExpresionRelUnitaria(compiladoresParser.ExpresionRelUnitariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#expresionRel}.
	 * @param ctx the parse tree
	 */
	void enterExpresionRel(compiladoresParser.ExpresionRelContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#expresionRel}.
	 * @param ctx the parse tree
	 */
	void exitExpresionRel(compiladoresParser.ExpresionRelContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#sumaExpresion}.
	 * @param ctx the parse tree
	 */
	void enterSumaExpresion(compiladoresParser.SumaExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#sumaExpresion}.
	 * @param ctx the parse tree
	 */
	void exitSumaExpresion(compiladoresParser.SumaExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#operadorSumaAritm}.
	 * @param ctx the parse tree
	 */
	void enterOperadorSumaAritm(compiladoresParser.OperadorSumaAritmContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#operadorSumaAritm}.
	 * @param ctx the parse tree
	 */
	void exitOperadorSumaAritm(compiladoresParser.OperadorSumaAritmContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#operadorMultiAritm}.
	 * @param ctx the parse tree
	 */
	void enterOperadorMultiAritm(compiladoresParser.OperadorMultiAritmContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#operadorMultiAritm}.
	 * @param ctx the parse tree
	 */
	void exitOperadorMultiAritm(compiladoresParser.OperadorMultiAritmContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#expresionUnitaria}.
	 * @param ctx the parse tree
	 */
	void enterExpresionUnitaria(compiladoresParser.ExpresionUnitariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#expresionUnitaria}.
	 * @param ctx the parse tree
	 */
	void exitExpresionUnitaria(compiladoresParser.ExpresionUnitariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#operadorUnitaria}.
	 * @param ctx the parse tree
	 */
	void enterOperadorUnitaria(compiladoresParser.OperadorUnitariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#operadorUnitaria}.
	 * @param ctx the parse tree
	 */
	void exitOperadorUnitaria(compiladoresParser.OperadorUnitariaContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(compiladoresParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(compiladoresParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(compiladoresParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(compiladoresParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#argumento}.
	 * @param ctx the parse tree
	 */
	void enterArgumento(compiladoresParser.ArgumentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#argumento}.
	 * @param ctx the parse tree
	 */
	void exitArgumento(compiladoresParser.ArgumentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#listaArgumento}.
	 * @param ctx the parse tree
	 */
	void enterListaArgumento(compiladoresParser.ListaArgumentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#listaArgumento}.
	 * @param ctx the parse tree
	 */
	void exitListaArgumento(compiladoresParser.ListaArgumentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#resValue}.
	 * @param ctx the parse tree
	 */
	void enterResValue(compiladoresParser.ResValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#resValue}.
	 * @param ctx the parse tree
	 */
	void exitResValue(compiladoresParser.ResValueContext ctx);
}