package ex04.acoes;

import ex04.Investidor;

public class AcaoPetrobras extends Acao {
    private static AcaoPetrobras instancia;

    private AcaoPetrobras() {
        super();
    }

    public static Acao getInstancia() {
        if(instancia == null) instancia = new AcaoPetrobras();

        return instancia;
    }

    @Override
    public void notificarInvestidores(double valor) {
        for(Investidor i : super.investidores) {
            i.atualizarAcao("Petrobrás",valor);
        }
    }
}
