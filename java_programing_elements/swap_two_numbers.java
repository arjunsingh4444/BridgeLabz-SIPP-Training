package java_programing_elements;

import java.util.Scanner;

public class swap_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no1=sc.nextInt();
        int no2=sc.nextInt();

        System.out.println("ori  no are " + no1 + "and " + no2);



        int temp=0;

        temp=no1;
        no1=no2;
        no2=temp;




        System.out.println("the swaped no are " + no1 + " and " + no2 );

    }
    
}
