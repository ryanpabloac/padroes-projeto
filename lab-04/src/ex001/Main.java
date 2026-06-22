package ex001;

import ex001.ingredientes.*;
import ex001.massas.*;

public class Main {
    public static void main(String[] args) {
        Pizza portuguesa = new Queijo(new Ovo(new Tomate(new MassaGrossaPizza())));
        Pizza marguerita = new Queijo(new Ovo(new Tomate(new MassaFinaPizza())));

        System.out.println(portuguesa.getDescricao());
        System.out.println(portuguesa.getCusto());

        System.out.println(marguerita.getDescricao());
        System.out.println(marguerita.getCusto());
    }
}