package ex02;

public class CalcBinAdapter implements Calculadora {

    private CalcBinaria calc;

    public CalcBinAdapter(CalcBinaria calc) {
        this.calc = calc;
    }

    @Override
    public int somar(int a, int b) {
        String bin1 = Integer.toBinaryString(a);
        String bin2 = Integer.toBinaryString(b);

        // Somente exemplo
        return calc.somar(bin1,bin2).length();
    }

    @Override
    public int subtrair(int  a, int b) {
        String bin1 = Integer.toBinaryString(a);
        String bin2 = Integer.toBinaryString(b);

        // Somente exemplo
        return calc.subtrair(bin1,bin2).length();
    }

    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }

}