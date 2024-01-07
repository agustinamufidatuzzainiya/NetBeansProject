/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author niya
 */

public class Praktikum4_Genap {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long nim;
        try {
            System.out.print("Masukkan NIM: ");
            nim = Long.valueOf(br.readLine());
            if(nim %2 == 0){
                System.out.println("NIM genap");
            } else {
                System.out.println("NIM ganjil"); 
            } 
        } catch(IOException eox) {
                    System.out.println("Error");
                    }
  }
}


/*import javax.swing.JOptionPane;
public class praktikum4_Ganjil {
public static void main(String[] args) {
        long a = Long.parseLong(JOptionPane.showInputDialog("Masukkan Angka: "));
        if(a%2 !=0){
            JOptionPane.showMessageDialog(null, a+", Nilai Ganjil");
        } else {
            JOptionPane.showMessageDialog(null, a+", Nilai Genap");
        }
    }
}*/