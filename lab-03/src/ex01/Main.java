package ex01;

import ex01.adapter.Ave;
import ex01.adapter.PatoAdapter;
import ex01.adapter.PavaoAdapter;
import ex01.aves.Pato;
import ex01.aves.PatoDomestico;
import ex01.aves.Pavao;
import ex01.aves.PavaoAzul;

public class Main {

    public static void main(String[] args) {
        Pato pato = new PatoDomestico();
        Pavao pavao = new PavaoAzul();

        Ave patoAdapter = new PatoAdapter(pato);
        Ave pavaoAdapter = new PavaoAdapter(pavao);

        patoAdapter.emitirSom();
        patoAdapter.voar();

        pavaoAdapter.emitirSom();
        pavaoAdapter.voar();
    }

}