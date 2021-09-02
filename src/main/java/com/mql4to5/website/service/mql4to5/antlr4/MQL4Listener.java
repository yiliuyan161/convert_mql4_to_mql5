// Generated from antlr4\MQL4.g4 by ANTLR 4.8

package com.mql4to5.website.service.mql4to5.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MQL4Parser}.
 */
public interface MQL4Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#translationunit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationunit(MQL4Parser.TranslationunitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#translationunit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationunit(MQL4Parser.TranslationunitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#primaryexpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryexpression(MQL4Parser.PrimaryexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#primaryexpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryexpression(MQL4Parser.PrimaryexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#idexpression}.
	 * @param ctx the parse tree
	 */
	void enterIdexpression(MQL4Parser.IdexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#idexpression}.
	 * @param ctx the parse tree
	 */
	void exitIdexpression(MQL4Parser.IdexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#unqualifiedid}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedid(MQL4Parser.UnqualifiedidContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#unqualifiedid}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedid(MQL4Parser.UnqualifiedidContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#qualifiedid}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedid(MQL4Parser.QualifiedidContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#qualifiedid}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedid(MQL4Parser.QualifiedidContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#nestednamespecifier}.
	 * @param ctx the parse tree
	 */
	void enterNestednamespecifier(MQL4Parser.NestednamespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#nestednamespecifier}.
	 * @param ctx the parse tree
	 */
	void exitNestednamespecifier(MQL4Parser.NestednamespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#lambdaexpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaexpression(MQL4Parser.LambdaexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#lambdaexpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaexpression(MQL4Parser.LambdaexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#lambdaintroducer}.
	 * @param ctx the parse tree
	 */
	void enterLambdaintroducer(MQL4Parser.LambdaintroducerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#lambdaintroducer}.
	 * @param ctx the parse tree
	 */
	void exitLambdaintroducer(MQL4Parser.LambdaintroducerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#lambdacapture}.
	 * @param ctx the parse tree
	 */
	void enterLambdacapture(MQL4Parser.LambdacaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#lambdacapture}.
	 * @param ctx the parse tree
	 */
	void exitLambdacapture(MQL4Parser.LambdacaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#capturedefault}.
	 * @param ctx the parse tree
	 */
	void enterCapturedefault(MQL4Parser.CapturedefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#capturedefault}.
	 * @param ctx the parse tree
	 */
	void exitCapturedefault(MQL4Parser.CapturedefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#capturelist}.
	 * @param ctx the parse tree
	 */
	void enterCapturelist(MQL4Parser.CapturelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#capturelist}.
	 * @param ctx the parse tree
	 */
	void exitCapturelist(MQL4Parser.CapturelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#capture}.
	 * @param ctx the parse tree
	 */
	void enterCapture(MQL4Parser.CaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#capture}.
	 * @param ctx the parse tree
	 */
	void exitCapture(MQL4Parser.CaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#simplecapture}.
	 * @param ctx the parse tree
	 */
	void enterSimplecapture(MQL4Parser.SimplecaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#simplecapture}.
	 * @param ctx the parse tree
	 */
	void exitSimplecapture(MQL4Parser.SimplecaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#initcapture}.
	 * @param ctx the parse tree
	 */
	void enterInitcapture(MQL4Parser.InitcaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#initcapture}.
	 * @param ctx the parse tree
	 */
	void exitInitcapture(MQL4Parser.InitcaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#lambdadeclarator}.
	 * @param ctx the parse tree
	 */
	void enterLambdadeclarator(MQL4Parser.LambdadeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#lambdadeclarator}.
	 * @param ctx the parse tree
	 */
	void exitLambdadeclarator(MQL4Parser.LambdadeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pExpression}
	 * labeled alternative in {@link MQL4Parser#postfixexpression}.
	 * @param ctx the parse tree
	 */
	void enterPExpression(MQL4Parser.PExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pExpression}
	 * labeled alternative in {@link MQL4Parser#postfixexpression}.
	 * @param ctx the parse tree
	 */
	void exitPExpression(MQL4Parser.PExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link MQL4Parser#postfixexpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(MQL4Parser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link MQL4Parser#postfixexpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(MQL4Parser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayCall}
	 * labeled alternative in {@link MQL4Parser#postfixexpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCall(MQL4Parser.ArrayCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayCall}
	 * labeled alternative in {@link MQL4Parser#postfixexpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCall(MQL4Parser.ArrayCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#typeidofexpr}.
	 * @param ctx the parse tree
	 */
	void enterTypeidofexpr(MQL4Parser.TypeidofexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#typeidofexpr}.
	 * @param ctx the parse tree
	 */
	void exitTypeidofexpr(MQL4Parser.TypeidofexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#typeidofthetypeid}.
	 * @param ctx the parse tree
	 */
	void enterTypeidofthetypeid(MQL4Parser.TypeidofthetypeidContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#typeidofthetypeid}.
	 * @param ctx the parse tree
	 */
	void exitTypeidofthetypeid(MQL4Parser.TypeidofthetypeidContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void enterExpressionlist(MQL4Parser.ExpressionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void exitExpressionlist(MQL4Parser.ExpressionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#pseudodestructorname}.
	 * @param ctx the parse tree
	 */
	void enterPseudodestructorname(MQL4Parser.PseudodestructornameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#pseudodestructorname}.
	 * @param ctx the parse tree
	 */
	void exitPseudodestructorname(MQL4Parser.PseudodestructornameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#unaryexpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryexpression(MQL4Parser.UnaryexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#unaryexpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryexpression(MQL4Parser.UnaryexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#unaryoperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryoperator(MQL4Parser.UnaryoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#unaryoperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryoperator(MQL4Parser.UnaryoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#newexpression}.
	 * @param ctx the parse tree
	 */
	void enterNewexpression(MQL4Parser.NewexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#newexpression}.
	 * @param ctx the parse tree
	 */
	void exitNewexpression(MQL4Parser.NewexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#newplacement}.
	 * @param ctx the parse tree
	 */
	void enterNewplacement(MQL4Parser.NewplacementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#newplacement}.
	 * @param ctx the parse tree
	 */
	void exitNewplacement(MQL4Parser.NewplacementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#newtypeid}.
	 * @param ctx the parse tree
	 */
	void enterNewtypeid(MQL4Parser.NewtypeidContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#newtypeid}.
	 * @param ctx the parse tree
	 */
	void exitNewtypeid(MQL4Parser.NewtypeidContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#newdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNewdeclarator(MQL4Parser.NewdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#newdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNewdeclarator(MQL4Parser.NewdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#noptrnewdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptrnewdeclarator(MQL4Parser.NoptrnewdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#noptrnewdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptrnewdeclarator(MQL4Parser.NoptrnewdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#newinitializer}.
	 * @param ctx the parse tree
	 */
	void enterNewinitializer(MQL4Parser.NewinitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#newinitializer}.
	 * @param ctx the parse tree
	 */
	void exitNewinitializer(MQL4Parser.NewinitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#deleteexpression}.
	 * @param ctx the parse tree
	 */
	void enterDeleteexpression(MQL4Parser.DeleteexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#deleteexpression}.
	 * @param ctx the parse tree
	 */
	void exitDeleteexpression(MQL4Parser.DeleteexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#noexceptexpression}.
	 * @param ctx the parse tree
	 */
	void enterNoexceptexpression(MQL4Parser.NoexceptexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#noexceptexpression}.
	 * @param ctx the parse tree
	 */
	void exitNoexceptexpression(MQL4Parser.NoexceptexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#castexpression}.
	 * @param ctx the parse tree
	 */
	void enterCastexpression(MQL4Parser.CastexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#castexpression}.
	 * @param ctx the parse tree
	 */
	void exitCastexpression(MQL4Parser.CastexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#pmexpression}.
	 * @param ctx the parse tree
	 */
	void enterPmexpression(MQL4Parser.PmexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#pmexpression}.
	 * @param ctx the parse tree
	 */
	void exitPmexpression(MQL4Parser.PmexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#multiplicativeexpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeexpression(MQL4Parser.MultiplicativeexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#multiplicativeexpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeexpression(MQL4Parser.MultiplicativeexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#additiveexpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveexpression(MQL4Parser.AdditiveexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#additiveexpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveexpression(MQL4Parser.AdditiveexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#shiftexpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftexpression(MQL4Parser.ShiftexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#shiftexpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftexpression(MQL4Parser.ShiftexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#shiftoperator}.
	 * @param ctx the parse tree
	 */
	void enterShiftoperator(MQL4Parser.ShiftoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#shiftoperator}.
	 * @param ctx the parse tree
	 */
	void exitShiftoperator(MQL4Parser.ShiftoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#relationalexpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalexpression(MQL4Parser.RelationalexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#relationalexpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalexpression(MQL4Parser.RelationalexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#equalityexpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityexpression(MQL4Parser.EqualityexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#equalityexpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityexpression(MQL4Parser.EqualityexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#andexpression}.
	 * @param ctx the parse tree
	 */
	void enterAndexpression(MQL4Parser.AndexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#andexpression}.
	 * @param ctx the parse tree
	 */
	void exitAndexpression(MQL4Parser.AndexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#exclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveorexpression(MQL4Parser.ExclusiveorexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#exclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveorexpression(MQL4Parser.ExclusiveorexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#inclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveorexpression(MQL4Parser.InclusiveorexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#inclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveorexpression(MQL4Parser.InclusiveorexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#logicalandexpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalandexpression(MQL4Parser.LogicalandexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#logicalandexpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalandexpression(MQL4Parser.LogicalandexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#logicalorexpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalorexpression(MQL4Parser.LogicalorexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#logicalorexpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalorexpression(MQL4Parser.LogicalorexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#conditionalexpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalexpression(MQL4Parser.ConditionalexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#conditionalexpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalexpression(MQL4Parser.ConditionalexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#assignmentexpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentexpression(MQL4Parser.AssignmentexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#assignmentexpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentexpression(MQL4Parser.AssignmentexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#assignmentoperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentoperator(MQL4Parser.AssignmentoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#assignmentoperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentoperator(MQL4Parser.AssignmentoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MQL4Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MQL4Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#constantexpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantexpression(MQL4Parser.ConstantexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#constantexpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantexpression(MQL4Parser.ConstantexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MQL4Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MQL4Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#labeledstatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledstatement(MQL4Parser.LabeledstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#labeledstatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledstatement(MQL4Parser.LabeledstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionstatement(MQL4Parser.ExpressionstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionstatement(MQL4Parser.ExpressionstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#compoundstatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundstatement(MQL4Parser.CompoundstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#compoundstatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundstatement(MQL4Parser.CompoundstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#statementseq}.
	 * @param ctx the parse tree
	 */
	void enterStatementseq(MQL4Parser.StatementseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#statementseq}.
	 * @param ctx the parse tree
	 */
	void exitStatementseq(MQL4Parser.StatementseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#selectionstatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionstatement(MQL4Parser.SelectionstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#selectionstatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionstatement(MQL4Parser.SelectionstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(MQL4Parser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(MQL4Parser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#iterationstatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationstatement(MQL4Parser.IterationstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#iterationstatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationstatement(MQL4Parser.IterationstatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forInitExpression}
	 * labeled alternative in {@link MQL4Parser#forinitstatement}.
	 * @param ctx the parse tree
	 */
	void enterForInitExpression(MQL4Parser.ForInitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forInitExpression}
	 * labeled alternative in {@link MQL4Parser#forinitstatement}.
	 * @param ctx the parse tree
	 */
	void exitForInitExpression(MQL4Parser.ForInitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forSimpleDeclaration}
	 * labeled alternative in {@link MQL4Parser#forinitstatement}.
	 * @param ctx the parse tree
	 */
	void enterForSimpleDeclaration(MQL4Parser.ForSimpleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forSimpleDeclaration}
	 * labeled alternative in {@link MQL4Parser#forinitstatement}.
	 * @param ctx the parse tree
	 */
	void exitForSimpleDeclaration(MQL4Parser.ForSimpleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#forrangedeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForrangedeclaration(MQL4Parser.ForrangedeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#forrangedeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForrangedeclaration(MQL4Parser.ForrangedeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#forrangeinitializer}.
	 * @param ctx the parse tree
	 */
	void enterForrangeinitializer(MQL4Parser.ForrangeinitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#forrangeinitializer}.
	 * @param ctx the parse tree
	 */
	void exitForrangeinitializer(MQL4Parser.ForrangeinitializerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link MQL4Parser#jumpstatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(MQL4Parser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStatement}
	 * labeled alternative in {@link MQL4Parser#jumpstatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(MQL4Parser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link MQL4Parser#jumpstatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(MQL4Parser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continueStatement}
	 * labeled alternative in {@link MQL4Parser#jumpstatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(MQL4Parser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link MQL4Parser#jumpstatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(MQL4Parser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link MQL4Parser#jumpstatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(MQL4Parser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gotoStatement}
	 * labeled alternative in {@link MQL4Parser#jumpstatement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(MQL4Parser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gotoStatement}
	 * labeled alternative in {@link MQL4Parser#jumpstatement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(MQL4Parser.GotoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#declarationstatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationstatement(MQL4Parser.DeclarationstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#declarationstatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationstatement(MQL4Parser.DeclarationstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#declarationseq}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationseq(MQL4Parser.DeclarationseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#declarationseq}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationseq(MQL4Parser.DeclarationseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(MQL4Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(MQL4Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#blockdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBlockdeclaration(MQL4Parser.BlockdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#blockdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBlockdeclaration(MQL4Parser.BlockdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#aliasdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAliasdeclaration(MQL4Parser.AliasdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#aliasdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAliasdeclaration(MQL4Parser.AliasdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDeclaration}
	 * labeled alternative in {@link MQL4Parser#simpledeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(MQL4Parser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDeclaration}
	 * labeled alternative in {@link MQL4Parser#simpledeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(MQL4Parser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleD2}
	 * labeled alternative in {@link MQL4Parser#simpledeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleD2(MQL4Parser.SimpleD2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleD2}
	 * labeled alternative in {@link MQL4Parser#simpledeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleD2(MQL4Parser.SimpleD2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#static_assertdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStatic_assertdeclaration(MQL4Parser.Static_assertdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#static_assertdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStatic_assertdeclaration(MQL4Parser.Static_assertdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#emptydeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEmptydeclaration(MQL4Parser.EmptydeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#emptydeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEmptydeclaration(MQL4Parser.EmptydeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#attributedeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAttributedeclaration(MQL4Parser.AttributedeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#attributedeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAttributedeclaration(MQL4Parser.AttributedeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#declspecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclspecifier(MQL4Parser.DeclspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#declspecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclspecifier(MQL4Parser.DeclspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#declspecifierseq}.
	 * @param ctx the parse tree
	 */
	void enterDeclspecifierseq(MQL4Parser.DeclspecifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#declspecifierseq}.
	 * @param ctx the parse tree
	 */
	void exitDeclspecifierseq(MQL4Parser.DeclspecifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#storageclassspecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageclassspecifier(MQL4Parser.StorageclassspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#storageclassspecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageclassspecifier(MQL4Parser.StorageclassspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#functionspecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionspecifier(MQL4Parser.FunctionspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#functionspecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionspecifier(MQL4Parser.FunctionspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#typedefname}.
	 * @param ctx the parse tree
	 */
	void enterTypedefname(MQL4Parser.TypedefnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#typedefname}.
	 * @param ctx the parse tree
	 */
	void exitTypedefname(MQL4Parser.TypedefnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#typespecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypespecifier(MQL4Parser.TypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#typespecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypespecifier(MQL4Parser.TypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#trailingtypespecifier}.
	 * @param ctx the parse tree
	 */
	void enterTrailingtypespecifier(MQL4Parser.TrailingtypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#trailingtypespecifier}.
	 * @param ctx the parse tree
	 */
	void exitTrailingtypespecifier(MQL4Parser.TrailingtypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#typespecifierseq}.
	 * @param ctx the parse tree
	 */
	void enterTypespecifierseq(MQL4Parser.TypespecifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#typespecifierseq}.
	 * @param ctx the parse tree
	 */
	void exitTypespecifierseq(MQL4Parser.TypespecifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#trailingtypespecifierseq}.
	 * @param ctx the parse tree
	 */
	void enterTrailingtypespecifierseq(MQL4Parser.TrailingtypespecifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#trailingtypespecifierseq}.
	 * @param ctx the parse tree
	 */
	void exitTrailingtypespecifierseq(MQL4Parser.TrailingtypespecifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#simpletypespecifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpletypespecifier(MQL4Parser.SimpletypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#simpletypespecifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpletypespecifier(MQL4Parser.SimpletypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#thetypename}.
	 * @param ctx the parse tree
	 */
	void enterThetypename(MQL4Parser.ThetypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#thetypename}.
	 * @param ctx the parse tree
	 */
	void exitThetypename(MQL4Parser.ThetypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#decltypespecifier}.
	 * @param ctx the parse tree
	 */
	void enterDecltypespecifier(MQL4Parser.DecltypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#decltypespecifier}.
	 * @param ctx the parse tree
	 */
	void exitDecltypespecifier(MQL4Parser.DecltypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#elaboratedtypespecifier}.
	 * @param ctx the parse tree
	 */
	void enterElaboratedtypespecifier(MQL4Parser.ElaboratedtypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#elaboratedtypespecifier}.
	 * @param ctx the parse tree
	 */
	void exitElaboratedtypespecifier(MQL4Parser.ElaboratedtypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#enumname}.
	 * @param ctx the parse tree
	 */
	void enterEnumname(MQL4Parser.EnumnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#enumname}.
	 * @param ctx the parse tree
	 */
	void exitEnumname(MQL4Parser.EnumnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#enumspecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumspecifier(MQL4Parser.EnumspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#enumspecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumspecifier(MQL4Parser.EnumspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#enumhead}.
	 * @param ctx the parse tree
	 */
	void enterEnumhead(MQL4Parser.EnumheadContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#enumhead}.
	 * @param ctx the parse tree
	 */
	void exitEnumhead(MQL4Parser.EnumheadContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#opaqueenumdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOpaqueenumdeclaration(MQL4Parser.OpaqueenumdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#opaqueenumdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOpaqueenumdeclaration(MQL4Parser.OpaqueenumdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#enumkey}.
	 * @param ctx the parse tree
	 */
	void enterEnumkey(MQL4Parser.EnumkeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#enumkey}.
	 * @param ctx the parse tree
	 */
	void exitEnumkey(MQL4Parser.EnumkeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#enumbase}.
	 * @param ctx the parse tree
	 */
	void enterEnumbase(MQL4Parser.EnumbaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#enumbase}.
	 * @param ctx the parse tree
	 */
	void exitEnumbase(MQL4Parser.EnumbaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#enumeratorlist}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorlist(MQL4Parser.EnumeratorlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#enumeratorlist}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorlist(MQL4Parser.EnumeratorlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#enumeratordefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratordefinition(MQL4Parser.EnumeratordefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#enumeratordefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratordefinition(MQL4Parser.EnumeratordefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(MQL4Parser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(MQL4Parser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#namespacename}.
	 * @param ctx the parse tree
	 */
	void enterNamespacename(MQL4Parser.NamespacenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#namespacename}.
	 * @param ctx the parse tree
	 */
	void exitNamespacename(MQL4Parser.NamespacenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#originalnamespacename}.
	 * @param ctx the parse tree
	 */
	void enterOriginalnamespacename(MQL4Parser.OriginalnamespacenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#originalnamespacename}.
	 * @param ctx the parse tree
	 */
	void exitOriginalnamespacename(MQL4Parser.OriginalnamespacenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#namespacedefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamespacedefinition(MQL4Parser.NamespacedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#namespacedefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamespacedefinition(MQL4Parser.NamespacedefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#namednamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamednamespacedefinition(MQL4Parser.NamednamespacedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#namednamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamednamespacedefinition(MQL4Parser.NamednamespacedefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#originalnamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void enterOriginalnamespacedefinition(MQL4Parser.OriginalnamespacedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#originalnamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void exitOriginalnamespacedefinition(MQL4Parser.OriginalnamespacedefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#extensionnamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void enterExtensionnamespacedefinition(MQL4Parser.ExtensionnamespacedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#extensionnamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void exitExtensionnamespacedefinition(MQL4Parser.ExtensionnamespacedefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#unnamednamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void enterUnnamednamespacedefinition(MQL4Parser.UnnamednamespacedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#unnamednamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void exitUnnamednamespacedefinition(MQL4Parser.UnnamednamespacedefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#namespacebody}.
	 * @param ctx the parse tree
	 */
	void enterNamespacebody(MQL4Parser.NamespacebodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#namespacebody}.
	 * @param ctx the parse tree
	 */
	void exitNamespacebody(MQL4Parser.NamespacebodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#namespacealias}.
	 * @param ctx the parse tree
	 */
	void enterNamespacealias(MQL4Parser.NamespacealiasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#namespacealias}.
	 * @param ctx the parse tree
	 */
	void exitNamespacealias(MQL4Parser.NamespacealiasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#namespacealiasdefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamespacealiasdefinition(MQL4Parser.NamespacealiasdefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#namespacealiasdefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamespacealiasdefinition(MQL4Parser.NamespacealiasdefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 */
	void enterQualifiednamespacespecifier(MQL4Parser.QualifiednamespacespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 */
	void exitQualifiednamespacespecifier(MQL4Parser.QualifiednamespacespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#usingdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUsingdeclaration(MQL4Parser.UsingdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#usingdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUsingdeclaration(MQL4Parser.UsingdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#usingdirective}.
	 * @param ctx the parse tree
	 */
	void enterUsingdirective(MQL4Parser.UsingdirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#usingdirective}.
	 * @param ctx the parse tree
	 */
	void exitUsingdirective(MQL4Parser.UsingdirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#asmdefinition}.
	 * @param ctx the parse tree
	 */
	void enterAsmdefinition(MQL4Parser.AsmdefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#asmdefinition}.
	 * @param ctx the parse tree
	 */
	void exitAsmdefinition(MQL4Parser.AsmdefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#linkagespecification}.
	 * @param ctx the parse tree
	 */
	void enterLinkagespecification(MQL4Parser.LinkagespecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#linkagespecification}.
	 * @param ctx the parse tree
	 */
	void exitLinkagespecification(MQL4Parser.LinkagespecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#attributespecifierseq}.
	 * @param ctx the parse tree
	 */
	void enterAttributespecifierseq(MQL4Parser.AttributespecifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#attributespecifierseq}.
	 * @param ctx the parse tree
	 */
	void exitAttributespecifierseq(MQL4Parser.AttributespecifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#attributespecifier}.
	 * @param ctx the parse tree
	 */
	void enterAttributespecifier(MQL4Parser.AttributespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#attributespecifier}.
	 * @param ctx the parse tree
	 */
	void exitAttributespecifier(MQL4Parser.AttributespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#alignmentspecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentspecifier(MQL4Parser.AlignmentspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#alignmentspecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentspecifier(MQL4Parser.AlignmentspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#attributelist}.
	 * @param ctx the parse tree
	 */
	void enterAttributelist(MQL4Parser.AttributelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#attributelist}.
	 * @param ctx the parse tree
	 */
	void exitAttributelist(MQL4Parser.AttributelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(MQL4Parser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(MQL4Parser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#attributetoken}.
	 * @param ctx the parse tree
	 */
	void enterAttributetoken(MQL4Parser.AttributetokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#attributetoken}.
	 * @param ctx the parse tree
	 */
	void exitAttributetoken(MQL4Parser.AttributetokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#attributescopedtoken}.
	 * @param ctx the parse tree
	 */
	void enterAttributescopedtoken(MQL4Parser.AttributescopedtokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#attributescopedtoken}.
	 * @param ctx the parse tree
	 */
	void exitAttributescopedtoken(MQL4Parser.AttributescopedtokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#attributenamespace}.
	 * @param ctx the parse tree
	 */
	void enterAttributenamespace(MQL4Parser.AttributenamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#attributenamespace}.
	 * @param ctx the parse tree
	 */
	void exitAttributenamespace(MQL4Parser.AttributenamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#attributeargumentclause}.
	 * @param ctx the parse tree
	 */
	void enterAttributeargumentclause(MQL4Parser.AttributeargumentclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#attributeargumentclause}.
	 * @param ctx the parse tree
	 */
	void exitAttributeargumentclause(MQL4Parser.AttributeargumentclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#balancedtokenseq}.
	 * @param ctx the parse tree
	 */
	void enterBalancedtokenseq(MQL4Parser.BalancedtokenseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#balancedtokenseq}.
	 * @param ctx the parse tree
	 */
	void exitBalancedtokenseq(MQL4Parser.BalancedtokenseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#balancedtoken}.
	 * @param ctx the parse tree
	 */
	void enterBalancedtoken(MQL4Parser.BalancedtokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#balancedtoken}.
	 * @param ctx the parse tree
	 */
	void exitBalancedtoken(MQL4Parser.BalancedtokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#initdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	void enterInitdeclaratorlist(MQL4Parser.InitdeclaratorlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#initdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	void exitInitdeclaratorlist(MQL4Parser.InitdeclaratorlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#initdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitdeclarator(MQL4Parser.InitdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#initdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitdeclarator(MQL4Parser.InitdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(MQL4Parser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(MQL4Parser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#ptrdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPtrdeclarator(MQL4Parser.PtrdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#ptrdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPtrdeclarator(MQL4Parser.PtrdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#noptrdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptrdeclarator(MQL4Parser.NoptrdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#noptrdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptrdeclarator(MQL4Parser.NoptrdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#parametersandqualifiers}.
	 * @param ctx the parse tree
	 */
	void enterParametersandqualifiers(MQL4Parser.ParametersandqualifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#parametersandqualifiers}.
	 * @param ctx the parse tree
	 */
	void exitParametersandqualifiers(MQL4Parser.ParametersandqualifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#trailingreturntype}.
	 * @param ctx the parse tree
	 */
	void enterTrailingreturntype(MQL4Parser.TrailingreturntypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#trailingreturntype}.
	 * @param ctx the parse tree
	 */
	void exitTrailingreturntype(MQL4Parser.TrailingreturntypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#ptroperator}.
	 * @param ctx the parse tree
	 */
	void enterPtroperator(MQL4Parser.PtroperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#ptroperator}.
	 * @param ctx the parse tree
	 */
	void exitPtroperator(MQL4Parser.PtroperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#cvqualifierseq}.
	 * @param ctx the parse tree
	 */
	void enterCvqualifierseq(MQL4Parser.CvqualifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#cvqualifierseq}.
	 * @param ctx the parse tree
	 */
	void exitCvqualifierseq(MQL4Parser.CvqualifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#cvqualifier}.
	 * @param ctx the parse tree
	 */
	void enterCvqualifier(MQL4Parser.CvqualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#cvqualifier}.
	 * @param ctx the parse tree
	 */
	void exitCvqualifier(MQL4Parser.CvqualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#refqualifier}.
	 * @param ctx the parse tree
	 */
	void enterRefqualifier(MQL4Parser.RefqualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#refqualifier}.
	 * @param ctx the parse tree
	 */
	void exitRefqualifier(MQL4Parser.RefqualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#declaratorid}.
	 * @param ctx the parse tree
	 */
	void enterDeclaratorid(MQL4Parser.DeclaratoridContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#declaratorid}.
	 * @param ctx the parse tree
	 */
	void exitDeclaratorid(MQL4Parser.DeclaratoridContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#thetypeid}.
	 * @param ctx the parse tree
	 */
	void enterThetypeid(MQL4Parser.ThetypeidContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#thetypeid}.
	 * @param ctx the parse tree
	 */
	void exitThetypeid(MQL4Parser.ThetypeidContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#abstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractdeclarator(MQL4Parser.AbstractdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#abstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractdeclarator(MQL4Parser.AbstractdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#ptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPtrabstractdeclarator(MQL4Parser.PtrabstractdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#ptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPtrabstractdeclarator(MQL4Parser.PtrabstractdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#noptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptrabstractdeclarator(MQL4Parser.NoptrabstractdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#noptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptrabstractdeclarator(MQL4Parser.NoptrabstractdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#abstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractpackdeclarator(MQL4Parser.AbstractpackdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#abstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractpackdeclarator(MQL4Parser.AbstractpackdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#noptrabstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptrabstractpackdeclarator(MQL4Parser.NoptrabstractpackdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#noptrabstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptrabstractpackdeclarator(MQL4Parser.NoptrabstractpackdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#parameterdeclarationclause}.
	 * @param ctx the parse tree
	 */
	void enterParameterdeclarationclause(MQL4Parser.ParameterdeclarationclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#parameterdeclarationclause}.
	 * @param ctx the parse tree
	 */
	void exitParameterdeclarationclause(MQL4Parser.ParameterdeclarationclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#parameterdeclarationlist}.
	 * @param ctx the parse tree
	 */
	void enterParameterdeclarationlist(MQL4Parser.ParameterdeclarationlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#parameterdeclarationlist}.
	 * @param ctx the parse tree
	 */
	void exitParameterdeclarationlist(MQL4Parser.ParameterdeclarationlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#parameterdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterdeclaration(MQL4Parser.ParameterdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#parameterdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterdeclaration(MQL4Parser.ParameterdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#functiondefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondefinition(MQL4Parser.FunctiondefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#functiondefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondefinition(MQL4Parser.FunctiondefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#functionbody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionbody(MQL4Parser.FunctionbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#functionbody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionbody(MQL4Parser.FunctionbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(MQL4Parser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(MQL4Parser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#braceorequalinitializer}.
	 * @param ctx the parse tree
	 */
	void enterBraceorequalinitializer(MQL4Parser.BraceorequalinitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#braceorequalinitializer}.
	 * @param ctx the parse tree
	 */
	void exitBraceorequalinitializer(MQL4Parser.BraceorequalinitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#initializerclause}.
	 * @param ctx the parse tree
	 */
	void enterInitializerclause(MQL4Parser.InitializerclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#initializerclause}.
	 * @param ctx the parse tree
	 */
	void exitInitializerclause(MQL4Parser.InitializerclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#initializerlist}.
	 * @param ctx the parse tree
	 */
	void enterInitializerlist(MQL4Parser.InitializerlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#initializerlist}.
	 * @param ctx the parse tree
	 */
	void exitInitializerlist(MQL4Parser.InitializerlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#bracedinitlist}.
	 * @param ctx the parse tree
	 */
	void enterBracedinitlist(MQL4Parser.BracedinitlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#bracedinitlist}.
	 * @param ctx the parse tree
	 */
	void exitBracedinitlist(MQL4Parser.BracedinitlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#classname}.
	 * @param ctx the parse tree
	 */
	void enterClassname(MQL4Parser.ClassnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#classname}.
	 * @param ctx the parse tree
	 */
	void exitClassname(MQL4Parser.ClassnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#classspecifier}.
	 * @param ctx the parse tree
	 */
	void enterClassspecifier(MQL4Parser.ClassspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#classspecifier}.
	 * @param ctx the parse tree
	 */
	void exitClassspecifier(MQL4Parser.ClassspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#classhead}.
	 * @param ctx the parse tree
	 */
	void enterClasshead(MQL4Parser.ClassheadContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#classhead}.
	 * @param ctx the parse tree
	 */
	void exitClasshead(MQL4Parser.ClassheadContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#classheadname}.
	 * @param ctx the parse tree
	 */
	void enterClassheadname(MQL4Parser.ClassheadnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#classheadname}.
	 * @param ctx the parse tree
	 */
	void exitClassheadname(MQL4Parser.ClassheadnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#classvirtspecifier}.
	 * @param ctx the parse tree
	 */
	void enterClassvirtspecifier(MQL4Parser.ClassvirtspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#classvirtspecifier}.
	 * @param ctx the parse tree
	 */
	void exitClassvirtspecifier(MQL4Parser.ClassvirtspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#classkey}.
	 * @param ctx the parse tree
	 */
	void enterClasskey(MQL4Parser.ClasskeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#classkey}.
	 * @param ctx the parse tree
	 */
	void exitClasskey(MQL4Parser.ClasskeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#memberspecification}.
	 * @param ctx the parse tree
	 */
	void enterMemberspecification(MQL4Parser.MemberspecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#memberspecification}.
	 * @param ctx the parse tree
	 */
	void exitMemberspecification(MQL4Parser.MemberspecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#memberdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberdeclaration(MQL4Parser.MemberdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#memberdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberdeclaration(MQL4Parser.MemberdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#memberdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	void enterMemberdeclaratorlist(MQL4Parser.MemberdeclaratorlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#memberdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	void exitMemberdeclaratorlist(MQL4Parser.MemberdeclaratorlistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberDec}
	 * labeled alternative in {@link MQL4Parser#memberdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMemberDec(MQL4Parser.MemberDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberDec}
	 * labeled alternative in {@link MQL4Parser#memberdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMemberDec(MQL4Parser.MemberDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberInit}
	 * labeled alternative in {@link MQL4Parser#memberdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMemberInit(MQL4Parser.MemberInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberInit}
	 * labeled alternative in {@link MQL4Parser#memberdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMemberInit(MQL4Parser.MemberInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberConstant}
	 * labeled alternative in {@link MQL4Parser#memberdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMemberConstant(MQL4Parser.MemberConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberConstant}
	 * labeled alternative in {@link MQL4Parser#memberdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMemberConstant(MQL4Parser.MemberConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#virtspecifierseq}.
	 * @param ctx the parse tree
	 */
	void enterVirtspecifierseq(MQL4Parser.VirtspecifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#virtspecifierseq}.
	 * @param ctx the parse tree
	 */
	void exitVirtspecifierseq(MQL4Parser.VirtspecifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#virtspecifier}.
	 * @param ctx the parse tree
	 */
	void enterVirtspecifier(MQL4Parser.VirtspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#virtspecifier}.
	 * @param ctx the parse tree
	 */
	void exitVirtspecifier(MQL4Parser.VirtspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#purespecifier}.
	 * @param ctx the parse tree
	 */
	void enterPurespecifier(MQL4Parser.PurespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#purespecifier}.
	 * @param ctx the parse tree
	 */
	void exitPurespecifier(MQL4Parser.PurespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#baseclause}.
	 * @param ctx the parse tree
	 */
	void enterBaseclause(MQL4Parser.BaseclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#baseclause}.
	 * @param ctx the parse tree
	 */
	void exitBaseclause(MQL4Parser.BaseclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#basespecifierlist}.
	 * @param ctx the parse tree
	 */
	void enterBasespecifierlist(MQL4Parser.BasespecifierlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#basespecifierlist}.
	 * @param ctx the parse tree
	 */
	void exitBasespecifierlist(MQL4Parser.BasespecifierlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#basespecifier}.
	 * @param ctx the parse tree
	 */
	void enterBasespecifier(MQL4Parser.BasespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#basespecifier}.
	 * @param ctx the parse tree
	 */
	void exitBasespecifier(MQL4Parser.BasespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#classordecltype}.
	 * @param ctx the parse tree
	 */
	void enterClassordecltype(MQL4Parser.ClassordecltypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#classordecltype}.
	 * @param ctx the parse tree
	 */
	void exitClassordecltype(MQL4Parser.ClassordecltypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#basetypespecifier}.
	 * @param ctx the parse tree
	 */
	void enterBasetypespecifier(MQL4Parser.BasetypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#basetypespecifier}.
	 * @param ctx the parse tree
	 */
	void exitBasetypespecifier(MQL4Parser.BasetypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#accessspecifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessspecifier(MQL4Parser.AccessspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#accessspecifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessspecifier(MQL4Parser.AccessspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#conversionfunctionid}.
	 * @param ctx the parse tree
	 */
	void enterConversionfunctionid(MQL4Parser.ConversionfunctionidContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#conversionfunctionid}.
	 * @param ctx the parse tree
	 */
	void exitConversionfunctionid(MQL4Parser.ConversionfunctionidContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#conversiontypeid}.
	 * @param ctx the parse tree
	 */
	void enterConversiontypeid(MQL4Parser.ConversiontypeidContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#conversiontypeid}.
	 * @param ctx the parse tree
	 */
	void exitConversiontypeid(MQL4Parser.ConversiontypeidContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#conversiondeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConversiondeclarator(MQL4Parser.ConversiondeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#conversiondeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConversiondeclarator(MQL4Parser.ConversiondeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#ctorinitializer}.
	 * @param ctx the parse tree
	 */
	void enterCtorinitializer(MQL4Parser.CtorinitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#ctorinitializer}.
	 * @param ctx the parse tree
	 */
	void exitCtorinitializer(MQL4Parser.CtorinitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#meminitializerlist}.
	 * @param ctx the parse tree
	 */
	void enterMeminitializerlist(MQL4Parser.MeminitializerlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#meminitializerlist}.
	 * @param ctx the parse tree
	 */
	void exitMeminitializerlist(MQL4Parser.MeminitializerlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#meminitializer}.
	 * @param ctx the parse tree
	 */
	void enterMeminitializer(MQL4Parser.MeminitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#meminitializer}.
	 * @param ctx the parse tree
	 */
	void exitMeminitializer(MQL4Parser.MeminitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#meminitializerid}.
	 * @param ctx the parse tree
	 */
	void enterMeminitializerid(MQL4Parser.MeminitializeridContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#meminitializerid}.
	 * @param ctx the parse tree
	 */
	void exitMeminitializerid(MQL4Parser.MeminitializeridContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#operatorfunctionid}.
	 * @param ctx the parse tree
	 */
	void enterOperatorfunctionid(MQL4Parser.OperatorfunctionidContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#operatorfunctionid}.
	 * @param ctx the parse tree
	 */
	void exitOperatorfunctionid(MQL4Parser.OperatorfunctionidContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#literaloperatorid}.
	 * @param ctx the parse tree
	 */
	void enterLiteraloperatorid(MQL4Parser.LiteraloperatoridContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#literaloperatorid}.
	 * @param ctx the parse tree
	 */
	void exitLiteraloperatorid(MQL4Parser.LiteraloperatoridContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#templatedeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTemplatedeclaration(MQL4Parser.TemplatedeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#templatedeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTemplatedeclaration(MQL4Parser.TemplatedeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#templateparameterlist}.
	 * @param ctx the parse tree
	 */
	void enterTemplateparameterlist(MQL4Parser.TemplateparameterlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#templateparameterlist}.
	 * @param ctx the parse tree
	 */
	void exitTemplateparameterlist(MQL4Parser.TemplateparameterlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#templateparameter}.
	 * @param ctx the parse tree
	 */
	void enterTemplateparameter(MQL4Parser.TemplateparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#templateparameter}.
	 * @param ctx the parse tree
	 */
	void exitTemplateparameter(MQL4Parser.TemplateparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#typeparameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeparameter(MQL4Parser.TypeparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#typeparameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeparameter(MQL4Parser.TypeparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#simpletemplateid}.
	 * @param ctx the parse tree
	 */
	void enterSimpletemplateid(MQL4Parser.SimpletemplateidContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#simpletemplateid}.
	 * @param ctx the parse tree
	 */
	void exitSimpletemplateid(MQL4Parser.SimpletemplateidContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#templateid}.
	 * @param ctx the parse tree
	 */
	void enterTemplateid(MQL4Parser.TemplateidContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#templateid}.
	 * @param ctx the parse tree
	 */
	void exitTemplateid(MQL4Parser.TemplateidContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#templatename}.
	 * @param ctx the parse tree
	 */
	void enterTemplatename(MQL4Parser.TemplatenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#templatename}.
	 * @param ctx the parse tree
	 */
	void exitTemplatename(MQL4Parser.TemplatenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#templateargumentlist}.
	 * @param ctx the parse tree
	 */
	void enterTemplateargumentlist(MQL4Parser.TemplateargumentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#templateargumentlist}.
	 * @param ctx the parse tree
	 */
	void exitTemplateargumentlist(MQL4Parser.TemplateargumentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#templateargument}.
	 * @param ctx the parse tree
	 */
	void enterTemplateargument(MQL4Parser.TemplateargumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#templateargument}.
	 * @param ctx the parse tree
	 */
	void exitTemplateargument(MQL4Parser.TemplateargumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#typenamespecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypenamespecifier(MQL4Parser.TypenamespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#typenamespecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypenamespecifier(MQL4Parser.TypenamespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#explicitinstantiation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitinstantiation(MQL4Parser.ExplicitinstantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#explicitinstantiation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitinstantiation(MQL4Parser.ExplicitinstantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#explicitspecialization}.
	 * @param ctx the parse tree
	 */
	void enterExplicitspecialization(MQL4Parser.ExplicitspecializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#explicitspecialization}.
	 * @param ctx the parse tree
	 */
	void exitExplicitspecialization(MQL4Parser.ExplicitspecializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#tryblock}.
	 * @param ctx the parse tree
	 */
	void enterTryblock(MQL4Parser.TryblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#tryblock}.
	 * @param ctx the parse tree
	 */
	void exitTryblock(MQL4Parser.TryblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#functiontryblock}.
	 * @param ctx the parse tree
	 */
	void enterFunctiontryblock(MQL4Parser.FunctiontryblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#functiontryblock}.
	 * @param ctx the parse tree
	 */
	void exitFunctiontryblock(MQL4Parser.FunctiontryblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#handlerseq}.
	 * @param ctx the parse tree
	 */
	void enterHandlerseq(MQL4Parser.HandlerseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#handlerseq}.
	 * @param ctx the parse tree
	 */
	void exitHandlerseq(MQL4Parser.HandlerseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#handler}.
	 * @param ctx the parse tree
	 */
	void enterHandler(MQL4Parser.HandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#handler}.
	 * @param ctx the parse tree
	 */
	void exitHandler(MQL4Parser.HandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#exceptiondeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExceptiondeclaration(MQL4Parser.ExceptiondeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#exceptiondeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExceptiondeclaration(MQL4Parser.ExceptiondeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#throwexpression}.
	 * @param ctx the parse tree
	 */
	void enterThrowexpression(MQL4Parser.ThrowexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#throwexpression}.
	 * @param ctx the parse tree
	 */
	void exitThrowexpression(MQL4Parser.ThrowexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#exceptionspecification}.
	 * @param ctx the parse tree
	 */
	void enterExceptionspecification(MQL4Parser.ExceptionspecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#exceptionspecification}.
	 * @param ctx the parse tree
	 */
	void exitExceptionspecification(MQL4Parser.ExceptionspecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#dynamicexceptionspecification}.
	 * @param ctx the parse tree
	 */
	void enterDynamicexceptionspecification(MQL4Parser.DynamicexceptionspecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#dynamicexceptionspecification}.
	 * @param ctx the parse tree
	 */
	void exitDynamicexceptionspecification(MQL4Parser.DynamicexceptionspecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#typeidlist}.
	 * @param ctx the parse tree
	 */
	void enterTypeidlist(MQL4Parser.TypeidlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#typeidlist}.
	 * @param ctx the parse tree
	 */
	void exitTypeidlist(MQL4Parser.TypeidlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#noexceptspecification}.
	 * @param ctx the parse tree
	 */
	void enterNoexceptspecification(MQL4Parser.NoexceptspecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#noexceptspecification}.
	 * @param ctx the parse tree
	 */
	void exitNoexceptspecification(MQL4Parser.NoexceptspecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#theoperator}.
	 * @param ctx the parse tree
	 */
	void enterTheoperator(MQL4Parser.TheoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#theoperator}.
	 * @param ctx the parse tree
	 */
	void exitTheoperator(MQL4Parser.TheoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MQL4Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MQL4Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#booleanliteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanliteral(MQL4Parser.BooleanliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#booleanliteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanliteral(MQL4Parser.BooleanliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#pointerliteral}.
	 * @param ctx the parse tree
	 */
	void enterPointerliteral(MQL4Parser.PointerliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#pointerliteral}.
	 * @param ctx the parse tree
	 */
	void exitPointerliteral(MQL4Parser.PointerliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MQL4Parser#userdefinedliteral}.
	 * @param ctx the parse tree
	 */
	void enterUserdefinedliteral(MQL4Parser.UserdefinedliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MQL4Parser#userdefinedliteral}.
	 * @param ctx the parse tree
	 */
	void exitUserdefinedliteral(MQL4Parser.UserdefinedliteralContext ctx);
}