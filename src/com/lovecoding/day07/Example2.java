package com.lovecoding.day07;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * 程序国际化（I18N）
 * https://blog.csdn.net/shenenhua/article/details/79150053语言代码地址
 */
public class Example2 {

    public static void main(String[] args) {

        //1、优先获取语法环境 语言信息与国家/区域
        Locale localeZh = new Locale("zh" , "CN");
        Locale localeEn = new Locale("en" , "US");
        Locale localeDef = Locale.getDefault();

        //2、读取资源文件
        ResourceBundle rb = null;

        Scanner sc = new Scanner(System.in);

        System.out.println("请选择语言环境： (1) 中文 (2) 英文");
        int select = sc.nextInt();
        switch (select){
            case 1:
                rb = ResourceBundle.getBundle("com.lovecoding.day07.info" , localeZh);
                break;
            case 2:
                rb = ResourceBundle.getBundle("com.lovecoding.day07.info" , localeEn);
                break;
        }

        System.out.println(rb.getString("system.name"));
        System.out.println(rb.getString("input.username"));
        String username = sc.next();
        System.out.println(rb.getString("input.pwd"));
        String password = sc.next();
        if("zhangsan".equals(username) && "123".equals(password)){
            System.out.println(rb.getString("welcome") + username);
        }
    }
}
