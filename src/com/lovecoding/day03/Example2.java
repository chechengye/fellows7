package com.lovecoding.day03;

/**
 * 2、根据传入的参数数量打印直角三角形
 */
public class Example2 {

    public static void main(String[] args) {
        tranS(10);
    }

    public static void tranS(int line){
        for(int i = 1 ; i <= line ; i++){
            for(int j = 1 ; j <=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
