/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_4;

/**
 *
 * @author niya
 */
public class Point2A {
    public static int pangkat2(int a) {
        int hasil = a*a;
        return hasil;
    }
    public static int pangkat3(int a) {
        int hasil = a*a*a;
        return hasil;
    }
    public static void main(String[] args) {
        int nilai1 = pangkat3(4);
        int nilai2 = pangkat2(5);
        int hasil = nilai1 + nilai2;
        System.out.println("Hasil 4^3 + 5^2 = " +hasil);
    }
}
