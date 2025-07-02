package xyx.Constructor_Questions;

public class Product {
    // Instance variables
    private String productName;
    private double price;

    // Class variable (shared by all instances)
    private static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  // Increment total count whenever a product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
    }

    // Class method to display total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000.0);
        Product p2 = new Product("Smartphone", 25000.0);

        System.out.println("Product 1 Details:");
        p1.displayProductDetails();

        System.out.println("Product 2 Details:");
        p2.displayProductDetails();

        System.out.println("Summary:");
        Product.displayTotalProducts();
    }
}

