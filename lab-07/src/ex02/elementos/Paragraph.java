package ex02.elementos;

import ex02.visitor.DocVisitor;

public class Paragraph extends DocElement {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void accept(DocVisitor v) {
        v.visit(this);
    }

    public String getText() {
        return text;
    }
}
