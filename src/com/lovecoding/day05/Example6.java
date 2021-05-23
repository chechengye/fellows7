package com.lovecoding.day05;
/**
 * 多态讲解
 * 对象的多种形态
 * 使用父类接收子类对象的过程称为自动向上转型
 */
public class Example6 {
    public static void main(String[] args) {
        Chicken homeChicken = new HomeChicken();
        //homeChicken.eat();

        System.out.println("-------------");

        Chicken yeChicken = new YeChicken();
        //yeChicken.eat();
        method(null);
    }

    public static void method(Chicken c){
        //c.eat();
        if(c instanceof HomeChicken){
            HomeChicken hc = (HomeChicken) c;//java.lang.ClassCastException: 在我们将父类对象强制向下类型转换的时候。防止发生此类异常，需要使用instanceof进行类型判断
            hc.say();
        }else if(c instanceof YeChicken){
            YeChicken yc = (YeChicken) c;
            yc.song();
        }else{
            System.out.println("对象类型没有找到！！！");
        }
    }
}

abstract class Chicken{

    public abstract void eat();
}

class HomeChicken extends Chicken{

    @Override
    public void eat() {
        System.out.println("吃小米");
    }

    public void say(){
        System.out.println("早晨打鸣");
    }
}

class YeChicken extends Chicken{

    @Override
    public void eat() {
        System.out.println("吃虫子");
    }

    public void song(){
        System.out.println("我会唱歌.");
    }
}