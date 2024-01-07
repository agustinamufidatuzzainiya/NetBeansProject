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
public class CircularArrayApp {
    public static void main(String[] args) {

        CircularArray A = new CircularArray(5);
        A.insert("A24");
        A.insert("A25");
        A.insert("A12");
        A.insert("A13");
        A.insert("A19");
        A.insert("A20");

        A.remove();
        A.remove();
        A.remove();
        A.remove();
        A.remove();
        System.out.println();
        A.isiPilihan();

        A.insert("A24");
        A.insert("A12");
        A.insert("A25");

        A.isiPilihan();
        A.arrayDoubling();
        System.out.println("\nSetelah array doubling");
        System.out.println("=============================");
        A.insert("a");
        A.insert("b");
        A.insert("c");
        A.insert("d");
        A.insert("e");
        A.insert("f");
        A.insert("g");
        A.insert("h");
        System.out.println();
        A.isiPilihan();
    }
}
