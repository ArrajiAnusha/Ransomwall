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
public class RansomeUserDAOS {
    private static Connection con = null;
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;
    
    public static void setAttackStatus(int fid){
        try {
            con = DBConnection.getDBConnection();
            String sql = "update custhoneyfiles set attackingstatus = ? where id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, "attacked");
            ps.setInt(2, fid);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Attack Status "+e.getMessage());
        }finally{
            try {
                ps.close();
                con.close();
            } catch (Exception e) {
            }
        }
    }
}
