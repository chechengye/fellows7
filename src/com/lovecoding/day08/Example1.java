package com.lovecoding.day08;

import java.util.*;

/**
 * Set集合讲解
 *
 * 无序的。
 * 不能存放重复值 。!e1.equals(e2)
 */
public class Example1 {

    public static void main(String[] args) {
        //hashSet();
        //treeSet();
        lickedHashSet();
    }

    /**
     * HashSet
     * 1、特别是它不保证该顺序恒久不变
     * 2、无序的
     * 3、底层实现使用的是HashMap。 会将存储的值，作为HashMap的键。然后使用一个空的Object对象进行HashMap值的站位。
     * 4、排除重复元素，是先判断hashCode是否相同，再判断equals是否相等

     *
     * 数据结构：
     * 哈希表 （散列队列 - 数组 + 链表）
     */
    public static void hashSet(){
        Set<String> set = new HashSet<>();
        set.add("tom");
        set.add("lily");
        //set.add("lily");
        set.add("lucy");
        set.add("array");
        set.add(null);
        set.add(null);//不能存放同样的值，只会打印一个。
        System.out.println(set.size());

        for(String s : set){
            System.out.println(s);
        }

        System.out.println("-------------------");

        String[] strings = set.toArray(new String[]{});

        for(String s : strings){
            System.out.println(s);
        }

        System.out.println("------------------------");
        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person(33 , "lisi"));
        personSet.add(new Person(22 , "zhangsan"));
        personSet.add(new Person(22 , "zhangsan"));

        Person[] persons = personSet.toArray(new Person[]{});

        for(Person p : persons){
            System.out.println(p.hashCode());
            System.out.println(p);
        }
    }

    /**
     * TreeSet
     *
     * 数据结构：TreeMap （二叉树）
     *
     * 1、可以按照值的自然顺序排序
     *
     */
    public static void treeSet(){
        Set<Integer> set = new TreeSet<>();

        set.add(22);
        set.add(15);
        set.add(88);
        set.add(22);

        for(Integer val : set){
            System.out.println(val);
        }
        System.out.println("-----------------");
        Set<Person> personSet = new TreeSet<>(new PersonComparator());
        personSet.add(new Person(22 , "zhangsan"));
        personSet.add(new Person(22 , "zhangsan"));
        personSet.add(new Person(33 , "lisi"));
        for(Person person : personSet){
            System.out.println(person);
        }


    }

    /**
     * 数据结构：哈希表 + 链表（双端链表）
     * 1、按存入顺序进行排列
     */
    public static void lickedHashSet(){
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("tom");
        set.add("lily");
        set.add("lucy");
        set.add("array");

        set.contains("lily");
        set.add("lily");

        for(String s : set){
            System.out.println(s);
        }
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
