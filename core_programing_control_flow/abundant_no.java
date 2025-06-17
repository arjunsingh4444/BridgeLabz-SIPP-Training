package core_programing_control_flow;

import java.util.Scanner;

public class abundant_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;

            }
        }
        
        if(sum>num)
        System.out.println(" is abundant ");
        else{
            System.out.println("not abundant");
        }
    }
    
}
