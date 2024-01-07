/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales_program;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author JE_SOO
 */
public class conectionDB {
   
Connection koneksi=null;
    public static Connection koneksiDb(){
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection filekoneksi =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost/sale","root","");
            return filekoneksi;
            
        }catch(Exception e){
            
            return null;
        }
    }   
}
