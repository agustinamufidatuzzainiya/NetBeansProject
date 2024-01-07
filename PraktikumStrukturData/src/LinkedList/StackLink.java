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
public class StackLink {
    private int id;
    private String namabarang;
    public StackLink next;

    public StackLink(int id, String namabarang) {
        this.id = id;
        this.namabarang = namabarang;
    }

    public void displayStackLink() {
        System.out.println("{"+id+","+namabarang+"}");
    }

}
