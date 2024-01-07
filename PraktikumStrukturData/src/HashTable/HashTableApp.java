/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTable;

/**
 *
 * @author Agustina Mufidatuzzainiya_210605110144
 */
//Tugas Praktikum
public class HashTableApp {
    public static void main(String[] args) {
        HashTable table = new HashTable(15);
        table.insert(5);
        table.insert(4);
        table.insert(0);
        table.insert(1);
        table.insert(2);
        table.insert(3);
        table.insert(14);
        table.insert(16);
        table.insert(21);
        table.insert(333);
        table.insert(121);
        table.insert(70);
        table.insert(69);
        table.displayTable();
        
        System.out.println("Agustina Mufidatuzzainiya_144");
        System.out.println("=====================");
        System.out.println("Pencarian data");
        // find
        int key = 21;
        Data cari = table.find(key);
        if (cari != null) {
            System.out.println(key + " Ditemukan !");
        } else {
            System.out.println(key + " Tidak Ditemukan !");
        }
        //Agustina Mufidatuzzainiya_210605110144
        System.out.println("=====================");
        System.out.println("penghapusan data");
        // deleted
        table.delete(21);
        table.delete(16);
        table.displayTable();

    }
}
