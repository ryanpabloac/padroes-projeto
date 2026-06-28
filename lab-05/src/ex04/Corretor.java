package ex04;

import ex04.acoes.Acao;

public class Corretor {

    public void comprarAcao(Acao acao, Investidor investidor) {
        acao.adicionarInvestidor(investidor);
    }

    public void venderAcao(Acao acao, Investidor investidor) {
        acao.removerInvestidor(investidor);
    }
}
