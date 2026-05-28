package atividade1.celular;

public class Iphone16 implements Celular{
    @Override
    public void fazerLigacao() {
        System.out.println("[Iphone 16] Ligando ...");
    }

    @Override
    public void tirarFoto() {
        System.out.println("[Iphone 16] Tirando Foto ...");
    }
}
