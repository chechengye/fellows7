package com.lovecoding.day07;

/**
 * 函数式接口之Lambda表达式应用
 * 格式：
 * 1、若抽象方法没有参数()不能省略。若功能性语句只有一行代码，{}可以省略不写
 * 2、若抽象方法有一个参数。若一个参数类型可以省略不写。（）也可以省略不写
 * 3、若抽象方法有多个参数。小括号不能省略。参数类型可以省略（若一个省略就全省略，若一个不省略就都不省）
 * 4、若方法带返回值 .匿名内部类{}后面的;不能省略 。若多行代码。则return不能省略不写。若一行代码，则return可以省略不写，甚至与{}都可以省略不写
 * 5、参数可以加final修饰，也可以省略不写。但若显示final，需要将参数的所有类型都显示写出来。
 */
public class Example11 {
    public static void main(String[] args) {
        method();
        System.out.println("-----------------");

        Cat cat = ()-> System.out.println("喜欢吃老鼠");
        cat.eat();
        System.out.println("-----------------");

        Dog dog = (String thing ,String name , final int age) -> 100;
        System.out.println(dog.eat("骨头", "旺财" , 10));
    }

    public static void method(){
        //接口式匿名内部类
        Cat cat = new Cat() {
            @Override
            public void eat() {
                System.out.println("喜欢吃鱼");
            }
        };
        cat.eat();
    }
}

/**
 * @FunctionalInterface : 标记注解，标记一个接口为函数式接口。硬性要求，此接口中只允许有一个抽象方法。
 */
@FunctionalInterface
interface Cat{
    void eat();

}
interface Dog{
    int eat(String thing , String name , final int age);
}
