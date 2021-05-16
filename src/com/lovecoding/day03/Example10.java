package com.lovecoding.day03;

/**
 * 选择排序算法
 * 22 88 11 66 33 5
 *
 * minIndex = 0;
 * 第一轮结果
 * minIndex = 5  5 88 11 66 33 22
 * minIndex = 1  5 11 88 66 33 22
 */
public class Example10 {

    public static void main(String[] args) {
        int[] arr = {22,88,11,66,33,5};
        for(int i = 0 ; i < arr.length ; i ++){
            int minIndex = i;
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[minIndex] > arr[j])
                    minIndex = j;
            }
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

            for (int x : arr)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}
