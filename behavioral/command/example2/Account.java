package behavioral.command.example2;

/**
 * Author: A.Hosseini
 * Date:10/8/2023
 * Time:12:23 PM
 */
public class Account {

    private String id;
    private Long balance;

    public Account(String id, Long balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
}
