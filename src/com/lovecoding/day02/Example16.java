package com.lovecoding.day02;

import java.util.Scanner;

/**
 * 直接用JDK1.7的字符串条件判断，确定两个数是执行加、减、乘、除操作。
 */
public class Example16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入(+、-、*、/)操作符:");
        String opt = sc.next();
        int m = 100 ;
        int n = 50;
        switch (opt){
            case "+":
                System.out.println("加操作： " + (m+n));
                break;
            case "-":
                System.out.println("减操作： " + (m-n));
                break;
            case "*":
                System.out.println("乘法操作： " + (m*n));
                break;
            case "/":
                System.out.println("除法操作： " + (m/n));
                break;
            default:
                System.out.println("操作运算符不符合");
                break;
        }
    }
}
