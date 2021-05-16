package com.lovecoding.day03;

/**
 * 2、打印正三角形。
 */
public class Example6 {

    public static void main(String[] args) {
        char[] arr = {'A','B'};
        char c = 'A';
        printCr(c , 10);
    }

    public static void printCr(char c , int num){
        for(int i = 1 ; i <= num ; i++){
            //内循环打印空格
            for(int j = i ; j < num ; j ++){
                System.out.print(" ");
            }
            //内循环打印*
            for(int j = 1 ; j <= 2 * i - 1 ; j ++){
                System.out.print(c);
            }
            //c+=1;
            c++;
            System.out.println();
        }
    }
}
