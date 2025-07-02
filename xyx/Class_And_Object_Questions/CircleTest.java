package xyx.Class_And_Object_Questions;

import java.util.Scanner;

class Circle {
    
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    void displayDetails() {
        System.out.println("Radius          : " + radius);
        System.out.println("Area            : " + calculateArea());
        System.out.println("Circumference   : " + calculateCircumference());
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double  r=sc.nextInt();
        Circle circle1 = new Circle(r); // radius = 7.0 units

        circle1.displayDetails();
    }
}
