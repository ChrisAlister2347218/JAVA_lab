
public class OrderProcessor implements Runnable {
    private String orderId;

    public OrderProcessor(String orderId) {
        this.orderId = orderId;
    }

    public void run() {
        System.out.println("Processing order: " + orderId);
        // Simulate order processing time
        try {
            Thread.sleep(3000); // Simulate processing time of 3 seconds
        } catch (InterruptedException e) {
            System.out.println("Order processing interrupted for order: " + orderId);
            return;
        }
        System.out.println("Order processed successfully: " + orderId);
    }
}
