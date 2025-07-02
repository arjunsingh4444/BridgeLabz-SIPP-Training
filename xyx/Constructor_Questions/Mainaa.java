package xyx.Constructor_Questions;

class Student {
    public int rollNumber;        // Public
    protected String name;        // Protected
    private double CGPA;          // Private

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to set CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void displayDetails() {
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass
class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    // Method to show that protected variable 'name' is accessible
    public void showName() {
        System.out.println("Postgraduate Student Name: " + name);  // Accessing protected member
    }
}

// Main class to test
public class Mainaa {
    public static void main(String[] args) {
        Student s = new Student(101, "Arjun", 8.5);
        s.displayDetails();

        // Modify CGPA
        s.setCGPA(9.0);
        System.out.println("Updated CGPA: " + s.getCGPA());

        // Create postgraduate student
        PostgraduateStudent pg = new PostgraduateStudent(201, "Neha", 9.2);
        pg.showName(); // Accessing protected member
    }
}
