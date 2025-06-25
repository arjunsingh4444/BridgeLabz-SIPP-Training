package Methods_questions;

import java.util.Scanner;

public class LineAndDistance {

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1); // slope
        double b = y1 - m * x1;           // y-intercept
        return new double[] { m, b };     // return as array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input points
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("\nEuclidean Distance = " + distance);

        if (x1 == x2) {
            System.out.println("The line is vertical. Equation: x = " + x1);
        } else {
            double[] line = findLineEquation(x1, y1, x2, y2);
            System.out.println("Equation of the Line: y = " + line[0] + "x + " + line[1]);
        }

    }
}
