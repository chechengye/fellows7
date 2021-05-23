package com.lovecoding.day05;

/**
 * 接口
 * 1、接口是一组行为的规范、定义，没有实现方法（JDK1.8默认方法）
 * 2、接口中的所有方法会默认加上public abstract 关键字修饰
 * 3、接口中定义的属性默认是 public final static修饰的
 * 4、接口还可以与常量类配合使用
 * 5、定义关键字为interface 类实现接口关键字用implements
 *
 * 面试题：
 * 抽象类与接口的区别
 * 1、抽象类还是类，具有类的特性和行为  接口定义基本都是行为，共性的功能
 * 2、抽象类只能被单继承    接口支持多继承/多实现
 * 3、抽象类中可以包含非抽象方法   接口中所有方法都是抽象方法（JDK1.8之前） default默认的方法
 * 4、抽象类可以不重写实现接口中的抽象方法。因为它自身就是要有出口的。
 *
 *
 *
 */
public class Example5 {
}

interface Fly{
    public final static int NUM = 20;
    public abstract void fly();
}

interface Move{
    void move();
}

interface Run{
    void run();
}

interface Middle extends Fly , Move{}
class Bird implements Middle{

    @Override
    public void fly() {
        System.out.println("缓慢飞行");
    }

    @Override
    public void move() {
        System.out.println("缓慢跳跃");
    }
}
abstract class Plane implements Middle{

}

interface OrderService{

    void update();
    Object getOrder();

    default void eat(){

    }
}

class OrderServiceImpl implements OrderService{

    @Override
    public void update() {








    }

    @Override
    public Object getOrder() {







        return null;
    }
}