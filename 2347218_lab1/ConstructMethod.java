public class ConstructMethod {
    public static void main(String[] args) {

        // Using constructor overloading on 1st constructor
        Productconsmeth product1 = new Productconsmeth(101, "Laptop", 799.99);
        product1.displayProductInfo();

        // Using constructor overloading on 2nd constructor
        Productconsmeth product2 = new Productconsmeth(102, "Mobile Phone", 299.99, 5);
        product2.displayProductInfo();

        // Using method overloading 1st method
        Productconsmeth product3 = new Productconsmeth();
        product3.setProductInfo(103, "Tablet", 199.99);
        product3.displayProductInfo();

        // Using method overloading on 2nd method
        Productconsmeth product4 = new Productconsmeth();
        product4.setProductInfo(104, "Smartwatch", 149.99, 10);
        product4.displayProductInfo();

        // Using method overloading on 3rd method
        Productconsmeth product5 = new Productconsmeth();
        product5.setProductInfo("Keyboard", 49.99);
        product5.displayProductInfo();
    }
}
