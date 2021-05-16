package com.lovecoding.day03;

/**
 * 冒泡排序算法
 * 相同的元素不交换位置、是一种稳定的排序算法
 * 22 88 11 66 33 5
 *
 * (从右向左。往上冒泡的)
 * 第一轮中间过程
 * 22 88 11 66 5 33
 * 22 88 11 5 66 33
 * ..
 * 5 22 88 11 66 33
 * 第二轮
 * 5 22 88 11 33 66
 * 5 22 11 88 33 66
 * 5 11 22 88 33 66
 * 第三轮
 * 5 11 22 33 88 66
 * 第四轮
 * 5 11 22 33 66 88
 *
 * (从左向右。往下沉)
 * 第一轮
 *
 */
public class Example9 {

    public static void main(String[] args) {
        int[] arr = {22,88,11,66,33,5};
        for(int i = 0 ; i < arr.length - 1 ; i ++){
            for(int j = arr.length - 1 ; j > i ; j --){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            for (int x : arr)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}
