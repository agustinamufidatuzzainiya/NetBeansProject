/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Akhir.Source_Code;

import java.sql.*;
import java.sql.Statement;

/**
 *
 * @author NoteBook
 */
public class Penjualan_Tas extends Tas {

    private String tanggal, id_penjualantas, jumlahbarang, price;

    public Penjualan_Tas() {
        super();
    }

    public void addPenjualan_Tas(String date, String id_number, String hargajual, String merk,
            String idtas, String pegawai, String jumlah, String price) {

        this.tanggal = date;
        id_number(id_number);
        hargajual(hargajual);
        merk(merk);
        this.id_penjualantas = idtas;
        pegawai(pegawai);
        this.jumlahbarang = jumlah;
        this.price = price;
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

    public String idtas() {
        return id_penjualantas;
    }
}
