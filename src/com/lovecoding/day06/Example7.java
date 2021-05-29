package com.lovecoding.day06;

/**
 * debug技术应用
 * 红点称为断点，debug执行时断点可能被执行到
 */
public class Example7 {

    public static void main(String[] args) {

        for (int i = 0 ; i < 10 ; i++){
            if(6 == i){
                method(i);
            }
        }
    }

    public static void method(int a){
        System.out.println(++a);
    }
}
