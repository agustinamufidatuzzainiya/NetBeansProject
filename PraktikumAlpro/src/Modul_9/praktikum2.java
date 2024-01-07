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
public class praktikum2 extends JFrame{
    public static void main(String[] args) {
        praktikum2 mt = new praktikum2();
        mt.objek();
        mt.aksi();
    }
    Float tmp1,tmp2;
    String opr;
    JTextField txt = new JTextField(16);
    JButton bt1 = new JButton("1");
    JButton bt2 = new JButton("2");
    JButton bt3 = new JButton("3");
    JButton bt4 = new JButton("+");
    JButton bt5 = new JButton("4");
    JButton bt6 = new JButton("5");
    JButton bt7 = new JButton("6");
    JButton bt8 = new JButton("-");
    JButton bt9 = new JButton("7");
    JButton bt10 = new JButton("8");
    JButton bt11 = new JButton("9");
    JButton bt12 = new JButton("*");
    JButton bt13 = new JButton("0");
    JButton bt14 = new JButton("C");
    JButton bt15 = new JButton("=");
    JButton bt16 = new JButton("/");
    praktikum2() {
        setTitle("Design Priview");
        setLocationRelativeTo(null);
        setSize(210, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
   public void objek () {
        getContentPane().setLayout(new FlowLayout());
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
        setVisible(true);
    }
   void aksi (){
       
       bt1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (txt.getText().equals("0")) {
           txt.setText("");   
       }
                txt.setText(txt.getText()+"1");
            }
        });
       bt2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (txt.getText().equals("0")) {
           txt.setText("");   
       }
                txt.setText(txt.getText()+"2");
            }
        });
       bt3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (txt.getText().equals("0")) {
           txt.setText("");   
       }
                txt.setText(txt.getText()+"3");
            }
        });
       bt5.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (txt.getText().equals("0")) {
           txt.setText("");   
       }
                txt.setText(txt.getText()+"4");
            }
        });
       bt6.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (txt.getText().equals("0")) {
           txt.setText("");   
       }
                txt.setText(txt.getText()+"5");
            }
        });
       bt7.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (txt.getText().equals("0")) {
           txt.setText("");   
       }
                txt.setText(txt.getText()+"6");
            }
        });
       bt9.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (txt.getText().equals("0")) {
           txt.setText("");   
       }
                txt.setText(txt.getText()+"7");
            }
        });
       bt10.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (txt.getText().equals("0")) {
           txt.setText("");   
       }
                txt.setText(txt.getText()+"8");
            }
        });
       bt11.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (txt.getText().equals("0")) {
           txt.setText("");   
       }
                txt.setText(txt.getText()+"9");
            }
        });
       bt13.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                txt.setText(txt.getText()+"0");
            }
        });
       bt4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               tmp1 = Float.valueOf(txt.getText());
               txt.setText("0");
               opr = "+";
            }
        });
       bt8.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               tmp1 = Float.valueOf(txt.getText());
               txt.setText("0");
               opr = "-";
            }
        });
       bt12.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               tmp1 = Float.valueOf(txt.getText());
               txt.setText("0");
               opr = "*";
            }
        });
       bt14.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               txt.setText("0");
            }
        });
       bt16.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               tmp1 = Float.valueOf(txt.getText());
               txt.setText("0");
               opr = "/";
            }
        });
       bt15.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               tmp2 = Float.valueOf(txt.getText());
               if (opr.equals("+")) {
               tmp1 = tmp1 + tmp2;
                txt.setText(String.valueOf(tmp1));
               } else if (opr.equals("-")) {
                   tmp1 = tmp1 - tmp2;
                   txt.setText(String.valueOf(tmp1));
                }else if (opr.equals("*")) {
                   tmp1 = tmp1 * tmp2;
                   txt.setText(String.valueOf(tmp1));
                }else if (opr.equals("/")) {
                   tmp1 = tmp1 / tmp2;
                   txt.setText(String.valueOf(tmp1));
                }
            }
        });
   }
}
