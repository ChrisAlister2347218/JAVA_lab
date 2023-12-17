
public class InventoryManager implements Runnable {
    private String productId;

    public InventoryManager(String productId) {
        this.productId = productId;
    }


    public void run() {
        System.out.println("Managing inventory for product: " + productId);
        // Simulate inventory management time
        try {
            Thread.sleep(2000); // Simulate processing time of 2 seconds
        } catch (InterruptedException e) {
            System.out.println("Inventory management interrupted for product: " + productId);
            return;
        }
        System.out.println("Inventory managed successfully for product: " + productId);
    }
}
