package com.lovecoding.day02;

import java.util.Scanner;

/**
 * 小练习：从键盘输入一个成绩，判断该分数是否及格
 */
public class Example7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个成绩:");
        int score = sc.nextInt();

        System.out.println(score >= 60 ? "恭喜你，没挂科!" : "对不起，重学!");

    }
}
