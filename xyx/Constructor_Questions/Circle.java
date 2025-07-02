package xyx.Constructor_Questions;

public class Circle {
    private double radius;

    public Circle() {
        radius=1.0;  // Constructor chaining to set default radius
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();                   // Uses default constructor
        Circle c2 = new Circle(5.0);        // Uses parameterized constructor

        System.out.println("Circle 1 radius: " + c1.getRadius());
        System.out.println("Circle 1 area: " + c1.getArea());
        System.out.println("Circle 1 circumference: " + c1.getCircumference());

        System.out.println("Circle 2 radius: " + c2.getRadius());
        System.out.println("Circle 2 area: " + c2.getArea());
        System.out.println("Circle 2 circumference: " + c2.getCircumference());
    }
}

