package ex001.ingredientes;

import ex001.*;

public class Tomate extends PizzaDecorator {
    public Tomate(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return "Tomate " + pizza.getDescricao();
    }

    @Override
    public double getCusto() {
        return super.pizza.getCusto() + 1.32;
    }
}