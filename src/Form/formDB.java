/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adise
 */
public class formDB {
    Connection con;
    PreparedStatement pst;
    
    public formDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bengkel","root","");
            System.out.println("bisa ayo");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(formDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(formDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void insertDB(String no_antrian,String tgl_service,String id_customer,String nama_customer,String biaya_service){
        
        try {
            int antri = Integer.parseInt(no_antrian);
            String sql = "insert into tabel_service values (?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, no_antrian);
            pst.setString(2, tgl_service);
            pst.setString(3, id_customer);
            pst.setString(4, nama_customer);
            pst.setString(5, biaya_service);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(formDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void MotorDB(String id, String no_polisi, String warna, String tipe, String CC, String no_mesin, String tahun, String bahan_bakar){
        
        try {
            String sql = "insert into tabel_motor values (?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, null);
            pst.setString(2, no_polisi);
            pst.setString(3, warna);
            pst.setString(4, tipe);
            pst.setString(5, CC);
            pst.setString(6, no_mesin);
            pst.setString(7, tahun);
            pst.setString(8, bahan_bakar);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(formDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void MekanikDB(String Id, String nama_mekanik, String no_telepon, String keahlian, String lulusan){
        
        try {
            String sql = "insert into tabel_mekanik values (?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, null);
            pst.setString(2, nama_mekanik);
            pst.setString(3, no_telepon);
            pst.setString(4, keahlian);
            pst.setString(5, lulusan);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(formDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void KeluhanDB(String Id, String Id_customer, String nama_customer, String keluhan){
        
        try {
            String sql = "insert into tabel_keluhan values (?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, null);
            pst.setString(2, Id_customer);
            pst.setString(3, nama_customer);
            pst.setString(4, keluhan);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(formDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
