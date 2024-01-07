/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_7;

import java.io.*;
public class Prak1_InputConsole {
    public static String readString(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = " ";
        try{
            string = br.readLine();
        }catch(IOException ex){
            System.out.println(ex);
        }return string;
    }
    public static int readInt(){
        return Integer.parseInt (readString());
    }
    public static double readDouble(){
        return Double.parseDouble(readString());
    }
}
