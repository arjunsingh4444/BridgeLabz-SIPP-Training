package Methods_questions;

import java.util.Scanner;

public class Trigonometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angle = sc.nextDouble();
        double[] result = calculateTrigonometricFunctions(angle);
        System.out.println("Sin: " + result[0]);
        System.out.println("Cos: " + result[1]);
        System.out.println("Tan: " + result[2]);
        sc.close();
    }

    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        return new double[]{sin, cos, tan};   //return in arrays 
    }
}
