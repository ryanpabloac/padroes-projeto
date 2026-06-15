package ex03;

import ex03.externo.Texto;

public class TextoAdapter implements Arquivo {

    private Texto texto;

    public TextoAdapter(Texto texto) {
        this.texto = texto;
    }

    @Override
    public void gravar(String texto) {
        String[] textoSplit = texto.split("\n");

        for(String s : textoSplit) this.texto.gravarLinha(s);
    }

    @Override
    public String mostrar() {
        String impressao = "";
        for(String s : this.texto.mostrarTexto()) {
            impressao += s;
            impressao += "\n";
        }

        return impressao;
    }

}