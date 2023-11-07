public class Productconsmeth {
    private int productId;
    private String productName;
    private double price;
    private int quantityInStock;

    // Default Constructor
    public Productconsmeth() {
        // Default constructor with no parameters
    }

    // Constructor Overloading on 1st constructor
    public Productconsmeth(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantityInStock = 1; 
    }

    // Constructor Overloading on 2nd constructor
    public Productconsmeth(int productId, String productName, double price, int quantityInStock) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    // Method Overloading on 1st method
    public void setProductInfo(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantityInStock = 2; 
    }

    // Method Overloading on 2nd method
    public void setProductInfo(int productId, String productName, double price, int quantityInStock) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    // Method Overloading on 3rd method
    public void setProductInfo(String productName, double price) {
        this.productId = 103; 
        this.productName = productName;
        this.price = price;
        this.quantityInStock = 3; 
    }

    // Method to display product information
    public void displayProductInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity in Stock: " + quantityInStock);
    }
}
