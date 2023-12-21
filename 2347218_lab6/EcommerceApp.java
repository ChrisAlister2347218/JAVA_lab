import java.util.ArrayList;
import java.util.List;

public class EcommerceApp {
    public static void main(String[] args) {
        List<Product<String>> stringProducts = new ArrayList<>();
        Product<String> laptop = new Product<>("Laptop", 1200.0);
        stringProducts.add(laptop);

        OrderProcessor<String> stringOrderProcessor = new OrderProcessor<>(stringProducts);
        stringOrderProcessor.processOrder();

        List<Product<Integer>> intProducts = new ArrayList<>();
        Product<Integer> phone = new Product<>(123456, 800.0);
        intProducts.add(phone);

        OrderProcessor<Integer> intOrderProcessor = new OrderProcessor<>(intProducts);
        intOrderProcessor.processOrder();
    }
}
