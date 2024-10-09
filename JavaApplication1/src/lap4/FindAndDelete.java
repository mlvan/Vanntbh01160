/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap4;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class FindAndDelete {
   public static void main(String[] args) {
        // Tạo một mảng chứa các tên
        String[] names = {"Van", "Danh", "Maria", "Thu", "Duy", "Minh", "Linh"};
        // In mảng trước khi xóa
        System.out.println("Array before deleting:");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
        // Nhập tên cần xóa từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name to delete: ");
        String nameToDelete = scanner.nextLine();
        // Tìm và xóa tên trong mảng
        int indexToDelete = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(nameToDelete)) {
                indexToDelete = i;
                break;
            }
        }
        // Nếu tìm thấy tên, tạo mảng mới mà không có tên đó
        if (indexToDelete != -1) {
            String[] newNames = new String[names.length - 1];
            for (int i = 0, j = 0; i < names.length; i++) {
                if (i != indexToDelete) {
                    newNames[j++] = names[i];
                }
            }
            // In mảng sau khi xóa
            System.out.println("Array after deleting:");
            for (String name : newNames) {
                System.out.print(name + " ");
            }
            System.out.println();
        } else {
            System.out.println("Name not found in the array.");
        }
    }
}
