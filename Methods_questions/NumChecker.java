package Methods_questions;

public class NumChecker {

    public static int sumOfDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0)
                sum += i;
        }
        return sum;
    }

    public static boolean isPerfect(int number) {
        return sumOfDivisors(number) == number;
    }

    public static boolean isAbundant(int number) {
        return sumOfDivisors(number) > number;
    }

    public static boolean isDeficient(int number) {
        return sumOfDivisors(number) < number;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }

    public static boolean isStrong(int number) {
        int sum = 0;
        int original = number;
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        int[] testNumbers = {6, 12, 15, 145};

        for (int num : testNumbers) {
            System.out.println("Number: " + num);
            System.out.println("Perfect?   " + isPerfect(num));
            System.out.println("Abundant?  " + isAbundant(num));
            System.out.println("Deficient? " + isDeficient(num));
            System.out.println("Strong?    " + isStrong(num));
        }
    }
}
