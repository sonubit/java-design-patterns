package structural.adapter;

public class LegacyPaymentGateway {

    public void makePayment(double amount) {

        System.out.println(
                "Legacy gateway processed: $" + amount
        );
    }
}
