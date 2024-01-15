import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ECommerceApp extends JFrame {

    private DefaultListModel<String> productList;
    private JList<String> productListUI;
    private DefaultListModel<String> cartModel;
    private JList<String> cartUI;

    public ECommerceApp() {
        // Initialize the frame
        setTitle("E-commerce Application");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Initialize product list
        productList = new DefaultListModel<>();
        productList.addElement("Product 1 - $10");
        productList.addElement("Product 2 - $20");
        productList.addElement("Product 3 - $15");

        productListUI = new JList<>(productList);

        // Initialize shopping cart
        cartModel = new DefaultListModel<>();
        cartUI = new JList<>(cartModel);

        // Create buttons
        JButton addToCartButton = new JButton("Add to Cart");
        JButton checkoutButton = new JButton("Checkout");

        // Set layout manager
        setLayout(new BorderLayout());

        // Add components to the frame
        add(new JScrollPane(productListUI), BorderLayout.WEST);
        add(new JScrollPane(cartUI), BorderLayout.EAST);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(addToCartButton);
        buttonPanel.add(checkoutButton);

        add(buttonPanel, BorderLayout.SOUTH);

        // Add action listeners
        addToCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addToCart();
            }
        });

        checkoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkout();
            }
        });
    }

    private void addToCart() {
        int selectedIndex = productListUI.getSelectedIndex();
        if (selectedIndex != -1) {
            String selectedProduct = productList.getElementAt(selectedIndex);
            cartModel.addElement(selectedProduct);
            JOptionPane.showMessageDialog(this, "Product added to cart!");
        } else {
            JOptionPane.showMessageDialog(this, "Please select a product to add to the cart.");
        }
    }

    private void checkout() {
        if (cartModel.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Your cart is empty. Please add some products before checking out.");
        } else {
            double total = calculateTotal();
            JOptionPane.showMessageDialog(this, "Thank you for shopping with us! Your total is: $" + total);
            // Perform any additional checkout logic here
        }
    }

    private double calculateTotal() {
        double total = 0;
        for (int i = 0; i < cartModel.size(); i++) {
            String product = cartModel.getElementAt(i);
            // Extract price from the product string (assuming the price is at the end of the string)
            String[] parts = product.split(" ");
            double price = Double.parseDouble(parts[parts.length - 1].substring(1));
            total += price;
        }
        return total;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ECommerceApp().setVisible(true);
            }
        });
    }
}
