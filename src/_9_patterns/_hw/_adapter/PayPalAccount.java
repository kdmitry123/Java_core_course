package _9_patterns._hw._adapter;

public class PayPalAccount {
    private String email;
    private String password;

    public PayPalAccount(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String transfer(String email, Integer amount){
        return "Paypal Success!";
    }
}
