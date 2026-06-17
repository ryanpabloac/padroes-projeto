package ex01.payment;

public class CreditCard implements PaymentStrategy {
    @Override
    public void pay(double value) {
        System.out.println("Pagamento Cartão Crédito de R$ " + value);
    }
}
