/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Akhir.Source_Code;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author NoteBook
 */
public class Sepatu {

    Merk m = new Merk();
    Jenis j = new Jenis();
    Pegawai p = new Pegawai();
    Koneksi K = new Koneksi();

    private String stock, size, id_number, color, price;
    Connection con = null;
    Statement st = null;

    public Sepatu() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tumbasriyen", "root", "");
            System.out.println("Berhasil");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    //Add Sepatu in Sale
    public void addSepatu(String pe, String jenis, String s, String sz, String merk, String id, String col, String pri) throws SQLException {
        p.setPegawai(pe);
        j.setaddJenis(jenis);
        this.stock = s;
        this.size = sz;
        m.setaddmerk(merk);
        this.id_number = id;
        this.color = col;

        String sql = "INSERT INTO sale VALUES ('" + pe + "','" + jenis + "','" + s + "','" + sz + "','" + id + "','" + col + "','" + merk + "','" + pri + "')";

        K.simpan(con, st, sql);
    }

    public void id_number(String id) {
        this.id_number = id;
    }

    public void hargajual(String hargajual) {
        this.price = hargajual;
    }

    public void merk(String merk) {
        m.setaddmerk(merk);
    }

    public void pegawai(String pegawai) {
        p.setPegawai(pegawai);
    }

    public String stock() {
        return stock;
    }

    public String size() {
        return size;
    }

    public String id_number() {
        return id_number;
    }

    public String color() {
        return color;
    }

    public String price() {
        return price;
    }
    
    
//    //Tabel Buy Sepatu
//    public ResultSet getSepatu() throws SQLException {
//        String sql = "SELECT * FROM sale WHERE type = 'Shoes' ";
//        PreparedStatement rs = con.prepareStatement(sql);
//        return rs.executeQuery();
//
//    }
//
    //Delete Tabel buy Sepatu
    public void DeleteSepatu(String brand){
        
    } 
}
