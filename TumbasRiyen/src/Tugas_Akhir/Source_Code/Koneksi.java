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
public class Koneksi {

    Connection con = null;
    Statement st = null;

    public Koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tumbasriyen", "root", "");
        } catch (Exception e) {
            System.out.println("Error");
        }

    }

    public ResultSet ambilData(String sql,ResultSet rs) {
        try {
            rs = st.executeQuery(sql);
        } catch (Exception x) {
            System.out.println("Terjadi kesalahan");
        }
        return rs;
    }

    public void hapus(Connection con, Statement stat, String s) {
        try {
            stat = con.createStatement();
            stat.executeUpdate(s);
            stat.close();
        } catch (Exception e) {
            System.out.println("Error :" + e);
        }
    }

    public void ubah(Connection con, Statement stat, String s) {
        try {
            stat = con.createStatement();
            stat.executeUpdate(s);
            stat.close();
        } catch (Exception e) {
            System.out.println("Error :" + e);
        }
    }

    public void simpan(Connection con, Statement stat, String q) {
        try {
            stat = con.createStatement();
            stat.executeUpdate(q);
            stat.close();
        } catch (Exception e) {
            System.out.println("Eror " + e);
        }
    }

}
