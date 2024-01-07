/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_4;

/**
 *
 * @author niya
 */
public class Pendahuluan2 {
    public static void main(String[] args) {
        System.out.print("Perulangan dengan for: ");
        for (int a=1; a <=10; a++){
            System.out.print(" "+a);
        }
        System.out.println("");
        System.out.print("Perulangan dengan while: ");
        int b = 1;
        while (b<=10){
            System.out.print(" "+b);
            b++;
        }
        System.out.println("");
        System.out.print("Perulangan dengan do while: ");
        int c = 1;
        {
            do{
            System.out.print(" "+c);
            c++;
        }while (c<=10);
    }
}}
