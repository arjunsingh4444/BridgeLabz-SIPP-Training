package BridgeLabz_SIPP_Training.Searching_algo;

import java.util.Stack;

public class FindMaxUsingStack {
    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        Stack<Integer> stack = new Stack<>();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        while (!stack.isEmpty()) {
            int val = stack.pop();
            if (val > max)
                max = val;
        }

        System.out.println("Maximum (peak) element: " + max);
    }
}

