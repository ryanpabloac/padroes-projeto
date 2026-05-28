package atividade1.fabricante;

import atividade1.celular.Celular;
import atividade1.celular.GalaxyS8;

public class Samsung implements FabricanteCelular {
    @Override
    public Celular construirCelular(String modelo) {
            if(modelo.equals("GalaxyS8")) return new GalaxyS8();
        else return null;
    }
}
