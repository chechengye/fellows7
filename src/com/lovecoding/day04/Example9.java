package com.lovecoding.day04;

/**
 * 单例设计模式
 * 1、构造方法私有化
 * 2、明一个本类对象
 * 3、给外部提供一个静态方法获取对象实例
 */
public class Example9 {
    public static void main(String[] args) {
        /*SingleTon s1 = SingleTon.getSingleTon();
        SingleTon s2 = SingleTon.getSingleTon();*/
        SingleTon1 s1 = SingleTon1.getSingleTon();
        SingleTon1 s2 = SingleTon1.getSingleTon();
        System.out.println(s1 == s2);// == 比较地址
    }
}

/**
 * 1、饿汉式
 */
class SingleTon{
    private static SingleTon singleTon = new SingleTon();


    private SingleTon(){}

    public static SingleTon getSingleTon() {
        return singleTon;
    }
}
/**
 * 1、懒汉式
 * 不完整
 */
class SingleTon1{
    private static SingleTon1 singleTon = null;//默认值就是null可以不写
    private SingleTon1(){}

    public static SingleTon1 getSingleTon() {
        if(null == singleTon)
            singleTon = new SingleTon1();
        return singleTon;
    }
}