package behavioral.command.example2;

/**
 * Author: A.Hosseini
 * Date:10/8/2023
 * Time:11:59 AM
 */
public class Transfer {
    private Money money;
    private Account account;
    private Long amount;
    private String transferId;
    private final String bankAccount = "BANK";
    private Long bankBalance = 1452222131L;


    public Transfer(Money money, Account account, Long amount, String transferId) {
        this.money = money;
        this.account = account;
        this.amount = amount;
        this.transferId = transferId;
    }

    public void withdraw() {
        System.out.println("*******************************************************");
        System.out.println("WITHDRAW");
        System.out.println("before transaction:");
        System.out.println("bank balance:"+ bankBalance);
        System.out.println("user balance:"+account.getBalance());
        account.setBalance(account.getBalance() + amount);
        bankBalance = bankBalance - amount;
        System.out.println("after transaction:");
        System.out.println("bank balance:"+ bankBalance);
        System.out.println("user balance:"+account.getBalance());
    }


    public void deposit() {
        System.out.println("*******************************************************");
        System.out.println("DEPOSIT");
        System.out.println("before transaction:");
        System.out.println("bank balance:"+ bankBalance);
        System.out.println("user balance:"+account.getBalance());
        account.setBalance(account.getBalance() - amount);
        bankBalance = bankBalance + amount;
        System.out.println("after transaction:");
        System.out.println("bank balance:"+ bankBalance);
        System.out.println("user balance:"+account.getBalance());
    }


    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public Long getBankBalance() {
        return bankBalance;
    }
}
