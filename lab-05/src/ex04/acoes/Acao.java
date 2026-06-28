package ex04.acoes;

import ex04.Investidor;

import java.util.ArrayList;
import java.util.List;

public abstract class Acao {
    private double valor;
    protected List<Investidor> investidores;

    protected Acao() {
        this.investidores = new ArrayList<>();
    }
    public void adicionarInvestidor(Investidor investidor) {
        this.investidores.add(investidor);
    }

    public void removerInvestidor(Investidor investidor) {
        this.investidores.remove(investidor);
    }

    public void atualizarValor(double valor) {
        this.valor = valor;
        notificarInvestidores(valor);
    }

    public abstract void notificarInvestidores(double valor);
}