package com.lovecoding.day03;

import java.util.Arrays;

/**
 * Arrays工具类
 * 里面的方法大部分都是static关键字修饰的。 可以直接通过类名.方法名调用
 */
public class Example11 {

    public static void main(String[] args) {
        int[] arr = {3, 5, 11, 22, 66};
        //binarySearch : 查询的是数组的索引位置 （必须是排好的数组）
        System.out.println(Arrays.binarySearch(arr, 22));
        //sort : 排序
        int[] arr1 = {22,88,11,66,33,5};

        int[] arr2 = {3, 5, 11, 22, 22};
        Arrays.sort(arr1);
        /*for(int x : arr1)
            System.out.print(x + " ");*/
        System.out.println(Arrays.toString(arr1));
        System.out.println("----------------------------");
        int[] copyArr = Arrays.copyOf(arr , 3);
        System.out.println(Arrays.toString(copyArr));
        System.out.println("---------------------------");
        int[] copyArr1 = new int[arr.length];
        System.arraycopy(arr , 2  , copyArr1 , 0 , 2);
        System.out.println(Arrays.toString(copyArr1));

        System.out.println("----------------------");
        System.out.println(Arrays.equals(arr, arr2));

        System.out.println("-----------填充----------");
        //Arrays.fill(arr2 , 88);
        //Java中边界性索引 通常是不包含的
        Arrays.fill(arr2 , 0 , 2 , 33);

        System.out.println(Arrays.toString(arr2));
    }
}
