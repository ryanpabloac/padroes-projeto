package ex01;

import ex01.payment.CreditCard;
import ex01.payment.Pix;
import ex01.shipping.SedexShipping;

public class Main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(new CreditCard(), new SedexShipping());
        cart.setPaymentStrategy(new Pix());

        cart.addItem(new Item(123, "Xiaomi Redmi 13", 899));
        System.out.println(cart);

        Item laptop = new Item(125, "Notebook Asus Vivobook 15", 2456.3);
        cart.addItem(laptop);
        System.out.println(cart);

        cart.removeItem(laptop);
        System.out.println(cart);

        cart.pay();
        System.out.println(cart);
    }
}
