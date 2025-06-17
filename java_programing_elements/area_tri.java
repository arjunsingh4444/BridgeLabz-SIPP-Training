package java_programing_elements;

import java.util.Scanner;

public class area_tri {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int base = sc.nextInt();
        int height = sc.nextInt();


        double areaCm = 0.5 * base * height;

        // Convert to square inches

        double areaInch = areaCm * 0.1550;

        System.out.println("areas area "  + areaCm + " and   " + areaInch);


    }
    
}
