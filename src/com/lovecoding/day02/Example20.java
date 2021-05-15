package com.lovecoding.day02;

/**
 * For循环的六种写法：
 1、标准写法
 2、表达式1省略，但在外部声明
 3、表达式2省略，死循环
 4、表达式3省略，但是要声明在循环内部
 5、表达式1,3省略，但是要声明在循环的外部和内部
 6、三个表达式都省略,死循环

 */
public class Example20 {
    public static void main(String[] args) {
        // 1、标准写法
        for(int i = 1 ; i < 5 ; i++){
            System.out.println(i);
        }
        //2、表达式1省略，但在外部声明
        int i = 1 ;
        for( ; i < 5 ; i++){
            System.out.println(i);
        }
        // 3、表达式2省略，死循环
        /*for(int j = 1 ;; j++){ //省略就是永真
            System.out.println(j);
        }*/
        //4、表达式3省略，但是要声明在循环内部
        for(int j = 1 ; j < 5 ; ){
            System.out.println(j++);
        }
        //5、表达式1,3省略，但是要声明在循环的外部和内部
        //6、三个表达式都省略,死循环
        int k = 1;
        for(;;){
            if(k++ == 3) break;//关键词，跳出循环体 。if条件语句若只有一行功能性代码块{}可以省略不写
            System.out.println("---------------");
        }
    }
}
