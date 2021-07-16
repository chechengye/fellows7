package com.lovecoding.day11;

public class Student<T> {

    private T data;

    public Student(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
