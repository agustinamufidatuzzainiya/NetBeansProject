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
//SeparateChaining
public class HashTable2 {
    private SortedLinkList[] hashArray;
    private int size;

    public HashTable2(int size) {
        this.size = size;
        hashArray = new SortedLinkList[size];
        for (int i = 0; i < size; i++) {
            hashArray[i] = new SortedLinkList();
        }
    }

    public void displayTable() {
        System.out.println("Table: ");
        for (int j = 0; j < size; j++) {
            System.out.print(" " + j + ". ");
            hashArray[j].displayList();
        }
    }

    public int hashFunc(int key) {
        return key % size;
    }

    public void insert(int data) {
        Link theLink = new Link(data);
        int key = theLink.getKey();
        int hashVal = hashFunc(key);
        hashArray[hashVal].insert(theLink);
    }

    public void delete(int key) {
        int hashVal = hashFunc(key);
        hashArray[hashVal].delete(key);
    }

    public Link find(int key) {
        int hashVal = hashFunc(key);
        Link theLink = hashArray[hashVal].find(key);
        return theLink;
    }
}
