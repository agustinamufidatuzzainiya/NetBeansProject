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
public class Point2C {
    public static void main(String[] args){ 
        int a=4;
        int b=5;
        double c=5;
        double d=4;
        for (int e = 1; e < 2; e++) {
            a*=4;
        }
        //System.out.println(g);
        for (int f = 1; f < 2; f++) {
            d*=4;
        }
        //System.out.println(j);
        System.out.println("(4^2+5^1)/5+4^2 = "+((a+b)/c+d));
    }
}
