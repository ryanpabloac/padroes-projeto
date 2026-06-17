package ex01.shipping;

public class NormalShipping implements ShippingStrategy {
    @Override
    public void pay(double value) {
        System.out.println("Pagamento Frete Normal de R$ " + value);
    }
}
