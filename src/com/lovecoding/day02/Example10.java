package com.lovecoding.day02;

import java.util.Scanner;

/**
 * 写一个程序，判断某一年是否为闰年（被4整除但不能被100整除或者能被400整除)是闰年否则是平年
 */
public class Example10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + "是闰年");
        }else{
            System.out.println(year + "是平年");
        }
    }
}
