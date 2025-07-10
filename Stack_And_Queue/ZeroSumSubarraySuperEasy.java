package BridgeLabz_SIPP_Training.Stack_And_Queue;

import java.util.*;

public class ZeroSumSubarraySuperEasy {
    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 2, -3, 4};
        findZeroSumSubarrays(arr);
    }

    static void findZeroSumSubarrays(int[] arr) {
        // Map to store sum and where it occurred
        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If sum is 0 from start
            if (sum == 0) {
                System.out.println("Subarray: 0 to " + i);
            }

            // If sum seen before
            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    System.out.println("Subarray: " + (start + 1) + " to " + i);
                }
            }

            // Store this sum and index
            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
    }
}
