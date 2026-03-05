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
public class CustomerUtilities {
    private static Connection con = null;
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;
    
    public static boolean checkDecryptionSecretKey(int fileId,String fileName,String secretKey){
    boolean flag = false;
        try {
            con = DBConnection.getDBConnection();
            String sqlQuery = "select *from ransomeattacking where fid = ? and ransomeFileName = ? and secretkey = ?";
            //System.out.println("Query "+sqlQuery);
            //System.out.println(fileId+"="+fileName+"="+secretKey);
            ps = con.prepareStatement(sqlQuery);
            ps.setInt(1, fileId);
            ps.setString(2, fileName);
            ps.setString(3, secretKey);
            rs = ps.executeQuery();
            if(rs.next()){
            flag = true;
            return true;
            }else{
            flag = false;
            }
        } catch (Exception e) {
            System.out.println("checkDecryptionSecretKey Error at "+e.getMessage());
        }finally{
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (Exception e) {
            }
        }
    return flag;
    }
    
    public static void updateNoAttackStatus(int fileId){
    boolean flag = false;
        try {
            con = DBConnection.getDBConnection();
            String sqlQuery = "update custhoneyfiles set attackingstatus = ? where id = ?";
            //System.out.println("Query "+sqlQuery);
            //System.out.println(fileId+"="+fileName+"="+secretKey);
            ps = con.prepareStatement(sqlQuery);
            ps.setInt(1, fileId);
            ps.setString(2, "noattack");           
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("checkDecryptionSecretKey Error at "+e.getMessage());
        }finally{
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (Exception e) {
            }
        }
   
    }
}
