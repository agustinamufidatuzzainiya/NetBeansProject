/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heaps;

/**
 *
 * @author Agustina Mufidatuzzainiya_210605110144
 */
public class HeapApp {
    public static void main(String[] args){
        Heap testheap = new Heap(35);
        System.out.println("Agustina Mufidatuzzainiya");
        testheap.insert(150);
        testheap.insert(80);
        testheap.insert(75);
        testheap.insert(60);
        testheap.insert(50);
        testheap.insert(45);            
        testheap.insert(30);
        testheap.insert(22);
        testheap.insert(15);
        testheap.insert(12);
        testheap.insert(5);
        testheap.insert(3);
        testheap.insert(70);
        
        
//        testheap.displayArray();
//        testheap.remove();
//        testheap.displayHeap();                               
        testheap.change(2, 40);
        testheap.displayHeap();
    }
}
