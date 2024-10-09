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
public class stack {
    public static void main(String[] args) {
         //  Khởi tạo Stack với kiểu Integer
        Stack<Integer> stack = new Stack<>();
        //  Tạo mảng các phần tử cần thêm vào stack Initial Stack: []
         int[] elements = {20, 13, 89, 90, 11, 45, 18};//int tạo thành 1 cái bọc để bọc phần tử để thành đối tượng
        System.out.println("Element Stack: " + stack); 
        System.out.println(" Stack is empty on initialization?true: " + stack.isEmpty());//Stack trống khi khởi tạo? đúng
         System.out.println("Stack is empty after push:False " + stack.isEmpty());//Stack trống sau khi đẩy: Sai
           // Sử dụng vòng lặp để đẩy (push) từng phần tử vào stack
         for (int element : elements) {
            stack.push(element);
            System.out.println("push -> " + element);
            System.out.println("stack: " + stack);
        }
         
             
    }
    
}


