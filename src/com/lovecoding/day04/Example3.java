package com.lovecoding.day04;

/**
 * 构造方法
 */
public class Example3 {

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.printString());
        //p.Person();构造方法不允许直接使用对象调用
        //构造方法是实例化对象时自动调用的
        /*Person p1 = new Person("李四");
        System.out.println(p1.printString());*/

        Person p2 = new Person("王五" , "女" , 3);
        System.out.println("----------------------------");
        System.out.println(p2.getType());
        System.out.println(p2.printString());
    }
}

/**
 * 构造方法格式：
 * 1、与类名保持一致
 * 2、不能有返回值类型
 * 3、当实例化对象时，最先调用的方法
 * 4、可以应用构造方法进行初始化值操作
 * 5、构造方法输入方法也支持方法的重载 （构造方法重载）
 * 6、只会调用一个构造方法
 * 7、显示的调用构造方法时，参数要匹配
 * 8、所有类被定义时都会有一个默认的无参的构造方法。但是当写其它带参数的构造方法时，无参的构造方法会被取缔
 *
 * this用法：
 * 1、可以使用this()调用其它的构造方法。但是这行代码必须放于构造方法中的第一行
 * 2、this 可以调用本类对象的属性和方法（this ： 调用者对象）
 */
class Person{
    private String name;
    private String sex;
    private int type;

    public Person(){
        name = "张三";
        sex = "男";
    }

    //public Person(){ }
    public Person(String n , String s){
        //this("" , "" , 0);
        this();
    }
    public Person(int t){
        type = t;
    }

    public Person(String n , String s , int type){
        this("" , "");
        this.type = type;
        name = n;
        sex = s;
        //this.getType();
    }

    public String printString(){
        return "name = " + name + " , sex = " + sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
