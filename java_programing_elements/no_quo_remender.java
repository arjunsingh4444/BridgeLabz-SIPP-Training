package java_programing_elements;

import java.util.Scanner;

public class no_quo_remender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int quo=a/b;
        int rem=a%b;
        System.out.println("The Quotient is "+ quo+" and Reminder is" + rem + "of two number"+ a+" and" +b);

        
    }
    
}
