import gen.*;

import java.util.ArrayList;

public class JavaListener extends JavaGrammarBaseListener {
    private final StringBuilder formattedCode = new StringBuilder();

    private int tabAmount = 0;
    private String lastToken = "fileStart";

    private final ArrayList<String> modifiers = new ArrayList<>();
    private String functionType;
    private boolean isFunctionParameter = false;
    private final ArrayList<String> functionParameters = new ArrayList<>();
    private String variableType;
    private String variableTypeAndName;
    private boolean isFunctionInvokeParameter = false;
    private final ArrayList<String> functionInvokeParameters = new ArrayList<>();
    private boolean isForParameter = false;
    private final ArrayList<String> forParameters = new ArrayList<>();
    private boolean isWhileParameter = false;
    private final ArrayList<String> whileParameters = new ArrayList<>();
    private String equalityOperator;
    private String cycleLogicStatement;
    private String returnValue;

    @Override
    public void enterClassDeclaration(JavaGrammarParser.ClassDeclarationContext ctx) {
        modifiers.clear();
    }

    @Override
    public void enterFunctionDeclaration(JavaGrammarParser.FunctionDeclarationContext ctx) {
        isFunctionParameter = true;
    }

    @Override
    public void enterModifier(JavaGrammarParser.ModifierContext ctx) {
        modifiers.add(ctx.getText());
    }

    @Override
    public void enterFunctionType(JavaGrammarParser.FunctionTypeContext ctx) {
        functionType = ctx.getText();
    }

    @Override
    public void enterType(JavaGrammarParser.TypeContext ctx) {
        variableType = ctx.getText();
    }

    @Override
    public void enterVariableName(JavaGrammarParser.VariableNameContext ctx) {
        if (isFunctionInvokeParameter) {
            functionInvokeParameters.add(ctx.getText());
        }
        if (isForParameter && forParameters.size() > 0) {
            forParameters.add(ctx.getText());
        }
        if (isWhileParameter) {
            whileParameters.add(ctx.getText());
        }
    }

    @Override
    public void exitVariableTypeAndName(JavaGrammarParser.VariableTypeAndNameContext ctx) {
        variableTypeAndName = variableType + ' ' + ctx.Name();
        if (isFunctionParameter) {
            functionParameters.add(variableTypeAndName);
        }
        if (isForParameter && forParameters.size() == 0) {
            forParameters.add(variableTypeAndName);
        }
    }

    @Override
    public void exitVariableDeclaration(JavaGrammarParser.VariableDeclarationContext ctx) {
        if (!(lastToken.equals("fileStart") || lastToken.equals("classStart")
             || lastToken.equals("functionStart") || lastToken.equals("variable")
             || lastToken.equals("ifStatementStart") || lastToken.equals("cycleStart"))) {
            formattedCode.append("\n");
        }

        addTabs();
        formattedCode.append(variableTypeAndName).append(";\n");

        lastToken = "variable";
    }

    private void addTabs() {
        formattedCode.append("\t".repeat(tabAmount));
    }

    private void initDeclaration() {
        addTabs();
        for (String modifier : modifiers) {
            formattedCode.append(modifier).append(" ");
        }
        modifiers.clear();
    }

    @Override
    public void exitClassDeclaration(JavaGrammarParser.ClassDeclarationContext ctx) {
        if (!(lastToken.equals("fileStart") || lastToken.equals("classStart")
              || lastToken.equals("cycleStart"))) formattedCode.append("\n");

        initDeclaration();
        formattedCode.append("class ").append(ctx.Name()).append(" {\n");

        tabAmount++;
        lastToken = "classStart";
    }

    @Override
    public void exitFunctionDeclaration(JavaGrammarParser.FunctionDeclarationContext ctx) {
        if (!(lastToken.equals("fileStart") || lastToken.equals("classStart")
              || lastToken.equals("cycleStart"))) formattedCode.append("\n");

        initDeclaration();
        formattedCode.append(functionType).append(' ').append(ctx.Name()).append(" (");
        for (int i = 0; i < functionParameters.size(); i++) {
            if (i > 0) {
                formattedCode.append(", ");
            }
            formattedCode.append(functionParameters.get(i));
        }
        functionParameters.clear();
        formattedCode.append(") {\n");

        tabAmount++;
        lastToken = "functionStart";
        isFunctionParameter = false;
    }

    @Override
    public void enterReturnValue(JavaGrammarParser.ReturnValueContext ctx) {
        returnValue = ctx.getText();
    }

    @Override
    public void exitReturnStatement(JavaGrammarParser.ReturnStatementContext ctx) {
        addTabs();
        formattedCode.append("return ").append(returnValue).append(";\n");
    }

    private void addClassOrFunctionBodyEnd() {
        tabAmount--;
        if (tabAmount == -1) {
            return;
        }
        addTabs();
        formattedCode.append("}\n");
    }

    @Override
    public void exitClassBody(JavaGrammarParser.ClassBodyContext ctx) {
        addClassOrFunctionBodyEnd();
        lastToken = "classEnd";
    }

    @Override
    public void exitFunctionBody(JavaGrammarParser.FunctionBodyContext ctx) {
        addClassOrFunctionBodyEnd();
        lastToken = "functionEnd";
    }

    @Override
    public void enterIfStatement(JavaGrammarParser.IfStatementContext ctx) {
        if (!(lastToken.equals("fileStart") || lastToken.equals("classStart")
              || lastToken.equals("functionStart") || lastToken.equals("ifStatementStart")
              || lastToken.equals("cycleStart"))) {
            formattedCode.append("\n");
        }

        addTabs();
        formattedCode.append("if (").append(ctx.Name()).append(") {\n");

        tabAmount++;
        lastToken = "ifStatementStart";
    }

    @Override
    public void enterElseStatement(JavaGrammarParser.ElseStatementContext ctx) {
        tabAmount--;
        addTabs();
        formattedCode.append("} else {\n");

        tabAmount++;
        lastToken = "ifStatementStart";
    }

    @Override
    public void exitIfStatement(JavaGrammarParser.IfStatementContext ctx) {
        tabAmount--;
        addTabs();
        formattedCode.append("}\n");

        lastToken = "ifStatementEnd";
    }

    @Override
    public void enterFunctionInvoke(JavaGrammarParser.FunctionInvokeContext ctx) {
        if (!(lastToken.equals("fileStart") || lastToken.equals("classStart")
                || lastToken.equals("functionStart") || lastToken.equals("ifStatementStart")
                || lastToken.equals("functionInvoke") || lastToken.equals("cycleStart"))) {
            formattedCode.append("\n");
        }

        addTabs();
        formattedCode.append(ctx.Name()).append('(');
        isFunctionInvokeParameter = true;
    }

    @Override
    public void exitFunctionInvoke(JavaGrammarParser.FunctionInvokeContext ctx) {
        for (int i = 0; i < functionInvokeParameters.size(); i++) {
            if (i > 0) {
                formattedCode.append(", ");
            }
            formattedCode.append(functionInvokeParameters.get(i));
        }
        functionInvokeParameters.clear();
        formattedCode.append(");\n");
        isFunctionInvokeParameter = false;

        lastToken = "functionInvoke";
    }

    @Override
    public void enterForCycleDeclaration(JavaGrammarParser.ForCycleDeclarationContext ctx) {
        if (!(lastToken.equals("fileStart") || lastToken.equals("classStart")
                || lastToken.equals("functionStart") || lastToken.equals("ifStatementStart")
                || lastToken.equals("cycleStart"))) {
            formattedCode.append("\n");
        }

        addTabs();
        formattedCode.append("for (");
        forParameters.clear();
        isForParameter = true;

        tabAmount++;
    }

    @Override
    public void enterWhileCycleDeclaration(JavaGrammarParser.WhileCycleDeclarationContext ctx) {
        if (!(lastToken.equals("fileStart") || lastToken.equals("classStart")
                || lastToken.equals("functionStart") || lastToken.equals("ifStatementStart")
                || lastToken.equals("cycleStart"))) {
            formattedCode.append("\n");
        }

        addTabs();
        formattedCode.append("while (");
        whileParameters.clear();
        isWhileParameter = true;
    }

    @Override
    public void enterEqualityOperator(JavaGrammarParser.EqualityOperatorContext ctx) {
        equalityOperator = ctx.getText();
    }

    @Override
    public void exitForLogicStatement(JavaGrammarParser.ForLogicStatementContext ctx) {
        cycleLogicStatement = forParameters.get(1) + " " + equalityOperator + " " + forParameters.get(2);
    }

    @Override
    public void exitWhileLogicStatement(JavaGrammarParser.WhileLogicStatementContext ctx) {
        cycleLogicStatement = whileParameters.get(0) + " " + equalityOperator + " " + whileParameters.get(1);
    }

    @Override
    public void exitForCycleDeclaration(JavaGrammarParser.ForCycleDeclarationContext ctx) {
        formattedCode.append(forParameters.get(0)).append("; ").append(cycleLogicStatement).append("; ").append(forParameters.get(3))
                .append(") {\n");
        isForParameter = false;

        tabAmount++;
        lastToken = "cycleStart";
    }

    @Override
    public void exitWhileCycleDeclaration(JavaGrammarParser.WhileCycleDeclarationContext ctx) {
        formattedCode.append(cycleLogicStatement).append(") {\n");
        isWhileParameter = false;

        tabAmount++;
        lastToken = "cycleStart";
    }

    private void cycleEnd() {
        tabAmount--;
        addTabs();
        formattedCode.append("}\n");
        lastToken = "cycleEnd";
    }

    @Override
    public void exitForCycle(JavaGrammarParser.ForCycleContext ctx) {
        cycleEnd();
    }

    @Override
    public void exitWhileCycle(JavaGrammarParser.WhileCycleContext ctx) {
        cycleEnd();
    }

    public String getFormattedCode() {
        return formattedCode.toString();
    }
}
