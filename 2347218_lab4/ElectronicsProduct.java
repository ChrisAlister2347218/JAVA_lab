public class ElectronicsProduct implements Product {
    private String name;
    private double price;

    public ElectronicsProduct(String name, double price) {
        this.name = name;
        this.price = price;
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
        return "Electronics Product: " + name;
    }
}
