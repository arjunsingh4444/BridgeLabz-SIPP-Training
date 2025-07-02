package core_programing_control_flow;

import java.util.Scanner;

public class bonus_Ofemp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double  salary=sc.nextInt();
        int years=sc.nextInt();
        double  bonous =(salary*5)/100;

        if(years>= 5){
            salary = salary+bonous;
            System.out.println("after bonous salary is " + salary);
        }else{
            System.out.println("without bonous salary is " + salary);
        }
    }
    
}
