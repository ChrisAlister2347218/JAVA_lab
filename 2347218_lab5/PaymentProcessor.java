
public class PaymentProcessor implements Runnable {
    private String paymentId;

    public PaymentProcessor(String paymentId) {
        this.paymentId = paymentId;
    }

    public void run() {
        System.out.println("Processing payment: " + paymentId);
        // Simulate payment processing time
        try {
            Thread.sleep(1500); // Simulate processing time of 1.5 seconds
        } catch (InterruptedException e) {
            System.out.println("Payment processing interrupted for payment: " + paymentId);
            return;
        }
        System.out.println("Payment processed successfully: " + paymentId);
    }
}
