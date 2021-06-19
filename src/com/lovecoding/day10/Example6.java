package com.lovecoding.day10;

import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * JavaBean讲解
 *
 * 条件
 * 1、是一个实体，针对于数据库表 / 针对于前端传递的数据表单
 * 2、私有属性
 * 3、对外提供get、set方法
 * 4、需要实现Serializable序列化接口，（更安全、高效、缓存应用必要条件）
 */
public class Example6 {

    public static void main(String[] args) {
        //前端、移动端 添加一只狗
        Dog dog = new Dog();
        //接收数据
        String name = "旺财";
        String color = "黄色";
        String month = "20";
       /* dog.setName(name);
        dog.setColor(color);
        dog.setMonth(Integer.valueOf(month));*/

        //想要引用第三方Jar包下的类的话，需要引用到工程中
        try {
            //BeanUtils setProperty 识别的bean一定是public修饰符修饰的类
            BeanUtils.setProperty(dog , "name" , name);
            BeanUtils.setProperty(dog , "color" , color);
            BeanUtils.setProperty(dog , "month" , month);
            System.out.println(dog);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println("------------------------------");
        String email = "262926400@qq.com";
        String sex = "男";
        Map<String , String > map = new HashMap<>();//使用服务端req默认获取到的
        map.put("email" , email);
        map.put("sex" , sex);
        map.put("uname" , "zhangsan");
        User user = new User();
        try {
            BeanUtils.populate(user , map);
            System.out.println(user);//封装后的JavaBean对象 。存入数据库....
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
