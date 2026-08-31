package creational.factory;

public class FactoryDemo {

    public static void main(String[] args) {

        Notification email =
                NotificationFactory.create("email");

        Notification sms =
                NotificationFactory.create("sms");

        email.send("Welcome to our application.");

        sms.send("Your OTP is 123456.");
    }
}
