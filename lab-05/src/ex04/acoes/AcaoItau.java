package ex04.acoes;

import ex04.Investidor;

public class AcaoItau extends Acao {
    private static AcaoItau instancia;

    private AcaoItau() {
        super();
    }

    public static Acao getInstancia() {
        if(instancia == null) instancia = new AcaoItau();

        return instancia;
    }

    @Override
    public void notificarInvestidores(double valor) {
        for(Investidor i : super.investidores) {
            i.atualizarAcao("Itaú", valor);
        }
    }
}