package ex01.veiculos;

import ex01.operacao.OperacaoVisitor;

public class Bicicleta extends Veiculo {
    private String cor;

    @Override
    public void accept(OperacaoVisitor ov) {
        ov.visit(this);
    }

    public Bicicleta(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }
}
