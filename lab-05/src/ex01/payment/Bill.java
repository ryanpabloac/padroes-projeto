package ex01.payment;

public class Bill implements PaymentStrategy {
    @Override
    public void pay(double value) {
        System.out.println("Pagamento Boleto de R$ " + value);
    }
}
