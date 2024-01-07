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
public class pendahuluan5 {

    public static void main(String[] args) {
        int data[][] = {{4, 6, 4, 7, 8, 3, 2, 10}, {4, 6, 4, 2, 8, 8, 2, 10}};
        System.out.println("\n===== Looping For =====");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.println("Element " + data[i][j] + " ada di index(" + i + "," + j + ")");
            }
            System.out.println("\b");
        }
        System.out.println("\n===== Looping While =====");
        int i = 0;
        while (i < data.length) {
            int j = 0;
            while (j < data[i].length) {
                System.out.println("Element " + data[i][j] + " ada di index(" + i + "," + j + ")");
                j++;
            }
            System.out.println("\b");
            i++;
        }
        System.out.println("\n===== Looping Do-While =====");
        i = 0;
        do {
            int j = 0;
            do {
                System.out.println("Element " + data[i][j] + " ada di index(" + i + "," + j + ")");
                j++;
            } while (j < data[i].length);
            System.out.println("\b");
            i++;
        } while (i < data.length);
    }
}
