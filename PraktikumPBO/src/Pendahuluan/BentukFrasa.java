/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pendahuluan;

/**
 *
 * @author niya
 */
public class BentukFrasa {
    public static void main(String[] args) {
        //membuat 3 kumpulan kata-kata untuk dipilih
        String[] listKataSatu = { "rumah", "sepeda", "ayam", "jam", "baju", "mobil",
            "laptop", "smartphone"};
        String[] listKataDua = { "canggih", "nyaman", "enak", "terbaru", "besar", "hitam",
            "mobil", "luas"};
        String[] listKataTiga = { "itu", "di atas", "milikmu", "miliknya", "di toko", "mobil",
            "baru", "putih"};
        
        //cari berapa banyak kata di setiap list
        int length1 = listKataSatu.length;
        int length2 = listKataDua.length;
        int length3 = listKataTiga.length;
        
        //men-generate 3 kata random di list
        int a = (int) (Math.random()*length1);
        int b = (int) (Math.random()*length2);
        int c = (int) (Math.random()*length3);
        
        //membangun sebuah frasa
        String frasa = listKataSatu[a]+" "+listKataDua[b]+ " "+listKataTiga[c];
        
        //mencetak frasa
        System.out.println("Saya menginginkan sebuah " + frasa);}
    }
    
