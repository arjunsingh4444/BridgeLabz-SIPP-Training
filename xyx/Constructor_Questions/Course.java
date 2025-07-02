package xyx.Constructor_Questions;

public class Course {
    private String courseName;
    private int duration; 
    private double fee;

    private static String instituteName = "ABC Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: ₹" + fee);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 3, 15000);
        Course c2 = new Course("Web Development", 4, 20000);

        // Display initial details
        System.out.println("Before updating institute name:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Update institute name using class method
        Course.updateInstituteName("XYZ Tech Academy");

        // Display updated details
        System.out.println("After updating institute name:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
