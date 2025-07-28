package BridgeLabz_SIPP_Training.Generics;

import java.util.*;

// Abstract class
abstract class WarehouseItem {
    String name;

    WarehouseItem(String name) {
        this.name = name;
    }

    abstract void show();
}

// Electronics subclass
class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name);
    }

    void show() {
        System.out.println("Electronics: " + name);
    }
}

// Groceries subclass
class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name);
    }

    void show() {
        System.out.println("Groceries: " + name);
    }
}

// Furniture subclass
class Furniture extends WarehouseItem {
    Furniture(String name) {
        super(name);
    }

    void show() {
        System.out.println("Furniture: " + name);
    }
}

// Generic Storage class
class Storage<T extends WarehouseItem> {
    ArrayList<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    ArrayList<T> getItems() {
        return items;
    }
}

public class EasyWarehouse {
    // Wildcard method to display any type of WarehouseItem
    static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.show();
        }
    }

    public static void main(String[] args) {
        Storage<Electronics> elecStore = new Storage<>();
        Storage<Groceries> grocStore = new Storage<>();
        Storage<Furniture> furnStore = new Storage<>();

        elecStore.addItem(new Electronics("TV"));
        elecStore.addItem(new Electronics("Mobile"));

        grocStore.addItem(new Groceries("Milk"));
        grocStore.addItem(new Groceries("Bread"));

        furnStore.addItem(new Furniture("Sofa"));
        furnStore.addItem(new Furniture("Table"));

        System.out.println("Electronics items:");
        displayItems(elecStore.getItems());

        System.out.println("\nGroceries items:");
        displayItems(grocStore.getItems());

        System.out.println("\nFurniture items:");
        displayItems(furnStore.getItems());
    }
}
