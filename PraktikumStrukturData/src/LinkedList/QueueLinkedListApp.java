/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author niya
 */
public class QueueLinkedListApp {
    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();

        queue.insert(1665100, "Ilham");
        queue.insert(1665200, "Mira");
        queue.display();
        System.out.println();
        queue.insert(1665300, "Ami");
        queue.insert(1665400, "Haya");
        queue.insert(1665500, "Yati");
        queue.display();
        System.out.println();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.display();
    }
}
