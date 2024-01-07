/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Akhir.Source_Code;

import java.sql.*;

public class Merk{

    private String id_merk;
    private String nama_merk;

    public Merk(){
        super();
    }

    //add merek in sale
    public void setaddmerk(String merk) {
        this.nama_merk = merk;
    }

    public String getaddMerk(){
        return nama_merk;
    }
    

//    //TABEL SEARCH
//    public ResultSet getMerk(String search) throws SQLException{
//        String sql = "SELECT * FROM sale WHERE employee like '%" + search + "%'"
//                + "or type like '%" + search + "%'"
//                + "or stock like '%" + search + "%'"
//                + "or size like '%" + search + "%'"
//                + "or id_number like '%" + search + "%'"
//                + "or color like '%" + search + "%'"
//                + "or brand like '%" + search + "%'"
//                + "or price like '%" + search + "%'";
//        st = con.createStatement();
//        ResultSet rs = st.executeQuery(sql);
//        return rs;
//    }
//    
//    //Delete Search
//    public void deleteMerk() throws SQLException{
//        String sql = "DELETE * FROM sale WHERE brand = ? ";
//        PreparedStatement rs = con.prepareStatement(sql);
//        rs.executeUpdate();
//    }
}
