package com.lovecoding.day10;

/**
 * 死锁 ： 过度的使用同步，若同步方法进行互调可能会产生死锁
 * 不建议使用：
 * （1） 同步方法进行互调可能会产生死锁
 *  （2） IO流，流读取
 *  （3）数据库操作等，若未释放
 */
public class Example1 {

    public static void main(String[] args) {
        new MyRunnable();
    }
}
class MyRunnable implements Runnable{
    Customer c = new Customer();
    Waiter w = new Waiter();

    public MyRunnable(){
        new Thread(this).start();
        w.say(c);
    }

    @Override
    public void run() {
        c.say(w);
    }
}
class Waiter{

    public synchronized void say(Customer c){
        System.out.println("先买单，再吃饭！！！");
        c.doThing();
    }

    public synchronized void doThing() {
        System.out.println("OK,先吃饭再付款");
    }
}

class Customer{

    public synchronized void say(Waiter w){
        System.out.println("先吃饭，再买单！！！");
        w.doThing();
    }

    public synchronized void doThing() {
        System.out.println("OK,先付款再吃饭");
    }
}