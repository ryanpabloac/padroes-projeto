package ex02.elementos;

public class Paragraph extends DocElement {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
