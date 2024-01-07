package ProgramData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class koneksi {
        private static Connection koneksi;
        
        
        public static Connection getConnection()throws SQLException{
            String db = "jdbc:mysql://localhost:3308/form_uas";
            String user = "root";
            String pass = "";
            
            if (koneksi == null) {
                koneksi = DriverManager.getConnection(db, user, pass);               
            }
            
            return koneksi ;
        }
    }