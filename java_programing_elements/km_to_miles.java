package java_programing_elements;

import java.util.Scanner;

public class km_to_miles {
    public static void main(String[] args){
        // int km=2;
        Scanner sc = new Scanner(System.in);
        int km=sc.nextInt();
        double miles=km*1.6;
        System.out.println("the distance  "+ km +" 2km in miles is "+miles+ " miles");
    }
    
}
