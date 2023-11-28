package ecommerce;

public class ClothingProduct implements Product {
    private String name;
    private double price;
    private String size;

    public ClothingProduct(String name, double price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Clothing Product: " + name + " (Size: " + size + ")";
    }
}
