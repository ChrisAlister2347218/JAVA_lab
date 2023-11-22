abstract class Product {
  final int id;
  String name;
  double price;

  public Product(int id, String name, double price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  public abstract void display();

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }
}

class Clothing extends Product {
  String size;
  String color;
  String material;

  public Clothing(int id, String name, double price, String size, String color, String material) {
    super(id, name, price);
    this.size = size;
    this.color = color;
    this.material = material;
  }

  public void display() {
    System.out.println("Clothing ID: " + id);
    System.out.println("Clothing Name: " + name);
    System.out.println("Clothing Price: " + price);
    System.out.println("Clothing Size: " + size);
    System.out.println("Clothing Color: " + color);
    System.out.println("Clothing Material: " + material);
  }

  public String getSize() {
    return size;
  }

  public String getColor() {
    return color;
  }

  public String getMaterial() {
    return material;
  }
}

class Electronic extends Product {
  String brand;
  int warranty;

  public Electronic(int id, String name, double price, String brand, int warranty) {
    super(id, name, price);
    this.brand = brand;
    this.warranty = warranty;
  }

  public void display() {
    System.out.println("Electronic ID: " + id);
    System.out.println("Electronic Name: " + name);
    System.out.println("Electronic Price: " + price);
    System.out.println("Electronic Brand: " + brand);
    System.out.println("Electronic Warranty: " + warranty + " months");
  }

  public String getBrand() {
    return brand;
  }

  public int getWarranty() {
    return warranty;
  }

}

public class Ecommerce {
  public static void main(String[] args) {
    Clothing c1 = new Clothing(101, "T-shirt", 499.99, "XXL", "Blue", "Cotton");
    c1.display();
    Electronic e1 = new Electronic(201, "Smartphone", 19999.99, "Samsung", 24);
    e1.display();
  }
}
