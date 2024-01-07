/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_5;

import javax.swing.JOptionPane;

/**
 *
 * @author niya
 */
public class Pendahuluan4 {
    public static void main(String[] args){
        int data[] = {4, 6, 4, 2, 8, 4, 2, 11};
        String angka = JOptionPane.showInputDialog("Masukkan angka: ");
        int nilai = Integer.parseInt(angka);
        
        for(int i = 0; i < data.length; i++){
            if(nilai == data[i]){
                System.out.println("Angka "+angka+" index ke- "+i);
            }
        }
    }
}
