package com.lovecoding.day11;

/**
 * 泛型：参数值 通常在 T 、E 、K、 V中
 *
 * @param <T>
 */
public class Node<T> {

    private T data;
    public Node(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
