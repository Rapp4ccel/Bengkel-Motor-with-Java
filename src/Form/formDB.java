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
    
    public void insertDB(String no_antrian,String tgl_service,String id_customer,String nama_customer,String no_plat,String tipe,String no_rangka,String biaya_service){
        
        try {
            String sql = "insert into bengkel values (?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, no_antrian);
            pst.setString(2, tgl_service);
            pst.setString(3, id_customer);
            pst.setString(4, nama_customer);
            pst.setString(5, no_plat);
            pst.setString(6, tipe);
            pst.setString(7, no_rangka);
            pst.setString(8, biaya_service);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(formDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
