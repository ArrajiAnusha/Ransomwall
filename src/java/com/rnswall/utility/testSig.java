/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rnswall.utility;

/**
 *
 * @author Ramu Maloth
 */
import java.io.*;
import java.security.*;

public class testSig {

    public static boolean verifySign(String   filepath) {

        /* Test generating and verifying a DSA signature */
        boolean verifies = false;
        try {

            /* generate a key pair */

            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DSA");
            keyGen.initialize(1024, new SecureRandom());
            KeyPair pair = keyGen.generateKeyPair();

            /* create a Signature object to use for signing and verifying */

            Signature dsa = Signature.getInstance("SHA/DSA"); 

            /* initialize the Signature object for signing */

            PrivateKey priv = pair.getPrivate();

            dsa.initSign(priv);

            /* Update and sign the data */

            FileInputStream fis =  new FileInputStream(filepath);
            byte b;
            while (fis.available() != 0) {
                b = (byte) fis.read();
                dsa.update(b);
                };

            fis.close();

            /* Now that all the data to be signed has been read in, sign it */
            byte[] sig = dsa.sign();


            /* Verify the signature */

            /* Initialize the Signature object for verification */
            PublicKey pub = pair.getPublic();
            dsa.initVerify(pub);

            /* Update and verify the data */

            fis = new FileInputStream(filepath);
            while (fis.available() != 0) {
                b = (byte) fis.read();
                dsa.update(b);
                };

            fis.close();

             verifies = dsa.verify(sig);

            System.out.println("signature verifies: " + verifies);

        } catch (Exception e) {
            System.err.println("Caught exception " + e.toString());
        }
    return verifies;
    }

}

