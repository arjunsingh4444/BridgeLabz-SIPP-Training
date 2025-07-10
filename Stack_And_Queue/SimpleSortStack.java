package BridgeLabz_SIPP_Training.Stack_And_Queue;

import java.util.Stack;

public class SimpleSortStack {

    // Function to sort the stack
    static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sortStack(stack); // Sort remaining stack
            insertInSortedOrder(stack, temp);
        }
    }

    // Helper function to insert an element in sorted order
    static void insertInSortedOrder(Stack<Integer> stack, int element) {
        // If stack is empty OR top element is smaller, push directly
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
        } else {
            int temp = stack.pop(); // Pop top and recurse
            insertInSortedOrder(stack, element);
            stack.push(temp); // Push back the popped item
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Original stack: " + stack);
        sortStack(stack);
        System.out.println("Sorted stack: " + stack);
    }
}
