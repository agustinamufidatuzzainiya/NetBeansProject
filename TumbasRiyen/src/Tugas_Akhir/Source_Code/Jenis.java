/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Akhir.Source_Code;

import java.sql.*;

/**
 *
 * @author NoteBook
 */
public class Jenis {

    private String id_jenis;
    private String nama_jenis;
    Connection con = null;
    Statement st = null;
    Koneksi K = new Koneksi();

    public Jenis() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tumbasriyen", "root", "");
            System.out.println("Berhasil");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public void setaddJenis(String nama_jenis) {
        this.nama_jenis = nama_jenis;
    }

    public String getaddJenis() {
        return nama_jenis;
    }

    public String id_jenis() {
        return id_jenis;
    }

//    //Tabel Sale
//    public void ResultSetgetJenis(ResultSet rs) throws SQLException {
//        String sql = "SELECT * FROM sale";
//        K.ambilData(sql,rs);
//    }

    //Hapus sale
    public void deleteJenis(String brand) {
        String sql = "DELETE FROM sale WHERE brand ='" + brand + "'";
        K.hapus(con, st, sql);
    }

}
