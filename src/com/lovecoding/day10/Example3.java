package com.lovecoding.day10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * JDK 1.5之前应用Java中已存在的线程池
 * 
 * 1、newSingleThreadExecutor：单线程池
 * 
 */
public class Example3 {

    public static void main(String[] args) {
        //创建一个单线程池，也就是存放一个线程
        //ExecutorService es = Executors.newSingleThreadExecutor();
        //创建可以指定线程数量的线程池
        //ExecutorService es = Executors.newFixedThreadPool(4);
        //缓存线程池，可以N个线程同时使用
        /*ExecutorService es = Executors.newCachedThreadPool();
        es.execute(new MyRunnable1());
        es.execute(new MyRunnable1());
        es.execute(new MyRunnable1());
        es.shutdown();*/
        //延迟线程池，可以延迟设定
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(3);
        ses.schedule(new MyRunnable1() , 0 , TimeUnit.SECONDS);
        ses.shutdown();
        //窃取线程池，必须有至少一个线程池存在才可以应用
        /*ExecutorService es = Executors.newWorkStealingPool();
        es.execute(new MyRunnable1());
        es.shutdown();*/
    }
}
class MyRunnable1 implements Runnable {

    @Override
    public void run() {
        for(int i =0 ; i < 10 ; i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "->" + i);
        }
    }
}
