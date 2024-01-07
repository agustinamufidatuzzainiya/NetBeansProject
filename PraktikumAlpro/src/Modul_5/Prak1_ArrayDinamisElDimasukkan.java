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
public class Prak1_ArrayDinamisElDimasukkan {
    public static void main(String[] args) {
        int data[] = new int[10];
        for(int a = 0; a < data.length; a++){
            data[a] = Integer.parseInt(JOptionPane.showInputDialog("Masukan element index ke "+a));
            System.out.println("Index ke "+a+" adalah "+data[a]);
        }
    }
}
