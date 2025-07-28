package BridgeLabz_SIPP_Training.Collections;

import java.util.*;

public class mergemaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        // Add all keys from map2 into map1
        for (String key : map2.keySet()) {
            int value = map2.get(key);

            if (map1.containsKey(key)) {
                map1.put(key, map1.get(key) + value); // sum values
            } else {
                map1.put(key, value); // just put new key
            }
        }

        System.out.println(map1);
    }
}
