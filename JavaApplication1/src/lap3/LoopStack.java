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
public class LoopStack {
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
         System.out.println("Stack before modification: " + stack);
         for (int i = 0; i < stack.size(); i++) {
            if (stack.get(i) == 89) {
                stack.set(i, 100); // Change the value 89 to 100
            }
        }
        System.out.println("Stack after modification: " + stack);
      
    }
}
