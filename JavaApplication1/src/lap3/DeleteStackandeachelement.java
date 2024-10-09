/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap3;

/**
 *
 * @author ASUS
 */
import java.util.Stack;
import java.util.Scanner;
public class DeleteStackandeachelement {
    public static void main(String[] args) {
        // Initialize the stack
        Stack<Integer> stack = new Stack<>();
        stack.push(20);
        stack.push(13);
        stack.push(89);
        stack.push(90);
        stack.push(11);
        stack.push(45);
        stack.push(18);
        // Xóa 3 phần tử trên cùng khỏi ngăn xếp
         System.out.println("Element removed from the stack: " + stack.pop()); // 18
        System.out.println("Element removed from the stack: " + stack.pop()); // 45
        System.out.println("Element removed from the stack: " + stack.pop()); // 11
        System.out.println("Element Stack after deleting 3 elements: " + stack); //In ngăn xếp sau khi lấy ra 3 phần tử
        System.out.println("Element position 90: " + stack.search(90)); //tìm kiếm một phần tử trong ngăn xếp và trả về vị trí bắt đầu từ 1 
        System.out.println("Element position 100: " + stack.search(100));//tìm kiếm một phần tử trong ngăn xếp và trả về vị trí -1 nếu không tìm thấy.
    }
}
