package com.lovecoding.day06;

public class Example1 {
    public static void main(String[] args) {
        Outer out = new Outer();

        /*Outer.Inner inner = out.new Inner();
        inner.print();*/
        out.method();
        System.out.println("---------------------");
        out.method1();
        System.out.println("---------------------");
        Outer.Inner2 inner2 = new Outer.Inner2();
        inner2.print();

        System.out.println("----------------------");
        out.method2();
        System.out.println("----------------------");
        out.method3();
        System.out.println("----------------------");
        out.method4(new Person1() {
            @Override
            public void print() {
                System.out.println("参数式匿名内部类");
            }
        }, new Cat() {
            @Override
            public void eat() {
                System.out.println("爱吃鱼");
            }
        } );
    }
}

class Outer{

    /**
     * 成员内部类
     */
    private class Inner{
        public void print(){
            System.out.println("成员内部类");
        }
    }

    public void method(){
        Inner inner = new Inner();
        inner.print();
    }

    /**
     * 方法内部类
     * JDK 1.8之后加入的。方法内部类引用方法中局部变量的时候，会默认将其变成final修饰。
     */
    public void method1(){
        int x = 10;
        final int a = 20;
        x++;
        class Inner1 {
            public void print(){
                System.out.println("方法内部类" + a);
            }
        }
        Inner1 inner1 = new Inner1();
        inner1.print();

        System.out.println(x);
    }

    /**
     * 静态内部类
     */
    static class Inner2{
        public void print(){
            System.out.println("静态内部类");
        }
    }

    /**
     * 匿名内部类
     * 1、继承式的匿名内部类
     */
    public void method2(){
        //子类被匿名存在了
        Person person = new Person() {
            @Override
            public void print() {
                System.out.println("继承式的匿名内部类");
            }
        };
        person.print();
    }

    /**
     * 2、接口式的匿名内部类
     */
    public void method3(){
        Person1 person1 = new Person1() {
            @Override
            public void print() {
                System.out.println("接口式的匿名内部类");
            }
        };
        person1.print();
    }

    /**
     * 参数式匿名内部类 -- 推荐使用
     * @param person1
     * @param cat
     */
    public void method4(Person1 person1 , Cat cat){
        person1.print();
    }

}

abstract class Person{
    abstract public void print();
}

interface Person1{
    void print();
}

interface Cat{
    void eat();
}

class A extends F{
    class B extends C{

    }
    class D extends E{

    }
}
class F{}
class C{}
class E{}