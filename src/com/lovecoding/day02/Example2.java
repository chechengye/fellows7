package com.lovecoding.day02;

import java.util.Scanner;

/**
 * 1、通过键盘输入声明初始化一个圆柱体的高和底面半径,pai值是3.14,求圆柱体的体积,
 * 并显示输出圆柱体的体积; π(r^2)h
 */
public class Example2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//创建接收键盘输入的对象
        System.out.println("请输入圆柱体的底面半径：");
        int r = sc.nextInt();
        System.out.println("请输入圆柱体的高：");
        int h = sc.nextInt();
        System.out.println("圆柱体的体积为：" + (3.14 * r * r * h));
    }
}
