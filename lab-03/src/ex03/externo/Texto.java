package ex03.externo;

import java.util.ArrayList;
import java.util.List;

public class Texto {
    private List<String> texto;

    public Texto() {
        this.texto = new ArrayList<>();
    }

    public void gravarLinha(String linha) {
        this.texto.add(linha);
    }

    public List<String> mostrarTexto() {
        return texto;
    }
}