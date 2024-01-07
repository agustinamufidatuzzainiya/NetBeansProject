/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_7;

/**
 *
 * @author niya
 */
public class Pendahuluan3 {
    public static void main(String[] args){
        int angka = 0;
        int hasil;
        try {
            int a = 8;
            hasil = angka/0;
            System.out.println(hasil);
        }
        catch(Exception eox) {
            System.out.println("Error!! Bilangan tidak boleh "
                    + "dibagi 0");
        }
        finally {
            System.out.println("Program selesai dijalankan :) ");
        }
    }
}
