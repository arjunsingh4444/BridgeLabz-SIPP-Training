package BridgeLabz_SIPP_Training.Sorting;
public class HeapSortBasic {
    public static void main(String[] args) {
        int[] salaries = {50000, 30000, 70000, 40000, 60000};

        heapSort(salaries);

        System.out.println("Sorted salaries:");
        for (int s : salaries) {
            System.out.print(s + " ");
        }
    }

    static void heapSort(int[] arr) {
        int n = arr.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: Swap and heapify for each element
        for (int i = n - 1; i >= 0; i--) {
            // Swap first (biggest) with last
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify reduced heap
            heapify(arr, i, 0);
        }
    }

    static void heapify(int[] arr, int n, int i) {
        int largest = i; // Assume root is largest
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // If left child is bigger
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is bigger
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root, swap and heapify affected sub-tree
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
}
