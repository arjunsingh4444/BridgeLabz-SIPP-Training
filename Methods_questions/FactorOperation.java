package Methods_questions;

import java.util.Scanner;

public class FactorOperation {

    public static int[] findFactors(int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                count++;
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                factors[index++] = i;
        }

        return factors;
    }

    public static int greatestFactor(int[] factors) {
        int max = factors[0];
        for (int val : factors) {
            if (val > max)
                max = val;
        }
        return max;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int val : factors)
            sum += val;
        return sum;
    }

    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int val : factors)
            product *= val;
        return product;
    }

    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int val : factors) {
            product *= Math.pow(val, 3);
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Get factors
        int[] factors = findFactors(number);

        // Display factors
        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        // Perform operations
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));
    }
}
