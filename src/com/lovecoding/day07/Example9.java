package com.lovecoding.day07;

import com.lovecoding.day07.util.DecimalFormatUtil;

/**
 * 数字格式化
 */
public class Example9 {

    public static void main(String[] args) {
        double pi = 3.1415926;

        System.out.println(DecimalFormatUtil.getDecimalForSix(pi));

        System.out.println(DecimalFormatUtil.getDecimalForTwo(pi));
    }
}
