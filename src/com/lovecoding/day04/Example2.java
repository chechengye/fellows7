package com.lovecoding.day04;

/**
 * 封装
 * 不想被外界直接访问的属性，可以进行封装(使用private修饰符进行私有化)
 */
public class Example2 {
    public static void main(String[] args) {
        Dog dog = new Dog();

        /*Dog d = null;
        System.out.println(d);*/
        
        //dog.age = 3;
        dog.setColor("黑色");
        //dog.color = "嘿嘿";
        //System.out.println(dog.age + " , " + dog.getColor());
        System.out.println(dog.printString());
        //dog.move();
    }
}



/**
 * 封装
 * 私有化的属性和方法只有本类可以调用
 *
 * 快捷键 ： ALT + INSERT
 * Getter 、Setter 、 Getter and Setter
 *
 * 成员变量与局部变量
 * 1、在类中的位置不同
 *成员变量：在类中定义
  局部变量：在方法中定义或者方法的参数
  2、在内存中的位置不同
  成员变量：在堆内存(成员变量属于对象，对象进堆内存)
  局部变量：在栈内存(局部变量属于方法，方法进栈内存)
  3、生命周期不同
   成员变量：随着对象的创建而存在，随着对象的销毁而消失
   局部变量：随着方法的调用而存在，随着方法的调用完毕而消失
 4、初始化值不同
  成员变量：有默认初始化值，引用类型默认为null
  局部变量：没有默认初始化值，必须定义，赋值，然后才能使用

 */
class Dog{
    private String color = "白色";
    private int age;
    private String name;
    private String type;
    //int i;

    /**
     * 对外暴露的修改私有值的方法
     * @param c
     */
    public void setColor(String c){
        color = c;
    }

    /**
     * 获取私有值的方法
     * @return
     */
    public String getColor(){
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /*@Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }*/

    /**
     * 打印方法、供重复使用
     * @return
     */
    public String printString(){
        return "Dog{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public void move(){
        int i;
        i = 20;
        System.out.println(i);
    }
}