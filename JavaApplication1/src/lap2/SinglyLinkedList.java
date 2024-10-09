/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap2;

/**
 *
 * @author ASUS
 */
import java.io.*; 
public class SinglyLinkedList {
    Node head;
    static class Node{
    int data;   
    Node next;  
        Node(int d)
        {  data = d;
           next = null;}}
    public static SinglyLinkedList insert (SinglyLinkedList list, int data ) {
     Node new_node = new Node(data); 
       if (list.head == null) { 
            list.head = new_node;  } 
        else { 
          Node last = list.head; 
            while (last.next != null) { 
                last = last.next;  } 
         last.next = new_node; } 
         return list;  } 
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;  
        System.out.println(); }}
    public static void main(String[] args) {
        // Sử dụng var hoặc khai báo kiểu rõ ràng
        SinglyLinkedList list = new SinglyLinkedList(); 
        list = insert(list, 10); 
        list = insert(list, 20); 
        list = insert(list, 30); 
        list = insert(list, 40); 
        list = insert(list, 50); 
        list = insert(list, 60); 
        list = insert(list, 70); 
        System.out.println("Linked List:");
        list.display();
    }
}
   
    
 

