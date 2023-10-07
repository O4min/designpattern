package behavioral.command.example1;

/**
 * Author: A.Hosseini
 * Date:10/7/2023
 * Time:5:53 PM
 */

public class CancelStock implements Order {

    private Stock stock;

    public CancelStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.cancel();
    }
}
