package core_programing_control_flow;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int num=sc.nextInt();
        int pow =sc.nextInt();
        int res =1;
        for(int i=1;i<=pow;i++){
            res=res*num;
            // System.out.println("power is"  );
           

        }
        System.out.println("pow is " + res);

    }
    
}
