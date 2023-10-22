package creational.factorymethod.example2;

/**
 * Author: A.Hosseini
 * Date:10/22/2023
 * Time:5:02 PM
 */
public class NotificationFactory {

    public Notification createNotification(final ChannelType channel) {
        return switch (channel) {
            case SMS -> new SMSNotification();
            case EMAIL -> new EmailNotification();
            case PUSH -> new PushNotification();
        };
    }
}
