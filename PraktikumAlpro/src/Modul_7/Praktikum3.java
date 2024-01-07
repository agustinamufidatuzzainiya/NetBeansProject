/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_7;

import javax.swing.JOptionPane;

/**
 *
 * @author Agustina Mufidatuzzainiya_210605110144
 */
public class Praktikum3 {
    public static void main(String[] args) {
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tinggi"));
        int d = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Alas"));
        int e = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jari-Jari"));
        
        System.out.println("Segitiga : ");
        System.out.println("Alas : "+d);
        System.out.println("Tinggi : "+c);
        System.out.println("Luas : "+luas_segitiga(c, d));
        System.out.println("~~~~~~~~~~~~~~~");
        System.out.println("Persegi Panjang : ");
        System.out.println("Panjang : "+a);
        System.out.println("Lebar : "+b);
        System.out.println("Luas : "+luas_pp(a, b));
        System.out.println("~~~~~~~~~~~~~~~");
        System.out.println("Lingkaran : ");
        System.out.println("Jari :"+e);
        System.out.println("Luas :" +luas_lingkaran(e));
        
    }

    private static double luas_pp (int p, int l){
        int luas = p*l;
        return luas;
    }
    
    private static double luas_segitiga (int a, int t){
        double luas = (a*t)/2;
        return luas;
    }
    
    private static double luas_lingkaran (int jari){
        double luas = Math.PI*Math.pow(jari, 2);
        return luas;
    }
}
