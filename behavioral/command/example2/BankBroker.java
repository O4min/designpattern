package behavioral.command.example2;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: A.Hosseini
 * Date:10/8/2023
 * Time:12:09 PM
 */
public class BankBroker {

    private Map<String, Transaction> transactions = new HashMap<>();
    private Map<String, Transaction> rollbacks = new HashMap<>();

    void takeTransfer(String transferId, Transaction transaction) {
        transactions.put(transferId, transaction);
    }

    void takeRollback(String transferId, Transaction transaction) {
        transactions.put(transferId, transaction);
    }

    void applyTransfers() {

        for (String transferId : transactions.keySet()) {
            try {
                transactions.get(transferId).execute();
            } catch (Exception e) {
                rollbacks.get(transferId).execute();
            }
        }
        transactions.clear();;
        rollbacks.clear();
    }
}
