/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rnswall.crypto;

/**
 *
 * @author Ramu Maloth
 */
public class CryptoException extends Exception{
    public CryptoException() {
	}

	public CryptoException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
