/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Agustina Mufidatuzzainiya_210605110144
 */
public class Prak1_HitungVolume {
    public static void main(String[] args) {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        try {
            //Volume Tabung
            System.out.print("Tinggi Tabung : ");
            int t=Integer.parseInt(input.readLine());
            System.out.print("Diameter tabung : ");
            int diameter=Integer.parseInt(input.readLine());
            Prak1_HitungVolume d=new Prak1_HitungVolume();
            d.Volume_Tabung(diameter,t);
            
            //Volume Kerucut
            System.out.println("*********************");
            System.out.print("Tinggi kerucut : ");
            t=Integer.parseInt(input.readLine());
            System.out.print("Diameter kerucut : ");
            diameter=Integer.parseInt(input.readLine());
            d.Volume_Kerucut(diameter,t);
            
            //Volume Bola
            System.out.println("*********************");
            System.out.print("Diameter Bola : ");
            diameter=Integer.parseInt(input.readLine());
            d.Volume_Bola(diameter,t);
        } catch (Exception e) {
            System.out.println("Data Error");
        }
    }
  private double Volume_Tabung (int diameter, int t){
        int jari2=diameter/2;
        double volume=Math.PI*Math.pow(jari2, 2)*t;
        System.out.println("Volume tabung = "+volume);
        return volume;
    }
    private double Volume_Kerucut (int diameter, int t){
        int jari2=diameter/2;
        double volume=Math.PI*Math.pow(jari2, 2)*t*1/3;
        System.out.println("Volume Kerucut = "+volume);
        return volume;
    }
    private double Volume_Bola (int diameter, int t){
        int jari2=diameter/2;
        double volume=4/3*Math.PI*Math.pow(jari2, 3);
        System.out.println("Volume bola = "+volume);
        return volume;
    }  
}
