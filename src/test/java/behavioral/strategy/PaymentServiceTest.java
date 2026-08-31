package behavioral.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PaymentServiceTest {

    @Test
    void shouldProcessCreditCardPayment() {

        PaymentService service =
                new PaymentService(
                        new CreditCardPayment()
                );

        assertDoesNotThrow(
                () -> service.processPayment(1000)
        );
    }

    @Test
    void shouldProcessPaypalPayment() {

        PaymentService service =
                new PaymentService(
                        new PayPalPayment()
                );

        assertDoesNotThrow(
                () -> service.processPayment(1000)
        );
    }

    @Test
    void shouldRejectInvalidAmount() {

        PaymentService service =
                new PaymentService(
                        new CreditCardPayment()
                );

        assertThrows(
                IllegalArgumentException.class,
                () -> service.processPayment(0)
        );
    }
}
