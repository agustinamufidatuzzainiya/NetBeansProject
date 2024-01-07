/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

//import static data.Penjualan.txHarga;
//import static data.Penjualan.txIDBarang;
//import static data.Penjualan.txJumlah;
//import static data.Penjualan.txNamaBarang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Agustina Mufidatuzzainiya_210605110144
 */
public class user extends javax.swing.JFrame {

    //untuk koneksikan ke database
    koneksi koneksi = new koneksi();
    String Tanggal;
    private DefaultTableModel model;

    double hasil;
    String answer;
    double saldo;
    int masukan;

    public user(int saldo) {
        this.saldo = saldo;
    }

    public user() {
        initComponents();

        //Create Table penjualan
        model = new DefaultTableModel();
        tabel1.setModel(model);

        model.addColumn("No Transaksi");
        model.addColumn("ID Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Jumlah");
        model.addColumn("Harga");
        model.addColumn("Total");

        utama();
        Date date = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");

        txTanggal.setText(s.format(date));
        txTotalBayar.setText("0");
        txBayar.setText("0");
        txKembalian.setText("0");
        txIDCustomer.requestFocus();

        //Untuk Data Barang
        this.setLocationRelativeTo(null);
        model = new DefaultTableModel();
        jTableDataBarang.setModel(model);

        model.addColumn("ID Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Jenis");
        model.addColumn("Ukuran");
        model.addColumn("Harga Beli");
        model.addColumn("Harga Jual");
        model.addColumn("Stok");

        loadData2();
        autonumberbarang();
        btnSave.setEnabled(true);
        btnEdit.setEnabled(false);
        btnDel.setEnabled(false);
        btnBatal.setEnabled(false);
    }

    //digunakan untuk menjumlahkan total pembayaran yang berasal dari jumlah dan harga barang
    public void totalBiaya() {
        int jumlahBaris = tabel1.getRowCount();
        int totalBiaya = 0;
        int jumlahBarang, hargaBarang;
        for (int i = 0; i < jumlahBaris; i++) {
            jumlahBarang = Integer.parseInt(tabel1.getValueAt(i, 3).toString());
            hargaBarang = Integer.parseInt(tabel1.getValueAt(i, 4).toString());
            totalBiaya = totalBiaya + (jumlahBarang * hargaBarang);
        }
        txTotalBayar.setText(String.valueOf(totalBiaya));
        txTampil.setText("Rp " + totalBiaya + ",00");
    }

    private void autonumberpenjualan() {

        try {
            Connection c = koneksi.getKoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM penjualan ORDER BY NSFP DESC";
            ResultSet r = s.executeQuery(sql);
            if (r.next()) {
                String NoFaktur = r.getString("NSFP").substring(2);
                String TR = "" + (Integer.parseInt(NoFaktur) + 1);
                String Nol = "";

                if (TR.length() == 1) {
                    Nol = "000";
                } else if (TR.length() == 2) {
                    Nol = "00";
                } else if (TR.length() == 3) {
                    Nol = "0";
                } else if (TR.length() == 4) {
                    Nol = "";
                }
                txNoTransaksi.setText("TR" + Nol + TR);
            } else {
                txNoTransaksi.setText("TR0001");
            }
            r.close();
            s.close();
        } catch (Exception e) {
            System.out.println("autonumber penjualan error");
        }
    }

    public void autonumberbarang() {
        try {
            Connection c = koneksi.getKoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM barang ORDER BY ID_Barang DESC";
            ResultSet r = s.executeQuery(sql);
            if (r.next()) {
                String NoFaktur = r.getString("ID_Barang").substring(2);
                String BR = "" + (Integer.parseInt(NoFaktur) + 1);
                String Nol = "";

                if (BR.length() == 1) {
                    Nol = "00";
                } else if (BR.length() == 2) {
                    Nol = "0";
                } else if (BR.length() == 3) {
                    Nol = "";
                }

                txIDBarang.setText("BR" + Nol + BR);
            } else {
                txIDBarang.setText("BR001");
            }
            r.close();
            s.close();
        } catch (Exception e) {
            System.out.println("autonumber barang error");
        }
    }

    public void loadData() {
        DefaultTableModel model = (DefaultTableModel) tabel1.getModel();
        model.addRow(new Object[]{
            txNoTransaksi.getText(),
            txIDBarang.getText(),
            txNamaBarang.getText(),
            txJumlah.getText(),
            txHarga.getText(),
            txTotalBayar.getText()
        });
    }

    //loadData Data Barang
    public void loadData2() {
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        try {
            Connection c = koneksi.getKoneksi();
            Statement s = c.createStatement();

            String sql = "SELECT * FROM barang";
            ResultSet r = s.executeQuery(sql);

            while (r.next()) {
                Object[] o = new Object[7];
                o[0] = r.getString("ID Barang");
                o[1] = r.getString("Nama Barang");
                o[2] = r.getString("Jenis");
                o[3] = r.getString("Ukuran");
                o[4] = r.getString("Harga Beli");
                o[5] = r.getString("Harga Jual");
                o[6] = r.getString("Stok");

                model.addRow(o);
            }
            r.close();
            s.close();
        } catch (Exception e) {
            System.out.println("terjadi kesalahan");
        }
    }

    public void kosong() {
        DefaultTableModel model = (DefaultTableModel) tabel1.getModel();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }

    public void utama() {
        txNoTransaksi.setText("");
        txIDBarang.setText("");
        txNamaBarang.setText("");
        txHarga.setText("");
        txJumlah.setText("");
        autonumberpenjualan();
    }

    public void clear() {
        txIDCustomer.setText("");
        txNamaCustomer.setText("");
        txTotalBayar.setText("0");
        txBayar.setText("0");
        txKembalian.setText("0");
        txTampil.setText("0");
    }

    public void clear2() {
        txIDBarang.setText("");
        txNamaBarang.setText("");
        txHarga.setText("");
        txJumlah.setText("");
    }

    //hapus di data barang
    public void clear3() {
        txnamaBarang.setText("");
        txHargaBeli.setText("");
        txHargaJual.setText("");
        txStok.setText("");
    }

    public void tambahTransaksi() {
        int jumlah, harga, total;

        jumlah = Integer.valueOf(txJumlah.getText());
        harga = Integer.valueOf(txHarga.getText());
        total = jumlah * harga;

        txTotalBayar.setText(String.valueOf(total));
        loadData();
        totalBiaya();
        clear2();
        txIDBarang.requestFocus();
    }

    //cari data di data barang
    public void cariData() {
        DefaultTableModel tabel = new DefaultTableModel();

        tabel.addColumn("ID Barang");
        tabel.addColumn("Nama Barang");
        tabel.addColumn("Jenis");
        tabel.addColumn("Ukuran");
        tabel.addColumn("Harga Beli");
        tabel.addColumn("Harga Jual");
        tabel.addColumn("Stok");

        try {
            Connection c = koneksi.getKoneksi();
            String sql = "Select * from barang where ID_Barang like '%" + jTextField1.getText() + "%'"
                    + "or namaBarang like '%" + jTextField1.getText() + "%'";
            Statement stat = c.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                tabel.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),});
            }
            tabel1.setModel(tabel);
            loadData2();
        } catch (Exception e) {
            System.out.println("Cari Data Error");
        } finally {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnHapus = new javax.swing.JButton();
        btnTampilan = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnTransfer = new javax.swing.JButton();
        btnCekSaldo = new javax.swing.JButton();
        btnSimpan1 = new javax.swing.JButton();
        jtxTampilanInput = new javax.swing.JTextField();
        jtxCekSaldo = new javax.swing.JTextField();
        btnInput = new javax.swing.JButton();
        jtxTampilanInput1 = new javax.swing.JTextField();
        jtxTampilanInput2 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txNoTransaksi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txIDCustomer = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txNamaCustomer = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txTanggal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txIDBarang = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txNamaBarang = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txHarga = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txJumlah = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel1 = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        txTampil = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txTotalBayar = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txBayar = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txKembalian = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtidBarang = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txnamaBarang = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txHargaBeli = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txHargaJual = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txStok = new javax.swing.JTextField();
        cbJenis = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        cbUkuran = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDataBarang = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Selamat Datang,");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Silahkan Lakukan Transaksi Anda!");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 85, 40));

        btnTampilan.setText("TAMPILAN");
        btnTampilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilanActionPerformed(evt);
            }
        });
        jPanel1.add(btnTampilan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 85, 40));

        jLabel3.setText("Saldo Anda Saat Ini Adalah :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        btnTransfer.setText("TRANSFER");
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });
        jPanel1.add(btnTransfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 40));

        btnCekSaldo.setText("CEK SALDO");
        btnCekSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekSaldoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCekSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, 40));

        btnSimpan1.setText("SAVE");
        btnSimpan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpan1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSimpan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 85, 40));

        jtxTampilanInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxTampilanInputActionPerformed(evt);
            }
        });
        jPanel1.add(jtxTampilanInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 178, 30));

        jtxCekSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxCekSaldoActionPerformed(evt);
            }
        });
        jPanel1.add(jtxCekSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 178, 30));

        btnInput.setText("INPUT");
        btnInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputActionPerformed(evt);
            }
        });
        jPanel1.add(btnInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 85, 40));

        jtxTampilanInput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxTampilanInput1ActionPerformed(evt);
            }
        });
        jPanel1.add(jtxTampilanInput1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 178, 30));

        jtxTampilanInput2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxTampilanInput2ActionPerformed(evt);
            }
        });
        jPanel1.add(jtxTampilanInput2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 178, 30));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg main.png"))); // NOI18N
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -150, 670, 560));

        jTabbedPane1.addTab("Transaksi", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("No Transaksi");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 20));

        txNoTransaksi.setEnabled(false);
        txNoTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNoTransaksiActionPerformed(evt);
            }
        });
        jPanel2.add(txNoTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 150, -1));

        jLabel7.setText("ID Customer");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));
        jPanel2.add(txIDCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 150, -1));

        jLabel10.setText("Nama Customer");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txNamaCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNamaCustomerActionPerformed(evt);
            }
        });
        jPanel2.add(txNamaCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 150, -1));

        jLabel11.setText("Tanggal");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        txTanggal.setEnabled(false);
        jPanel2.add(txTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 120, -1));

        jLabel12.setText("ID Barang");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 20));

        txIDBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txIDBarangActionPerformed(evt);
            }
        });
        jPanel2.add(txIDBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 100, -1));

        jLabel13.setText("Nama Barang");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        txNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNamaBarangActionPerformed(evt);
            }
        });
        jPanel2.add(txNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 120, -1));

        jLabel14.setText("Harga");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, 20));

        txHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txHargaActionPerformed(evt);
            }
        });
        jPanel2.add(txHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 100, -1));

        jLabel15.setText("Jumlah");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, 20));

        txJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txJumlahActionPerformed(evt);
            }
        });
        jPanel2.add(txJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 100, -1));

        tabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabel1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 520, 120));

        btnTambah.setText("Show");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        jPanel2.add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 70, 50));

        btnDelete.setText("Hapus");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 70, 50));

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        jPanel2.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, 40));

        txTampil.setBackground(new java.awt.Color(153, 204, 255));
        txTampil.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txTampil.setText("Rp. 0");
        txTampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTampilActionPerformed(evt);
            }
        });
        jPanel2.add(txTampil, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 240, -1));

        jLabel16.setText("Total Bayar");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, -1));

        txTotalBayar.setEnabled(false);
        jPanel2.add(txTotalBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 120, -1));

        jLabel17.setText("Bayar");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, -1, -1));

        txBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txBayarActionPerformed(evt);
            }
        });
        jPanel2.add(txBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 120, -1));

        jLabel18.setText("Kembalian");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, -1, -1));

        txKembalian.setEnabled(false);
        jPanel2.add(txKembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 120, -1));

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        jPanel2.add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg main.png"))); // NOI18N
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -150, 780, 560));

        jTabbedPane1.addTab("Penjualan", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("ID Barang");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 42, -1, -1));
        jPanel3.add(txtidBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 39, 160, -1));

        jLabel8.setText("Nama Barang");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 73, -1, -1));
        jPanel3.add(txnamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 70, 160, -1));

        jLabel9.setText("Jenis Barang");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 104, -1, -1));

        jLabel19.setText("Harga Beli");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 58, -1, -1));
        jPanel3.add(txHargaBeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 55, 160, -1));

        jLabel20.setText("Harga Jual");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 89, -1, -1));
        jPanel3.add(txHargaJual, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 86, 160, -1));

        jLabel21.setText("Stok");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 120, -1, -1));
        jPanel3.add(txStok, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 117, 160, -1));

        cbJenis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Baju", "Celana", "Jaket", "Kemeja" }));
        jPanel3.add(cbJenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 101, 160, -1));

        jLabel22.setText("Ukuran");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 135, -1, -1));

        cbUkuran.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "S", "M", "L", "XL", "XXL" }));
        jPanel3.add(cbUkuran, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 132, 160, -1));

        jLabel23.setText("Cari Data");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 16, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 13, 129, -1));

        jTableDataBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableDataBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDataBarangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableDataBarang);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 163, 623, 124));

        btnSave.setText("Simpan");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 339, 78, -1));

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel3.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 339, 78, -1));

        btnDel.setText("Hapus");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        jPanel3.add(btnDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 339, 78, -1));

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        jPanel3.add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 339, 78, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg main.png"))); // NOI18N
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -150, 660, 560));

        jTabbedPane1.addTab("Data Barang", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 670, 440));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg main.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, -10, 780, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        jtxTampilanInput.setText("");
        jtxTampilanInput1.setText("");
        jtxCekSaldo.setText("");
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCekSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekSaldoActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Saldo Anda Saat Ini adalah :" + saldo);
        hasil = saldo;
        saldo = hasil;
        answer = String.format(" %,.2f ", saldo);
        jtxCekSaldo.setText(answer);
    }//GEN-LAST:event_btnCekSaldoActionPerformed

    private void btnTampilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilanActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Saldo Anda Saat Ini adalah :" + (saldo + masukan));
        hasil = saldo + masukan;
        saldo = hasil;
        answer = String.format(" %,.2f ", saldo);
        jtxTampilanInput.setText(answer);
    }//GEN-LAST:event_btnTampilanActionPerformed

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferActionPerformed
        String nama3 = JOptionPane.showInputDialog("Silahkan Masukan Nama ");

        masukan = Integer.parseInt(JOptionPane.showInputDialog("Masukan angka : "));
        if (saldo <= masukan) {
            JOptionPane.showMessageDialog(rootPane, "Maaf Saldo anda kurang !!!!!");
            JOptionPane.showConfirmDialog(null, "Apakah ingin lanjut");
            JOptionPane.showMessageDialog(rootPane, "Tambahkan Saldo Rekening Anda Terlebih Dahulu");
            System.exit(0);
        } else if (saldo >= masukan) {

        }
        hasil = saldo - masukan;
        saldo = hasil;
        answer = String.format(" %,.2f ", hasil);
        jtxTampilanInput2.setText(String.valueOf(masukan));
        JOptionPane.showMessageDialog(rootPane, "Saldo Anda Saat Ini adalah :"
                + saldo + "\n" + "Berhasil transfer kepada " + nama3 + " sebesar :" + masukan);

    }//GEN-LAST:event_btnTransferActionPerformed

    private void txNoTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNoTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNoTransaksiActionPerformed

    private void txNamaCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNamaCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNamaCustomerActionPerformed

    private void txJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txJumlahActionPerformed
        tambahTransaksi();
    }//GEN-LAST:event_txJumlahActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        tambahTransaksi();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabel1.getModel();
        int row = tabel1.getSelectedRow();
        model.removeRow(row);
        totalBiaya();
        txBayar.setText("0");
        txKembalian.setText("0");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabel1.getModel();

        String noTransaksi = txNoTransaksi.getText();
        String tanggal = txTanggal.getText();
        String idCustomer = txIDCustomer.getText();
        String total = txTotalBayar.getText();

        try {
            Connection c = koneksi.getKoneksi();
            String sql = "INSERT INTO penjualan VALUES (?, ?, ?, ?)";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, noTransaksi);
            p.setString(2, tanggal);
            p.setString(3, idCustomer);
            p.setString(4, total);
            p.executeUpdate();
            p.close();
        } catch (Exception e) {
            System.out.println("simpan penjualan error");
        }

        try {
            Connection c = koneksi.getKoneksi();
            int baris = tabel1.getRowCount();

            for (int i = 0; i < baris; i++) {
                String sql = "INSERT INTO rincianPenjualan(NSFP, ID_Barang, namaBarang, jumlah, harga, total) VALUES('"
                        + tabel1.getValueAt(i, 0) + "','" + tabel1.getValueAt(i, 1) + "','" + tabel1.getValueAt(i, 2)
                        + "','" + tabel1.getValueAt(i, 3) + "','" + tabel1.getValueAt(i, 4) + "','" + tabel1.getValueAt(i, 5)
                        + "')";
                PreparedStatement p = c.prepareStatement(sql);
                p.executeUpdate();
                p.close();
            }
        } catch (Exception e) {
            System.out.println("simpan penjualan rinci error");
        }
        clear();
        utama();
        autonumberpenjualan();
        kosong();
        txTampil.setText("Rp. 0");
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void txBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txBayarActionPerformed
        int total, bayar, kembalian;
        total = Integer.valueOf(txTotalBayar.getText());
        bayar = Integer.valueOf(txBayar.getText());
        if (total > bayar) {
            JOptionPane.showMessageDialog(null, "Uang tidak cukup untuk melakukan pembayaran");
        } else {
            kembalian = bayar - total;
            txKembalian.setText(String.valueOf(kembalian));
        }
    }//GEN-LAST:event_txBayarActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        ListBarang a = new ListBarang();
        a.setVisible(true);
    }//GEN-LAST:event_btnCariActionPerformed

    private void txIDBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txIDBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txIDBarangActionPerformed

    private void txNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNamaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNamaBarangActionPerformed

    private void txTampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTampilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTampilActionPerformed

    private void jTableDataBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDataBarangMouseClicked
        btnSave.setEnabled(false);
        btnEdit.setEnabled(true);
        btnDel.setEnabled(true);
        btnBatal.setEnabled(true);

        int i = jTableDataBarang.getSelectedRow();
        if (i == -1) {
            return;
        }

        String id = (String) model.getValueAt(i, 0);
        String nama = (String) model.getValueAt(i, 1);
        String jenis = (String) model.getValueAt(i, 2);
        String ukuran = (String) model.getValueAt(i, 3);
        String hargaBeli = (String) model.getValueAt(i, 4);
        String hargaJual = (String) model.getValueAt(i, 5);
        String stok = (String) model.getValueAt(i, 6);

        txtidBarang.setText(id);
        txnamaBarang.setText(nama);
        cbJenis.setSelectedItem(jenis);
        cbUkuran.setSelectedItem(ukuran);
        txHargaBeli.setText(hargaBeli);
        txHargaJual.setText(hargaJual);
        txStok.setText(stok);
    }//GEN-LAST:event_jTableDataBarangMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        cariData();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        cariData();
    }//GEN-LAST:event_jTextField1KeyTyped

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String id = txtidBarang.getText();
        String nama = txnamaBarang.getText();
        String jenis = (String) cbJenis.getSelectedItem();
        String ukuran = (String) cbUkuran.getSelectedItem();
        String hargaBeli = txHargaBeli.getText();
        String hargaJual = txHargaJual.getText();
        String stok = txStok.getText();

        try {
            Connection c = koneksi.getKoneksi();
            String sql = "INSERT INTO barang VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, id);
            p.setString(2, nama);
            p.setString(3, jenis);
            p.setString(4, ukuran);
            p.setString(5, hargaBeli);
            p.setString(6, hargaJual);
            p.setString(7, stok);
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(null, "Data Tersimpan");
            loadData2();
        } catch (Exception e) {
            System.out.println("Terjadi Kesalahan");
        } finally {
            autonumberbarang();
            clear3();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int i = jTableDataBarang.getSelectedRow();
        if (i == -1) {
            return;
        }
        String id = (String) model.getValueAt(i, 0);
        String nama = txnamaBarang.getText();
        String jenis = (String) cbJenis.getSelectedItem();
        String ukuran = (String) cbUkuran.getSelectedItem();
        String hargaBeli = txHargaBeli.getText();
        String hargaJual = txHargaJual.getText();
        String stok = txStok.getText();

        try {
            Connection c = koneksi.getKoneksi();
            String sql = "UPDATE barang SET namaBarang = ?, jenis = ?, "
                    + "ukuran = ?, hargaBeli = ?, hargaJual = ?, stok = ? WHERE ID_Barang = ?";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, nama);
            p.setString(2, jenis);
            p.setString(3, ukuran);
            p.setString(4, hargaBeli);
            p.setString(5, hargaJual);
            p.setString(6, stok);
            p.setString(7, id);

            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(null, "Data Terubah");
            btnSave.setEnabled(true);
            btnEdit.setEnabled(false);
            btnDel.setEnabled(false);
            btnBatal.setEnabled(false);
            clear3();
        } catch (Exception e) {
            System.out.println("update error");
        } finally {
            loadData2();
            autonumberbarang();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        int i = jTableDataBarang.getSelectedRow();
        if (i == -1) {
            return;
        }

        String id = (String) model.getValueAt(i, 0);

        int pernyataan = JOptionPane.showConfirmDialog(null, "Yakin Data Akan Dihapus",
                "Konfirmasi", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (pernyataan == JOptionPane.OK_OPTION) {
            try {
                Connection c = koneksi.getKoneksi();
                String sql = "DELETE FROM barang WHERE ID_Barang = ?";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, id);
                p.executeUpdate();
                p.close();
                JOptionPane.showMessageDialog(null, "Data Terhapus");
            } catch (Exception e) {
                System.out.println("Terjadi Kesalahan");
            } finally {
                btnSave.setEnabled(true);
                btnEdit.setEnabled(false);
                btnDel.setEnabled(false);
                btnBatal.setEnabled(false);
                loadData2();
                autonumberbarang();
                clear3();
            }
        }
        if (pernyataan == JOptionPane.CANCEL_OPTION) {

        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        clear3();
        loadData2();
        btnSave.setEnabled(true);
        btnEdit.setEnabled(false);
        btnDel.setEnabled(false);
        btnBatal.setEnabled(false);
        autonumberbarang();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void txHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txHargaActionPerformed

    private void btnSimpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpan1ActionPerformed
//        int input;
//        int tampilan;
//        int transfer;
//        int CekSaldo;
        
        try {
            String sql = "INSERT INTO user VALUES ('" + jtxTampilanInput1.getText() + "','"
            + jtxTampilanInput.getText()+ "','" + jtxTampilanInput2.getText() + "','" + jtxCekSaldo.getText() + "')";
            Connection con = (Connection) koneksi.getKoneksi();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();

            JOptionPane.showMessageDialog(null, "Berhasil Menyimpan");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menyimpan " + e.getMessage());
        }
    }//GEN-LAST:event_btnSimpan1ActionPerformed

    private void jtxTampilanInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxTampilanInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxTampilanInputActionPerformed

    private void jtxCekSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxCekSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxCekSaldoActionPerformed

    private void btnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputActionPerformed
        masukan = Integer.parseInt(JOptionPane.showInputDialog("Masukan Nominal : Rp. "));
        //JOptionPane.showMessageDialog(rootPane,"Saldo Anda Saat Ini adalah :"+ (saldo + masukan));
        hasil = saldo + masukan;
        saldo=hasil;
        answer = String.format(" %,.2f ",saldo);
        jtxTampilanInput1.setText(answer);
    }//GEN-LAST:event_btnInputActionPerformed

    private void jtxTampilanInput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxTampilanInput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxTampilanInput1ActionPerformed

    private void jtxTampilanInput2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxTampilanInput2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxTampilanInput2ActionPerformed

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
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnCekSaldo;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnInput;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnSimpan1;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTampilan;
    private javax.swing.JButton btnTransfer;
    private javax.swing.JComboBox cbJenis;
    private javax.swing.JComboBox cbUkuran;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableDataBarang;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jtxCekSaldo;
    private javax.swing.JTextField jtxTampilanInput;
    private javax.swing.JTextField jtxTampilanInput1;
    private javax.swing.JTextField jtxTampilanInput2;
    private javax.swing.JTable tabel1;
    private javax.swing.JTextField txBayar;
    public static javax.swing.JTextField txHarga;
    private javax.swing.JTextField txHargaBeli;
    private javax.swing.JTextField txHargaJual;
    public static javax.swing.JTextField txIDBarang;
    private javax.swing.JTextField txIDCustomer;
    public static javax.swing.JTextField txJumlah;
    private javax.swing.JTextField txKembalian;
    public static javax.swing.JTextField txNamaBarang;
    private javax.swing.JTextField txNamaCustomer;
    private javax.swing.JTextField txNoTransaksi;
    private javax.swing.JTextField txStok;
    private javax.swing.JTextField txTampil;
    private javax.swing.JTextField txTanggal;
    private javax.swing.JTextField txTotalBayar;
    private javax.swing.JTextField txnamaBarang;
    private javax.swing.JTextField txtidBarang;
    // End of variables declaration//GEN-END:variables
}
