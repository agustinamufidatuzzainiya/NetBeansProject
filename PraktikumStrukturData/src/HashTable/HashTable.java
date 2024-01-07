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
public class HashTable {

    private Data[] hashArray;
    private int size;

    public HashTable(int size) {
        this.size = size;
        hashArray = new Data[size];

    }

    public void displayTable() {
        System.out.println("Table: ");
        for (int j = 0; j < size; j++) {
            if (hashArray[j] != null) {
                System.out.println(" | " + j + "\t | " + hashArray[j].getKey() + " |");
            } else {
                System.out.println(" | " + j + "\t | -- |");
            }
        }
        System.out.println("");
    }
    //Agustina Mufidatuzzainiya_210605110144
    public int hashFunc(int key) {
        return key % size;
    }

    public int f(int i) {
        return i * i;
    }

    public void insert(int data) {
        Data item = new Data(data);
        int key = item.getKey();
        int hashVal = hashFunc(key);
        int i = 1;
        while (hashArray[hashVal] != null) {
            hashVal += f(i);
            hashVal %= size;
            i++;
        }
        hashArray[hashVal] = item;
    }

    public Data delete(int key) {
        int hashVal = hashFunc(key);
        int i = 1;
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                Data temp = hashArray[hashVal];
                hashArray[hashVal] = null;
                return temp;
            }
            hashVal += f(i);
            hashVal %= size;
            i++;
        }
        return null;
    }
        //Agustina Mufidatuzzainiya_210605110144
    public Data find(int key) {
        int hashVal = hashFunc(key);
        int i = 1;
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                return hashArray[hashVal];
            }
            hashVal += f(i);
            hashVal %= size;
            i++;
        }
        return null;
    }
} // akhir class HashTable