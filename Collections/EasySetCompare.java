package BridgeLabz_SIPP_Training.Collections;

import java.util.*;

public class EasySetCompare {
    public static void main(String[] args) {
        // Create two sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add elements
        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(2);
        set2.add(1);

        // Check if they are equal
        System.out.println(set1.equals(set2));
    }
}
