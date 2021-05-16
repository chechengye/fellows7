package com.lovecoding.day03;

import org.junit.Test;

/**
 * 数组的应用
 * 数组的格式
 * 动态初始化
 * 类型 [] 变量 = new 类型 [长度];  -- 内存中申请的空间数量
 * 类型 [] 变量;
 *
 * 静态初始化
 * 类型[] 变量 = new 类型 []{对应类型的值 , 对应类型的值};
 * 类型[] 变量 = {对应类型的值 , 对应类型的值}; 上面方式的简写
 *
 * 数组的首索引是从 0 开始的
 *
 * 数组的属性： length - 表示该数组的长度
 *
 * 增强foreach与fori区别
 * fori ： 可以拿到索引的位置 ，方便操作数组（换位、替换值、删除等）
 * foreach ： 语法简单 、 显示/读取的时候使用
 */
public class Example4 {

    public static void main(String[] args) {
        //定义50名学生学号的空间
        //(1)种动态初始化
        int[] snoArr = new int[51];//申请好空间了
        /*snoArr[0] = 2021001;
        snoArr[1] = 2021002;*/
        int length = snoArr.length;//建议抽离出来，节省内存消耗
        for(int i = 0 ; i < length ; i ++){
            snoArr[i] = 2021000 + (i+1);
            System.out.print(snoArr[i] + " ");
        }
        System.out.println("-----------------------------");
        //(2)静态初始化
        int[] snoArr1 = {2021001 , 2021002 , 2021003};

        System.out.println(snoArr1[snoArr1.length - 1]);//错误的。索引从0开始。最后一个索引位置是长度 - 1
        System.out.println("---------测试增强for循环---------");
        testForEach(snoArr);
        System.out.println();
        System.out.println("-----------测试可变参数----------");

        printInfo(1 , 2 , 3, 43);//自动将传递过来的所有参数，封装为一个数组。输入的类型与形参的类型保持一致
    }


    /**
     * JDK 1.5之后增加了增强foreach循环
     * for(类型 变量 : 变量){}
     */
    public static void testForEach(int[] snoArr){

        for(int x : snoArr){
            System.out.print(x + " ");//x snoArr 每一个值
        }
    }

    /**
     * 可变参数
     * 类型... 变量
     * 注意：
     * 多个参数的时候，可变参数的位置只能放到最后一个
     *
     * @param arr
     */
    public static void printInfo(int a , int... arr){
        for(int x : arr){
            System.out.println(x);
        }
        //System.out.println(arr);
    }

}
