package Modul_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Praktikum4{
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c, d;

        try {
            System.out.print("Masukkan Nilai Adi: ");
            a = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Nilai Budi: ");
            b = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Nilai Caca: ");
            c = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Nilai Deny: ");
            d = Integer.parseInt(br.readLine());
            System.out.println();
            
            System.out.println("==== Nilai Siswa ====");
            System.out.println("Nilai Adi: " + a);
            System.out.println("Nilai Budi: " + b);
            System.out.println("Nilai Caca: " + c);
            System.out.println("Nilai Deny: " + d);
            System.out.println();
            
            //percabangan nilai si adi
            System.out.println("======= Grade =======");
            if (a >= 36 && a <= 45){
                System.out.println("Grade Adi -> D");
            } else if (a >= 46 && a <= 55) {
                System.out.println("Grade Adi -> C");
            } else if (a >= 56 && a <= 65) {
                System.out.println("Grade Adi -> C+");
            } else if (a >= 66 && a <= 75) {
                System.out.println("Grade Adi -> B");
            } else if (a >= 76 && a <= 85) {
                System.out.println("Grade Adi -> B+");
            } else if (a >= 86 && a <= 100) {
                System.out.println("Grade Adi -> A");
            }
            
            //percabangan nilai si budi
            if (b >= 36 && b <= 45){
                System.out.println("Grade budi -> D");
            } else if (b >= 46 && b <= 55) {
                System.out.println("Grade budi -> C");
            } else if (b >= 56 && b <= 65) {
                System.out.println("Grade budi -> C+");
            } else if (b >= 66 && b <= 75) {
                System.out.println("Grade Budi -> B");
            } else if (b >= 76 && b <= 85) {
                System.out.println("Grade Budi -> B+");
            } else if (b >= 86 && b <= 100) {
                System.out.println("Grade Budi -> A");
            }
            
            //percabangan nilai si caca
            if (c >= 36 && c <= 45){
                System.out.println("Grade Caca -> D");
            } else if (c >= 46 && c <= 55) {
                System.out.println("Grade Caca -> C");
            } else if (c >= 56 && c <= 65) {
                System.out.println("Grade Caca -> C+");
            } else if (c >= 66 && c <= 75) {
                System.out.println("Grade Caca -> B");
            } else if (c >= 76 && c <= 85) {
                System.out.println("Grade Caca -> B+");
            } else if (c >= 86 && c <= 100) {
                System.out.println("Grade Caca -> A");
            }
            
            //percabangan nilai si deny
            if (d >= 36 && d <= 45){
                System.out.println("Grade Deny -> D");
            } else if (d >= 46 && d <= 55) {
                System.out.println("Grade Deny -> C");
            } else if (d >= 56 && d <= 65) {
                System.out.println("Grade Deny -> C+");
            } else if (d >= 66 && d <= 75) {
                System.out.println("Grade Deny -> B");
            } else if (d >= 76 && d <= 85) {
                System.out.println("Grade Deny -> B+");
            } else if (d >= 86 && d <= 100) {
                System.out.println("Grade Deny -> A");
            }
            System.out.println();
            
            System.out.println("== Nilai Max dan Min ==");
            //menentukan nilai maksimum
            if (a>b && a>c && a>d) {
                System.out.println("Nilai terbesar: Adi: " + a);
            } else if (b>a && b>c && b>d) {
                System.out.println("Nilai terbesar: Budi: " + b);
            } else if (c>a && c>b && c>d) {
                System.out.println("Nilai terbesar: Caca: " + c);
            } else if (d>a && d>b && d>c) {
                System.out.println("Nilai terbesar: Deny: " + d);   
            }
            
            //menentukan nilai minimum
            if (a<b && a<c && a<d) {
                System.out.println("Nilai terkecil: Adi: " + a);
            } else if (b<a && b<c && b<d) {
                System.out.println("Nilai terkecil: Budi: " + b);
            } else if (c<a && c<b && c<d) {
                System.out.println("Nilai terkecil: Caca: " + c);
            } else if (d<a && d<b && d<c) {
                System.out.println("Nilai terkecil: Deny: " + d);  
            }

        }
        catch(Exception e) {
            System.out.println("Error");
        }
    }
}
            