package ex02.elementos;

import ex02.visitor.DocVisitor;

public class Image extends DocElement{
    private String img;

    public Image(String img) {
        this.img = img;
    }

    @Override
    public void accept(DocVisitor v) {
        v.visit(this);
    }

    public String getImg() {
        return img;
    }
}
