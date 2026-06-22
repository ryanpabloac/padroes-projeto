package ex002.adicionais;

import ex002.cafes.Cafe;

public class Chantilly extends CafeDecorator {
    public Chantilly(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return super.cafe.getDescricao() + ", Chantilly";
    }

    @Override
    public double calcularCusto() {
        return super.cafe.calcularCusto() + 1.25;
    }
}