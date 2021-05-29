package com.lovecoding.day06.package2;

import com.lovecoding.day06.package1.Example4;

public class Example5 extends Example4{

    public int age = 30;

    public void method(){
        Example5 example5 = new Example5();
    }
}
class Person{
    public void method(){
        Example4 example4 = new Example4();
        example4.method();

    }
}