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
public class IRPUtility {
    private static Connection con = null;
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;
    
    public static boolean updaterecoverStatus(int id){
    boolean flag = false;
        try {
            con = DBConnection.getDBConnection();
            String sql = "update ransomeuserrequest set recoverystatus = ? where rfileid = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, "YES");
            ps.setInt(2, id);
            int no = ps.executeUpdate();
            if(no>0){
            flag = true;
            }
        } catch (Exception e) {
            System.out.println("Utiity Recover Error "+e.getMessage());
        }
    return flag;
    }
    
    
     public static boolean updateRansometableStatus(int id){
    boolean flag = false;
        try {
            con = DBConnection.getDBConnection();
            String sql = "update ransomeattacking set recoverystatus = ? where fid = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, "YES");
            ps.setInt(2, id);
            int no = ps.executeUpdate();
            if(no>0){
            flag = true;
            }
        } catch (Exception e) {
            System.out.println("Utiity Recover Error "+e.getMessage());
        }
    return flag;
    }
}
