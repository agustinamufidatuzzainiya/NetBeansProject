/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UTSLogika.java
 *
 * Created on Apr 16, 2014, 1:44:01 PM
 */
package UTS;

/**
 *
 * @author Robby Al Wahab13
 */
public class UTSLogika extends javax.swing.JFrame {
    double nilaistd1,nilai1;
    double nilaistd2,nilai2;
    double nilaistd3,nilai3;
    double nilaistd4,nilai4;
    double nilaistd5,nilai5;
    double nilaistd6,nilai6;
    double nilaistd7,nilai7;
    double nilaistd8,nilai8;
    

    /** Creates new form UTSLogika */
    public UTSLogika() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtStdAlgoritma1 = new javax.swing.JTextField();
        txtap1 = new javax.swing.JTextField();
        txtstdalgoritma2 = new javax.swing.JTextField();
        txtap2 = new javax.swing.JTextField();
        txtstdbasisdata = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtbasisdata = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtstdstrukturdata = new javax.swing.JTextField();
        txtstrukturdata = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtstdpti = new javax.swing.JTextField();
        txtptik = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtstdkomdat = new javax.swing.JTextField();
        txtkomdat = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtstdsistemoperasi = new javax.swing.JTextField();
        txtso = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtstdmetodologi = new javax.swing.JTextField();
        txtmp = new javax.swing.JTextField();
        LblKeterangan = new javax.swing.JLabel();
        lblhasil = new javax.swing.JLabel();
        btncek = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Standart Penilaian");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel1.setText("Aplikasi Standart Nilai Kelulusan pada Fakultas Ilmu Komputer");

        jLabel2.setText("Nama Mata Kuliah");

        jLabel3.setText("Standart Nilai ");

        jLabel4.setText("Nilai Sekarang");

        jLabel5.setText("Algoritma dan Pemograman I");

        jLabel6.setText("Algoritma dan Pemograman II");

        txtStdAlgoritma1.setEditable(false);
        txtStdAlgoritma1.setText("60");

        txtstdalgoritma2.setEditable(false);
        txtstdalgoritma2.setText("60");
        txtstdalgoritma2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstdalgoritma2ActionPerformed(evt);
            }
        });

        txtstdbasisdata.setEditable(false);
        txtstdbasisdata.setText("60");
        txtstdbasisdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstdbasisdataActionPerformed(evt);
            }
        });

        jLabel7.setText("Basis Data");

        jLabel8.setText("Struktur Data");

        txtstdstrukturdata.setEditable(false);
        txtstdstrukturdata.setText("60");

        jLabel9.setText("Pengantar Tek. Informasi");

        txtstdpti.setEditable(false);
        txtstdpti.setText("60");

        jLabel10.setText("Komunikasi data & Jaringan");

        txtstdkomdat.setEditable(false);
        txtstdkomdat.setText("60");

        jLabel11.setText("Sistem Operasi");

        txtstdsistemoperasi.setEditable(false);
        txtstdsistemoperasi.setText("60");

        jLabel12.setText("Metodologi Penelitian");

        txtstdmetodologi.setEditable(false);
        txtstdmetodologi.setText("60");

        LblKeterangan.setText("Keterangan");

        lblhasil.setText("Hasil");

        btncek.setText("Cek");
        btncek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncekActionPerformed(evt);
            }
        });

        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnkeluar.setText("Keluar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(LblKeterangan)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblhasil)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtstdmetodologi)
                                            .addComponent(txtstdsistemoperasi)
                                            .addComponent(txtstdkomdat)
                                            .addComponent(txtstdbasisdata)
                                            .addComponent(txtstdstrukturdata)
                                            .addComponent(txtstdpti, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                            .addComponent(txtstdalgoritma2)
                                            .addComponent(txtStdAlgoritma1)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btncek, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtmp)
                                        .addComponent(txtso)
                                        .addComponent(txtkomdat)
                                        .addComponent(jLabel4)
                                        .addComponent(txtstrukturdata)
                                        .addComponent(txtbasisdata)
                                        .addComponent(txtap2)
                                        .addComponent(txtap1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                        .addComponent(txtptik))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtStdAlgoritma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtap1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtstdalgoritma2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtap2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtstdbasisdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbasisdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtstrukturdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtstdstrukturdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(8, 8, 8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtptik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtstdpti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel10))
                    .addComponent(txtstdkomdat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtkomdat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtstdsistemoperasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addComponent(txtso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtstdmetodologi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblKeterangan)
                    .addComponent(lblhasil))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncek)
                    .addComponent(btnhapus)
                    .addComponent(btnkeluar))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtstdalgoritma2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstdalgoritma2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstdalgoritma2ActionPerformed

    private void txtstdbasisdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstdbasisdataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstdbasisdataActionPerformed

    private void btncekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncekActionPerformed
        // TODO add your handling code here:
    nilaistd1 = Double.parseDouble(txtStdAlgoritma1.getText());
        nilaistd2 = Double.parseDouble(txtstdalgoritma2.getText());
        nilaistd3 = Double.parseDouble(txtstdbasisdata.getText());
        nilaistd4 = Double.parseDouble(txtstdstrukturdata.getText());
        nilaistd5 = Double.parseDouble(txtstdpti.getText());
        nilaistd6 = Double.parseDouble(txtstdkomdat.getText());
        nilaistd7 = Double.parseDouble(txtstdsistemoperasi.getText());
        nilaistd8 = Double.parseDouble(txtstdmetodologi.getText());
        nilai1 = Double.parseDouble(txtap1.getText());
        nilai2 = Double.parseDouble(txtStdAlgoritma1.getText());
        nilai3 = Double.parseDouble(txtap2.getText());
        nilai4 = Double.parseDouble(txtbasisdata.getText());
        nilai5 = Double.parseDouble(txtstrukturdata.getText());
        nilai6 = Double.parseDouble(txtptik.getText());
        nilai7 = Double.parseDouble(txtso.getText());
        nilai8 = Double.parseDouble(txtmp.getText());
        
         if(nilai1 < nilaistd1 || nilai2 < nilaistd2 || nilai3 < nilaistd3 || nilai4 < nilaistd4 || nilai5 < nilaistd5|| nilai6 < nilaistd6 || nilai7 < nilaistd7|| nilai8 < nilaistd8){
            lblhasil.setText("Maaf Anda Tidak Lulus Sesuai Standart");
        }
        else if (nilai1 >= nilaistd1 || nilai2 >= nilaistd2 || nilai3 >= nilaistd3 || nilai4 >= nilaistd4 || nilai5 >= nilaistd5|| nilai6 >= nilaistd6 || nilai7 >= nilaistd7|| nilai8 >= nilaistd8){
            lblhasil.setText("Selamat anda Lulus Sesuai Standart");
        }
        
    }//GEN-LAST:event_btncekActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnhapusActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UTSLogika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UTSLogika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UTSLogika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UTSLogika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new UTSLogika().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblKeterangan;
    private javax.swing.JButton btncek;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblhasil;
    private javax.swing.JTextField txtStdAlgoritma1;
    private javax.swing.JTextField txtap1;
    private javax.swing.JTextField txtap2;
    private javax.swing.JTextField txtbasisdata;
    private javax.swing.JTextField txtkomdat;
    private javax.swing.JTextField txtmp;
    private javax.swing.JTextField txtptik;
    private javax.swing.JTextField txtso;
    private javax.swing.JTextField txtstdalgoritma2;
    private javax.swing.JTextField txtstdbasisdata;
    private javax.swing.JTextField txtstdkomdat;
    private javax.swing.JTextField txtstdmetodologi;
    private javax.swing.JTextField txtstdpti;
    private javax.swing.JTextField txtstdsistemoperasi;
    private javax.swing.JTextField txtstdstrukturdata;
    private javax.swing.JTextField txtstrukturdata;
    // End of variables declaration//GEN-END:variables
}
