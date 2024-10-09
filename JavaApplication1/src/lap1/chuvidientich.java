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
public class chuvidientich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhập chiều dài của hình chữ nhật
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        // Nhập chiều rộng của hình chữ nhật
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        // Tính chu vi
        double perimeter = 2 * (length + width);
        // Tính diện tích
        double area = length * width;
        // Hiển thị kết quả
        System.out.println("Rectangle Properties:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);

        // Đóng đối tượng Scanner
        scanner.close();
    }
}


