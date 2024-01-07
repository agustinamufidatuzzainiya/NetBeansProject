package Modul_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Praktikum2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nilai1 = 20;
        int nilai2 = 12;
        int nilai3 = 3;
        
        int max, min = 0;
        
        if (nilai1 > nilai2 && nilai1 > nilai3) {
            max = nilai1;
        } else if (nilai2 > nilai1 && nilai2 > nilai3) {
            max = nilai2;
        } else {
            max = nilai3;
        }
        
        if (nilai1 < nilai2 && nilai1 < nilai3) {
            min = nilai1;
        } else if (nilai2 < nilai1 && nilai2 < nilai3) {
            min = nilai2;
        } else {
            min = nilai3; }

        System.out.println("Nilai Pertama: " + nilai1); // menampilkan pesan nilai1
        System.out.println("Nilai Kedua: " + nilai2); // menampilkan pesan nilai2
        System.out.println("Nilai Ketiga: " + nilai3); // menampilkan pesan nilai3
        System.out.println("Nilai-nilai yang dimasukkan = "+nilai1+", "+nilai2+", "+nilai3); // menampilkan seluruh nilai yang dimasukkkan        
        System.out.println("==========");
        System.out.println("Nilai Max: " + max);
        System.out.println("Nilai Min: " + min); 
    }
}