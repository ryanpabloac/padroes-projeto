package ex02.elementos;

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

    public List<String> getColumns() {
        return columns;
    }
}
