package behavioral.strategy;

public class StrategyDemo {

    public static void main(String[] args) {

        PaymentService creditCard =
                new PaymentService(
                        new CreditCardPayment()
                );

        creditCard.processPayment(250);

        PaymentService paypal =
                new PaymentService(
                        new PayPalPayment()
                );

        paypal.processPayment(500);
    }
}
