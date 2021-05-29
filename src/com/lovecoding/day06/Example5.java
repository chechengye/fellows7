package com.lovecoding.day06;

/**
 * throws与throw
 *
 * throws: 应用与方法上面主动抛出的异常
 *
 * 语法规则：
 * try{}不能单独使用
 * try{}finally{}
 * try{}catch()...{}
 * ry{}catch()...{}finally{}
 */
public class Example5 {

    public static void main(String[] args){
        try {
            method();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NullPointerException e){
            System.out.println(e);//e : 异常信息栈
        }
        System.out.println("------------------");

        try{
            int i = 100;
        }finally {

        }
    }

    /**
     * ClassNotFoundException : 受检异常
     * @throws ClassNotFoundException
     */
    public static void method() throws ClassNotFoundException{
        System.out.println("method...");
        if(1 == 1){
            throw new NullPointerException("1 = 1 永真");
        }
        Class.forName("xxx.xxxx.xxx");
    }
}
