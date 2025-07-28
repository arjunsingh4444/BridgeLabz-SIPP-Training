package BridgeLabz_SIPP_Training.Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String text = "Hello world, hello Java!";

        // Make everything lowercase and remove punctuation
        text = text.toLowerCase().replace(",", "").replace("!", "");

        // Split the string by space
        String[] words = text.split(" ");

        // Map to store word count
        HashMap<String, Integer> map = new HashMap<>();

        // Count each word
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

       
        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}
