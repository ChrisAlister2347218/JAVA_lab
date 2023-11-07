public class EcommerceProduct {
    private int productId;
    private String productName;
    private double price;
    private int quantity;

    // Default Constructor
    public EcommerceProduct() {
        // Default constructor with no parameters
    }

    // Constructor Overloading
    public EcommerceProduct(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method Overloading (version 1)
    public void setProductInfo(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method Overloading (version 2)
    public void setProductInfo(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // Method Overloading (version 3)
    public void setProductInfo(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    // Method to display product information
    public void displayProductInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
    }

    public static void main(String[] args) {
        // Example usage of the EcommerceProduct class

        // Using Constructor Overloading
        EcommerceProduct product1 = new EcommerceProduct(101, "Laptop", 799.99, 5);
        product1.displayProductInfo();

        // Using Method Overloading
        EcommerceProduct product2 = new EcommerceProduct();
        product2.setProductInfo(102, "Mobile Phone", 299.99);
        product2.displayProductInfo();

        // Using Method Overloading
        EcommerceProduct product3 = new EcommerceProduct();
        product3.setProductInfo("Tablet", 199.99);
        product3.displayProductInfo();
    }
}
