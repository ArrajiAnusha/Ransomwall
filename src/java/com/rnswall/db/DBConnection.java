/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rnswall.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ramu Maloth
 */
public class DBConnection {
     public static Connection con = null;    
    public static Connection getDBConnection(){    
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ransomewall","root","root");
            if(con!=null){
            return con;
            }
        } catch (Exception e) {
            System.out.println("Error at DBConnection "+e.getMessage());
        }
        return con;
    }
}
