package ex002.cafes;

public class CafeDescafeinado implements Cafe {

    @Override
    public String getDescricao() {
        return "Café Descafeinado";
    }

    @Override
    public double calcularCusto() {
        return 3.25;
    }

}