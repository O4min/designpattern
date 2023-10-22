package creational.factorymethod.example2;

/**
 * Author: A.Hosseini
 * Date:10/22/2023
 * Time:5:01 PM
 */
public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("User notified by a SMS!");
    }
}
