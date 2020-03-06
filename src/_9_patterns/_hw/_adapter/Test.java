package _9_patterns._hw._adapter;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Market market = new Market();
        CreditCard creditCard = new CreditCard("12345678", LocalDate.now());
        PayPalAccount payPalAccount = new PayPalAccount("qwe@qwe.com", "qwe");

        market.pay(creditCard, 10);
        market.pay(payPalAccount, 20);
    }
}
