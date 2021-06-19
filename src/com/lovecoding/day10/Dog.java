package com.lovecoding.day10;

import java.io.Serializable;

public class Dog implements Serializable {
    private String name;
    private int month;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", month=" + month +
                ", color='" + color + '\'' +
                '}';
    }
}