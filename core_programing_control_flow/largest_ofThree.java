package core_programing_control_flow;

import java.util.Scanner;

public class largest_ofThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c=sc.nextInt();


        if(a>b && a>c){
            System.out.println("a is gretest");
        }else{
            if(b>a && b>c){

                System.out.println("b is gretest");

            }else{
                System.out.println("c is gretest");
            }
        }
    }
    
}
