package ex03;

public class PrefeituraUberlandia implements Assinante {
    private double umidadeAr;
    @Override
    public void atualizar(double umidadeAr, double vento, double temperatura) {
        this.umidadeAr = umidadeAr;
        System.out.println("Prefeitura de Uberlândia: Umidade do Ar = " + umidadeAr);
    }
}
