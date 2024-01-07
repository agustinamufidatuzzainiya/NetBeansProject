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
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class EventButtonKey extends JFrame {
    JButton m = new JButton("TEKAN KEY 1,2,3,4");
    JLabel tulisan = new JLabel("UKURAN FRAME AKAN BERUBAH");
    EventButtonKey() {
        setTitle("INI EVENT PADA BUTTON");
        setSize(400, 200);
        setLocation(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void komponen() {
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(m);
        getContentPane().add(tulisan);
        setVisible(true);
    }
    void reaksi() {
        m.addKeyListener(new KeyAdapter() {
           public void keyPressed(KeyEvent e) {
               if (e.getKeyCode()== e.VK_1) {
                   setSize(300, 500);
               }
               if (e.getKeyCode()== e.VK_2) {
                   setSize(200, 100);
               }
               if (e.getKeyCode()== e.VK_3) {
                   setSize(100, 10);
               }
               if (e.getKeyCode()== e.VK_4) {
                   setSize(900, 200);
               }
           } 
        });
    }
    public static void main(String[] args) {
        EventButtonKey eb = new EventButtonKey();
        eb.komponen();
        eb.reaksi();
    }
    
}
