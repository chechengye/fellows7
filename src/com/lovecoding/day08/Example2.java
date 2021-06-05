package com.lovecoding.day08;

import java.util.*;

/**
 * Iterator讲解
 *
 */
public class Example2 {

    public static void main(String[] args) {
        //listIterator();
        //iterator();
        //enumeration();
        foreach();
    }

    /**
     * List集合中特有的
     */
    public static void listIterator(){
        List<String> list = new ArrayList<>();

        list.add("关关");
        list.add("备备");
        list.add("飞飞");

        Iterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }

    /**
     * 所有集合中均可使用
     */
    public static void iterator(){
        Set<String> set = new HashSet<>();

        set.add("关关");
        set.add("备备");
        set.add("飞飞");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

    /**
     * Vector中独有的，遍历使用
     */
    public static void enumeration(){
        Vector<Integer> v = new Vector<>();
        v.add(3);
        v.add(5);
        v.add(8);
        Enumeration<Integer> elements = v.elements();
        while (elements.hasMoreElements()){
            System.out.println(elements.nextElement());
        }
    }

    /**
     * foreach : 所有集合均可使用jdk1.5之后引入
     *
     * System.out::println 应用 Consumer函数式接口的应用、只有一个无返回值的一个参数的抽象方法。
     *
     * :: 应用 (不太推荐使用 1、可读性差 2、应用限制太多)
     * 应用与对象 引用方法
     * 应用与类 引用静态方法 Integer::valueOf
     */
    public static void foreach(){
        List<String> list = new ArrayList<>();
        list.add("关关");
        list.add("备备");
        list.add("飞飞");
        list.add("曹操");

        /*list.forEach((str)->{
            System.out.println(str);
        });*/
        list.forEach(System.out::println);
    }
}
