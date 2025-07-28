package BridgeLabz_SIPP_Training.Collections;

import java.util.*;

public class demoo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        String maxKey = null;
        int max = -1;

        for (String key : map.keySet()) {
            int value = map.get(key);
            if (value > max) {
                max = value;
                maxKey = key;
            }
        }

        System.out.println("Key with highest value: " + maxKey);
    }
}
