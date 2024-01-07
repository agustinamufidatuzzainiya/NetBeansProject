/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktikumHeap;

/**
 *
 * @author Agustina Mufidatuzzainiya_210605110144
 */
public class HeapApp {
    public static void main(String[] args) {
        int maxSize = 5;
        Heap testheap = new Heap(maxSize);

        for (int i = 0; i < maxSize; i++) {
            int value = (int) (Math.random() * 100);
            testheap.insertAt(i, value);
        }

        testheap.displayHeap();

        testheap.HeapSort();
        System.out.println("Agustina Mufidatuzzainiya_210605110144");
        System.out.println("Array setelah urut: ");
        testheap.displayArray();       

    }
}
