package core_programing_control_flow;

import java.util.Scanner;

public class mul_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input =sc.nextInt();
        int num=sc.nextInt();
        for(int i=1;i<=input;i++){
            int res =num*i;
            System.out.println(res);
        }
    }
    
}
