package ex01.payment;

public class Pix implements PaymentStrategy {
    @Override
    public void pay(double value) {
        System.out.println("Pagamento PIX de R$ " + value);
    }
}
