/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap4;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
public class myList {
    public static void main(String[] args) {
        // Tạo một ArrayList tên là myList
        ArrayList<String> myList = new ArrayList<>();        
        // Thêm các phần tử vào danh sách bằng phương thức add()
        myList.add("Apple");
        myList.add("Orange");
        myList.add("Pineapple");
        myList.add("Mango");
        myList.add("Orange");
        myList.add("Grapes");      
        // In tất cả các phần tử bằng vòng lặp for
        System.out.println("Print All the Objects:");
        for (String fruit : myList) {
            System.out.println(fruit);}   
        // Sử dụng phương thức get() để lấy phần tử tại chỉ mục 3
        System.out.println("Object at index 3 element from list: " + myList.get(3));       
        // Sử dụng phương thức contains() để kiểm tra sự tồn tại của phần tử "mangosteen"
        System.out.println("Ismangosteen in list: " + myList.contains("mangosteen"));
        // Sử dụng phương thức size() để in kích thước của danh sách
        System.out.println("Size of ArrayList: " + myList.size());  
        // In kích thước mới sau khi thêm phần tử vào
        System.out.println("New Size of ArrayList: " + myList.size());
    }
}

