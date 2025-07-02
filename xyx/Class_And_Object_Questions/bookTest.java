package xyx.Class_And_Object_Questions;

import java.util.Scanner;

class book{
    private String title;
    private String author;
    private int price;
    public book(String title ,String author ,int price){
        this.title=title;
        this.author=author;
        this.price=price;

    } 
    public void Display(){
        System.out.println( "title " + title);
        System.out.println("author " + author);
        System.out.println(" price " + price );
    }
}
public class bookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title=sc.next();  //title 
        String author=sc.next();
        int price = sc.nextInt();
        book bk=new book(title,author,price);
        bk.Display();
        
    }
    
}

