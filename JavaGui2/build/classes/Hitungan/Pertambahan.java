/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Pertambahan.java
 *
 * Created on Jun 4, 2011, 6:11:05 PM
 */
package Hitungan;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Robby_Alwahab
 */
public class Pertambahan extends javax.swing.JFrame {

    /** Creates new form Pertambahan */
    public Pertambahan() {
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
        jPanel2 = new javax.swing.JPanel();
        Angka1LB = new javax.swing.JLabel();
        txtangka1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Angka2LB = new javax.swing.JLabel();
        txtangka2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        HasilLB = new javax.swing.JLabel();
        txthasil = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        TambahBT = new javax.swing.JButton();
        HapusBT = new javax.swing.JButton();
        KeluarBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Pertambahan Dua Angka");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        Angka1LB.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Angka1LB.setText("Angka Pertama ");

        txtangka1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Angka1LB)
                .addGap(42, 42, 42)
                .addComponent(txtangka1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Angka1LB)
                    .addComponent(txtangka1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        Angka2LB.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        Angka2LB.setText("Angka Kedua");

        txtangka2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Angka2LB)
                .addGap(55, 55, 55)
                .addComponent(txtangka2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Angka2LB)
                    .addComponent(txtangka2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        HasilLB.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        HasilLB.setText("Hasil");

        txthasil.setEditable(false);
        txthasil.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HasilLB)
                .addGap(95, 95, 95)
                .addComponent(txthasil, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HasilLB)
                    .addComponent(txthasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        TambahBT.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        TambahBT.setText("Tambah");
        TambahBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahBTActionPerformed(evt);
            }
        });

        HapusBT.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        HapusBT.setText("Hapus");
        HapusBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusBTActionPerformed(evt);
            }
        });

        KeluarBT.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        KeluarBT.setText("Keluar");
        KeluarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(TambahBT)
                .addGap(65, 65, 65)
                .addComponent(HapusBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(KeluarBT)
                .addGap(41, 41, 41))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TambahBT)
                    .addComponent(KeluarBT)
                    .addComponent(HapusBT))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TambahBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahBTActionPerformed
        double angka1, angka2, hasil ;
        angka1 =Double.parseDouble(txtangka1.getText());
        angka2 =Double.parseDouble(txtangka2.getText());
        
        hasil = angka1 + angka2 ;
        
        txthasil.setText(hasil + " ");
        
        
     //  double hasil = Double.parseDouble(txtangka1.getText()) + Double.parseDouble(txtangka2.getText());
      // txthasil.setText(String.valueOf(hasil));
    }//GEN-LAST:event_TambahBTActionPerformed

    private void HapusBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusBTActionPerformed
       txtangka1.setText("");
       txtangka2.setText("");
       txthasil.setText("");
       txtangka1.requestFocus();
    }//GEN-LAST:event_HapusBTActionPerformed

    private void KeluarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarBTActionPerformed
        System.exit(0);
    }//GEN-LAST:event_KeluarBTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Pertambahan().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Angka1LB;
    private javax.swing.JLabel Angka2LB;
    private javax.swing.JButton HapusBT;
    private javax.swing.JLabel HasilLB;
    private javax.swing.JButton KeluarBT;
    private javax.swing.JButton TambahBT;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtangka1;
    private javax.swing.JTextField txtangka2;
    private javax.swing.JTextField txthasil;
    // End of variables declaration//GEN-END:variables
}
