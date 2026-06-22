package ex002.adicionais;

import ex001.Pizza;
import ex001.PizzaDecorator;
import ex002.cafes.Cafe;

public class Leite extends CafeDecorator {
    public Leite(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return super.cafe.getDescricao() + ", Leite";
    }

    @Override
    public double calcularCusto() {
        return super.cafe.calcularCusto() + 2;
    }
}