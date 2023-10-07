package behavioral.command.example1;

/**
 * Author: A.Hosseini
 * Date:10/7/2023
 * Time:5:14 PM
 */
//Concrete command
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
