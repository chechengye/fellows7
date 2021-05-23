package com.lovecoding.day05;

/**
 * 多态应用实例
 * this.show(Obj)
 * super.show(Obj)
 * this.show((super..)Obj)
 * super.show((super..)Obj)
 *
 */
public class Example7 {

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();//自动向上转型
        B b = new B();
        C c = new C();
        D d = new D();
        System.out.println("-----------------");
        a1.show(b);
        System.out.println("-----------------");
        a1.show(c);
        System.out.println("-----------------");
        a1.show(d);
        System.out.println("-----------------");
        a2.show(b);
        System.out.println("-----------------");
        a2.show(c);
        System.out.println("-----------------");
        a2.show(d);
        System.out.println("-----------------");
        b.show(b);
        System.out.println("-----------------");
        b.show(c);
    }
}
class A{
    public void show(A a){
        System.out.println("A AND A");
    }

    public void show(C c){
        System.out.println("A AND C");
    }

    public void show(B b){
        System.out.println("A AND B");
    }
}
class B extends A{
    public void show(B b){
        System.out.println("B AND B");
    }

    public void show(A a){
        System.out.println("B AND A");
    }
}
class C extends B{}

class D extends B{}