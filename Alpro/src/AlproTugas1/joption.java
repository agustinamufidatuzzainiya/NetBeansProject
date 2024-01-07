package AlproTugas1;

import javax.swing.*;
class joption {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Nama: ");
        String nim = JOptionPane.showInputDialog("NIM: ");
        String makna = JOptionPane.showInputDialog("Arti dan Makna Nama: ");
        String ttl = JOptionPane.showInputDialog("TTL: ");
        String motto = JOptionPane.showInputDialog("Motto Hidup: ");
        
        javax.swing.JOptionPane.showMessageDialog(null, "Nama   : "+nama+"\nNIM : "+nim+"\nArti dan Makna Nama  : "+makna+"\nTTL    : "+ttl+"\nMotto Hidup  : "+motto );
    }
}