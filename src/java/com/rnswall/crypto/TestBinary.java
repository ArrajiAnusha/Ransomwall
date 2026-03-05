/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rnswall.crypto;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.Arrays;
import javax.imageio.stream.FileImageOutputStream;

/**
 *
 * @author Ramu Maloth
 */
public class TestBinary {
public static String filfec[]= null;
public static int intval[];
	public static char chfec[];
        public static String Fien="";
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("D:\\Delete\\document.txt");
        byte[] fileData = new byte[(int)file.length()];
        FileInputStream in = new FileInputStream(file);
        in.read(fileData);
        in.close();
        String content = "";
        for (byte b : fileData) {
            content += getBits(b);
        } 
        
       
        FileOutputStream fis1 = new FileOutputStream("ramra2.txt");
        fis1.write(content.getBytes());
        fis1.close();
       // String data = bytesToAlphabeticString(content.getBytes());
      //  System.out.println("data "+data);
        
        for(int i=0;i<content.length();i++)
		{
			intval[i]= Integer.parseInt(filfec[i],2);
			 chfec[i]=(char)intval[i];
		}
		try
		{
			Fien="";
			FileOutputStream fw=new FileOutputStream("Output1.txt");
			for(int i=0;i<content.length();i++)
			{
			Fien+=Character.toString(chfec[i]);
			fw.write(chfec[i]);
			}
		}
		catch (Exception er)
		{
			er.printStackTrace();
		}
                
                
        
        
        
    }

    static String getBits(byte b) {
        String result = "";
        for (int i = 0; i < 8; i++) {
            result += (b & (1 << i)) == 0 ? "0" : "1";
        }
        return result;
    }
    
  
    
   
    
    
}
