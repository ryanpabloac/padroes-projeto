package ex01.adapter;

import ex01.aves.Pavao;

public class PavaoAdapter implements Ave {

    private Pavao pavao;

    public PavaoAdapter(Pavao pavao) {
        this.pavao = pavao;
    }

    @Override
    public void emitirSom() {
        pavao.cantar();
    }

    @Override
    public void voar() {
        System.out.println("Pavão não consegue voar");
    }
}
