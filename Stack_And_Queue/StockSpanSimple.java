package BridgeLabz_SIPP_Training.Stack_And_Queue;

import java.util.Stack;

public class StockSpanSimple {
    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int n = price.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Pop while stack is not empty and top price <= current price
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }

            // Calculate span
            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            // Push current index to stack
            stack.push(i);
        }

        // Print spans
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}
