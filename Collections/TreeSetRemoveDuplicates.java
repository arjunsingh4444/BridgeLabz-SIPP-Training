package BridgeLabz_SIPP_Training.Collections;
import java.util.*;

// public class SimpleRemoveDuplicates {
//     public static void main(String[] args) {
//         List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);
//         List<Integer> result = new ArrayList<>();
//         Set<Integer> set = new HashSet<>();

//         for (int num : list) {
//             if (!set.contains(num)) {
//                 result.add(num);
//                 set.add(num);
//             }
//         }

//         System.out.println(result);
//     }
// }



// import java.util.*;

public class TreeSetRemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);

        Set<Integer> treeSet = new TreeSet<>(list); // Removes duplicates with same order
        List<Integer> result = new ArrayList<>(treeSet);

        System.out.println(result);
    }
}
