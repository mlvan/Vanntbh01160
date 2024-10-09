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
public class lap1 {
   //Input the name and output to the screen
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận input từ người dùng
        Scanner Scanner = new Scanner(System.in);
        
        // Nhập tên từ người dùng
        System.out.print("Nguyen Van ");
        String name = Scanner.nextLine();
        
        // Xuất tên ra màn hình
        System.out.println("hello, " + "Nguyen Van " + "!");
        
        // Đóng đối tượng Scanner
        Scanner.close();
    }
}
