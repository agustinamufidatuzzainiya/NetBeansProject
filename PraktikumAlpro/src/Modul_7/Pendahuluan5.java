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
public class Pendahuluan5 {
    public static void main(String[] args){
        String ch = "Nihongo Mantappu";
        int x = 8, y = 2;
        int d = 12, e = 3;
        akun();
        channel(ch);
        nilai(x,y);
        nilai2(d,e);
    }
    static void akun(){
        System.out.println("Pemilik akun bernama Jerome Polin");
    }
    static String channel(String nama){
        System.out.println("Channel : "+nama);
        return nama;
    }
    static double nilai(double x, double y){
        double hasil = x*y;
        System.out.println("Perkalian "+x+" * "+y+" = "+hasil);
        return hasil;
    }
    static int nilai2(int d, int e){
        int hasil = d+e;
        System.out.println("Penjumlahan "+d+" + "+e+" = "+hasil);
        return hasil;
    }
}
