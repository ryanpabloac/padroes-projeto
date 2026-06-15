package ex03.externo;

import java.util.ArrayList;
import java.util.List;

public class Binario {

    private List<Byte> textoBin;

    public Binario() {
        textoBin = new ArrayList<>();
    }

    public void gravarCaractere(char caractere) {
        textoBin.add((byte) caractere);
    }

    public List<Byte> mostrarBinario() {
        return textoBin;
    }
}