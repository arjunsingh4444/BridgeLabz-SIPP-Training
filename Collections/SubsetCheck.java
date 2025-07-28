package BridgeLabz_SIPP_Training.Collections;

import java.util.*;

public class SubsetCheck {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));          // smaller set
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));   // bigger set

        boolean isSubset = set2.containsAll(set1);

        System.out.println("Is set1 a subset of set2? " + isSubset);
    }
}
