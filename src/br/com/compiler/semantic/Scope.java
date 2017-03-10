package br.com.compiler.semantic;

/**
 * Created by root on 09/03/17.
 */
public class Scope {
    private static Integer count = 0;
    private Integer index;
    private Scope parent;

    public Scope() {
        this.index = count++;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Scope getParent() {
        return parent;
    }

    public void setParent(Scope parent) {
        this.parent = parent;
    }
}
