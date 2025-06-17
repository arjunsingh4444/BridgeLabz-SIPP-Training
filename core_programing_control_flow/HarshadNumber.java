package core_programing_control_flow;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int originalNumber = number;
        int sum = 0; 

        while (number > 0) {
            int digit = number % 10; // Get last digit
            sum += digit;            // Add to sum
            number /= 10;            // Remove last digit
        }

        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Harshad Number.");
        }

    }
}
