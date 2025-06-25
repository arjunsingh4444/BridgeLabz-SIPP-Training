package String_Questions;
import java.util.Scanner;

public class StringLength {

    public static int getLength(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        for (char c : chars) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        System.out.println("by user define " + getLength(text));
        System.out.println("Length (built-in): " + text.length());
    }
}
