package ex01.operacao;

import ex01.veiculos.Bicicleta;
import ex01.veiculos.Carro;
import ex01.veiculos.Onibus;

public interface OperacaoVisitor {
    void visit(Carro c);
    void visit(Onibus o);
    void visit(Bicicleta b);
}
