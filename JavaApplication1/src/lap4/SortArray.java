/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap4;

/**
 *
 * @author ASUS
 */
  import java.util.Arrays;
public class SortArray {
    public static void main(String[] args) {
        // Tạo một mảng kiểu int
        int[] numbers = {40, 8, 9, 33, 20, 30};       
        // Sắp xếp mảng
        Arrays.sort(numbers);       
        // In ra mảng đã sắp xếp
        System.out.println("Sorted Array:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}


