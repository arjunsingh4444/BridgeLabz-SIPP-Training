package java_programing_elements;
import java.util.*;

public class add{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println(sum(a,b));



    }
    public static int sum(int a,int b) {
//        Scanner sc1 = new Scanner(System.in);


        int sum1=a+b;
        return sum1;
    }
}

