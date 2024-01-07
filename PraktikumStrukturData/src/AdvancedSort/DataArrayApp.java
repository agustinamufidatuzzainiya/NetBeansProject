/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdvancedSort;

/**
 *
 * @author Agustina Mufidatuzzainiya - 210605110144
 */
public class DataArrayApp {
    public static void main(String[] args) {
        float maxSize = 100;
        DataArray arr;
        arr = new DataArray((int) maxSize);
        arr.insert(21650144, "Niya", "Gresik");
        arr.insert(21650135, "Abdillah", "Banyuwangi");
        arr.insert(21650128, "Nafiah", "Magetan");
        arr.insert(21650143, "Zidan", "Bawean");
        arr.insert(21650154, "Suci", "Bojonegoro");
        arr.insert(21650008, "Shafira", "Jombang");
        arr.insert(21650126, "Fauzan", "Sumatera Barat");
        arr.insert(21650145, "Awang", "Madura");

        System.out.println("Sebelum Sorting : ");
        arr.displayArray();
                                //Agustina Mufidatuzzainiya_210605110144
        System.out.println("Merge Sort Sorting berdasarkan Nama :");
        arr.mergeSort();
        arr.displayArray();

        System.out.println("Shell Sort Sorting berdasarkan NIM :");
        arr.ShellSort();
        arr.displayArray();

        System.out.println("Quick Sort berdasarkan Nama :");
        arr.QuickSort();
        arr.displayArray(); //Agustina Mufidatuzzainiya_210605110144
    }
}
