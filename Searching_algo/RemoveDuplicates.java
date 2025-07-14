package BridgeLabz_SIPP_Training.Searching_algo;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (set.add(c)) {
                sb.append(c);
            }
        }

        System.out.println(sb.toString());
    }
}
