package com.lovecoding.day03;

import java.util.Random;
import java.util.Scanner;

/**
 * 1、猜数游戏：从键盘中任意输入一个数据，判断数列中是否包含此数
 *
 * Random : 伪随机数 （Java代码帮忙生成的随机数）
 */
public class Example5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要猜的数字：");
        int num = sc.nextInt();
        //int[] arr = {11,22,6,77,88,99};
        int[] arr = new int[6];
        Random r = new Random();//创建好了伪随机数对象
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = r.nextInt(50);//先不考虑重复的问题
        }

        for(int x : arr) System.out.print(x + " ");

       /* if(isExit(num , arr)){
            System.out.println("真聪明，猜对了！");
        }else {
            System.out.println("有点笨呐！！！");
        }*/
        //Java标志位 经常使用
        boolean flag = false;
        for(int x : arr){
            if(x == num){
                flag = true;
                break;
            }
        }
        if(flag) System.out.println("真聪明，猜对了！");
        else System.out.println("有点笨呐！！！");
    }

    /**
     * 判断一组数列中是否存在某个数
     * @param num
     * @param arr
     * @return
     */
    public static boolean isExit(int num , int[] arr){

        for (int x : arr){
            if(x == num){//找到了
                return true;
            }
        }
        return false;
    }
}
