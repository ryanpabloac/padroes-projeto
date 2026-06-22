package ex001;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract String getDescricao();

    @Override
    public abstract double getCusto();

}