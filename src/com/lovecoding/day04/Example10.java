package com.lovecoding.day04;

import java.util.Arrays;

/**
 * 鸡舍管理案例
 */
public class Example10 {

    public static void main(String[] args) {
        ChickenManage cm = new ChickenManage();
        cm.addChicken(new Chicken("尖叫鸡" ,3 , 1 ));
        cm.addChicken(new Chicken("咕咕鸡" ,5 , 2 ));
        cm.addChicken(new Chicken("辣子鸡" ,4 , 3 ));
        /*cm.addChicken(new Chicken("辣子鸡1" ,4 , 4 ));
        cm.addChicken(new Chicken("辣子鸡2" ,4 , 5 ));
        cm.addChicken(new Chicken("辣子鸡3" ,4 , 6 ));*/
        System.out.println("--------------------------");
        cm.updateChicken(new Chicken("老母鸡" , 10 , 3));
        cm.printAll();
    }
}

/**
 * 对鸡舍进行增删改查（CURD）
 */
class ChickenManage{

    private Chicken[] chickens = new Chicken[5];
    private int count = 0;

    //增加方法
    public void addChicken(Chicken c){
        if(count == chickens.length) //扩容 Arrays.copyOf() System.copy
            //扩容长度： 1、扩容到原来的2倍 2、扩容到原来的 L:长度 （L + (L / 2  + 1)）
            chickens = Arrays.copyOf(chickens , chickens.length * 2);
        chickens[count++] = c;
    }
    //打印
    public void printAll(){
        for(Chicken c : chickens){
            if(null != c)
                c.printInfo();
        }
    }

    //修改一只鸡
    public void updateChicken(Chicken c){
        /*for(Chicken cc : chickens){
            // 找到这只鸡了
            if(cc.getId() == c.getId()){
                cc.setId();
            }
        }*/
        for (int i = 0; i < count ; i++) {
            if(chickens[i].getId() == c.getId()){
                chickens[i] = c;
            }
        }
    }

}
class Chicken{

    private String name;
    private int month;
    private int id; //编号:唯一标识

    public Chicken() {}

    public Chicken(String name, int month, int id) {
        this.name = name;
        this.month = month;
        this.id = id;
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void printInfo(){
        System.out.println( "id : " + id  + " , name : " + name + " , month : " + month);
    }
}