package ex03;

import ex03.externo.Binario;
import ex03.externo.Texto;

public class Main {
    public static void main(String[] args) {
        Arquivo binArq = new BinarioAdapter(new Binario());
        Arquivo txtArq = new TextoAdapter(new Texto());

        binArq.gravar("Esse é um exemplo de \n texto .bin");
        txtArq.gravar("Esse é um exemplo de \n texto .txt");

        System.out.println(binArq.mostrar());
        System.out.println(txtArq.mostrar());
    }
}
