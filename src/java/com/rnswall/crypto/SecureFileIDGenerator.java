/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rnswall.crypto;

/**
 *
 * @author Ramu Maloth
 */
public class SecureFileIDGenerator {
    public static String calculateSecurityHash(String stringInput, String algorithmName)
    throws java.security.NoSuchAlgorithmException {
        String hexMessageEncode = "";
        byte[] buffer = stringInput.getBytes();
        java.security.MessageDigest messageDigest =
            java.security.MessageDigest.getInstance(algorithmName);
        messageDigest.update(buffer);
        byte[] messageDigestBytes = messageDigest.digest();
        for (int index=0; index < messageDigestBytes.length ; index ++) {
            int countEncode = messageDigestBytes[index] & 0xff;
            if (Integer.toHexString(countEncode).length() == 1)
                hexMessageEncode = hexMessageEncode + "0";
            hexMessageEncode = hexMessageEncode + Integer.toHexString(countEncode);
        }
        return hexMessageEncode;
    }
    public static void main(String[] args) {
        try {
           // String serialNumberEncoded = calculateSecurityHash("Ram","MD2");// +calculateSecurityHash("ram","MD5") + calculateSecurityHash("Ram","SHA1");
           // String serialNumberEncoded = calculateSecurityHash("ram","MD5");
            String serialNumberEncoded = calculateSecurityHash("Ram","SHA1");
            System.out.println("Serial number "+serialNumberEncoded);
        } catch (Exception e) {
        }
        
    }
}
