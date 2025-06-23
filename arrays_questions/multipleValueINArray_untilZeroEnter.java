package arrays_questions;




import java.util.*;

public class MultipleValueINArray_untilZeroEnter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0, index = 0;

        System.out.println("Enter numbers (0 to stop):");

        while (index < 10) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            arr[index] = n;
            sum += n;
            index++;
        }

        System.out.println("Sum = " + sum);
        System.out.print("Values entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}




