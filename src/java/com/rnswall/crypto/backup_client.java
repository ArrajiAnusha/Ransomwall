/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rnswall.crypto;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Ramu Maloth
 */
public class backup_client {
public static String ReadFile(String file) throws IOException {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        String data = in.readLine();
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
     
    public static void WriteFile(String filename, String file) throws IOException
    {
        String FILENAME = filename;
        DataOutputStream os = new DataOutputStream(new FileOutputStream(FILENAME));
        os.writeChars(file);
        os.close();
    }
     
    public static void main(String[] args) throws IOException {
        //System.out.println(ReadFile("3Com-wireless-discovery.zip"));
        WriteFile("backup.exe", ReadFile("original.exe"));
    }
}

