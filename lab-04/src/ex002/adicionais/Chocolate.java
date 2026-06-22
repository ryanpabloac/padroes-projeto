package ex002.adicionais;

import ex002.cafes.Cafe;

public class Chocolate extends CafeDecorator {
    public Chocolate(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return super.cafe.getDescricao() + ", Chocolate";
    }

    @Override
    public double calcularCusto() {
        return super.cafe.calcularCusto() + 4.23;
    }
}