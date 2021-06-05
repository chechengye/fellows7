package com.lovecoding.day08;


import java.util.*;

/**
 * Map集合讲解
 *
 * 键值对 key,value
 * 键不能重复，值可以重复
 *
 */
public class Example4 {

    public static void main(String[] args) {
        //map();
        hashMap();
    }

    /**
     * Map集合应用
     */
    public static void map(){
        Map<Integer , String> map = new HashMap<>();
        map.put(1,"tom");//添加元素方法
        map.put(2,"jack");
        map.put(50,"lucy");
        map.put(44,"lucy");
        map.put(2,"marry");//对相同键进行重新赋值
        System.out.println(map.size());

        //1、entrySet() 进行map集合遍历
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() +"->" + entry.getValue());
        }
        entrySet.forEach((entry)-> System.out.println(entry.getKey() + "->" +entry.getValue()));
        System.out.println("-------------------------");
        //2、keySet() 所有的键
        Set<Integer> keySet = map.keySet();
        for(Integer key : keySet){
            System.out.println(key + "->" + map.get(key));
        }

        //3、values() 取出值的集合
        System.out.println("-------------------------");
        Collection<String> values = map.values();
        for(String val : values){
            System.out.println(val);
        }
        //4、直接使用foreach
        map.forEach((k,v)-> System.out.println(k + "->" + v));

    }

    /**
     * HashMap
     * 数据结构：哈希表 （数组 + 链表 ）在JDK1.7之前  在JDK1.8之后 引入了树形结构（平衡二叉树 - 红黑树）
     * 1、在初始化/实例化的时候，会初始化默认的加载因子 值 0.75f
     * 2、扩容原理：当第一次put值的时候，会先默认申请容量为16大小的内存数组。第一次当数据容量达到加载因子0.75*数组长度 12时。进行扩容，扩容为原数组的2倍。
     * 3、当链表长度达到8的时候。引入了红黑树 - 左右子树长度一致的。
     * 4、线程不安全的，建议单线程使用
     * 5、当扩容之后，重排。（不能保证HashSet/HashMap里面的顺序恒久不变）
     *
     */
    public static void hashMap(){
        Map<Integer , String> map = new HashMap<>();
        map.put(1,"tom");//添加元素方法
        map.put(2,"jack");
        map.put(50,"lucy");
        map.put(44,"lucy");
        map.put(2,"marry");//对相同键进行重新赋值

        System.out.println(183555334 ^ 0);

        System.out.println(18354334 & 15);// <=15的值 0~15


    }

}
