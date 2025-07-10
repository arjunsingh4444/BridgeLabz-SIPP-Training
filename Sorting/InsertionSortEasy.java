package BridgeLabz_SIPP_Training.Sorting;

public class InsertionSortEasy {
    public static void main(String[] args) {
        int[] empIDs = {45, 12, 89, 33, 67};

        for (int i = 1; i < empIDs.length; i++) {
            int key = empIDs[i];
            int j = i - 1;

            // Move bigger numbers to right
            while (j >= 0 && empIDs[j] > key) {
                empIDs[j + 1] = empIDs[j];
                j--;
            }

            // Place key at correct position
            empIDs[j + 1] = key;
        }

        System.out.println("Sorted Employee IDs:");
        for (int id : empIDs) {
            System.out.print(id + " ");
        }
    }
}
