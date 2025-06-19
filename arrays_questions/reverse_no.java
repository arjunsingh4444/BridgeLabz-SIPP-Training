package arrays_questions;

import java.util.Arrays;
import java.util.Scanner;

public class reverse_no {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a no");
        int num=sc.nextInt();
        int temp=num;


        int count =0;
        while(temp>0){
            count++;
            temp/=10;
        }
        temp=num;
        int rev =0;
    
        int arr[] = new int[count];
        for(int i=0;i<count;i++){
            arr[i]=temp%10;
            rev = rev * 10 + arr[i];
            temp/=10;
            System.out.println(arr[i]);
            
        }

        System.out.println(Arrays.toString(arr));
       




    }
    
}
