/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_8;

/*//GUI dengan FlowLayout
import javax.swing.*;
import java.awt.*;
class praktikum1 extends JFrame{
    Button cb1 = new Button ("Pilih A");
    Button cb2 = new Button ("PIlih B");
    praktikum1(){
        setTitle("Program GUI pertamaku");
        setLocation(200,100);
        setSize(200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void objek(){
        getContentPane().setLayout(new FlowLayout());
        getContentPane().setBackground(Color.GREEN);
        cb1.setBackground(Color.MAGENTA);
        getContentPane().add(cb1);
        getContentPane().add(cb2);
        setVisible(true);
    }
    public static void main(String[] args){
        praktikum1 ZZ = new praktikum1();
        ZZ.objek();
    }
}*/

//GUI dengan null layout
import javax.swing.*;
import java.awt.*;
class praktikum1 extends JFrame{
    Checkbox cb1 = new Checkbox("Pilih A");
    Checkbox cb2 = new Checkbox("Pilih B");
    Checkbox cb3 = new Checkbox("Pilih C");
    praktikum1 (){
        setTitle("Program GUI pertamaku");
        setLocation(200,100);
        setSize(400,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void objek(){
        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.GREEN);
        getContentPane().add(cb1);
        getContentPane().add(cb2);
        getContentPane().add(cb3);
        cb1.setBounds(30,90,150,20);
        cb2.setBounds(30,120,150,20);
        cb3.setBounds(30,150,150,20);
        setVisible(true);
    }
    public static void main(String[] args) {
        praktikum1 ZZ = new praktikum1 ();
        ZZ.objek();
    }
}
