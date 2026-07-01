package ex01.operacao;

import ex01.veiculos.Bicicleta;
import ex01.veiculos.Carro;
import ex01.veiculos.Onibus;

public class MsgVisitor implements OperacaoVisitor {
    @Override
    public void visit(Carro c) {
        System.out.printf("Carro= {cor:%s, marca:%s, modelo:%s}\n",
                c.getCor(),
                c.getMarca(),
                c.getModelo());
    }

    @Override
    public void visit(Onibus o) {
        System.out.printf("Onibus= {qtd Lugares:%d, ano fabricação:$d}\n",
                o.getQtdLugares(),
                o.getAnoFabricacao());
    }

    @Override
    public void visit(Bicicleta b) {
        System.out.printf("Bicicleta= {cor:%s}\n", b.getCor());
    }
}