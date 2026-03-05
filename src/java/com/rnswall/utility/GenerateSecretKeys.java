/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rnswall.utility;

import java.security.SecureRandom;
import java.util.Random;

/**
 *
 * @author Ramu Maloth
 */
public class GenerateSecretKeys {

    static final private String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
    final private Random rng = new SecureRandom();

    char randomChar() {
        return ALPHABET.charAt(rng.nextInt(ALPHABET.length()));
    }

    String randomUUID(int length, int spacing, char spacerChar) {
        StringBuilder sb = new StringBuilder();
        int spacer = 0;
        while (length > 0) {
            if (spacer == spacing) {
                sb.append(spacerChar);
                spacer = 0;
            }
            length--;
            spacer++;
            sb.append(randomChar());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        GenerateSecretKeys gsk = new GenerateSecretKeys();
        char spacerChar = 'D';
        String key = gsk.randomUUID(15, 0, spacerChar);
        System.out.println("Key "+key+" And its Length is "+key.length());
        
    }
}
