package ex01.shipping;

public class SedexShipping implements ShippingStrategy {
    @Override
    public void pay(double value) {
        System.out.println("Pagamento Frete SEDEX de R$ " + value);
    }
}
