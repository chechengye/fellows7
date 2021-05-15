package com.lovecoding.day02;

import java.util.Scanner;

/**
 * 根据天数（46）计算周数和剩余的天数，天数是通过键盘输入
 */
public class Example4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入天数：");
        int num = sc.nextInt();
        System.out.println("包含周数： " + (num / 7) + "剩余天数: " + (num % 7) );

    }
}
