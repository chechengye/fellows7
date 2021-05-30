package com.lovecoding.day06;

import java.util.Scanner;

public class Example9 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串str1：");
        String str1 = sc.next();//abaacgh1112223
        System.out.println("请输入字符串str2：");
        String str2 = sc.next(); // abjk234
        String newStr = "";
        for(char c : str1.toCharArray()){
            if(str2.indexOf(c) != -1){//包含则不为 -1
                if(!newStr.contains(c + "")){
                    newStr += c;
                }
            }
        }
        System.out.println("新的重复字符组成的串为：" + newStr);
    }
}
