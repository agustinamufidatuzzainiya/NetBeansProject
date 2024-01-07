package Laundry;

import Code.*;                   //mengakses class yang berada di dalam package Code
import java.util.Date;           //mengakses class date
import javax.swing.JOptionPane;  //mengakses jendela dialog

public class formulir extends javax.swing.JFrame {
    double total,berat,harga;  //instance Variable

    //Default Constructor
    public formulir() {
        super ("Menu Order");
        initComponents();
        setLocationRelativeTo(null);
        
        //mendapatkan tanggal dan waktu sekarang
        Date time = new Date();
        Tanggal.setText("Laundry Masuk : "+time.toString());

    }
    
    //Method Void
    //Output
    public void cetak(){
        TextArea1.setEditable(false);
        TextArea1.setText(" ====================  Laundry  ==================== " + "\n"
                        + "    Jln. Raya Candi V No. 138 Karangbesuki Malang    " + "\n"
                        + "       Buka : Setiap Hari || 09.00 - 19.00 WIB       " + "\n"
                        + " =================================================== " + "\n"
                        + " Nama            : " + Nama.getText() + "\n"
                        + " No Telp         : " + Telp.getText() + "\n"
                        + " Alamat          : " + Alamat.getText() + "\n"
                        + " Jenis Laundry   : " + Jenis_laundry.getSelectedItem() + "\n"
                        + " Berat Laundry   : " + Berat.getText() + "\n"
                        + " Total Harga     : " + Total_harga.getText() + "\n"
                        + " Uang Dibayarkan : " + Dibayar.getText() + "\n"
                        + " Uang Kembalian  : " + Kembalian.getText() + "\n"
                        + Tanggal.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Alamat = new javax.swing.JTextField();
        Telp = new javax.swing.JTextField();
        Berat = new javax.swing.JTextField();
        Jenis_laundry = new javax.swing.JComboBox<>();
        Harga_perkilo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Jumlah_pakaian = new javax.swing.JTextField();
        Total_harga = new javax.swing.JTextField();
        Dibayar = new javax.swing.JTextField();
        Kembalian = new javax.swing.JTextField();
        hapus = new javax.swing.JButton();
        kembali = new javax.swing.JButton();
        transaksi = new javax.swing.JButton();
        cetak = new javax.swing.JButton();
        selesai = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tanggal = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nama");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jLabel2.setText("Alamat");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 20));
        getContentPane().add(Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 150, -1));

        jLabel3.setText("No Telp");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, 20));

        jLabel4.setText("Jenis Laundry");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));

        jLabel5.setText("Harga Perkilo(Rp)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel6.setText("Berat (Kg)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel8.setText("Jumlah Pakaian");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel9.setText("Total Harga");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        jLabel10.setText("Uang Yang Dibayar");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        Alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlamatActionPerformed(evt);
            }
        });
        getContentPane().add(Alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 400, -1));

        Telp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelpActionPerformed(evt);
            }
        });
        getContentPane().add(Telp, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 150, -1));

        Berat.setText("0");
        Berat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeratActionPerformed(evt);
            }
        });
        getContentPane().add(Berat, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 140, 110, -1));

        Jenis_laundry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Jenis Laundry", "Cuci Kering (CK)", "Cuci Kering Setrika (CKS)", "Setrika Saja (S)" }));
        Jenis_laundry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jenis_laundryActionPerformed(evt);
            }
        });
        getContentPane().add(Jenis_laundry, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 80, 110, -1));
        getContentPane().add(Harga_perkilo, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 110, 110, -1));

        jLabel11.setText("Uang Kembalian");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));
        getContentPane().add(Jumlah_pakaian, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 170, 110, -1));

        Total_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Total_hargaActionPerformed(evt);
            }
        });
        getContentPane().add(Total_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 80, 120, -1));
        getContentPane().add(Dibayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 110, 120, -1));

        Kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembalianActionPerformed(evt);
            }
        });
        getContentPane().add(Kembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 140, 120, -1));

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        getContentPane().add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        kembali.setText("Kembali");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, -1, -1));

        transaksi.setText("Transaksi");
        transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaksiActionPerformed(evt);
            }
        });
        getContentPane().add(transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 100, -1));

        cetak.setText("Cetak");
        cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakActionPerformed(evt);
            }
        });
        getContentPane().add(cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 70, -1));

        selesai.setText("Selesai");
        selesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selesaiActionPerformed(evt);
            }
        });
        getContentPane().add(selesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, -1, -1));

        TextArea1.setColumns(20);
        TextArea1.setRows(5);
        jScrollPane1.setViewportView(TextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 390, 230));

        Tanggal.setColumns(20);
        Tanggal.setRows(5);
        jScrollPane2.setViewportView(Tanggal);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 300, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Formulir.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakActionPerformed
        cetak();
    }//GEN-LAST:event_cetakActionPerformed

    private void selesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selesaiActionPerformed
        JOptionPane.showMessageDialog(null, "Terima Kasih "+Nama.getText()+" telah mempercayai layanan ini");
        
        System.exit(0);
    }//GEN-LAST:event_selesaiActionPerformed

    private void AlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlamatActionPerformed

    private void Jenis_laundryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jenis_laundryActionPerformed
        if(Jenis_laundry.getSelectedIndex()==1){
            CuciKering ck = new CuciKering();
            ck.setHargalaundry("3000");
            Harga_perkilo.setText(ck.getHargalaundry());
        }else if(Jenis_laundry.getSelectedIndex()==2){
            CuciKeringSetrika cks = new CuciKeringSetrika();
            cks.setHargalaundry("4000");
            Harga_perkilo.setText(cks.getHargalaundry());
        }else if(Jenis_laundry.getSelectedIndex()==3){
            SetrikaSaja ss = new SetrikaSaja();
            ss.setHargalaundry("2000");
            Harga_perkilo.setText(ss.getHargalaundry());
        }else {
            Harga_perkilo.setText("0");
        }
//        harga=Double.parseDouble(Harga_perkilo.getText());
//        Total_harga.setText(String.valueOf(harga*Berat));
    }//GEN-LAST:event_Jenis_laundryActionPerformed

    private void BeratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeratActionPerformed
        harga = Double.parseDouble(Harga_perkilo.getText());
        berat = Double.parseDouble(Berat.getText());
        total = harga*berat;
        Total_harga.setText(String.valueOf(total));
    }//GEN-LAST:event_BeratActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        //mereset inputan
        Nama.setText(" ");
        Alamat.setText(" ");
        Telp.setText(" ");
        Jenis_laundry.setSelectedItem("Pilih Jenis Laundry");
        Harga_perkilo.setText(" ");
        Berat.setText("0");
        Jumlah_pakaian.setText(" ");
        Total_harga.setText(" ");
        Dibayar.setText(" ");
        Kembalian.setText(" ");
    }//GEN-LAST:event_hapusActionPerformed

    private void transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiActionPerformed
        double bayar, kembalian;     //Lokal Variabel
        bayar = Double.parseDouble(Dibayar.getText());
        total=Double.parseDouble(Total_harga.getText());
        kembalian=bayar-total;
        Kembalian.setText(String.valueOf(kembalian));
    }//GEN-LAST:event_transaksiActionPerformed

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        halaman_utama hu1 = new halaman_utama();
        hu1.show();
        dispose();
    }//GEN-LAST:event_kembaliActionPerformed

    private void Total_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Total_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Total_hargaActionPerformed

    private void TelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelpActionPerformed

    private void KembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KembalianActionPerformed

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
            java.util.logging.Logger.getLogger(formulir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat;
    private javax.swing.JTextField Berat;
    private javax.swing.JTextField Dibayar;
    private javax.swing.JTextField Harga_perkilo;
    private javax.swing.JComboBox<String> Jenis_laundry;
    private javax.swing.JTextField Jumlah_pakaian;
    private javax.swing.JTextField Kembalian;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextArea Tanggal;
    private javax.swing.JTextField Telp;
    private javax.swing.JTextArea TextArea1;
    private javax.swing.JTextField Total_harga;
    private javax.swing.JButton cetak;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton kembali;
    private javax.swing.JButton selesai;
    private javax.swing.JButton transaksi;
    // End of variables declaration//GEN-END:variables
}
