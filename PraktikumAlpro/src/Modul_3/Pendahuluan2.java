/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_3;

import javax.swing.JOptionPane;

/**
 *
 * @author niya
 */
public class Pendahuluan2 {
    public static void main(String[] args) {
        String nama = "";
        int umur;
        nama = JOptionPane.showInputDialog("Masukkan Nama Anda: ");
        umur = Integer.parseInt(JOptionPane.showInputDialog("Umur: "));
        JOptionPane.showMessageDialog(null, "Nama = " + nama + "\nUsia = " + umur + " tahun");
    }
}
