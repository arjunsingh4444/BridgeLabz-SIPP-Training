package arrays_questions;

import java.util.Arrays;
import java.util.Scanner;

public class storeDigit_findlargestAndSeclargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a  no ");
        int num=sc.nextInt();


        int temp=num;
        int count =0;


       //count digit 
        while(temp>0){
            count++;
            temp/=10;
        }

        int arr[]= new int[count];
        temp=num;

        for(int i=0;i<=count-1;i++){
            arr[i]=temp%10;
            temp/=10;
        }
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int largest=arr[count-1];
        int sec_largest=arr[count-2];

        System.out.println("largest " + largest);
        System.out.println("sec_largest " + sec_largest);




   
    }
    
}
