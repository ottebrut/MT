package gen;// Generated from C:/Users/ottan/Documents/MT/hw-2/grammar\JavaGrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaGrammarParser}.
 */
public interface JavaGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(JavaGrammarParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(JavaGrammarParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#javaClass}.
	 * @param ctx the parse tree
	 */
	void enterJavaClass(JavaGrammarParser.JavaClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#javaClass}.
	 * @param ctx the parse tree
	 */
	void exitJavaClass(JavaGrammarParser.JavaClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JavaGrammarParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JavaGrammarParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(JavaGrammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(JavaGrammarParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(JavaGrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(JavaGrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(JavaGrammarParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(JavaGrammarParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameters(JavaGrammarParser.FunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameters(JavaGrammarParser.FunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(JavaGrammarParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(JavaGrammarParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatement(JavaGrammarParser.FunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatement(JavaGrammarParser.FunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(JavaGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(JavaGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableTypeAndName}.
	 * @param ctx the parse tree
	 */
	void enterVariableTypeAndName(JavaGrammarParser.VariableTypeAndNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableTypeAndName}.
	 * @param ctx the parse tree
	 */
	void exitVariableTypeAndName(JavaGrammarParser.VariableTypeAndNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(JavaGrammarParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(JavaGrammarParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JavaGrammarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JavaGrammarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#thenStatement}.
	 * @param ctx the parse tree
	 */
	void enterThenStatement(JavaGrammarParser.ThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#thenStatement}.
	 * @param ctx the parse tree
	 */
	void exitThenStatement(JavaGrammarParser.ThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(JavaGrammarParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(JavaGrammarParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#functionInvoke}.
	 * @param ctx the parse tree
	 */
	void enterFunctionInvoke(JavaGrammarParser.FunctionInvokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#functionInvoke}.
	 * @param ctx the parse tree
	 */
	void exitFunctionInvoke(JavaGrammarParser.FunctionInvokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#functionInvokeParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionInvokeParameters(JavaGrammarParser.FunctionInvokeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#functionInvokeParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionInvokeParameters(JavaGrammarParser.FunctionInvokeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#forCycle}.
	 * @param ctx the parse tree
	 */
	void enterForCycle(JavaGrammarParser.ForCycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#forCycle}.
	 * @param ctx the parse tree
	 */
	void exitForCycle(JavaGrammarParser.ForCycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#forCycleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForCycleDeclaration(JavaGrammarParser.ForCycleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#forCycleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForCycleDeclaration(JavaGrammarParser.ForCycleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#whileCycle}.
	 * @param ctx the parse tree
	 */
	void enterWhileCycle(JavaGrammarParser.WhileCycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#whileCycle}.
	 * @param ctx the parse tree
	 */
	void exitWhileCycle(JavaGrammarParser.WhileCycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#whileCycleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterWhileCycleDeclaration(JavaGrammarParser.WhileCycleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#whileCycleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitWhileCycleDeclaration(JavaGrammarParser.WhileCycleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#forLogicStatement}.
	 * @param ctx the parse tree
	 */
	void enterForLogicStatement(JavaGrammarParser.ForLogicStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#forLogicStatement}.
	 * @param ctx the parse tree
	 */
	void exitForLogicStatement(JavaGrammarParser.ForLogicStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#whileLogicStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileLogicStatement(JavaGrammarParser.WhileLogicStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#whileLogicStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileLogicStatement(JavaGrammarParser.WhileLogicStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void enterEqualityOperator(JavaGrammarParser.EqualityOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#equalityOperator}.
	 * @param ctx the parse tree
	 */
	void exitEqualityOperator(JavaGrammarParser.EqualityOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#cycleBody}.
	 * @param ctx the parse tree
	 */
	void enterCycleBody(JavaGrammarParser.CycleBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#cycleBody}.
	 * @param ctx the parse tree
	 */
	void exitCycleBody(JavaGrammarParser.CycleBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JavaGrammarParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JavaGrammarParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#returnValue}.
	 * @param ctx the parse tree
	 */
	void enterReturnValue(JavaGrammarParser.ReturnValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#returnValue}.
	 * @param ctx the parse tree
	 */
	void exitReturnValue(JavaGrammarParser.ReturnValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(JavaGrammarParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(JavaGrammarParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JavaGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JavaGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JavaGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JavaGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(JavaGrammarParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(JavaGrammarParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammarParser#customType}.
	 * @param ctx the parse tree
	 */
	void enterCustomType(JavaGrammarParser.CustomTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammarParser#customType}.
	 * @param ctx the parse tree
	 */
	void exitCustomType(JavaGrammarParser.CustomTypeContext ctx);
}