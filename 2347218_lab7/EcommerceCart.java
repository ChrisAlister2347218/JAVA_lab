import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface CartFunction {
    double calculateTotal(List<Double> prices);
}

public class EcommerceCart {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collecting user input for items and prices
        List<String> items = new ArrayList<>();
        List<Double> prices = new ArrayList<>();

        System.out.println("Enter items and prices for your cart (type 'done' to finish):");
        while (true) {
            System.out.print("Item: ");
            String item = scanner.nextLine();
            if (item.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
            items.add(item);
            prices.add(price);
        }

        // Using lambda expression to calculate total
        CartFunction calculateTotal = (List<Double> cartPrices) -> cartPrices.stream().mapToDouble(Double::doubleValue).sum();

        double total = calculateTotal.calculateTotal(prices);

        // Displaying the cart summary
        System.out.println("\nCart Summary:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i) + ": Rs." + prices.get(i));
        }
        System.out.println("\nTotal Price: Rs." + total);

        scanner.close();
    }
}