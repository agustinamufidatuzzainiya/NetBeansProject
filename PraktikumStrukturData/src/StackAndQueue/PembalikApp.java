/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackAndQueue;

import java.util.Scanner;

/**
 *
 * @author niya
 */
public class PembalikApp {
    public static void main(String[] args) {
        Pembalik pembalik;// variable object
        Scanner input = new Scanner(System.in);

        //a
         /*String kata = "kasur";
         pembalik = new Pembalik(kata);
         System.out.println(">> Katanya...\n\t" + kata);
         System.out.println(">> dibalik jadi...\n\t" + pembalik.getTerbalik());
*/
        // b
        while (true) {
            System.out.print("Masukkan kata: ");
            String inputkata = input.nextLine();

            pembalik = new Pembalik(inputkata);

            System.out.println("Kebalikan: " + pembalik.getTerbalik());
        }
    }
}
