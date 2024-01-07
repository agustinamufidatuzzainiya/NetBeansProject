/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import java.util.LinkedList;

/**
 *
 * @author niya
 */
public class Rabu_1_Ganjil {
    public static void main(String[] args) {
        LinkedList<String>printer= new LinkedList<>(); 
        printer.add("HP");
        printer.add("Canon");
        printer.add("Brother");
        printer.add("Panasonic");
        printer.add("Epson");
        printer.addFirst("Niya");
        printer.addLast("210605110144");
        printer.set(2, "Semangat");
        printer.set(5, "Kamu PastiBisa!");
      
        System.out.println("Nama Printer    : "+printer); 
        System.out.println("Jumlah Printer  : "+printer.size());
        System.out.println("Data Pertama    : "+printer.getFirst());
        System.out.println("Data Terakhir   : "+printer.getLast());
        System.out.println("Index ke 2      : "+printer.get(2));
        System.out.println("Index ke 5      : "+printer.get(5));
    }   
}
