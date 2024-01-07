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
public class Pendahuluan6 {
    public static void main(String[] args) {
        tampil(1);
    }
    static void tampil(int nomor){
        if(nomor <=5){
            System.out.println("Nomor: "+nomor);
            tampil(1+nomor);
        }
    }
}
