package br.com.compiler.semantic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 08/03/17.
 */
public class Function {
    private String returnType;
    private String name;
    private List<Var> varList;
    private Scope scope;

    public Function() {
        this.varList = new ArrayList<>();
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Var> getVarList() {
        return varList;
    }

    public void setVarList(List<Var> varList) {
        this.varList = varList;
    }

    @Override
    public boolean equals(Object obj){
        Function func = (Function) obj;
        return func.getName().equals(this.getName());
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }
}
