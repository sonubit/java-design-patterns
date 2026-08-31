package structural.facade;

public class OrderFacade {

    private final InventoryService inventoryService;
    private final PaymentService paymentService;
    private final NotificationService notificationService;

    public OrderFacade() {

        this.inventoryService =
                new InventoryService();

        this.paymentService =
                new PaymentService();

        this.notificationService =
                new NotificationService();
    }

    public void placeOrder(
            String productId,
            double amount,
            String email) {

        inventoryService.reserve(productId);

        paymentService.charge(amount);

        notificationService.sendConfirmation(email);
    }
}
