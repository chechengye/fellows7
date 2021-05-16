package com.lovecoding.day03;

/**
 * 求最大值、最小值
 */
public class Example8 {

    public static void main(String[] args) {
        int[] arr = {-1,11,2,7,22,33,55};
        int mix = arr[0];
        for(int x : arr){
            if(mix > x)
                mix = x;
        }
        System.out.println("最小值为: " + mix);
    }
}
