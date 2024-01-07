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
import javax.swing.*;
public class praktikum4 {
    public static void main(String[] args) {
        int data1 [][] = {{2,9},{1,5}};
        int data2 [][] = {{5,17},{10,4}};
        for (int i = 0; i < data1.length; i++) {
            for (int j = 0; j < data1[0].length; j++) {
                System.out.print(data1[i][j]+"\t");
            }System.out.println();
        }System.out.println();
        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[0].length; j++) {
                System.out.print(data2[i][j]+"\t");
            }System.out.println();
        }
        
        int nilai =Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Yang Anda Cari "));
        for (int x=0; x<data1.length; x++){
            for (int y = 0; y < data1[0].length; y++) 
            if (nilai ==data1 [x][y])
                System.out.println("Nilai "+nilai+" di matriks 1 "+"Baris ke-" + x + " Kolom ke-" + y);}
        for (int x=0; x<data2.length; x++){
            for (int y = 0; y < data2[0].length; y++) 
            if (nilai ==data2 [x][y])
                System.out.println("Nilai "+nilai+" di matriks 2 "+"Baris ke-" + x + " Kolom ke-" + y);}
        System.out.println("Hasil penjumlahan 2 matriks : ");
        int jml [][] = new int[data1.length][data1[0].length];
        for (int i = 0; i < jml.length; i++) {
            for (int j = 0; j < jml[0].length; j++) {
                jml [i][j] = data1[i][j] + data2[i][j];
            }
        }
        for (int i = 0; i < jml.length; i++) {
            for (int j = 0; j <jml[0].length; j++) {
                System.out.print(jml[i][j]+"\t");
            }System.out.println();
        }
        
    }
    
}
