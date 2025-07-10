package BridgeLabz_SIPP_Training.Sorting;
public class CountingSortEasy {
    public static void main(String[] args) {
        int[] ages = {12, 15, 10, 13, 12, 18, 11, 15, 14};

        // Ages from 10 to 18
        int[] count = new int[9]; // (18 - 10 + 1 = 9)

        // Step 1: Count each age
        for (int age : ages) {
            count[age - 10]++;
        }

        // Step 2: Print ages in order based on count
        System.out.println("Sorted Ages:");
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                System.out.print((i + 10) + " ");
                count[i]--;
            }
        }
    }
}
