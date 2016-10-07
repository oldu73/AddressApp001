package com.company.address.util;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Adapter (for JAXB) to convert between encrypted an decrypted String.
 *
 * @author Olivier Durand
 * @version 1.0
 * date 2016-10-07
 */
public class CryptoStringAdapter extends XmlAdapter<String, String> {

    // unmarshal = XML -> Java
    @Override
    public String unmarshal(String v) throws Exception {
        return Crypto.getDecrypted(v);
    }

    // marshal = Java -> XML
    @Override
    public String marshal(String v) throws Exception {
        return Crypto.getEncrypted(v);
    }
}
