/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdvancedSort;

/**
 *
 * @author niya
 */
public class AdvancedSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
        AdvancedSort arr;
        arr = new AdvancedSort(maxSize);

//        arr.insert(10);
//        arr.insert(80);
//        arr.insert(30);
//        arr.insert(50);
//        arr.insert(70);
//        arr.insert(60);
//        arr.insert(20);
//        arr.insert(100);
//
//        System.out.println("Sebelum di Urutkan : ");
//        arr.display();   
//
//        System.out.println("Shell Sort : ");
//        arr.ShellSort();
//        arr.display();

        //no 4
        arr.insert(60);
        arr.insert(5);
        arr.insert(15);
        arr.insert(45);
        arr.insert(35);
        arr.insert(20);
        arr.insert(25);
        arr.insert(10);
        arr.insert(50);
        arr.insert(30);
        
        System.out.println("Sebelum di Urutkan : ");
        arr.display();

        System.out.println("Quick Sort : ");
        arr.QuickSort();
        arr.display();
    }
}
