package ex001.massas;

import ex001.Pizza;

public class MassaFinaPizza implements Pizza {

    public String getDescricao() {
        return " Massa Fina";
    }

    @Override
    public double getCusto() {
        return 7.24;
    }
}