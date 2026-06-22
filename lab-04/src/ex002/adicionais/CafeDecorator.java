package ex002.adicionais;

import ex002.cafes.Cafe;

public abstract class CafeDecorator implements Cafe {
    protected Cafe cafe;

    public CafeDecorator(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public abstract String getDescricao();

    @Override
    public abstract double calcularCusto();
}
