/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rekursi;

/**
 *
 * @author Agustina Mufidatuzzainiya
 */
public class ArraysApp {
    public static void main(String[] args) {
        Arrays array = new Arrays(10);
        array.insert(9);
        array.insert(7);
        array.insert(5);
        array.insert(8);
        array.insert(1);
        array.insert(3);
        array.insert(2);
        array.insert(10);
        array.insert(6);
        array.insert(4);
        System.out.println("Data Sebelum di sorting : ");
        array.display();
        System.out.println("========================");
        System.out.println("Data Sesudah di sorting :");
        array.mergeSort();
        array.display();
    }
}
