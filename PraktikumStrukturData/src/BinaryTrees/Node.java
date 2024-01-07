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
public class Node {
    public int id;
    public String data;
    public Node leftChild;
    public Node rightChild;
    //Agustina_210605110144
    //buat stack
    public Node next;
    public Node item;

    public void displayNode() {
        System.out.print("{ " + id + ", " + data + " } ");
    }
}
