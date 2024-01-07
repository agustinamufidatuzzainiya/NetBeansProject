/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author niya
 */
public class Array_Tugas1 {

    public static void main(String[] args) {
        int A [] = {1, 2, 3, 4};
        int B [] = {30, 55, 70, 100};
        int C [] = new int [4];

        //Menjumlahkan jumlah elemen dari masing-masing matriks
        int x = 0;
        int y = 0;
        for (int num : A) {
            x += num;
        }
        for (int num : B) {
            y += num;
        }
        System.out.println("matriks A = " + x);
        System.out.println("matriks B = " + y);
        
        //Menghitung hasil penjumlahan matriks A dan B
        System.out.print("penjumlahan matriks A dan B = ");
        for (int i = 0; i < B.length; i++) {
            C[i] = A[i] + B[i];
            System.out.print(C[i] + ", ");
        }
        System.out.println("");
        
        //Menghitung hasil dari perkalian matriks A dengan 2
        System.out.print("perkalian matriks A dengan 2 = ");
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] * 2;
            System.out.print(C[i] + ",");
        }
        System.out.println("");
    }
}

