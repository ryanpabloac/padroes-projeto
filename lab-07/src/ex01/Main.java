package ex01;

import ex01.operacao.MsgVisitor;
import ex01.operacao.OperacaoVisitor;
import ex01.operacao.PrintVisitor;
import ex01.veiculos.Bicicleta;
import ex01.veiculos.Carro;
import ex01.veiculos.Onibus;
import ex01.veiculos.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OperacaoVisitor print = new PrintVisitor();
        OperacaoVisitor msg = new MsgVisitor();

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("branco", "chevrolet", "corsa"));
        veiculos.add(new Bicicleta("preto"));
        veiculos.add(new Onibus(120, 2014));

        for(Veiculo v : veiculos) {
            v.accept(print);
        }
    }
}
