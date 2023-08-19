/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn_postsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author CESAR
 */
public class conexion {
     private final String host = "localhost";
      private final String puerto = "5432";
        private final String db = "prueba1";
          private final String user = "postgres";
            private final String password = "12345";
     
    public Connection getcn(){
        Connection conexion = null;
        
        try{
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://"+host+":"+puerto+"/"+db;
            conexion = DriverManager.getConnection(url,user,password);
            JOptionPane.showMessageDialog(null,"conexion existosa");
        }catch(ClassNotFoundException | SQLException e){
             JOptionPane.showMessageDialog(null,e.getMessage());
        }
         return conexion;
        
    }
            
}
