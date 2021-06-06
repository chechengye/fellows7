package com.lovecoding.day09;

/**
 * 守护线程
 */
public class Example7 {

    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1();
        // mt1.setDaemon(true);//将此线程设定为守护线程 -- 特点当所有用户线程全部执行完毕后，守护线程将退出不在执行
        System.out.println(mt1.isAlive());
        System.out.println("-----------------");
        mt1.setName("MyThread1");
        mt1.setPriority(Thread.MIN_PRIORITY);
        mt1.start();

        //System.out.println(mt1.isAlive());//处于激活状态，必须是运行的
        MyRunnable1 mr1 = new MyRunnable1();
        Thread t1 = new Thread(mr1);
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.setName("MyRunnable1");
        t1.start();


        for(int i = 0 ; i < 20 ; i++){

            /*if(i == 10){
                Thread.yield();//让出一次执行，此次不再抢占资源
            }*/
            System.out.println(Thread.currentThread().getName() + ",i = " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class MyRunnable1 implements Runnable{

    @Override
    public void run() {
        for(int i = 0 ; i < 50 ; i++){
            System.out.println(Thread.currentThread().getName() + ",i = " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
class MyThread1 extends Thread{

    @Override
    public void run() {
        for(int i = 0 ; i < 50 ; i++){
            System.out.println(Thread.currentThread().getName() + ",i = " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}