package com.lovecoding.day04;

/**
 * 值传递与引用传递
 */
public class Example4 {

    public static void main(String[] args){
        int x = 10;
        method(x) ;
        System.out.println("x = " + x) ;
        System.out.println("------------------------");
        Duck d = new Duck();
        method(d);
        System.out.println(d.age);
        System.out.println("------------------------");

        String name = "小飞";
        method(name) ;
        System.out.println("name=" +name) ;
        System.out.println("-------------------------");
        Person1 p  = new Person1();
        method(p) ;
        System.out.println("person name= "+p.name) ;


    }
    public static void method(int mx){
        mx = 20;
    }

    public static void method(Duck duck){
        duck.age = 5;
    }

    public static void method(String sname){
        sname = "小备";
    }

    public static void method(Person1 p ){
        p.name = "备备";
    }


}
class Duck{
    int age = 2;
}

class Person1{
    String name = "飞飞";   //省略封装
}
