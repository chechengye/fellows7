package com.lovecoding.day07;

import java.util.Comparator;

/**
 * <Pig>确定/限制传入进来的类型
 */
public class PigComparator implements Comparator<Pig> {
    @Override
    public int compare(Pig pig1, Pig pig2) {
        return pig1.getAge() - pig2.getAge();
    }
}
