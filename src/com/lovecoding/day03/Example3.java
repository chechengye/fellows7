package com.lovecoding.day03;

/**
 * 方法重载
 * 条件
 * 1、首要条件 方法名称必须一样
 * 2、参数的数量不同
 * 3、参数的类型不同
 * 4、参数的位置不同
 * 5、返回值类型不能作为重载条件
 */
public class Example3 {

    public static void main(String[] args) {
        add(3 , 5 , 65);
    }

    public static void add(int a , int b){
        System.out.println(a + b);
    }

    /*public static int add(int a , int b){
        System.out.println(a + b);
        return a +b;
    }*/

    public static void add(int b , float a){
        System.out.println(a + b);
    }

    public static void add(float b , int a){
        System.out.println(a + b);
    }


    public static void add(int a , int b , int c){
        System.out.println(a + b + c);
    }

    public static void add(float a , float b){
        System.out.println(a + b);
    }
}
