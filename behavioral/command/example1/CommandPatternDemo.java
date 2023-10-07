package behavioral.command.example1;

/**
 * Author: A.Hosseini
 * Date:10/7/2023
 * Time:5:18 PM
 */
//Client class
public class CommandPatternDemo {
    public static void main(String[] args) {

        BuyStock buyStockOrder = new BuyStock(new Stock("Steel",7000));
        SellStock sellStockOrder = new SellStock(new Stock("Ayar",450));
        Order cancelStockOrder = new CancelStock(new Stock("Dara 1",9875));

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.takeOrder(cancelStockOrder);

        broker.placeOrders();
    }
}