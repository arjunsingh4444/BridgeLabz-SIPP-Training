package arrays_questions;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));

            double weight;
            do {
                System.out.print("Enter weight in kg: ");
                weight = sc.nextDouble();
            } while (weight <= 0);

            double height;
            do {
                System.out.print("Enter height in meters: ");
                height = sc.nextDouble();
            } while (height <= 0);

            double bmi = weight / (height * height);

            System.out.println("bmi is " +bmi);

            // personData[i][0] = height;
            // personData[i][1] = weight;
            // personData[i][2] = bmi;

            if (bmi < 18.5)
                System.out.println(weightStatus[i] = "Underweight");
            else if (bmi < 25)
            System.out.println(weightStatus[i] = "Normal weight");
                
            else if (bmi < 30)
            System.out.println(weightStatus[i] = "Overweight");
            else
                weightStatus[i] = "Obese";
        }

        // System.out.println("\n--------------------------------------------");
        // System.out.println("Person | Height | Weight |  BMI  | Status");
        // System.out.println("--------------------------------------------");
        // for (int i = 0; i < number; i++) {
        //     System.out.println();
        // }

    }
}
