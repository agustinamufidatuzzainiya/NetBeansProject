/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_7;

/**
 *
 * @author Agustina Mufidatuzzainiya_210605110144
 */
public class Prak1_SegiEmpat {
    public void segiempat(int panjang, int lebar) {
        double luas;
        double keliling;
        luas = panjang*lebar;
        System.out.println("=======================");
        System.out.println("Panjang Segi Empat = "+panjang);
        System.out.println("Lebar Segi Empat = "+lebar);
        System.out.println("Luas Segi Empat = "+luas);
    }
    public static void main(String[] args) {
        Prak1_SegiEmpat se = new Prak1_SegiEmpat();
        se.segiempat(10,5);
    }
}
