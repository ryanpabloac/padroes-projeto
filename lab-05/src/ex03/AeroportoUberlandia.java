package ex03;

public class AeroportoUberlandia implements Assinante {
    private double vento;

    @Override
    public void atualizar(double umidadeAr, double vento, double temperatura) {
        this.vento = vento;
        System.out.println("Aeroporto de Uberlândia: Rajadas de vento = " + vento);
    }

}
