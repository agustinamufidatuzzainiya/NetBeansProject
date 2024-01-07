/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author niya
 */
public class GetInputFromKeyboard {
/*    
    //BufferedReader
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        System.out.println("Silahkan Masukkan Nama Anda: ");
        try{
            name = dataIn.readLine();
        }catch(IOException e){
            System.out.println("error");
        }
        System.out.println("Hallo "+name+"... Anda berhasil membuatnya!!");
    }
*/
    public static void main(String[] args) {
        String name = "";
        name = JOptionPane.showInputDialog("please, input your name");
        String msg = "Hello "+name+" !";
        JOptionPane.showMessageDialog(null, msg);
    }
}
