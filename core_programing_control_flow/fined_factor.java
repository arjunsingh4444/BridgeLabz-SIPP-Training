package core_programing_control_flow;

import java.util.Scanner;

public class fined_factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no");
        int n=sc.nextInt();
    
        int counter=1;
        while (counter <= n) {

            if (n % counter == 0) {
                System.out.println(counter);
            }
            counter++;
        }

    }
    
}




