package com.lovecoding.day05;
/**
 * final关键字讲解
 * 1、可以修饰一个属性（成员、局部变量）、成为常量存于堆内存中的常量池中
 *    1)修饰的属性不能被修改
 *    2)final修饰的属性通常都是public static final的，共项目中所有类调用的
 *    3）由final修饰的属性，全部大写，多个单词之间使用_分隔
 * 2、final可以修饰一个方法，子类只能调用不能重写
 * 3、final可以修饰一个类，最终类不能被继承。
 * 4、在方法参数中使用final，在该方法内部不能修改参数的值（在内部类中详解）
 */
public class Example3 {



    public static void main(String[] args) {
        System.out.println(Constant.URL.WX_URL);
        SunDemo sunDemo = new SunDemo();
        sunDemo.method();
    }

    public void testMethod(){

        System.out.println(Constant.PERSON_NUM);
    }
}

class FinalDemo{
    //final int a;

    public final void method(){
        System.out.println("测试方法");
    }
}

class SunDemo extends FinalDemo{
    /*public final void method(){

    }*/
}
class Constant{
    public static  final int PERSON_NUM = 10;


    interface URL{
        String WX_URL = "http://xxx.com";
    }
}