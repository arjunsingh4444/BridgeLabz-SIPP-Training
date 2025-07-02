package xyx.Constructor_Questions.Class_And_Object_Questions;

class Item {
                   // Attributes
    int itemCode;
    String itemName;
    double price;

                   // Constructor
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : ₹" + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class InventoryTest {
    public static void main(String[] args) {
        Item item1 = new Item(101, "Notebook", 45.50);

        item1.displayDetails();

        int quantity = 5;
        double totalCost = item1.calculateTotalCost(quantity);
        System.out.println("Quantity   : " + quantity);
        System.out.println("Total Cost : ₹" + totalCost);
    }
}
