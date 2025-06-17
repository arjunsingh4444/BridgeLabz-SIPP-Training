package java_programing_elements;
import java.util.*;

public class uni_fee2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        int fee=sc.nextInt();
        int dis=(fee*10)/100;
        int dis_amt=fee-dis;
        int dis_price=dis;
        System.out.println("The discount price  is INR "+dis_price+" and final discounted fee is INR"+dis_amt);
        
    }
    
}