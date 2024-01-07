/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTrees;

/**
 *
 * @author Agustina_210605110144
 */
public class Stack {
    private int maxSize;    
    private Node top;

    public Stack() {
        top = null;        
    }

    public void push(Node item) {
        Node oldtop = top;
        top = new Node();
        top.item = item;
        top.next = oldtop;
        maxSize++;
    }

    public Node pop() {
        Node item = top.item;       
        top = top.next;  
        return item;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    public int size() {
        return maxSize;
    }
}
