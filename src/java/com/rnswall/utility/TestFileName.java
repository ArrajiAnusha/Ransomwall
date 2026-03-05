/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rnswall.utility;

/**
 *
 * @author Ramu Maloth
 */
public class TestFileName {
    public static void main(String[] args) {
        String fileName = "abbabbaadis.jpg";
        String extension = GetFileExtension.getFileExtension(fileName);
        System.out.println("Ext "+extension);
    }
}
