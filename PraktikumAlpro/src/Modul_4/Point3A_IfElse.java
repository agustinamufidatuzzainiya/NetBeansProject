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
public class Point3A_IfElse {
    public static void main(String[]args){
        String bil = JOptionPane.showInputDialog("Masukkan Angka 1-10");
        int nilai = Integer.parseInt(bil);
        String bilangan = "";
        
        if(nilai == 1){
            bilangan = "SATU";
        }
        else if(nilai == 2){
            bilangan = "DUA";
        }
        else if(nilai == 3){
            bilangan = "TIGA";
        }
        else if(nilai == 4){
            bilangan = "EMPAT";
        }
        else if(nilai == 5){
            bilangan = "LIMA";
        }
        else if(nilai == 6){
            bilangan = "ENAM";
        }
        else if(nilai == 7){
            bilangan = "TUJUH";
        }
        else if(nilai == 8){
            bilangan = "DELAPAN";
        }
        else if(nilai == 9){
            bilangan = "SEMBILAN";
        }
        else if(nilai == 10){
            bilangan = "SEPULUH";
        }
        else {
            bilangan = "Invalid Number!!";
        }
        JOptionPane.showMessageDialog(null, bilangan);
    }
}
