/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_4;

import javax.swing.JOptionPane;

/**
 *
 * @author niya
 */
public class Point5A {
    public static void main(String[] args) {
        String angka = JOptionPane.showInputDialog("Masukkan Angka yang Anda Inginkan: ");
        System.out.println("Output 1");
        int n = Integer.parseInt(angka);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            } 
                System.out.print("\t");
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            } 
                System.out.print("\t");
                System.out.println("");  
        } 
    }
}
