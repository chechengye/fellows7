package com.lovecoding.day09;

import java.util.*;

/**
 * Collections类
 *
 */
public class Example1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 1 , 3 , 1 , 5, 8, 9);
        System.out.println("-------------1. 排序操作（主要针对List接口相关）------------");
        //反转
        //Collections.reverse(list);
        //洗牌
        //Collections.shuffle(list);
        for(int i = 0 ; i < list.size() ; i++){
            if(i == 3){//在特定情况下，进行集合元素的交换处理
                Collections.swap(list , 0 , list.size() - 1);
            }
        }
        Collections.rotate(list , 2);


        System.out.println("-------2. 查找和替换（主要针对Collection接口相关）-------");
        Collections.sort(list);
        System.out.println("index = " + Collections.binarySearch(list, 3));

        System.out.println("max val = " + Collections.max(list));

        System.out.println("1 count = " + Collections.frequency(list, 1));

        Collections.replaceAll(list , 1 , 888);


        System.out.println("------------3. 同步控制-----------");
        List<String> list1 = new ArrayList<>();
        List<String> listSync = Collections.synchronizedList(list1);
        listSync.add("tom");
        listSync.add("test");
        System.out.println(listSync.get(1));

        System.out.println("------4. 设置不可变集合----");

        List<Object> emptyList = Collections.emptyList();//不可变的
        //应用场景、数据库查询数据集合，返回空的集合。null
        //emptyList.add("空集合，不可变");//java.lang.UnsupportedOperationException
        //System.out.println(emptyList.get(0));
        System.out.println(emptyList);
        System.out.println("------存放一个元素的不可变集合-------");
        List<String> tomList = Collections.singletonList("tom");

        System.out.println(tomList.get(0));
        System.out.println("------5. 其它----");
        //若两个集合元素全不相同则返回true否则返回false
        //System.out.println(Collections.disjoint(list, tomList));
        List<Integer> list3 = new ArrayList<>();
        Collections.addAll(list3 , 55,66,77);

        System.out.println(list3);

        System.out.println("--------比较器翻转-------");

        TreeMap<Person , String> treeMap = new TreeMap(Collections.reverseOrder(new PersonComparator()));
        treeMap.put(new Person(33 , "zhangsan" ),"a");
        treeMap.put(new Person(22 , "lisi" ),"b");
        treeMap.forEach((k,v)-> System.out.println(k +"->"+ v));
    }
}
class Person{

    private int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
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
}
