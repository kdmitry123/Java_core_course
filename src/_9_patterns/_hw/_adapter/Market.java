package _9_patterns._hw._adapter;

public class Market {
    public boolean pay(PayPalAccount payPalAccount, Integer amount){
        return pay(new PayPalAdapter(payPalAccount), amount);
    }

    public boolean pay(CreditCard creditCard, Integer amount){
        return pay(new CreditCardAdapter(creditCard), amount);
    }

    private boolean pay(PaymentAdapter paymentAdapter, Integer amount){
        System.out.println("Payment made successfully. " + amount + "$  has been withdrawn from your account.");
        return paymentAdapter.collectMoney(amount);
    }
}
