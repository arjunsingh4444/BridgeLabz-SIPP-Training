package xyx.Class_And_Object_Questions;

class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    void displayResult() {
        System.out.println("Text: " + text);
        if (isPalindrome()) {
            System.out.println("Result: The text is a palindrome.");
        } else {
            System.out.println("Result: The text is NOT a palindrome.");
        }
    }
}

public class PalindromeTest {
    public static void main(String[] args) {
        PalindromeChecker checker1 = new PalindromeChecker("madam");
        PalindromeChecker checker2 = new PalindromeChecker("hello");

        checker1.displayResult();
        System.out.println();   // for spscing 
        checker2.displayResult();
    }
}
