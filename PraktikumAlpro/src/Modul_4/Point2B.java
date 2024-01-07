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
public class Point2B {
    public static void main(String[] args){
        int a,b,c;
        a=5;
        b=4; 
        c=1;
        for (int i = 1; i <= a; i++) {
            c*=i;
        }
        a=c;
        System.out.println("5! = "+a);
        
        c=1;
        for (int i = 1; i <= b; i++) {
            c*=i;
        }
        b=c;
        System.out.println("4! = "+b);
        System.out.println("5! + 4! = " + (c+a));
    }
}
