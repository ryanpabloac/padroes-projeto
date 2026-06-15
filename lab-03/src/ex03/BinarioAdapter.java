package ex03;

import ex03.externo.Binario;

import java.util.List;

public class BinarioAdapter implements Arquivo {

    private Binario binario;

    public BinarioAdapter(Binario binario) {
        this.binario = binario;
    }

    @Override
    public void gravar(String texto) {
        char[] caracteres = texto.toCharArray();

        for(char c : caracteres) this.binario.gravarCaractere(c);
    }

    @Override
    public String mostrar() {
        List<Byte> binList = this.binario.mostrarBinario();

        String impressao = "";
        for(Byte b : binList) {
            impressao += (char) b.byteValue();
        }

        return impressao;
    }
}
