package ex04;

import ex04.acoes.Acao;

public class Investidor {
    private String nome;
    private Corretor corretor;

    public Investidor(String nome, Corretor corretor) {
        this.nome = nome;
        this.corretor = corretor;
    }

    public void comprarAcao(Acao acao) {
        this.corretor.comprarAcao(acao, this);
    }

    public void venderAcao(Acao acao) {
        this.corretor.venderAcao(acao, this);
    }

    public void atualizarAcao(String acao, double valor) {
        System.out.printf("[%s] Ação [%s]: R$%.2f \n", nome, acao, valor);
    }
}