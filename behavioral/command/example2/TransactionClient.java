package behavioral.command.example2;

import java.util.Random;
import java.util.UUID;

/**
 * Author: A.Hosseini
 * Date:10/8/2023
 * Time:11:55 AM
 */
public class TransactionClient {

    public static void main(String[] args) {
        Transfer atomicTransfer = new Transfer(new Money("USD"),new Account("100000235",45000L),1000L,
                new Random(213).toString());
        BankBroker broker = new BankBroker();
        broker.takeTransfer(atomicTransfer.getTransferId(),new DepositMoney(atomicTransfer));
        broker.takeRollback(atomicTransfer.getTransferId(),new WithdrawMoney(atomicTransfer));
        broker.applyTransfers();
    }
}
