package ex001.ingredientes;

import ex001.Pizza;
import ex001.PizzaDecorator;

public class Ovo extends PizzaDecorator {
    public Ovo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return "Ovo " + pizza.getDescricao();
    }

    @Override
    public double getCusto() {
        return super.pizza.getCusto() + 2;
    }

}