package com.lovecoding.day07;

import java.io.IOException;

/**
 * System类
 */
public class Example7 {

    public static void main(String[] args) {

        System.out.println("普通打印");
        System.out.println("-------err------");
        System.err.println("这是一个错误打印..");//独立线程

        //swing ,JFrame 退出
        //System.exit(0);

        System.out.println("-------退出后执行------");

        System.out.println("Java 运行时环境版本" + System.getProperty("java.version"));
        System.out.println("Java 安装目录" + System.getProperty("java.home"));
        System.out.println("用户的账户名称" + System.getProperty("user.name"));

        //获取Java运行时相关的运行时对象
        Runtime rt = Runtime.getRuntime();
        System.out.println("处理器数量：" + rt.availableProcessors()+" 个");
        System.out.println("Jvm总内存数 ："+ rt.totalMemory()+" byte");
        System.out.println("Jvm空闲内存数： "+ rt.freeMemory()+" byte");
        System.out.println("Jvm可用最大内存数： "+ rt.maxMemory()+" byte");

        try {
            rt.exec("notepad");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
