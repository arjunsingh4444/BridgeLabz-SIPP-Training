package Methods_questions;

public class SimpleOTP {

    public static void main(String[] args) {
        int[] otps = new int[10];

        for (int i = 0; i < 10; i++) {
            otps[i] = (int)(Math.random() * 900000) + 100000;
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        System.out.println("All OTPs unique: " + checkUnique(otps));
    }

    public static boolean checkUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
