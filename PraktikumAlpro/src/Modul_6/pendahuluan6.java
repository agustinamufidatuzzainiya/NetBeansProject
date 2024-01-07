/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_6;

/**
 *
 * @author niya
 */
public class pendahuluan6 {
    public static void main(String[] args) {
        float jumlah = 0, mean = 0, total = 0, jumlah1 = 0, jumlah2 = 0;
        int data[][] = {{4,6,4,7,8,3,2,10},{4,6,4,2,8,8,2,10}};
        
        total = data[0].length + data[1].length;
        for(int a = 0; a < data[0].length; a++){
            jumlah1 +=data[0][a];
        }
        for(int b = 0; b < data[1].length; b++){
            jumlah2 += data[1][b];
        }
        jumlah = jumlah1 + jumlah2;
        mean = jumlah/total;
        System.out.println("Jumlah total element adalah "+jumlah);
        System.out.println("Mean total Element adalah "+mean);
    } 
}
