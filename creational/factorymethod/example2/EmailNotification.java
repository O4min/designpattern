package creational.factorymethod.example2;

/**
 * Author: A.Hosseini
 * Date:10/22/2023
 * Time:5:00 PM
 */
public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("User notified by an EMAIL!");
    }
}
