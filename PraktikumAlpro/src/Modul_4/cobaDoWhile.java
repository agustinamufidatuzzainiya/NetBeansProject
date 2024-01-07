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
public class cobaDoWhile {
    public static void main(String[] args) {
        double r = 0;
        do {
            r = Math.random();
            System.out.println(r);
        }
        while(r < 0.99d);
    }
}
