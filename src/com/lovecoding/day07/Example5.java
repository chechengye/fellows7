package com.lovecoding.day07;

import java.util.Arrays;

/**
 * 面试题：
 * 为什么优先考虑使用Comparator而不是Comparable ？
 * Java代码编写要遵从OO原则：对修改关闭，对扩展开放。保持良好的封装性
 */
public class Example5 {

    public static void main(String[] args) {
        int[] arr = {10,3,6,7,22,2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        String[] arrStr = {"tom" , "lily" , "join"};
        Arrays.sort(arrStr);
        System.out.println("-------------------");
        System.out.println(Arrays.toString(arrStr));
        System.out.println("-------------------");
        Pig[] pigs = {new Pig(10,"佩奇") , new Pig(5 , "乔治"), new Pig(22 , "猪爸爸")};
        Arrays.sort(pigs , new PigComparator());
        System.out.println(Arrays.toString(pigs));//java.lang.ClassCastException

    }
}

class Pig {//implements Comparable
    private int age;
    private String name;

    public Pig() {//注意
    }

    public Pig(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * 重写Comparable方法
     * 定制比较规则
     * @param o
     * @return
     */
    /*@Override
    public int compareTo(Object o) {
        if(o instanceof Pig){
            Pig pig = (Pig) o;
            return this.age - pig.age;
        }
        return 0;
    }*/
}
