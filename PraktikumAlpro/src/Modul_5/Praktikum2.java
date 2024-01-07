/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_5;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author niya
 */
public class Praktikum2 {
    public static void main(String[] args) {
        int[] data = new int[10];
        int[] data2 = Arrays.copyOf(data, data.length);
        double jml = 0.0;
        int max; int min; int a;
        
        System.out.println("===== Soal 2a =====");
        for(a = 0; a < data.length; a++){
            data[a] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Elemen "+
                    "index ke- "+a));
            System.out.println("Index ke- "+a+" adalah "+data[a]);
            jml += data[a];
        }
        System.arraycopy(data,0,data2,0,data.length);
        java.util.Arrays.sort(data);
        min = data[0];
        max = data[data.length-1];
        for(a=0; a < data.length; a++){
            if(data2[a] <= min){
                min = data2[a];
                System.out.println("Nilai Minimal ="+min+", Elemen "
                        + "dari index ke- "+a);
            }
        }
        for(a=0; a < data.length; a++){
            if(data2[a] >= max){
                max = data2[a];
                System.out.println("Nilai Maksimal ="+max+", Elemen dari index ke- "+a);
            }
        }
        System.out.println("===== Soal 2b =====");
        System.out.println("Mean = "+(jml/data.length));
        
        System.out.println("===== Soal 2c =====");
        int angka = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai yang anda cari: "));
        for(a=0; a<data.length; a++){
            if(angka == data[a]){
                System.out.println("Nilai "+angka+" merupakan elemen dari index ke- "+a);
            }
        }
        int angkanew = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai baru: "));
        System.out.println("Nilai "+angka+" dirubah menjadi "+angkanew);
        System.out.println("array setelah dirubah: ");     
        for(a=0; a<data.length; a++){
            if(angka == data[a]){
                data2[a] = angkanew;
            }
                System.out.println("Index ke- "+a+" adalah"+data2[a]);
            }
        }
    }
