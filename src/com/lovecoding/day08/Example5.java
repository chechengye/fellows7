package com.lovecoding.day08;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合应用实例猪舍
 */
public class Example5 {

    public static void main(String[] args) {
        PigManager pm = new PigManager();
        pm.add(new Pig(1 , "花花","黑色"));
        pm.add(new Pig(2 , "菜菜","白色"));
        pm.add(new Pig(3 , "佩奇","斑点"));

        System.out.println("-----------------");
        //pm.remove(2);
        pm.removeIf("花花");

        System.out.println("--------------------");

        pm.update(1 , new Pig(1 , "测试","黄色"));
        pm.printAll();
        System.out.println("-----------查询测试---------");
        System.out.println(pm.getPig(1));
    }
}

class PigManager{
    private List<Pig> pigs = new ArrayList<>(10);

    /**
     * 加入一只猪
     */
    public void add(Pig pig){
        pigs.add(pig);
    }

    /**
     * 删除一只猪
     * @param index
     */
    public void remove(int index){
        pigs.remove(index);
    }

    /**
     * 根据断言删除某一只猪
     * @param name)
     */
    public void removeIf(String name){
        pigs.removeIf((pig)->pig.getName().equals(name));
    }

    /**
     * 修改一只猪
     */
    public void update(int index , Pig pig){
        pigs.set(index , pig);
    }

    /**
     * 查询一只猪
     */
    public Pig getPig(int index){
        return pigs.get(index);
    }

    public void printAll(){
        System.out.println(pigs);
    }
}

class Pig{
    private int id;
    private String name;
    private String color;

    public Pig() {}

    public Pig(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}