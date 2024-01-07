/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackAndQueue;

/**
 *
 * @author niya
 */
public class QueuePrakApp {

    public static void main(String[] args) {
        QueuePrak theQueue = new QueuePrak(5);
        System.out.println("Beberapa mulai mengantri :");
        theQueue.insert("Ahmad");
        theQueue.insert("Niya");
        theQueue.insert("Andre");
        theQueue.insert("Nopa");
        theQueue.insert("Rey");
        theQueue.insert("Neha");
        theQueue.insert("Adit");
        System.out.println(">> isi Antrian");
        theQueue.display();
        System.out.println(">> satu per satu keluar");
        System.out.println(theQueue.remove() + " Keluar");
        theQueue.display();
        System.out.println(theQueue.remove() + " Keluar");
        theQueue.display();
        System.out.println(theQueue.remove() + " Keluar");
        theQueue.display();
        System.out.println(theQueue.remove() + " Keluar");
        theQueue.display();
        System.out.println(theQueue.remove() + " Keluar");
        theQueue.display();
        
        System.out.println("Jumlah orang yang ada di antrian "
                +theQueue.size()+" person");
        
    }

}
