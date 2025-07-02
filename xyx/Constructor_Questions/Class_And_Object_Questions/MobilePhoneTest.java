package xyx.Constructor_Questions.Class_And_Object_Questions;

class MobilePhone {
    // Attributes
    String brand;
    String model;
    double price;

    // Constructor
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : ₹" + price);
    }
}

public class MobilePhoneTest {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy M14", 13999.0);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 13", 59999.0);

        phone1.displayDetails();
        System.out.println();         // For spacing
        phone2.displayDetails();
    }
}
