package behavioral.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class SubjectTest {

    @Test
    void shouldNotifySubscribers() {

        Subject subject = new Subject();

        subject.subscribe(
                new EmailSubscriber("john@example.com")
        );

        subject.subscribe(
                new SmsSubscriber("+123456789")
        );

        assertDoesNotThrow(
                () -> subject.notifyObservers(
                        "Order shipped"
                )
        );
    }

    @Test
    void shouldAllowUnsubscribe() {

        Subject subject = new Subject();

        Observer observer =
                new EmailSubscriber("john@example.com");

        subject.subscribe(observer);
        subject.unsubscribe(observer);

        assertDoesNotThrow(
                () -> subject.notifyObservers(
                        "Order shipped"
                )
        );
    }
}
