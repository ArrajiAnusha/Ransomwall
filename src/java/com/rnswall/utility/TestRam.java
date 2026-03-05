/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rnswall.utility;

import com.rnswall.crypto.SecureFileIDGenerator;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Ramu Maloth
 */
public class TestRam {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String serailFileId = SecureFileIDGenerator.calculateSecurityHash("ram", "SHA1");
        System.out.println("Serial ID "+serailFileId);
    }
}
