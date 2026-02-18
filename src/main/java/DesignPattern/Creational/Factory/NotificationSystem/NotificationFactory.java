package DesignPattern.Creational.Factory.NotificationSystem;

public class NotificationFactory {
    public static Notification getNotification(String type){

        if (type.equalsIgnoreCase("EMAIL")) {
            return new Email();
        } else if (type.equalsIgnoreCase("SMS")) {
            return new Sms();
        } else if (type.equalsIgnoreCase("PUSH")) {
            return new PushNotification();
        }
        throw new IllegalArgumentException("enter valid notification type");
//        return null;
    }
}
