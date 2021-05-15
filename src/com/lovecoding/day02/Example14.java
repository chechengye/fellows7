package com.lovecoding.day02;

import java.util.Scanner;

/**
 * 编写一程序实现如下功能：输入1、2、3、4、5、6、7（分别对应星期一至星期日）中的任何一个数。
 */
public class Example14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1、2、3、4、5、6、7：");
        int windy = sc.nextInt();
        switch (windy){
            case 1:
                System.out.println("是星期一");
                break;
            case 2:
                System.out.println("是星期二");
                break;
            case 3:
                System.out.println("是星期三");
                break;
        }

    }
}
