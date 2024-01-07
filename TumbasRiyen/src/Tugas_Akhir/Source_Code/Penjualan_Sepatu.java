/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Akhir.Source_Code;

import java.sql.*;

public class Penjualan_Sepatu extends Sepatu {

    private String tanggal, id_penjualansepatu, jumlahbarang, price;

    public Penjualan_Sepatu() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tumbasriyen", "root", "");
            System.out.println("Berhasil");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public void addPenjualan_Sepatu(String date, String id_number, String hargajual, String merk, String idsepatu, String pegawai, String jumlah, String price) {
        this.tanggal = date;
        id_number(id_number);
        hargajual(hargajual);
        merk(merk);
        this.id_penjualansepatu = idsepatu;
        pegawai(pegawai);
        this.jumlahbarang = jumlah;
        this.price = price;

        //String sql = "INSERT INTO keranjang VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        //String sql = "INSERT INTO keranjang VALUES ('" + date + "','" + id_number + "','" + jumlah + "','" + hargajual + "','" + price + "','" + merk + "','" + idsepatu + "','" + pegawai + "')";
        //K.simpan(con, st, sql);
    }

    @Override
    public void pegawai(String pegawai) {
    }

    public void id_number(String id) {
    }

    public void hargajual(String hargajual) {
    }

    public void merk(String merk) {
    }

    public String tanggal() {
        return tanggal;
    }

    public String jumlahbarang() {
        return jumlahbarang;
    }

    public String price() {
        return price;
    }

    public String idsepatu() {
        return id_penjualansepatu;
    }
}
