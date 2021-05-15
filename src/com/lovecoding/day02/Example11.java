package com.lovecoding.day02;

/**
 * 给出一个百分制成绩，要求输出成绩等级‘A’、‘B’、‘C’、‘D’、‘E’
 * 。90分以上输出’A’
 * ，80～89分输出’B’，70～79分输出’C’
 * ，60～69分输出’D’，60分以下输出‘E’
 */
public class Example11 {

    public static void main(String[] args) {
        int score = 81;

        if(score >= 90){
            System.out.println("等级A");
        }else if(80<=score && score < 90){
            System.out.println("等级B");
        }else if(70<=score && score < 80){
            System.out.println("等级C");
        }else if(60<=score && score < 70){
            System.out.println("等级D");
        } else{
            System.out.println("等级E");
        }
    }
}
