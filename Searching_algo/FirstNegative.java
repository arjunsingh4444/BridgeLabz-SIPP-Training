package BridgeLabz_SIPP_Training.Searching_algo;

public class FirstNegative {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, -5, 9, -3};
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}
