/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Agustina Mufidatuzzainiya_210605110144
 */
public class Fil extends JFrame {
    JTextArea nama = new JTextArea(10, 10);
    JButton bt = new JButton("Copy");
    JTextArea txname = new JTextArea(10, 10);
    
    Fil(){
        super("INI ADALAH  FORM");
        setLocation(200, 300);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    void tampilan(){
        getContentPane().add(nama);
        nama.append("nama kamu siapa");
        getContentPane().add(bt);
        getContentPane().add(txname);
        txname.setBackground(Color.LIGHT_GRAY);
        bt.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                txname.append(nama.getSelectedText());
            }
        });
        getContentPane().setLayout(new FlowLayout());
        setVisible(true);
    }
    public static void main(String[] args) {
        Fil f = new Fil();
        f.tampilan();
    }
}
