package BridgeLabz_SIPP_Training.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCounter {

    public static void main(String[] args) {
        // Input list
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");

        // Map to store frequencies
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Count frequencies
        for (String fruit : fruits) {
            if (frequencyMap.containsKey(fruit)) {
                frequencyMap.put(fruit, frequencyMap.get(fruit) + 1);
            } else {
                frequencyMap.put(fruit, 1);
            }
        }

    
        System.out.println("Frequency of elements: " + frequencyMap);
    }
}
