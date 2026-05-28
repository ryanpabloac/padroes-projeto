package atividade1.celular;

public class GalaxyS8 implements Celular {
    @Override
    public void fazerLigacao() {
        System.out.println("[Galaxy S8] Ligando ...");
    }

    @Override
    public void tirarFoto() {
        System.out.println("[Galaxy S8] Tirando Foto ...");
    }
}
