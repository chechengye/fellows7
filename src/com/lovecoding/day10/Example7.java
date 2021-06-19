package com.lovecoding.day10;

import java.io.Serializable;

/**
 * 单例模式的优化
 */
public class Example7 {

    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();
        SingleTon singleTon1 = SingleTon.getInstance();

        System.out.println(singleTon == singleTon1);
    }
}

/**
 * 懒汉式
 * 1、上锁
 * 2、使用volatile 限制程序从地址中读取对象
 * 3、私有构造器，判断非空抛出异常
 * 4、实现序列化接口，传输时，保证安全
 */
class SingleTon implements Serializable{
    private volatile static SingleTon singleTon = null;//告诉程序从地址中读取对象。不从缓存中读取

    private SingleTon(){
        if(null != singleTon){
            throw new NullPointerException("此类为单例模式，不允许实例化");
        }
    }

    public static SingleTon getInstance(){

        if(null == singleTon){//为了不重复上锁，可以做拦截
            synchronized (SingleTon.class){ //上锁
                if(null == singleTon){
                    singleTon = new SingleTon();
                }
            }
        }
        return singleTon;
    }

}
