package java_programing_elements;

import java.util.Scanner;

public class cal_profit_loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // double profit=0;
        double cp=sc.nextDouble();
        double sp=sc.nextDouble();
       
        double profit = sp - cp;

        double Profit_Percentage = (profit / cp) * 100;
        System.out.println("The Cost Price is INR " +cp +"and Selling Price is INR "+sp +"The Profit is INR "+profit + "and the Profit Percentage is "+ Profit_Percentage); 

    }
    
}
