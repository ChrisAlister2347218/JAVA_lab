public class ECommerceDemo {
    public static void main(String[] args) {
        // Creating instances of products
        Product electronicsProduct = new ElectronicsProduct("Smartphone", 499.99);
        Product clothingProduct = new ClothingProduct("T-Shirt", 19.99, "Medium");

        // Displaying information about the products
        displayProductInformation(electronicsProduct);
        displayProductInformation(clothingProduct);
    }

    // Method to display information about a Product
    private static void displayProductInformation(Product product) {
        System.out.println("Description: " + product.getDescription());
        System.out.println("Price: $" + product.getPrice());
        System.out.println();
    }
}
