package atividade1;

import atividade1.fabricante.*;

public class FabricanteSingleton {
    private static FabricanteCelular samsung;
    private static FabricanteCelular apple;

    private FabricanteSingleton() {
    }

    public static FabricanteCelular getInstanceSamsung() {
        if (samsung == null) {
            samsung = new Samsung();
        }
        return samsung;
    }

    public static FabricanteCelular getInstanceApple() {
        if (apple == null) {
            apple = new Apple();
        }
        return apple;
    }
}
