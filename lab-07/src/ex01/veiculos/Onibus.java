package ex01.veiculos;

import ex01.operacao.OperacaoVisitor;

public class Onibus extends Veiculo {
    private int qtdLugares;
    private int anoFabricacao;

    public Onibus(int qtdLugares, int anoFabricacao) {
        this.qtdLugares = qtdLugares;
        this.anoFabricacao = anoFabricacao;
    }

    public int getQtdLugares() {
        return qtdLugares;
    }

    @Override
    public void accept(OperacaoVisitor ov) {
        ov.visit(this);
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }
}