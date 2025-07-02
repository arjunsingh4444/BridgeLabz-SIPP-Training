

package arrays_questions;

import java.util.Arrays;
import java.util.Scanner;

public class OddEvenInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] evenArr = new int[10];
        int[] oddArr = new int[10];
        int evenIndex = 0, oddIndex = 0;

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                evenArr[evenIndex] = num;
                evenIndex++;
            } else {
                oddArr[oddIndex] = num;
                oddIndex++;
            }
        }

        int[] finalEven = Arrays.copyOf(evenArr, evenIndex);
        int[] finalOdd = Arrays.copyOf(oddArr, oddIndex);

        System.out.println("Even numbers: " + Arrays.toString(finalEven));
        System.out.println("Odd numbers: " + Arrays.toString(finalOdd));

        sc.close();
    }
}
