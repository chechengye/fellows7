package com.lovecoding.day07.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class MD5Util {

    /**
     * 进行MD5加密处理
     * @param dealStr
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static String encodeMd5(String dealStr) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        return Base64.getEncoder().encodeToString(md.digest(dealStr.getBytes()));
    }
}
