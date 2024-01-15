import java.sql.*;
import java.util.Scanner;

public class ECommerceManagementMenu {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/ecommerce_db?serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            createTables(conn);

            Scanner scanner = new Scanner(System.in);

            while (true) {
                displayMenu();
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        insertCustomer(conn, scanner);
                        break;
                    case 2:
                        insertProduct(conn, scanner);
                        break;
                    case 3:
                        displayCustomers(conn);
                        break;
                    case 4:
                        displayProducts(conn);
                        break;
                    case 5:
                        updateCustomerEmail(conn, scanner);
                        break;
                    case 6:
                        deleteProduct(conn, scanner);
                        break;
                    case 7:
                        System.out.println("Exiting the program.");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTables(Connection conn) throws SQLException {
        Statement stmt = conn.createStatement();

        // Create customers table
        String createCustomersTable = "CREATE TABLE IF NOT EXISTS customers (" +
                "customer_id INT PRIMARY KEY, " +
                "name VARCHAR(255), " +
                "email VARCHAR(255), " +
                "address VARCHAR(255))";
        stmt.executeUpdate(createCustomersTable);

        // Create products table
        String createProductsTable = "CREATE TABLE IF NOT EXISTS products (" +
                "product_id INT PRIMARY KEY, " +
                "product_name VARCHAR(255), " +
                "price DECIMAL(10, 2))";
        stmt.executeUpdate(createProductsTable);
    }

    private static void displayMenu() {
        System.out.println("\nE-commerce Management System Menu:");
        System.out.println("1. Add Customer");
        System.out.println("2. Add Product");
        System.out.println("3. Display Customers");
        System.out.println("4. Display Products");
        System.out.println("5. Update Customer Email");
        System.out.println("6. Delete Product");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void insertCustomer(Connection conn, Scanner scanner) {
        try {
            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO customers VALUES (?, ?, ?, ?)");

            System.out.print("Enter Customer ID: ");
            int customerId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter Customer Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Customer Email: ");
            String email = scanner.nextLine();

            System.out.print("Enter Customer Address: ");
            String address = scanner.nextLine();

            preparedStatement.setInt(1, customerId);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, address);

            preparedStatement.executeUpdate();

            System.out.println("Customer added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insertProduct(Connection conn, Scanner scanner) {
        try {
            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO products VALUES (?, ?, ?)");

            System.out.print("Enter Product ID: ");
            int productId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter Product Name: ");
            String productName = scanner.nextLine();

            System.out.print("Enter Product Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            preparedStatement.setInt(1, productId);
            preparedStatement.setString(2, productName);
            preparedStatement.setDouble(3, price);

            preparedStatement.executeUpdate();

            System.out.println("Product added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void displayCustomers(Connection conn) {
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM customers");

            System.out.println("\nCustomers Table:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("customer_id") +
                        ", Name: " + rs.getString("name") +
                        ", Email: " + rs.getString("email") +
                        ", Address: " + rs.getString("address"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void displayProducts(Connection conn) {
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM products");

            System.out.println("\nProducts Table:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("product_id") +
                        ", Name: " + rs.getString("product_name") +
                        ", Price: $" + rs.getDouble("price"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void updateCustomerEmail(Connection conn, Scanner scanner) {
        try {
            PreparedStatement preparedStatement = conn.prepareStatement("UPDATE customers SET email = ? WHERE customer_id = ?");

            System.out.print("Enter Customer ID to update email: ");
            int customerId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter new email: ");
            String newEmail = scanner.nextLine();

            preparedStatement.setString(1, newEmail);
            preparedStatement.setInt(2, customerId);

            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("Email updated successfully.");
            } else {
                System.out.println("Customer ID not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void deleteProduct(Connection conn, Scanner scanner) {
        try {
            PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM products WHERE product_id = ?");

            System.out.print("Enter Product ID to delete: ");
            int productId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            preparedStatement.setInt(1, productId);

            int affectedRows = preparedStatement.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("Product deleted successfully.");
            } else {
                System.out.println("Product ID not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
