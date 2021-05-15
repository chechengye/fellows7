package com.lovecoding.day02;

/**
 * 运算符
 *
 * 逻辑运算符
 * &  && : 有一个为假 即为假
 * |  || ： 有一个为真  即为真
 *
 *  & : 逻辑与，无论表达式前端的结果如何、后面都会执行
 *  && ： 短路与，如果前面为假 ，后面就不会再执行
 *
 */
public class Example1 {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        //a+=5;
        a = a + 5;
        System.out.println(a);

        System.out.println("---------------------");
        if(a > 10 || ++b > 15){
            System.out.println(b);
            System.out.println(a %= b);
        }

        if(a != b){//a不等于b真
            System.out.println("--------------");
            System.out.println(--b);
        }
    }
}
