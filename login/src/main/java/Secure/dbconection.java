/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secure;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author pasta
 */
public class dbconection {
    public static Connection connect()throws Exception{
        Connection conn= null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jiji","root","");
            
            Component rootPane=null;
            System.out.println("connected");
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        
        }
    
    return conn;
    
    
    }
    
    
    
}
