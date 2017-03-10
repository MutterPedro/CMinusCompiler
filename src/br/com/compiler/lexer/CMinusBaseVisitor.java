// Generated from /root/IdeaProjects/CMinusCompiler/src/br/com/compiler/lexer/CMinus.g4 by ANTLR 4.5.3
package br.com.compiler.lexer;

import br.com.compiler.semantic.*;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * This class provides an empty implementation of {@link CMinusVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public class CMinusBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements CMinusVisitor<T> {

    private List<TempVar> tempVars = new ArrayList<>();
    private List<Function> functions = new ArrayList<>();
    private List<Var> vars = new ArrayList<>();
    private List<Quadruple> table = new ArrayList<>();
    private Scope global = new Scope();
    private Scope active;
    private Map<Integer, Quadruple> ifMap = new HashMap<>();
    private Map<Integer, Quadruple> whileMap = new HashMap<>();

    private void addTableHeader() {
        Quadruple quadruple = new Quadruple();
        quadruple.setOp("OP");
        quadruple.setArg1("ARG1");
        quadruple.setArg2("ARG2");
        quadruple.setResult("RESULT");
        this.table.add(quadruple);
    }

    private void addlineToTable(String op, String arg1, String arg2, String result) {
        Quadruple quadruple = new Quadruple();
        quadruple.setOp(op);
        quadruple.setArg1(arg1);
        quadruple.setArg2(arg2);
        quadruple.setResult(result);
        this.table.add(quadruple);
    }

    public void printTable() {
        Integer opSize = 0, arg1Size = 0, arg2Size = 0, resultSize = 0;
        for (Quadruple quadruple : table) {
            if (quadruple.getOp().length() > opSize) {
                opSize = quadruple.getOp().length();
            }
            if (quadruple.getArg1().length() > arg1Size) {
                arg1Size = quadruple.getArg1().length();
            }
            if (quadruple.getArg2().length() > arg2Size) {
                arg2Size = quadruple.getArg2().length();
            }
            if (quadruple.getResult().length() > resultSize) {
                resultSize = quadruple.getResult().length();
            }
        }
        for (Quadruple quadruple : table) {
            Integer spacesNr = opSize - quadruple.getOp().length() + 2;
            System.out.print("|");
            for (int i = 0; i < spacesNr; i++) {
                if (i == spacesNr / 2) {
                    System.out.print(quadruple.getOp());
                }
                System.out.print(" ");
            }
            System.out.print("|");
            spacesNr = arg1Size - quadruple.getArg1().length() + 2;
            for (int i = 0; i < spacesNr; i++) {
                if (i == spacesNr / 2) {
                    System.out.print(quadruple.getArg1());
                }
                System.out.print(" ");
            }
            System.out.print("|");
            spacesNr = arg2Size - quadruple.getArg2().length() + 2;
            for (int i = 0; i < spacesNr; i++) {
                if (i == spacesNr / 2) {
                    System.out.print(quadruple.getArg2());
                }
                System.out.print(" ");
            }
            System.out.print("|");
            spacesNr = resultSize - quadruple.getResult().length() + 2;
            for (int i = 0; i < spacesNr; i++) {
                if (i == spacesNr / 2) {
                    System.out.print(quadruple.getResult());
                }
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
    }

    public void printThreeAddressCode() {
        Stack<String> whileBackLabel = new Stack<>();
        for (int i = 1; i < this.table.size(); i++) {
            Quadruple quadruple = this.table.get(i);
            if (this.ifMap.containsKey(i)) {
                System.out.println("if " + this.ifMap.get(i).getArg1() + " goto " + this.ifMap.get(i).getResult());
            } else if (this.whileMap.containsKey(i)) {
                whileBackLabel.push(this.whileMap.get(i).getArg1());
                System.out.println(this.whileMap.get(i).getArg1() + ": if " + this.whileMap.get(i).getArg2() + " goto " + this.whileMap.get(i).getResult());
            }
            if (quadruple.getOp().matches("\\+|-|/|\\*|>|<|>=|<=")) {
                System.out.println(quadruple.getResult() + " := " + quadruple.getArg1() + " " + quadruple.getOp() + " " + quadruple.getArg2());
            } else if (quadruple.getOp().equals("=")) {
                System.out.println(quadruple.getResult() + " := " + quadruple.getArg1());
            } else if (quadruple.getOp().equals("param")) {
                System.out.println("param " + quadruple.getArg1());
            } else if (quadruple.getOp().equals("call")) {
                System.out.println(quadruple.getResult() + " := call " + quadruple.getArg1() + ", " +
                        this.findFunctionByName(quadruple.getArg1()).getVarList().size());
            } else if (quadruple.getOp().equals("if")) {
                //System.out.println("if "+quadruple.getArg1()+" goto "+quadruple.getResult());
            } else if (quadruple.getOp().equals("while")) {
                System.out.println("goto " + whileBackLabel.pop());
            }
        }
    }

    private String castValues(String value1, String value2) {
        if (value1.equals(value2)) {
            return value1;
        }
        if ((value1.equals("float") && value2.equals("int")) ||
                (value2.equals("float") && value1.equals("int"))) {
            return "float";
        }

        return null;
    }

    private String existInTable(String exp) {
        for (TempVar tempVar : tempVars) {
            if (exp.equals(tempVar.getValue())) {
                return tempVar.getName();
            }
        }

        return exp;
    }

    private Function findFunctionByName(String name) {
        for (Function function : functions) {
            if (function.getName().equals(name)) {
                return function;
            }
        }

        return null;
    }

    private Var findVarByName(String name) {
        for (Var var : vars) {
            if (var.getName().equals(name)) {
                return var;
            }
        }
        for (TempVar tvar : tempVars) {
            if (tvar.getName().equals(name)) {
                Var var = new Var();
                var.setName(name);
                var.setType(tvar.getType());
                var.setValue(tvar.getValue());
                return var;
            }
        }

        return null;
    }

    private String invertOp(String exp){
        String patternStr = "==|!=|<=|>=|<|>";
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(exp);
        String op = "";
        if (matcher.find()) {
            op = matcher.group();
        }
        String invert = "";
        switch (op){
            case "==":
                invert = "!=";
                break;
            case "!=":
                invert =  "==";
                break;
            case "<":
                invert =  ">=";
                break;
            case ">":
                invert =  "<=";
                break;
            case "<=":
                invert =  ">";
                break;
            case ">=":
                invert =  "<";
                break;
            default:
                invert =  op;
        }

        return exp.replace(op,invert);
    }

    @Override
    public T visitProgram(CMinusParser.ProgramContext ctx) {
        try {
            this.addTableHeader();
            return visitChildren(ctx);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public T visitExp_decl(CMinusParser.Exp_declContext ctx) {
        try {
            T t = visitChildren(ctx);
            Integer opIdx = ctx.getText().indexOf('=');
            String op = "=";
            String result = ctx.getText().substring(0, opIdx);
            String arg1 = this.existInTable(ctx.getText().substring(opIdx + 1, ctx.getText().length() - 1));

            Var var = this.findVarByName(arg1);
            if (var == null && !arg1.matches("\\d*\\.?\\d*")) {
                throw new Exception("Variavel inválida: a variavel " + arg1 + " não foi definida.");
            }

            this.addlineToTable(op, arg1, "", result);

            return t;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public T visitSelect_decl(CMinusParser.Select_declContext ctx) {
        try {
            Integer flag = this.table.size() + 1;
            T t = visitChildren(ctx);
            String exp = ctx.getText();
            String patternStr = "\\(([^)]+)\\)";
            Pattern pattern = Pattern.compile(patternStr);
            Matcher matcher = pattern.matcher(exp);
            String op = "if";
            if (matcher.find()) {
                String value = this.invertOp(matcher.group().replaceAll("[(,)]", ""));
                String arg1 = this.existInTable(matcher.group().replaceAll("[(,)]", ""));
                Var var = this.findVarByName(arg1);
                if (var == null && !arg1.matches("\\d*\\.?\\d*")) {
                    throw new Exception("Variavel inválida: a variavel " + arg1 + " não foi definida.");
                }
                String result = "(" + (flag) + ")";
                this.addlineToTable(op, arg1, "", result);
                Quadruple quadruple = new Quadruple();
                quadruple.setOp(op);
                quadruple.setArg1(value);
                quadruple.setArg2("");
                quadruple.setResult("(" + this.table.size() + ")");
                this.ifMap.put(flag, quadruple);
            }
            return t;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public T visitInter_decl(CMinusParser.Inter_declContext ctx) {
        try {
            Integer flag = this.table.size() + 1;
            T t = visitChildren(ctx);
            String exp = ctx.getText();
            String patternStr = "\\(([^)]+)\\)";
            Pattern pattern = Pattern.compile(patternStr);
            Matcher matcher = pattern.matcher(exp);
            String op = "while";
            if (matcher.find()) {
                String value = this.invertOp(matcher.group().replaceAll("[(,)]", ""));
                String arg1 = this.existInTable(matcher.group().replaceAll("[(,)]", ""));
                Var var = this.findVarByName(arg1);
                if (var == null && !arg1.matches("\\d*\\.?\\d*")) {
                    throw new Exception("Variavel inválida: a variavel " + arg1 + " não foi definida.");
                }
                String result = "(" + (flag) + ")";
                this.addlineToTable(op, arg1, "", result);
                Quadruple quadruple = new Quadruple();
                quadruple.setOp(op);
                quadruple.setArg2(value);
                quadruple.setArg1("L" + flag);
                quadruple.setResult("(" + this.table.size() + ")");
                this.whileMap.put(flag, quadruple);
            }
            return t;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public T visitExp(CMinusParser.ExpContext ctx) {
        try {
            T t = visitChildren(ctx);
            String exp = ctx.getText();
            String patternStr = "[+|\\-|/|*|<=|>=|<|>|==|!=]";
            Pattern pattern = Pattern.compile(patternStr);
            Matcher matcher = pattern.matcher(exp);
            if (exp.length() > 1 && matcher.find()) {
                Integer opIdx = matcher.start();
                String op = matcher.group();
                if (exp.charAt(opIdx + 1) == '=') {
                    op += '=';
                }
                if (!op.equals("=")) {
                    TempVar tempVar = new TempVar();
                    String arg1 = this.existInTable(exp.substring(0, opIdx).replaceAll("[(,)]", ""));
                    String arg2 = this.existInTable(exp.substring(opIdx + op.length(), exp.length()).replaceAll("[(,)]", ""));
                    String result = tempVar.getName();
                    tempVar.setValue(arg1 + op + arg2);
                    this.tempVars.add(tempVar);
                    this.addlineToTable(op, arg1, arg2, result);
                }
            }
            return t;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public T visitActive(CMinusParser.ActiveContext ctx) {
        try {
            T t = visitChildren(ctx);
            String exp = ctx.getText();
            String patternStr = "\\(([^)]+)\\)";
            Pattern pattern = Pattern.compile(patternStr);
            Matcher matcher = pattern.matcher(exp);
            String op = "call";
            String arg1 = exp.replaceAll("\\(([^)]+)\\)", "");
            Function func = this.findFunctionByName(arg1);
            if (func == null) {
                throw new Exception("Função inválida: A função " + arg1 + " não foi declarada");
            }
            if (matcher.find()) {
                String[] params = matcher.group().split(",");
                for (int i = 0; i < params.length; i++) {
                    String param = params[i];
                    if (param.charAt(0) == '(') {
                        param = param.substring(1);
                    }
                    if (param.charAt(param.length() - 1) == ')') {
                        param = param.substring(0, param.length() - 1);
                    }
                    String op2 = "param";
                    String parg1 = this.existInTable(param);
                    this.addlineToTable(op2, parg1, "", "");
                }
            }

            String result = "";
            if (!func.getReturnType().equals("void")) {
                TempVar tempVar = new TempVar();
                tempVar.setValue(exp);
                this.tempVars.add(tempVar);
                result = tempVar.getName();
            }
            this.addlineToTable(op, arg1, "", result);
            return t;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public T visitFunc_decl(CMinusParser.Func_declContext ctx) {
        try {
            Scope scope = new Scope();
            scope.setParent(global);
            active = scope;
            Function function = new Function();
            String exp = ctx.getText();
            String patternStr = "int|float|char|void|struct";
            Pattern pattern = Pattern.compile(patternStr);
            Matcher matcher = pattern.matcher(exp);
            if (matcher.find()) {
                String type = matcher.group();
                String name = exp.replaceAll(type, "").replaceAll("\\((.*)", "");
                function.setReturnType(type);
                function.setName(name);
            }
            patternStr = "\\(([^)]+)\\)";
            pattern = Pattern.compile(patternStr);
            matcher = pattern.matcher(exp);
            if (matcher.find()) {
                String[] params = matcher.group().split(",");
                for (int i = 0; i < params.length; i++) {
                    String param = params[i];
                    if (param.charAt(0) == '(') {
                        param = param.substring(1);
                    }
                    if (param.charAt(param.length() - 1) == ')') {
                        param = param.substring(0, param.length() - 1);
                    }
                    String patternStr2 = "int|float|char|void|struct";
                    Pattern pattern2 = Pattern.compile(patternStr2);
                    Matcher matcher2 = pattern2.matcher(param);
                    if (matcher2.find()) {
                        String type = matcher.group();
                        String name = exp.replace(type, "").replace(";", "");
                        Var var = new Var();
                        var.setName(name);
                        var.setType(type);
                        function.getVarList().add(var);
                    }
                }
            }
            this.functions.add(function);
            T t = visitChildren(ctx);
            return t;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public T visitVar_decl(CMinusParser.Var_declContext ctx) {
        try {
            String exp = ctx.getText();
            String patternStr = "int|float|char|void|struct";
            Pattern pattern = Pattern.compile(patternStr);
            Matcher matcher = pattern.matcher(exp);
            if (matcher.find()) {
                String type = matcher.group();
                String name = exp.replace(type, "").replace(";", "");
                Var var = new Var();
                var.setName(name);
                var.setType(type);
                this.vars.add(var);
            }
            T t = visitChildren(ctx);
            return t;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public T visitSimple_exp(CMinusParser.Simple_expContext ctx) {
        try {
            return visitChildren(ctx);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public T visitExp_sum(CMinusParser.Exp_sumContext ctx) {
        try {
            return visitChildren(ctx);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public T visitCommand(CMinusParser.CommandContext ctx) {
        try {
            return visitChildren(ctx);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public T visitComp_decl(CMinusParser.Comp_declContext ctx) {
        try {
            return visitChildren(ctx);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public T visitReturn_decl(CMinusParser.Return_declContext ctx) {
        try {
            return visitChildren(ctx);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public T visitVar(CMinusParser.VarContext ctx) {
        try {
            return visitChildren(ctx);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public T visitTerm(CMinusParser.TermContext ctx) {
        try {
            return visitChildren(ctx);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public T visitFactor(CMinusParser.FactorContext ctx) {
        try {
            return visitChildren(ctx);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public T visitArgs(CMinusParser.ArgsContext ctx) {
        try {
            return visitChildren(ctx);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public T visitArgs_list(CMinusParser.Args_listContext ctx) {
        try {
            return visitChildren(ctx);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public T visitStatament_list(CMinusParser.Statament_listContext ctx) {
        try {
            return visitChildren(ctx);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public T visitStatament(CMinusParser.StatamentContext ctx) {
        try {
            return visitChildren(ctx);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public T visitType(CMinusParser.TypeContext ctx) {
        try {
            return visitChildren(ctx);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public T visitAttr_decl(CMinusParser.Attr_declContext ctx) {
        try {
            return visitChildren(ctx);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public T visitParams(CMinusParser.ParamsContext ctx) {
        try {
            return visitChildren(ctx);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public T visitParam(CMinusParser.ParamContext ctx) {
        try {
            return visitChildren(ctx);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}