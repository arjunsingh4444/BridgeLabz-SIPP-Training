package Methods_questions;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkNumber(num);
        // System.out.println(result);
        
    }

    public static void  checkNumber(int num) {
        if (num > 0){

            System.out.println("no is +ve");
            return;

        } 
        else if (num < 0){

            
        }
        else{

            System.out.println("no is zero");
            return ;
        }
    }
}

