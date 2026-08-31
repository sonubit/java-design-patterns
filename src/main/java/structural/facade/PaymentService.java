package structural.facade;

public class PaymentService {

    public void charge(double amount) {

        System.out.println(
                "Payment processed: $" + amount
        );
    }
}
