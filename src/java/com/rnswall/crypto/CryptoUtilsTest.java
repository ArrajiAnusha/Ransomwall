/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rnswall.crypto;

import java.io.File;

/**
 *
 * @author Ramu Maloth
 */
public class CryptoUtilsTest {
 public static void main(String[] args) {
		String key = "Mary has one cat";
               
		File inputFile = new File("D:\\Delete\\document.txt");
		File encryptedFile = new File("D:\\Delete\\document_hexa.txt");
		File decryptedFile = new File("D:\\Delete\\document_decode.txt");
		
		try {
			CryptoUtils.encrypt(key, inputFile, encryptedFile);
			CryptoUtils.decrypt(key, encryptedFile, decryptedFile);
		} catch (CryptoException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}   
}
