package com.lovecoding.day03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 双色球模拟综合案例
 */
public class Example12 {

    final static int BOUND = 16;
    public static void main(String[] args) {
        System.out.println("欢迎来到，双色球游戏~~");
        System.out.println("-----------奖池---------");
        String[] ballPool = getBallPool();//双色球奖池
        System.out.println(Arrays.toString(ballPool));
        String[] userRedBall = new String[6];//用户红球
        String userBlueBall = null;//用户篮球

        System.out.println("请选择出球的方式（1）机选 （2）手选");
        Scanner sc = new Scanner(System.in);
        int method = sc.nextInt();
        boolean flag = true;
        Random r = new Random();
        while (flag){
            switch (method){
                case 1://机选
                    //1、6个不重复的红球
                    System.out.println("--------机选的6个红球为-------");
                    userRedBall = getMcRedBall(getBallPool());
                    System.out.println(Arrays.toString(userRedBall));
                    System.out.println("--------机选的1个蓝球为-------");
                    userBlueBall = ballPool[r.nextInt(BOUND)];
                    System.out.println(userBlueBall);
                    flag = false;
                    break;
                case 2: // 手选
                    System.out.println("--------请输入手选的6个红球-------");
                    for(int i = 0 ; i < userRedBall.length ; i++)
                        userRedBall[i] = sc.next();
                    System.out.println("--------请输入手选的1个蓝球-------");
                    userBlueBall =  sc.next();
                    flag = false;
                    break;
                default:
                    System.out.println("请选择出球的方式（1）机选 （2）手选");
                    method = sc.nextInt();
                    break;
            }
        }
        System.out.println("-----------------本期中奖号码为--------------------");
        String[] sysRedBall = getMcRedBall(ballPool);
        String sysBlueBall = ballPool[r.nextInt(BOUND)];
        System.out.print("系统红球为： " + Arrays.toString(sysRedBall) + "  篮球为： " + sysBlueBall);

        //判断是否中奖
        System.out.println();
        System.out.println(isAward(sysRedBall , sysBlueBall , userRedBall , userBlueBall));
    }
    /**
     * 创建双色球池子
     */
    public static String[] getBallPool(){
        //01 - 33
        String[] ballPool = new String[33];//动态初始化
        for(int i = 1 ; i <= ballPool.length ; i ++){
            if(i < 10) ballPool[i-1] = "0" + i;
            else ballPool[i-1] = i + "";
        }
        return ballPool;
    }

    /**
     * 随机抽取6个不重复的红球
     * Random
     */
    public static String[] getMcRedBall(String[] ballPool){
        String[] redBall = new String[6];
        Random r = new Random();
        int count = 0;
        boolean[] isExit = new boolean[ballPool.length];
        while (true){
            int index = r.nextInt(ballPool.length);//bound : 0 ~ 33（不包含）
            if(isExit[index]) continue;
            isExit[index] = true;
            redBall[count ++ ] = ballPool[index];
            if(6 == count)
                break;
        }
        return redBall;
    }

    /**
     * 是否中奖、中了几等奖
     */
    public static String isAward(String[] sysRedBall ,String sysBlueBall , String[] userRedBall , String userBlueBall){

        int blueCount = 0;
        int redCount = 0;
        if(userBlueBall.equals(sysBlueBall)) blueCount ++;


        for(String x : userRedBall){
            for(String sysX : sysRedBall){
                if(x.equals(sysX)) redCount ++;
            }
        }

        if(blueCount == 1 && redCount < 3){
            return "恭喜你，获得六等奖";
        }else if((blueCount + redCount) == 4){
            return "恭喜你，获得五等奖";
        }else if((blueCount + redCount) == 5){
            return "恭喜你，获得四等奖";
        }else if(redCount  == 5 && blueCount == 1){
            return "恭喜你，获得三等奖";
        }else if(redCount  == 6 && blueCount == 0){
            return "恭喜你，获得二等奖";
        }else if(redCount  == 6 && blueCount == 1){
            return "恭喜你，获得一等奖";
        }else{
            return "太遗憾了，又造福社会！！";
        }
    }
}
