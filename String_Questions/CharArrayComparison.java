package String_Questions;
import java.util.*;

public class CharArrayComparison {

    public static char[] getCharsFromString(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        char[] arr1 = getCharsFromString(input);  
        char[] arr2 = input.toCharArray();      //build in method 

        System.out.print("User-defined method: ");
        for (char c : arr1) System.out.print(c + " ");

        System.out.print("\nBuilt-in method:     ");
        for (char c : arr2) System.out.print(c + " ");

        System.out.println("\nArrays are equal: " + compareCharArrays(arr1, arr2));

    }
}
