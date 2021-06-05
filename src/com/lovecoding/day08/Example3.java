package com.lovecoding.day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Consumer<T>
 *
 * Function<T,R> 接口	表示接受一个参数并产生结果的函数。
 *
 * Supplier<T>接口	代表结果供应商。
 *
 * Predicate<T>接口，表示断言
 */
public class Example3 {

    public static void main(String[] args) {
        System.out.println(getResult("dhsghdsghd", (str)->str.toUpperCase()));

        System.out.println("-------------------------");
        List<Integer> list = getNum(10, () -> (int) (Math.random() * 100));

        list.forEach(System.out::println);

        System.out.println("------------------------");
        List<String> filterList = filter(Arrays.asList("tom", "lily", "jack", "selected", "array"), str -> str.contains("a"));
        filterList.forEach(System.out::println);
    }

    public static String getResult(String str , Function<String , String> fu){
        return fu.apply(str);
    }

    public static List<Integer> getNum(Integer num , Supplier<Integer> supplier){
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ;i <num ; i++){
            list.add(supplier.get());
        }
        return list;
    }

    public static List<String> filter(List<String> list , Predicate<String> pre){
        List<String> results = new ArrayList<>();
        for(String str : list){
            if(pre.test(str)){
                results.add(str);
            }
        }
        return results;
    }
}
