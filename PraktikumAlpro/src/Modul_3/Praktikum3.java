package Modul_3;

import javax.swing.JOptionPane;

public class Praktikum3 {
    public static void main(String[] args) {
        String penjualan = JOptionPane.showInputDialog("Masukkan Hasil Penjualan: ");
        int jual = Integer.parseInt(penjualan);
        double bonus = 0;
        
        if(jual == 2000000) {
            bonus = (0.1*jual) + 100000;
        } else if (jual > 2000000 && jual < 5000000){
            bonus = (0.15*jual) + 200000;
        } else if (jual > 5000000){
            bonus = (0.2*jual) + 300000;
        } else {
            JOptionPane.showMessageDialog(null, "Salesnya tidak memperoleh komisi");
        }
        JOptionPane.showMessageDialog(null, "Komisi yang didapat: Rp. " + bonus);
    }
}
