package BridgeLabz_SIPP_Training.Stack_And_Queue;

import java.util.*;

public class PairWithGivenSumSimple {
    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 17;

        boolean found = false;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int needed = target - arr[i];

            if (set.contains(needed)) {
                System.out.println("Pair found: " + needed + ", " + arr[i]);
                found = true;
                break;
            }

            set.add(arr[i]);
        }

        if (!found) {
            System.out.println("No such pair found.");
        }
    }
}
