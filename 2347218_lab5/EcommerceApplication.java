
public class EcommerceApplication {
    public static void main(String[] args) {
        // Simulate an order being placed
        Thread orderThread = new Thread(new OrderProcessor("1234"));
        orderThread.start();

        // Simulate managing inventory for a product
        Thread inventoryThread = new Thread(new InventoryManager("ABC123"));
        inventoryThread.start();

        // Simulate processing a payment
        Thread paymentThread = new Thread(new PaymentProcessor("PAY456"));
        paymentThread.start();
    }
}
