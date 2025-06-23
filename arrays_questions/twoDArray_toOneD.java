package arrays_questions;
import java.util.Scanner;

public class TwoDArray_toOneD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of rows: ");  // i/p
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

       
        int[][] matrix = new int[rows][columns];        //create 2d
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();     //fill
            }
        }

       
        int[] array = new int[rows * columns];    //create 1d
        int index = 0;

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];   //2d to 1d
                index++;
            }
        }

        
        System.out.println("1D Array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");     //o/p
        }

        scanner.close();
    }
}
