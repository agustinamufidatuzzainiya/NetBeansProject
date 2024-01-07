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
public class StackLinkedList {
    private StackLink top;

    StackLinkedList() {
        top = null; 
    }

    public void push(int id, String namabarang) {
        StackLink newStack = new StackLink(id, namabarang);
        newStack.next = top;
        top = newStack;
    }

    public void pop() {
        top = top.next;
    }

    public void display() {
        System.out.println("Stack (top --> bottom) :");
        StackLink currentstack = top;

        while (currentstack != null) {
            currentstack.displayStackLink();
            currentstack = currentstack.next;
        }
    }
}
