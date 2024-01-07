/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tia;
import tia.Autofeeder;
import tia.lightLamp;
import tia.sensorPh;
import java.util.Scanner;
public class system{
    
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("== Pemindaian Menggunakan Sensor ==");
    sensorPh a = new sensorPh();
    a.setPH(Math.random());
        lightLamp b = new lightLamp();
    b.setLamp(Math.random());
        System.out.println("Ph Awal: " + a.getPh());
        System.out.println("Lampu\t: " + b.getLamp() + " %");
        System.out.println("\n== MELAKUKAN PENYESUAIAN PARAMETER ==");
    a.KondisiPh();
    b.Lampu();
        System.out.println("== Autofeeder ==");
        System.out.print("Jumlah Pakan\t= ");
        double x = input.nextDouble();
            System.out.print("Waktu pemberian\t= ");
        int y = input.nextInt();
            System.out.println(" ");
 
        Autofeeder c = new Autofeeder();
        c.setJumlah(x);
        c.setTime(y);
        c.rule_pakan();
    }
}