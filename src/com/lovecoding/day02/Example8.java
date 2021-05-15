package com.lovecoding.day02;

/**
 * IF - ELSE
 * if(表达式) 若为真执行 if{}作用域
 * 若为假执行 else{} 否则执行此作用域
 *
 * IF - ELSE IF (*)- ELSE
 *
 * 注意：
 * 多个条件判断语句块，分别都会被执行到
 * 但若是都写在一个条件判断语句块中，只有一个条件会被执行到。
 */
public class Example8 {

    public static void main(String[] args) {
        int m = 20 ;
        int n = 15;
        //(第一个条件判断语句块)
        if( ++m < 20 || --n < 15){
            System.out.println(m *= n);
        }else{
            System.out.println(m /= n);
        }
        //（第二个条件判断语句块）
        if(m++ == 20 & n++ == 15){
            System.out.println(m - n);
        }else if(m ++ > 20){
            System.out.println(m - n);
        }else{
            System.out.println(m + n);
        }


    }
}
