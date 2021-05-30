package com.lovecoding.day07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * Collection
 * 1、建议一组相同类型的数据
 * 2、可以重复的
 * 3、有序的，按存入时的顺序
 *
 * List
 * ArrayList: 单线程查询与更新时使用
 * Vector : 多线程下使用
 * LinkedList : 单线程下做频繁插入删除操作时使用
 */
public class Example12 {

    public static void main(String[] args) {
        //arrayList();
        //vector();
        linkedList();
    }

    /**
     * ArrayList
     * 1、集合要有泛型约束，来保证统一类型
     * 2、当实例化时，会先创建一个空数组出来。
     * 3、扩容原理：当第一次添加元素时，会扩容到容量为10。当再次装满时，会扩容到原数组长度+ 原数组长度的一半 (L + L >> 1
     * 4、数据结构：动态数组
     * 5、不适合做大量的插入与删除操作。
     * 6、为了防止扩容次数过多建议给定初始容量
     * 7、线程不安全，适合在单线程访问时使用
     *
     */
    public static void arrayList(){
        List<String> list = new ArrayList<>(50);
        list.add("tom");
        list.add("lily");
        list.add("jack");
        list.add("jack");
        list.add(null);
        list.add(null);
        list.add("lucy");

        list.set(2 , "关关");
        for(int i= 0 ; i < list.size() ; i++){
            System.out.println(list.get(i));
        }

       // System.out.println(list.get(22));

    }

    /**
     * 向量
     * 1、数据结构：动态数组
     * 2、向量的初始容量就是10
     * 3、线程安全的，适合多线程下使用
     * 4、扩容原理：当增量为0时，扩容到原来数组长度的2倍 。若增量大于0 ，扩容到原来数组长度+增量大小
     * 5、为了防止扩容次数过多建议给定初始容量
     * 6、不适合进行删除和插入
     *
     */
    public static void vector(){
        List<String> list = new Vector<>(10 ,20);
        list.add("tom");
        list.add("lily");
        list.add("jack");

        for(int i = 0 ; i < list.size() ; i++){
            System.out.println(list.get(i));
        }
    }

    /**
     * LinkedList
     * 1、数据结构：双向链表、支持头/尾操作
     * 2、默认从尾部添加元素的
     * 3、折半查找节点，并返回响应的节点值
     * 4、适合插入与删除操作。不适合查询操作。
     * 5、线程不安全的，单线程下使用
     */
    public static void linkedList(){
        List<String> list = new LinkedList<>();
        list.add("tom");
        list.add("lily");
        list.add(null);
        list.add("jack");

        System.out.println(list.get(1));

        for(int i = 0 ; i < list.size() ; i++){
            System.out.println(list.get(i));
        }

    }
}

class Person{

}
