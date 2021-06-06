package com.lovecoding.day09;


import java.util.Comparator;

/**
 * 遵从OO原则：对修改关闭、对扩展开放
 */
public class PersonComparator implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
    }
}
