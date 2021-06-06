package com.lovecoding.day09.iterator;
/**
 * 容器接口 - List
 */
public interface Aggregate {

    int size();//获取容器大小

    void add(Object e);//添加元素的方法

    Object get(int index);//根据索引位置取值

    Iterator iterator();

}
