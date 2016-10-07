package com.company.address.util;

import org.jasypt.util.text.StrongTextEncryptor;

/**
 * Enum to encrypt/decrypt a String with a password using Jasypt library (http://www.jasypt.org/)
 * @author Olivier Durand
 * @version 1.0
 * date 2016-09-20
 */

public enum Crypto {

    ;

    /**
     * Instance of StrongTextEncryptor which is a utility class for easily performing high-strength encryption of texts
     */
    private static final StrongTextEncryptor strongTextEncryptor = new StrongTextEncryptor();

    /**
     * Set password of the StrongTextEncryptor instance
     * @since 1.0
     * @param password password of the StrongTextEncryptor instance
     */
    public static void setPassword(String password) {
        strongTextEncryptor.setPassword(password);
    }

    /**
     * Encrypt a String using the StrongTextEncryptor instance
     * @since 1.0
     * @param stringToEncrypt a String that will be encrypted with the StrongTextEncryptor instance
     * @return an encrypted String
     */
    public static String getEncrypted(String stringToEncrypt) {
        return strongTextEncryptor.encrypt(stringToEncrypt);
    }

    /**
     * Decrypt a String using the StrongTextEncryptor instance
     * @since 1.0
     * @param stringToDecrypt a String that will be decrypted with the StrongTextEncryptor instance
     * @return a decrypted String
     */
    public static String getDecrypted(String stringToDecrypt) {
        return strongTextEncryptor.decrypt(stringToDecrypt);
    }

}

