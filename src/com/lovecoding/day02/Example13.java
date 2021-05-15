package com.lovecoding.day02;

import java.util.Scanner;

/**
 * Switch讲解
 * 1、多个case可以同时匹配规则
 * 2、case代码中有多行代码时，可以不加{}。若是定义变量需要加{}才能限制其访问范围
 * 3、case代码块结束符需要配合break使用。退出switch代码块
 * 4、default 默认执行的代码块
 * 5、case的值 一定是常量
 * 6、default代码块可以省略不写
 */
public class Example13 {

    public static void main(String[] args) {
        //int a = 10;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        final int b = 33;
        //b = 44;
        switch (a){
            case 5: {
                int num = 20;
                System.out.println("A是5");
                System.out.println(num);
                break;
            }
            case 10:
                System.out.println("A是10");
                break;
            case 15:
            case 20:
                //num = 30;
                //System.out.println(num);
                System.out.println("A是15或者20");
                break;
            case b:

                break;
            default:
                System.out.println("默认执行的代码块");
                break;
        }
    }
}
