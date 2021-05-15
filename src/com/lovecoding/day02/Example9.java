package com.lovecoding.day02;

import java.io.IOException;
import java.util.Scanner;

/**
 * 输入一个字符，判断是大写字母还是小写字母，输出提示信息。
 */
public class Example9 {

    public static void main(String[] args) throws IOException {
        System.out.println("请输入一个字符");
        /*Scanner sc = new Scanner(System.in);
        sc.*/
        char c = 'a';
        char read = (char)System.in.read();
        if(read > 'A' && read < 'Z'){
            System.out.println("大写字母");
        }else if(read > 'a' && read < 'z'){
            System.out.println("小写字母");
        }else{
            System.out.println("其它字符");
        }
    }
}

