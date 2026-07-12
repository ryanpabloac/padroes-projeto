package ex02.elementos;

import ex02.visitor.DocVisitor;

import java.util.ArrayList;
import java.util.List;

public class Table extends DocElement {
    private List<String> columns;

    public Table(String... columns) {
        this.columns = new ArrayList<>();

        for(String s : columns) {
            this.columns.add(s);
        }
    }

    @Override
    public void accept(DocVisitor v) {
        v.visit(this);
    }

    public List<String> getColumns() {
        return columns;
    }
}
