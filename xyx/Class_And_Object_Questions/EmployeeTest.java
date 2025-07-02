package xyx.Class_And_Object_Questions;

class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Salary : ₹" + salary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Arjun Singh", 101, 55000.0);
        Employee emp2 = new Employee("Arju Singh", 10, 550000.0);


        emp1.displayDetails();
        emp2.displayDetails();

    }
}
