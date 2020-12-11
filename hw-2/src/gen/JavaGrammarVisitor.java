package gen;// Generated from C:/Users/ottan/Documents/MT/hw-2/grammar\JavaGrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(JavaGrammarParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#javaClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJavaClass(JavaGrammarParser.JavaClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(JavaGrammarParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(JavaGrammarParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(JavaGrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(JavaGrammarParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#functionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameters(JavaGrammarParser.FunctionParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(JavaGrammarParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatement(JavaGrammarParser.FunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(JavaGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#variableTypeAndName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableTypeAndName(JavaGrammarParser.VariableTypeAndNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(JavaGrammarParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(JavaGrammarParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#thenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThenStatement(JavaGrammarParser.ThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(JavaGrammarParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#functionInvoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionInvoke(JavaGrammarParser.FunctionInvokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#functionInvokeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionInvokeParameters(JavaGrammarParser.FunctionInvokeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#forCycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCycle(JavaGrammarParser.ForCycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#forCycleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCycleDeclaration(JavaGrammarParser.ForCycleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#whileCycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileCycle(JavaGrammarParser.WhileCycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#whileCycleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileCycleDeclaration(JavaGrammarParser.WhileCycleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#forLogicStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLogicStatement(JavaGrammarParser.ForLogicStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#whileLogicStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLogicStatement(JavaGrammarParser.WhileLogicStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#equalityOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityOperator(JavaGrammarParser.EqualityOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#cycleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycleBody(JavaGrammarParser.CycleBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(JavaGrammarParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#returnValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnValue(JavaGrammarParser.ReturnValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(JavaGrammarParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JavaGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(JavaGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(JavaGrammarParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammarParser#customType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomType(JavaGrammarParser.CustomTypeContext ctx);
}