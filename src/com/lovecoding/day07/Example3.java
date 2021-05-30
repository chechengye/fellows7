package com.lovecoding.day07;


import org.junit.Test;

import java.util.Random;

import static java.lang.Math.sqrt; //静态导入
/**
 * Math数学函数应用
 */
public class Example3 {
    public static void main(String[] args) {

        System.out.println(Math.PI);
        System.out.println("-------abs()取绝对值--------");
        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(-0.654));
        System.out.println("---------随机0~1之间的小数---------");
        System.out.println(Math.round(Math.random() * 100)); //返回整数部分

        System.out.println("---------直接引用静态导入的静态方法---------");
        System.out.println(sqrt(4));

        int pageNum = (int)Math.ceil(10 * 1.0/ 3);//ceil()天花板，会默认向上+1。
        System.out.println(pageNum);

    }

    /**
     * Random类应用
     * 伪随机数
     */
    @Test
    public void testRandom(){
        Random r = new Random();
        System.out.println(r.nextInt());//返回4个byte（32位中的某个值，包含正负数）

        System.out.println("-------------------");
        System.out.println(r.nextBoolean());

        System.out.println("----------推荐使用-----------");
        System.out.println(r.nextInt(100));
    }
}
