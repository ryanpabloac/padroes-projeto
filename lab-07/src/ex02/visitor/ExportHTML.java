package ex02.visitor;

import ex02.elementos.Image;
import ex02.elementos.Paragraph;
import ex02.elementos.Table;

public class ExportHTML implements DocVisitor {
    @Override
    public void visit(Paragraph p) {
        System.out.println("<p> \n"+ p.getText() + "\n</p>");
    }

    @Override
    public void visit(Table t) {
        System.out.println("<table>\n");
        for(String s : t.getColumns()) {
            System.out.println();
        }
        System.out.println("</table>");
    }

    @Override
    public void visit(Image i) {
        System.out.println("IMAGEM:\n"+i.getImg());
    }
}
