package ex02.visitor;

import ex02.elementos.Image;
import ex02.elementos.Paragraph;
import ex02.elementos.Table;

public class ExportPDF implements DocVisitor {
    @Override
    public void visit(Paragraph p) {
        System.out.println(p.getText() + "\n");
    }

    @Override
    public void visit(Table t) {
        for(String s : t.getColumns()) {
            System.out.print(s + " | ");
        }

        System.out.println();
    }

    @Override
    public void visit(Image i) {
        System.out.println("IMAGEM:" + i.getImg());
    }

}
