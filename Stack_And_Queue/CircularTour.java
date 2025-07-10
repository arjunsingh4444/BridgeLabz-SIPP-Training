package BridgeLabz_SIPP_Training.Stack_And_Queue;

public class CircularTour {
    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};
        int n = petrol.length;
        System.out.println(findStart(petrol, distance, n));
    }

    static int findStart(int[] petrol, int[] distance, int n) {
        int start = 0;
        int curr_petrol = 0;
        int total_petrol = 0;

        for (int i = 0; i < n; i++) {
            int diff = petrol[i] - distance[i];
            curr_petrol += diff;
            total_petrol += diff;

            // If petrol in tank is negative, can't start from here
            if (curr_petrol < 0) {
                start = i + 1;
                curr_petrol = 0;
            }
        }

        if (total_petrol >= 0)
            return start;
        else
            return -1;
    }
}
