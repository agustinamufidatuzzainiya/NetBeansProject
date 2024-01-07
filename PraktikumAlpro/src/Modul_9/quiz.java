/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_9;

/**
 *
 * @author Agustina Mufidatuzzainiya_210605110144
 */
import java.util.*;
//perintah Pernyataan IfElseBerrtingkat
public class quiz {
    public static void main(String[] args) {
        int income;
        double jasa, komisi, total;
        Scanner input = new Scanner(System.in);
        System.out.print("Income Sales = Rp.");
        income = input.nextInt();
        
        //jika pendapatan <= 200.0000 
        if (income >= 0 && income <= 200000) {
            jasa = 10000;           //sales mendapatkan uang jasa 10.000
            komisi = 0.1*income;    //dan juga komisi 10% dari pendapatannya
        }
        
        //jika pendapatan >= 200.000 akan tetapi <= 500.000
        else if(income >= 200000 && income <= 500000) {
            jasa = 20000;          //sales mendapatkan uang jasa 20.000
            komisi = 0.15*income;   // dan juga komisi 15% dari pendapatannya
        }
        
        //jika pendapatan >= 500.000
        else  {
            jasa = 30000;           //sales memperoleh uang jasa 30.000
            komisi = 0.2*income;    //dan juga komisi 20% dari pendapatannya
        }
        total = komisi + jasa;
        System.out.println("\nUang Jasa Rp = Rp." + (int)jasa);
        System.out.println("Uang Komisi Rp = Rp." + (int)komisi);
        System.out.println("=========================");
        System.out.println("Total Uang = Rp." + (int)total);
    }
}
