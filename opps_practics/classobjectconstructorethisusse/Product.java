package opps_practics.classobjectconstructorethisusse;

public class Product {

    String name;
    double price;

    // Constructor
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Method to display product details
    void display() {
        System.out.println("Product Name: " + name + ", Price: " + price);
    }

    public static void main(String[] args) {

        // Array of objects
        Product[] products = new Product[5];

        // Creating 5 objects
        products[0] = new Product("Laptop", 50000);
        products[1] = new Product("Mobile", 20000);
        products[2] = new Product("Tablet", 15000);
        products[3] = new Product("Headphones", 3000);
        products[4] = new Product("Smartwatch", 7000);

        // Printing all product details
        for (int i = 0; i < products.length; i++) {
            products[i].display();
        }
    }
}