/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap2;

/**
 *
 * @author ASUS
 */
public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Original Array Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println( numbers[i]);
        }
        numbers[3] = 100; 
        System.out.println("\nArray Elements After Modification:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println( numbers[i]);
        }
    }
}

