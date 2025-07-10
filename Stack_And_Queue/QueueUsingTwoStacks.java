package BridgeLabz_SIPP_Training.Stack_And_Queue;
import java.util.Stack;

public class QueueUsingTwoStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // Enqueue operation
    public void enqueue(int x) {
        stack1.push(x);
    }

    // Dequeue operation
    public int dequeue() {
        if (stack2.isEmpty()) {
            // Transfer elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        
        if (stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return stack2.pop();
    }

    // Peek operation
    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        
        if (stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1; 
        }

        return stack2.peek();
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks q = new QueueUsingTwoStacks();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        
        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue()); 

        q.enqueue(40);
        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue()); 
    }
}
