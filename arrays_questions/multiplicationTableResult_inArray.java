package arrays_questions;

import java.util.*;

public class MultiplicationTableResult_inArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no");
        int num=sc.nextInt();
        int arr[] =new int[10];


        for(int i=0;i<10;i++){
            arr[i] =num*(i+1);
            
            System.out.println(arr[i]);
            
        }
        System.out.println(Arrays.toString(arr));



        

    }
    
}
