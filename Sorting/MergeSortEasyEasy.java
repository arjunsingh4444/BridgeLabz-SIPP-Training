package BridgeLabz_SIPP_Training.Sorting;

public class MergeSortEasyEasy {
    public static void main(String[] args) {
        int[] prices = {250, 100, 300, 150, 200};
        mergeSort(prices, 0, prices.length - 1);

        System.out.println("Sorted prices:");
        for (int price : prices) {
            System.out.print(price + " ");
        }
    }

    static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            // Sort first half
            mergeSort(arr, start, mid);

            // Sort second half
            mergeSort(arr, mid + 1, end);

            // Merge both halves
            merge(arr, start, mid, end);
        }
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;

        // Compare and store in temp
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right half
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // Copy sorted temp back to original array
        for (int x = 0; x < temp.length; x++) {
            arr[start + x] = temp[x];
        }
    }
}
