package behavioral.command.example1;

/**
 * Author: A.Hosseini
 * Date:10/7/2023
 * Time:5:16 PM
 */
//Invoker class

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        orderList.forEach(Order::execute);
    }
}
