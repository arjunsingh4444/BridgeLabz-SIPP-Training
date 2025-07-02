package core_programing_control_flow;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();
        int org_no=num;
        int sum=0;
        while (org_no!=0) {
            int digit = org_no%10;   //get last digit 
            sum+=digit*digit*digit;
            org_no=org_no/10;        //to remove last digit
        }
            if(sum==num){
                System.out.println("true");
            }else{
                System.out.println("false");
            }

            

    }
    
}
