package structural.adapter;

public class AdapterDemo {

    public static void main(String[] args) {

        LegacyPaymentGateway legacyGateway =
                new LegacyPaymentGateway();

        PaymentProcessor processor =
                new PaymentAdapter(legacyGateway);

        processor.processPayment(1000);
    }
}
