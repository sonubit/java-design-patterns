package structural.facade;

public class FacadeDemo {

    public static void main(String[] args) {

        OrderFacade orderFacade =
                new OrderFacade();

        orderFacade.placeOrder(
                "PROD-1001",
                2500,
                "john@example.com"
        );
    }
}
