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
//Praktikum 1
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class prak1_aksiReaksi extends JFrame {
    JTextArea nama = new JTextArea(10,10);
    JButton bt = new JButton("Copy");
    JTextArea txnama = new JTextArea(10,10);
    prak1_aksiReaksi(){
        super("Coba Event Handling");
        setLocation(200,300);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    void tampilan(){
        getContentPane().add(nama);
        nama.append("nama kamu siapa?");
        getContentPane().add(bt);
        getContentPane().add(txnama);
        txnama.setBackground(Color.LIGHT_GRAY);
        getContentPane().setLayout(new FlowLayout());
        setVisible(true);
    }
    void aksiReaksi(){
        bt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txnama.append(nama.getSelectedText());
            }
        });
    }
    public static void main(String[] args) {
        prak1_aksiReaksi f = new prak1_aksiReaksi();
        f.tampilan();
        f.aksiReaksi();
    }
}
