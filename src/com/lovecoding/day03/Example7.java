package com.lovecoding.day03;

/**
 * 多维数组示例：
 * 1、一起来参加屌丝程序员大赛吧，有3个班级各3名学员参赛，
 *    记录每个学员的成绩，并计算每个班的平均分。
 *    A 班  66  77  88
 *    B 班  44  67  80 90
 *    C 班   11  33
 */
public class Example7 {
    public static void main(String[] args) {
        int[][] classArr = {{66,77,88},{44,67,80,90},{11,33}};
        for(int i = 0 ; i < classArr.length ; i++){
            int sum = 0;
            for (int j = 0 ; j < classArr[i].length ; j ++){
                sum += classArr[i][j];
            }
            int avg = sum / classArr[i].length;
            System.out.println("第" + (i + 1) + "个班级的平均成绩为: " + avg);
        }
    }
}
