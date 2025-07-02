package core_programing_control_flow;

import java.util.Scanner;

public class gretest_factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int gre_fac= 1;
        for(int i=num-1;i>=1;i--){
            if(num%i==0){


                gre_fac=i;
                
                System.out.println(gre_fac);
                break;
            }

        }
    }
    
}
