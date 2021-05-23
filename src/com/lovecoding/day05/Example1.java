package com.lovecoding.day05;

/**
 * 方法的重写（overriding）
 * 1、方生在子类与父类之间的
 * 2、子类重写父类的方法、若是子类对象则调用子类的方法
 * 3、重写条件
 *      1)方法名称、返回值类型、参数列表完全一致
 *      2)子类的访问修饰符要高于父类的
 *      3）子类方法抛出的异常要小于父类方法抛出的异常
 *      4）父类中的方法若使用private、static、final任意修饰符修饰，那么，不能被子类重写
 *
 *  面试题：overloading与overriding区别
 *
 *  1、重写基于父类与子类的  重载：是基于多个方法之间的
 *  2、重写：方法名称、返回值类型、参数列表完全一致  重载：方法名称一致、但参数列表不一致才能重载的条件。返回值类型不能构成重载条件
 *  3、重写：子类的访问修饰符要高于父类的  重载： 重载与修饰符无关
 *
 */
public class Example1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "旺财";
        dog.eat();

        Cat cat = new Cat();
        cat.eat();
    }
}

class Animal{
    protected String name;
    protected  void eat() { // throws Exception
        System.out.println("吃");
    }

}
//默认执行 super();
class Dog extends Animal{

    public Dog(){
        super();
    }

    public void eat(){
        System.out.println(super.name + "吃骨头");
    }
}
class Cat extends Animal{
    //重写的强制限制，若加上子类的方法必须与父类中的方法是重写关系
    @Override
    protected void eat()  { //throws NullPointerException
        System.out.print("鱼");
    }
}
