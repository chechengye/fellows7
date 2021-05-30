package com.lovecoding.day06;

import org.junit.Test;

import java.util.Arrays;

/**
 * 字符串应用与学习
 */
public class Example8 {

    public static void main(String[] args) {
        String s1 = "小白";
        String s2 = new String("小白");//创建了几个对象

        System.out.println(s1 == s2);

        //字符串拼接，在编译期可以确定的值，完成拼接之后存入常量池。但是运行期才可以确定的值，会再运行的时候才参与运行。
        String a1 = "1";//a1 : 变量只有在运行的时候才可以确定值
        String a2 = "a" + a1;
        String a3 = "a1";

        System.out.println(a2 == a3);

        System.out.println("-------------------------------");
        final String b1 = "1";
        String b2 = "b" + b1;
        String b3 = "b1";

        System.out.println(b2 == b3);

        System.out.println("-----------------------");
        final String c1 = method();
        String c2 = "c" + c1;
        String c3 = "c1";
        System.out.println(c2 == c3);


    }

    /**
     * 方法一定是在运行期才会压栈的
     * @return
     */
    public static String method(){
        return "1";
    }

    /**
     * 字符串的api测试
     */
    @Test
    public void testApi(){
        String str = "gdhsgd-hsgd-hs162726-372";

        //str.charAt();
        System.out.println(str.charAt(4));//索引位置从0开始
        System.out.println("------------toCharArray------------");
        char[] charArray = str.toCharArray();
        System.out.println(Arrays.toString(charArray));

        System.out.println("----------------public String(char[] value,int offset,int count)----------------");
        char[] chars = {'a' , 'b' , 'c'};
        String str1 = new String(chars , 1 , 1);
        System.out.println(str1);

        System.out.println("----public boolean startsWith(String prefix)------");

        String str2 = "http://wx.open.com/aaaxxcx";
        if(str2.startsWith("wx.open" , 7)){
            System.out.println("微信相关操作");
        }

        System.out.println("-----------public String replace(char oldChar,char newChar)----------");

        String str3 = str.replace('6','*');
        System.out.println(str3);
        String str4 = str.replace("72","*");
        System.out.println(str4);

        System.out.println("-------replaceAll(prefix ， String str)-------");
        System.out.println(str.replaceAll("-", ""));

        System.out.println("---------public String substring(int beginIndex)------");

        System.out.println(str2.substring(0, 19));

        System.out.println("-------------public String[] split(String regex)字符串拆分----------");
        String pics = "uploads/20210529.png , uploads/2020202.jpg";
        String[] strings = pics.split(",");
        System.out.println(Arrays.toString(strings));

        System.out.println("-----------public boolean contains(String s)--------");
        System.out.println(pics.contains(","));

        int index = str2.indexOf("aaa");
        if(index != -1){
            System.out.println(str2.substring(0, index));
        }

        System.out.println("----------------判空操作---------------");

        String str5 = "111";
        System.out.println(str5.isEmpty());
        if(null != str5 && !str5.isEmpty()){//str5.isEmpty()  "".equals(str);
            System.out.println("过滤无用的参数");
        }

        System.out.println("-------------public String toUpperCase()------------");
        String str6 = "dsdhs-jMADHSJDSDdsds-jkdjjsfd";
        System.out.println(str6.toUpperCase());
        System.out.println("------------trim()去前后空格---------------");
        String str7 = " djshjds dhsdjhs ";
        System.out.println(str7.trim());//登录，输入用户名/密码 zhangsan

    }
}
