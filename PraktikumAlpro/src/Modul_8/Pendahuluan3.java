/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_8;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Agustina Mufidatuzzainiya_210605110144
 */
public class Pendahuluan3 {
    public static void main(String[] args) {
        //Container
        JFrame form = new JFrame("Design");
        // mengatur fungsi close form -> posisi pojok kanan atas
        form.setSize(273,420);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // agar form di tengah
        form.setLocationRelativeTo(null);
        //mengatur form secara manual
        form.setLayout(null);
        // menampilkan form
        form.setVisible(true);
        
        
       // component 
       Label lb1 = new Label ("Masukkan Angka Pertama :");
       lb1.setBounds(50,18,175,48);
       form.add(lb1);
       
       TextField txt1 = new TextField();
       txt1.setBounds(78, 55, 120, 30);
       form.add(txt1);
       
       Label lb2 = new Label ("Masukkan Angka Kedua:");
       lb2.setBounds(60,90,180,50);
       form.add(lb2);
       
       TextField txt2 = new TextField();
       txt2.setBounds(80, 130, 120, 30);
       form.add(txt2);
       
       Label lb3 = new Label ("Masukkan Angka Pertama :");
       lb3.setBounds(60,160,180,50);
       form.add(lb3);
       
       TextField txt3 = new TextField();
       txt3.setBounds(80, 200, 120, 30);
       form.add(txt3);
       
       Button plus = new Button("+");
       //plus.setText("+");
       plus.setBounds(40, 245, 50, 32);
       form.add(plus);
       
       Button minus = new Button ("-");
       //minus.setText("-");
       minus.setBounds(115, 245, 50, 32);
       form.add(minus);
       
       Button bagi = new Button ("/");
       //bagi.setText("/");
       bagi.setBounds(190, 245, 50, 32);
       form.add(bagi);
       
       Button kali = new Button ("*");
    //   kali.setText(" \n *");
       kali.setBounds(115, 290, 50, 32);
       form.add(kali);
    }
}
