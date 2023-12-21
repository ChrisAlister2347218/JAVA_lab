
public interface Order<T> {
    void addItem(Product<T> product);
    double calculateTotal();
}
