package _9_patterns._hw._adapter;

public class PayPalAdapter implements PaymentAdapter {
    private final PayPalAccount payPalAccount;

    public PayPalAdapter(PayPalAccount payPalAccount) {
        this.payPalAccount = payPalAccount;
    }

    @Override
    public boolean collectMoney(Integer amount) {
        return this.payPalAccount.transfer(payPalAccount.getEmail(),amount).contains("Paypal Success");
    }
}
