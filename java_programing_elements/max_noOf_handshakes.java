package java_programing_elements;

import java.util.Scanner;

public class max_noOf_handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stu = sc.nextInt();
        int maxh=(stu * (stu - 1)) / 2 ;
        System.out.println(maxh);

    }
    
}
