package ex01;

public abstract class Bebida {

    private void aquecerAgua() { System.out.println("Aquecendo água..."); }

    protected abstract void prepararBebida();

    private void colocarXicara() { System.out.println("Adicionando bebida na xícara..."); }

    protected abstract void adicionarCondimentos();

    public void servirBebida() {
        aquecerAgua();
        prepararBebida();
        colocarXicara();
        adicionarCondimentos();
        System.out.println("BEBIDA PRONTA!");
    }
}