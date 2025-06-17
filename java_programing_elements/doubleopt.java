package java_programing_elements;

import java.util.Scanner;

public class doubleopt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  a = sc.nextInt();
        double  b =sc.nextInt();
        double c= sc.nextInt();

        double opr1= a + b *c;
        double opr2=a * b + c;
        double opr3=c + a / b;
        double opr4=a % b + c;

        System.out.println("The results of Int Operations are " + opr1   +  "  "  +  opr2  +  "  "  +   opr3  + " and "   + opr4  );





    }
    
}
