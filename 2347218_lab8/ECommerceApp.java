import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Product {
    private String id;
    private String name;
    private double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product{id='" + id + "', name='" + name + "', price=" + price + '}';
    }
}

class ProductCatalog {
    private Map<String, Product> productMap;

    public ProductCatalog() {
        this.productMap = new HashMap<>();
    }

    public void addProduct(Product product) {
        productMap.put(product.getId(), product);
    }

    public Product getProduct(String productId) {
        return productMap.get(productId);
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(productMap.values());
    }
}

public class ECommerceApp {
    public static void main(String[] args) {

        Product laptop = new Product("1", "Laptop", 999.99);
        Product smartphone = new Product("2", "Smartphone", 499.99);

        ProductCatalog productCatalog = new ProductCatalog();

        productCatalog.addProduct(laptop);
        productCatalog.addProduct(smartphone);

        Product retrievedProduct = productCatalog.getProduct("1");
        System.out.println("Retrieved Product: " + retrievedProduct);

        List<Product> allProducts = productCatalog.getAllProducts();

        // Iterate through the list and print each product
        System.out.println("All Products:");
        for (Product product : allProducts) {
            System.out.println(product);
        }
    }
}
