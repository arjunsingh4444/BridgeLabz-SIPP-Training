package core_programing_control_flow;

import java.util.Scanner;

public class cnt_noOf_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  num =sc.nextInt();
        int count =0;
        while(num!=0){
        // for(int i=0;i<num-1;i++){

            num=num/10;
            count++;
        



        }
        System.out.println(count);
    }
    
}
