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
public class QueueLinkedList {
    private QueueLink depan;
    private QueueLink belakang;

    QueueLinkedList() {
        depan = belakang = null;
    }

    public void insert(int nim, String mahasiswa) {
        QueueLink newQueue = new QueueLink(nim, mahasiswa);

        if (belakang == null) {
            depan = belakang = newQueue;
            return;
        }
        belakang.next = newQueue;
        belakang = newQueue;
    }

    public QueueLink remove() {
        QueueLink temp = depan;
        depan = depan.next;

        if (depan == null) {
            return null;
        }

        return temp;
    }

    public void display() {
        System.out.println("(front --> rear) :");
        QueueLink currentQueue = depan;

        while (currentQueue != null) {
            currentQueue.displayQueueLink();
            currentQueue = currentQueue.next;
        }
    }
}
