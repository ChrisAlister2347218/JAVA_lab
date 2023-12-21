
public class Product<T> {
    private T item;
    private double price;

    public Product(T item, double price) {
        this.item = item;
        this.price = price;
    }

    public T getItem() {
        return item;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product [item=" + item + ", price=" + price + "]";
    }
}
