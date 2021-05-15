package com.lovecoding.day02;

/**
 * 打印100以内所有的奇数，偶数和3的倍数（不包括100）
 */
public class Example18 {
    public static void main(String[] args) {
        int i = 1;
        while (i < 100){ //若条件永真，则死循环
            if(i % 2 == 0){
                System.out.println(i + "是偶数");
            }else{
                System.out.println(i + "是奇数");
            }

            if(i % 3 == 0){
                System.out.println(i + "是三的倍数");
            }
            i++;
        }
    }
}
