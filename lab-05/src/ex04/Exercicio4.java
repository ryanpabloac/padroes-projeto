package ex04;

import ex04.acoes.Acao;
import ex04.acoes.AcaoItau;
import ex04.acoes.AcaoPetrobras;

public class Exercicio4 {
    static void main() {
        Acao itau = AcaoItau.getInstancia();
        Acao petrobras = AcaoPetrobras.getInstancia();

        Corretor c1 = new Corretor();
        Corretor c2 = new Corretor();

        Investidor pedro = new Investidor("Pedro", c1);
        Investidor maria = new Investidor("Maria", c2);

        pedro.comprarAcao(itau);
        pedro.comprarAcao(petrobras);

        maria.comprarAcao(petrobras);

        itau.atualizarValor(30);
        petrobras.atualizarValor(42.54);

        pedro.venderAcao(itau);

        itau.atualizarValor(12);

    }
}
