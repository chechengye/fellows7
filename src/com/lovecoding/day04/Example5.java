package com.lovecoding.day04;

/**
 * 一对一关系
 * 1、单向一对一关系 (从英雄出发，包含了武器)
 * 2、双向一对一关系 (两个对象直接要互相持有)
 */
public class Example5 {
    public static void main(String[] args) {
        Hero hero1 = new Hero("刘备" , 3000);
        hero1.setWeapon(new Weapon("雌雄双股剑" , 5));
        System.out.println("英雄" + hero1.getName() + "，他" + hero1.getAge() + "岁了 , 他手持" + hero1.getWeapon().getName());
        System.out.println("------------------双向------------------");
        Hero hero2 = new Hero("张飞",2980);
        Weapon weapon1 = new Weapon("丈八蛇矛" , 7);
        hero2.setWeapon(weapon1);
        weapon1.setHero(hero2);
        System.out.println("我是"+ weapon1.getName() + "，我排名" + weapon1.getSortLine() + "我属于" + weapon1.getHero().getName());
    }
}

/**
 * 英雄类
 */
class Hero{
    private String name;
    private int age;
    private Weapon weapon;

    public Hero(){}

    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weapon=" + weapon +
                '}';
    }
}

/**
 * 武器类
 */
class Weapon{
    private String name;
    private int sortLine;//排行

    private Hero hero;
    public Weapon(){}

    public Weapon(String name, int sortLine) {
        this.name = name;
        this.sortLine = sortLine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSortLine() {
        return sortLine;
    }

    public void setSortLine(int sortLine) {
        this.sortLine = sortLine;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", sortLine=" + sortLine +
                '}';
    }
}