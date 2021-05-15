package com.lovecoding.day02;

import java.util.Scanner;

/**
 * 输入一个月数，然后输出对应月份有多少天（不考虑闰年），将天数输出。
 */
public class Example15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份（1 ~ 12）范围区间");
        int month = sc.nextInt();
        if(month > 12 || month < 1){
            System.out.println("您输入的有误，请输入1 - 12直接的数");
            month =  sc.nextInt();
        }
        switch (month){
            case 2:
                System.out.println("该月有28天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("该月有30天");
                break;
            default:
                System.out.println("该月有31天");
                break;
        }
    }
}
