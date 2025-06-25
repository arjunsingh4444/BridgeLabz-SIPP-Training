package Methods_questions;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Year must be 1582 or later");
        } else {
            boolean isLeap = isLeapYear(year);
            if (isLeap)
                System.out.println(year + " is a Leap Year");
            else
                System.out.println(year + " is Not a Leap Year");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
