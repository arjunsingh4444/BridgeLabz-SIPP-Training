package BridgeLabz_SIPP_Training.Collections;

import java.util.LinkedList;

public class EasyNthFromEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int N = 2;

        // Convert to array
        Object[] arr = list.toArray();

        // Find index of Nth from end
        int index = arr.length - N;

        if (index >= 0 && index < arr.length) {
            System.out.println("Nth from end: " + arr[index]);
        } else {
            System.out.println("Invalid N");
        }
    }
}

