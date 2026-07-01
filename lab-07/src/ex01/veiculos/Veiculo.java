package ex01.veiculos;

import ex01.operacao.OperacaoVisitor;

public abstract class Veiculo {
    public abstract void accept(OperacaoVisitor ov);
}