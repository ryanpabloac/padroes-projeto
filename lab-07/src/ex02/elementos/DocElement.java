package ex02.elementos;

import ex02.visitor.DocVisitor;

public abstract class DocElement {
    public abstract void accept(DocVisitor v);
}