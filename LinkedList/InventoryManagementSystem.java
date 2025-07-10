public class InventoryManagementSystem {

    class ItemNode {
        String name;
        int id;
        int quantity;
        double price;
        ItemNode next;

        ItemNode(String name, int id, int quantity, double price) {
            this.name = name;
            this.id = id;
            this.quantity = quantity;
            this.price = price;
            this.next = null;
        }
    }

    ItemNode head = null;

    // Add at beginning
    void addAtBeginning(String name, int id, int quantity, double price) {
        ItemNode newNode = new ItemNode(name, id, quantity, price);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    void addAtEnd(String name, int id, int quantity, double price) {
        ItemNode newNode = new ItemNode(name, id, quantity, price);
        if (head == null) {
            head = newNode;
            return;
        }
        ItemNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    // Remove item by ID
    void removeById(int id) {
        if (head == null) return;

        if (head.id == id) {
            head = head.next;
            return;
        }

        ItemNode curr = head;
        while (curr.next != null && curr.next.id != id) {
            curr = curr.next;
        }

        if (curr.next != null) {
            curr.next = curr.next.next;
        }
    }

    // Update quantity by ID
    void updateQuantity(int id, int newQty) {
        ItemNode curr = head;
        while (curr != null) {
            if (curr.id == id) {
                curr.quantity = newQty;
                return;
            }
            curr = curr.next;
        }
        System.out.println("Item ID not found.");
    }

    // Search by ID
    void searchById(int id) {
        ItemNode curr = head;
        while (curr != null) {
            if (curr.id == id) {
                printItem(curr);
                return;
            }
            curr = curr.next;
        }
        System.out.println("Item ID not found.");
    }

    // Calculate total value
    void calculateTotalValue() {
        double total = 0;
        ItemNode curr = head;
        while (curr != null) {
            total += curr.quantity * curr.price;
            curr = curr.next;
        }
        System.out.printf("Total Inventory Value: ₹%.2f%n", total);
    }

    // Print all inventory items
    void printInventory() {
        ItemNode curr = head;
        while (curr != null) {
            printItem(curr);
            curr = curr.next;
        }
    }

    // Print item details
    void printItem(ItemNode item) {
        System.out.println("ID: " + item.id + ", Name: " + item.name +
                ", Qty: " + item.quantity + ", Price: ₹" + item.price);
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        ims.addAtEnd("Pen", 101, 50, 10.0);
        ims.addAtBeginning("Notebook", 102, 20, 50.0);
        ims.addAtEnd("Pencil", 103, 100, 5.0);

        System.out.println("All items:");
        ims.printInventory();

        System.out.println("\nUpdate quantity of ID 101 to 70");
        ims.updateQuantity(101, 70);
        ims.searchById(101);

        System.out.println("\nTotal inventory value:");
        ims.calculateTotalValue();

        System.out.println("\nRemoving item with ID 102:");
        ims.removeById(102);
        ims.printInventory();
    }
}
