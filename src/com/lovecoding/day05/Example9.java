package com.lovecoding.day05;

/**
 * Object
 * 它是所有类的父类/超类 包括数组
 *
 * 面试题:
 * final ： 修饰属性就是常量 、修饰的方法不能被重写 、修饰的类不能被继承
 * finally ： 异常涉及到..
 * finalize()  ： Object类中的方法，供GC垃圾回收器使用，也就是JVM主动调用用来销毁对象的。
 * 有什么区别
 *
 * toString() ： 是访问对象时默认调用的方法
 */
public class Example9 {

    public static void main(String[] args) {
        int n = 10;
        int m = 10;
        System.out.println(m == n);
        System.out.println("--------------");
        String str1 = new String("小飞");
        String str2 = new String("小飞");
        System.out.println(str1 == str2);
        System.out.println("-------------------");
        String str3 = "小备";
        String str4 = "小备";
        System.out.println(str3 == str4);
        System.out.println("-------------------");
        System.out.println(str1.equals(str2));
        System.out.println("-------------------");
        Student s1 = new Student(1 , "小王", 0);
        Student s2 = new Student(1 , "小王", 1);
        System.out.println(s1.equals(s2));
        System.out.println("----------------------------");
        System.out.println("class = " + s1.getClass());
        System.out.println(s1.getClass() == s2.getClass());
        System.out.println(s2.hashCode());//s1 = 1836019240 s2=1836019240
        System.out.println("------------------");
        System.out.println(s1.toString());
        System.out.println(s2);

    }
}

class Student{
    private int age;
    private String name;
    private int sex; //0 - 男 1 - 女

    public Student() {
    }

    public Student(int age, String name, int sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    /**
     * 重写了Object类中的equals方法
     *
     * 自反性 : a.eq(a)
     * 对称性 : a.eq(b) b.eq(a)
     * 传递性: a.eq(b) b.eq(c) c.eq(a)
     * 一致性 : a.eq(b)
     *  x.equals(null) = false
     * @param anObject
     * @return
     */
    public boolean equals(Object anObject) {
        if(this == anObject)
            return true;
        if(anObject instanceof Student){
            Student s = (Student)anObject;//强制向下类型转换
            if(this.age != s.getAge()) return false;
            else if(!this.name.equals(s.getName())) return false;
            else if(this.sex != s.sex) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}
