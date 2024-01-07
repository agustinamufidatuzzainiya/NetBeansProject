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
public class QueueLink {
     private int nim;
    private String mahasiswa;
    public QueueLink next;

    public QueueLink(int nim, String mahasiswa) {
        this.nim = nim;
        this.mahasiswa = mahasiswa;
    }

    public void displayQueueLink() {
        System.out.println(nim + " " + mahasiswa);
    }
}
