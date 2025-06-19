package arrays_questions;

import java.util.Scanner;

public class freq_OfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] freq = new int[10];

        while (num > 0) {
            int digit = num % 10;
            freq[digit]++;   //freq
            num /= 10;
            System.out.println(freq);
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occours " + freq[i]+ " times ");
            }
        }

    }
}
