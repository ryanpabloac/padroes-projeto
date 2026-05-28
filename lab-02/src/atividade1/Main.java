package atividade1;

import atividade1.celular.Celular;
import atividade1.fabricante.FabricanteCelular;

public class Main {
    public static void main(String[] args) {
        FabricanteCelular samsung = FabricanteSingleton.getInstanceSamsung();
        Celular sgs8 = samsung.construirCelular("GalaxyS8");

        FabricanteCelular apple = FabricanteSingleton.getInstanceApple();
        Celular ai16 = apple.construirCelular("Iphone16");

        sgs8.tirarFoto();
        ai16.fazerLigacao();
    }
}
