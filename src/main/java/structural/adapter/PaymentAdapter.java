package structural.adapter;

public class PaymentAdapter
        implements PaymentProcessor {

    private final LegacyPaymentGateway gateway;

    public PaymentAdapter(
            LegacyPaymentGateway gateway) {

        this.gateway = gateway;
    }

    @Override
    public void processPayment(double amount) {

        gateway.makePayment(amount);
    }
}
