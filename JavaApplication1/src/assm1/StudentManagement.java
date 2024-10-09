/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assm1;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
class Student {
    private String id;
    private String name;
    private double marks;
    public Student(String id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getMarks() {
        return marks;
    }
    public String getRank() {
        if (marks < 5.0) return "Fail";
        else if (marks < 6.5) return "Medium";
        else if (marks < 7.5) return "Good";
        else if (marks < 9.0) return "Very Good";
        else return "Excellent";
    }
    @Override
    public String toString() {
        return String.format("ID: %s, Name: %s, Marks: %.2f, Rank: %s", id, name, marks, getRank());
    }
}   
public class StudentManagement {
    private ArrayList<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    // How to add students
    public void addStudent() {
        System.out.print("Enter Student ID: ");
        String studentId = scanner.next(); // Rename variables to avoid duplication
        System.out.print("Enter Student Name: ");
        String name = scanner.next();
        System.out.print("Enter Student Marks: ");
        double marks = scanner.nextDouble();
        students.add(new Student(studentId, name, marks)); // Using studentId
        System.out.println("Student added successfully!");
    }
    // Student edit method - No input parameters required
    public void editStudent() {
        System.out.print("Enter Student ID to edit: ");
        String idToEdit = scanner.next(); // Rename variables to avoid duplication
        for (Student student : students) {
            if (student.getId().equals(idToEdit)) {
                System.out.print("Enter new name: ");
                String newName = scanner.next();
                System.out.print("Enter new marks: ");
                double newMarks = scanner.nextDouble();
                // Delete old student and add new student with edited information
                students.remove(student);
                students.add(new Student(idToEdit, newName, newMarks)); // Using idToEdit
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }
    // Student deletion method
    public void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        String id = scanner.next();
        boolean removed = students.removeIf(student -> student.getId().equals(id));
        if (removed) {
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }
    //Student arrangement method
    public void sortStudents() {
        students.sort(Comparator.comparingDouble(Student::getMarks));
        System.out.println("Students sorted by marks.");
    }
    // Student search method
    public void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        String id = scanner.next();
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("Student found: " + student);
                return;
            }
        }
        System.out.println("Student not found.");
    }
    // Student list display method
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }
    // Program control menu
    public void test() {
        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Sort Students by Marks");
            System.out.println("5. Search Student by ID");
            System.out.println("6. Display All Students");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addStudent(); 
                    break;
                case 2:
                    editStudent(); 
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    sortStudents();
                    break;
                case 5:
                    searchStudent();
                    break;
                case 6:
                    displayStudents();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        sm.test(); // Start student management system
    }
}
