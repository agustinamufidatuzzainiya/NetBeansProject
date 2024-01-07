/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Akhir.Source_Code;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NoteBook
 */
public class Main extends javax.swing.JFrame {

    Connection con = null;
    Statement st = null;
    String Tanggal;
    private DefaultTableModel model;

    public Main() {
        initComponents();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tumbasriyen", "root", "");
        } catch (Exception ex) {

        }

        //Tanggal
        Date D = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        txtdate.setText(s.format(D));
        txtdate1.setText(s.format(D));

        //Create Table
        model = new DefaultTableModel();

        tabelkeranjang.setModel(model);
        model.addColumn("Date");
        model.addColumn("ID Number");
        model.addColumn("Total Barang");
        model.addColumn("Sub Total");
        model.addColumn("Harga Jual");
        model.addColumn("Merk");
        model.addColumn("ID Penjualan");
        model.addColumn("Pegawai");

        Sepatu();
        Tas();

    }

    private void autonumber() {
        try {
            Statement s = con.createStatement();
            String sql = "SELECT * FROM keranjang ORDER BY ID_Penjualan DESC";
            ResultSet r = s.executeQuery(sql);
            if (r.next()) {
                String NoFaktur = r.getString("ID_Penjualan").substring(2);
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
                txtpenjualan1.setText("TR" + Nol + TR);
                txtpenjualan.setText("TR" + Nol + TR);
            } else {
                txtpenjualan1.setText("TR0001");
                txtpenjualan.setText("TR0001");
            }
            r.close();
            s.close();
        } catch (Exception e) {
            System.out.println("autonumber error");
        }
    }

    Sepatu S = new Sepatu();
    Penjualan_Sepatu PS = new Penjualan_Sepatu();

    public String tambahkansale() throws SQLException {
        String type = null;
        if (radiobtnbag.isSelected()) {
            type = "Bag";
        } else if (radiobtnshoes.isSelected()) {
            type = "Shoes";
        }

        S.addSepatu(txtpegawai.getText(), type, txtstock.getText(), cbsize.getSelectedItem().toString(), txtbrand.getText(), txtidnumber.getText(), txtcollor.getText(), txtprice.getText());

        tambahkansepatu();
        tambahkantas();
        tambahkansearch();
        hapussale();

        return type;
    }

    //tabel search
    public void tambahkansearch() {

        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("No.");
        tbl.addColumn("Employee");
        tbl.addColumn("Type");
        tbl.addColumn("Stock");
        tbl.addColumn("Size");
        tbl.addColumn("ID Number");
        tbl.addColumn("Color");
        tbl.addColumn("Brand");
        tbl.addColumn("Price");

        try {
            int no = 1;
            //Merk and idnumber not same
            String sql = "SELECT * FROM sale WHERE employee like '%" + txtsearch1.getText() + "%'"
                    + "or type like '%" + txtsearch1.getText() + "%'"
                    + "or stock like '%" + txtsearch1.getText() + "%'"
                    + "or size like '%" + txtsearch1.getText() + "%'"
                    + "or id_number like '%" + txtsearch1.getText() + "%'"
                    + "or color like '%" + txtsearch1.getText() + "%'"
                    + "or brand like '%" + txtsearch1.getText() + "%'"
                    + "or price like '%" + txtsearch1.getText() + "%'";
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                tbl.addRow(new Object[]{no++, rs.getString(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5), rs.getString(6),
                    rs.getString(7), rs.getString(8)});
            }
            tblsale.setModel(tbl);
        } catch (Exception e) {
            System.out.println("Gagal Menyimpan " + e.getMessage());
        }

    }

    //Tabel sepatu
    public void tambahkansepatu() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("No.");
        tbl.addColumn("Employee");
        tbl.addColumn("Type");
        tbl.addColumn("Stock");
        tbl.addColumn("Size");
        tbl.addColumn("ID Number");
        tbl.addColumn("Color");
        tbl.addColumn("Brand");
        tbl.addColumn("Price");

        try {
            int no = 1;
            String sql = "SELECT * FROM sale WHERE type = 'Shoes'";
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                tbl.addRow(new Object[]{no++, rs.getString(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5), rs.getString(6),
                    rs.getString(7), rs.getString(8)});
            }
            tblsepatu.setModel(tbl);
        } catch (Exception e) {
            System.out.println("Gagal Menyimpan " + e.getMessage());
        }
    }

    //Tabel tas
    public void tambahkantas() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("No.");
        tbl.addColumn("Employee");
        tbl.addColumn("Type");
        tbl.addColumn("Stock");
        tbl.addColumn("Size");
        tbl.addColumn("ID Number");
        tbl.addColumn("Color");
        tbl.addColumn("Brand");
        tbl.addColumn("Price");

        try {
            int no = 1;
            String sql = "SELECT * FROM sale WHERE type = 'Bag' ";
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                tbl.addRow(new Object[]{no++, rs.getString(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5), rs.getString(6),
                    rs.getString(7), rs.getString(8)});
            }
            tabelbuytas.setModel(tbl);
        } catch (Exception e) {
            System.out.println("Gagal Menyimpan " + e.getMessage());
        }
    }

    //Tabel Keranjang
    public void kosong() {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }

    //Sepatu
    public void tambahTransaksi() {
        int jumlah, harga, total;

        jumlah = Integer.valueOf(txtjumlahbarang1.getText());
        harga = Integer.valueOf(txthargajual1.getText());
        total = jumlah * harga;

        txtharga1.setText(String.valueOf(total));

        loadData();
        totalBiaya();

        txtnumber1.requestFocus();
    }

    public void clear2() {
        txtnumber1.setText("");
        txtjumlahbarang1.setText("");
        txtharga1.setText("");
        txthargajual1.setText("");
        txtmerk1.setText("");
        txtpenjualan1.setText("");
        txtpegawai2.setText("");
    }

    public void totalBiaya() {
        int jumlahBaris = tabelkeranjang.getRowCount();
        int totalBiaya = 0;
        int jumlahBarang, hargaBarang;
        for (int i = 0; i < jumlahBaris; i++) {
            jumlahBarang = Integer.parseInt(tabelkeranjang.getValueAt(i, 2).toString());
            hargaBarang = Integer.parseInt(tabelkeranjang.getValueAt(i, 4).toString());
            totalBiaya = totalBiaya + (jumlahBarang * hargaBarang);
        }
        txtTotal.setText("Rp " + String.valueOf(totalBiaya) + ",00");
    }

    public void loadData() {
        DefaultTableModel model = (DefaultTableModel) tabelkeranjang.getModel();
        model.addRow(new Object[]{
            txtdate1.getText(),
            txtnumber1.getText(),
            txtjumlahbarang1.getText(),
            txtharga1.getText(),
            txthargajual1.getText(),
            txtmerk1.getText(),
            txtpenjualan1.getText(),
            txtpegawai2.getText()
        });
    }

    //Hapus layar sale
    public void hapussale() throws SQLException {
        txtpegawai.setEditable(true);
        txtpegawai.setText(null);
        buttonGroup1.clearSelection();
        txtstock.setText(null);
        cbsize.setSelectedItem(this);
        txtidnumber.setText(null);
        txtcollor.setText(null);
        txtbrand.setText(null);
        txtprice.setText(null);
    }

    //Sepatu
    public void Sepatu() {
        txtnumber1.setText("");
        txtjumlahbarang1.setText(null);
        txtharga1.setText(null);
        txthargajual1.setText(null);
        txtmerk1.setText(null);
        txtpenjualan1.setText(null);
        txtpegawai2.setText(null);
        autonumber();
    }

    //Tas
    public void tambahTransaksitas() {
        int jumlah, harga, total;

        jumlah = Integer.valueOf(txtjumlahbarang.getText());
        harga = Integer.valueOf(txthargajual.getText());
        total = jumlah * harga;

        txtharga.setText(String.valueOf(total));

        loadData1();
        totalBiaya();
        txtnumber.requestFocus();
    }

    public void clear3() {
        txtnumber.setText("");
        txtjumlahbarang.setText("");
        txtharga.setText("");
        txthargajual.setText("");
        txtmerk.setText("");
        txtpenjualan.setText("");
        txtpegawai1.setText("");
    }

    public void loadData1() {
        DefaultTableModel model = (DefaultTableModel) tabelkeranjang.getModel();
        model.addRow(new Object[]{
            txtdate.getText(),
            txtnumber.getText(),
            txtjumlahbarang.getText(),
            txtharga.getText(),
            txthargajual.getText(),
            txtmerk.getText(),
            txtpenjualan.getText(),
            txtpegawai1.getText()
        });
    }

    private void autonumbertas() {
        try {
            Statement s = con.createStatement();
            String sql = "SELECT * FROM keranjang ORDER BY ID_Penjualan DESC";
            ResultSet r = s.executeQuery(sql);
            if (r.next()) {
                String NoFaktur = r.getString("ID_Penjualan").substring(2);
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
                txtpenjualan.setText("TR" + Nol + TR);
            } else {
                txtpenjualan.setText("TR0001");
            }
            r.close();
            s.close();
        } catch (Exception e) {
            System.out.println("autonumber error");
        }
    }

    public void Tas() {
        txtnumber.setText(null);
        txtjumlahbarang.setText(null);
        txtharga.setText(null);
        txthargajual.setText(null);
        txtmerk.setText(null);
        txtpenjualan.setText(null);
        txtpegawai1.setText(null);
        autonumbertas();
    }

    //Hapus Layar Keranjang
    public void Keranjang() {
        txtpembeli.setEditable(true);
        txtpembeli.setText(null);
        buttonGroup2.clearSelection();
        pegawaitxt.setText(null);
        txtalamat.setText(null);
        txtbayar.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        Body = new javax.swing.JPanel();
        Menupanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnhome = new javax.swing.JLabel();
        btnsale = new javax.swing.JLabel();
        btnbuy = new javax.swing.JLabel();
        btnkeranjang = new javax.swing.JLabel();
        btnabout = new javax.swing.JLabel();
        btnexit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mainpanel = new javax.swing.JPanel();
        Homepanel = new javax.swing.JPanel();
        Searchpanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelpersediaanbarang = new javax.swing.JTable();
        btnaddcart = new javax.swing.JLabel();
        Salepanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblsale = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txtstock = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        radiobtnshoes = new javax.swing.JRadioButton();
        radiobtnbag = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        cbsize = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtidnumber = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtcollor = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtbrand = new javax.swing.JTextField();
        btnreset = new javax.swing.JLabel();
        btnsave = new javax.swing.JLabel();
        btnedit = new javax.swing.JLabel();
        btndelete = new javax.swing.JLabel();
        txtpegawai = new javax.swing.JTextField();
        txtsearch1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        buypanel = new javax.swing.JPanel();
        btnshoes = new javax.swing.JLabel();
        btnbag = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        taspanel = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelbuytas = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        txtpegawai1 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        addkeranjang = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtjumlahbarang = new javax.swing.JTextField();
        txtnumber = new javax.swing.JTextField();
        txthargajual = new javax.swing.JTextField();
        txtmerk = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtpenjualan = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        btndeletetas1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        keranjangpanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelkeranjang = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        btndeletetas = new javax.swing.JLabel();
        btntransaksi = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtpembeli = new javax.swing.JTextField();
        rdmale = new javax.swing.JRadioButton();
        rdfemale = new javax.swing.JRadioButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        btntotal = new javax.swing.JLabel();
        pegawaitxt = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        txtbayar = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        transaksipanel = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabletransaksi = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        sepatupanel = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblsepatu = new javax.swing.JTable();
        txthargajual1 = new javax.swing.JTextField();
        txtmerk1 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtharga1 = new javax.swing.JTextField();
        txtpegawai2 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        addkeranjang1 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txtjumlahbarang1 = new javax.swing.JTextField();
        txtnumber1 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        txtdate1 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        txtpenjualan1 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        btndeletetas2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(414, 736));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Body.setBackground(new java.awt.Color(255, 255, 255));
        Body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menupanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Menu/Line 2.png"))); // NOI18N
        Menupanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 64, 189, 5));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TumbasRiyen");
        Menupanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 24, 180, 40));

        btnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Menu/btn Home.png"))); // NOI18N
        btnhome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnhomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnhomeMouseExited(evt);
            }
        });
        Menupanel.add(btnhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 255, 40));

        btnsale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Menu/btn Sale1.png"))); // NOI18N
        btnsale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsaleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsaleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsaleMouseExited(evt);
            }
        });
        Menupanel.add(btnsale, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        btnbuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Menu/btn buy1.png"))); // NOI18N
        btnbuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbuyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnbuyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnbuyMouseExited(evt);
            }
        });
        Menupanel.add(btnbuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, -1));

        btnkeranjang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Menu/BTN KERANJANG.png"))); // NOI18N
        btnkeranjang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnkeranjang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnkeranjangMouseClicked(evt);
            }
        });
        Menupanel.add(btnkeranjang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 250, -1));

        btnabout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Menu/btn About.png"))); // NOI18N
        btnabout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnabout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnaboutMouseClicked(evt);
            }
        });
        Menupanel.add(btnabout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, -1));

        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Menu/btn Logout.png"))); // NOI18N
        btnexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnexitMouseClicked(evt);
            }
        });
        Menupanel.add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 465, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Menu/Rectangle 24.png"))); // NOI18N
        Menupanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Body.add(Menupanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 255, 541));

        mainpanel.setBackground(new java.awt.Color(255, 255, 255));
        mainpanel.setLayout(new java.awt.CardLayout());

        Homepanel.setBackground(new java.awt.Color(255, 255, 255));
        Homepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        mainpanel.add(Homepanel, "card2");

        Searchpanel.setBackground(new java.awt.Color(255, 255, 255));
        Searchpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(10, 189, 227));
        jLabel5.setText("SEARCH");
        Searchpanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/SEARCH/Line 3.png"))); // NOI18N
        Searchpanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 85, 790, 10));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/SEARCH/Search1.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        Searchpanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, -1));

        txtsearch.setBackground(new java.awt.Color(255, 255, 255));
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        Searchpanel.add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 154, 27));

        tabelpersediaanbarang.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelpersediaanbarang);

        Searchpanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 750, 200));

        btnaddcart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/SEARCH/Group 11.png"))); // NOI18N
        btnaddcart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Searchpanel.add(btnaddcart, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, -1, -1));

        mainpanel.add(Searchpanel, "card3");

        Salepanel.setBackground(new java.awt.Color(255, 255, 255));
        Salepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Humnst777 BlkCn BT", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(10, 189, 227));
        jLabel8.setText("SALE");
        jLabel8.setToolTipText("");
        Salepanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Sale/Line 3.png"))); // NOI18N
        Salepanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 85, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Sale/Employee _.png"))); // NOI18N
        Salepanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        txtprice.setBackground(new java.awt.Color(255, 255, 255));
        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });
        Salepanel.add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 200, 27));

        tblsale.setModel(new javax.swing.table.DefaultTableModel(
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
        tblsale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsaleMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblsale);

        Salepanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 670, 100));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Sale/Type _.png"))); // NOI18N
        Salepanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 20));

        txtstock.setBackground(new java.awt.Color(255, 255, 255));
        txtstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstockActionPerformed(evt);
            }
        });
        Salepanel.add(txtstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 212, 27));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Sale/Stock _.png"))); // NOI18N
        Salepanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 216, -1, 30));

        radiobtnshoes.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radiobtnshoes);
        radiobtnshoes.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        radiobtnshoes.setForeground(new java.awt.Color(0, 0, 0));
        radiobtnshoes.setText("SHOES");
        radiobtnshoes.setToolTipText("");
        radiobtnshoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salepanel.add(radiobtnshoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 80, 24));

        radiobtnbag.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radiobtnbag);
        radiobtnbag.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        radiobtnbag.setForeground(new java.awt.Color(0, 0, 0));
        radiobtnbag.setText("BAG");
        radiobtnbag.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salepanel.add(radiobtnbag, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 70, 24));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Sale/Size _.png"))); // NOI18N
        Salepanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 280, -1, -1));

        cbsize.setBackground(new java.awt.Color(255, 255, 255));
        cbsize.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbsize.setForeground(new java.awt.Color(0, 0, 0));
        cbsize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L", "XL", "XXL", " " }));
        cbsize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbsize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsizeActionPerformed(evt);
            }
        });
        Salepanel.add(cbsize, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Sale/ID Number _.png"))); // NOI18N
        Salepanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Sale/Color _.png"))); // NOI18N
        Salepanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, -1));

        txtidnumber.setBackground(new java.awt.Color(255, 255, 255));
        txtidnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidnumberActionPerformed(evt);
            }
        });
        Salepanel.add(txtidnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 200, 27));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Sale/Brand _.png"))); // NOI18N
        Salepanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));

        txtcollor.setBackground(new java.awt.Color(255, 255, 255));
        txtcollor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcollorActionPerformed(evt);
            }
        });
        Salepanel.add(txtcollor, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 200, 27));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Sale/Price _.png"))); // NOI18N
        Salepanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, -1));

        txtbrand.setBackground(new java.awt.Color(255, 255, 255));
        txtbrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbrandActionPerformed(evt);
            }
        });
        Salepanel.add(txtbrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 200, 27));

        btnreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Sale/Group 10.png"))); // NOI18N
        btnreset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnreset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnresetMouseClicked(evt);
            }
        });
        Salepanel.add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Sale/Group 11.png"))); // NOI18N
        btnsave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsaveMouseClicked(evt);
            }
        });
        Salepanel.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, -1));

        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Sale/Group 12.png"))); // NOI18N
        btnedit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnedit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneditMouseClicked(evt);
            }
        });
        Salepanel.add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Sale/Group 13.png"))); // NOI18N
        btndelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndeleteMouseClicked(evt);
            }
        });
        Salepanel.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        txtpegawai.setBackground(new java.awt.Color(255, 255, 255));
        txtpegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpegawaiActionPerformed(evt);
            }
        });
        Salepanel.add(txtpegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 212, 27));

        txtsearch1.setBackground(new java.awt.Color(255, 255, 255));
        txtsearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearch1ActionPerformed(evt);
            }
        });
        Salepanel.add(txtsearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 154, 27));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/SEARCH/Search1.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        Salepanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, -1, -1));

        mainpanel.add(Salepanel, "card4");

        buypanel.setBackground(new java.awt.Color(255, 255, 255));
        buypanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnshoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Buy/Group 12 (1).png"))); // NOI18N
        btnshoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnshoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnshoesMouseClicked(evt);
            }
        });
        buypanel.add(btnshoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        btnbag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Buy/Group 13.png"))); // NOI18N
        btnbag.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnbag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbagMouseClicked(evt);
            }
        });
        buypanel.add(btnbag, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Buy/Line 3.png"))); // NOI18N
        buypanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 85, -1, -1));

        mainpanel.add(buypanel, "card5");

        taspanel.setBackground(new java.awt.Color(255, 255, 255));
        taspanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Buy/Line 3.png"))); // NOI18N
        taspanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 85, -1, -1));

        tabelbuytas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee", "Type", "Stock", "Size", "ID Number", "Color", "Brand", "Price"
            }
        ));
        tabelbuytas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelbuytasMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tabelbuytas);

        taspanel.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 730, 120));

        jLabel31.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel31.setForeground(java.awt.Color.black);
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Date");
        taspanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 90, 30));

        txtharga.setBackground(new java.awt.Color(255, 255, 255));
        txtharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargaActionPerformed(evt);
            }
        });
        taspanel.add(txtharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 212, 27));

        txtpegawai1.setBackground(new java.awt.Color(255, 255, 255));
        txtpegawai1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtpegawai1.setEnabled(false);
        txtpegawai1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpegawai1ActionPerformed(evt);
            }
        });
        taspanel.add(txtpegawai1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 212, 27));

        jLabel32.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel32.setForeground(java.awt.Color.black);
        jLabel32.setText("No.Transaksi");
        taspanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 120, 30));

        addkeranjang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/SEARCH/Group 11.png"))); // NOI18N
        addkeranjang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addkeranjangMouseClicked(evt);
            }
        });
        taspanel.add(addkeranjang, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, -1, -1));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Buy/Total Bag _.png"))); // NOI18N
        taspanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Sale/Price _.png"))); // NOI18N
        taspanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        txtjumlahbarang.setBackground(new java.awt.Color(255, 255, 255));
        txtjumlahbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlahbarangActionPerformed(evt);
            }
        });
        taspanel.add(txtjumlahbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 212, 27));

        txtnumber.setBackground(new java.awt.Color(255, 255, 255));
        txtnumber.setEnabled(false);
        txtnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumberActionPerformed(evt);
            }
        });
        taspanel.add(txtnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 212, 27));

        txthargajual.setBackground(new java.awt.Color(255, 255, 255));
        txthargajual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txthargajual.setEnabled(false);
        txthargajual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargajualActionPerformed(evt);
            }
        });
        taspanel.add(txthargajual, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 212, 27));

        txtmerk.setBackground(new java.awt.Color(255, 255, 255));
        txtmerk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtmerk.setEnabled(false);
        txtmerk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmerkActionPerformed(evt);
            }
        });
        taspanel.add(txtmerk, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 212, 27));

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Buy/arrow-left.png"))); // NOI18N
        jLabel37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel37MouseEntered(evt);
            }
        });
        taspanel.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(824, 100, 40, 40));

        txtdate.setBackground(new java.awt.Color(255, 255, 255));
        txtdate.setEnabled(false);
        txtdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateActionPerformed(evt);
            }
        });
        taspanel.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 212, 27));

        jLabel42.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel42.setForeground(java.awt.Color.black);
        jLabel42.setText("Pegawai");
        taspanel.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 60, 20));

        jLabel43.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel43.setForeground(java.awt.Color.black);
        jLabel43.setText("Harga Jual");
        taspanel.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, -1, -1));

        jLabel44.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel44.setForeground(java.awt.Color.black);
        jLabel44.setText("Merk");
        taspanel.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 40, 20));

        txtpenjualan.setBackground(new java.awt.Color(255, 255, 255));
        txtpenjualan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtpenjualan.setEnabled(false);
        txtpenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpenjualanActionPerformed(evt);
            }
        });
        taspanel.add(txtpenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 212, 27));

        jLabel45.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel45.setForeground(java.awt.Color.black);
        jLabel45.setText("ID Number");
        taspanel.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 80, 20));

        btndeletetas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btndeletetas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Sale/Group 13.png"))); // NOI18N
        btndeletetas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndeletetas1MouseClicked(evt);
            }
        });
        taspanel.add(btndeletetas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(10, 189, 227));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Buy Bag");
        taspanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        mainpanel.add(taspanel, "card9");

        keranjangpanel.setBackground(new java.awt.Color(255, 255, 255));
        keranjangpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelkeranjang.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelkeranjang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelkeranjangMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelkeranjang);

        keranjangpanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 660, 120));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Buy/Line 3.png"))); // NOI18N
        keranjangpanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 85, -1, -1));

        btndeletetas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btndeletetas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Sale/Group 13.png"))); // NOI18N
        btndeletetas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndeletetasMouseClicked(evt);
            }
        });
        keranjangpanel.add(btndeletetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, -1, -1));

        btntransaksi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btntransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Buy/Group 11.png"))); // NOI18N
        btntransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntransaksiMouseClicked(evt);
            }
        });
        keranjangpanel.add(btntransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, -1, -1));

        jLabel38.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel38.setForeground(java.awt.Color.black);
        jLabel38.setText("Name ");
        keranjangpanel.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 100, 30));

        txtTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtTotal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setEnabled(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        keranjangpanel.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 270, 70));

        jLabel39.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel39.setForeground(java.awt.Color.black);
        jLabel39.setText("Bayar");
        keranjangpanel.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, -1));

        txtpembeli.setBackground(new java.awt.Color(255, 255, 255));
        txtpembeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpembeliActionPerformed(evt);
            }
        });
        keranjangpanel.add(txtpembeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 212, 27));

        rdmale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rdmale);
        rdmale.setForeground(new java.awt.Color(0, 0, 0));
        rdmale.setText("Male");
        rdmale.setBorder(null);
        rdmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdmaleActionPerformed(evt);
            }
        });
        keranjangpanel.add(rdmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 50, 30));

        rdfemale.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rdfemale);
        rdfemale.setForeground(new java.awt.Color(0, 0, 0));
        rdfemale.setText("Female");
        rdfemale.setBorder(null);
        rdfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdfemaleActionPerformed(evt);
            }
        });
        keranjangpanel.add(rdfemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 90, 30));

        jLabel40.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel40.setForeground(java.awt.Color.black);
        jLabel40.setText("Gender");
        keranjangpanel.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));

        jLabel41.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel41.setForeground(java.awt.Color.black);
        jLabel41.setText("Kembalian");
        keranjangpanel.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, -1, -1));

        btntotal.setBackground(java.awt.Color.blue);
        btntotal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btntotal.setForeground(java.awt.Color.black);
        btntotal.setText("Total");
        btntotal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btntotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntotalMouseClicked(evt);
            }
        });
        keranjangpanel.add(btntotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));

        pegawaitxt.setBackground(new java.awt.Color(255, 255, 255));
        pegawaitxt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pegawaitxt.setEnabled(false);
        pegawaitxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegawaitxtActionPerformed(evt);
            }
        });
        keranjangpanel.add(pegawaitxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, 212, 27));

        txtalamat.setBackground(new java.awt.Color(255, 255, 255));
        txtalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalamatActionPerformed(evt);
            }
        });
        keranjangpanel.add(txtalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 212, 27));

        txtbayar.setBackground(new java.awt.Color(255, 255, 255));
        txtbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbayarActionPerformed(evt);
            }
        });
        keranjangpanel.add(txtbayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 212, 27));

        jLabel47.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel47.setForeground(java.awt.Color.black);
        jLabel47.setText("Alamat");
        keranjangpanel.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(10, 189, 227));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Check Out");
        keranjangpanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        mainpanel.add(keranjangpanel, "card6");

        transaksipanel.setBackground(new java.awt.Color(255, 255, 255));
        transaksipanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabletransaksi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(tabletransaksi);

        transaksipanel.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 640, 300));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(10, 189, 227));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Detail Transaksi");
        transaksipanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Buy/Line 3.png"))); // NOI18N
        transaksipanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 85, -1, -1));

        mainpanel.add(transaksipanel, "card7");

        sepatupanel.setBackground(new java.awt.Color(255, 255, 255));
        sepatupanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Buy/Line 3.png"))); // NOI18N
        sepatupanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 85, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(10, 189, 227));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Buy Shoes");
        sepatupanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        tblsepatu.setModel(new javax.swing.table.DefaultTableModel(
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
        tblsepatu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsepatuMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblsepatu);

        sepatupanel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 730, 120));

        txthargajual1.setBackground(new java.awt.Color(255, 255, 255));
        txthargajual1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txthargajual1.setEnabled(false);
        txthargajual1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargajual1ActionPerformed(evt);
            }
        });
        sepatupanel.add(txthargajual1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 212, 27));

        txtmerk1.setBackground(new java.awt.Color(255, 255, 255));
        txtmerk1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtmerk1.setEnabled(false);
        txtmerk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmerk1ActionPerformed(evt);
            }
        });
        sepatupanel.add(txtmerk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 212, 27));

        jLabel33.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel33.setForeground(java.awt.Color.black);
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Date");
        sepatupanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 90, 30));

        txtharga1.setBackground(new java.awt.Color(255, 255, 255));
        txtharga1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtharga1ActionPerformed(evt);
            }
        });
        sepatupanel.add(txtharga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 212, 27));

        txtpegawai2.setBackground(new java.awt.Color(255, 255, 255));
        txtpegawai2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtpegawai2.setEnabled(false);
        txtpegawai2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpegawai2ActionPerformed(evt);
            }
        });
        sepatupanel.add(txtpegawai2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 212, 27));

        jLabel36.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel36.setForeground(java.awt.Color.black);
        jLabel36.setText("ID Penjualan Tas");
        sepatupanel.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 120, 30));

        addkeranjang1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/SEARCH/Group 11.png"))); // NOI18N
        addkeranjang1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addkeranjang1MouseClicked(evt);
            }
        });
        sepatupanel.add(addkeranjang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, -1, -1));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Buy/Total Bag _.png"))); // NOI18N
        sepatupanel.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Sale/Price _.png"))); // NOI18N
        sepatupanel.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        txtjumlahbarang1.setBackground(new java.awt.Color(255, 255, 255));
        txtjumlahbarang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlahbarang1ActionPerformed(evt);
            }
        });
        sepatupanel.add(txtjumlahbarang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 212, 27));

        txtnumber1.setBackground(new java.awt.Color(255, 255, 255));
        txtnumber1.setEnabled(false);
        txtnumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumber1ActionPerformed(evt);
            }
        });
        sepatupanel.add(txtnumber1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 212, 27));

        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Buy/arrow-left.png"))); // NOI18N
        jLabel50.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel50MouseClicked(evt);
            }
        });
        sepatupanel.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(824, 100, 40, 40));

        txtdate1.setBackground(new java.awt.Color(255, 255, 255));
        txtdate1.setEnabled(false);
        txtdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdate1ActionPerformed(evt);
            }
        });
        sepatupanel.add(txtdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 212, 27));

        jLabel51.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel51.setForeground(java.awt.Color.black);
        jLabel51.setText("Pegawai");
        sepatupanel.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 60, 20));

        jLabel52.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel52.setForeground(java.awt.Color.black);
        jLabel52.setText("Harga Jual");
        sepatupanel.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, -1, -1));

        jLabel53.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel53.setForeground(java.awt.Color.black);
        jLabel53.setText("Merk");
        sepatupanel.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 40, 20));

        txtpenjualan1.setBackground(new java.awt.Color(255, 255, 255));
        txtpenjualan1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtpenjualan1.setEnabled(false);
        txtpenjualan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpenjualan1ActionPerformed(evt);
            }
        });
        sepatupanel.add(txtpenjualan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 212, 27));

        jLabel54.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel54.setForeground(java.awt.Color.black);
        jLabel54.setText("ID Number");
        sepatupanel.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 80, 20));

        btndeletetas2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btndeletetas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Sale/Group 13.png"))); // NOI18N
        btndeletetas2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndeletetas2MouseClicked(evt);
            }
        });
        sepatupanel.add(btndeletetas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, -1, -1));

        mainpanel.add(sepatupanel, "card8");

        Body.add(mainpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 940, 540));

        getContentPane().add(Body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1199, 541));

        setSize(new java.awt.Dimension(1215, 580));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnhomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhomeMouseEntered
        btnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Menu/Dashboard.png")));
    }//GEN-LAST:event_btnhomeMouseEntered

    private void btnhomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhomeMouseExited
        btnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Menu/btn Home.png")));
    }//GEN-LAST:event_btnhomeMouseExited

    private void btnsaleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaleMouseEntered
        btnsale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Menu/btn Sale.png")));
    }//GEN-LAST:event_btnsaleMouseEntered

    private void btnsaleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaleMouseExited
        btnsale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Menu/btn Sale1.png")));
    }//GEN-LAST:event_btnsaleMouseExited

    private void btnbuyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbuyMouseEntered
        btnbuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Menu/btn Buy.png")));
    }//GEN-LAST:event_btnbuyMouseEntered

    private void btnbuyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbuyMouseExited
        btnbuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tugas_Akhir/Menu/btn buy1.png")));
    }//GEN-LAST:event_btnbuyMouseExited

    private void btnhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhomeMouseClicked
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();
        //add panel
        mainpanel.add(Homepanel);
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_btnhomeMouseClicked

    private void btnsaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaleMouseClicked
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();
        //add panel
        mainpanel.add(Salepanel);
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_btnsaleMouseClicked

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

    private void txtstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstockActionPerformed

    private void txtidnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidnumberActionPerformed

    private void txtcollorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcollorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcollorActionPerformed

    private void txtbrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbrandActionPerformed

    private void btnbuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbuyMouseClicked
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();
        //add panel
        mainpanel.add(buypanel);
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_btnbuyMouseClicked

    private void btnshoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnshoesMouseClicked
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();
        //add panel
        mainpanel.add(sepatupanel);
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_btnshoesMouseClicked

    private void btnkeranjangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkeranjangMouseClicked
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();
        //add panel
        mainpanel.add(keranjangpanel);
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_btnkeranjangMouseClicked

    private void btnaboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaboutMouseClicked
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();
        //add panel
        mainpanel.add(transaksipanel);
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_btnaboutMouseClicked

    private void btnexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexitMouseClicked
        int dialogBtn = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Attention", "Are you sure want to logout?", dialogBtn);
        if (dialogResult == 0) {
            System.exit(0);
        } else {

        }
    }//GEN-LAST:event_btnexitMouseClicked

    private void txtpegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpegawaiActionPerformed

    private void cbsizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbsizeActionPerformed

    private void txthargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargaActionPerformed

    private void txtpegawai1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpegawai1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpegawai1ActionPerformed

    private void txtjumlahbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlahbarangActionPerformed
        tambahTransaksitas();
    }//GEN-LAST:event_txtjumlahbarangActionPerformed

    private void txtnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumberActionPerformed

    private void txthargajualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargajualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargajualActionPerformed

    private void txtmerkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmerkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmerkActionPerformed

    private void btnbagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbagMouseClicked
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();
        //add panel
        mainpanel.add(taspanel);
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_btnbagMouseClicked

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
        // TODO add your handling code here:
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();
        //add panel
        mainpanel.add(buypanel);
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_jLabel37MouseClicked

    private void tabelbuytasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelbuytasMouseClicked
        int baris = tabelbuytas.rowAtPoint(evt.getPoint());
        String hargajual = tabelbuytas.getValueAt(baris, 8).toString();
        txthargajual.setText(hargajual);
        String idnumber = tabelbuytas.getValueAt(baris, 5).toString();
        txtnumber.setText(idnumber);
        String merk = tabelbuytas.getValueAt(baris, 7).toString();
        txtmerk.setText(merk);
        String pegawai = tabelbuytas.getValueAt(baris, 1).toString();
        txtpegawai1.setText(pegawai);

    }//GEN-LAST:event_tabelbuytasMouseClicked

    private void txtdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdateActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtpembeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpembeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpembeliActionPerformed

    private void rdmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdmaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdmaleActionPerformed

    private void rdfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdfemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdfemaleActionPerformed

    private void txtpenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpenjualanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpenjualanActionPerformed

    private void addkeranjangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addkeranjangMouseClicked
        DefaultTableModel model = (DefaultTableModel) tabelkeranjang.getModel();
        String date = txtdate.getText();
        String idnumber = txtnumber.getText();
        String jumlah = txtjumlahbarang.getText();
        String harga = txtharga.getText();
        String hargajual = txthargajual.getText();
        String merk = txtmerk.getText();
        String penjualan = txtpenjualan.getText();
        String pegawai = txtpegawai1.getText();

        Penjualan_Tas T = new Penjualan_Tas();
        T.addPenjualan_Tas(date, idnumber, hargajual, merk, penjualan, pegawai, jumlah, harga);

        try {
            String sql = "INSERT INTO keranjang VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, date);
            p.setString(2, idnumber);
            p.setString(3, jumlah);
            p.setString(4, harga);
            p.setString(5, hargajual);
            p.setString(6, merk);
            p.setString(7, penjualan);
            p.setString(8, pegawai);
            p.executeUpdate();
            JOptionPane.showMessageDialog(null, "Your Request Process Was Successful..");
            p.close();
        } catch (Exception e) {
            System.out.println("Tambahkan ke keranjang error");
        }
        clear3();
        autonumbertas();
    }//GEN-LAST:event_addkeranjangMouseClicked

    private void pegawaitxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegawaitxtActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_pegawaitxtActionPerformed

    private void txtalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalamatActionPerformed

    private void txtbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbayarActionPerformed
        // TODO add your handling code here:
        int jumlahBaris = tabelkeranjang.getRowCount();
        int totalBiaya = 0;
        int jumlahBarang, hargaBarang;
        for (int i = 0; i < jumlahBaris; i++) {
            jumlahBarang = Integer.parseInt(tabelkeranjang.getValueAt(i, 2).toString());
            hargaBarang = Integer.parseInt(tabelkeranjang.getValueAt(i, 4).toString());
            totalBiaya = totalBiaya + (jumlahBarang * hargaBarang);
        }
        int total, bayar, kembalian;
        total = totalBiaya;
        bayar = Integer.valueOf(txtbayar.getText());

        if (total > bayar) {
            JOptionPane.showMessageDialog(null, "Uang tidak cukup untuk melakukan pembayaran");
        } else {
            kembalian = bayar - total;
            pegawaitxt.setText(String.valueOf(kembalian));
        }
    }//GEN-LAST:event_txtbayarActionPerformed

    private void btndeletetasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeletetasMouseClicked
        DefaultTableModel model = (DefaultTableModel) tabelkeranjang.getModel();
        int row = tabelkeranjang.getSelectedRow();
        model.removeRow(row);
        totalBiaya();
        txtbayar.setText("0");
        pegawaitxt.setText("0");

    }//GEN-LAST:event_btndeletetasMouseClicked

    private void btnsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaveMouseClicked

        try {
            tambahkansale();
            tabelsale();
            JOptionPane.showMessageDialog(null, "Data saved successfully..");
        } catch (Exception e) {
        }
        tambahkantas();
        tambahkansepatu();
    }//GEN-LAST:event_btnsaveMouseClicked

    private void tabelkeranjangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelkeranjangMouseClicked

    }//GEN-LAST:event_tabelkeranjangMouseClicked

    private void btntransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntransaksiMouseClicked

        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("No");
        tbl.addColumn("Name");
        tbl.addColumn("Gender");
        tbl.addColumn("Employee");
        tbl.addColumn("Address");
        tbl.addColumn("Total");
        tbl.addColumn("Bayar");

        try {
            int no = 1;
            addPembeli();
            //Merk and idnumber not same
            String sql = "SELECT * FROM transaksi";
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                tbl.addRow(new Object[]{no++, rs.getString(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5)});
            }
            tabletransaksi.setModel(tbl);

        } catch (Exception e) {
            System.out.println("Gagal Menyimpan " + e.getMessage());
        }
        Keranjang();
    }//GEN-LAST:event_btntransaksiMouseClicked

    private void btndeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeleteMouseClicked

        DefaultTableModel model = (DefaultTableModel) tblsale.getModel();
        int row = tblsale.getSelectedRow();
        model.removeRow(row);
        Jenis J = new Jenis();
        J.deleteJenis(txtbrand.getText());
        JOptionPane.showMessageDialog(null, "Berhasil Menghapus");
        tambahkansearch();
        tambahkantas();
        tambahkansepatu();
    }//GEN-LAST:event_btndeleteMouseClicked

    private void btndeletetas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeletetas1MouseClicked
        DefaultTableModel model = (DefaultTableModel) tabelbuytas.getModel();
        int row = tabelbuytas.getSelectedRow();
        model.removeRow(row);
        try {
            String sql = "DELETE FROM sale WHERE employee ='" + txtpegawai1.getText() + "'";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Menghapus");
        } catch (Exception e) {
        }
        tambahkansearch();
        tambahkantas();
        tambahkansepatu();
    }//GEN-LAST:event_btndeletetas1MouseClicked

    private void txthargajual1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargajual1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargajual1ActionPerformed

    private void txtmerk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmerk1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmerk1ActionPerformed

    private void txtharga1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtharga1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtharga1ActionPerformed

    private void txtpegawai2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpegawai2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpegawai2ActionPerformed

    private void addkeranjang1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addkeranjang1MouseClicked
        DefaultTableModel model = (DefaultTableModel) tabelkeranjang.getModel();
        String date = txtdate1.getText();
        String idnumber = txtnumber1.getText();
        String jumlah = txtjumlahbarang1.getText();
        String harga = txthargajual.getText();
        String hargajual = txtharga1.getText();
        String merk = txtmerk1.getText();
        String penjualan = txtpenjualan1.getText();
        String pegawai = txtpegawai2.getText();

        Penjualan_Sepatu PS = new Penjualan_Sepatu();
        PS.addPenjualan_Sepatu(date, idnumber, hargajual, merk, penjualan, pegawai, jumlah, harga);

        try {
            String sql = "INSERT INTO keranjang VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, date);
            p.setString(2, idnumber);
            p.setString(3, jumlah);
            p.setString(4, harga);
            p.setString(5, hargajual);
            p.setString(6, merk);
            p.setString(7, penjualan);
            p.setString(8, pegawai);
            p.executeUpdate();
            JOptionPane.showMessageDialog(null, "Your Request Process Was Successful..");
            p.close();
        } catch (Exception e) {
            System.out.println("Tambahkan ke keranjang error");
        }

        clear2();
        autonumber();
    }//GEN-LAST:event_addkeranjang1MouseClicked

    private void txtjumlahbarang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlahbarang1ActionPerformed
        tambahTransaksi();
    }//GEN-LAST:event_txtjumlahbarang1ActionPerformed

    private void txtnumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumber1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumber1ActionPerformed

    private void jLabel50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseClicked
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();
        //add panel
        mainpanel.add(buypanel);
        mainpanel.repaint();
        mainpanel.revalidate();
    }//GEN-LAST:event_jLabel50MouseClicked

    private void txtdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdate1ActionPerformed

    private void txtpenjualan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpenjualan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpenjualan1ActionPerformed

    private void btndeletetas2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeletetas2MouseClicked
        DefaultTableModel model = (DefaultTableModel) tblsepatu.getModel();
        int row = tblsepatu.getSelectedRow();
        model.removeRow(row);
        try {
            String sql = "DELETE FROM sale WHERE employee ='" + txtpegawai2.getText() + "'";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Menghapus");
        } catch (Exception e) {
        }
        tambahkansearch();
        tambahkantas();
        tambahkansepatu();
    }//GEN-LAST:event_btndeletetas2MouseClicked

    private void tblsepatuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsepatuMouseClicked
        int baris = tblsepatu.rowAtPoint(evt.getPoint());
        String hargajual = tblsepatu.getValueAt(baris, 8).toString();
        txthargajual1.setText(hargajual);
        String idnumber = tblsepatu.getValueAt(baris, 5).toString();
        txtnumber1.setText(idnumber);
        String merk = tblsepatu.getValueAt(baris, 7).toString();
        txtmerk1.setText(merk);

        String pegawai = tblsepatu.getValueAt(baris, 1).toString();
        txtpegawai2.setText(pegawai);
    }//GEN-LAST:event_tblsepatuMouseClicked

    private void btntotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntotalMouseClicked

    }//GEN-LAST:event_btntotalMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked


    }//GEN-LAST:event_jLabel7MouseClicked

    private void btneditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditMouseClicked

        String type = null;
        if (radiobtnbag.isSelected()) {
            type = "Bag";
        } else if (radiobtnshoes.isSelected()) {
            type = "Shoes";
        }

        try {
            int no = 1;
            //Merk and idnumber not same
            String sql = "UPDATE sale SET employee='" + txtpegawai.getText() + "', type = '"
                    + type + "', stock = '" + txtstock.getText() + "', size = '"
                    + cbsize.getSelectedItem() + "', id_number = '" + txtidnumber.getText() + "', color = '"
                    + txtcollor.getText() + "', brand = '" + txtbrand.getText() + "', price = '" + txtprice.getText() + "'"
                    + "WHERE employee = '" + txtpegawai.getText() + "'";;
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Edited Successfully..");
            hapussale();
        } catch (Exception e) {
            System.out.println("Gagal Menyimpan " + e.getMessage());
        }
        tambahkansearch();
        tambahkantas();
        tambahkansepatu();
    }//GEN-LAST:event_btneditMouseClicked

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        try {
            tambahkansearch();
        } catch (Exception ex) {
            System.out.println("eror : " + ex);
        }
    }//GEN-LAST:event_txtsearchActionPerformed

    private void txtsearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearch1ActionPerformed
        try {
            tambahkansearch();
            JOptionPane.showMessageDialog(null, "Data ditemukan..");
            txtsearch1.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data tydack ditemukan..");
        }
    }//GEN-LAST:event_txtsearch1ActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel19MouseClicked

    private void tblsaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsaleMouseClicked
        int baris = tblsale.rowAtPoint(evt.getPoint());
        String pegawai = tblsale.getValueAt(baris, 1).toString();
        txtpegawai.setText(pegawai);
        if ("Bag".equals(tblsale.getValueAt(baris, 2))) {
            radiobtnbag.setSelected(true);
        } else if ("Shoes".equals(tblsale.getValueAt(baris, 2))) {
            radiobtnshoes.setSelected(true);
        }
        String stock = tblsale.getValueAt(baris, 3).toString();
        txtstock.setText(stock);
        String id = tblsale.getValueAt(baris, 5).toString();
        txtidnumber.setText(id);
        String size = tblsale.getValueAt(baris, 4).toString();
        cbsize.setSelectedItem(size);
        String color = tblsale.getValueAt(baris, 6).toString();
        txtcollor.setText(color);
        String merek = tblsale.getValueAt(baris, 7).toString();
        txtbrand.setText(merek);
        String price = tblsale.getValueAt(baris, 8).toString();
        txtprice.setText(price);
    }//GEN-LAST:event_tblsaleMouseClicked

    private void btnresetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnresetMouseClicked
        try {
            hapussale();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnresetMouseClicked

    private void jLabel37MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel37MouseEntered

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });

    }

//    //Jenis
//    class Jenis {
//
//        public Jenis() throws SQLException {
//            super();
//        }
//
//        public String addJenis() throws SQLException {
//            String type = null;
//            if (radiobtnbag.isSelected()) {
//                type = "Bag";
//            } else if (radiobtnshoes.isSelected()) {
//                type = "Shoes";
//            }
//            return type;
//        }
//
    //Tabel Sale
    public void tabelsale() throws SQLException {

        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("No");
        tbl.addColumn("Employee");
        tbl.addColumn("Type");
        tbl.addColumn("Stock");
        tbl.addColumn("Size");
        tbl.addColumn("ID Number");
        tbl.addColumn("Color");
        tbl.addColumn("Brand");
        tbl.addColumn("Price");

        try {
            int no = 1;
            String sql = "SELECT * FROM sale";
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                tbl.addRow(new Object[]{no++, rs.getString(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5), rs.getString(6),
                    rs.getString(7), rs.getString(8)});
            }
            tblsale.setModel(tbl);
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
//
//        //Hapus layar sale
//        public void deleteJenis() throws SQLException {
//            txtpegawai.setEditable(true);
//            txtpegawai.setText(null);
//            buttonGroup1.clearSelection();
//            txtstock.setText(null);
//            cbsize.setSelectedItem(this);
//            txtidnumber.setText(null);
//            txtcollor.setText(null);
//            txtbrand.setText(null);
//            txtprice.setText(null);
//        }
//    }
//
//    //Sepatu
//    class Sepatu {
//
//        merk m = new merk();
//        Jenis j = new Jenis();
//
//        public Sepatu() throws SQLException {
//            super();
//        }
//
//        //Add Sepatu in Sale
//        public void addSepatu() throws SQLException {
//            try {
//                String sql = "INSERT INTO sale VALUES ('" + txtpegawai.getText()
//                        + "','" + j.addJenis() + "','" + txtstock.getText() + "','" + cbsize.getSelectedItem() + "','"
//                        + txtidnumber.getText() + "','" + txtcollor.getText() + "','"
//                        + m.addmerk() + "','" + txtprice.getText() + "')";
//                java.sql.PreparedStatement pstm = con.prepareStatement(sql);
//                pstm.execute();
//                j.ResultSetgetJenis();
//                m.ResultSetgetmerk();
//                ResultSetgetSepatu();
//            } catch (Exception e) {
//                System.out.println("Gagal Menyimpan " + e.getMessage());
//            }
//        }
//
//        //Tabel Buy Sepatu
//        public void ResultSetgetSepatu() throws SQLException {
//
//            DefaultTableModel tbl = new DefaultTableModel();
//            tbl.addColumn("No.");
//            tbl.addColumn("Employee");
//            tbl.addColumn("Type");
//            tbl.addColumn("Stock");
//            tbl.addColumn("Size");
//            tbl.addColumn("ID Number");
//            tbl.addColumn("Color");
//            tbl.addColumn("Brand");
//            tbl.addColumn("Price");
//
//            try {
//                int no = 1;
//                String sql = "SELECT * FROM sale WHERE type = 'Shoes' ";
//                st = con.createStatement();
//                ResultSet rs = st.executeQuery(sql);
//
//                while (rs.next()) {
//                    tbl.addRow(new Object[]{no++, rs.getString(1), rs.getString(2), rs.getString(3),
//                        rs.getString(4), rs.getString(5), rs.getString(6),
//                        rs.getString(7), rs.getString(8)});
//                }
//
//                tblsepatu.setModel(tbl);
//            } catch (Exception e) {
//                System.out.println("Gagal Menyimpan" + e.getMessage());
//            }
//        }
//
//        public void deleteSepatu() throws Exception {
//            try {
//                String sql = "DELETE FROM sale WHERE size = '" + cbsize.getSelectedItem() + "'";
//                PreparedStatement pst = con.prepareStatement(sql);
//                pst.execute();
//                JOptionPane.showMessageDialog(null, "Berhasil Menghapus");
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(Body, e.getMessage());
//            }
//        }
//    }
//
//    //Tas
//    class Tas {
//
//        merk m = new merk();
//        Jenis j = new Jenis();
//
//        public Tas() throws SQLException {
//            super();
//        }
//
//        //add Tas in Sale
//        public void addTas() throws SQLException {
//            try {
//                String sql = "INSERT INTO sale VALUES ('" + txtpegawai.getText()
//                        + "','" + j.addJenis() + "','" + txtstock.getText() + "','" + cbsize.getSelectedItem() + "','"
//                        + txtidnumber.getText() + "','" + txtcollor.getText() + "','"
//                        + m.addmerk() + "','" + txtprice.getText() + "')";
//                java.sql.PreparedStatement pstm = con.prepareStatement(sql);
//                pstm.execute();
//                JOptionPane.showMessageDialog(null, "Berhasil Menyimpan");
//                m.ResultSetgetmerk();
//                j.ResultSetgetJenis();
//                ResultSetgetTas();
//            } catch (Exception e) {
//                System.out.println("Gagal Menyimpan" + e.getMessage());
//            }
//        }
//
//        //Tabel buy Tas
//        public void ResultSetgetTas() throws SQLException {
//            DefaultTableModel tbl = new DefaultTableModel();
//            tbl.addColumn("No.");
//            tbl.addColumn("Employee");
//            tbl.addColumn("Type");
//            tbl.addColumn("Stock");
//            tbl.addColumn("Size");
//            tbl.addColumn("ID Number");
//            tbl.addColumn("Color");
//            tbl.addColumn("Brand");
//            tbl.addColumn("Price");
//
//            try {
//                int no = 1;
//
//                String sql = "SELECT * FROM sale WHERE type = 'Bag' ";
//                st = con.createStatement();
//                ResultSet rs = st.executeQuery(sql);
//
//                while (rs.next()) {
//                    tbl.addRow(new Object[]{no++, rs.getString(1), rs.getString(2), rs.getString(3),
//                        rs.getString(4), rs.getString(5), rs.getString(6),
//                        rs.getString(7), rs.getString(8)});
//                }
//                tabelbuytas.setModel(tbl);
//            } catch (Exception e) {
//                System.out.println("Gagal Menyimpan" + e.getMessage());
//            }
//        }
//
//        //delete in tabel buy Tas
//        public void deleteTas() throws Exception {
//            try {
//                String sql = "DELETE * FROM sale WHERE type = 'Bag' ";
//                PreparedStatement pst = con.prepareStatement(sql);
//                pst.execute();
//                JOptionPane.showMessageDialog(null, "Berhasil Menghapus");
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(Body, e.getMessage());
//            }
//
//            m.ResultSetgetmerk();
//            j.ResultSetgetJenis();
//            ResultSetgetTas();
//        }
//    }
//
//    //Penjualan Sepatu
//    class Penjualan_Sepatu {
//
//        public Penjualan_Sepatu() throws SQLException {
//            super();
//        }
//
//        //add sepatu in cart
//        public void addPenjualanSepatu() throws SQLException {
//            try {
//                String sql = "INSERT INTO keranjang VALUES ('"
//                        + txtdate1.getText() + "','"
//                        + txtnumber1.getText() + "','"
//                        + txtjumlahbarang1.getText() + "','"
//                        + txtharga1.getText() + "','"
//                        + txthargajual1.getText() + "','"
//                        + txtmerk1.getText() + "','"
//                        + txtpenjualan1.getText() + "','"
//                        + txtpegawai2.getText() + "')";
//                PreparedStatement pstm = con.prepareStatement(sql);
//                pstm.execute();
//                JOptionPane.showMessageDialog(Body, "BARANG TELAH MASUK KERANJANG");
//                ResultSetgetPenjualanSepatu();
//            } catch (Exception e) {
//                System.out.println("Error " + e.getMessage());
//            }
//        }
//
//        //tabel keranjang
//        public void ResultSetgetPenjualanSepatu() throws SQLException {
//            DefaultTableModel model = new DefaultTableModel();
//            model.addColumn("No");
//            model.addColumn("Date");
//            model.addColumn("ID Number");
//            model.addColumn("Harga");
//            model.addColumn("Sub Total");
//            model.addColumn("Harga Jual");
//            model.addColumn("Merk");
//            model.addColumn("ID Penjualan");
//            model.addColumn("Pegawai");
//
//            try {
//                int no = 1;
//                int baris = tabelkeranjang.getRowCount();
//                for (int i = 0; i < baris; i++) {
//                    String sql = "SELECT * FROM keranjang WHERE Date = '"
//                            + tabelkeranjang.getValueAt(i, 0) + "','" + tabelkeranjang.getValueAt(i, 1) + "','" + tabelkeranjang.getValueAt(i, 2)
//                            + "','" + tabelkeranjang.getValueAt(i, 3) + "','" + tabelkeranjang.getValueAt(i, 4) + "','" + tabelkeranjang.getValueAt(i, 5)
//                            + "','" + tabelkeranjang.getValueAt(i, 6) + "','" + tabelkeranjang.getValueAt(i, 7) + "','" + tabelkeranjang.getValueAt(i, 8) + "'";
//                    st = con.createStatement();
//                    ResultSet rs = st.executeQuery(sql);
//                    while (rs.next()) {
//                        model.addRow(new Object[]{no++, rs.getString(1), rs.getString(2),
//                            rs.getString(3), rs.getString(4), rs.getString(5),
//                            rs.getString(6), rs.getString(7), rs.getString(8)});
//                    }
//                }
//                tabelkeranjang.setModel(model);
//
//            } catch (Exception e) {
//                System.out.println("Error " + e.getMessage());
//            }
//        }
//
//        //delete kerajang btn buy sepatu
//        public void deletePenjualanSepatu() throws SQLException {
//
//        }
//
//        public void idPenjualanSepatu() throws SQLException {
//            txtidnumber.getText();
//        }
//    }
//
//    //Penjualan Tas
//    class Penjualan_Tas {
//
//        public Penjualan_Tas() throws SQLException {
//            super();
//        }
//
//        //add tas in cart
//        public void addPenjualanTas() throws SQLException {
//            try {
//
//                String sql = "INSERT INTO keranjang VALUES ('"
//                        + txtdate.getText() + "','"
//                        + txtnumber.getText() + "','"
//                        + txtjumlahbarang.getText() + "','"
//                        + txtharga.getText() + "','"
//                        + txthargajual.getText() + "','"
//                        + txtmerk.getText() + "','"
//                        + txtpenjualan.getText() + "','"
//                        + txtpegawai1.getText() + "')";
//                PreparedStatement pstm = con.prepareStatement(sql);
//                pstm.execute();
//
//                JOptionPane.showMessageDialog(Body, "BARANG TELAH MASUK KERANJANG");
//                ResultSetgetPenjualanTas();
//            } catch (Exception e) {
//                System.out.println("Error " + e.getMessage());
//            }
//        }
//
//
//        //delete tabel in buy tas
//        public void deletePenjualanTas() throws SQLException {
//
//        }
//
//    }
//
//    //Pegawai
//    class Pegawai {
//
//        Penjualan_Sepatu s = new Penjualan_Sepatu();
//        Penjualan_Tas t = new Penjualan_Tas();
//
//        public Pegawai() throws SQLException {
//            super();
//        }
//
    //identity pembeli in cart

    public void addPembeli() throws SQLException {
        String Gender = null;
        if (rdmale.isSelected()) {
            Gender = "Male";
        } else if (rdfemale.isSelected()) {
            Gender = "Female";
        }
        Pembeli P = new Pembeli();
        P.addpembeli(txtpembeli.getText(), Gender, txtpegawai.getText(), txtTotal.getText(), txtalamat.getText(), txtbayar.getText());
        try {
            String sql = "INSERT INTO transaksi VALUES ('"
                    + txtpembeli.getText() + "','"
                    + Gender + "','"
                    + txtpegawai.getText() + "','"
                    + txtalamat.getText() + "','"
                    + txtTotal.getText() + "','"
                    + txtbayar.getText() + "')";
            st = con.createStatement();
            int SA = st.executeUpdate(sql);
            JOptionPane.showMessageDialog(Body, "Terima Kasih Telah Membeli Barang Kami");
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
//
//        //tabel transaksi
//        public void ResultSetgetPembeli() {
//            DefaultTableModel model = new DefaultTableModel();
//            model.addColumn("No");
//            model.addColumn("Name");
//            model.addColumn("Gender");
//            model.addColumn("Employee");
//            model.addColumn("Address");
//            model.addColumn("Total");
//            model.addColumn("Bayar");
//
//            try {
//                int no = 1;
//                String sql = "SELECT * FROM transaksi";
//                st = con.createStatement();
//                ResultSet rs = st.executeQuery(sql);
//                while (rs.next()) {
//                    model.addRow(new Object[]{no++, rs.getString(1), rs.getString(2),
//                        rs.getString(3), rs.getString(4), rs.getString(5),
//                        rs.getString(6)});
//                }
//                tabletransaksi.setModel(model);
//            } catch (Exception e) {
//                System.out.println("Error " + e.getMessage());
//            }
//        }
//
//    }
//
//    //Merk
//    class merk {
//
//        public merk() throws SQLException {
//            super();
//        }
//
//        //add merek in sale
//        public String addmerk() throws SQLException {
//            String merek = txtbrand.getText();
//            return merek;
//        }
//
//        //tabel search
//        public void ResultSetgetmerk() throws SQLException {
//
//            DefaultTableModel tb2 = new DefaultTableModel();
//            tb2.addColumn("No");
//            tb2.addColumn("Employee");
//            tb2.addColumn("Type");
//            tb2.addColumn("Stock");
//            tb2.addColumn("Size");
//            tb2.addColumn("ID Number");
//            tb2.addColumn("Color");
//            tb2.addColumn("Brand");
//            tb2.addColumn("Price");
//
//            try {
//                int no = 1;
//                String sql = "SELECT * FROM sale WHERE employee like '%" + txtsearch.getText() + "%'"
//                        + "or type like '%" + txtsearch.getText() + "%'"
//                        + "or stock like '%" + txtsearch.getText() + "%'"
//                        + "or size like '%" + txtsearch.getText() + "%'"
//                        + "or id_number like '%" + txtsearch.getText() + "%'"
//                        + "or color like '%" + txtsearch.getText() + "%'"
//                        + "or brand like '%" + txtsearch.getText() + "%'"
//                        + "or price like '%" + txtsearch.getText() + "%'";
//
//                st = con.createStatement();
//                ResultSet rs = st.executeQuery(sql);
//                while (rs.next()) {
//                    tb2.addRow(new Object[]{no++, rs.getString(1), rs.getString(2),
//                        rs.getString(3), rs.getString(4), rs.getString(5),
//                        rs.getString(6), rs.getString(7), rs.getString(8)});
//                    tabelpersediaanbarang.setModel(tb2);
//                }
//            } catch (SQLException e) {
//                System.out.println("Error " + e.getMessage());
//            }
//        }
//
//        //hapus layar buy tas and sepatu
//        public void deletemerk() throws SQLException {
//            txtdate.setText(null);
//            txtnumber.setText(null);
//            txtjumlahbarang.setText(null);
//            txtharga.setText(null);
//            txthargajual.setText(null);
//            txtmerk.setText(null);
//            txtpenjualan.setText(null);
//            txtpegawai1.setText(null);
//
//            //Sepatu
//            txtdate1.setText(null);
//            txtnumber1.setText(null);
//            txtjumlahbarang1.setText(null);
//            txtharga1.setText(null);
//            txthargajual1.setText(null);
//            txtmerk1.setText(null);
//            txtpenjualan1.setText(null);
//            txtpegawai2.setText(null);
//        }
//
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JPanel Homepanel;
    private javax.swing.JPanel Menupanel;
    private javax.swing.JPanel Salepanel;
    private javax.swing.JPanel Searchpanel;
    private javax.swing.JLabel addkeranjang;
    private javax.swing.JLabel addkeranjang1;
    private javax.swing.JLabel btnabout;
    private javax.swing.JLabel btnaddcart;
    private javax.swing.JLabel btnbag;
    private javax.swing.JLabel btnbuy;
    private javax.swing.JLabel btndelete;
    private javax.swing.JLabel btndeletetas;
    private javax.swing.JLabel btndeletetas1;
    private javax.swing.JLabel btndeletetas2;
    private javax.swing.JLabel btnedit;
    private javax.swing.JLabel btnexit;
    private javax.swing.JLabel btnhome;
    private javax.swing.JLabel btnkeranjang;
    private javax.swing.JLabel btnreset;
    private javax.swing.JLabel btnsale;
    private javax.swing.JLabel btnsave;
    private javax.swing.JLabel btnshoes;
    private javax.swing.JLabel btntotal;
    private javax.swing.JLabel btntransaksi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel buypanel;
    private javax.swing.JComboBox<String> cbsize;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel keranjangpanel;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JTextField pegawaitxt;
    private javax.swing.JRadioButton radiobtnbag;
    private javax.swing.JRadioButton radiobtnshoes;
    private javax.swing.JRadioButton rdfemale;
    private javax.swing.JRadioButton rdmale;
    private javax.swing.JPanel sepatupanel;
    private javax.swing.JTable tabelbuytas;
    private javax.swing.JTable tabelkeranjang;
    private javax.swing.JTable tabelpersediaanbarang;
    private javax.swing.JTable tabletransaksi;
    private javax.swing.JPanel taspanel;
    private javax.swing.JTable tblsale;
    private javax.swing.JTable tblsepatu;
    private javax.swing.JPanel transaksipanel;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtbayar;
    private javax.swing.JTextField txtbrand;
    private javax.swing.JTextField txtcollor;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtdate1;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtharga1;
    private javax.swing.JTextField txthargajual;
    private javax.swing.JTextField txthargajual1;
    private javax.swing.JTextField txtidnumber;
    private javax.swing.JTextField txtjumlahbarang;
    private javax.swing.JTextField txtjumlahbarang1;
    private javax.swing.JTextField txtmerk;
    private javax.swing.JTextField txtmerk1;
    private javax.swing.JTextField txtnumber;
    private javax.swing.JTextField txtnumber1;
    private javax.swing.JTextField txtpegawai;
    private javax.swing.JTextField txtpegawai1;
    private javax.swing.JTextField txtpegawai2;
    private javax.swing.JTextField txtpembeli;
    private javax.swing.JTextField txtpenjualan;
    private javax.swing.JTextField txtpenjualan1;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtsearch1;
    private javax.swing.JTextField txtstock;
    // End of variables declaration//GEN-END:variables
}
