package com.lovecoding.day04;

import java.sql.Statement;

/**
 * static关键字
 * 1、可以修饰属性、修饰的属性就是全局的。而且是多个对象直接共享的
 * 2、static修饰的属性或者是方法都可以通过类名直接调用
 * 3、static可以修饰一个类、仅限于内部类
 *
 * 修饰方法时有限制
 * 1、它们仅能调用其他的static 方法。 (生命周期不同)
 * 2、它们只能访问static数据。 
 * 3、static修饰的方法不能引用this/super关键词
 *    构造方法：创建对象/实例化对象时才会调用了
 *    static修饰的方法：类被初始化/加载完成之后即会调用的。
 */
public class Example6 {

    public static void main(String[] args) {
        StaticDemo sd = new StaticDemo();
        StaticDemo sd1 = new StaticDemo();
        StaticDemo sd2 = new StaticDemo();
        System.out.println(StaticDemo.num);
        System.out.println("-------------------------");
        StaticDemo.eat();
    }
}


class Rule{
    private String name;
    private String cunty;//国家



}
class StaticDemo{
    public static int num = 0;
    private int sum =20;


    public String name;

    public StaticDemo(){
        System.out.println("我是构造方法");
        num ++;
    }

    public void move(){
        //static int sum = 30; 局部变量不允许
    }

    public static void eat(){
        //this();
        System.out.println("正在吃..." + num);
        System.out.println();
        //this.run();
        //run();

    }

    public  void run(){
        System.out.println(sum);
    }
}
