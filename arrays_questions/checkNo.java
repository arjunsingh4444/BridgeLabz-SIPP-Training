package arrays_questions;

import java.util.Scanner;

public class checkNo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[5];
        // int idx=0;

        System.out.println("take five no");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
            // arr[idx]=num;
            // idx++;
           
            
            
        }  
        for(int i=0;i<5;i++){
            int num=arr[i];


            if(num>0){
                System.out.print(num + " is +ve");
                if(num%2==0){
                    System.out.println( " and is even");
                }else{
                    System.out.println(" num is odd ");
                }
                
            }
            else if(num<0){
                System.out.println(num +" no is -ve");
            }else{
                System.out.println(num +" no is zero");
            }
        } 
        if(arr[0]>arr[4]){
            System.out.println("first is larger");
        }else if(arr[0]<arr[4]){
            System.out.println("first is smaller");
        }else{
            System.out.println("both r equals ");
        }
    }
    
}





