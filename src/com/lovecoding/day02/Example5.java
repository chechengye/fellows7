package com.lovecoding.day02;

import java.util.Scanner;

/**
 * 通过键盘输入，初始化两个数将这两个数据交换位置后，输出显示交换后的数据
 */
public class Example5 {

    public static void main(String[] args) {
        //(1) 空瓶子
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        /*int temp = a;//临时变量
        a = b;
        b = temp;*/
        //System.out.println("此时a = " + a + ", b = " + b);
        //(2) 加减法
        /*int sum = a + b ;
        b = sum - a;
        a = sum - b;*/
        System.out.println("--------------------");
        /*a = a + b - (b = a);
        System.out.println("此时a = " + a + ", b = " + b);*/
        //(3) 乘除
        //(4) 通过异或 。 bug ： 交换的两个值不能是相同的
        a = a ^ b; // a = 3
        b = a ^ b; // b = 2
        a = a ^ b;
        System.out.println("此时a = " + a + ", b = " + b);
    }
}
