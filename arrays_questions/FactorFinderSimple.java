package arrays_questions;

import java.util.Scanner;

public class FactorFinderSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < count; i++) {
            System.out.print(factors[i] + " ");
        }

        scanner.close();
    }
}
