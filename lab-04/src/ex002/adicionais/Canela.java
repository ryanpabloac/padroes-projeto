package ex002.adicionais;

import ex002.cafes.Cafe;

public class Canela extends CafeDecorator {
    public Canela(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return super.cafe.getDescricao() + ", Canela";
    }

    @Override
    public double calcularCusto() {
        return super.cafe.calcularCusto() + 0.5;
    }
}