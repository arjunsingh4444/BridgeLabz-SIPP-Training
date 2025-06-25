package Methods_questions;

import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a natural number (greater than 0)");
        } else {
            int sumRecursive = sumUsingRecursion(n);
            int sumFormula = sumUsingFormula(n);
            System.out.println("Sum using recursion: " + sumRecursive);
            System.out.println("Sum using formula: " + sumFormula);

            if (sumRecursive == sumFormula) {
                System.out.println("Both results are equal and correct.");
            } else {
                System.out.println("Results are not equal.");
            }
        }

        sc.close();
    }

    public static int sumUsingRecursion(int n) {
        if (n == 1) return 1;
        return n + sumUsingRecursion(n - 1);
    }

    public static int sumUsingFormula(int n) {
        return (n * (n + 1)) / 2;
    }
}
