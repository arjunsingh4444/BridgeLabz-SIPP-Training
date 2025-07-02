package arrays_questions;

import java.util.*;


public class FIZZBUZZ_inArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no");
        int num=sc.nextInt();
        String strarr[]=new String[num+1];


         for (int i = 0; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                strarr[i] = "FizzBuzz";
            } else if (i % 3 == 0 && i != 0) {
                strarr[i] = "Fizz";
            } else if (i % 5 == 0 && i != 0) {
                strarr[i] = "Buzz";
            } else {
                strarr[i] = Integer.toString(i);
            }
        }
        System.out.println("\nFizzBuzz Results:");
        for (int i = 0; i <= num; i++) {
            System.out.println("Position " + i + " = " + strarr[i]);
        }
        // System.out.println(Arrays.toString(strarr));





    }
    
}


