package xyx.Constructor_Questions;
// package Constructor_Questions;

// class Book {
//     public String ISBN;        // Public variable
//     protected String title;    // Protected variable
//     private String author;     // Private variable

//     public Book(String ISBN, String title, String author) {
//         this.ISBN = ISBN;
//         this.title = title;
//         this.author = author;
//     }

//     public void setAuthor(String author) {
//         this.author = author;
//     }

//     public String getAuthor() {
//         return author;
//     }
// }

// class EBook extends Book {
//     private double fileSizeMB;

//     public EBook(String ISBN, String title, String author, double fileSizeMB) {
//         super(ISBN, title, author);
//         this.fileSizeMB = fileSizeMB;
//     }

//     public void displayEBookDetails() {
//         System.out.println("EBook ISBN: " + ISBN);   // Accessing public variable
//         System.out.println("EBook Title: " + title); // Accessing protected variable
//         // Cannot access 'author' directly as it is private
//         System.out.println("File Size: " + fileSizeMB + " MB");
//     }
// }

// public class solu {
//     public static void main(String[] args) {
//         Book b = new Book("123-456", "Java Programming", "Arjun Singh");
//         System.out.println("Book Author: " + b.getAuthor()); // Accessing private via getter

//         EBook eb = new EBook("789-101", "Advanced Java", "Neha Sharma", 5.5);
//         System.out.println("\nEBook Details:");
//         eb.displayEBookDetails();
//     }
// }
