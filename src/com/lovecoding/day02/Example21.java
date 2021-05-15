package com.lovecoding.day02;
/**
 * 打印输出0~200之间能被7整除但不能被4整除的所有整数；
 */
public class Example21 {

    public static void main(String[] args) {
        for(int i = 1 ; i < 200 ; i++){
            if(i % 7 == 0 && i % 4 != 0){
                System.out.print(i+ " ");
            }
        }
    }
}
