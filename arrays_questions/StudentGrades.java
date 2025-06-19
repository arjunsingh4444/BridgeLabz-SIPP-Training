package arrays_questions;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

       
        int[] physics = new int[n];     //  Declare arrays
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        
        for (int i = 0; i < n; i++) {      //  Input marks
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            // Physics marks
            System.out.print("Physics: ");
            physics[i] = sc.nextInt();
            // if (physics[i] < 0) {
            //     System.out.println("Invalid input! Enter positive marks.");
            //     i--; continue;
            // }

            // Chemistry marks
            System.out.print("Chemistry: ");
            chemistry[i] = sc.nextInt();
            // if (chemistry[i] < 0) {
            //     System.out.println("Invalid input! Enter positive marks.");
            //     i--; continue;
            // }

            // Maths marks
            System.out.print("Maths: ");
            maths[i] = sc.nextInt();
            // if (maths[i] < 0) {
            //     System.out.println("Invalid input! Enter positive marks.");
            //     i--; continue;
            // }

            // Calculate percentage
            int total = physics[i] + chemistry[i] + maths[i];
            percentage[i] = total / 3.0;

            // Assign grade based on percentage
            if (percentage[i] >= 90) {
                grade[i] = 'A';
            } else if (percentage[i] >= 75) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 40) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
        }

        // o/p
        System.out.println("Student Report");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Physics: " + physics[i]);
            System.out.println("Chemistry: " + chemistry[i]);
            System.out.println("Maths: " + maths[i]);
            System.out.printf("Percentage:", percentage[i]);
            System.out.println("Grade: " + grade[i]);
        }

    }
}

