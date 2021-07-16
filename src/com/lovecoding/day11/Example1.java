package com.lovecoding.day11;

import org.junit.Test;

import java.util.*;

/**
 * 泛型:
 *
 * 泛型 - 一种参数化类型、一种外部约束
 */
public class Example1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();//... = new ArrayList<>(); //... = new ArrayList();
        list.add("vince");
        list.add("bin");
        //list.add(100);   // 提示编译错误
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i); // 2
            System.out.println("name:" + name);
        }

    }


    @Test
    public void testFn(){
        Node<String> node = new Node("test");

        //转换
        Node<Number> numberNode = new Node<>(100);
        Node<Integer> integerNode = new Node<>(20);
        Number n1 = 100;
        Integer n2 = 20;
        n1 = n2; // Number 是 Integer的父类
        n2 = (Integer) n1;

        System.out.println("------------------------");
        method(numberNode);
        System.out.println("------------------------");
        node.setData("张三");
        System.out.println(node.getData());

        System.out.println("--------------------------");
        printMsg("aaa" , "bbbb" , 100 , 10d , new Node<>(100));

        System.out.println("----------------------");
        String[] arr = {"abc","efg","hjk"};
        Integer[] arr1 = {100 , 200 , 3000};
        System.out.println(Arrays.toString(exchangeArr(arr1 , 0 , 1)));
    }

    /**
     * 通配符 概念
     *
     * ? : 接收任意类型的泛型对象 、注意：不支持修改值，但可以读取值应用（不清楚具体参数类型）
     *
     * ? extends Number : Number及其子类支持 (Number ： 称为泛型的上限)
     *
     * ? super Integer : Integer自身及其父类  （Integer ： 称为泛型的下限）
     * @param node
     */
    public void method(Node<?> node){
        //node.setData(50);
        System.out.println(node.getData());
    }


    /**
     * 泛型方法应用
     */
    public <V> void printMsg(V... arr){
        for(V v : arr){
            System.out.println(v);
        }
    }

    /**
     * 完成任意类型数组的元素交换并返回
     */
    public <T> T[] exchangeArr(T[] arr , int start , int end){
        T temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return arr;
    }

    @Test
    public void testFn1(){
        Map<String , Integer> map = new HashMap<>();
        map.put("aaa" , 50);
        map.put("bbb" , 100);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            System.out.println(next.getKey() + "->" + next.getValue());
        }

        System.out.println("--------应用自定义的泛型嵌套--------");
        School<Student<String>> school = new School<>(new Student("zhangsan"));
        System.out.println("姓名: " + school.getStudent().getData());
    }
}

interface IEat<E>{
    void eat(E data);
}