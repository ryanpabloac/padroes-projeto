package ex001.massas;

import ex001.Pizza;

public class MassaGrossaPizza implements Pizza {

    public String getDescricao() {
        return " Massa Grossa";
    }

    @Override
    public double getCusto() {
        return 10;
    }
}