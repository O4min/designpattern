package behavioral.command.example2;

/**
 * Author: A.Hosseini
 * Date:10/8/2023
 * Time:11:57 AM
 */
public class Money {

    private String currency;

    public Money(String currency) {
        this.currency = currency;
    }



    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
