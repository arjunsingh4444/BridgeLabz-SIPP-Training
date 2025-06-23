package arrays_questions;

import java.util.Scanner;

public class Mean_height {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double height[] = new double[11];
        double sum=0.0;


        for(int i=0;i<height.length;i++){
            System.out.println("enter height" + (i+1));
            height[i]=sc.nextDouble();
            sum+=height[i];
        }
        double mean =sum/11;
        System.out.println("mean is "+mean);






    }
    
}
