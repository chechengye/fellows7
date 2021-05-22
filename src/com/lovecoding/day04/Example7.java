package com.lovecoding.day04;
/**
 * main方法分析
 * public : 方便JVM调用
 * static : JVM操作类直接调用方法
 * void : JWM不关心你的返回值
 * args : 形参，由调用者初始化和赋值
 */
public class Example7 {

    public static void main(String[] args) {//申请了空间
        for(String arg : args){
            System.out.println(arg);
        }
        System.out.println(args.length);
    }
}
