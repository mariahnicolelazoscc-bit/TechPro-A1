public class PaymentProcessor {

    public void processPayment(double amount, String currency) {
        System.out.println("Processing payment of " + amount + " " + currency);
    }

    public void processPayment(double amount, String currency, String paymentMethod) {
        System.out.println("Processing payment of " + amount + " " + currency + " via " + paymentMethod);
    }

    public static void main(String[] args) {
        PaymentProcessor p = new PaymentProcessor();
        p.processPayment(100, "USD");
        p.processPayment(250, "PHP", "GCash");
    }
}
