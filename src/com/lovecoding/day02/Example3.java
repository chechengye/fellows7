package com.lovecoding.day02;

/**
 * 2、定义一个五位整数，求各个位上的数的和。
 * 注意：
 * + -法运算时 ，若做字符串拼接 ，一定使用（）来提高运算符优先级 () : 优先级最高
 * 字符串 + 拼接时，与任何类型拼完都会字符串
 * 面试题：
 * 用最快的方式将一个整型 转换为字符串
 *
 */
public class Example3 {

    public static void main(String[] args) {
        int num = 54321;
        int w = num / 10000;
        int q = num / 1000 % 10;
        int b = num / 100 % 10;
        int s = num / 10 % 10;
        int g = num % 10;

        System.out.println("各位数上面的和为： " + (w + q + b + s + g));
        System.out.println("-------------------");
        int n = 100;
        String str = n + "";//最快的
    }
}
