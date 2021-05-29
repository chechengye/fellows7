package com.lovecoding.day06.package1;
import com.lovecoding.day06.package2.Example5;

/**
 * 私有的只允许本类里面调用
 */
public class Example4 {

    private int age;
    String name;
    protected String color;

    public void method(){
        System.out.println(name);
    }
}
class Order{
    public void method(){
        Example4 example4 = new Example4();
//        example4.
        System.out.println(example4.name);

        Example5 example5 = new Example5();

        Example5 example55 = new Example5();
        System.out.println(example55.age);
    }
}