package ex01;

public class Cafeteria {
    public static void main(String[] args) {
        Bebida cafe = new Cafe();
        Bebida capuccino = new Capuccino();
        Bebida cha = new Cha();

        cafe.servirBebida();
        System.out.println();
        capuccino.servirBebida();
        System.out.println();
        cha.servirBebida();
    }
}
