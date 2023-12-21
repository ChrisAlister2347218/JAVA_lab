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

    interface Order<T> {
        void addItem(Product<T> product);
        double calculateTotal();
    }

    static class OrderProcessor<T> implements Order<T> {
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

    static class Product<T> {
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
}
