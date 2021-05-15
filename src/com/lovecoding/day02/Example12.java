package com.lovecoding.day02;

import java.util.Scanner;

/**
 * 多条件嵌套分支，设计一个程序，根据天气情况选择外出或在家，
 * 外出是逛街还是逛公园，在家是看电影还是玩游戏。

 */
public class Example12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("天气(1) 晴天  (2) 阴天");
        int a = sc.nextInt();
        if(1 == a){ //将条件判断中的表达式，常量（确定的量放在前面）
            System.out.println("去哪(1) 逛街  (2) 逛公园");
            int b = sc.nextInt();
            if(1 == b){
                System.out.println("我们去逛街了..灰常开心~~");
            }else if(2 == b){
                System.out.println("我们去逛逛公园了..灰常开心~~");
            }else{
                System.out.println("您输入的有误~");
            }
        }else if(2 == a){
            System.out.println("在家(1) 看电影  (2) 玩游戏");
            int b = sc.nextInt();
            System.out.println("......");
        }
    }


}
