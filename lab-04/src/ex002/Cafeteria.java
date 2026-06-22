package ex002;

import ex002.adicionais.Canela;
import ex002.adicionais.Chantilly;
import ex002.cafes.Cafe;
import ex002.cafes.CafeExpresso;

public class Cafeteria {
    static void main(String[] args) {
        Cafe meuCafe = new Chantilly(new Canela(new CafeExpresso()));

        System.out.println(meuCafe.getDescricao());
        System.out.println(meuCafe.calcularCusto());
    }
}
