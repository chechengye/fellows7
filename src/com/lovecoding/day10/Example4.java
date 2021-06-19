package com.lovecoding.day10;

import java.lang.reflect.*;

/**
 * 反射讲解
 * 
 * Class ： 所有类统称为Class类
 * 1、创建对象有三种方式
 * 1) 可以通过Object中的getClass方法获取
 * 2) 可以直接通过类名.class的方法
 * 3）可以forName方法获取Class对象
 */
public class Example4 {
    public static void main(String[] args) {
        Car car = new Car(null , null , 0);

        Class aClass = car.getClass();

        Class carClass = Car.class;

        System.out.println(aClass == carClass);//结果为？

        try {
            Class aClass1 = Class.forName("com.lovecoding.day10.Car");
            //使用Class反射调用无参的构造器实例化对象
            Car newCar = (Car)aClass1.newInstance();
            newCar.setName("兰博基尼");
            System.out.println(newCar);
            System.out.println("----------------------------------");
            //Class类在设计的时候，除了对象类型，又多加了9个  8大基本数据类型 + void
            Constructor cons = aClass1.getConstructor(String.class, String.class, int.class);
            Car luhu = (Car)cons.newInstance("路虎", "黑色", 400000);
            System.out.println(luhu);
            System.out.println(carClass == aClass1);

            System.out.println("-------------------------------");
            Constructor[] constructors = aClass1.getConstructors();
            for(Constructor con : constructors){
                if(con.getParameterCount() == 0){
                    Object o = con.newInstance();
                }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println("--------------获取包信息----------------");
        getPackage();

        System.out.println("-------------获取对象中方法信息------------");
        getMethod();

        System.out.println("------------------");
        getFields();
    }

    /**
     * 使用Class对象获取对象所在的包信息
     */
    public static void getPackage(){
        Class aClass = Car.class;
        Package aPackage = aClass.getPackage();
        System.out.println(aPackage.getName());
    }

    /**
     * 使用Class对象获取对象中的方法
     */
    public static void getMethod(){
        Class aClass = Car.class;
        Car car = new Car();
        Method[] methods = aClass.getMethods();//只会获取到由public修饰的本类中的方法和父类中的所有方法
        for(Method method : methods){
            System.out.println(method);
        }
        System.out.println("---------");
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for(Method m : declaredMethods){
            if(m.getName().equals("toString")){//查找调用的方法
                try {
                    System.out.println("--------------------");
                    System.out.println(m.invoke(car));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
            if(m.getName().equals("method")){//查找到了私有方法
                try {
                    m.setAccessible(true);//默认是false
                    System.out.println("方法的修饰符为：" + Modifier.toString(m.getModifiers()));
                    m.invoke(car , "被调用..");//java.lang.IllegalAccessException : with modifiers "private" 需要配合setAccessible使用
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    /**
     * 反射操作获取属性
     */
    public static void getFields(){
        Class aClass = Car.class;
        Field[] fields = aClass.getFields();

        Field[] declaredFields = aClass.getDeclaredFields();
        for(Field field : declaredFields){
            System.out.println(Modifier.toString(field.getModifiers()) + " "+ field.getType().getTypeName() + " " + field.getName());
        }
    }
}

class Car{
    private String color;
    public String name;
    
    protected int price;

    private int count;

    public Car() {
    }

    public Car(String color, String name, int price) {
        this.color = color;
        this.name = name;
        this.price = price;
    }

    public Car(String color, String name, int count , int price) {
        this.color = color;
        this.name = name;
        this.price = price;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private void method(String info){
        System.out.println("私有方法..." + info);
    }

    protected void method1(){
        System.out.println("受保护的方法...");
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
