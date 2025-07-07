// package Built-InFunctionPractice;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose operation: + - * /");
        char op = scanner.next().charAt(0);

        System.out.print("Enter two numbers: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        switch (op) {
            case '+': System.out.println("Result: " + add(a, b)); break;
            case '-': System.out.println("Result: " + subtract(a, b)); break;
            case '*': System.out.println("Result: " + multiply(a, b)); break;
            case '/': System.out.println("Result: " + divide(a, b)); break;
            default: System.out.println("Invalid operation");
        }
    }

    static double add(double x, double y) { return x + y; }
    static double subtract(double x, double y) { return x - y; }
    static double multiply(double x, double y) { return x * y; }
    static double divide(double x, double y) { return y != 0 ? x / y : Double.NaN; }
}