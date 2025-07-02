package xyx.Constructor_Questions.Class_And_Object_Questions;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalCost() {
        return price * quantity;
    }


    void displayItem() {
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : ₹" + price);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Total Cost: ₹" + getTotalCost());
    }
}


public class SimpleCart {
    public static void main(String[] args) {

        CartItem item = new CartItem("Book", 150.0, 2);
        System.out.println("Item added to cart.\n");

        item.displayItem();

        item = null;
        System.out.println("\nItem removed from cart.");
    }
}
