package com.lovecoding.day02;

import org.junit.Test;

/**
 * While循环学习
 * while(条件表达式){} .如果条件满足为真则进入循环体。为假则跳出循环
 *
 * 特点：先进行判断在执行
 * 1、计算1-100之间所有整数之和。5050
 * 2、计算10的阶乘
 */
public class Example17 {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i<=100){
            sum+=i;
            i++;
        }
        System.out.println("和为：" + sum);
    }

    /**
     * 计算10的阶乘
     */
    @Test
    public void testFn(){
        int i = 1;
        int num = 1;
        while (i <= 10){
            num *= i++;
        }
        System.out.println("阶乘值为：" + num);
    }
}
