package ex01;

public class Capuccino extends Bebida {
    @Override
    protected void prepararBebida() {
        System.out.println("Preparando café...");
        System.out.println("Adicionado leite...");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionado canela...");
    }
}