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
public class Pendahuluan1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nama;
        String Jurusan;
        
        try {
            System.out.print("Input nama anda: ");
            nama = br.readLine();
            System.out.print("Input jurusan anda: ");
            Jurusan = br.readLine();
            System.out.println("====================");
            System.out.println("Nama anda: "+nama);
            System.out.println("Jurusan anda: "+Jurusan);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
