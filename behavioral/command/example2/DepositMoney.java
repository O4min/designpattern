package behavioral.command.example2;

/**
 * Author: A.Hosseini
 * Date:10/8/2023
 * Time:11:56 AM
 */
public class DepositMoney implements Transaction{

    private Transfer transfer;

    public DepositMoney(Transfer transfer) {
        this.transfer = transfer;
    }

    @Override
    public void execute() {
        transfer.deposit();;
    }
}
