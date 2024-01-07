/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_8;

/**
 *
 * @author Agustina Mufidatuzzainiya_210605110144
 */
import javax.swing.*;
import java.awt.*;
public class Praktikum2 extends JFrame{
    public static void main(String[] args) {
        Praktikum2 mt = new Praktikum2();
        mt.objek();

    }
    TextField txt = new TextField();
    Button bt1 = new Button("1");
    Button bt2 = new Button("2");
    Button bt3 = new Button("3");
    Button bt4 = new Button("+");
    Button bt5 = new Button("4");
    Button bt6 = new Button("5");
    Button bt7 = new Button("6");
    Button bt8 = new Button("-");
    Button bt9 = new Button("7");
    Button bt10 = new Button("8");
    Button bt11 = new Button("9");
    Button bt12 = new Button("*");
    Button bt13 = new Button("0");
    Button bt14 = new Button("C");
    Button bt15 = new Button("=");
    Button bt16 = new Button("/");
    Praktikum2() {
        setTitle("Design Preview");
        setLocationRelativeTo(null);
        setSize(190, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
   public void objek () {
        getContentPane().setLayout(null);
        getContentPane().add(txt);
        getContentPane().add(bt1);
        getContentPane().add(bt2);
        getContentPane().add(bt3);
        getContentPane().add(bt4);
        getContentPane().add(bt5);
        getContentPane().add(bt6);
        getContentPane().add(bt7);
        getContentPane().add(bt8);
        getContentPane().add(bt9);
        getContentPane().add(bt10);
        getContentPane().add(bt11);
        getContentPane().add(bt12);
        getContentPane().add(bt13);
        getContentPane().add(bt14);
        getContentPane().add(bt15);
        getContentPane().add(bt16);
       
        txt.setBounds(10, 10, 150, 25);
        bt1.setBounds(10, 40, 30, 20);
        bt2.setBounds(50, 40, 30, 20);
        bt3.setBounds(90, 40, 30, 20);
        bt4.setBounds(130, 40,30, 20);
        bt5.setBounds(10, 70, 30, 20);
        bt6.setBounds(50, 70, 30, 20);
        bt7.setBounds(90, 70, 30, 20);
        bt8.setBounds(130, 70,30, 20);
        bt9.setBounds(10, 100, 30, 20);
        bt10.setBounds(50, 100, 30, 20);
        bt11.setBounds(90, 100, 30, 20);
        bt12.setBounds(130, 100,30, 20);
        bt13.setBounds(10, 130, 30, 20);
        bt14.setBounds(50, 130, 30, 20);
        bt15.setBounds(90, 130, 30, 20);
        bt16.setBounds(130, 130,30, 20);

    }
   public void colour (){
       bt14.setBackground(Color.yellow);
       bt4.setBackground(Color.pink);
       bt8.setBackground(Color.orange);
       bt12.setBackground(Color.green);
       bt15.setBackground(Color.magenta);
       bt16.setBackground(Color.cyan);
   }
}
