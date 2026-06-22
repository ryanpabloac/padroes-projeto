package ex002.cafes;

public class CafeExpresso implements Cafe {

    @Override
    public String getDescricao() {
        return "Café Expresso";
    }

    @Override
    public double calcularCusto() {
        return 3.25;
    }

}