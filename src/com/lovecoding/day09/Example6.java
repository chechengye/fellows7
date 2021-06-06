package com.lovecoding.day09;

/**
 * 线程Thread
 * 创建方式
 * 1、继承Thread类
 * 2、实现Runnable接口
 *
 * sleep() :可以让出CPU的时间片，进行下次抢占 。线程进入阻塞状态
 */
public class Example6 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.setName("MyThread");
        mt.start();//让进程处于就绪状态。默认执行run方法
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr);
        t.setName("MyRunnable");
        t.start();
        /*for(int i = 0 ; i < 50 ; i++){
            if(i == 20){
                try {
                    mt.join();//join操作
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "->" + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
        for(int i = 0 ; i < 50 ; i++) {
            if (i == 20) {
                //t.interrupt();//中断其它线程
                mr.setFlag(true);
            }
            System.out.println(Thread.currentThread().getName() + "->" + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}

/**
 * 继承Thread重写Run()方法
 */
class MyThread extends Thread{

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

/**
 * 实现Runnable接口方式创建
 * 中断自身
 * 1、自己调用interrupted()进行中断
 * 2、自定义标记中断线程 flag
 */
class MyRunnable implements Runnable{

    private boolean flag;
    @Override
    public void run() {
        for(int i = 0 ; i < 100 ; i++){
            /*try {
                if(Thread.currentThread().isInterrupted()){//判断当前线程的中断状态
                    break;
                }
                Thread.sleep(300);//java.lang.InterruptedException: sleep interrupted
            } catch (InterruptedException e) {
                Thread.interrupted();//自身中断被允许
                //e.printStackTrace();
            }*/
            if(flag) break;
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ",i = " + i);


        }
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}