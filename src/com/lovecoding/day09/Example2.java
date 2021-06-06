package com.lovecoding.day09;

import java.util.Optional;

/**
 * Optional
 */
public class Example2 {

    public static void main(String[] args) {
        Optional<Object> empty = Optional.empty();//空的
        Optional<String> optionalS = Optional.ofNullable("zhangsan");//存在值的

        //System.out.println(empty.get());//java.util.NoSuchElementException

        //optionalS.ifPresent((val)-> System.out.println(val.toUpperCase()));

        System.out.println(optionalS.orElse("lisi"));

        Optional<String> newOpt = optionalS.map((val) -> val + "- map");
        System.out.println(newOpt.get());

    }
}
