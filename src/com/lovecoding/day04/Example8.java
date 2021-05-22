package com.lovecoding.day04;

/**
 * 代码块
 * 执行顺序
 * 类处于初始化完成时，会调用静态代码块
 * 静态代码块 > 构造代码块 > 构造块 > 普通代码块
 */
public class Example8 {
    public static void main(String[] args) throws ClassNotFoundException {
        //Cat c = new Cat();
        //c.eat();
        Class.forName("com.lovecoding.day04.Cat" , true , ClassLoader.getSystemClassLoader());//类加载控制
    }
}

class Cat{



    public Cat(){
        System.out.println("构造方法");
    }

    {
        System.out.println("构造代码块");
    }

    static {
        System.out.println("静态代码块");
    }



    public void eat(){
        int i = 20;
        System.out.println("我爱吃鱼" + i);

        {
            int j = 30;
            System.out.println("普通代码块");
            //System.out.println(i + j);
        }
    }
}