/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Akhir.Source_Code;

import java.sql.*;

public class Tas {

    Merk m = new Merk();
    Jenis j = new Jenis();
    Pegawai p = new Pegawai();

    private String stock, size, id_number, color, price;
    Connection con = null;
    Statement st = null;

    public Tas() {
        super();
    }

    //Add Sepatu in Sale
    public void addTas(String pe, String jenis, String s, String sz, String merk, String id, String col, String pri) throws SQLException {
        p.setPegawai(pe);
        j.setaddJenis(jenis);
        this.stock = s;
        this.size = sz;
        m.setaddmerk(merk);
        this.id_number = id;
        this.color = col;
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
}


