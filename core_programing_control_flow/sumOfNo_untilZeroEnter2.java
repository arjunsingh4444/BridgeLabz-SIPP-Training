package core_programing_control_flow;

import java.util.*;

public class sumOfNo_untilZeroEnter2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;      
        // double number;            

        System.out.print("Enter a number (0 to stop): ");
        double number = sc.nextDouble();

        
        while (number != 0 && number>0) {
            total += number; 
            
            System.out.print("Enter a number (0 to stop): ");
            number = sc.nextDouble();
        }

      
        System.out.println("The total sum is: " + total);


    }
    
}
