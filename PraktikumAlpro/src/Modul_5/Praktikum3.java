/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author niya
 */
public class Praktikum3 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
        System.out.print("a. Masukan jumlah data array : ");
        int n = Integer.parseInt(br.readLine());
        int[] data = new int[n];
        System.out.println("b. Masukan nilai element :");
        for(int i=0;i<data.length;i++){
            System.out.print("index "+i+" adalah ");
            data[i]=Integer.parseInt(br.readLine());
            
        }
        //Nilai maksimal dan minimal
        int max = data[0];
        int indexmax = 0;
        int min = data[0];
        int indexmin = 0; 
        double mean = 0;
        for(int i=0; i < data.length; i++){
            //Nilai maksimal
            if(data[i]>max){
                max=data[i];
                indexmax=i+1;
            }
            //Nilai minimal
            else if(data[i]<min){
                min=data[i];
                indexmin=i+1;
            }
            //Rata-rata
            mean+=data[i]; 
        }
        System.out.print("c. ");
        System.out.println("Nilai max = "+max+" di index "+indexmax);
        System.out.println("   Nilai min = "+min+" di index "+indexmin);
        System.out.println("d. Mean = "+mean+" Rata-rata = "+(mean/data.length));
            
        //Penjumlahan element yang memiliki indeks ganjil
        int hasil=0;    
        for(int i=0;i>data.length;i++){
            if(i%2 == 0){
                hasil+=data[i];
            }
        }
            System.out.println("e. Jumlah nilai dari index yang ganjil adalah "+hasil);
        
       //cek ganjil genap
       if(hasil%2==0){
           System.out.println("f. Jumlah dari index ganjil adalah bilangan ganjil");
       }else{
           System.out.println("f. Jumlah dari index ganjil adalah bilangan genap");
       }
       //Urutan element Array
        System.out.print("g. Urutan element Array : ");
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");     
        }
        System.out.println("");
            
        } catch (Exception e) {
            System.out.println("Error !!!");
        }
        
    }
}
