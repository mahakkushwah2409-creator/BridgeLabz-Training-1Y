// PaymentProcessor Interface
interface PaymentProcessor {

    void processPayment(double amount);

    // New feature added later
    default void refund(double amount) {
        System.out.println("Refund feature not supported by this provider.");
    }
}
class UPIProcessor implements PaymentProcessor {

    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount);
    }
}

class CreditCardProcessor implements PaymentProcessor {

    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of ₹" + amount);
    }

    // Override refund if supported
    public void refund(double amount) {
        System.out.println("Refunding ₹" + amount + " to Credit Card.");
    }
}
public class PaymentGatewayApp {

    public static void main(String[] args) {

        PaymentProcessor upi = new UPIProcessor();
        PaymentProcessor card = new CreditCardProcessor();

        upi.processPayment(1000);
        upi.refund(500);   // Uses default method

        card.processPayment(2000);
        card.refund(1000); // Uses overridden method
    }
}
