package com.lovecoding.day01;

import org.junit.Test;

import java.util.Scanner;

/**
 * Java编程基础
 *
 * 变量的划分：
 * 1、按类型划分（基本数据类型变量、引用数据类型变量）
 * 2、按所在位置划分
 *   1） 局部变量 -- 定义于方法内部和方法参数上的
 *   2） 成员变量 -- 定义于类中的，此内的方法均可以访问到
 * 标识符
 * 任何包、类、方法、变量、参数定义
 * 规则：
 * 1、由字母、数字、下划线（_）和美元符号（$）组成。
 * 2、不能以数字开头
 * 3、区分大小写
 * 4、长度无限制
 * 5、不能是Java中的关键字和保留关键字。 (goto 、 const)
 * 6、规范：驼峰命名法、见名知意
 *      类：首字母大写之后单词的首字母也均大写
 *      方法： 第一个单词的首字母小写。其它单词的首字母大写。
 *
 * 八种基本数据类型：
 * 整数相关：
 * short     2 个字节     0
 * int       4 个字节     0
 * long      8 个字节     0
 * 浮点数相关:
 * float     4个字节     0.0F
 * double    8个字节     0.0D
 * 布尔值
 * boolean  不确定 （不同的操作系统中占用的字节不一样）  false
 * 字符型
 * char      2个字节      '\u0000'
 * 字节型
 * byte      1个字节       0
 *
 * 类型转换：
 * 位数少的 - > 位数多的赋值  OK
 * 位数多的  - > 位数少的赋值  ERR
 * 强制类型转换（可能损失精度）
 *
 * 接收键盘输入：
 * Scanner System.in : 系统级的。必须放于Main方法中/主函数中
 */
public class Example1 {
    int b = 100;
    int a1$_ = 20;
    //int ddsdsdsewhjehsjdhsjdhjs = 11;
    //int void = 30;
    float f1 = 0.0F;
    double d1 = 0.0D;


    //变量的命名格式
    short s1 = 5;
    short s2;


    String hello威哥 = "威哥";//标识符支持汉字，完全不推荐 ASCII码 UTF-8

    public static void main(String[] args) {
        int a = 10;//a - 基础数据类型变量
        String str = "lisi"; // str - 引用数据类型变量
        System.out.println(a);
        System.out.println(args);
        System.out.println("请输入:");
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        System.out.println(next);
    }

    @Test
    public void methodArr(){
        //System.out.println(a);
        System.out.println(b);
        System.out.println(a1$_);
        System.out.println(hello威哥);
        s2 = 20;
        System.out.println(s2);
    }

    /**
     * 获取订单号
     * @param id 订单主键
     * @return
     */
    public String getOrderNo(Long id){
        return "z237827382783728372";
    }

    /**
     * 测试类型转换
     */
    @Test
    public void testType(){
        int a = 4;
        long l = 8;
        short s = 2;
        //s = a;
        a =s ;
        a = (int)l;//强制类型转换格式 (数据类型)
        System.out.println(a);

        boolean b = false;
        //a = (int)b;
    }

    /**
     * 转义字符测试
     * \n : 反斜\n 换行
     */
    @Test
    public void testFn(){
        String str = "abcfhd";
        System.out.println(str);//ln \n 同样的作用
        System.out.print("hgj\rfkf"); // \r : 将当前位置移，前面内容清除
        System.out.println("----------------------");
        System.out.println("bbcbcbc\tdjshjds");
        System.out.println("----------------------");
        System.out.println("dhjs\\hjds");//\转义字符
        System.out.println("----------------------");
        System.out.println("dshjds\"hjds");
        System.out.println("dshjds'hjds");
        char c = 'd';
    }

    /**
     * 运算符与优先级
     * 表达式：由变量、常量、运算符组成的式子
     * 运算符（常用）
     * +  ： 加
     * -  ：减
     * * : 乘
     * / : 除
     * ++ : 自增 1个单位
     * -- ： 自减 1个单位
     *  前自增 ： 先计算表达式，再执行功能语句
     *  后自增 ： 先执行功能语句，再计算表达式
     * % : 模 取余数
     */
    @Test
    public void testFn1(){
        int a = 100;
        System.out.println(a + 5);
        a++;
        System.out.println(a);
        System.out.println(a--);
        System.out.println(a % 5);//???
        a = a % 5;

        int b = 40;

        System.out.println(b % 3 + a % 6);//??
        System.out.println("------------------");
        System.out.println(--b);
        System.out.println("------------------");
        System.out.println(b - 1);
        short s1 = 5;
        s1 = s1--;
        s1 = (short) (s1 - 1);
    }

}
