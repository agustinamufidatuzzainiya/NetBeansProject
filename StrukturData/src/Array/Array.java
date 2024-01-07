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
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int A [] = {1,2,3,4};
        int B [] = {30,55,70,100};
        int C [] = new int[4];
        int jumlah_A = 0;
        int jumlah_B = 0;
        
        //menghitung penjumlahan matriks A dan matriks B
        for (int i=0; i<B.length; i++){
            C[i] = A[i]+B[i]; 
            System.out.print(C[i]+",");
        }
        System.out.println();
        
        //menghitung perkalian matriks A dikali 2
        for (int i=0; i<A.length; i++){
            C[i] = A[i]*2; 
            System.out.print(C[i]+",");
        }
        System.out.println();
        
        //menghitung jumlah total dari elemen matriks A dan B
        for (int i=0; i<A.length; i++){
            jumlah_A += A[i];
            jumlah_B += B[i];
        }
        System.out.println(jumlah_A);
        System.out.println(jumlah_B);
    } 
}
