package ex01;

import ex01.payment.PaymentStrategy;
import ex01.shipping.ShippingStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    private ShippingStrategy shippingStrategy;
    private List<Item> itemList;

    public ShoppingCart(PaymentStrategy paymentStrategy, ShippingStrategy shippingStrategy) {
        this.itemList = new ArrayList<>();
        this.paymentStrategy = paymentStrategy;
        this.shippingStrategy = shippingStrategy;
    }

    public void addItem(Item item) {
        this.itemList.add(item);
    }

    public void removeItem(Item item) {
        this.itemList.remove(item);
    }

    public double total() {
        return itemList.stream().mapToDouble(item -> item.getValue()).sum();
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public double shippingFee(double value) {
        return 0.12*value;
    }
    public void pay() {
        double total = this.total();
        this.shippingStrategy.pay(shippingFee(total));
        this.paymentStrategy.pay(total);
        this.itemList.clear();
    }

    @Override
    public String toString() {
        return "ShoppingCart{ \n" +
                "Total= " + total() +
                "\nitemList=" + itemList +
                "\n}";
    }
}