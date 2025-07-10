package BridgeLabz_SIPP_Training.Sorting;

public class QuickSortSimple {
    public static void main(String[] args) {
        int[] prices = {300, 100, 250, 150, 200};

        quickSort(prices, 0, prices.length - 1);

        System.out.println("Sorted Product Prices:");
        for (int price : prices) {
            System.out.print(price + " ");
        }
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find pivot position after partition
            int pi = partition(arr, low, high);

            // Sort left part
            quickSort(arr, low, pi - 1);

            // Sort right part
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // choose last element as pivot
        int i = low - 1; // index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than pivot
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and pivot
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // pivot index
    }
}
