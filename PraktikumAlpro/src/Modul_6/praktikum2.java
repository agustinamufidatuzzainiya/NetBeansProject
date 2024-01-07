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
import java.util.Arrays;
import javax.swing.*;

public class praktikum2 {
    public static void main(String[] args) {
        int data2 [][] = {{4,6,4,2,8,4,2,10},{4,6,4,2,8,4,2,10}};
        int dc [][] = Arrays.copyOf(data2, data2.length);
        for (int a = 0; a < data2.length; a++) {
            for (int b = 0; b < data2[0].length; b++) {
                System.out.print(data2[a][b]+" ");   
            
            }System.out.print("\n");
        }
        System.out.println(" ");
        System.out.println("a. Perulangan while dan do-while");
        System.out.println("While :");
        int i = 0;
        while (i<data2.length) {
            int j = 0;
            while (j<data2[0].length) {                
                System.out.print(data2[i][j]+ " ");
                j++;
            }i++;
            System.out.println();
        }System.out.println("Do While : ");
        int k = 0;
        do {            
            int l = 0;
            while (l<data2[0].length) {                
                System.out.print(data2[k][l]+" ");
                l++;
            }System.out.println();
            k++;
        } while (k<data2.length);
        
        double jumlah = 0;
        double rata = 0;
        double all = data2[0].length + data2[1].length;
        for (int y = 0; y < data2.length; y++) {
            for (int z = 0; z < data2[0].length; z++) {
                jumlah = jumlah += data2[y][z];
            }
            rata = jumlah / all;
        }
        System.out.println("");
        System.out.println("b. Menentukan nilai mean");
        System.out.println("Rata-rata = " + rata);
        
        int nilai,baru ;
        System.out.println("c. menambahkan perintah pencarian posisi index \ndan menukar dengan nilai baru");
        nilai =Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Yang Anda Cari "));
        
        System.out.println("\nNilai "+nilai+" berada pada = ");
        
        for (int x=0; x<data2.length; x++){
            for (int y = 0; y < data2[0].length; y++) 
            if (nilai ==data2 [x][y])
                System.out.println("Nilai "+nilai+" Baris ke-" + x + " Kolom ke-" + y);}
        
        baru = Integer.parseInt (JOptionPane.showInputDialog("Masukkan Nilai Baru "));
        System.out.println("\nNilai "+nilai+ " Dirubah Menjadi "+baru);
        System.out.println("Array setelah dirubah :");
        
        for (int b=0; b<dc.length; b++){
            for (int c = 0; c < dc[0].length; c++) {
            if (nilai ==dc[b][c]) 
            dc[b][c] = baru ;
            System.out.print(dc[b][c]+" ");
        }System.out.println();   
    }
        int genap = 0, jml = 0;
        for (int m = 0; m < dc.length; m++) {                
            for (int n = 0; n < dc[0].length; n++) {
                if (dc[m][n] %2 == 0){
                    genap = dc[m][n];
                    jml += genap;
                }
            }
             
        }
        System.out.println("");
            System.out.println("d. menjumlahkan seluruh element");
            System.out.println("Jumlah element di kolom genap = "+jml); 
            
    }
}
