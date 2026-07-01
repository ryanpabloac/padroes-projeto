package ex02.visitor;

import ex02.elementos.Image;
import ex02.elementos.Paragraph;
import ex02.elementos.Table;

public interface DocVisitor {
    void visit(Paragraph p);
    void visit(Table t);
    void visit(Image i);
}
