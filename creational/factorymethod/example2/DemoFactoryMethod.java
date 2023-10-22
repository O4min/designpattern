package creational.factorymethod.example2;

/**
 * Author: A.Hosseini
 * Date:10/22/2023
 * Time:5:09 PM
 */
public class DemoFactoryMethod {
    public static void main(String[] args) {
        //consider channel type as input from user or system
        var notification = new NotificationFactory().createNotification(ChannelType.SMS);
        notification.notifyUser();
        System.out.println("process finished");
    }
}
