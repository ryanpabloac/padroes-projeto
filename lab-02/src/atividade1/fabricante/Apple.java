package atividade1.fabricante;

import atividade1.celular.Celular;
import atividade1.celular.Iphone16;

public class Apple implements FabricanteCelular {

    @Override
    public Celular construirCelular(String modelo) {
        if(modelo.equals("Iphone16")) return new Iphone16();
        else return null;
    }
}
