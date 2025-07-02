package xyx.Constructor_Questions;

// Base class
class Employee {
    public int employeeID;        
    protected String department;  
    private double salary;        

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
    }
}

// Subclass
class Manager extends Employee {
    private String teamName;

    // Constructor
    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    public void displayManagerDetails() {
        System.out.println("Manager Employee ID: " + employeeID);  
        System.out.println("Manager Department: " + department);   
        System.out.println("Team Name: " + teamName);
    }
}

public class Main_emp_repo {
    public static void main(String[] args) {
        Employee e = new Employee(101, "HR", 45000.0);
        e.displayEmployeeDetails();

        e.setSalary(50000.0);
        System.out.println("Updated Salary: ₹" + e.getSalary());

        Manager m = new Manager(201, "IT", 75000.0, "Backend Team");
        System.out.println("\nManager Details:");
        m.displayManagerDetails();
    }
}
