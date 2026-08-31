package creational.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NotificationFactoryTest {

    @Test
    void shouldCreateEmailNotification() {

        Notification notification =
                NotificationFactory.create("email");

        assertInstanceOf(
                EmailNotification.class,
                notification
        );
    }

    @Test
    void shouldCreateSmsNotification() {

        Notification notification =
                NotificationFactory.create("sms");

        assertInstanceOf(
                SmsNotification.class,
                notification
        );
    }

    @Test
    void shouldRejectUnsupportedType() {

        assertThrows(
                IllegalArgumentException.class,
                () -> NotificationFactory.create("push")
        );
    }
}
