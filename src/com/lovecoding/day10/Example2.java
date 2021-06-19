package com.lovecoding.day10;

/**
 * 生产者与消费者案例
 * 面试题：
 * Sleep与Wait的区别
 * 1、sleep 和  wait都会让线程到阻塞状态 （让出CPU的时间片）
 * 2、sleep不会让出监视器的所有权（锁） wait会让出监视器的所有权。
 * 3、sleep会在设定的时间之后，自动唤醒线程。 wait只能等待其它线程调用notify或notifyAll方法来进行唤醒。
 * 4、sleep是线程中的方法api。wait是Object中的方法。
 */
public class Example2 {
    public static void main(String[] args) {
        Food food = new Food();
        Thread t1 = new Thread(new Producer(food));
        t1.start();
        Thread t2 = new Thread(new Consumer(food));
        t2.start();
    }
}

/**
 * 生产者
 */
class Producer implements Runnable{

    private Food food;

    public Producer(Food food){
        this.food = food;
    }

    @Override
    public void run() {
        for(int i = 0 ; i < 20 ; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i % 2 == 0){
                food.productFood("宫保鸡丁" , "酸甜口味");
            }else{
                food.productFood("家常凉菜" , "咸口");
            }
        }
    }
}

/**
 * 消费者
 */
class Consumer implements Runnable{
    private Food food;

    public Consumer(Food food){
        this.food = food;
    }
    @Override
    public void run() {
        for(int i = 0 ; i < 20 ; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            food.consumerFood();
        }
    }

}

/**
 * 共享数据
 */
class Food{
    private String name ;
    private String taste;//口味
    private boolean flag; //false : 表示可以生成 ， true可以消费

    public Food() {}

    public Food(String name, String taste) {
        this.name = name;
        this.taste = taste;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", taste='" + taste + '\'' +
                '}';
    }

    /**
     * 生成食物
     */
    public synchronized void productFood(String name , String taste) {

        if(flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name = name;
        this.taste = taste;
        flag = true;
        this.notifyAll();//表示唤醒所有等待的线程。 notify() : 表示随机唤醒一个等待的线程
    }

    /**
     * 消费食物
     */
    public synchronized void consumerFood() {
        if(!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.name + " - " + this.taste);
        flag = false;
        this.notifyAll();
    }
}