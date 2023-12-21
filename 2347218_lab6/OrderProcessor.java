
import java.util.List;

public class OrderProcessor<T> implements Order<T> {
    private List<Product<T>> items;

    public OrderProcessor(List<Product<T>> items) {
        this.items = items;
    }

    @Override
    public void addItem(Product<T> product) {
        items.add(product);
    }

    @Override
    public double calculateTotal() {
        double total = 0.0;
        for (Product<T> item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void processOrder() {
        System.out.println("Processing order with total: Rs" + calculateTotal());
       
    }
}
