package com.lovecoding.day07;

import com.lovecoding.day07.util.MD5Util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;

/**
 * MD5加密
 */
public class Example10 {
    public static void main(String[] args) {

        try {
            //1、实例化Message-Digest 对象
            MessageDigest md = MessageDigest.getInstance("MD5");
            //2、创建一个将要加密的字符串
            String pwd = "Admin123";//5kt4/DvJG8vH3CMrqOxZ4A==
            System.out.println(Arrays.toString(md.digest(pwd.getBytes())));
            byte[] digest = md.digest(pwd.getBytes());
            String encodePwd = Base64.getEncoder().encodeToString(digest);

            //MD5加密后字符串会默认在最后加上 == 秘钥、公钥
            //Base64 : a-z A-Z 0-9 / +
            System.out.println("加密后的密码为：" + encodePwd);

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入密码： ");
            String next = sc.next();
            if("5kt4/DvJG8vH3CMrqOxZ4A==".equals(MD5Util.encodeMd5(next))){
                System.out.println("校验成功!!");
            }

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
