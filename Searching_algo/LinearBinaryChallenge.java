package BridgeLabz_SIPP_Training.Searching_algo;

import java.util.Arrays;

public class LinearBinaryChallenge {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int target = 4;

        System.out.println("First missing positive: " + firstMissingPositive(arr));
        Arrays.sort(arr);
        System.out.println("Target index: " + binarySearch(arr, target));
    }

    public static int firstMissingPositive(int[] arr) {
        int i = 1;
        while (true) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++)
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            if (!found)
                return i;
            i++;
        }
    }

    public static int binarySearch(int[] arr, int t) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] == t)
                return m;
            if (arr[m] < t)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }
}
