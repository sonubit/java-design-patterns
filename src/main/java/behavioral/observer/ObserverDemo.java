package behavioral.observer;

public class ObserverDemo {

    public static void main(String[] args) {

        Subject orderService = new Subject();

        orderService.subscribe(
                new EmailSubscriber("john@example.com")
        );

        orderService.subscribe(
                new SmsSubscriber("+1234567890")
        );

        orderService.notifyObservers(
                "Your order has been shipped."
        );
    }
}
