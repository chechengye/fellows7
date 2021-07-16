package com.lovecoding.day11;

public class School<T> {

    private T student;

    public School(T data){
        this.student = data;
    }

    public T getStudent() {
        return student;
    }

    public void setStudent(T student) {
        this.student = student;
    }
}
