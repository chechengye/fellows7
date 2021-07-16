package com.lovecoding.day11;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则相关讲解
 */
public class Example2 {

    public static void main(String[] args) {
        String str = "5201aa314";//判断这个串是否全是数字组成

        char[] chars = str.toCharArray();

        boolean flag = false;
        for(char c : chars){
            if(c < '0' || c > '9'){
                flag = true;
                break;
            }
        }
        if(flag) System.out.println("非全是数字！");
        else System.out.println("是数字");

    }

    /**
     * 典型正则应用
     */
    @Test
    public void testFn(){
        Pattern p = Pattern.compile("a*b");
        Matcher m = p.matcher("aaaaab");
        boolean b = m.matches();
        System.out.println(b);
    }

    @Test
    public void testFn1(){
        Pattern p = Pattern.compile("\\d+");//转义字符
        Matcher m = p.matcher("520131ff4");
        boolean b = m.matches();
        System.out.println(b);


        System.out.println("使用String对正则的支持进行优化");
        String str = "5201314";
        System.out.println("5201314".matches("^\\d*$") ? "全是数字" : "非全数字");
    }

    @Test
    public void testFn2(){
        //1、验证电话号码（如：01076-38389438 ）
        String str = "011-38389438";
        System.out.println(str.matches("^[0-9]{3,4}[-]\\d{8}$"));
        //2、验证手机号码 (第一位 1  第二位不能是 0 1 2 4  手机号一定为11位)

        //3、验证用户名，只能是字母开头的，数字、字母或下划线的组合 （且位数在8 ~16位）

        //4、验证邮箱(如:zhangsan_wc@163.com) （如果是163、126邮箱的话首字母一定是字母 如果是qq邮箱的话、前面全是数字）

        //5、验证年龄（100以内）

        
        //6、验证金额（可以有小数位）

    }
}
