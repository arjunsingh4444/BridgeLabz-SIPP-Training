package Methods_questions;

import java.util.Random;

public class FootballTeamHeight {

    public static void main(String[] args) {
        int[] heights = generateHeights();

        System.out.print("Player Heights: ");
        for (int i = 0; i < heights.length; i++) {
            System.out.print(heights[i] + " ");
        }
        System.out.println();

        int sum = findSum(heights);
        double mean = findMean(heights);
        int min = findShortest(heights);
        int max = findTallest(heights);

        System.out.println("Sum of heights: " + sum);
        System.out.println("Mean height: " + mean);
        System.out.println("Shortest height: " + min);
        System.out.println("Tallest height: " + max);
    }

    public static int[] generateHeights() {
        int[] arr = new int[11];
        Random rand = new Random();
        for (int i = 0; i < 11; i++) {
            arr[i] = rand.nextInt(101) + 150; // 150 to 250
        }
        return arr;
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
