package com.lovecoding.day04;

/**
 * 类
 * 定义格式
 * 修饰符 关键字 class 类名(驼峰，且首字母大写) { 类作用域 ： 属性、方法}
 *
 * 注意：
 * 一个文件中可以包含多个类。但有且仅有一个公有类
 *
 * 对象
 * 若想操作一个类，必须依附于对象
 * 格式: 类名 对象名 = new 类名();
 * 修饰符private修饰的属性或者是方法不能被对象调用
 *
 * 小结：
 * （1）new关键字：表示向内存申请空间，也表示实例化一个对象，创建一个对象。
 *（2）一个对象在内存中的大小，由该对象的所有属性所占的内存大小的总和。引用类型变量在32位系统上占4个字节，在64位系统上占8个字节。加上而外的对象隐性数据所占的大小。
 *（3）相同的类型才可以赋值
 *（4）不同的引用，指向同一个对象，任何一个引用改变对象的值，其它引用都会反映出来。
 *（5）编程时要注意的问题，在确定不使用对象时，要尽早释放对象：引用=null
 *（6）当一个堆中的对象没有被任何引用变量所指向时，该对象会被JVM 的 GC 程序认为是垃圾对象，从而被回收。
 */
public class Example1 {


    int age = 10;
    String name = "张三";

    public void eat(){

    }

    public static void main(String[] args) {
        Horse hHorse = new Horse();//具体的马的对象- 小黑马
        hHorse.name = "小黑马";
        System.out.println(hHorse.name);
        hHorse.age = 3;
        System.out.println(hHorse.age);
        hHorse.eat();

        Horse bHorse = null;//java.lang.NullPointerException ：没有申请内存空间，若引用则报错
        //System.out.println(bHorse.name);

        new Horse().eat();//匿名对象调用 ， 使用一次就消失了。

        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        horse1.name = "斑马";
        horse1.age = 10;
        horse2.name = "小马";
        horse2.age = 20;
        horse2 = horse1;
        horse2.name = "家马";
        System.out.println(horse1.name + " , " + horse1.age);
        Dog dog = new Dog();
        //horse2 = dog;
    }
}

/**
 * 马的类
 * String : 占用字节大小 。32位系统中 占 4个字节  64系统中占用的是8个字节
 */
class Horse{
    String name;
    int age;

    void eat(){
        System.out.println("吃什么东西");
    }
}
