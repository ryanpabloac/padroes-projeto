package ex01.adapter;

import ex01.aves.Pato;

public class PatoAdapter implements Ave {

    private Pato pato;

    public PatoAdapter(Pato pato) {
        this.pato = pato;
    }

    @Override
    public void emitirSom() {
        pato.grasnar();
    }

    @Override
    public void voar() {
        pato.voar();
    }

}
