package BridgeLabz_SIPP_Training.Collections;

import java.util.*;

public class GenerateBinaryNumbers {
    public static void main(String[] args) {
        int N = 5;

        Queue<String> queue = new LinkedList<>();
        List<String> result = new ArrayList<>();

        queue.add("1");

        for (int i = 0; i < N; i++) {
            String front = queue.remove();
            result.add(front);

            // Add next binary numbers
            queue.add(front + "0");
            queue.add(front + "1");
        }

        System.out.println("First " + N + " binary numbers: " + result);
    }
}
