package core_programing_control_flow;

import java.util.*;

public class check_no_arithmeticity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n= sc.nextInt();
        if(n<0){
            System.out.println("no is -ve");
        }
        else if(n==0){
            System.out.println("no is zero");

        }else{
            System.out.println("no is +ve");
        }
    }
    
}
