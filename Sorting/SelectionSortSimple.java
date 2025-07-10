package BridgeLabz_SIPP_Training.Sorting;

public class SelectionSortSimple {
    public static void main(String[] args) {
        int[] scores = {70, 50, 90, 30, 80};

        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }

        System.out.println("Sorted Exam Scores:");
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }
}
