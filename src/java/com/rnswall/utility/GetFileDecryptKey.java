/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rnswall.utility;

import com.rnswall.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Ramu Maloth
 */
public class GetFileDecryptKey {
    private static Connection con = null;
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;
    
    public static String getDecryptkey(int fileId){
    
        String secretKey = null;
        try {
            con = DBConnection.getDBConnection();
            String sqlQuery = "select secretkey from ransomeattacking where rowid = ?";
            ps = con.prepareStatement(sqlQuery);
            ps.setInt(1, fileId);
            rs = ps.executeQuery();
            if(rs.next()){
            secretKey = rs.getString("secretkey");
            }
        } catch (Exception e) {
            System.out.println("Secret Key "+e.getMessage());
        }
        return secretKey;
    }
}
