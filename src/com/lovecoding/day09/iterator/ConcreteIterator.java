package com.lovecoding.day09.iterator;

/**
 * 迭代集合 - 持有集合对象
 */
public class ConcreteIterator implements Iterator {

    private Aggregate aggregate;
    private int index;

    public ConcreteIterator(Aggregate aggregate){
        this.aggregate = aggregate;
    }
    @Override
    public boolean hasNext() {
        if(index >= aggregate.size()){
            return false;
        }
        return true;
    }

    /**
     * 光标指向下一个
     * @return
     */
    @Override
    public Object next() {
        return aggregate.get(index++);
    }
}
