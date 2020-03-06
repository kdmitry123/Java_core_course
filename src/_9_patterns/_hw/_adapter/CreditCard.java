package _9_patterns._hw._adapter;

import java.time.LocalDate;

public class CreditCard {
    private String number;
    private LocalDate expiration;

    public CreditCard(String number, LocalDate expiration) {
        this.number = number;
        this.expiration = expiration;
    }

    public String authorizeTransaction(Integer amount){
        return "Authorization code: as2321";
    }
}
