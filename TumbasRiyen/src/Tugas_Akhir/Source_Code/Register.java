/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Akhir.Source_Code;

import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author NoteBook
 */
public class Register extends javax.swing.JFrame {

    Connection con = null;
    Statement st = null;

    /**
     * Creates new form Login
     */
    public Register() {
        initComponents();

    }

    private void hapuslayar() {
        fullnametxt.setText("");
        emailtxt.setText("");
        Usernametxt.setText("");
        passtxt.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fullnametxt = new javax.swing.JTextField();
        passtxt = new javax.swing.JPasswordField();
        Password = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Usernametxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnlogin = new javax.swing.JLabel();
        btnregiter = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Rectangle 5.png"))); // NOI18N
        jButton2.setText("Sign In");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Username.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("tumbasriyen");
        setName(""); // NOI18N
        setUndecorated(true);
        setSize(new java.awt.Dimension(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        fullnametxt.setBackground(new java.awt.Color(255, 255, 255));
        fullnametxt.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        fullnametxt.setForeground(new java.awt.Color(0, 0, 0));
        fullnametxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fullnametxt.setBorder(null);
        fullnametxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        fullnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnametxtActionPerformed(evt);
            }
        });
        jPanel1.add(fullnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 210, 20));

        passtxt.setBackground(new java.awt.Color(255, 255, 255));
        passtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passtxt.setBorder(null);
        jPanel1.add(passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 439, 210, 20));

        Password.setBackground(new java.awt.Color(255, 255, 255));
        Password.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Password.setBorder(null);
        Password.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 440, 210, 20));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Online_shopping-removebg-preview (1).png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 160, 120));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("TumbasRiyen");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 50));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/txt/Rectangle 3.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 210, 250, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/wave (3).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 270));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Have an account _.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 136, 15));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Password.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 407, 94, 19));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Fullname.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 202, 94, 19));

        Usernametxt.setBackground(new java.awt.Color(255, 255, 255));
        Usernametxt.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Usernametxt.setForeground(new java.awt.Color(0, 0, 0));
        Usernametxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Usernametxt.setBorder(null);
        Usernametxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Usernametxt.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(Usernametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 210, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/txt/Rectangle 3.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 360, 240, 50));

        emailtxt.setBackground(new java.awt.Color(255, 255, 255));
        emailtxt.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        emailtxt.setForeground(new java.awt.Color(0, 0, 0));
        emailtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailtxt.setBorder(null);
        emailtxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 210, 20));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Username.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 340, 94, 19));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Email.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 272, 94, 19));

        btnlogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Sign In.png"))); // NOI18N
        btnlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnloginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnloginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnloginMouseExited(evt);
            }
        });
        jPanel1.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, 90, 30));

        btnregiter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnregiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Sign Up 1.png"))); // NOI18N
        btnregiter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnregiter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnregiterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnregiterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnregiterMouseExited(evt);
            }
        });
        jPanel1.add(btnregiter, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 90, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/txt/Rectangle 3.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 429, 240, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/txt/Rectangle 3.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 290, 240, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 640));

        setSize(new java.awt.Dimension(360, 640));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void btnregiterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregiterMouseEntered
        btnregiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Sign Up.png")));
    }//GEN-LAST:event_btnregiterMouseEntered

    private void btnregiterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregiterMouseExited
        btnregiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Sign Up 1.png")));
    }//GEN-LAST:event_btnregiterMouseExited

    private void btnloginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseEntered
        btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Sign In 2.png"))); // NOI18N
    }//GEN-LAST:event_btnloginMouseEntered

    private void btnloginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseExited
        btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Sign In.png"))); // NOI18N
    }//GEN-LAST:event_btnloginMouseExited

    private void btnregiterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregiterMouseClicked
        //TODO add your handling code here
        try {
            if (fullnametxt.getText().equals("") || emailtxt.getText().equals("")
                    || Usernametxt.getText().equals("") || passtxt.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Data tidak boleh kosong!", "Pesan", JOptionPane.ERROR_MESSAGE);
                hapuslayar();
            } else {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tumbasriyen", "root", "");
                st = con.createStatement();
                String simpan = "INSERT INTO login values('" + fullnametxt.getText() + "',"
                        + "'" + emailtxt.getText() + "','" + Usernametxt.getText() + "','" + String.valueOf(passtxt.getText()) + "')";
                st = con.createStatement();
                int SA = st.executeUpdate(simpan);
                JOptionPane.showMessageDialog(this, "Registrasi Berhasil");
                this.setVisible(false);
                new Login().setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Akun sudah ada!",
                    "Pesan", JOptionPane.WARNING_MESSAGE);
            hapuslayar();
        }
    }//GEN-LAST:event_btnregiterMouseClicked

    private void btnloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseClicked
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btnloginMouseClicked

    private void fullnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullnametxtActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Password;
    private javax.swing.JTextField Usernametxt;
    private javax.swing.JLabel btnlogin;
    private javax.swing.JLabel btnregiter;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JTextField fullnametxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passtxt;
    // End of variables declaration//GEN-END:variables
}
