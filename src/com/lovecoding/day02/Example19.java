package com.lovecoding.day02;

import org.junit.Test;

/**
 * do{}while()
 * 特点： 先执行，再判断
 * 逆序输出10~0
 * Java阶乘求和 1!+2!+...+10!
 */
public class Example19 {

    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.println(i--);
        }while (i>=0);
    }

    /**
     * Java阶乘求和 1!+2!+...+10!
     */
    @Test
    public void testFn(){
        int i = 1;
        int sum = 0;
        do {
            int j = 1;
            int num = 1;
            do {
                num *= j++;
            }while (j <= i);
            sum+=num;
            i++;
        }while (i<=10);
        System.out.println("阶乘和为：" + sum);
    }
}
