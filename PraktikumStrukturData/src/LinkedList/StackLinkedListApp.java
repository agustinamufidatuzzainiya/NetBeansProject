/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author Agustina Mufidatuzzainiya
 */
public class StackLinkedListApp {
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.push(1, "VCD");        
        stack.push(2, "TV");                 
        stack.display();
        System.out.println();//
        stack.push(3, "Kulkas");
        stack.push(4, "TV");
        stack.push(5, "Rice Cooker");
        stack.push(6, "Dispenser");
        stack.display();
        System.out.println();//
        stack.pop();
        stack.pop();
        stack.display();        
    }
}
