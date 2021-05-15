package com.lovecoding.day02;

import org.junit.Test;

/**
 * 1、打印直角三角形
 * *
 * **
 * ***
 * ****
 * *****
 */
public class Example23 {

    public static void main(String[] args) {
        for(int i = 1 ; i<=5 ; i++){
            for(int j = 1 ; j <=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 2 、打印99乘法表
     * 1x1 = 1
     * 1x2 = 2 2x2=4
     * ...
     *
     */
    @Test
    public void testFn(){
        for(int i = 1 ; i <= 9 ; i++){
            for(int j = 1 ; j <= i ; j ++){
                System.out.print(j + "x" + i + "=" + (j*i) + "\t");
            }
            System.out.println();
        }
    }
    /**
     * 3、镜像直角三角形
     *     *
     *    **
     *   ***
     *  ****
     * *****
     */
    @Test
    public void testFn1(){
        for(int i = 1 ; i <= 5 ; i++){
            for(int j = 5 ; j > 0 ; j --){
                if(j <= i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    /**
     * 4、等腰直角三角形
     *    *
     *   ***
     *  *****
     * *******
     **********
     */
    @Test
    public void testFn2(){
        for(int i = 1 ; i <= 5 ; i++){
            //内循环打印空格
            for(int j = i ; j < 5 ; j ++){
                System.out.print(" ");
            }
            //内循环打印*
            for(int j = 1 ; j <= 2 * i - 1 ; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
