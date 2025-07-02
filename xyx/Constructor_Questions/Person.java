package xyx.Constructor_Questions;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

                                        // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alice", 30);    // Original person
        Person p2 = new Person(p1);                      // Clone using copy constructor

        System.out.println("Original person:");
        p1.display();

        System.out.println("Cloned. person:");
        p2.display();
    }
}
