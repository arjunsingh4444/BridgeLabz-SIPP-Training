package BridgeLabz_SIPP_Training.Searching_algo;

public class ConcatenateStrings {
    public static void main(String[] args) {
        String[] arr = {"Java", "is", "fun"};

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        System.out.println(sb.toString());
    }
}
