package BridgeLabz_SIPP_Training.Collections;

import java.util.*;

public class EasyStackUsingQueues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push to stack
    void push(int x) {
        q1.add(x);
    }

    // Pop from stack
    int pop() {
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        int top = q1.remove(); // Last element is the "top"

        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;
    }

    // Get top element
    int top() {
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        int top = q1.peek(); // Last element
        q2.add(q1.remove());

        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;
    }

    public static void main(String[] args) {
        EasyStackUsingQueues stack = new EasyStackUsingQueues();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop()); // 3
        System.out.println(stack.top()); // 2
    }
}
