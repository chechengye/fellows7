package com.lovecoding.day09;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 售票案例 火车站
 */
public class Example8 {
    public static void main(String[] args) {
        MyRunnable2 mr2 = new MyRunnable2();
        Thread t1 = new Thread(mr2);
        Thread t2 = new Thread(mr2);

        t1.start();
        t2.start();
    }
}

/**
 * 同步来处理多线程同时执行代码问题
 * 1、synchronized 代码块来解决
 * 2、同步方法synchronized 修饰一个方法
 * 3、ReentrantLock ：推荐 更加灵活好用 可重入锁
 */
class MyRunnable2 implements Runnable{

    private int ticketNum = 10;
    private Object obj = new Object();
    @Override
    public void run() {
        for(int i = 0 ; i < 20 ; i++){

            /*synchronized (obj){
                ticketNum--;
                if(ticketNum < 0)
                    break;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("剩余" + ticketNum + "票");
            }*/
            saleLock();

        }
    }

    /**
     * 同步方法
     */
    public synchronized void sale(){
        ticketNum--;

        if(ticketNum < 0)
            return;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("剩余" + ticketNum + "票");
    }

    ReentrantLock lock = new ReentrantLock();
    public void saleLock(){
        lock.lock();//上锁
        try {
            ticketNum--;
            if(ticketNum < 0)
                return;
            Thread.sleep(1000);
            System.out.println("剩余" + ticketNum + "票");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {//一定会被执行的代码
            lock.unlock();//解锁
        }

    }

}