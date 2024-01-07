/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author niya
 */
public class Pendahuluan4 {
    /*public static void main(String[] args) throws IOException {
        //menggunakan bufferedreader
            System.out.println("Menggunakan BufferedReader");
            System.out.println("==========================");
        
            BufferedReader dataAngka = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Menghitung Penjumlahan: ");
            System.out.print("Masukkan nilai a: ");
            String str1 = dataAngka.readLine();
            System.out.print("Masukkan nilai b: ");
            String str2 = dataAngka.readLine();
            int a = Integer.parseInt(str1);
            int b = Integer.parseInt(str2);
            int hasil = a+b;
            System.out.println("Hasil a + b = "+hasil);
        }
    }*/

    public static void main(String[] args) {
        //menggunakan JOptionPane
        int a;
        int b;
        int hasil;
        a = Integer.parseInt(JOptionPane.showInputDialog("Input Nilai A"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Input Nilai B"));
        hasil = a+b;
        JOptionPane.showMessageDialog((null),"Angka a = "+a+"\nAngka b= "+b+"\nHasil a + b = "+hasil);
    }
}