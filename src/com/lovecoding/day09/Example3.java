package com.lovecoding.day09;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Example3 {

    public static void main(String[] args) {
        //queue();
        //deQue();
        stack();
    }

    /**
     * 栈 ： 先进后出
     */
    public static void stack(){
        Stack<String> stack = new Stack<>();
        stack.push("zhangsan");
        stack.push("lisi");

        System.out.println(stack.pop());
    }

    /**
     * 队列： 先进先出
     */
    public static void queue(){
        Queue<String> queue = new LinkedList<>();
        queue.add("张飞");
        queue.add("刘备");
        queue.add("赵云");
        //System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.size());

    }

    public static void deQue(){
        Deque<String> deque = new LinkedList<>();
        deque.add("张飞");
        deque.add("刘备");
        deque.add("赵云");

        System.out.println(deque.getLast());

    }
}
