// package BridgeLabz_SIPP_Training.Collections;

// import java.util.*;


// abstract class Person {
//     protected String id;
//     protected String name;
//     protected int age;

//     public Person(String id, String name, int age) {
//         this.id = id;
//         this.name = name;
//         this.age = age;
//     }

//     public String getId() {
//         return id;
//     }

//     public int getAge() {
//         return age;
//     }

//     public String getName() {
//         return name;
//     }

//     @Override
//     public String toString() {
//         return "ID: " + id + ", Name: " + name + ", Age: " + age;
//     }
// }

// // Doctor class
// class Doctor extends Person {
//     private String specialization;

//     public Doctor(String id, String name, int age, String specialization) {
//         super(id, name, age);
//         this.specialization = specialization;
//     }

//     public String getSpecialization() {
//         return specialization;
//     }

//     @Override
//     public String toString() {
//         return super.toString() + ", Specialization: " + specialization;
//     }
// }


// class Patient extends Person {
//     private String disease;

//     public Patient(String id, String name, int age, String disease) {
//         super(id, name, age);
//         this.disease = disease;
//     }

//     public String getDisease() {
//         return disease;
//     }

//     @Override
//     public String toString() {
//         return super.toString() + ", Disease: " + disease;
//     }
// }

// interface HospitalRepository<T extends Person> {
//     void add(T person);
//     T getById(String id);
//     List<T> getAll();
//     boolean remove(String id);
// }


// class HospitalRepositoryImpl<T extends Person> implements HospitalRepository<T> {
//     private List<T> persons = new ArrayList<>();

//     public void add(T person) {
//         persons.add(person);
//     }

//     public T getById(String id) {
//         for (T person : persons) {
//             if (person.getId().equalsIgnoreCase(id)) {
//                 return person;
//             }
//         }
//         return null;
//     }

//     public List<T> getAll() {
//         return new ArrayList<>(persons);
//     }

//     public boolean remove(String id) {
//         return persons.removeIf(p -> p.getId().equalsIgnoreCase(id));
//     }
// }


// public class appoitment{
//     public static void main(String[] args) {
//         HospitalRepositoryImpl<Doctor> doctorRepo = new HospitalRepositoryImpl<>();
//         HospitalRepositoryImpl<Patient> patientRepo = new HospitalRepositoryImpl<>();
//         Scanner sc = new Scanner(System.in);

//         int choice;
//         do {
//             System.out.println("\n===== Hospital Management System =====");
//             System.out.println("1. Add Doctor");
//             System.out.println("2. Add Patient");
//             System.out.println("3. View All Doctors");
//             System.out.println("4. View All Patients");
//             System.out.println("5. Search Doctor by ID");
//             System.out.println("6. Search Patient by ID");
//             System.out.println("7. Remove Doctor by ID");
//             System.out.println("8. Remove Patient by ID");
//             System.out.println("9. Exit");
//             System.out.print("Enter your choice: ");

//             while (!sc.hasNextInt()) {
//                 System.out.print("Invalid input. Please enter a number: ");
//                 sc.next();
//             }
//             choice = sc.nextInt();
//             sc.nextLine(); 

//             switch (choice) {
//                 case 1 -> {
//                     System.out.print("Enter Doctor ID: ");
//                     String id = sc.nextLine();
//                     System.out.print("Enter Name: ");
//                     String name = sc.nextLine();
//                     int age = readValidAge(sc);
//                     System.out.print("Enter Specialization: ");
//                     String specialization = sc.nextLine();
//                     doctorRepo.add(new Doctor(id, name, age, specialization));
//                     System.out.println("Doctor added successfully.");
//                 }
//                 case 2 -> {
//                     System.out.print("Enter Patient ID: ");
//                     String id = sc.nextLine();
//                     System.out.print("Enter Name: ");
//                     String name = sc.nextLine();
//                     int age = readValidAge(sc);
//                     System.out.print("Enter Disease: ");
//                     String disease = sc.nextLine();
//                     patientRepo.add(new Patient(id, name, age, disease));
//                     System.out.println("Patient added successfully.");
//                 }
//                 case 3 -> {
//                     System.out.println("----- All Doctors -----");
//                     doctorRepo.getAll().forEach(System.out::println);
//                 }
//                 case 4 -> {
//                     System.out.println("----- All Patients -----");
//                     patientRepo.getAll().forEach(System.out::println);
//                 }
//                 case 5 -> {
//                     System.out.print("Enter Doctor ID to search: ");
//                     String id = sc.nextLine();
//                     Doctor doctor = doctorRepo.getById(id);
//                     System.out.println(doctor != null ? doctor : "Doctor not found.");
//                 }
//                 case 6 -> {
//                     System.out.print("Enter Patient ID to search: ");
//                     String id = sc.nextLine();
//                     Patient patient = patientRepo.getById(id);
//                     System.out.println(patient != null ? patient : "Patient not found.");
//                 }
//                 case 7 -> {
//                     System.out.print("Enter Doctor ID to remove: ");
//                     String id = sc.nextLine();
//                     boolean removed = doctorRepo.remove(id);
//                     System.out.println(removed ? "Doctor removed." : "Doctor not found.");
//                 }
//                 case 8 -> {
//                     System.out.print("Enter Patient ID to remove: ");
//                     String id = sc.nextLine();
//                     boolean removed = patientRepo.remove(id);
//                     System.out.println(removed ? "Patient removed." : "Patient not found.");
//                 }
//                 case 9-> System.out.println("Exiting application. Goodbye!");
//                 default -> System.out.println("Invalid choice. Try again.");
//             }

//         } while (choice != 9);

//         sc.close();
//     }

//     private static int readValidAge(Scanner sc) {
//         int age;
//         while (true) {
//             System.out.print("Enter Age: ");
//             try {
//                 age = sc.nextInt();
//                 if (age <= 0) throw new InputMismatchException();
//                 sc.nextLine(); 
//                 return age;
//             } catch (InputMismatchException e) {
//                 System.out.println("Invalid age. Please enter a positive number.");
//                 sc.nextLine(); 
//             }
//         }
//     }
// }