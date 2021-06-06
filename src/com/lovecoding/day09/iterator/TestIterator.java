package com.lovecoding.day09.iterator;

public class TestIterator {

    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("tom");
        aggregate.add("lily");
        aggregate.add("lucy");
        System.out.println(aggregate.get(1));

        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
