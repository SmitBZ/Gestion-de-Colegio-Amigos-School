package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author smit1
 */

public class Conexion {
    public  String db="colegioamigos";
    public  String url="jdbc:mysql://localhost:3306/"+db;
    public  String user="root";
    public  String pass="161104";
    
    public Conexion() {
    }
    
   public  Connection conectar(){
        Connection link=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            link=DriverManager.getConnection(this.url,this.user,this.pass);
            
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
           return link ;          
              
    
    }
}
