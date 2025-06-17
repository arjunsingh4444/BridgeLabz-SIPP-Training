package core_programing_control_flow;

import java.util.Scanner;

public class spring_season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day= sc.nextInt();
        // if((month >= 3 && month <= 6) && (day >= 20 && day <= 20)){
        //     System.out.println("true" );
        // }else{
        //     System.out.println("false");
        // }

        boolean isSpring = 
           (month == 3 && day >= 20 && day <= 31) ||
           (month == 4 && day >= 1 && day <= 30) ||
           (month == 5 && day >= 1 && day <= 31) ||
           (month == 6 && day >= 1 && day <= 20);

       if (isSpring) {
           System.out.println("It's a Spring Season");
       } else {
           System.out.println("Not a Spring Season");
       }



        
    }
    
}
