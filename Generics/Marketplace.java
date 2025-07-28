package BridgeLabz_SIPP_Training.Generics;


enum BookCategory {
    FICTION, SCIENCE;
}

enum ClothingCategory {
    MEN, WOMEN;
}

class Product<T> {
    String name;
    double price;
    T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void showDetails() {
        System.out.println(name + " | " + category + " | Rs." + price);
    }
}

class DiscountUtil {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.price -= product.price * (percentage / 100.0);
        System.out.println("Discount applied to " + product.name + ". New price: Rs." + product.price);
    }
}

public class Marketplace {
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Basics", 500, BookCategory.SCIENCE);
        Product<ClothingCategory> cloth = new Product<>("T-Shirt", 300, ClothingCategory.MEN);

        book.showDetails();
        cloth.showDetails();

        // Apply discounts
        DiscountUtil.applyDiscount(book, 10);  // 10% off
        DiscountUtil.applyDiscount(cloth, 20); // 20% off

        // Show after discount
        System.out.println("After Discount:");
        book.showDetails();
        cloth.showDetails();
    }
}
