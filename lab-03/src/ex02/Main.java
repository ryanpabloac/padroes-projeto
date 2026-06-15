package ex02;

public class Main {
    public static void main(String[] args) {
        CalcBinaria calcBin = new CalcBinaria();

        Calculadora calculadora = new CalcBinAdapter(calcBin);

        System.out.println(calculadora.somar(3, 2));
        System.out.println(calculadora.subtrair(5, 3));
        System.out.println(calculadora.multiplicar(2,3));
    }
}
