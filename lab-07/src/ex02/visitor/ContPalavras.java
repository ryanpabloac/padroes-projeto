package ex02.visitor;

import ex02.elementos.Image;
import ex02.elementos.Paragraph;
import ex02.elementos.Table;

import java.util.List;

public class ContPalavras implements DocVisitor {
    @Override
    public void visit(Paragraph p) {
        String[] palavras = p.getText().split(" ");
        System.out.println(palavras.length + " palavras");
    }

    @Override
    public void visit(Table t) {
        System.out.println(t.getColumns().size() + " palavras");
    }

    @Override
    public void visit(Image i) {}
}