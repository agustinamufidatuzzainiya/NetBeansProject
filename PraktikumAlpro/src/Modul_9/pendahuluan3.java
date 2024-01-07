/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_9;

/**
 *
 * @author Agustina Mufidatuzzainiya_210605110144
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class pendahuluan3 extends JFrame {
    JLabel lb1 = new JLabel("Masukkan Angka Pertama");
        JTextField txt1 = new JTextField(15);
        JLabel lb2 = new JLabel("Masukkan Angka Kedua");
        JTextField txt2 = new JTextField(15);
        JLabel lb3 = new JLabel("Hasil");
        JTextField txt3 = new JTextField(15);
        
        JButton btnplus = new JButton("+");
        JButton btnmins = new JButton("-");
        JButton bagi = new JButton("/");
        JButton kali = new JButton("*");
        
        pendahuluan3 (){
        setTitle("Design");
        setLocation(200,100);
        setSize(190, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void objek (){
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(lb1);
        getContentPane().add(txt1);
        getContentPane().add(lb2);
        getContentPane().add(txt2);
        getContentPane().add(lb3);
        getContentPane().add(txt3);
        getContentPane().add(btnplus);
        getContentPane().add(btnmins);
        getContentPane().add(bagi);
        getContentPane().add(kali);
        setVisible(true);
    }
    void aksi (){
        btnplus.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
            int a,b,c;
            a = Integer.parseInt(txt1.getText());
            b = Integer.parseInt(txt2.getText());
            c = a+b;
            txt3.setText(String.valueOf(c));
        }
    });
    btnmins.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e){
            int a,b,c;
            a = Integer.parseInt(txt1.getText());
            b = Integer.parseInt(txt2.getText());
            c = a-b;
            txt3.setText(String.valueOf(c));
        }
    });
    bagi.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e){
            int a,b,c;
            a = Integer.parseInt(txt1.getText());
            b = Integer.parseInt(txt2.getText());
            c = a/b;
            txt3.setText(String.valueOf(c));
        }
    });
    kali.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e){
            int a,b,c;
            a = Integer.parseInt(txt1.getText());
            b = Integer.parseInt(txt2.getText());
            c = a*b;
            txt3.setText(String.valueOf(c));
        }
    });
    }
    public static void main(String[] args){
        pendahuluan3 p = new pendahuluan3();
        p.objek();
        p.aksi();
    }
}
