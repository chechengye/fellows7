package com.lovecoding.day06;

/**
 * 自定义异常类
 */
public class Example6  {

    public static void main(String[] args) {

        checkUser("admin" , "123");
    }

    public static void checkUser(String username , String password) {
        if("admin".equals(username) && "123".equals(password)){
            System.out.println("欢迎登陆");
        }else{
            throw new MyException("用户名或密码错误");
        }
    }
}

class MyException extends RuntimeException{

    public MyException(){
        super();
    }

    public MyException(String s){
        super(s);
    }
}