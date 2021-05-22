package com.lovecoding.day04;

/**
 * 1、继承是面向对象三大特征之一
 * 2、被继承的类称为父类（超类），继承父类的类称为子类（派生类）
 * 3、继承是指一个对象直接使用另一对象的属性和方法。
 * 4、通过继承可以实现代码重用
 *  extends ： 继承关键字使用extends
 *  protected : 修饰的属性可以被继承 （修饰符的权限大于等于它 默认的,public）
 *  private不可以被继承过去
 *  类不支持多继承 / 多重继承 。但支持多层继承
 *
 *  限制：
 *  1、Java只能实现单继承，也就是一个类只能有一个父类
 *  2、允许多层继承，即：一个子类可以有一个父类，一个父类还可以有其他的父类
 *  3、继承只能继承非私有的属性和方法。
 *  4、构造方法不能被继承 (但是，实例化子类对象的时候，会先实例化父类对象)
 *  this()与super调用父类构造方法不能同时在一个构造方法中使用
 */
public class Example11 {
    public static void main(String[] args) {
        /*Animal a = new Animal();
        System.out.println(a.name);*/
        Pig pig = new Pig("小野猪");
        //pig.name = "小花猪";
        pig.age = 4;
        System.out.println(pig.name + " , " + pig.age);
        System.out.println("---------调用父类的方法---------");
        pig.eat();
        //pig.Animal();
    }
}

class Animal{
    protected String name;
    int age = 10;

    /*public Animal(){
        System.out.println("Animal的构造方法");
    }*/
    public Animal(String name){
        this.name = name;
    }
}

class Pig extends JiaQ{
    /*public Pig(){
        this("");
        System.out.println("Pig的构造方法");
    }*/

    public Pig(String name){
        //this(name, 11);
        super(name);
        this.name = name;
    }

    public Pig(String name , int age){
        super(name);
    }
}

class JiaQ extends Animal{

    public JiaQ(String name){
        super(name);
    }

    public void eat(){
        System.out.println("吃五谷杂粮..");
    }
}