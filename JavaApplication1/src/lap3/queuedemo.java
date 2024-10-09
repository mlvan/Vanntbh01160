/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap3;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
class MyQueue {
    private ArrayList<String> queueList;
    // Constructor khởi tạo danh sách hàng đợi
    public MyQueue() {
        queueList = new ArrayList<>();
    }
    // Cách 1: Thêm phần tử vào cuối danh sách (add)
    public void add(String element) {
        queueList.add(element);
        System.out.println("Added using add(): " + element);
    }
    // Cách 2: Sử dụng offer (cũng thêm vào cuối danh sách)
    public void offer(String element) {
        queueList.add(element);
        System.out.println("Added using offer(): " + element);
    }
    // Cách 1: Lấy phần tử đầu tiên mà không xóa nó (peek)
    public String peek() {
        if (!queueList.isEmpty()) {
            return queueList.get(0);
        }
        return null;
   }
    // Cách 2: Lấy phần tử đầu tiên mà không xóa nó (element)
    public String element() {
        if (!queueList.isEmpty()) {
            return queueList.get(0);
        }
        throw new IllegalStateException("Queue is empty");
    }
    // Cách 1: Xóa phần tử đầu tiên và trả về nó (poll)
    public String poll() {
        if (!queueList.isEmpty()) {
            return queueList.remove(0);
        }
        return null;
    }
    // Cách 2: Xóa phần tử đầu tiên và trả về nó (remove)
    public String remove() {
        if (!queueList.isEmpty()) {
            return queueList.remove(0);
        }
        throw new IllegalStateException("Queue is empty");
    }
    // Hiển thị toàn bộ danh sách hàng đợi
    public void displayQueue() {
        System.out.println("Elements in Queue: " + queueList);
    }
}
public class queuedemo {
    public static void main(String[] args) {
        // Khởi tạo một hàng đợi
        MyQueue queue = new MyQueue();
        // Thêm phần tử vào hàng đợi theo 2 cách
        queue.add("element 1");  // Way 1: using add()
        queue.offer("element 2"); // Way 2: using offer()
        queue.add("element 3");
        queue.offer("element 4");
        // Hiển thị danh sách hàng đợi
        queue.displayQueue();
        // Lấy phần tử đầu tiên theo 2 cách
        String firstElement1 = queue.peek();  // Way 1: using peek()
        System.out.println("First element in the first way (peek): " + firstElement1);
        String firstElement2 = queue.element();  // Way 2: using element()
        System.out.println("First element in the second way (element): " + firstElement2);
        // Xóa phần tử khỏi hàng đợi theo 2 cách
        String removedElement1 = queue.poll();  // Way 1: using poll()
        System.out.println("Removed using poll(): " + removedElement1);
       String removedElement2 = queue.remove();  // Way 2: using remove()
        System.out.println("Removed using remove(): " + removedElement2);
        // Hiển thị danh sách hàng đợi sau khi xóa
        queue.displayQueue();
    }
}