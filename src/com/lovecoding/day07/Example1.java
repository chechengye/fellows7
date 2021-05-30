package com.lovecoding.day07;

/**
 * 字符串拼接讲解
 * StringBuffer与StringBuilder
 *
 * 1、StringBuffer做了同步处理，建议多线程下使用
 * 2、StringBuilder单线程下建议使用，效率更高。
 */
public class Example1 {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "df";
        String s3 = s1 + s2 + "10";
        System.out.println(s3);

        StringBuffer sb = new StringBuffer("12345");
        sb.append("abc").append("df").append(10);//append()追加方法 。

        sb = sb.delete(0 , 3);

        StringBuffer sb1 = sb.insert(2 , "bbbbcccc");
        System.out.println(sb1.toString());

        System.out.println("-------------reverse字符串反转-----------");

        StringBuffer sb2 = new StringBuffer("123321");//回文数
        System.out.println(sb2.reverse());


    }
}
