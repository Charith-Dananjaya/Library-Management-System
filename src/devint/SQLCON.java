/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devint;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author -e-
 */
public class SQLCON {
    public static Connection connect(){
        
        
         Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_managment_system", "root","");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return conn;
    }
    
}
