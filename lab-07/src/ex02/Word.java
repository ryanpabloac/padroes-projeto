package ex02;

import ex02.elementos.*;
import ex02.visitor.*;

import java.util.ArrayList;
import java.util.List;

public class Word {
    static List<DocElement> elem = new ArrayList<>();

    static void main() {
        elem.add(new Paragraph("Primeiro parágrafo escrito"));
        elem.add(new Image("Iamgem de Exemplo"));
        elem.add(new Table("Coluna 1", "Coluna 2", "Coluna 3"));

        DocVisitor html = new ExportHTML();
        DocVisitor pdf = new ExportPDF();
        DocVisitor cont = new ContPalavras();

        System.out.println("Exportando HTML");
        for(DocElement d : elem) d.accept(html);

        System.out.println("Exportando PDF");
        for(DocElement d : elem) d.accept(pdf);

        System.out.println("COntagem de Palavras");
        for(DocElement d : elem) d.accept(cont);
    }
}
