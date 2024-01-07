package Modul_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Praktikum1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nilai1, nilai2, nilai3;
        nilai1 = "";
        nilai2 = "";
        nilai3 = "";
        
        try
	{
            System.out.print("Masukkan Nilai Pertama: "); // melakukan input nilai1
            nilai1 = br.readLine();
            System.out.print("Masukkan Nilai Kedua: "); // melakukan input nilai2
            nilai2 = br.readLine();
            System.out.print("Masukkan Nilai Ketiga: "); // melakukan input nilai3
            nilai3 = br.readLine();
            
            System.out.println("===============================");
            System.out.println("Nilai Pertama: " + nilai1); // menampilkan pesan nilai1
            System.out.println("Nilai Kedua: " + nilai2); // menampilkan pesan nilai2
            System.out.println("Nilai Ketiga: " + nilai3); // menampilkan pesan nilai3
            System.out.println("Nilai-nilai yang dimasukkan = "+nilai1+", "+nilai2+", "+nilai3); // menampilkan seluruh nilai yang dimasukkkan
	}
	catch(IOException eox) // menangkap kesalahan
	{
		System.out.println("Error");
	}
    }
}