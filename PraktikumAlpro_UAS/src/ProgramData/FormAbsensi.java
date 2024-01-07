/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author niya
 */
public class FormAbsensi extends javax.swing.JFrame {

    public FormAbsensi() {
        initComponents();
        table();
    }
    
    void hapus(){
        txtnama.setText("");
        txtnim.setText("");
        txtkamar.setText("");
        txtnapen.setText("");
        txtmabna.setText("");
    }
    
    void cari(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Nama Mahasantri");
        tbl.addColumn("NIM");
        tbl.addColumn("Kamar");
        tbl.addColumn("Nama Pendamping");
        tbl.addColumn("Mabna");
        tbl.addColumn("Waktu");
        
        try {
            String sql = "SELECT * FROM fr_absensi WHERE nim like '%" + txtcari.getText() + "%'";
            Connection con = (Connection) koneksi.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()) {
                tbl.addRow(new Object[] {
                    rs.getString("nama"),
                    rs.getString("nim"),
                    rs.getString("kamar"),
                    rs.getString("nama_pendamping"),
                    rs.getString("mabna"),
                    rs.getString("waktu")
                });
                jTable1.setModel(tbl);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void table() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Nama Mahasantri");
        tbl.addColumn("NIM");
        tbl.addColumn("Kamar");
        tbl.addColumn("Nama Pendamping");
        tbl.addColumn("Mabna");
        tbl.addColumn("Waktu");
        
        try {
            Statement st = (Statement) koneksi.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM fr_absensi");
            
            while(rs.next()) {
                tbl.addRow(new Object[] {
                    rs.getString("nama"),
                    rs.getString("nim"),
                    rs.getString("kamar"),
                    rs.getString("nama_pendamping"),
                    rs.getString("mabna"),
                    rs.getString("waktu")
                });
                jTable1.setModel(tbl);
            }
            JOptionPane.showMessageDialog(null, "Koneksi Database Berhasil");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal" + e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txtnim = new javax.swing.JTextField();
        txtkamar = new javax.swing.JTextField();
        txtnapen = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btndel = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        rsubuh = new javax.swing.JRadioButton();
        rmaghrib = new javax.swing.JRadioButton();
        risya = new javax.swing.JRadioButton();
        btntampil = new javax.swing.JButton();
        btncari = new javax.swing.JButton();
        txtcari = new javax.swing.JTextField();
        txtmabna = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLabel2.setText("Presensi Jamaah");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(198, 27, 276, 48);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Mahasantri :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(44, 105, 120, 14);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NIM :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(44, 136, 50, 14);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kamar :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(44, 172, 70, 16);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nama Pendamping :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(44, 210, 120, 14);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mabna :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(44, 250, 60, 14);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Waktu Shalat Jamaah :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(44, 291, 140, 14);

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtnama);
        txtnama.setBounds(232, 103, 189, 30);

        txtnim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnimActionPerformed(evt);
            }
        });
        getContentPane().add(txtnim);
        txtnim.setBounds(232, 134, 189, 30);

        txtkamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkamarActionPerformed(evt);
            }
        });
        getContentPane().add(txtkamar);
        txtkamar.setBounds(232, 171, 189, 30);

        txtnapen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnapenActionPerformed(evt);
            }
        });
        getContentPane().add(txtnapen);
        txtnapen.setBounds(232, 208, 189, 30);

        btnsave.setText("Simpan");
        btnsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsaveMouseClicked(evt);
            }
        });
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave);
        btnsave.setBounds(50, 380, 80, 23);

        btndel.setText("Hapus");
        btndel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndelMouseClicked(evt);
            }
        });
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });
        getContentPane().add(btndel);
        btndel.setBounds(180, 380, 63, 23);

        btnedit.setText("Edit");
        btnedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneditMouseClicked(evt);
            }
        });
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        getContentPane().add(btnedit);
        btnedit.setBounds(410, 380, 51, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(12, 434, 651, 125);

        rsubuh.setText("Shubuh");
        rsubuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsubuhActionPerformed(evt);
            }
        });
        getContentPane().add(rsubuh);
        rsubuh.setBounds(300, 290, 90, 23);

        rmaghrib.setText("Maghrib");
        rmaghrib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmaghribActionPerformed(evt);
            }
        });
        getContentPane().add(rmaghrib);
        rmaghrib.setBounds(300, 320, 90, 23);

        risya.setText("Isya'");
        getContentPane().add(risya);
        risya.setBounds(300, 350, 90, 23);

        btntampil.setText("Tampil");
        btntampil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntampilMouseClicked(evt);
            }
        });
        btntampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntampilActionPerformed(evt);
            }
        });
        getContentPane().add(btntampil);
        btntampil.setBounds(300, 380, 80, 30);

        btncari.setText("Cari");
        btncari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncariMouseClicked(evt);
            }
        });
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });
        getContentPane().add(btncari);
        btncari.setBounds(490, 340, 51, 23);

        txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcariActionPerformed(evt);
            }
        });
        getContentPane().add(txtcari);
        txtcari.setBounds(490, 380, 170, 30);
        getContentPane().add(txtmabna);
        txtmabna.setBounds(230, 250, 190, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/image32.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, -10, 680, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnimActionPerformed

    private void txtkamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkamarActionPerformed

    private void txtnapenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnapenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnapenActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsaveActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void rsubuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsubuhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rsubuhActionPerformed

    private void btntampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntampilActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btntampilActionPerformed

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcariActionPerformed

    private void btnsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaveMouseClicked
        // TODO add your handling code here:
        String ws = null;
        
        if (rsubuh.isSelected()){
            ws = "Shubuh";
        }else if (rmaghrib.isSelected()){
            ws = "Maghrib";
        }else if (risya.isSelected()) {
            ws = "Isya";
        }
        
        try {
            String sql = "INSERT INTO fr_absensi VALUES ('" + txtnama.getText() + "','"
                    + txtnim.getText()+ "', '" + txtkamar.getText() + "','" + txtnapen.getText() + "','" 
                    + txtmabna.getText() + "','" + ws + "')";
            Connection con = (Connection) koneksi.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Berhasil Menyimpan");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menyimpan" + e.getMessage());
        }
    }//GEN-LAST:event_btnsaveMouseClicked

    private void btntampilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntampilMouseClicked
        // TODO add your handling code here:
        try {
            String sql = "SELECT * FROM fr_absensi WHERE nama ='" + txtnama.getText() + "'";
            Connection con = (Connection) koneksi.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        table();
        hapus();
    }//GEN-LAST:event_btntampilMouseClicked

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneditActionPerformed

    private void rmaghribActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmaghribActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rmaghribActionPerformed

    private void btneditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMouseClicked
        // TODO add your handling code here:
        String ws = null;
        
        if (rsubuh.isSelected()){
            ws = "Shubuh";
        }else if (rmaghrib.isSelected()){
            ws = "Maghrib";
        }else if (risya.isSelected()) {
            ws = "Isya";
        }
        
        try {
            String sql = "UPDATE fr_absensi SET nama = '" + txtnama.getText() + "', nim = '"
                    + txtnim.getText()+ "', kamar = '" + txtkamar.getText() + "', nama_pendamping = '" 
                    + txtnapen.getText() + "', mabna = '" + txtmabna.getText() + "', waktu = '" 
                    + ws + "' WHERE nama = '" + txtnama.getText() + "'";
            Connection con = (Connection) koneksi.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Edit");
        }catch(Exception e){
        }
    }//GEN-LAST:event_btneditMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        int baris = jTable1.rowAtPoint(evt.getPoint());
        String nama = jTable1.getValueAt(baris, 0).toString();
        txtnama.setText(nama);
        String nim = jTable1.getValueAt(baris, 1).toString();
        txtnim.setText(nim);
        String kamar = jTable1.getValueAt(baris, 2).toString();
        txtkamar.setText(kamar);
        String napen = jTable1.getValueAt(baris, 3).toString();
        txtnapen.setText(napen);
        String mabna = jTable1.getValueAt(baris, 4).toString();
        txtmabna.setText(mabna);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btndelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndelMouseClicked
        // TODO add your handling code here:
        try {
            String sql = "DELETE FROM fr_absensi WHERE nama ='" + txtnama.getText() + "'";
            Connection con = (Connection) koneksi.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Menghapus");
        }catch(Exception e){
        }
    }//GEN-LAST:event_btndelMouseClicked

    private void btncariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncariMouseClicked
        // TODO add your handling code here:
        cari();
    }//GEN-LAST:event_btncariMouseClicked

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btncariActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndelActionPerformed

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
            java.util.logging.Logger.getLogger(FormAbsensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAbsensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAbsensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAbsensi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAbsensi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncari;
    private javax.swing.JButton btndel;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btntampil;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton risya;
    private javax.swing.JRadioButton rmaghrib;
    private javax.swing.JRadioButton rsubuh;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtkamar;
    private javax.swing.JTextField txtmabna;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnapen;
    private javax.swing.JTextField txtnim;
    // End of variables declaration//GEN-END:variables
}
