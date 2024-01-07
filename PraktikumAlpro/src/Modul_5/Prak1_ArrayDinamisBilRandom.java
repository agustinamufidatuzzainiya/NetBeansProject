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
public class Prak1_ArrayDinamisBilRandom {
    public static void main(String[] args) {
        double[] contoh = new double[30];
        for (int i = 0; i < 30; i++)
            contoh[i] = 100.0*Math.random();
        double mean = 0.0;
        for (int i = 0; i < 30; i++)
            mean += contoh[1];
        mean /= 30;
        System.out.println("Mean 30 bilangan random: "+mean);
    }
}
