/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author niya
 */
public class Point3B_switch {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nilai;

        try {
            System.out.print("Masukkan angka 1-10: ");
            nilai = Integer.valueOf(br.readLine());
        switch(nilai) {
            case 1:
                System.out.println("SATU");
                break;
            case 2:
                System.out.println("DUA");
                break;
            case 3:
                System.out.println("TIGA");
                break;
            case 4:
                System.out.println("EMPAT");
                break;
            case 5:
                System.out.println("LIMA");
                break;
            case 6:
                System.out.println("ENAM");
                break;
            case 7:
                System.out.println("TUJUH");
                break;
            case 8:
                System.out.println("DELAPAN");
                break;
            case 9:
                System.out.println("SEMBILAN");
                break;
            case 10:
                System.out.println("SEPULUH");
                break;
            default:
                System.out.println("Invalid Number!!");
                break;
            }
        } catch(IOException eox){
            System.out.println("Error");
        }
    }
}
