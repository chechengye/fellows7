package com.lovecoding.day05;

/**
 * 抽象类
 * 定义：很多具有相同特性或行为的类，会被抽象为一个抽象类
 * 1、含有抽象方法的类一定是抽象类，但抽象类不一定具有抽象方法
 * 2、抽象类不能被实例化
 * 3、抽象类不能声明为final
 */
public class Example4 {

    public static void main(String[] args) {
        Girl girl = new Girl();
        girl.move();

        //Person person = new Person();
    }
}

abstract class Person{
    protected int age;
    protected String name;

    protected abstract void say();//abstract:将一个方法抽象化，不进行具体实现了。由子类进行实现
}

class Man extends Person{

    @Override
    protected void say() { //非抽象子类一定要重写父类中的抽象方法。
        System.out.println("吹牛逼.");
    }
}
abstract class Woman extends Person{


    abstract void move();

    public void run(){

    }
}

class Girl extends Woman{

    @Override
    void move() {
        System.out.println("喜欢逛街");
    }

    @Override
    protected void say() {
        System.out.println("发嗲");
    }
}