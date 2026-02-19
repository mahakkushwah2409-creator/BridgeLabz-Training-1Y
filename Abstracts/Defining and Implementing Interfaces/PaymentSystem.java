// Payment Interface
interface Payment {
    void pay(double amount);
}
// UPI Payment
class UPI implements Payment {

    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

// Credit Card Payment
class CreditCard implements Payment {

    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

// Wallet Payment
class Wallet implements Payment {

    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Wallet.");
    }
}
public class PaymentSystem {

    public static void main(String[] args) {

        Payment payment1 = new UPI();
        Payment payment2 = new CreditCard();
        Payment payment3 = new Wallet();

        payment1.pay(500);
        payment2.pay(1200);
        payment3.pay(300);
    }
}
