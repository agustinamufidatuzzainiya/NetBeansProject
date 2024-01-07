/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author niya
 */
public class Prak2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String nilai1 = null;
        String nilai2 = null;
        String nilai3 = null;
        
        try {
            System.out.print("Nilai 1 : ");
            nilai1 = br.readLine();
            System.out.print("Nilai 2 : ");
            nilai2 = br.readLine();
            System.out.print("Nilai 3 : ");
            nilai3 = br.readLine();
            System.out.println("Nilai yang diinputkan adalah : "+nilai1+", "+nilai2+", "+nilai3);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
