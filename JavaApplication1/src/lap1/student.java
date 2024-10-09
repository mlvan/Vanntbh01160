/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap1;

/**
 *
 * @author ASUS
 */
 import java.util.Scanner;
public class student{
  private String name;
    private int age;
    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void printInfo() {
        System.out.println("Name: " + "Van "+ " Age: " + 20);
        System.out.println("address:" +" phu tho");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("nhap ten: ");
        String studentName = scanner.nextLine();
        System.out.print("nhap tuoi: ");
        int studentAge = scanner.nextInt();
        student student = new student(studentName, studentAge);
        student.printInfo();
        scanner.close();
}
}


