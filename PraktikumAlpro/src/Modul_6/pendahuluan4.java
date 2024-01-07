/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_6;

import javax.swing.JOptionPane;

/**
 *
 * @author niya
 */
public class pendahuluan4 {
    public static void main(String[] args) {
        int nilai[][] = {{4,6,4,7,8,3,2,10},
                        {4,6,4,2,8,8,2,10}};
        int a = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Array yang diinginkan"));
        
        for(int b = 0; b < nilai.length; b++){
            for(int c = 0; c < nilai[b].length; c++){
                if(nilai[b][c] == a){
                    System.out.println("Nilai : "+a+" Baris ke-"+b+" kolom ke-"+c);
                }
            }
        }
    }
}
