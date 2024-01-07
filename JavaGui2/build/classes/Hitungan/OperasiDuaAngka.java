/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * OperasiDuaAngka.java
 *
 * Created on Jun 15, 2011, 7:27:49 PM
 */
package Hitungan;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Robby_Alwahab
 */
public class OperasiDuaAngka extends javax.swing.JFrame {

    /** Creates new form OperasiDuaAngka */
    public OperasiDuaAngka() {
        initComponents();
         Dimension screenSize = 
            Toolkit.getDefaultToolkit().getScreenSize();
            Dimension frameSize = this.getSize();
            if (frameSize.height > screenSize.height) {
                frameSize.height = screenSize.height;
            }
            if (frameSize.width > screenSize.width) {
                frameSize.width = screenSize.width;
            }
            this.setLocation(
                    (screenSize.width - frameSize.width) / 2, 
                    (screenSize.height - frameSize.height) / 2); 
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TxtNilai1 = new javax.swing.JTextField();
        TxtNilai2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TxtHasil = new javax.swing.JTextField();
        BtnKurang = new javax.swing.JButton();
        BtnTambah = new javax.swing.JButton();
        BtnKali = new javax.swing.JButton();
        BtnBagi = new javax.swing.JButton();
        BtnExit = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Operasi Dua Angka");
        setBackground(new java.awt.Color(0, 255, 255));
        setForeground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operasi Dua Angka", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        TxtNilai1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNilai1KeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel1.setText("=");

        BtnKurang.setText("Kurang");
        BtnKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKurangActionPerformed(evt);
            }
        });

        BtnTambah.setText("Tambah");
        BtnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTambahActionPerformed(evt);
            }
        });

        BtnKali.setText("Kali");
        BtnKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKaliActionPerformed(evt);
            }
        });

        BtnBagi.setText("Bagi");
        BtnBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBagiActionPerformed(evt);
            }
        });

        BtnExit.setText("Exit");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });

        BtnHapus.setText("Hapus");
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TxtNilai1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(TxtNilai2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addComponent(TxtHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnKurang)
                        .addGap(18, 18, 18)
                        .addComponent(BtnKali, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnHapus)
                        .addGap(16, 16, 16)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNilai1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtNilai2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnExit)
                    .addComponent(BtnBagi)
                    .addComponent(BtnKali)
                    .addComponent(BtnKurang)
                    .addComponent(BtnTambah))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_BtnExitActionPerformed

    private void TxtNilai1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNilai1KeyTyped
      char c = evt.getKeyChar();
      if (! ((Character.isDigit(c) ||
              (c == KeyEvent.VK_BACK_SPACE) ||
              (c == KeyEvent.VK_DELETE))
              )){
          getToolkit().beep();
          JOptionPane.showMessageDialog(null,"Masukan Angka 0-9 aja");
          evt.consume();
      }
    }//GEN-LAST:event_TxtNilai1KeyTyped

    private void BtnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTambahActionPerformed
      double hasil = Double.parseDouble(TxtNilai1.getText()) + Double.parseDouble(TxtNilai2.getText());
     TxtHasil.setText(String.valueOf(hasil));
    }//GEN-LAST:event_BtnTambahActionPerformed

    private void BtnKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKurangActionPerformed
      double hasil = Double.parseDouble(TxtNilai1.getText()) - Double.parseDouble(TxtNilai2.getText());
     TxtHasil.setText(String.valueOf(hasil));
    }//GEN-LAST:event_BtnKurangActionPerformed

    private void BtnKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKaliActionPerformed
        double hasil = Double.parseDouble(TxtNilai1.getText()) * Double.parseDouble(TxtNilai2.getText());
     TxtHasil.setText(String.valueOf(hasil));
    }//GEN-LAST:event_BtnKaliActionPerformed

    private void BtnBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBagiActionPerformed
        double hasil = Double.parseDouble(TxtNilai1.getText()) / Double.parseDouble(TxtNilai2.getText());
     TxtHasil.setText(String.valueOf(hasil));
    }//GEN-LAST:event_BtnBagiActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
     TxtNilai1.setText("");
     TxtNilai2.setText("");
      TxtHasil.setText("");
     TxtNilai1.requestFocus();
    }//GEN-LAST:event_BtnHapusActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new OperasiDuaAngka().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBagi;
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnKali;
    private javax.swing.JButton BtnKurang;
    private javax.swing.JButton BtnTambah;
    private javax.swing.JTextField TxtHasil;
    private javax.swing.JTextField TxtNilai1;
    private javax.swing.JTextField TxtNilai2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}