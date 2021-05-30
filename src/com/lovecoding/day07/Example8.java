package com.lovecoding.day07;


import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * 数字处理
 */
public class Example8 {

    public static void main(String[] args) {
        Integer i1 = 67676732;

        BigInteger b1 = new BigInteger("6767267763746374637647364736473");
        System.out.println(b1);

        BigInteger b2 = new BigInteger("736746736");

        System.out.println("---------大整型加法-------");
        BigInteger addInter = b1.add(b2);
        System.out.println(addInter);

        System.out.println("---------大整型乘法-------");
        BigInteger multiply = b1.multiply(b2);
        System.out.println(multiply);

        BigDecimal bd1 = new BigDecimal("33.33");
        BigDecimal bd2 = new BigDecimal("11.11");

        System.out.println("---------大浮点型减法-------");
        System.out.println(bd1.subtract(bd2));
        System.out.println("---------大浮点型除法-------");
        System.out.println(bd1.divide(bd2));//若除数除以被除数，必须能除开，除不开会报异常new ArithmeticException("Non-terminating decimal expansion
    }
}
