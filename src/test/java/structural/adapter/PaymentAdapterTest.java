package structural.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class PaymentAdapterTest {

    @Test
    void shouldProcessPaymentThroughAdapter() {

        LegacyPaymentGateway gateway =
                new LegacyPaymentGateway();

        PaymentProcessor processor =
                new PaymentAdapter(gateway);

        assertDoesNotThrow(
                () -> processor.processPayment(1000)
        );
    }
}
