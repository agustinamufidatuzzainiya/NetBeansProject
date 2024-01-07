/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_3;

import java.util.Scanner;

/**
 *
 * @author niya
 */
public class Pendahuluan3 {
    public static void main(String[] args) {
        //Logika If
        System.out.println("1. Statement If");
        System.out.println("===============");
        
        int nilai;
        Scanner scan = new Scanner(System.in);
        System.out.print("Tinggi Badan: ");
        nilai = scan.nextInt();
        if(nilai>155){
            System.out.println("Selamat, Anda LOLOS!!");
            System.out.println("");
        }
        
        //Logika If-Else
        System.out.println("2. Statement If-Else");
        System.out.println("====================");
        
        int targetnilai;
        String nama;
        scan = new Scanner(System.in);
        
        System.out.print("Nama: ");
        nama = scan.nextLine();
        System.out.print("Nilai: ");
        nilai = scan.nextInt();
        
        if(nilai>=75){
            System.out.println("Selamat, Anda dinyatakan lulus!");
        }else{
            System.out.println("Mohon Maaf dan Tetap Semangat!!");
        }
        System.out.println("");
        
        //Logika If-Ele-If
        System.out.println("3. Statement If-Else-If");
        System.out.println("=======================");
        
        int x;
        scan = new Scanner(System.in);
        System.out.print("nilai x: ");
        x = scan.nextInt();
        
        if(x == 1){
            System.out.print("nilai x = 1");
        } else if (x == 2){
            System.out.print("nilai x = 2");
        }else if (x == 3){
            System.out.print("nilai x = 3");
        }else{
            System.out.println("nilai x tidak diketahui");
        }
        System.out.println("");
        
        //Logika If-Else-If-Else
        System.out.println("4. Statement If-Else-If-Else");
        System.out.println("============================");
        int nilaimu;;
        String grade;
        scan = new Scanner(System.in);
        
        System.out.print("Inputkan nilai anda: ");
        nilaimu = scan.nextInt();
        
        if(nilaimu >= 90){
            grade = "A";
        }else if (nilaimu >=80){
            grade = "B+";
        }else if (nilaimu >=75){
            grade = "B";
        }else if (nilaimu >=65){
            grade = "C+";
        }else if (nilaimu >=53){
            grade = "C";
        }else if (nilaimu >=47){
            grade = "D";
        }else{
            grade = "E";
        }
        System.out.println("Grade: "+grade);
        System.out.println("");
        
        //Logika Switch-Case
        System.out.println("5. Statement Switch-Case");
        System.out.println("========================");
        String buku;
        scan = new Scanner(System.in);
        
        System.out.print("Inputkan nama penulis: ");
        buku = scan.nextLine();
        
        switch(buku){
            case "rintik sedu":
                System.out.println("Geez dan Ann");
                break;
            case "Tere Liye":
                System.out.println("Matahari");
                break;
            default:
                System.out.println("Book not found!");
        }
    }
}
