package com.lovecoding.day06;

/**
 * 包装类
 */
public class Example3 {

    public static void main(String[] args) {
        int i1 = 10;

        Integer i2 = new Integer(i1);//装箱操作

        int i3 = i2.intValue();//拆箱操作

        Integer i4 = new Integer("1234");//字符串必须由数字组成，否则会报NumberFormatException
        System.out.println(i4);

        byte b = 1;
        Byte b1 = new Byte(b);

        byte b2 = b1.byteValue();

        System.out.println("--------------------");
        //字符串与基本的包装类型互转

        int s1 = Integer.parseInt("12345");
        double d = Double.parseDouble("11.34");

        System.out.println(d);

        System.out.println("------------享元模式------------");
        //WEB项目开发时，不再使用基本数据类型，全部改为包装类型。
        //Integer : 1b（字节）的空间共用。称为享元空间 支持大量细粒度的对象
        Integer i5 = 10;
        Integer i6 = 10;
        System.out.println(i5 == i6);

        Integer i7 = 128;
        Integer i8 = 128;
        System.out.println(i7 == i8);

        Integer i9 = new Integer(10);
        Integer i10 = new Integer(10);
        System.out.println(i9 == i10);

        Integer i11 = new Integer(128);
        Integer i12 = new Integer(128);
        System.out.println(i11 == i12);

        //将Long 型转为int类型
        Long l = 10L;
        int n = l.intValue();
    }
}
