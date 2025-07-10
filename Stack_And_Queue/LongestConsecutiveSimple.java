package BridgeLabz_SIPP_Training.Stack_And_Queue;
import java.util.*;

public class LongestConsecutiveSimple {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int longest = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            // If num-1 not in set, num is start of a sequence
            if (!set.contains(num - 1)) {
                int count = 1;
                int current = num;

                // Count next numbers in sequence
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                // Update longest
                if (count > longest) {
                    longest = count;
                }
            }
        }

        System.out.println("Longest consecutive sequence length: " + longest);
    }
}
