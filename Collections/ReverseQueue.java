package BridgeLabz_SIPP_Training.Collections;

import java.util.*;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Use a stack to reverse
        Stack<Integer> stack = new Stack<>();

        // Remove from queue and push into stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // Pop from stack and add back to queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // Print reversed queue
        System.out.println("Reversed Queue: " + queue);
    }
}
