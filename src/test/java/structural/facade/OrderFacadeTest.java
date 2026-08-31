package structural.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class OrderFacadeTest {

    @Test
    void shouldPlaceOrder() {

        OrderFacade facade =
                new OrderFacade();

        assertDoesNotThrow(
                () -> facade.placeOrder(
                        "PROD-1001",
                        2500,
                        "john@example.com"
                )
        );
    }
}
