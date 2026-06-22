package ex001.ingredientes;

import ex001.Pizza;
import ex001.PizzaDecorator;

public class Queijo extends PizzaDecorator {
    public Queijo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return "Queijo " + pizza.getDescricao();
    }

    @Override
    public double getCusto() {
        return super.pizza.getCusto() + 4.75;
    }

}