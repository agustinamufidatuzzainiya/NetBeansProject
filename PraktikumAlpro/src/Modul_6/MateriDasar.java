/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_6;

/**
 *
 * @author niya
 */
public class MateriDasar {
    int[][] A = {{3,7,5},{2,8,6}};
    public void cetak(){
        System.out.println(" Matriks A: ");
        for(int i=0; i<A.length;i++){
            for(int j =0;j<A[0].length;j++)
            System.out.println(A[i][j]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        MateriDasar jm = new MateriDasar();
        jm.cetak();
    }
}
