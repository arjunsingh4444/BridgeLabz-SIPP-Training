package BridgeLabz_SIPP_Training.Collections;
import java.util.*;

public class SimpleRotate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        int k = 2;

        List<Integer> rotated = new ArrayList<>();

        // Add elements from k to end
        for (int i = k; i < list.size(); i++) {
            rotated.add(list.get(i));
        }

        // Add elements from start to k
        for (int i = 0; i < k; i++) {
            rotated.add(list.get(i));
        }

        System.out.println(rotated);
    }
}
