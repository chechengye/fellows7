package com.lovecoding.day02;
/**
 * 输出10个斐波那契（Fibonacci）数列：1 1 2 3 5 8 13 21 34 55。
 * （特点：第1,2两个数值为1，从第三个数开始，该数是其前面两个数之和）
 */
public class Example22 {

    public static void main(String[] args) {
        int m = 1;
        int n = 1;
        //System.out.print(n + " " + m);
        int next = 0;
        /*for(int i = 0 ; i < 8 ; i++){
            next = m + n;
            System.out.print(" " + next);
            m = n;
            n = next;
        }*/

        //(2)
        for(int i = 0 ; i < 5 ; i ++){
            System.out.print(m + " " + n + " ");
            m = m + n;
            n = m + n;
        }
    }
}
