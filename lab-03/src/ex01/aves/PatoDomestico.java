package ex01.aves;

public class PatoDomestico implements Pato {

    @Override
    public void grasnar() {
        System.out.println("Pato Doméstico grasnando...");
    }

    @Override
    public void voar() {
    System.out.println("Pato Doméstico voando...");
    }

}