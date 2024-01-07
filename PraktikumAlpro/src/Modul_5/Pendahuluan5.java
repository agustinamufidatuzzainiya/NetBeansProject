/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_5;

/**
 *
 * @author niya
 */
public class Pendahuluan5 {
    public static void main(String[] args){
        int data[] = {4, 6, 4, 2, 8, 4, 2, 11};
        int c = 0;
        int d = 0;
        
        System.out.println("====== FOR ======");
        for(int i = 0; i < data.length; i++){
            System.out.println("Data ke: "+i+" Index: "+data[i]);
        } 
        System.out.println("===== WHILE =====");
        while(c < data.length){
            System.out.println("Data ke: "+c+" Index: "+data[c]);
            c++;
        }
        System.out.println("==== DoWhile ====");
        do{
            System.out.println("Data ke: "+d+" Index: "+data[d]);
            d++;
        }
        while(d < data.length);
    }
}
